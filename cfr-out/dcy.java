/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dcy
extends Record {
    private final jd<ddc> e;
    private final jd<dda> f;
    private final int g;
    public static final int a = 1;
    public static final int b = 5;
    private static final int[] h = new int[]{0, 10, 70, 150, 250};
    public static final Codec<dcy> c = RecordCodecBuilder.create($$02 -> $$02.group((App)mi.x.r().fieldOf("type").orElseGet(() -> mi.x.b(ddc.c)).forGetter($$0 -> $$0.e), (App)mi.y.r().fieldOf("profession").orElseGet(() -> mi.y.b(dda.b)).forGetter($$0 -> $$0.f), (App)Codec.INT.fieldOf("level").orElse((Object)1).forGetter($$0 -> $$0.g)).apply((Applicative)$$02, dcy::new));
    public static final aao<xq, dcy> d = aao.a(aam.b(mj.aM), dcy::a, aam.b(mj.aL), dcy::b, aam.h, dcy::c, dcy::new);

    public dcy(jd<ddc> $$0, jd<dda> $$1, int $$2) {
        $$2 = Math.max(1, $$2);
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    public dcy a(jd<ddc> $$0) {
        return new dcy($$0, this.f, this.g);
    }

    public dcy a(je.a $$0, amt<ddc> $$1) {
        return this.a($$0.d($$1));
    }

    public dcy b(jd<dda> $$0) {
        return new dcy(this.e, $$0, this.g);
    }

    public dcy b(je.a $$0, amt<dda> $$1) {
        return this.b($$0.d($$1));
    }

    public dcy a(int $$0) {
        return new dcy(this.e, this.f, $$0);
    }

    public static int b(int $$0) {
        return dcy.d($$0) ? h[$$0 - 1] : 0;
    }

    public static int c(int $$0) {
        return dcy.d($$0) ? h[$$0] : 0;
    }

    public static boolean d(int $$0) {
        return $$0 >= 1 && $$0 < 5;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dcy.class, "type;profession;level", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dcy.class, "type;profession;level", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dcy.class, "type;profession;level", "e", "f", "g"}, this, $$0);
    }

    public jd<ddc> a() {
        return this.e;
    }

    public jd<dda> b() {
        return this.f;
    }

    public int c() {
        return this.g;
    }
}

