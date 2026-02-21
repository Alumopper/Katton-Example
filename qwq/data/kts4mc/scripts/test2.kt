package test

import net.minecraft.network.chat.Component
import net.minecraft.server.level.ServerPlayer
import top.katton.api.requireServer
import top.katton.api.setThunder
import top.katton.api.tell

fun say2(player: ServerPlayer) {
    sayMeow2(player)
}

fun sayMeow(player: ServerPlayer) {
    tell(player, "meow~")
}