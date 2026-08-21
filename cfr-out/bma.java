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

public class bma
extends bow {
    public bma(Schema $$0) {
        super($$0, false, "EntitySalmonSizeFix", bqh.H, "minecraft:salmon");
    }

    @Override
    protected Typed<?> a(Typed<?> $$02) {
        return $$02.update(DSL.remainderFinder(), $$0 -> {
            String $$1 = $$0.get("type").asString("medium");
            if ($$1.equals("large")) {
                return $$0;
            }
            return $$0.set("type", $$0.createString("medium"));
        });
    }
}

