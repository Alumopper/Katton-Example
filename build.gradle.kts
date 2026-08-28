plugins {
	// Centralize plugin versions so subprojects share one plugin classloader.
	// Source: https://docs.gradle.org/current/userguide/plugins_intermediate.html#sec:subprojects_plugins_dsl
	id("org.jetbrains.kotlin.jvm") version "2.3.10" apply false
	id("net.fabricmc.fabric-loom") version "1.15-SNAPSHOT" apply false
	id("net.neoforged.moddev") version "2.0.141" apply false
	id("io.papermc.paperweight.userdev") version "2.0.0-beta.21" apply false
	id("top.katton.sign") version "1.0.0" apply false
}
