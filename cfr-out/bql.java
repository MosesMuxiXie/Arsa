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

public class bql
extends bow {
    public bql(Schema $$0, boolean $$1) {
        super($$0, $$1, "Remove Golem Gossip Fix", bqh.H, "minecraft:villager");
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), bql::a);
    }

    private static Dynamic<?> a(Dynamic<?> $$0) {
        return $$0.update("Gossips", $$1 -> $$0.createList($$1.asStream().filter($$0 -> !$$0.get("Type").asString("").equals("golem"))));
    }
}

