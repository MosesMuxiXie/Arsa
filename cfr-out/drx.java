/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class drx
extends Record
implements dry {
    private final dse f;
    private final dse g;
    private final dse h;
    private final dse i;
    private final int j;
    private final float k;
    public static final MapCodec<drx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dse.a.fieldOf("ingredient").forGetter(drx::b), (App)dse.a.fieldOf("fuel").forGetter(drx::c), (App)dse.a.fieldOf("result").forGetter(drx::d), (App)dse.a.fieldOf("crafting_station").forGetter(drx::e), (App)Codec.INT.fieldOf("duration").forGetter(drx::f), (App)Codec.FLOAT.fieldOf("experience").forGetter(drx::g)).apply((Applicative)$$0, drx::new));
    public static final aao<xq, drx> b = aao.a(dse.b, drx::b, dse.b, drx::c, dse.b, drx::d, dse.b, drx::e, aam.h, drx::f, aam.l, drx::g, drx::new);
    public static final dry.a<drx> c = new dry.a<drx>(a, b);

    public drx(dse $$0, dse $$1, dse $$2, dse $$3, int $$4, float $$5) {
        this.f = $$0;
        this.g = $$1;
        this.h = $$2;
        this.i = $$3;
        this.j = $$4;
        this.k = $$5;
    }

    public dry.a<drx> a() {
        return c;
    }

    @Override
    public boolean a(dgz $$0) {
        return this.f.a($$0) && this.c().a($$0) && dry.super.a($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{drx.class, "ingredient;fuel;result;craftingStation;duration;experience", "f", "g", "h", "i", "j", "k"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{drx.class, "ingredient;fuel;result;craftingStation;duration;experience", "f", "g", "h", "i", "j", "k"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{drx.class, "ingredient;fuel;result;craftingStation;duration;experience", "f", "g", "h", "i", "j", "k"}, this, $$0);
    }

    public dse b() {
        return this.f;
    }

    public dse c() {
        return this.g;
    }

    @Override
    public dse d() {
        return this.h;
    }

    @Override
    public dse e() {
        return this.i;
    }

    public int f() {
        return this.j;
    }

    public float g() {
        return this.k;
    }
}

