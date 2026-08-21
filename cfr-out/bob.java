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

public class bob
extends bow {
    public bob(Schema $$0, boolean $$1) {
        super($$0, $$1, "JigsawPropertiesFix", bqh.w, "minecraft:jigsaw");
    }

    private static Dynamic<?> a(Dynamic<?> $$0) {
        String $$1 = $$0.get("attachement_type").asString("minecraft:empty");
        String $$2 = $$0.get("target_pool").asString("minecraft:empty");
        return $$0.set("name", $$0.createString($$1)).set("target", $$0.createString($$1)).remove("attachement_type").set("pool", $$0.createString($$2)).remove("target_pool");
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), bob::a);
    }
}

