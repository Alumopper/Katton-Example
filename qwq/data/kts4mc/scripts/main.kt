import net.minecraft.network.chat.Component
import net.minecraft.server.level.ServerLevel
import net.minecraft.server.level.ServerPlayer
import net.minecraft.world.entity.projectile.arrow.Arrow
import net.minecraft.world.level.Level
import test.say
import test.say2
import top.katton.api.*
import top.katton.api.KattonEvents.ServerEntity.EntityLoadArg
import top.katton.api.KattonEvents.ServerEntity.onEntityLoad
import top.katton.api.KattonEvents.ServerTick.onStartServerTick
import top.katton.api.KattonItemCollection.Weapon

fun main() {
    onEntityLoad += load@
    fun(arg: EntityLoadArg) {
        val (entity, _) = arg
        if (entity !is Arrow) return
        //if a player shoots an arrow, check the bow's data
        val owner = entity.owner
        if (owner is ServerPlayer) {
            onArrowShot(owner, entity)
            say(owner)
            say2(owner)
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
            arrow.kill(arrow.level() as ServerLevel)
        }
    }
}

@Suppress("unused") val entryPoint = main()