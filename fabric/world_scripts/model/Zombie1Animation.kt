package model

import net.minecraft.client.animation.AnimationChannel
import net.minecraft.client.animation.AnimationDefinition
import net.minecraft.client.animation.Keyframe
import net.minecraft.client.animation.KeyframeAnimations

// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 4.12.6
 * Exported for Minecraft version 1.19 or later with Mojang mappings
 * @author Author
 */
object Zombie1Animation {
    val idle: AnimationDefinition = AnimationDefinition.Builder.withLength(4.0f).looping()
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.85f,
                    KeyframeAnimations.degreeVec(5.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.4f,
                    KeyframeAnimations.degreeVec(1.03f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.85f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(3.85f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 7.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 10.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.35f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 3.85f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.85f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 7.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(3.85f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -10.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -12.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.35f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -6.35f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.85f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -10.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(3.85f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 7.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.35f,
                    KeyframeAnimations.degreeVec(1.5116f, 0.0f, 7.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.85f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 7.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(3.85f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.35f,
                    KeyframeAnimations.degreeVec(1.5116f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.85f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(3.85f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.5f,
                    KeyframeAnimations.degreeVec(-2.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.85f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(3.85f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(0.0f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "weapon", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(0.0f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .build()

    val idle1toidle2: AnimationDefinition = AnimationDefinition.Builder.withLength(3.5f)
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.95f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.55f,
                    KeyframeAnimations.degreeVec(5.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.1f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(1.95f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.3f,
                    KeyframeAnimations.degreeVec(5.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.7f,
                    KeyframeAnimations.degreeVec(5.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.2f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 7.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.65f,
                    KeyframeAnimations.degreeVec(-52.5f, 0.0f, 7.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.05f,
                    KeyframeAnimations.degreeVec(-52.5f, 0.0f, 7.5f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    2.6f,
                    KeyframeAnimations.degreeVec(-80.9919f, -49.3765f, 19.6124f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.85f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    2.05f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(2.85f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -10.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.05f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -12.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.55f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 7.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 7.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(2.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.75f,
                    KeyframeAnimations.degreeVec(-25.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.1f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(2.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.75f,
                    KeyframeAnimations.degreeVec(54.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.1f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(2.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    2.75f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, -1.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(3.1f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.85f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.4f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(2.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(2.85f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.05f,
                    KeyframeAnimations.degreeVec(0.0f, -22.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.05f,
                    KeyframeAnimations.degreeVec(0.0f, -22.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.6f,
                    KeyframeAnimations.degreeVec(-53.2693f, -46.8344f, 26.7749f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.85f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.9f,
                    KeyframeAnimations.degreeVec(360.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(1.4f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.95f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(
                    2.3f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.6f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.9f, KeyframeAnimations.posVec(0.0f, 0.0f, 6.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.4f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.95f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(
                    2.35f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.6f,
                    KeyframeAnimations.posVec(-2.0f, -5.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(0.0f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.55f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.9f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.4f, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "leftarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(3.05f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(
                    3.45f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.LINEAR
                )
            )
        )
        .addAnimation(
            "leftarm2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(3.05f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "item_display1", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(0.0f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .build()

    val walkforward: AnimationDefinition = AnimationDefinition.Builder.withLength(3.05f).looping()
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.2f, KeyframeAnimations.degreeVec(5.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(
                    0.85f,
                    KeyframeAnimations.degreeVec(10.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(1.2f, KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(2.3f, KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(2.95f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.85f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.15f, KeyframeAnimations.posVec(0.0f, -2.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.55f, KeyframeAnimations.posVec(0.0f, -1.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(2.0f, KeyframeAnimations.posVec(0.0f, -1.11f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(2.25f, KeyframeAnimations.posVec(0.0f, -1.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(2.95f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.85f,
                    KeyframeAnimations.degreeVec(20.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.2f,
                    KeyframeAnimations.degreeVec(20.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.degreeVec(28.11f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.25f,
                    KeyframeAnimations.degreeVec(19.16f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.65f,
                    KeyframeAnimations.degreeVec(29.22f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.95f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.7f,
                    KeyframeAnimations.degreeVec(13.6095f, 1.4692f, 35.3193f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.15f,
                    KeyframeAnimations.degreeVec(12.5652f, 5.4206f, 18.3991f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.9f,
                    KeyframeAnimations.degreeVec(13.426f, 2.3884f, 31.4562f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.95f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(2.95f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.7f,
                    KeyframeAnimations.degreeVec(-10.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.15f,
                    KeyframeAnimations.degreeVec(-4.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.35f,
                    KeyframeAnimations.degreeVec(-30.25f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.95f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.95f,
                    KeyframeAnimations.degreeVec(-12.9975f, -1.696f, -19.9807f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.25f,
                    KeyframeAnimations.degreeVec(-13.1056f, -0.0087f, -12.7114f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.6f,
                    KeyframeAnimations.degreeVec(-13.0586f, -1.1217f, -17.498f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.75f,
                    KeyframeAnimations.degreeVec(-12.9989f, -1.6853f, -19.9343f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.25f,
                    KeyframeAnimations.degreeVec(-13.0943f, -0.5559f, -15.0626f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.55f,
                    KeyframeAnimations.degreeVec(-13.1059f, 0.0108f, -12.6276f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.95f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    2.95f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.LINEAR
                )
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.55f,
                    KeyframeAnimations.degreeVec(-12.4539f, -1.0809f, -4.8821f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.15f,
                    KeyframeAnimations.degreeVec(-14.178f, 1.2276f, 4.8473f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(-21.645f, 1.8483f, 4.6466f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.45f,
                    KeyframeAnimations.degreeVec(-11.75f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.95f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.4f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.85f,
                    KeyframeAnimations.degreeVec(-5.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.15f,
                    KeyframeAnimations.degreeVec(20.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(-50.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.95f,
                    KeyframeAnimations.degreeVec(-85.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.3f,
                    KeyframeAnimations.degreeVec(-52.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.95f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.4f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.85f,
                    KeyframeAnimations.degreeVec(17.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.15f,
                    KeyframeAnimations.degreeVec(17.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(21.25f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.95f,
                    KeyframeAnimations.degreeVec(85.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.3f,
                    KeyframeAnimations.degreeVec(27.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.95f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.4f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    1.95f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, -1.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(2.95f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.15f,
                    KeyframeAnimations.degreeVec(-28.9028f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.3f,
                    KeyframeAnimations.degreeVec(-46.4028f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.65f,
                    KeyframeAnimations.degreeVec(-61.4028f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.9f,
                    KeyframeAnimations.degreeVec(-78.9028f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.15f,
                    KeyframeAnimations.degreeVec(-38.9028f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.35f,
                    KeyframeAnimations.degreeVec(-38.9028f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.75f,
                    KeyframeAnimations.degreeVec(8.5972f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.95f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.15f,
                    KeyframeAnimations.degreeVec(28.8134f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.65f,
                    KeyframeAnimations.degreeVec(71.3134f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.9f,
                    KeyframeAnimations.degreeVec(48.8134f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.15f,
                    KeyframeAnimations.degreeVec(28.8134f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.35f,
                    KeyframeAnimations.degreeVec(28.8134f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.95f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, -2.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.45f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(2.95f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    2.95f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.LINEAR
                )
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(-2.0f, -5.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(2.95f, KeyframeAnimations.posVec(-2.0f, -5.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "weapon", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(0.0f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .build()

    val walkleft: AnimationDefinition = AnimationDefinition.Builder.withLength(3.25f).looping()
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, -17.5f, 0.0f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    3.1f,
                    KeyframeAnimations.degreeVec(0.0f, -10.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.25f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.55f,
                    KeyframeAnimations.degreeVec(12.7936f, 12.1991f, 2.7471f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.6f,
                    KeyframeAnimations.degreeVec(12.7936f, 12.1991f, 2.7471f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.25f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(15.0219f, -7.0226f, 17.7496f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(13.9723f, -8.0467f, 26.1816f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.95f,
                    KeyframeAnimations.degreeVec(13.971f, -1.8522f, 21.712f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.7f,
                    KeyframeAnimations.degreeVec(13.6392f, -0.7752f, 36.7049f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.25f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(3.25f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.8f,
                    KeyframeAnimations.degreeVec(0.74f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.3f,
                    KeyframeAnimations.degreeVec(-6.1f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.9f,
                    KeyframeAnimations.degreeVec(0.06f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.25f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(-13.0577f, 1.1321f, -7.8046f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.25f,
                    KeyframeAnimations.degreeVec(-13.0938f, 0.3693f, -11.0869f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.8f,
                    KeyframeAnimations.degreeVec(-13.0788f, 0.7798f, -9.3218f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.5f,
                    KeyframeAnimations.degreeVec(-13.0975f, -0.1524f, -13.3288f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.25f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    3.25f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.LINEAR
                )
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(-12.9411f, 0.8078f, -0.1425f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.05f,
                    KeyframeAnimations.degreeVec(-10.0206f, 4.936f, -0.8705f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.8f,
                    KeyframeAnimations.degreeVec(-4.4111f, 3.7419f, -0.6599f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.4f,
                    KeyframeAnimations.degreeVec(-9.821f, 2.2969f, -0.4051f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.25f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.15f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.4f,
                    KeyframeAnimations.degreeVec(-20.4586f, -17.192f, 1.7881f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.6f,
                    KeyframeAnimations.degreeVec(-58.7229f, -33.8886f, 26.1877f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.9f,
                    KeyframeAnimations.degreeVec(-60.291f, -41.735f, 21.4821f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.1f,
                    KeyframeAnimations.degreeVec(-79.3028f, -43.9971f, 20.0297f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.25f,
                    KeyframeAnimations.degreeVec(-79.3028f, -43.9971f, 20.0297f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.45f,
                    KeyframeAnimations.degreeVec(-62.3685f, -48.645f, 17.3576f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(-34.8685f, -48.645f, 17.3576f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.25f,
                    KeyframeAnimations.degreeVec(-34.8685f, -48.645f, 17.3576f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.7f,
                    KeyframeAnimations.degreeVec(-27.4155f, -49.7554f, 14.799f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.95f,
                    KeyframeAnimations.degreeVec(-21.3758f, -19.4057f, 7.9558f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.25f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.45f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.7f,
                    KeyframeAnimations.degreeVec(52.362f, -19.7038f, -27.2027f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.25f,
                    KeyframeAnimations.degreeVec(85.1435f, 5.2042f, -29.3807f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.degreeVec(31.1532f, 4.2846f, -17.595f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.05f,
                    KeyframeAnimations.degreeVec(18.9447f, 1.2926f, -8.7831f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.0f,
                    KeyframeAnimations.degreeVec(18.9447f, 1.2926f, -8.7831f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.25f,
                    KeyframeAnimations.degreeVec(6.526f, 4.1987f, 2.0147f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.45f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.posVec(0.0f, -0.25f, -1.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.4f,
                    KeyframeAnimations.posVec(-0.5f, -1.0f, -2.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.posVec(-0.28f, -0.3f, -1.78f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(1.7f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.45f,
                    KeyframeAnimations.degreeVec(1.8119f, -0.2385f, 2.4962f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.9f,
                    KeyframeAnimations.degreeVec(1.8019f, -0.4725f, 9.9023f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.8f,
                    KeyframeAnimations.degreeVec(1.8019f, -0.4725f, 9.9023f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.15f,
                    KeyframeAnimations.degreeVec(7.0205f, -40.7151f, -18.517f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.4f,
                    KeyframeAnimations.degreeVec(-15.4943f, -50.4118f, -15.0082f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.55f,
                    KeyframeAnimations.degreeVec(-47.9943f, -50.4118f, -15.0082f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.8f,
                    KeyframeAnimations.degreeVec(-47.9943f, -50.4118f, -15.0082f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.0f,
                    KeyframeAnimations.degreeVec(-12.4835f, -42.8743f, -15.0845f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.15f,
                    KeyframeAnimations.degreeVec(-0.3752f, -32.9123f, -15.1852f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.25f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.55f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.05f,
                    KeyframeAnimations.degreeVec(22.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.55f,
                    KeyframeAnimations.degreeVec(57.3265f, -2.8631f, 6.9349f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.8f,
                    KeyframeAnimations.degreeVec(76.8443f, -13.5957f, -3.1548f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.15f,
                    KeyframeAnimations.degreeVec(19.936f, 6.5436f, 10.3335f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.25f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    2.35f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.55f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, -2.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(3.25f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    3.25f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.LINEAR
                )
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(-2.0f, -5.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(3.25f, KeyframeAnimations.posVec(-2.0f, -5.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "weapon", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(0.0f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .build()

    val idle1toidle2fast: AnimationDefinition = AnimationDefinition.Builder.withLength(2.2f)
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.3f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.9f,
                    KeyframeAnimations.degreeVec(5.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.1f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(1.3f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 7.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.35f,
                    KeyframeAnimations.degreeVec(-52.5f, 0.0f, 7.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.4f,
                    KeyframeAnimations.degreeVec(-52.5f, 0.0f, 7.5f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    1.75f,
                    KeyframeAnimations.degreeVec(-80.9919f, -49.3765f, 19.6124f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.05f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(1.4f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(2.05f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.65f,
                    KeyframeAnimations.degreeVec(0.0f, -22.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.4f,
                    KeyframeAnimations.degreeVec(0.0f, -22.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.75f,
                    KeyframeAnimations.degreeVec(-53.2693f, -46.8344f, 26.7749f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.05f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -10.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.8f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -12.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.15f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.4f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(
                    2.15f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.LINEAR
                )
            )
        )
        .addAnimation(
            "leftarm2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.4f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(5.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.degreeVec(5.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.05f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 7.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.35f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 7.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(1.35f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.8f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.35f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.05f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.8f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(1.35f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.3f,
                    KeyframeAnimations.degreeVec(-37.0707f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.degreeVec(-25.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.15f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(1.35f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(32.5f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(80.2426f, -2.2214f, -0.7353f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.15f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, -1.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(2.15f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.6f,
                    KeyframeAnimations.degreeVec(360.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(0.65f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(
                    1.65f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.15f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.6f, KeyframeAnimations.posVec(0.0f, 0.0f, 6.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.65f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.3f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.7f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    2.15f,
                    KeyframeAnimations.posVec(-2.0f, -5.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(0.0f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.25f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.6f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.65f, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "item_display1", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(0.0f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .build()

    val attack1: AnimationDefinition = AnimationDefinition.Builder.withLength(7.95f)
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.8f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.05f,
                    KeyframeAnimations.degreeVec(15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.0f,
                    KeyframeAnimations.degreeVec(15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.75f,
                    KeyframeAnimations.degreeVec(15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.05f,
                    KeyframeAnimations.degreeVec(22.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.5f,
                    KeyframeAnimations.degreeVec(22.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.95f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.8f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    1.05f,
                    KeyframeAnimations.posVec(0.0f, -4.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.posVec(0.0f, -4.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(2.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    3.0f,
                    KeyframeAnimations.posVec(0.0f, -4.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.15f,
                    KeyframeAnimations.posVec(0.0f, -1.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.15f,
                    KeyframeAnimations.posVec(0.0f, -2.07f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.45f,
                    KeyframeAnimations.posVec(0.0f, -2.83f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(7.95f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.3f,
                    KeyframeAnimations.degreeVec(13.0862f, -17.0723f, -3.904f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(6.9837f, -31.7302f, -7.3503f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.05f,
                    KeyframeAnimations.degreeVec(33.948f, 22.9478f, -1.1411f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(33.948f, 22.9478f, -1.1411f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.5f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.0f,
                    KeyframeAnimations.degreeVec(33.948f, 22.9478f, -1.1411f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.7f,
                    KeyframeAnimations.degreeVec(-3.2952f, -7.0012f, 0.6473f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.15f,
                    KeyframeAnimations.degreeVec(-3.2952f, -7.0012f, 0.6473f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.75f,
                    KeyframeAnimations.degreeVec(-3.2952f, -7.0012f, 0.6473f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.05f,
                    KeyframeAnimations.degreeVec(19.2048f, -7.0012f, 0.6473f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.5f,
                    KeyframeAnimations.degreeVec(19.2048f, -7.0012f, 0.6473f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.95f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.3f,
                    KeyframeAnimations.degreeVec(-126.9301f, -6.2131f, 68.3033f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.95f,
                    KeyframeAnimations.degreeVec(-126.9301f, -6.2131f, 68.3033f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    1.05f,
                    KeyframeAnimations.degreeVec(50.5699f, -6.2131f, 68.3033f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(50.5699f, -6.2131f, 68.3033f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.5f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.0f,
                    KeyframeAnimations.degreeVec(50.5699f, -6.2131f, 68.3033f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.7f,
                    KeyframeAnimations.degreeVec(-74.0345f, 5.0838f, 29.8669f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.15f,
                    KeyframeAnimations.degreeVec(-197.6152f, -1.3876f, -24.7893f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.75f,
                    KeyframeAnimations.degreeVec(-197.6152f, -1.3876f, -24.7893f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    4.95f,
                    KeyframeAnimations.degreeVec(-15.9651f, -18.4462f, -61.6885f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.55f,
                    KeyframeAnimations.degreeVec(4.0349f, -18.4462f, -61.6885f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.5f,
                    KeyframeAnimations.degreeVec(4.0349f, -18.4462f, -61.6885f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.1f,
                    KeyframeAnimations.degreeVec(-36.6793f, -1.2028f, -25.341f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.95f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(2.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    4.15f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.75f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(7.95f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.3f,
                    KeyframeAnimations.degreeVec(-17.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.95f,
                    KeyframeAnimations.degreeVec(-17.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(-17.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.0f,
                    KeyframeAnimations.degreeVec(-17.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.7f,
                    KeyframeAnimations.degreeVec(-17.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.15f,
                    KeyframeAnimations.degreeVec(-17.6417f, -7.151f, 2.2671f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.75f,
                    KeyframeAnimations.degreeVec(-17.6417f, -7.151f, 2.2671f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.1f,
                    KeyframeAnimations.degreeVec(-21.3795f, -1.5726f, 0.4985f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.95f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.3f,
                    KeyframeAnimations.degreeVec(14.7928f, -5.0882f, -3.2653f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.95f,
                    KeyframeAnimations.degreeVec(14.7928f, -5.0882f, -3.2653f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.05f,
                    KeyframeAnimations.degreeVec(35.1112f, 0.6505f, -11.4643f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(35.1112f, 0.6505f, -11.4643f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.5f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.0f,
                    KeyframeAnimations.degreeVec(35.1112f, 0.6505f, -11.4643f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.7f,
                    KeyframeAnimations.degreeVec(-2.3888f, 0.6505f, -11.4643f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.9f,
                    KeyframeAnimations.degreeVec(-2.3888f, 0.6505f, -11.4643f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.1f,
                    KeyframeAnimations.degreeVec(42.1245f, 4.4534f, -45.5106f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.5f,
                    KeyframeAnimations.degreeVec(42.1245f, 4.4534f, -45.5106f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.95f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.3f,
                    KeyframeAnimations.degreeVec(-77.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.95f,
                    KeyframeAnimations.degreeVec(-77.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.05f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.5f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.7f,
                    KeyframeAnimations.degreeVec(-27.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.9f,
                    KeyframeAnimations.degreeVec(-27.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.1f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.95f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(-16.4703f, -24.0929f, 6.8817f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.05f,
                    KeyframeAnimations.degreeVec(-37.5273f, -12.8644f, 3.6347f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.35f,
                    KeyframeAnimations.degreeVec(-41.7936f, -21.946f, 12.4297f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(-41.7936f, -21.946f, 12.4297f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.5f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.0f,
                    KeyframeAnimations.degreeVec(-41.7936f, -21.946f, 12.4297f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.7f,
                    KeyframeAnimations.degreeVec(-2.4239f, 4.9819f, -0.8581f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.8f,
                    KeyframeAnimations.degreeVec(-4.45f, 1.5626f, -1.498f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    5.05f,
                    KeyframeAnimations.degreeVec(37.4744f, -5.9552f, -5.7283f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.65f,
                    KeyframeAnimations.degreeVec(37.4744f, -5.9552f, -5.7283f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.5f,
                    KeyframeAnimations.degreeVec(-2.5f, -15.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.95f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.05f,
                    KeyframeAnimations.degreeVec(22.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(22.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.0f,
                    KeyframeAnimations.degreeVec(22.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.1f,
                    KeyframeAnimations.degreeVec(-55.96f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.6f,
                    KeyframeAnimations.degreeVec(-129.08f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.05f,
                    KeyframeAnimations.degreeVec(-72.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.5f,
                    KeyframeAnimations.degreeVec(-72.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.95f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.05f,
                    KeyframeAnimations.degreeVec(22.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(22.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.5f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.0f,
                    KeyframeAnimations.degreeVec(22.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.3f,
                    KeyframeAnimations.degreeVec(47.68f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.55f,
                    KeyframeAnimations.degreeVec(58.96f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.6f,
                    KeyframeAnimations.degreeVec(99.14f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.85f,
                    KeyframeAnimations.degreeVec(68.69f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.05f,
                    KeyframeAnimations.degreeVec(46.78f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.5f,
                    KeyframeAnimations.degreeVec(46.78f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.95f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(2.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.posVec(0.0f, -1.96f, -2.06f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.6f,
                    KeyframeAnimations.posVec(0.0f, -2.75f, -1.25f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.85f,
                    KeyframeAnimations.posVec(0.0f, -2.0f, -2.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.05f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(6.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(7.95f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.3f,
                    KeyframeAnimations.degreeVec(-12.5f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.7f,
                    KeyframeAnimations.degreeVec(-51.5563f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.05f,
                    KeyframeAnimations.degreeVec(-87.7399f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(-87.7399f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.5f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.0f,
                    KeyframeAnimations.degreeVec(-87.7399f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.7f,
                    KeyframeAnimations.degreeVec(-37.7399f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.0f,
                    KeyframeAnimations.degreeVec(-23.7955f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.8f,
                    KeyframeAnimations.degreeVec(-37.7399f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.05f,
                    KeyframeAnimations.degreeVec(4.3084f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.5f,
                    KeyframeAnimations.degreeVec(4.3084f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.95f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.3f,
                    KeyframeAnimations.degreeVec(7.1832f, -2.9419f, 4.4021f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(47.2296f, -2.9752f, 4.6627f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.05f,
                    KeyframeAnimations.degreeVec(72.1832f, -2.9419f, 4.4021f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(72.1832f, -2.9419f, 4.4021f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.5f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.0f,
                    KeyframeAnimations.degreeVec(54.6832f, -2.9419f, 4.4021f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.7f,
                    KeyframeAnimations.degreeVec(7.1832f, -2.9419f, 4.4021f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.0f,
                    KeyframeAnimations.degreeVec(13.2162f, -2.9419f, 4.4021f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.05f,
                    KeyframeAnimations.degreeVec(27.1832f, -2.9419f, 4.4021f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.5f,
                    KeyframeAnimations.degreeVec(27.1832f, -2.9419f, 4.4021f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.95f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, -1.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.posVec(0.0f, -1.0f, -1.62f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(2.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    3.0f,
                    KeyframeAnimations.posVec(0.0f, -1.0f, -1.62f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.7f,
                    KeyframeAnimations.posVec(0.0f, 0.34f, -0.42f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.15f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(7.95f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    2.5f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.LINEAR
                )
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(-2.0f, -5.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(2.5f, KeyframeAnimations.posVec(-2.0f, -5.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "weapon", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(0.0f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .build()

    val attack2: AnimationDefinition = AnimationDefinition.Builder.withLength(7.0f)
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.degreeVec(27.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.0f,
                    KeyframeAnimations.degreeVec(27.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.55f,
                    KeyframeAnimations.degreeVec(28.27f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.2f,
                    KeyframeAnimations.degreeVec(28.27f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.posVec(0.0f, -2.48f, -0.4f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.85f,
                    KeyframeAnimations.posVec(0.0f, -3.0f, -0.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.85f,
                    KeyframeAnimations.posVec(0.0f, -3.0f, -0.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.0f,
                    KeyframeAnimations.posVec(0.0f, -2.0f, -0.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.2f,
                    KeyframeAnimations.posVec(0.0f, -5.0f, -0.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.55f,
                    KeyframeAnimations.posVec(0.0f, -6.25f, -0.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.2f,
                    KeyframeAnimations.posVec(0.0f, -4.0f, -0.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(7.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.degreeVec(42.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(4.0f, KeyframeAnimations.degreeVec(42.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(
                    4.2f,
                    KeyframeAnimations.degreeVec(20.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.0f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.degreeVec(21.4983f, 50.704f, 46.7775f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.0f,
                    KeyframeAnimations.degreeVec(21.4983f, 50.704f, 46.7775f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    4.2f,
                    KeyframeAnimations.degreeVec(-128.202f, 19.0746f, 111.8918f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.5f,
                    KeyframeAnimations.degreeVec(-128.202f, 19.0746f, 111.8918f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.8f,
                    KeyframeAnimations.degreeVec(-122.0655f, -6.6534f, 104.0311f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.0f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(7.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.2f,
                    KeyframeAnimations.degreeVec(-40.53f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.5f,
                    KeyframeAnimations.degreeVec(-40.53f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.degreeVec(-65.4467f, 33.2467f, -54.6769f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.0f,
                    KeyframeAnimations.degreeVec(-65.4467f, 33.2467f, -54.6769f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    4.2f,
                    KeyframeAnimations.degreeVec(42.1308f, 15.5287f, -29.1613f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.75f,
                    KeyframeAnimations.degreeVec(41.7856f, 3.3364f, -16.4f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.5f,
                    KeyframeAnimations.degreeVec(44.3942f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.0f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.degreeVec(-64.2439f, 8.3109f, -23.6624f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.0f,
                    KeyframeAnimations.degreeVec(-64.2439f, 8.3109f, -23.6624f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    4.2f,
                    KeyframeAnimations.degreeVec(-40.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.75f,
                    KeyframeAnimations.degreeVec(-40.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.95f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.degreeVec(32.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(4.0f, KeyframeAnimations.degreeVec(32.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(
                    4.2f,
                    KeyframeAnimations.degreeVec(-25.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.75f,
                    KeyframeAnimations.degreeVec(-25.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.95f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.degreeVec(-77.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.0f,
                    KeyframeAnimations.degreeVec(-77.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    4.2f,
                    KeyframeAnimations.degreeVec(27.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.75f,
                    KeyframeAnimations.degreeVec(27.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.95f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.degreeVec(52.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(4.0f, KeyframeAnimations.degreeVec(52.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(
                    4.2f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.75f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.95f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(6.95f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.degreeVec(-27.5f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.0f,
                    KeyframeAnimations.degreeVec(-27.5f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    4.2f,
                    KeyframeAnimations.degreeVec(-110.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.75f,
                    KeyframeAnimations.degreeVec(-110.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.95f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.2f,
                    KeyframeAnimations.degreeVec(62.4106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.75f,
                    KeyframeAnimations.degreeVec(62.4106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.95f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(6.95f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.15f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, 131.0625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.45f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, 131.0625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.95f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -20.6042f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.95f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.posVec(-2.0f, -5.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.7f,
                    KeyframeAnimations.posVec(-2.0f, -5.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.75f,
                    KeyframeAnimations.posVec(-1.8f, -5.6f, 2.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.posVec(-1.33f, -8.83f, 5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.95f,
                    KeyframeAnimations.posVec(-0.87f, -8.07f, 10.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.15f,
                    KeyframeAnimations.posVec(1.0f, 1.0f, 15.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.45f,
                    KeyframeAnimations.posVec(1.0f, 1.0f, 15.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.75f,
                    KeyframeAnimations.posVec(-1.6f, -9.6f, 7.2f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.95f,
                    KeyframeAnimations.posVec(0.0f, -5.0f, 2.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.95f,
                    KeyframeAnimations.posVec(-2.0f, -5.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "weapon", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(0.0f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .build()

    val walkright: AnimationDefinition = AnimationDefinition.Builder.withLength(1.85f).looping()
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.5f, KeyframeAnimations.degreeVec(0.0f, 45.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.9f, KeyframeAnimations.degreeVec(0.0f, 45.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.85f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(19.6268f, -12.7407f, -0.8394f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.9f,
                    KeyframeAnimations.degreeVec(14.0327f, -26.7952f, -6.4285f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.4f,
                    KeyframeAnimations.degreeVec(13.5348f, 2.0557f, 32.8888f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.1f,
                    KeyframeAnimations.degreeVec(13.2403f, 3.4874f, 26.8693f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(1.85f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.4f,
                    KeyframeAnimations.degreeVec(-12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.1f,
                    KeyframeAnimations.degreeVec(-19.09f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.LINEAR
                )
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(-11.4069f, -28.8462f, 9.9551f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.95f,
                    KeyframeAnimations.degreeVec(-2.657f, -9.8941f, 1.5389f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.2f,
                    KeyframeAnimations.degreeVec(-45.2457f, 56.6505f, 10.1946f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.45f,
                    KeyframeAnimations.degreeVec(4.6066f, 14.2906f, 18.0778f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.2f,
                    KeyframeAnimations.posVec(0.0f, -1.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(1.85f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.2f,
                    KeyframeAnimations.degreeVec(69.6311f, 19.7302f, 12.6038f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.45f,
                    KeyframeAnimations.degreeVec(7.5071f, -2.4786f, -0.3265f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.2f,
                    KeyframeAnimations.posVec(-0.5f, -0.5f, -0.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.45f,
                    KeyframeAnimations.posVec(-0.36f, -0.11f, -0.11f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(1.85f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.3f,
                    KeyframeAnimations.degreeVec(-21.1771f, 23.8646f, 2.0073f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.6f,
                    KeyframeAnimations.degreeVec(-55.156f, 45.5218f, -13.4248f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(-22.8936f, 48.8818f, -3.5427f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.05f,
                    KeyframeAnimations.degreeVec(-3.5669f, 6.4952f, 0.1218f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.6f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.75f, KeyframeAnimations.posVec(-1.0f, 0.0f, -1.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.05f, KeyframeAnimations.posVec(-1.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.6f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.85f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.3f,
                    KeyframeAnimations.degreeVec(14.9131f, 2.5254f, 0.7237f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.6f,
                    KeyframeAnimations.degreeVec(49.9131f, 2.5254f, 0.7237f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(7.4131f, 2.5254f, 0.7237f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.05f,
                    KeyframeAnimations.degreeVec(7.4131f, 2.5254f, 0.7237f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.6f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(1.6f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(1.85f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.LINEAR
                )
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(-2.0f, -5.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.85f, KeyframeAnimations.posVec(-2.0f, -5.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "weapon", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(0.0f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .build()

    val death: AnimationDefinition = AnimationDefinition.Builder.withLength(5.3f)
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.4f,
                    KeyframeAnimations.degreeVec(-10.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.95f,
                    KeyframeAnimations.degreeVec(2.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.4f,
                    KeyframeAnimations.degreeVec(30.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.8f,
                    KeyframeAnimations.degreeVec(87.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.65f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.95f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, -2.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.6f,
                    KeyframeAnimations.posVec(0.0f, -9.51f, -6.59f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.8f,
                    KeyframeAnimations.posVec(0.0f, -14.07f, -8.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.4f,
                    KeyframeAnimations.posVec(0.0f, -14.07f, -8.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.65f,
                    KeyframeAnimations.posVec(0.0f, -14.07f, -8.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.8f,
                    KeyframeAnimations.posVec(0.0f, -14.07f, -8.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.05f,
                    KeyframeAnimations.posVec(0.0f, -14.07f, -8.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.25f,
                    KeyframeAnimations.posVec(0.0f, -14.07f, -8.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.45f,
                    KeyframeAnimations.posVec(0.0f, -14.07f, -8.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.7f,
                    KeyframeAnimations.posVec(0.0f, -14.07f, -8.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.8f,
                    KeyframeAnimations.posVec(0.0f, -14.07f, -8.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.0f,
                    KeyframeAnimations.posVec(0.0f, -14.07f, -8.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.1f,
                    KeyframeAnimations.posVec(0.0f, -14.07f, -8.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.15f,
                    KeyframeAnimations.posVec(0.0f, -14.07f, -8.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.15f,
                    KeyframeAnimations.posVec(0.0f, -21.07f, -8.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.4f,
                    KeyframeAnimations.degreeVec(-20.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.65f,
                    KeyframeAnimations.degreeVec(-30.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.95f,
                    KeyframeAnimations.degreeVec(-30.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.15f,
                    KeyframeAnimations.degreeVec(-50.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.4f,
                    KeyframeAnimations.degreeVec(26.69f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(26.69f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.4f,
                    KeyframeAnimations.degreeVec(28.4324f, -2.6529f, 52.3323f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.15f,
                    KeyframeAnimations.degreeVec(28.4324f, -2.6529f, 52.3323f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.4f,
                    KeyframeAnimations.degreeVec(-16.5676f, -2.6529f, 52.3323f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.65f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 30.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.4f,
                    KeyframeAnimations.degreeVec(-37.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.15f,
                    KeyframeAnimations.degreeVec(-37.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.4f,
                    KeyframeAnimations.degreeVec(-47.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.65f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.4f,
                    KeyframeAnimations.degreeVec(38.0691f, 11.002f, -26.3679f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.15f,
                    KeyframeAnimations.degreeVec(38.0691f, 11.002f, -26.3679f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.45f,
                    KeyframeAnimations.degreeVec(-36.3543f, 11.4095f, -26.2333f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.65f,
                    KeyframeAnimations.degreeVec(-16.9309f, 11.002f, -26.3679f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -30.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.65f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.4f,
                    KeyframeAnimations.degreeVec(-25.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(-25.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(10.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.75f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.95f,
                    KeyframeAnimations.degreeVec(-5.39f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.25f,
                    KeyframeAnimations.degreeVec(-5.39f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.65f,
                    KeyframeAnimations.degreeVec(15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.8f,
                    KeyframeAnimations.degreeVec(30.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.0f,
                    KeyframeAnimations.degreeVec(35.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.35f,
                    KeyframeAnimations.degreeVec(-2.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.95f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.25f,
                    KeyframeAnimations.degreeVec(52.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.4f,
                    KeyframeAnimations.degreeVec(62.72f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.65f,
                    KeyframeAnimations.degreeVec(22.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.8f,
                    KeyframeAnimations.degreeVec(50.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.05f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.95f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.4f,
                    KeyframeAnimations.degreeVec(22.5f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.65f,
                    KeyframeAnimations.degreeVec(11.3035f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.95f,
                    KeyframeAnimations.degreeVec(11.3035f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.1f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.75f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.95f,
                    KeyframeAnimations.degreeVec(27.5f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.3f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.65f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 1.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.95f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 1.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(1.1f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.65f,
                    KeyframeAnimations.degreeVec(6.765f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.95f,
                    KeyframeAnimations.degreeVec(6.765f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.1f,
                    KeyframeAnimations.degreeVec(42.4106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.4f,
                    KeyframeAnimations.degreeVec(71.0451f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.75f,
                    KeyframeAnimations.degreeVec(42.4106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.95f,
                    KeyframeAnimations.degreeVec(69.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.3f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.7f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.posVec(-2.0f, -5.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.7f,
                    KeyframeAnimations.posVec(-2.0f, -5.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.95f,
                    KeyframeAnimations.posVec(-2.0f, -4.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.25f,
                    KeyframeAnimations.posVec(-1.0f, -2.0f, 4.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(0.0f, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.7f, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(1.75f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "weapon", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(0.0f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .build()

    val block: AnimationDefinition = AnimationDefinition.Builder.withLength(1.0f)
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.05f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.05f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.15f,
                    KeyframeAnimations.degreeVec(-10.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.3f,
                    KeyframeAnimations.degreeVec(-17.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.65f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    0.1f,
                    KeyframeAnimations.degreeVec(-72.8826f, 8.255f, 54.4091f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.35f,
                    KeyframeAnimations.degreeVec(-72.8826f, 8.255f, 54.4091f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.LINEAR
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(1.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(
                    0.1f,
                    KeyframeAnimations.degreeVec(0.8511f, -34.5642f, -23.9215f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.35f,
                    KeyframeAnimations.degreeVec(0.8511f, -34.5642f, -23.9215f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(1.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "leftarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.2f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(1.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.2f,
                    KeyframeAnimations.degreeVec(-22.2889f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.45f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.2f,
                    KeyframeAnimations.degreeVec(22.1995f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.45f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.45f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(1.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .build()

    val attack3: AnimationDefinition = AnimationDefinition.Builder.withLength(4.05f)
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(25.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.posVec(0.0f, -5.75f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.35f,
                    KeyframeAnimations.posVec(0.0f, -5.75f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.2f,
                    KeyframeAnimations.posVec(0.0f, -0.55f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.05f,
                    KeyframeAnimations.posVec(0.0f, -1.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(4.05f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(50.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.6f,
                    KeyframeAnimations.degreeVec(50.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.95f,
                    KeyframeAnimations.degreeVec(20.41f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-149.2988f, 11.8356f, 25.042f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.6f,
                    KeyframeAnimations.degreeVec(-149.2988f, 11.8356f, 25.042f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.25f,
                    KeyframeAnimations.degreeVec(-194.0541f, 1.144f, -21.3131f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.45f,
                    KeyframeAnimations.degreeVec(-10.822f, 24.2992f, 10.3967f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(4.05f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.15f,
                    KeyframeAnimations.degreeVec(-30.7245f, -1.1321f, -17.7075f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-42.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(-4.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.85f,
                    KeyframeAnimations.degreeVec(25.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.75f,
                    KeyframeAnimations.degreeVec(39.6f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-120.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.6f,
                    KeyframeAnimations.degreeVec(-107.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.25f,
                    KeyframeAnimations.degreeVec(-38.7f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(4.05f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(92.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.6f,
                    KeyframeAnimations.degreeVec(92.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.2f,
                    KeyframeAnimations.degreeVec(36.35f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(4.05f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(5.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.6f,
                    KeyframeAnimations.degreeVec(5.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.05f,
                    KeyframeAnimations.degreeVec(-18.7615f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(4.05f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(52.4106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.6f,
                    KeyframeAnimations.degreeVec(52.4106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(4.05f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(40.6179f, -27.4569f, 135.5356f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.65f,
                    KeyframeAnimations.degreeVec(40.6179f, -27.4569f, 135.5356f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.25f,
                    KeyframeAnimations.degreeVec(114.4583f, -18.5137f, 109.0904f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.posVec(3.0f, -4.0f, 15.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.65f,
                    KeyframeAnimations.posVec(3.0f, -4.0f, 15.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(1.25f, KeyframeAnimations.posVec(1.0f, 2.0f, 12.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(
                    1.35f,
                    KeyframeAnimations.posVec(-1.98f, -3.36f, 15.01f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    1.4f,
                    KeyframeAnimations.posVec(-2.19f, -6.95f, 10.94f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    1.45f,
                    KeyframeAnimations.posVec(-1.89f, -8.94f, 6.06f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    1.55f,
                    KeyframeAnimations.posVec(-1.0f, -3.0f, 2.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.posVec(0.0f, -5.75f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "weapon", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(0.0f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .build()

    val attack4: AnimationDefinition = AnimationDefinition.Builder.withLength(8.0f)
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.2f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    8.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "root", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(2.2f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    2.9f,
                    KeyframeAnimations.posVec(0.0f, -3.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.05f,
                    KeyframeAnimations.posVec(0.0f, -3.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(8.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.2f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.9f,
                    KeyframeAnimations.degreeVec(40.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.6f,
                    KeyframeAnimations.degreeVec(52.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(52.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.25f,
                    KeyframeAnimations.degreeVec(55.2522f, -8.6832f, -12.2785f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.45f,
                    KeyframeAnimations.degreeVec(58.1934f, -16.7215f, -24.8242f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.2f,
                    KeyframeAnimations.degreeVec(52.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.9f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    8.0f,
                    KeyframeAnimations.degreeVec(12.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(2.2f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(7.95f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(2.2f, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(7.95f, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.8f,
                    KeyframeAnimations.degreeVec(9.9725f, -9.4227f, 84.3209f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.5f,
                    KeyframeAnimations.degreeVec(11.562f, -8.1886f, 75.6754f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.4f,
                    KeyframeAnimations.degreeVec(9.9725f, -9.4227f, 84.3209f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.8f,
                    KeyframeAnimations.degreeVec(28.0135f, 45.8244f, 103.1711f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(13.8794f, 44.5866f, 95.8101f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    4.3f,
                    KeyframeAnimations.degreeVec(-106.1206f, 44.5866f, 95.8101f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.45f,
                    KeyframeAnimations.degreeVec(-106.1206f, 44.5866f, 95.8101f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    5.75f,
                    KeyframeAnimations.degreeVec(-24.342f, 39.9759f, 44.6606f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    8.0f,
                    KeyframeAnimations.degreeVec(13.4351f, 2.6388f, 30.4557f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightarm", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(8.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.5f,
                    KeyframeAnimations.degreeVec(1.18f, -0.208f, 9.9619f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(4.1f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(
                    4.3f,
                    KeyframeAnimations.degreeVec(-47.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.45f,
                    KeyframeAnimations.degreeVec(-47.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.LINEAR
                ),
                Keyframe(
                    5.75f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    8.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.9f,
                    KeyframeAnimations.degreeVec(-13.4485f, -37.7815f, -2.2773f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(-71.4614f, 9.5591f, -46.5119f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.4f,
                    KeyframeAnimations.degreeVec(19.1211f, 3.3057f, -22.117f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.3f,
                    KeyframeAnimations.degreeVec(19.1211f, 3.3057f, -22.117f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.8f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    8.0f,
                    KeyframeAnimations.degreeVec(-13.1058f, 0.0f, -12.6739f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftarm2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.9f,
                    KeyframeAnimations.degreeVec(-50.0749f, 28.1168f, -5.2962f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.05f,
                    KeyframeAnimations.degreeVec(-111.3923f, 14.5625f, -20.3145f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    4.4f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.3f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.8f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    8.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.6f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.9f,
                    KeyframeAnimations.degreeVec(-45.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.25f,
                    KeyframeAnimations.degreeVec(-45.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    6.55f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    8.0f,
                    KeyframeAnimations.degreeVec(-7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(3.6f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "rightleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.35f,
                    KeyframeAnimations.degreeVec(0.3094f, -0.0546f, 9.9996f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.2f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.6f,
                    KeyframeAnimations.degreeVec(-4.32f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.4f,
                    KeyframeAnimations.degreeVec(23.64f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.0f,
                    KeyframeAnimations.degreeVec(23.64f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.3f,
                    KeyframeAnimations.degreeVec(-29.74f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.5f,
                    KeyframeAnimations.degreeVec(-36.43f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    8.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.75f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.6f,
                    KeyframeAnimations.degreeVec(42.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.0f,
                    KeyframeAnimations.degreeVec(42.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.3f,
                    KeyframeAnimations.degreeVec(103.33f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.5f,
                    KeyframeAnimations.degreeVec(67.07f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    8.0f,
                    KeyframeAnimations.degreeVec(7.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "rightleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(8.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leftleg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.2f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.9f,
                    KeyframeAnimations.degreeVec(-55.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.0f,
                    KeyframeAnimations.degreeVec(-55.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.3f,
                    KeyframeAnimations.degreeVec(-42.1059f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    8.0f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.2f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.9f,
                    KeyframeAnimations.degreeVec(52.4106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.0f,
                    KeyframeAnimations.degreeVec(52.4106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    7.3f,
                    KeyframeAnimations.degreeVec(61.9801f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    8.0f,
                    KeyframeAnimations.degreeVec(14.9106f, -2.3064f, -0.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leftleg2", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(2.2f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(8.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "item_display", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(1.05f, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "weapon", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(15.2073f, -6.3807f, -12.5993f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.15f,
                    KeyframeAnimations.degreeVec(15.2073f, -6.3807f, -12.5993f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.95f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.15f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, 6.8958f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.55f,
                    KeyframeAnimations.degreeVec(76.9333f, 8.2561f, 8.8398f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.3f,
                    KeyframeAnimations.degreeVec(77.8556f, 36.4054f, 2.581f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.9f,
                    KeyframeAnimations.degreeVec(79.6962f, 27.0754f, 7.2803f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.45f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, 18.5625f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.95f,
                    KeyframeAnimations.degreeVec(64.1045f, -12.0619f, -31.4375f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    8.0f,
                    KeyframeAnimations.degreeVec(15.2073f, -6.3807f, -12.5993f),
                    AnimationChannel.Interpolations.LINEAR
                )
            )
        )
        .addAnimation(
            "weapon", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.posVec(1.0f, -2.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.15f,
                    KeyframeAnimations.posVec(1.0f, -2.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.95f,
                    KeyframeAnimations.posVec(6.0f, -13.0f, 3.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.15f,
                    KeyframeAnimations.posVec(0.07f, -25.4f, -2.4f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.55f,
                    KeyframeAnimations.posVec(-13.0f, -74.0f, -9.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    3.9f,
                    KeyframeAnimations.posVec(-20.01f, -75.09f, -9.68f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.45f,
                    KeyframeAnimations.posVec(-13.0f, -59.0f, -9.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.55f,
                    KeyframeAnimations.posVec(-4.36f, -44.64f, -4.04f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.7f,
                    KeyframeAnimations.posVec(3.48f, -10.48f, 4.72f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    5.95f,
                    KeyframeAnimations.posVec(4.0f, -6.0f, 7.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(8.0f, KeyframeAnimations.posVec(1.0f, -2.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "weapon", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(0.0f, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(1.15f, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(1.95f, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(2.55f, KeyframeAnimations.scaleVec(5.0, 5.0, 5.0), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(5.45f, KeyframeAnimations.scaleVec(5.0, 5.0, 5.0), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(5.7f, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(8.0f, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .build()
}