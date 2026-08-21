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

public class bjh
extends bow {
    public bjh(Schema $$0, boolean $$1) {
        super($$0, $$1, "BlockEntityKeepPacked", bqh.w, "DUMMY");
    }

    private static Dynamic<?> a(Dynamic<?> $$0) {
        return $$0.set("keepPacked", $$0.createBoolean(true));
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), bjh::a);
    }
}

