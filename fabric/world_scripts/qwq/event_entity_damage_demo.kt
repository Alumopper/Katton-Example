package qwq

import net.minecraft.server.level.ServerPlayer
import net.minecraft.world.item.ItemDisplayContext
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.Items
import top.katton.api.ClientItemRenderEasing.EASE_IN_OUT_QUINT
import top.katton.api.ClientItemRenderEasing.EASE_IN_QUINT
import top.katton.api.ServerPhase
import top.katton.api.ServerScriptEntrypoint
import top.katton.api.dpcaller.tell
import top.katton.api.event.AllowDamageArg
import top.katton.api.event.ServerLivingEntityEvent
import top.katton.api.showItemRenderMarker

@ServerScriptEntrypoint(ServerPhase.READY)
fun eventEntityDamageDemo() {
    ServerLivingEntityEvent.onAllowDamage += allow@ fun(arg: AllowDamageArg): Boolean {
        val level = arg.entity.level()
        if (level.isClientSide) return true

        val sourceEntity = arg.source.entity
        val attacker = sourceEntity as? ServerPlayer ?: return true

        if (arg.amount > 8.0f) {
            tell(attacker, "[event-demo] 你本次伤害 ${arg.amount} 被脚本拦截（阈值 > 8）")
            showItemRenderMarker(
                player = attacker,
                stack = ItemStack(Items.DIAMOND_BLOCK),
                x = arg.entity.x,
                y = arg.entity.y,
                z = arg.entity.z,
                lifetimeTicks = 60,
                displayContext = ItemDisplayContext.NONE,
                animations = mapOf(
                    "init" to {
                        addAnimation {
                            durationTicks = 60
                            scale {
                                keyframe(0f, 0.0, 0.0, 0.0)
                                keyframe(0.5f, 1.0, 1.0, 1.0, EASE_IN_OUT_QUINT)
                            }
                            translate {
                                keyframe(0f, 0.0, 0.0, 0.0)
                                keyframe(1.0f, 0.0, 1.5, 0.0, EASE_IN_QUINT)
                            }
                            rotate {
                                keyframe(0f, 0.0, 0.0, 0.0)
                                keyframe(1.0f, 0.0, 360.0, 0.0, EASE_IN_QUINT)
                            }
                        }
                    }
                ),
                playingAnimationID = listOf("init")
            )
            return false
        }

        return true
    }
}

