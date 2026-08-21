/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bld
extends bow {
    public bld(Schema $$0) {
        super($$0, false, "EntityBrushableBlockFieldsRenameFix", bqh.w, "minecraft:brushable_block");
    }

    public Dynamic<?> a(Dynamic<?> $$0) {
        return $$0.renameField("loot_table", "LootTable").renameField("loot_table_seed", "LootTableSeed");
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), this::a);
    }
}

