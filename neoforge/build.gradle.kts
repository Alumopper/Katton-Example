import java.nio.file.Files
import java.nio.file.Path

plugins {
	id("org.jetbrains.kotlin.jvm") version "2.3.0"
}

val kattonVersion = "0.1.3b1"
val clientScriptsTargetDir: File? = null
val serverScriptsTargetDir: File? = null
val gClientScriptsTargetDir: File? = null
val gServerScriptsTargetDir: File? = null

repositories {
	mavenLocal()
	mavenCentral()
	maven("https://maven.neoforged.net/releases")
	maven("https://libraries.minecraft.net")
	maven("https://nexus.mcfpp.top/repository/maven-public/")
}

dependencies {
	implementation("top.katton:katton-common:$kattonVersion")
	implementation("top.katton:katton-neoforge:$kattonVersion")
	compileOnly(fileTree("lib") {
		include("*.jar")
	})
	compileOnly("com.mojang:brigadier:1.3.10")
}

sourceSets {
	kotlin {
		main {
			kotlin.srcDir("client_scripts")
				.srcDir("server_scripts")
		}
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
					if (Files.isDirectory(child)) child.toFile().deleteRecursively()
					else Files.deleteIfExists(child)
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

tasks.register("copyGlobalClientScripts") {
	group = "distribution"
	doLast { gClientScriptsTargetDir?.let { syncDirectoryAsHardLinks(file("global_client_scripts"), it) } }
}
tasks.register("copyGlobalServerScripts") {
	group = "distribution"
	doLast { gServerScriptsTargetDir?.let { syncDirectoryAsHardLinks(file("global_server_scripts"), it) } }
}
tasks.register("copyClientScripts") {
	group = "distribution"
	doLast { clientScriptsTargetDir?.let { syncDirectoryAsHardLinks(file("client_scripts"), it) } }
}
tasks.register("copyServerScripts") {
	group = "distribution"
	doLast { serverScriptsTargetDir?.let { syncDirectoryAsHardLinks(file("server_scripts"), it) } }
}
tasks.register("copyGameScripts") {
	group = "distribution"
	dependsOn("copyClientScripts", "copyServerScripts", "copyGlobalClientScripts", "copyGlobalServerScripts")
}
