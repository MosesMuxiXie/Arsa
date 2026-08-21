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

public class bje
extends bow {
    public bje(Schema $$0, String $$1) {
        super($$0, false, "BlockEntityFurnaceBurnTimeFix" + $$1, bqh.w, $$1);
    }

    public Dynamic<?> a(Dynamic<?> $$0) {
        $$0 = $$0.renameField("CookTime", "cooking_time_spent");
        $$0 = $$0.renameField("CookTimeTotal", "cooking_total_time");
        $$0 = $$0.renameField("BurnTime", "lit_time_remaining");
        $$0 = $$0.setFieldIfPresent("lit_total_time", $$0.get("lit_time_remaining").result());
        return $$0;
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), this::a);
    }
}

