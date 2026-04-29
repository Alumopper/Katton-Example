package qwq

import com.mojang.blaze3d.vertex.PoseStack
import model.Zombie1Animation
import model.Zombie1Model
import net.minecraft.client.animation.KeyframeAnimation
import net.minecraft.client.renderer.entity.EntityRendererProvider
import net.minecraft.client.renderer.entity.MobRenderer
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.entity.AnimationState
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.MobCategory
import net.minecraft.world.entity.monster.Monster
import net.minecraft.world.level.Level
import top.katton.Katton
import top.katton.api.ClientScriptEntrypoint
import top.katton.api.ServerScriptEntrypoint
import top.katton.api.registry.getBakedModelPart
import top.katton.api.registry.registerEntityModelLayer
import top.katton.api.registry.registerEntityRenderer
import top.katton.api.registry.registerNativeEntity
import top.katton.registry.RegisterMode
import top.katton.registry.id

// ═══════════════════════════════════════════════════════════
//  Entity — writes AnimationState to Katton's global bridge
//  (Katton.java is loaded by mod ClassLoader, so server and
//   client script ClassLoaders share the same map)
// ═══════════════════════════════════════════════════════════

class Zombie1Entity(type: EntityType<out Monster>, level: Level) : Monster(type, level) {
    val idleAnimationState = AnimationState()
    val walkAnimationState = AnimationState()

    init { idleAnimationState.start(tickCount) }

    override fun tick() {
        super.tick()
        if (level().isClientSide) {
            Katton.entityIdleAnimationStates[id] = idleAnimationState
            Katton.entityWalkAnimationStates[id] = walkAnimationState
            if (deltaMovement.horizontalDistanceSqr() > 1.0e-7) {
                walkAnimationState.startIfStopped(tickCount); idleAnimationState.stop()
            } else {
                idleAnimationState.startIfStopped(tickCount); walkAnimationState.stop()
            }
        }
    }
}

// ═══════════════════════════════════════════════════════════
//  Render State & Renderer — Monster avoids ClassLoader cast
// ═══════════════════════════════════════════════════════════

class Zombie1RenderState : LivingEntityRenderState()

class Zombie1Renderer(ctx: EntityRendererProvider.Context, model: Zombie1Model<Zombie1RenderState>) :
    MobRenderer<Monster, Zombie1RenderState, Zombie1Model<Zombie1RenderState>>(ctx, model, 0.5f) {
    private var idleAnim: KeyframeAnimation? = null
    private var walkAnim: KeyframeAnimation? = null

    override fun createRenderState() = Zombie1RenderState()

    override fun extractRenderState(entity: Monster, state: Zombie1RenderState, partialTicks: Float) {
        super.extractRenderState(entity, state, partialTicks)
        val idleState = Katton.entityIdleAnimationStates[entity.id] ?: return
        val walkState = Katton.entityWalkAnimationStates[entity.id] ?: return
        this.model.resetPose()
        if (idleAnim == null) idleAnim = Zombie1Animation.idle.bake(this.model.root())
        if (walkAnim == null) walkAnim = Zombie1Animation.walkforward.bake(this.model.root())
        if (entity.deltaMovement.horizontalDistanceSqr() > 1.0e-7)
            walkAnim!!.apply(walkState, state.ageInTicks)
        else
            idleAnim!!.apply(idleState, state.ageInTicks)
    }

    override fun getTextureLocation(state: Zombie1RenderState) = TEXTURE
    override fun setupRotations(state: Zombie1RenderState, ps: PoseStack, rot: Float, scl: Float) {
        super.setupRotations(state, ps, rot, scl)
    }
    companion object {
        val TEXTURE: ResourceLocation = id("test", "textures/entity/zombie1.png")
    }
}

@ServerScriptEntrypoint
fun initZombie() {
    registerNativeEntity("test:zombie1", RegisterMode.RELOADABLE,
        configure = { dimensions(0.6f, 1.95f); maxHealth(20.0); movementSpeed(0.23); attackDamage(3.0); withSpawnEgg(); followRange(64.0) }
    ) { p -> EntityType.Builder.of(::Zombie1Entity, MobCategory.MONSTER).sized(p.dimensions.width, p.dimensions.height)
        .build(ResourceKey.create(Registries.ENTITY_TYPE, p.id)) }
}

@ClientScriptEntrypoint
fun initZombieRenderer() {
    registerEntityModelLayer(Zombie1Model.LAYER_LOCATION) { Zombie1Model.createBodyLayer() }
    registerEntityRenderer("test:zombie1") { ctx -> Zombie1Renderer(ctx, Zombie1Model(getBakedModelPart(Zombie1Model.LAYER_LOCATION))) }
}
