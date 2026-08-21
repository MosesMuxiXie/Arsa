# Arsa

[中文](README.md) | **English**

Arsa is a Fabric mod for Minecraft 1.21.5. It turns enchanted books into
copyable, single-use enchantment templates, then applies all enchantments on a
template to a target item through the smithing table.

## Usage

- Create: place an enchanted book in the anvil's left slot and at least nine
  emerald blocks in the right slot. Creating a template always costs 10 levels
  and consumes exactly nine emerald blocks. Enchantment types, levels, count,
  and the book's prior-work penalty do not affect the price. The result is
  normalized to 10 levels during refresh, pickup validation, and pickup, and it
  never inherits a prior-work penalty.
- Copy: place a book in the top-center crafting slot, an enchantment template in
  the center, and emeralds in the other seven slots. The recipe produces two
  identical templates.
- Apply: place the enchantment template in the smithing template slot and the
  target item in the base slot. Leave the addition slot empty.

After you obtain your first enchantment template, the copy recipe unlocks in
the Miscellaneous category of the crafting recipe book and supports automatic
recipe placement.

## Building

```powershell
.\gradlew.bat build
```

The distributable mod and source archive are always written to `dist` as
`arsa-1.1.0-mc1.21.5.jar` and `arsa-1.1.0-mc1.21.5-sources.jar`. Install only the former in the
game's `mods` directory.

Building requires Java 21. Running the mod requires Fabric Loader 0.19.3 and
Fabric API 0.128.2+1.21.5. See `arsa-design.md` for the detailed design and
acceptance checklist.

## License

Arsa is licensed under the [Apache License 2.0](LICENSE).
