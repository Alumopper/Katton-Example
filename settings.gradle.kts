pluginManagement {
	repositories {
		mavenLocal()
		gradlePluginPortal()
		mavenCentral()
		maven("https://maven.fabricmc.net/")
		maven("https://maven.neoforged.net/releases")
		maven("https://nexus.mcfpp.top/repository/maven-public/")
	}
}

rootProject.name = "katton-examples"

include("fabric", "neoforge", "paper")
