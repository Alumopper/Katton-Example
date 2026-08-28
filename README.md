# Katton Example Project

This repository contains Minecraft 26.1.2 script-pack examples for
[Katton](https://github.com/Alumopper/Katton) 0.4.0 on Fabric, NeoForge, and
Paper. Script sources use `.kt`, and each platform subproject supplies the
matching Katton Maven artifacts for IDE completion and compile-time checks.

## Build and use

Build every example with Java 25:

```powershell
.\gradlew.bat build
```

Pass your own run directory as `kattonWorldScriptsDir`, then mirror a pack with
the relevant `copyWorldScripts` task. Multiple targets use the OS path separator
(`;` on Windows, `:` on Linux/macOS):

```powershell
.\gradlew.bat :fabric:copyWorldScripts "-PkattonWorldScriptsDir=G:\Minecraft\run\world\kattonpacks\test"
```

In game, reload Katton scripts with:

```text
/katton reload
```

Every world entrypoint declares its 0.4 lifecycle phase explicitly:

- server listeners, commands, and registry work use `ServerPhase.READY`;
- client registry and renderer work uses `ClientPhase.REGISTRY_SETUP`;
- UI actions that require a connected player use `ClientPhase.JOINED`.

Every manifest also contains the required `dependencies` list. Add a dependency
entry there when an example imports another installed mod or plugin API.

## Signing Client-Synced Packs

Katton supports signing script packs that are downloaded by clients. Signing is optional for local development, but recommended for multiplayer packs with `"clientSync": true`.

Generate a signing key and sign a platform pack:

```powershell
.\gradlew.bat :fabric:signKattonPack
```

The NeoForge and Paper equivalents are:

```powershell
.\gradlew.bat :neoforge:signKattonPack :paper:signKattonPack
```

Or sign and distribute in one step:

```powershell
.\gradlew.bat :fabric:signAndCopyWorldScripts
```

`signAndCopyWorldScripts` signs `world_scripts/manifest.json` first, then mirrors
the signed pack to the configured target path. Use `signAndCopyGameScripts` when
you want to sign world scripts and then run the full world/global copy flow.

The signing task writes payload-v2 Ed25519 metadata. Clients verify signed packs
before caching or running them. Keep each generated private key secret and do not
commit it.
