import java.nio.file.Files
import java.nio.file.Path

plugins {
	id("org.jetbrains.kotlin.jvm")
	id("io.papermc.paperweight.userdev")
	id("top.katton.sign")
}

val kattonVersion = "0.4.0+mc26.1.2"
fun configuredDirectories(propertyName: String): List<File> =
	providers.gradleProperty(propertyName).orNull
		?.split(File.pathSeparatorChar)
		?.filter(String::isNotBlank)
		?.map(::file)
		.orEmpty()

val worldScriptsTargetDir = configuredDirectories("kattonWorldScriptsDir")
val globalScriptsTargetDir = configuredDirectories("kattonGlobalScriptsDir")

tasks.named<top.katton.sign.GenerateKattonSigningKeyTask>("generateKattonSigningKey") {
	privateKeyFile.convention(layout.buildDirectory.file("katton-signing-key.pem"))
	publicKeyFile.convention(layout.buildDirectory.file("katton-signing-key.pub"))
}

tasks.named<top.katton.sign.KattonSignPackTask>("signKattonPack") {
	dependsOn("generateKattonSigningKey")
	packDir.convention(layout.projectDirectory.dir("world_scripts"))
	privateKeyFile.convention(layout.buildDirectory.file("katton-signing-key.pem"))
	publicKeyFile.convention(layout.buildDirectory.file("katton-signing-key.pub"))
	scope.convention("world")
	keyId.convention("paper-example")
}

repositories {
	mavenLocal()
	mavenCentral()
	maven("https://repo.papermc.io/repository/maven-public")
	maven("https://nexus.mcfpp.top/repository/maven-public/")
}

dependencies {
	implementation("top.katton:katton-paper:$kattonVersion")
	paperweight.paperDevBundle("26.1.2.build.71-stable")
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
