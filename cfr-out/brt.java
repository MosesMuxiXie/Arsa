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

public class brt
extends bow {
    private static final String c = "CanPickUpLoot";

    public brt(Schema $$0) {
        super($$0, true, "Villager CanPickUpLoot default value", bqh.H, "Villager");
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), brt::a);
    }

    private static Dynamic<?> a(Dynamic<?> $$0) {
        return $$0.set(c, $$0.createBoolean(true));
    }
}

