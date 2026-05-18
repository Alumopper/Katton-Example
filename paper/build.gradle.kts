import java.nio.file.Files
import java.nio.file.Path

plugins {
	id("org.jetbrains.kotlin.jvm") version "2.3.0"
	id("io.papermc.paperweight.userdev") version "2.0.0-beta.21"
}

val kattonVersion = "0.3.0b3"
val worldScriptsTargetDir: List<File> = listOf(
	file("G:\\AST\\kts4mc-template-1.21.11\\paper\\run\\world\\kattonpacks\\test")
)
val globalScriptsTargetDir: List<File> = listOf()

repositories {
	mavenLocal()
	mavenCentral()
	maven("https://repo.papermc.io/repository/maven-public")
	maven("https://nexus.mcfpp.top/repository/maven-public/")
}

dependencies {
	implementation("top.katton:katton-paper:$kattonVersion")
	paperweight.paperDevBundle("26.1.2.build.+")
}


kotlin {
	jvmToolchain(25)
	sourceSets.named("main") {
		kotlin.srcDirs("global_scripts", "world_scripts")
	}
}

kotlin {
	jvmToolchain(25)
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
