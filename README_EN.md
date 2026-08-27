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

## Version support

This repository currently builds only **Minecraft 1.21.11**.
Building requires Java 21, Fabric Loader 0.19.3 and Fabric API 0.141.6+1.21.11.
See `arsa-design.md` for the detailed design and acceptance checklist.

## Building

```powershell
.\gradlew.bat build
```

Build artifacts are written to `releases/<version>/` (currently `releases/1.3.0/`):

- `arsa-1.3.0.jar` — the only file you need to install in the game's `mods` directory
- `arsa-1.3.0-sources.jar` — the source archive
- `SHA256SUMS.txt` — checksums

## Manual release process

For every release, run these steps by hand; artifacts always go into `releases/<version>/`:

1. Bump `version` in `gradle.properties` when releasing a new version.
2. Clean and rebuild:

   ```powershell
   .\gradlew.bat clean build
   ```

   Both JARs are produced in `releases\<version>\`.
3. Generate the checksums (PowerShell):

   ```powershell
   $v = (Select-String -Path gradle.properties -Pattern '^version=').Line.Split('=')[1]
   Get-ChildItem "releases\$v\*.jar" | ForEach-Object {
       "{0}  {1}" -f (Get-FileHash $_.FullName -Algorithm SHA256).Hash.ToLower(), $_.Name
   } | Set-Content -Path "releases\$v\SHA256SUMS.txt" -Encoding ascii
   ```

4. Only deliver or publish after `.\gradlew.bat build` passes and the JARs plus
   `SHA256SUMS.txt` are present in `releases\<version>\`. Distribute only
   `arsa-<version>.jar` to players.
5. Before publishing, walk through the acceptance checklist in the appendix of
   `arsa-design.md` in a real client and keep screenshots as evidence.

Keep only the latest release in `releases/`; historical artifacts should come
from GitHub Releases / CI artifacts instead of being committed back to the repo.

## License

Arsa is licensed under the [Apache License 2.0](LICENSE).
