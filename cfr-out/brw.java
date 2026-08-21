/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class brw
extends bow {
    public brw(Schema $$0, boolean $$1) {
        super($$0, $$1, "WeaponSmithChestLootTableFix", bqh.w, "minecraft:chest");
    }

    @Override
    protected Typed<?> a(Typed<?> $$02) {
        return $$02.update(DSL.remainderFinder(), $$0 -> {
            String $$1 = $$0.get("LootTable").asString("");
            return $$1.equals("minecraft:chests/village_blacksmith") ? $$0.set("LootTable", $$0.createString("minecraft:chests/village/village_weaponsmith")) : $$0;
        });
    }
}

