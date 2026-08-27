# Arsa

[中文](README.md) | **English**

Arsa is a Fabric mod for Minecraft. It turns enchanted books into
copyable, single-use enchantment templates, then applies all enchantments on a
template to a target item through the smithing table.

## Usage

- Create: place an enchanted book in the anvil's left slot and at least nine
  emerald blocks in the right slot. Creating a template always costs 10 levels
  and consumes exactly nine emerald blocks. Enchantment types, levels, count,
  and the book's prior-work penalty do not affect the price. The result is
  normalized to 10 levels during refresh, pickup validation, and pickup, and it
  never inherits a prior-work penalty.
- Rename: place an enchantment template by itself in the anvil's left slot.
  Renaming always costs one level, never adds a prior-work penalty, and cannot
  be combined with an item in the right slot.
- Copy: place a book in the top-center crafting slot, an enchantment template in
  the center, and emeralds in the other seven slots. The recipe produces two
  identical templates.
- Apply: place the enchantment template in the smithing template slot and the
  target item in the base slot. Leave the addition slot empty.

After you obtain your first enchantment template, the copy recipe unlocks in
the Miscellaneous category of the crafting recipe book and supports automatic
recipe placement.

## Warning

This mod only supports versions after 1.18, and after 2026/9 only updates mods after 1.20.

## Building

```powershell
.\gradlew.bat build
```

The distributable mod and source archive are always written to `dist` as
`arsa-1.3.0.jar` and `arsa-1.3.0-sources.jar`. Install only the former in the
game's `mods` directory.
All version-specific runtime JARs from Minecraft 1.20 through the latest stable
release are collected in `dist/1.3.0`.

Building requires Java 21. Running the mod requires Fabric Loader 0.19.3 and
Fabric API 0.141.6+1.21.11. See `arsa-design.md` for the detailed design and
acceptance checklist.

## License

Arsa is licensed under the [Apache License 2.0](LICENSE).
