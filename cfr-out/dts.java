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

public final class dts
extends Record
implements dtj {
    private final dsv c;
    private final dsv d;
    public static final MapCodec<dts> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dsv.b.fieldOf("base").forGetter(dts::b), (App)dsv.b.fieldOf("exponent").forGetter(dts::c)).apply((Applicative)$$0, dts::new));

    public dts(dsv $$0, dsv $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public float a(int $$0, bgr $$1, float $$2) {
        return (float)((double)$$2 * Math.pow(this.c.a($$0), this.d.a($$0)));
    }

    public MapCodec<dts> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dts.class, "base;exponent", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dts.class, "base;exponent", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dts.class, "base;exponent", "c", "d"}, this, $$0);
    }

    public dsv b() {
        return this.c;
    }

    public dsv c() {
        return this.d;
    }
}

