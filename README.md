# Greninja Shopper

Fabric 1.21.1 addon project that registers one custom entity:

```text
greninja_shopper:greninja_shopper
```

The goal is to let Easy NPC / Doppler detect this entity as a custom model option.

## Requirements

- Minecraft 1.21.1
- Fabric Loader 0.16+
- Fabric API
- GeckoLib for Fabric 1.21.1, 4.7+
- Easy NPC 6.12.0+

## Build

Open this folder in IntelliJ IDEA, or run:

```bash
./gradlew build
```

The jar will be in:

```text
build/libs/greninja_shopper-fabric-1.21.1-1.0.0.jar
```

## Test in game

After adding the built jar to both server and client, try:

```mcfunction
/summon greninja_shopper:greninja_shopper ~ ~ ~
```

For Easy NPC / Doppler, select the entity in the Custom model screen, or try:

```mcfunction
/easy_npc render set entity <NPC> "greninja_shopper:greninja_shopper"
```

If it does not appear in the list, add this to Easy NPC's generated config and restart:

```properties
greninja_shopper:greninja_shopper=true
```

Usually the file is:

```text
config/easy_npc/render_entity_type_support.cfg
```

## Note

This uses the uploaded Greninja Bedrock `.geo.json` model and texture. It is made as a GeckoLib entity because Easy NPC's Doppler custom model screen detects registered entity types, not raw Blockbench files.
