# Katton Example Project

This is an example project for [Katton](https://github.com/Alumopper/Katton), a Minecraft Fabric mod that brings Kotlin scripting support to script packs. It serves as a comprehensive template to help you start creating your own Katton-based script packs, demonstrating the essential file structure and setup.

## Example Script

The project includes a sample script showcasing the base API provided by Katton. In `main.main.kts`, you'll find an implementation of an explosive bow that shoots TNT arrows.

**How to use:**

1. Get the custom bow using this command:
   `/give @s bow[custom_data={tnt:true}]`
2. Try modifying the script: Change the explosion power (the fifth argument of the `explode` method).
3. Run the `/reload` command in-game to apply your changes instantly.

## Dependencies Setup

While this project uses Gradle for structure, **Kotlin script dependencies are not managed by Gradle**. instead, you need to manually manage them to enable IDE support (code completion and error checking).

### How to configure dependencies for IDE support:

1. Place the required `.jar` files into the `libs` folder.
2. Declare them in your script files using the `@file:DependsOn` annotation.

**Base dependencies required:**

- **Minecraft jar**: Locate it in your Minecraft installation directory (`versions/<version>/<version>.jar`). Copy it to `libs`.

You can add other mod jars to `libs` and declare them in your script to access their APIs. Just remember to keep these jars updated alongside your game and mods.

> [!TIP]
> Some mods (like **fabric-api**) distribute multiple jars nested inside a single file. IDEs cannot read jars within jars. **You must extract these inner jar files** and place them individually into the `libs` folder.

## Signing Client-Synced Packs

Katton supports signing script packs that are downloaded by clients. Signing is optional for local development, but recommended for multiplayer packs with `"clientSync": true`.

Generate a signing key once:

```powershell
.\gradlew.bat :fabric:generateKattonSigningKey "-PkattonPrivateKey=build\katton-signing-key.pem" "-PkattonPublicKey=build\katton-signing-key.pub"
```

Sign the pack after editing scripts:

```powershell
.\gradlew.bat :fabric:signKattonPack "-PkattonPackDir=world_scripts" "-PkattonPrivateKey=build\katton-signing-key.pem" "-PkattonPublicKey=build\katton-signing-key.pub" "-PkattonScope=world" "-PkattonKeyId=my-server-key"
```

Or sign and distribute in one step:

```powershell
.\gradlew.bat :fabric:signAndCopyWorldScripts
```

`signAndCopyWorldScripts` signs `world_scripts/manifest.json` first, then mirrors the signed pack to the configured target path. Use `signAndCopyGameScripts` when you want to sign world scripts and then run the full world/global copy flow.

The task updates `manifest.json` with a `signature` block. Clients verify signed packs before caching or running them. Keep the private key secret and do not commit it.
