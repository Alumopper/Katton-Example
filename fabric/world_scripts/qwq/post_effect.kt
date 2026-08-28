package qwq

import top.katton.api.ClientPhase
import top.katton.api.ClientScriptEntrypoint
import top.katton.api.clearClientPostEffect
import top.katton.api.clientTell
import top.katton.api.registerClientBlurPostEffect
import top.katton.api.registerClientChromaticAberrationPostEffect
import top.katton.api.registerClientPostEffectFromResourcePack
import top.katton.api.registerClientTintPostEffect
import top.katton.api.registerClientVignettePostEffect
import top.katton.api.registerSimpleClientPostEffect
import top.katton.api.runOnClient
import top.katton.api.setClientPostEffect

private const val VANILLA_INVERT = "minecraft:invert"
private const val PRESET_DAMAGE = "qwq:post/damage_vignette"
private const val PRESET_DREAM = "qwq:post/dream_tint"
private const val PRESET_STUN = "qwq:post/stun_aberration"
private const val PRESET_BLUR = "qwq:post/soft_blur"
private const val CUSTOM_SCAN = "qwq:post/custom_scan"

@ClientScriptEntrypoint(ClientPhase.REGISTRY_SETUP)
fun postEffectDemoMain() {
    runOnClient {
        // Vanilla/resource-pack backed effect. Reads:
        // assets/minecraft/post_effect/invert.json
        registerClientPostEffectFromResourcePack(VANILLA_INVERT)

        // Preset helpers. These generate runtime post effects with small parameters.
        registerClientVignettePostEffect(
            id = PRESET_DAMAGE,
            amount = 0.85f,
            radius = 0.50f,
            softness = 0.35f,
            color = 0x770000
        )
        registerClientTintPostEffect(
            id = PRESET_DREAM,
            color = 0x66CCFF,
            amount = 0.35f
        )
        registerClientChromaticAberrationPostEffect(
            id = PRESET_STUN,
            offsetPixels = 2.5f,
            amount = 0.75f
        )
        registerClientBlurPostEffect(
            id = PRESET_BLUR,
            radius = 3.0f,
            passes = 1
        )

        // Simple custom shader. This only provides a fragment shader; Katton
        // builds the fullscreen post-effect chain for us.
        registerSimpleClientPostEffect(
            id = CUSTOM_SCAN,
            fragmentShaderSource = customScanShader()
        )

        clearClientPostEffect()

        clientTell("[Katton] Post effect demo registered.")
        clientTell("Try: setClientPostEffect(\"$PRESET_DAMAGE\")")
        clientTell("Try: setClientPostEffect(\"$PRESET_DREAM\")")
        clientTell("Try: setClientPostEffect(\"$PRESET_STUN\")")
        clientTell("Try: setClientPostEffect(\"$PRESET_BLUR\")")
        clientTell("Try: setClientPostEffect(\"$VANILLA_INVERT\")")
        clientTell("Clear: clearClientPostEffect()")
    }
}

private fun customScanShader(): String = """
    #version 330

    uniform sampler2D InSampler;

    layout(std140) uniform SamplerInfo {
        vec2 OutSize;
        vec2 InSize;
    };

    in vec2 texCoord;

    out vec4 fragColor;

    void main() {
        vec4 color = texture(InSampler, texCoord);

        float gray = dot(color.rgb, vec3(0.2126, 0.7152, 0.0722));
        vec3 warm = mix(color.rgb, vec3(gray * 1.25, gray * 0.82, gray * 0.42), 0.42);

        float scanline = sin(texCoord.y * InSize.y * 3.1415926) * 0.5 + 0.5;
        float scanMask = mix(0.74, 1.0, scanline);

        vec2 center = texCoord - vec2(0.5);
        float vignette = smoothstep(0.84, 0.25, length(center));

        vec3 result = warm * scanMask * mix(0.55, 1.0, vignette);
        fragColor = vec4(result, color.a);
    }
""".trimIndent()
