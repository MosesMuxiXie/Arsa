/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Map;

public class bor
extends bow {
    public bor(Schema $$0, String $$1) {
        super($$0, false, "Memory expiry data fix (" + $$1 + ")", bqh.H, $$1);
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), this::a);
    }

    public Dynamic<?> a(Dynamic<?> $$0) {
        return $$0.update("Brain", this::b);
    }

    private Dynamic<?> b(Dynamic<?> $$0) {
        return $$0.update("memories", this::c);
    }

    private Dynamic<?> c(Dynamic<?> $$0) {
        return $$0.updateMapValues(this::a);
    }

    private Pair<Dynamic<?>, Dynamic<?>> a(Pair<Dynamic<?>, Dynamic<?>> $$0) {
        return $$0.mapSecond(this::d);
    }

    private Dynamic<?> d(Dynamic<?> $$0) {
        return $$0.createMap((Map)ImmutableMap.of((Object)$$0.createString("value"), $$0));
    }
}

