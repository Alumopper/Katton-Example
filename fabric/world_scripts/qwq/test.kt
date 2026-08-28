package qwq

import top.katton.api.ServerPhase
import top.katton.api.ServerScriptEntrypoint
import top.katton.api.datapack.FrameType
import top.katton.api.datapack.advancements
import top.katton.api.datapack.lootTables
import top.katton.api.datapack.recipes
import top.katton.api.datapack.uniform
import top.katton.api.mod.modifyRecipe

@ServerScriptEntrypoint(ServerPhase.READY)
fun test(){
    // Recipes — existing + new types
    recipes {
        smithingTransform("mymod:upgrade", "minecraft:golden_sword", 1) {
            template("minecraft:netherite_upgrade_smithing_template")
            base("minecraft:diamond_sword")
            addition("minecraft:gold_ingot")
        }
        transmute("mymod:convert", "minecraft:golden_sword") {
            input("minecraft:glass_bottle")
            material("minecraft:honey_bottle")
            materialCount(1, 4)
        }
        shaped("mymod:shaped", "minecraft:diamond", 1){
            define('A', "minecraft:stick")
            define('B', "minecraft:coal")
            pattern(" A ", "ABA", " A ")
        }
        shapeless("mymod:shapeless", "minecraft:diamond", 1){
            input("minecraft:stick", "minecraft:gold_nugget")
        }
    }

// Advancements
    advancements {
        add("mymod:first_adv") {
            parent = "minecraft:story/root"
            display {
                icon("minecraft:diamond")
                title("My First Advancement")
                description("Obtain a diamond")
                frame(FrameType.TASK)
            }
            criterion("got_diamond") {
                trigger("minecraft:inventory_changed")
                // conditions via conditions(json)
            }
            rewards {
                experience(100)
            }
        }
    }

// Loot Tables
    lootTables {
        add("mymod:dungeon_loot") {
            pool {
                rolls(uniform(1, 3))
                entry {
                    item("minecraft:diamond", weight = 1)
                }
                entry {
                    item("minecraft:iron_ingot", weight = 5)
                }
            }
        }
    }

// Recipe Modification
    modifyRecipe("minecraft:iron_ingot_from_smelting_iron_ore") {
        result = "minecraft:gold_ingot"
        experience = 2.0f
        cookingTime = 100
    }
}