/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dsi
extends Record
implements dry {
    private final dse f;
    private final dse g;
    private final dse h;
    public static final MapCodec<dsi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dse.a.fieldOf("input").forGetter(dsi::b), (App)dse.a.fieldOf("result").forGetter(dsi::d), (App)dse.a.fieldOf("crafting_station").forGetter(dsi::e)).apply((Applicative)$$0, dsi::new));
    public static final aao<xq, dsi> b = aao.a(dse.b, dsi::b, dse.b, dsi::d, dse.b, dsi::e, dsi::new);
    public static final dry.a<dsi> c = new dry.a<dsi>(a, b);

    public dsi(dse $$0, dse $$1, dse $$2) {
        this.f = $$0;
        this.g = $$1;
        this.h = $$2;
    }

    public dry.a<dsi> a() {
        return c;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dsi.class, "input;result;craftingStation", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dsi.class, "input;result;craftingStation", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dsi.class, "input;result;craftingStation", "f", "g", "h"}, this, $$0);
    }

    public dse b() {
        return this.f;
    }

    @Override
    public dse d() {
        return this.g;
    }

    @Override
    public dse e() {
        return this.h;
    }
}

