pluginManagement {
	repositories {
		mavenLocal()
		gradlePluginPortal()
		mavenCentral()
		maven("https://nexus.mcfpp.top/repository/maven-public/")
	}
}

rootProject.name = "katton-examples"

include("fabric", "neoforge", "paper")
