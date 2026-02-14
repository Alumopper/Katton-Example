@file:DependsOn(
    "lib\\26.1-snapshot-6-Fabric.jar",
    "libs\\katton-1.0.0.jar"
)

import net.minecraft.network.chat.Component
import net.minecraft.server.level.ServerPlayer
import net.minecraft.world.entity.projectile.arrow.Arrow
import net.minecraft.world.level.Level
import top.katton.api.KattonEvents.ServerEntity.EntityLoadArg
import top.katton.api.KattonEvents.ServerEntity.onEntityLoad
import top.katton.api.KattonEvents.ServerTick.onStartServerTick
import top.katton.api.KattonMC.KattonItemCollection.Weapon
import top.katton.api.KattonMC.get
import top.katton.api.KattonMC.invoke
import top.katton.api.KattonMC.nbt
import top.katton.api.KattonMC.plus
import top.katton.api.getEntityNbt
import top.katton.api.tell

fun main() {
    onEntityLoad += load@
    fun(arg: EntityLoadArg) {
        val (entity, _) = arg
        if (entity !is Arrow) return
        //if a player shoots an arrow, check the bow's data
        val owner = entity.owner
        if (owner is ServerPlayer) {
            onArrowShot(owner, entity)
            tell(owner, "你射出了一个箭头")
        }
    }

    onStartServerTick += tick@
    fun(_) {
        processTNTArrow()
    }

}

val tntArrow = HashSet<Arrow>()

fun onArrowShot(player: ServerPlayer, arrow: Arrow) {
    tell(player, Component.empty() + "你手持的武器是: " + player[Weapon.MainHand]?.itemName)
    //this arrow is shot by a tnt bow, make it explode
    if (player.mainHandItem.nbt["tnt"](false)) {
        tntArrow.add(arrow)
    }
}

fun processTNTArrow() {
    val iterator = tntArrow.iterator()
    while (iterator.hasNext()) {
        val arrow = iterator.next()

        if (getEntityNbt(arrow).getBooleanOr("inGround", false)) {
            arrow.level().explode(
                arrow,
                arrow.damageSources().explosion(arrow, arrow.owner),
                null,
                arrow.position(),
                16.0f,
                false,
                Level.ExplosionInteraction.TNT
            )
            iterator.remove()
        }
    }
}

val runMain = main()