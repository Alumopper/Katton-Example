package qwq

import model.Zombie1ModelAnimation
import model.Zombie1Model
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.world.entity.AnimationState
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.MobCategory
import net.minecraft.world.entity.monster.Monster
import net.minecraft.world.level.Level
import qwq.Zombie1Entity
import top.katton.api.ClientPhase
import top.katton.api.ClientScriptEntrypoint
import top.katton.api.ServerPhase
import top.katton.api.ServerScriptEntrypoint
import top.katton.api.registry.registerAnimatedEntityRenderer
import top.katton.api.registry.registerNativeEntity
import top.katton.bridge.KattonBridge
import top.katton.registry.RegisterMode
import top.katton.registry.id

// ═══════════════════════════════════════════════════════════
//  Entity — just publish animation states to the bridge
// ═══════════════════════════════════════════════════════════

class Zombie1Entity(type: EntityType<out Monster>, level: Level) : Monster(type, level) {
    val idle = AnimationState()
    val walk = AnimationState()

    init { idle.start(tickCount) }

    override fun tick() {
        super.tick()
        if (level().isClientSide) {
            KattonBridge["anim:${id}:idle"] = idle
            KattonBridge["anim:${id}:walk"] = walk
            if (deltaMovement.horizontalDistanceSqr() > 1.0e-7) {
                walk.startIfStopped(tickCount); idle.stop()
            } else {
                idle.startIfStopped(tickCount); walk.stop()
            }
        }
    }
}

// ═══════════════════════════════════════════════════════════
//  Registration
// ═══════════════════════════════════════════════════════════

@ServerScriptEntrypoint(ServerPhase.READY)
@ClientScriptEntrypoint(ClientPhase.REGISTRY_SETUP)
fun initZombie() {
    registerNativeEntity("test:zombie1", RegisterMode.RELOADABLE,
        configure = {
            dimensions(0.6f, 1.95f); maxHealth(20.0); movementSpeed(0.23)
            attackDamage(3.0); withSpawnEgg(); followRange(64.0)
        }
    ) { p -> EntityType.Builder.of(::Zombie1Entity, MobCategory.MONSTER)
        .sized(p.dimensions.width, p.dimensions.height)
        .build(ResourceKey.create(Registries.ENTITY_TYPE, p.id))
    }
}

@ClientScriptEntrypoint(ClientPhase.REGISTRY_SETUP)
fun initZombieRenderer() {
    registerAnimatedEntityRenderer(
        entityTypeId = "test:zombie1",
        modelLayer = Zombie1Model.LAYER_LOCATION,
        bodyLayer = { Zombie1Model.createBodyLayer() },
        modelFactory = { root -> Zombie1Model(root) },
        texture = id("test", "textures/entity/zombie1.png"),
        animations = mapOf(
            "idle" to Zombie1ModelAnimation.idle,
            "walk" to Zombie1ModelAnimation.walkforward
        )
    )
}
