@file:Suppress("unused")

package modify_test

import net.minecraft.network.chat.Component
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.Rarity
import net.minecraft.world.level.block.SoundType
import top.katton.api.ClientScriptEntrypoint
import top.katton.api.ServerScriptEntrypoint
import top.katton.api.mod.*

/**
 * Comprehensive test for the `top.katton.api.mod` modification APIs.
 *
 * Covers: modifyItem, modifyBlock, modifyRecipe, modifyLootTable,
 *         modifyEntityType, addVillagerTrade.
 *
 * Run `/katton reload` after editing to apply changes.
 */

@ServerScriptEntrypoint
@ClientScriptEntrypoint
fun modifyTestMain() {
    tell("[ModifyTest] Loaded. Run /katton reload to apply modifications.")

    testModifyItem()
    testModifyBlock()
    testModifyRecipe()
    testModifyLootTable()
    testModifyEntityType()
    testAddVillagerTrade()
}

// ── 1. Item Modification ────────────────────────────────────────

fun testModifyItem() {
    // Make ender pearls stack to 64, set rarity, make fire resistant
    modifyItem("minecraft:ender_pearl") {
        maxStackSize = 64
        rarity = Rarity.EPIC
        fireResistant = true
    }

    // Turn diamond into edible food with 8 nutrition
    modifyItem("minecraft:diamond") {
        name = Component.literal("Candy Diamond")
        foodProperties = FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .build()
    }

    // Boost golden sword attack by giving it a crafted remainder
    modifyItem("minecraft:golden_sword") {
        attackDamage = 10.0
        attackSpeed = 1.6
    }

    // Netherite sword massive damage
    modifyItem("minecraft:netherite_sword") {
        attackDamage = 14.0
        attackSpeed = 2.0
    }

    tell("[ModifyTest] Items modified: ender_pearl, diamond, golden_sword, netherite_sword")
}

// ── 2. Block Modification ───────────────────────────────────────

fun testModifyBlock() {
    // Make stone soft like wool
    modifyBlock("minecraft:stone") {
        strength(0.5f)
        soundType = SoundType.WOOL
    }

    // Make obsidian glow
    modifyBlock("minecraft:obsidian") {
        lightEmission = 8
    }

    // Ice with increased friction (less slippery)
    modifyBlock("minecraft:ice") {
        friction = 0.8f
    }

    // Cobblestone needs correct tool
    modifyBlock("minecraft:cobblestone") {
        requiresCorrectTool = true
    }

    tell("[ModifyTest] Blocks modified: stone, obsidian, ice, cobblestone")
}

// ── 3. Recipe Modification ──────────────────────────────────────

fun testModifyRecipe() {
    // Change iron smelting to produce 3 gold ingots with more xp
    modifyRecipe("minecraft:iron_ingot_from_smelting_iron_ore") {
        result = "minecraft:gold_ingot"
        resultCount = 3
        experience = 5.0f
        cookingTime = 60
    }

    // Remove the stone pickaxe recipe entirely
    removeRecipe("minecraft:stone_pickaxe")

    tell("[ModifyTest] Recipes: iron→gold smelting, stone_pickaxe removed")
}

// ── 4. Loot Table Modification ─────────────────────────────────

fun testModifyLootTable() {
    // Add a diamond drop to stone blocks
    modifyLootTable("minecraft:blocks/stone") {
        pool {
            rolls = 1
            addItem("minecraft:diamond", weight = 1)
        }
    }

    // Add coal to grass blocks (funny bonus)
    modifyLootTable("minecraft:blocks/grass_block") {
        pool {
            addItem("minecraft:coal", weight = 3)
        }
    }

    tell("[ModifyTest] Loot tables: stone, grass_block modified")
}

// ── 5. Entity Type Attribute Modification ───────────────────────

fun testModifyEntityType() {
    // Make zombies stronger
    modifyEntityType("minecraft:zombie") {
        maxHealth(40.0)
        attackDamage(8.0)
        movementSpeed(0.32)
        followRange(40.0)
    }

    // Skeletons: faster and tougher
    modifyEntityType("minecraft:skeleton") {
        maxHealth(30.0)
        movementSpeed(0.30)
    }

    // Creeper with armor
    modifyEntityType("minecraft:creeper") {
        maxHealth(30.0)
        armor(4.0)
    }

    tell("[ModifyTest] Entity types: zombie, skeleton, creeper modified")
}

// ── 6. Villager Trade Addition ──────────────────────────────────

fun testAddVillagerTrade() {
    // Farmer level 1: 1 emerald → 5 apples (cheap food)
    addVillagerTrade("minecraft:farmer/level_1") {
        cost("minecraft:emerald", count = 1)
        result("minecraft:apple", count = 5)
        maxUses = 12
        xp = 2
        priceMultiplier = 0.05f
    }

    // Weaponsmith level 3: 8 emeralds → 1 diamond sword
    addVillagerTrade("minecraft:weaponsmith/level_3") {
        cost("minecraft:emerald", count = 8)
        result("minecraft:diamond_sword")
        maxUses = 3
        xp = 15
        priceMultiplier = 0.2f
    }

    // Wandering trader: 5 emeralds → 1 diamond
    addVillagerTrade("minecraft:wandering_trader/uncommon") {
        cost("minecraft:emerald", count = 5)
        result("minecraft:diamond")
        maxUses = 3
        xp = 0
    }

    // Toolsmith level 5: 15 emeralds → 1 netherite pickaxe
    addVillagerTrade("minecraft:toolsmith/level_5") {
        cost("minecraft:emerald", count = 15)
        result("minecraft:netherite_pickaxe")
        maxUses = 3
        xp = 30
        priceMultiplier = 0.2f
    }

    tell("[ModifyTest] Villager trades added: farmer_1, weaponsmith_3, wanderer, toolsmith_5")
}

// ── Util: broadcast a message visible to all online players ──────

fun tell(message: String) {
    // println for server console
    println(message)
}
