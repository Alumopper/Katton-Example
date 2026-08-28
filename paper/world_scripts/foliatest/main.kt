@file:Suppress("unused")

package foliatest

import net.minecraft.network.chat.Component
import net.minecraft.server.level.ServerPlayer
import top.katton.api.*
import top.katton.api.dpcaller.*
import top.katton.api.event.*
import top.katton.paper.*

/**
 * Folia scheduler API test pack.
 *
 * Tests:
 * 1. entity.schedule { } — basic region-thread scheduling
 * 2. entity.schedule(delay) { } — delayed scheduling
 * 3. scheduleAt(world, pos) { } — position-based scheduling
 * 4. scheduleGlobal { } — global region scheduling
 * 5. scheduleGlobal(delay) { } — delayed global
 * 6. ServerPlayer.toBukkit() — conversion helper
 */

private var testPlayer: ServerPlayer? = null
private var running = false

@ServerScriptEntrypoint(ServerPhase.READY)
fun main() {
    val interval = config.getNumber("test_interval", 100).toLong()
    val targetName = config.getString("test_player", "")

    // ── Test 1: Global scheduling (runs immediately, then repeats) ──
    scheduleGlobal {
        tell(Component.literal("[FoliaTest] Server started. Running scheduler tests every ${interval}t."))
    }

    // ── Test 2: Repeated global scheduling ──
    scheduleGlobalRepeating(delayTicks = 20, interval) {
        val players = server?.playerList?.players ?: return@scheduleGlobalRepeating
        if (players.isEmpty()) return@scheduleGlobalRepeating

        // Pick a test player
        val p = if (targetName.isNotBlank())
            players.firstOrNull { it.name.string.equals(targetName, ignoreCase = true) }
        else
            players.firstOrNull()

        if (p == null) return@scheduleGlobalRepeating
        testPlayer = p

        // ── Test 3: entity.schedule — run on player's region thread ──
        p.schedule {
            tell(p, "[FoliaTest] Hello from YOUR region thread! pos=${p.position()}")

            // ── Test 4: entity.schedule with delay ──
            p.schedule(delayTicks = 40) {
                tell(p, "[FoliaTest] This message was delayed by 40 ticks (=2s).")
            }
        }
    }

// ── Test 5: scheduleAt — position-based scheduling on player join ──
    ServerPlayerEvent.onPlayerJoin += { arg ->
        val player = arg.player

        scheduleGlobal {
            tell(player, "[FoliaTest] Welcome! Testing position scheduling...")

            scheduleAt(player.level(), player.blockPosition()) {
                // We're on the chunk's region thread now
                val block = player.level().getBlockState(player.blockPosition().above())
                tell(player, "[FoliaTest] Block above you: $block (scheduled to chunk region)")
            }
        }
    }

// ── Position-based block operation ──
    ChunkAndBlockEvent.onBlockPlace += onBlockPlace@{ arg ->
        val player = arg.player as? ServerPlayer ?: return@onBlockPlace
        val pos = arg.pos.above()
        val level = player.level()

        // Schedule a block operation on the chunk's region
        scheduleAt(level, pos, delayTicks = 60) {
            val blockAbove = level.getBlockState(pos)
            tell(player, "[GlobalTest] Block above placed block: $blockAbove (checked via region scheduling)")
        }
    }

}
