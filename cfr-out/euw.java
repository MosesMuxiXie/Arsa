/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;

public final class euw
extends Record {
    private final euj b;
    private final euj c;
    private final euj d;
    private final euj e;
    private final euj f;
    private final euj g;
    private final euj h;
    private final euj i;
    private final euj j;
    private final euj k;
    private final euj l;
    private final euj m;
    private final euj n;
    private final euj o;
    private final euj p;
    public static final Codec<euw> a = RecordCodecBuilder.create($$0 -> $$0.group(euw.a("barrier", euw::a), euw.a("fluid_level_floodedness", euw::b), euw.a("fluid_level_spread", euw::c), euw.a("lava", euw::d), euw.a("temperature", euw::e), euw.a("vegetation", euw::f), euw.a("continents", euw::g), euw.a("erosion", euw::h), euw.a("depth", euw::i), euw.a("ridges", euw::j), euw.a("preliminary_surface_level", euw::k), euw.a("final_density", euw::l), euw.a("vein_toggle", euw::m), euw.a("vein_ridged", euw::n), euw.a("vein_gap", euw::o)).apply((Applicative)$$0, euw::new));

    public euw(euj $$0, euj $$1, euj $$2, euj $$3, euj $$4, euj $$5, euj $$6, euj $$7, euj $$8, euj $$9, euj $$10, euj $$11, euj $$12, euj $$13, euj $$14) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
        this.k = $$9;
        this.l = $$10;
        this.m = $$11;
        this.n = $$12;
        this.o = $$13;
        this.p = $$14;
    }

    private static RecordCodecBuilder<euw, euj> a(String $$0, Function<euw, euj> $$1) {
        return euj.e.fieldOf($$0).forGetter($$1);
    }

    public euw a(euj.f $$0) {
        return new euw(this.b.a($$0), this.c.a($$0), this.d.a($$0), this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h.a($$0), this.i.a($$0), this.j.a($$0), this.k.a($$0), this.l.a($$0), this.m.a($$0), this.n.a($$0), this.o.a($$0), this.p.a($$0));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{euw.class, "barrierNoise;fluidLevelFloodednessNoise;fluidLevelSpreadNoise;lavaNoise;temperature;vegetation;continents;erosion;depth;ridges;preliminarySurfaceLevel;finalDensity;veinToggle;veinRidged;veinGap", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{euw.class, "barrierNoise;fluidLevelFloodednessNoise;fluidLevelSpreadNoise;lavaNoise;temperature;vegetation;continents;erosion;depth;ridges;preliminarySurfaceLevel;finalDensity;veinToggle;veinRidged;veinGap", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{euw.class, "barrierNoise;fluidLevelFloodednessNoise;fluidLevelSpreadNoise;lavaNoise;temperature;vegetation;continents;erosion;depth;ridges;preliminarySurfaceLevel;finalDensity;veinToggle;veinRidged;veinGap", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"}, this, $$0);
    }

    public euj a() {
        return this.b;
    }

    public euj b() {
        return this.c;
    }

    public euj c() {
        return this.d;
    }

    public euj d() {
        return this.e;
    }

    public euj e() {
        return this.f;
    }

    public euj f() {
        return this.g;
    }

    public euj g() {
        return this.h;
    }

    public euj h() {
        return this.i;
    }

    public euj i() {
        return this.j;
    }

    public euj j() {
        return this.k;
    }

    public euj k() {
        return this.l;
    }

    public euj l() {
        return this.m;
    }

    public euj m() {
        return this.n;
    }

    public euj n() {
        return this.o;
    }

    public euj o() {
        return this.p;
    }
}

