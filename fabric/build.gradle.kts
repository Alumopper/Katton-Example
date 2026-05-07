import java.nio.file.Files
import java.nio.file.Path

plugins {
	id("org.jetbrains.kotlin.jvm") version "2.3.0"
}

val kattonVersion = "0.2.0b5"
val fabricApiVersion = "0.144.0+26.1"
val worldScriptsTargetDir: List<File> = listOf(
	file("G:\\AST\\kts4mc-template-1.21.11\\fabric\\run\\saves\\新的世界\\kattonpacks\\test"),
	file("G:\\AST\\kts4mc-template-1.21.11\\fabric\\run\\world\\kattonpacks\\test")
)
val globalScriptsTargetDir: List<File> = listOf()

repositories {
	mavenLocal()
	mavenCentral()
	maven("https://maven.fabricmc.net/")
	maven("https://libraries.minecraft.net")
	maven("https://nexus.mcfpp.top/repository/maven-public/")
}

dependencies {
	implementation("top.katton:katton-common:$kattonVersion")
	implementation("top.katton:katton-fabric:$kattonVersion")
	compileOnly(fileTree("lib") {
		include("*.jar")
	})
	compileOnly("net.fabricmc.fabric-api:fabric-api:$fabricApiVersion")
	compileOnly("com.mojang:brigadier:1.3.10")
	compileOnly("org.joml:joml:1.10.8")
}

sourceSets {
	kotlin {
		main {
			kotlin.srcDir("global_scripts")
				.srcDir("world_scripts")
		}
	}
}

kotlin {
	jvmToolchain(25)
	sourceSets.named("main") {
		kotlin.srcDirs("global_scripts", "world_scripts")
	}
}

fun syncDirectoryAsHardLinks(sourceDir: File, targetDir: File) {
	val sourceRoot = sourceDir.toPath().toAbsolutePath().normalize()
	val targetRoot = targetDir.toPath().toAbsolutePath().normalize()

	require(Files.exists(sourceRoot) && Files.isDirectory(sourceRoot)) {
		"Source directory does not exist: $sourceRoot"
	}

	Files.createDirectories(targetRoot)

	Files.walk(sourceRoot).use { stream ->
		stream.forEach { sourcePath ->
			if (sourcePath == sourceRoot) return@forEach

			val relativePath = sourceRoot.relativize(sourcePath)
			val targetPath = targetRoot.resolve(relativePath.toString())

			when {
				Files.isDirectory(sourcePath) -> Files.createDirectories(targetPath)
				Files.isRegularFile(sourcePath) -> {
					Files.createDirectories(targetPath.parent)
					if (Files.exists(targetPath)) {
						if (Files.isSameFile(sourcePath, targetPath)) return@forEach
						Files.deleteIfExists(targetPath)
					}
					Files.createLink(targetPath, sourcePath)
				}
			}
		}
	}

	fun pruneStaleEntries(targetPath: Path) {
		if (!Files.exists(targetPath)) return

		Files.list(targetPath).use { stream ->
			stream.forEach { child ->
				val relativePath = targetRoot.relativize(child)
				val sourcePath = sourceRoot.resolve(relativePath.toString())

				if (!Files.exists(sourcePath)) {
					if (Files.isDirectory(child)) {
						child.toFile().deleteRecursively()
					} else {
						Files.deleteIfExists(child)
					}
					return@forEach
				}

				if (Files.isDirectory(child)) {
					pruneStaleEntries(child)
					if (Files.list(child).use { it.findAny().isEmpty } && !Files.isDirectory(sourcePath)) {
						child.toFile().deleteRecursively()
					}
				}
			}
		}
	}

	pruneStaleEntries(targetRoot)
}

tasks.register("copyWorldScripts") {
	group = "distribution"
	description = "Mirrors world_scripts to the configured target path using hard links."
	doLast {
		worldScriptsTargetDir.forEach{ syncDirectoryAsHardLinks(file("world_scripts"), it)}
	}
}

tasks.register("copyGlobalScripts") {
	group = "distribution"
	description = "Mirrors global_scripts to the configured target path using hard links."
	doLast {
		globalScriptsTargetDir.forEach{ syncDirectoryAsHardLinks(file("global_scripts"), it) }
	}
}

tasks.register("copyGameScripts") {
	group = "distribution"
	description = "Mirrors world_scripts and global_scripts contents to their configured target paths."
	dependsOn("copyWorldScripts", "copyGlobalScripts")
}
