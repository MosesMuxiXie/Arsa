/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.doubles.Double2DoubleFunction
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.doubles.Double2DoubleFunction;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.slf4j.Logger;

public final class euk {
    private static final Codec<euj> c = mi.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
    protected static final double a = 1000000.0;
    static final Codec<Double> d = Codec.doubleRange((double)-1000000.0, (double)1000000.0);
    public static final Codec<euj> b = Codec.either(d, c).xmap($$0 -> (euj)$$0.map(euk::a, Function.identity()), $$0 -> {
        if ($$0 instanceof h) {
            h $$1 = (h)$$0;
            return Either.left((Object)$$1.k());
        }
        return Either.right((Object)$$0);
    });

    public static MapCodec<? extends euj> a(jq<MapCodec<? extends euj>> $$0) {
        euk.a($$0, "blend_alpha", euk$d.b);
        euk.a($$0, "blend_offset", f.b);
        euk.a($$0, "beardifier", euk$b.f);
        euk.a($$0, "old_blended_noise", fkb.a);
        for (m.a a2 : m.a.values()) {
            euk.a($$0, a2.c(), a2.g);
        }
        euk.a($$0, "noise", p.b);
        euk.a($$0, "end_islands", i.a);
        euk.a($$0, "weird_scaled_sampler", aa.a);
        euk.a($$0, "shifted_noise", w.a);
        euk.a($$0, "range_choice", r.b);
        euk.a($$0, "shift_a", t.b);
        euk.a($$0, "shift_b", u.b);
        euk.a($$0, "shift", s.b);
        euk.a($$0, "blend_density", e.b);
        euk.a($$0, "clamp", g.a);
        for (Enum enum_ : l.a.values()) {
            euk.a($$0, ((l.a)enum_).c(), ((l.a)enum_).i);
        }
        for (Enum enum_ : z.a.values()) {
            euk.a($$0, ((z.a)enum_).c(), ((z.a)enum_).e);
        }
        euk.a($$0, "spline", x.a);
        euk.a($$0, "constant", h.b);
        euk.a($$0, "y_clamped_gradient", ab.a);
        return euk.a($$0, "find_top_surface", j.a);
    }

    private static MapCodec<? extends euj> a(jq<MapCodec<? extends euj>> $$0, String $$1, bga<? extends euj> $$2) {
        return jq.a($$0, $$1, $$2.a());
    }

    static <A, O> bga<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
        return bga.a($$0.fieldOf("argument").xmap($$1, $$2));
    }

    static <O> bga<O> a(Function<euj, O> $$0, Function<O, euj> $$1) {
        return euk.a(euj.e, $$0, $$1);
    }

    static <O> bga<O> a(BiFunction<euj, euj, O> $$0, Function<O, euj> $$1, Function<O, euj> $$2) {
        return bga.a(RecordCodecBuilder.mapCodec($$3 -> $$3.group((App)euj.e.fieldOf("argument1").forGetter($$1), (App)euj.e.fieldOf("argument2").forGetter($$2)).apply((Applicative)$$3, $$0)));
    }

    static <O> bga<O> a(MapCodec<O> $$0) {
        return bga.a($$0);
    }

    private euk() {
    }

    public static euj a(euj $$0) {
        return new m(m.a.a, $$0);
    }

    public static euj b(euj $$0) {
        return new m(m.a.b, $$0);
    }

    public static euj c(euj $$0) {
        return new m(m.a.c, $$0);
    }

    public static euj d(euj $$0) {
        return new m(m.a.d, $$0);
    }

    public static euj e(euj $$0) {
        return new m(m.a.e, $$0);
    }

    public static euj a(jd<fke.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
        return euk.a((euj)new p(new euj.c($$0), $$1, $$2), $$3, $$4);
    }

    public static euj a(jd<fke.a> $$0, double $$1, double $$2, double $$3) {
        return euk.a($$0, 1.0, $$1, $$2, $$3);
    }

    public static euj a(jd<fke.a> $$0, double $$1, double $$2) {
        return euk.a($$0, 1.0, 1.0, $$1, $$2);
    }

    public static euj a(euj $$0, euj $$1, double $$2, jd<fke.a> $$3) {
        return new w($$0, euk.a(), $$1, $$2, 0.0, new euj.c($$3));
    }

    public static euj a(jd<fke.a> $$0) {
        return euk.b($$0, 1.0, 1.0);
    }

    public static euj b(jd<fke.a> $$0, double $$1, double $$2) {
        return new p(new euj.c($$0), $$1, $$2);
    }

    public static euj a(jd<fke.a> $$0, double $$1) {
        return euk.b($$0, 1.0, $$1);
    }

    public static euj a(euj $$0, double $$1, double $$2, euj $$3, euj $$4) {
        return new r($$0, $$1, $$2, $$3, $$4);
    }

    public static euj b(jd<fke.a> $$0) {
        return new t(new euj.c($$0));
    }

    public static euj c(jd<fke.a> $$0) {
        return new u(new euj.c($$0));
    }

    public static euj d(jd<fke.a> $$0) {
        return new s(new euj.c($$0));
    }

    public static euj f(euj $$0) {
        return new e($$0);
    }

    public static euj a(long $$0) {
        return new i($$0);
    }

    public static euj a(euj $$0, jd<fke.a> $$1, aa.a $$2) {
        return new aa($$0, new euj.c($$1), $$2);
    }

    public static euj a(euj $$0, euj $$1) {
        return z.a(z.a.a, $$0, $$1);
    }

    public static euj b(euj $$0, euj $$1) {
        return z.a(z.a.b, $$0, $$1);
    }

    public static euj c(euj $$0, euj $$1) {
        return z.a(z.a.c, $$0, $$1);
    }

    public static euj d(euj $$0, euj $$1) {
        return z.a(z.a.d, $$0, $$1);
    }

    public static euj a(bfe<x.b, x.a> $$0) {
        return new x($$0);
    }

    public static euj a() {
        return h.f;
    }

    public static euj a(double $$0) {
        return new h($$0);
    }

    public static euj a(int $$0, int $$1, double $$2, double $$3) {
        return new ab($$0, $$1, $$2, $$3);
    }

    public static euj a(euj $$0, l.a $$1) {
        return l.a($$1, $$0);
    }

    private static euj a(euj $$0, double $$1, double $$2) {
        double $$3 = ($$1 + $$2) * 0.5;
        double $$4 = ($$2 - $$1) * 0.5;
        return euk.a(euk.a($$3), euk.b(euk.a($$4), $$0));
    }

    public static euj b() {
        return euk$d.a;
    }

    public static euj c() {
        return f.a;
    }

    public static euj a(euj $$0, euj $$1, euj $$2) {
        if ($$1 instanceof h) {
            h $$3 = (h)$$1;
            return euk.a($$0, $$3.a, $$2);
        }
        euj $$4 = euk.d($$0);
        euj $$5 = euk.a(euk.b($$4, euk.a(-1.0)), euk.a(1.0));
        return euk.a(euk.b($$1, $$5), euk.b($$2, $$4));
    }

    public static euj a(euj $$0, double $$1, euj $$2) {
        return euk.a(euk.b($$0, euk.a($$2, euk.a(-$$1))), euk.a($$1));
    }

    public static euj a(euj $$0, euj $$1, int $$2, int $$3) {
        return new j($$0, $$1, $$2, $$3);
    }

    protected static final class d
    extends Enum<d>
    implements euj.d {
        public static final /* enum */ d a = new d();
        public static final bga<euj> b;
        private static final /* synthetic */ d[] f;

        public static d[] values() {
            return (d[])f.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        @Override
        public double a(euj.b $$0) {
            return 1.0;
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            Arrays.fill($$0, 1.0);
        }

        @Override
        public double a() {
            return 1.0;
        }

        @Override
        public double b() {
            return 1.0;
        }

        @Override
        public bga<? extends euj> c() {
            return b;
        }

        private static /* synthetic */ d[] k() {
            return new d[]{a};
        }

        static {
            f = euk$d.k();
            b = bga.a(MapCodec.unit((Object)a));
        }
    }

    protected static final class f
    extends Enum<f>
    implements euj.d {
        public static final /* enum */ f a = new f();
        public static final bga<euj> b;
        private static final /* synthetic */ f[] f;

        public static f[] values() {
            return (f[])f.clone();
        }

        public static f valueOf(String $$0) {
            return Enum.valueOf(f.class, $$0);
        }

        @Override
        public double a(euj.b $$0) {
            return 0.0;
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            Arrays.fill($$0, 0.0);
        }

        @Override
        public double a() {
            return 0.0;
        }

        @Override
        public double b() {
            return 0.0;
        }

        @Override
        public bga<? extends euj> c() {
            return b;
        }

        private static /* synthetic */ f[] k() {
            return new f[]{a};
        }

        static {
            f = euk$f.k();
            b = bga.a(MapCodec.unit((Object)a));
        }
    }

    protected static final class b
    extends Enum<b>
    implements c {
        public static final /* enum */ b a = new b();
        private static final /* synthetic */ b[] b;

        public static b[] values() {
            return (b[])b.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        @Override
        public double a(euj.b $$0) {
            return 0.0;
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            Arrays.fill($$0, 0.0);
        }

        @Override
        public double a() {
            return 0.0;
        }

        @Override
        public double b() {
            return 0.0;
        }

        private static /* synthetic */ b[] k() {
            return new b[]{a};
        }

        static {
            b = euk$b.k();
        }
    }

    protected record m(a a, euj b) implements n
    {
        private final a a;
        private final euj b;

        @Override
        public double a(euj.b $$0) {
            return this.b.a($$0);
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            this.b.a($$0, $$1);
        }

        @Override
        public double a() {
            return this.b.a();
        }

        @Override
        public double b() {
            return this.b.b();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{m.class, "type;wrapped", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{m.class, "type;wrapped", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{m.class, "type;wrapped", "a", "b"}, this, $$0);
        }

        @Override
        public a k() {
            return this.a;
        }

        @Override
        public euj l() {
            return this.b;
        }

        static final class a
        extends Enum<a>
        implements bhh {
            public static final /* enum */ a a = new a("interpolated");
            public static final /* enum */ a b = new a("flat_cache");
            public static final /* enum */ a c = new a("cache_2d");
            public static final /* enum */ a d = new a("cache_once");
            public static final /* enum */ a e = new a("cache_all_in_cell");
            private final String f;
            final bga<n> g = euk.a((euj $$0) -> new m(this, (euj)$$0), n::l);
            private static final /* synthetic */ a[] h;

            public static a[] values() {
                return (a[])h.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private a(String $$02) {
                this.f = $$02;
            }

            @Override
            public String c() {
                return this.f;
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b, c, d, e};
            }

            static {
                h = euk$m$a.a();
            }
        }
    }

    protected static final class p
    extends Record
    implements euj {
        private final euj.c f;
        @Deprecated
        private final double g;
        private final double h;
        public static final MapCodec<p> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)euj.c.a.fieldOf("noise").forGetter(p::k), (App)Codec.DOUBLE.fieldOf("xz_scale").forGetter(p::l), (App)Codec.DOUBLE.fieldOf("y_scale").forGetter(p::m)).apply((Applicative)$$0, p::new));
        public static final bga<p> b = euk.a(a);

        protected p(euj.c $$0, @Deprecated double $$1, double $$2) {
            this.f = $$0;
            this.g = $$1;
            this.h = $$2;
        }

        @Override
        public double a(euj.b $$0) {
            return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            $$1.a($$0, this);
        }

        @Override
        public euj a(euj.f $$0) {
            return $$0.apply(new p($$0.a(this.f), this.g, this.h));
        }

        @Override
        public double a() {
            return -this.b();
        }

        @Override
        public double b() {
            return this.f.a();
        }

        @Override
        public bga<? extends euj> c() {
            return b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{p.class, "noise;xzScale;yScale", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{p.class, "noise;xzScale;yScale", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{p.class, "noise;xzScale;yScale", "f", "g", "h"}, this, $$0);
        }

        public euj.c k() {
            return this.f;
        }

        @Deprecated
        public double l() {
            return this.g;
        }

        public double m() {
            return this.h;
        }
    }

    protected static final class i
    implements euj.d {
        public static final bga<i> a = bga.a(MapCodec.unit((Object)new i(0L)));
        private static final float b = -0.9f;
        private final fkh f;

        public i(long $$0) {
            eur $$1 = new eur($$0);
            $$1.b(17292);
            this.f = new fkh($$1);
        }

        private static float a(fkh $$0, int $$1, int $$2) {
            int $$3 = $$1 / 2;
            int $$4 = $$2 / 2;
            int $$5 = $$1 % 2;
            int $$6 = $$2 % 2;
            float $$7 = 100.0f - bgj.a((float)($$1 * $$1 + $$2 * $$2)) * 8.0f;
            $$7 = bgj.a($$7, -100.0f, 80.0f);
            for (int $$8 = -12; $$8 <= 12; ++$$8) {
                for (int $$9 = -12; $$9 <= 12; ++$$9) {
                    long $$10 = $$3 + $$8;
                    long $$11 = $$4 + $$9;
                    if ($$10 * $$10 + $$11 * $$11 <= 4096L || !($$0.a($$10, $$11) < (double)-0.9f)) continue;
                    float $$12 = (bgj.c($$10) * 3439.0f + bgj.c($$11) * 147.0f) % 13.0f + 9.0f;
                    float $$13 = $$5 - $$8 * 2;
                    float $$14 = $$6 - $$9 * 2;
                    float $$15 = 100.0f - bgj.a($$13 * $$13 + $$14 * $$14) * $$12;
                    $$15 = bgj.a($$15, -100.0f, 80.0f);
                    $$7 = Math.max($$7, $$15);
                }
            }
            return $$7;
        }

        @Override
        public double a(euj.b $$0) {
            return ((double)i.a(this.f, $$0.a() / 8, $$0.c() / 8) - 8.0) / 128.0;
        }

        @Override
        public double a() {
            return -0.84375;
        }

        @Override
        public double b() {
            return 0.5625;
        }

        @Override
        public bga<? extends euj> c() {
            return a;
        }
    }

    protected static final class aa
    extends Record
    implements y {
        private final euj b;
        private final euj.c f;
        private final a g;
        private static final MapCodec<aa> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)euj.e.fieldOf("input").forGetter(aa::k), (App)euj.c.a.fieldOf("noise").forGetter(aa::l), (App)a.c.fieldOf("rarity_value_mapper").forGetter(aa::m)).apply((Applicative)$$0, aa::new));
        public static final bga<aa> a = euk.a(h);

        protected aa(euj $$0, euj.c $$1, a $$2) {
            this.b = $$0;
            this.f = $$1;
            this.g = $$2;
        }

        @Override
        public double a(euj.b $$0, double $$1) {
            double $$2 = this.g.e.get($$1);
            return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
        }

        @Override
        public euj a(euj.f $$0) {
            return $$0.apply(new aa(this.b.a($$0), $$0.a(this.f), this.g));
        }

        @Override
        public double a() {
            return 0.0;
        }

        @Override
        public double b() {
            return this.g.f * this.f.a();
        }

        @Override
        public bga<? extends euj> c() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{aa.class, "input;noise;rarityValueMapper", "b", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aa.class, "input;noise;rarityValueMapper", "b", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aa.class, "input;noise;rarityValueMapper", "b", "f", "g"}, this, $$0);
        }

        @Override
        public euj k() {
            return this.b;
        }

        public euj.c l() {
            return this.f;
        }

        public a m() {
            return this.g;
        }

        public static final class a
        extends Enum<a>
        implements bhh {
            public static final /* enum */ a a = new a("type_1", eux.a::b, 2.0);
            public static final /* enum */ a b = new a("type_2", eux.a::a, 3.0);
            public static final Codec<a> c;
            private final String d;
            final Double2DoubleFunction e;
            final double f;
            private static final /* synthetic */ a[] g;

            public static a[] values() {
                return (a[])g.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private a(String $$0, Double2DoubleFunction $$1, double $$2) {
                this.d = $$0;
                this.e = $$1;
                this.f = $$2;
            }

            @Override
            public String c() {
                return this.d;
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b};
            }

            static {
                g = euk$aa$a.a();
                c = bhh.a(a::values);
            }
        }
    }

    protected static final class w
    extends Record
    implements euj {
        private final euj b;
        private final euj f;
        private final euj g;
        private final double h;
        private final double i;
        private final euj.c j;
        private static final MapCodec<w> k = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)euj.e.fieldOf("shift_x").forGetter(w::k), (App)euj.e.fieldOf("shift_y").forGetter(w::l), (App)euj.e.fieldOf("shift_z").forGetter(w::m), (App)Codec.DOUBLE.fieldOf("xz_scale").forGetter(w::n), (App)Codec.DOUBLE.fieldOf("y_scale").forGetter(w::o), (App)euj.c.a.fieldOf("noise").forGetter(w::p)).apply((Applicative)$$0, w::new));
        public static final bga<w> a = euk.a(k);

        protected w(euj $$0, euj $$1, euj $$2, double $$3, double $$4, euj.c $$5) {
            this.b = $$0;
            this.f = $$1;
            this.g = $$2;
            this.h = $$3;
            this.i = $$4;
            this.j = $$5;
        }

        @Override
        public double a(euj.b $$0) {
            double $$1 = (double)$$0.a() * this.h + this.b.a($$0);
            double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
            double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
            return this.j.a($$1, $$2, $$3);
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            $$1.a($$0, this);
        }

        @Override
        public euj a(euj.f $$0) {
            return $$0.apply(new w(this.b.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
        }

        @Override
        public double a() {
            return -this.b();
        }

        @Override
        public double b() {
            return this.j.a();
        }

        @Override
        public bga<? extends euj> c() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{w.class, "shiftX;shiftY;shiftZ;xzScale;yScale;noise", "b", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{w.class, "shiftX;shiftY;shiftZ;xzScale;yScale;noise", "b", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{w.class, "shiftX;shiftY;shiftZ;xzScale;yScale;noise", "b", "f", "g", "h", "i", "j"}, this, $$0);
        }

        public euj k() {
            return this.b;
        }

        public euj l() {
            return this.f;
        }

        public euj m() {
            return this.g;
        }

        public double n() {
            return this.h;
        }

        public double o() {
            return this.i;
        }

        public euj.c p() {
            return this.j;
        }
    }

    static final class r
    extends Record
    implements euj {
        private final euj f;
        private final double g;
        private final double h;
        private final euj i;
        private final euj j;
        public static final MapCodec<r> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)euj.e.fieldOf("input").forGetter(r::k), (App)d.fieldOf("min_inclusive").forGetter(r::l), (App)d.fieldOf("max_exclusive").forGetter(r::m), (App)euj.e.fieldOf("when_in_range").forGetter(r::n), (App)euj.e.fieldOf("when_out_of_range").forGetter(r::o)).apply((Applicative)$$0, r::new));
        public static final bga<r> b = euk.a(a);

        r(euj $$0, double $$1, double $$2, euj $$3, euj $$4) {
            this.f = $$0;
            this.g = $$1;
            this.h = $$2;
            this.i = $$3;
            this.j = $$4;
        }

        @Override
        public double a(euj.b $$0) {
            double $$1 = this.f.a($$0);
            if ($$1 >= this.g && $$1 < this.h) {
                return this.i.a($$0);
            }
            return this.j.a($$0);
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            this.f.a($$0, $$1);
            for (int $$2 = 0; $$2 < $$0.length; ++$$2) {
                double $$3 = $$0[$$2];
                $$0[$$2] = $$3 >= this.g && $$3 < this.h ? this.i.a($$1.a($$2)) : this.j.a($$1.a($$2));
            }
        }

        @Override
        public euj a(euj.f $$0) {
            return $$0.apply(new r(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
        }

        @Override
        public double a() {
            return Math.min(this.i.a(), this.j.a());
        }

        @Override
        public double b() {
            return Math.max(this.i.b(), this.j.b());
        }

        @Override
        public bga<? extends euj> c() {
            return b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{r.class, "input;minInclusive;maxExclusive;whenInRange;whenOutOfRange", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{r.class, "input;minInclusive;maxExclusive;whenInRange;whenOutOfRange", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{r.class, "input;minInclusive;maxExclusive;whenInRange;whenOutOfRange", "f", "g", "h", "i", "j"}, this, $$0);
        }

        public euj k() {
            return this.f;
        }

        public double l() {
            return this.g;
        }

        public double m() {
            return this.h;
        }

        public euj n() {
            return this.i;
        }

        public euj o() {
            return this.j;
        }
    }

    protected static final class t
    extends Record
    implements v {
        private final euj.c a;
        static final bga<t> b = euk.a(euj.c.a, t::new, t::k);

        protected t(euj.c $$0) {
            this.a = $$0;
        }

        @Override
        public double a(euj.b $$0) {
            return this.a($$0.a(), 0.0, $$0.c());
        }

        @Override
        public euj a(euj.f $$0) {
            return $$0.apply(new t($$0.a(this.a)));
        }

        @Override
        public bga<? extends euj> c() {
            return b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{t.class, "offsetNoise", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{t.class, "offsetNoise", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{t.class, "offsetNoise", "a"}, this, $$0);
        }

        @Override
        public euj.c k() {
            return this.a;
        }
    }

    protected static final class u
    extends Record
    implements v {
        private final euj.c a;
        static final bga<u> b = euk.a(euj.c.a, u::new, u::k);

        protected u(euj.c $$0) {
            this.a = $$0;
        }

        @Override
        public double a(euj.b $$0) {
            return this.a($$0.c(), $$0.a(), 0.0);
        }

        @Override
        public euj a(euj.f $$0) {
            return $$0.apply(new u($$0.a(this.a)));
        }

        @Override
        public bga<? extends euj> c() {
            return b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{u.class, "offsetNoise", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{u.class, "offsetNoise", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{u.class, "offsetNoise", "a"}, this, $$0);
        }

        @Override
        public euj.c k() {
            return this.a;
        }
    }

    protected static final class s
    extends Record
    implements v {
        private final euj.c a;
        static final bga<s> b = euk.a(euj.c.a, s::new, s::k);

        protected s(euj.c $$0) {
            this.a = $$0;
        }

        @Override
        public double a(euj.b $$0) {
            return this.a($$0.a(), $$0.b(), $$0.c());
        }

        @Override
        public euj a(euj.f $$0) {
            return $$0.apply(new s($$0.a(this.a)));
        }

        @Override
        public bga<? extends euj> c() {
            return b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{s.class, "offsetNoise", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{s.class, "offsetNoise", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{s.class, "offsetNoise", "a"}, this, $$0);
        }

        @Override
        public euj.c k() {
            return this.a;
        }
    }

    record e(euj a) implements y
    {
        private final euj a;
        static final bga<e> b = euk.a(e::new, e::k);

        @Override
        public double a(euj.b $$0, double $$1) {
            return $$0.d().a($$0, $$1);
        }

        @Override
        public euj a(euj.f $$0) {
            return $$0.apply(new e(this.a.a($$0)));
        }

        @Override
        public double a() {
            return Double.NEGATIVE_INFINITY;
        }

        @Override
        public double b() {
            return Double.POSITIVE_INFINITY;
        }

        @Override
        public bga<? extends euj> c() {
            return b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "input", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "input", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "input", "a"}, this, $$0);
        }

        @Override
        public euj k() {
            return this.a;
        }
    }

    protected static final class g
    extends Record
    implements q {
        private final euj b;
        private final double f;
        private final double g;
        private static final MapCodec<g> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)euj.c.fieldOf("input").forGetter(g::aG_), (App)d.fieldOf("min").forGetter(g::a), (App)d.fieldOf("max").forGetter(g::b)).apply((Applicative)$$0, g::new));
        public static final bga<g> a = euk.a(h);

        protected g(euj $$0, double $$1, double $$2) {
            this.b = $$0;
            this.f = $$1;
            this.g = $$2;
        }

        @Override
        public double a(double $$0) {
            return bgj.a($$0, this.f, this.g);
        }

        @Override
        public euj a(euj.f $$0) {
            return new g(this.b.a($$0), this.f, this.g);
        }

        @Override
        public bga<? extends euj> c() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{g.class, "input;minValue;maxValue", "b", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{g.class, "input;minValue;maxValue", "b", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{g.class, "input;minValue;maxValue", "b", "f", "g"}, this, $$0);
        }

        @Override
        public euj aG_() {
            return this.b;
        }

        @Override
        public double a() {
            return this.f;
        }

        @Override
        public double b() {
            return this.g;
        }
    }

    protected static final class l
    extends Record
    implements q {
        private final a a;
        private final euj b;
        private final double f;
        private final double g;

        protected l(a $$0, euj $$1, double $$2, double $$3) {
            this.a = $$0;
            this.b = $$1;
            this.f = $$2;
            this.g = $$3;
        }

        public static l a(a $$0, euj $$1) {
            double $$2 = $$1.a();
            double $$3 = $$1.b();
            double $$4 = l.a($$0, $$2);
            double $$5 = l.a($$0, $$3);
            if ($$0 == a.f) {
                if ($$2 < 0.0 && $$3 > 0.0) {
                    return new l($$0, $$1, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
                }
                return new l($$0, $$1, $$5, $$4);
            }
            if ($$0 == a.a || $$0 == a.b) {
                return new l($$0, $$1, Math.max(0.0, $$2), Math.max($$4, $$5));
            }
            return new l($$0, $$1, $$4, $$5);
        }

        private static double a(a $$0, double $$1) {
            return switch ($$0.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> Math.abs($$1);
                case 1 -> $$1 * $$1;
                case 2 -> $$1 * $$1 * $$1;
                case 3 -> {
                    if ($$1 > 0.0) {
                        yield $$1;
                    }
                    yield $$1 * 0.5;
                }
                case 4 -> {
                    if ($$1 > 0.0) {
                        yield $$1;
                    }
                    yield $$1 * 0.25;
                }
                case 5 -> 1.0 / $$1;
                case 6 -> {
                    double $$2 = bgj.a($$1, -1.0, 1.0);
                    yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
                }
            };
        }

        @Override
        public double a(double $$0) {
            return l.a(this.a, $$0);
        }

        public l b(euj.f $$0) {
            return l.a(this.a, this.b.a($$0));
        }

        @Override
        public bga<? extends euj> c() {
            return this.a.i;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{l.class, "type;input;minValue;maxValue", "a", "b", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{l.class, "type;input;minValue;maxValue", "a", "b", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{l.class, "type;input;minValue;maxValue", "a", "b", "f", "g"}, this, $$0);
        }

        public a l() {
            return this.a;
        }

        @Override
        public euj aG_() {
            return this.b;
        }

        @Override
        public double a() {
            return this.f;
        }

        @Override
        public double b() {
            return this.g;
        }

        @Override
        public /* synthetic */ euj a(euj.f f2) {
            return this.b(f2);
        }

        static final class a
        extends Enum<a>
        implements bhh {
            public static final /* enum */ a a = new a("abs");
            public static final /* enum */ a b = new a("square");
            public static final /* enum */ a c = new a("cube");
            public static final /* enum */ a d = new a("half_negative");
            public static final /* enum */ a e = new a("quarter_negative");
            public static final /* enum */ a f = new a("invert");
            public static final /* enum */ a g = new a("squeeze");
            private final String h;
            final bga<l> i = euk.a((euj $$0) -> l.a(this, $$0), l::aG_);
            private static final /* synthetic */ a[] j;

            public static a[] values() {
                return (a[])j.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private a(String $$02) {
                this.h = $$02;
            }

            @Override
            public String c() {
                return this.h;
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b, c, d, e, f, g};
            }

            static {
                j = euk$l$a.a();
            }
        }
    }

    static interface z
    extends euj {
        public static final Logger a = LogUtils.getLogger();

        public static z a(a $$0, euj $$1, euj $$2) {
            double $$10;
            double $$3 = $$1.a();
            double $$4 = $$2.a();
            double $$5 = $$1.b();
            double $$6 = $$2.b();
            if ($$0 == a.c || $$0 == a.d) {
                boolean $$8;
                boolean $$7 = $$3 >= $$6;
                boolean bl2 = $$8 = $$4 >= $$5;
                if ($$7 || $$8) {
                    a.warn("Creating a {} function between two non-overlapping inputs: {} and {}", new Object[]{$$0, $$1, $$2});
                }
            }
            double $$9 = switch ($$0.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> $$3 + $$4;
                case 3 -> Math.max($$3, $$4);
                case 2 -> Math.min($$3, $$4);
                case 1 -> $$3 > 0.0 && $$4 > 0.0 ? $$3 * $$4 : ($$5 < 0.0 && $$6 < 0.0 ? $$5 * $$6 : Math.min($$3 * $$6, $$5 * $$4));
            };
            switch ($$0.ordinal()) {
                default: {
                    throw new MatchException(null, null);
                }
                case 0: {
                    double d2 = $$5 + $$6;
                    break;
                }
                case 3: {
                    double d2 = Math.max($$5, $$6);
                    break;
                }
                case 2: {
                    double d2 = Math.min($$5, $$6);
                    break;
                }
                case 1: {
                    double d2 = $$3 > 0.0 && $$4 > 0.0 ? $$5 * $$6 : ($$10 = $$5 < 0.0 && $$6 < 0.0 ? $$3 * $$4 : Math.max($$3 * $$4, $$5 * $$6));
                }
            }
            if ($$0 == a.b || $$0 == a.a) {
                if ($$1 instanceof h) {
                    h $$11 = (h)$$1;
                    return new o($$0 == a.a ? o.a.b : o.a.a, $$2, $$9, $$10, $$11.a);
                }
                if ($$2 instanceof h) {
                    h $$12 = (h)$$2;
                    return new o($$0 == a.a ? o.a.b : o.a.a, $$1, $$9, $$10, $$12.a);
                }
            }
            return new euk$a($$0, $$1, $$2, $$9, $$10);
        }

        public a k();

        public euj l();

        public euj m();

        @Override
        default public bga<? extends euj> c() {
            return this.k().e;
        }

        public static final class a
        extends Enum<a>
        implements bhh {
            public static final /* enum */ a a = new a("add");
            public static final /* enum */ a b = new a("mul");
            public static final /* enum */ a c = new a("min");
            public static final /* enum */ a d = new a("max");
            final bga<z> e = euk.a(($$0, $$1) -> z.a(this, $$0, $$1), z::l, z::m);
            private final String f;
            private static final /* synthetic */ a[] g;

            public static a[] values() {
                return (a[])g.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private a(String $$02) {
                this.f = $$02;
            }

            @Override
            public String c() {
                return this.f;
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b, c, d};
            }

            static {
                g = euk$z$a.a();
            }
        }
    }

    public record x(bfe<b, a> b) implements euj
    {
        private final bfe<b, a> b;
        private static final Codec<bfe<b, a>> f = bfe.a(a.b);
        private static final MapCodec<x> g = f.fieldOf("spline").xmap(x::new, x::k);
        public static final bga<x> a = euk.a(g);

        @Override
        public double a(euj.b $$0) {
            return this.b.a(new b($$0));
        }

        @Override
        public double a() {
            return this.b.a();
        }

        @Override
        public double b() {
            return this.b.b();
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            $$1.a($$0, this);
        }

        @Override
        public euj a(euj.f $$0) {
            return $$0.apply(new x(this.b.a((I $$1) -> $$1.a($$0))));
        }

        @Override
        public bga<? extends euj> c() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{x.class, "spline", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{x.class, "spline", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{x.class, "spline", "b"}, this, $$0);
        }

        public bfe<b, a> k() {
            return this.b;
        }

        public record b(euj.b a) {
            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "context", "a"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "context", "a"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "context", "a"}, this, $$0);
            }
        }

        public record a(jd<euj> c) implements bes<b>
        {
            public static final Codec<a> b = euj.d.xmap(a::new, a::c);

            @Override
            public String toString() {
                Optional<amt<euj>> $$0 = this.c.e();
                if ($$0.isPresent()) {
                    amt<euj> $$1 = $$0.get();
                    if ($$1 == eux.e) {
                        return "continents";
                    }
                    if ($$1 == eux.f) {
                        return "erosion";
                    }
                    if ($$1 == eux.g) {
                        return "weirdness";
                    }
                    if ($$1 == eux.h) {
                        return "ridges";
                    }
                }
                return "Coordinate[" + String.valueOf(this.c) + "]";
            }

            @Override
            public float a(b $$0) {
                return (float)this.c.a().a($$0.a());
            }

            @Override
            public float a() {
                return this.c.b() ? (float)this.c.a().a() : Float.NEGATIVE_INFINITY;
            }

            @Override
            public float b() {
                return this.c.b() ? (float)this.c.a().b() : Float.POSITIVE_INFINITY;
            }

            public a a(euj.f $$0) {
                return new a(new jd.a<euj>(this.c.a().a($$0)));
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "function", "c"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "function", "c"}, this, $$0);
            }
        }
    }

    static final class h
    extends Record
    implements euj.d {
        final double a;
        static final bga<h> b = euk.a(d, h::new, h::k);
        static final h f = new h(0.0);

        h(double $$0) {
            this.a = $$0;
        }

        @Override
        public double a(euj.b $$0) {
            return this.a;
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            Arrays.fill($$0, this.a);
        }

        @Override
        public double a() {
            return this.a;
        }

        @Override
        public double b() {
            return this.a;
        }

        @Override
        public bga<? extends euj> c() {
            return b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{h.class, "value", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{h.class, "value", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{h.class, "value", "a"}, this, $$0);
        }

        public double k() {
            return this.a;
        }
    }

    static final class ab
    extends Record
    implements euj.d {
        private final int b;
        private final int f;
        private final double g;
        private final double h;
        private static final MapCodec<ab> i = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.intRange((int)(esh.e * 2), (int)(esh.d * 2)).fieldOf("from_y").forGetter(ab::k), (App)Codec.intRange((int)(esh.e * 2), (int)(esh.d * 2)).fieldOf("to_y").forGetter(ab::l), (App)d.fieldOf("from_value").forGetter(ab::m), (App)d.fieldOf("to_value").forGetter(ab::n)).apply((Applicative)$$0, ab::new));
        public static final bga<ab> a = euk.a(i);

        ab(int $$0, int $$1, double $$2, double $$3) {
            this.b = $$0;
            this.f = $$1;
            this.g = $$2;
            this.h = $$3;
        }

        @Override
        public double a(euj.b $$0) {
            return bgj.a((double)$$0.b(), (double)this.b, (double)this.f, this.g, this.h);
        }

        @Override
        public double a() {
            return Math.min(this.g, this.h);
        }

        @Override
        public double b() {
            return Math.max(this.g, this.h);
        }

        @Override
        public bga<? extends euj> c() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{ab.class, "fromY;toY;fromValue;toValue", "b", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ab.class, "fromY;toY;fromValue;toValue", "b", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ab.class, "fromY;toY;fromValue;toValue", "b", "f", "g", "h"}, this, $$0);
        }

        public int k() {
            return this.b;
        }

        public int l() {
            return this.f;
        }

        public double m() {
            return this.g;
        }

        public double n() {
            return this.h;
        }
    }

    static final class j
    extends Record
    implements euj {
        private final euj b;
        private final euj f;
        private final int g;
        private final int h;
        private static final MapCodec<j> i = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)euj.e.fieldOf("density").forGetter(j::k), (App)euj.e.fieldOf("upper_bound").forGetter(j::l), (App)Codec.intRange((int)(esh.e * 2), (int)(esh.d * 2)).fieldOf("lower_bound").forGetter(j::m), (App)bfm.r.fieldOf("cell_height").forGetter(j::n)).apply((Applicative)$$0, j::new));
        public static final bga<j> a = euk.a(i);

        j(euj $$0, euj $$1, int $$2, int $$3) {
            this.b = $$0;
            this.f = $$1;
            this.g = $$2;
            this.h = $$3;
        }

        @Override
        public double a(euj.b $$0) {
            int $$1 = bgj.c(this.f.a($$0) / (double)this.h) * this.h;
            if ($$1 <= this.g) {
                return this.g;
            }
            for (int $$2 = $$1; $$2 >= this.g; $$2 -= this.h) {
                euj.e e2 = new euj.e($$0.a(), $$2, $$0.c());
                if (!(this.b.a(e2) > 0.0)) continue;
                return $$2;
            }
            return this.g;
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            $$1.a($$0, this);
        }

        @Override
        public euj a(euj.f $$0) {
            return $$0.apply(new j(this.b.a($$0), this.f.a($$0), this.g, this.h));
        }

        @Override
        public double a() {
            return this.g;
        }

        @Override
        public double b() {
            return Math.max((double)this.g, this.f.b());
        }

        @Override
        public bga<? extends euj> c() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{j.class, "density;upperBound;lowerBound;cellHeight", "b", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{j.class, "density;upperBound;lowerBound;cellHeight", "b", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{j.class, "density;upperBound;lowerBound;cellHeight", "b", "f", "g", "h"}, this, $$0);
        }

        public euj k() {
            return this.b;
        }

        public euj l() {
            return this.f;
        }

        public int m() {
            return this.g;
        }

        public int n() {
            return this.h;
        }
    }

    static final class a
    extends Record
    implements z {
        private final z.a b;
        private final euj f;
        private final euj g;
        private final double h;
        private final double i;

        a(z.a $$0, euj $$1, euj $$2, double $$3, double $$4) {
            this.b = $$0;
            this.f = $$1;
            this.g = $$2;
            this.h = $$3;
            this.i = $$4;
        }

        @Override
        public double a(euj.b $$0) {
            double $$1 = this.f.a($$0);
            return switch (this.b.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> $$1 + this.g.a($$0);
                case 1 -> {
                    if ($$1 == 0.0) {
                        yield 0.0;
                    }
                    yield $$1 * this.g.a($$0);
                }
                case 2 -> {
                    if ($$1 < this.g.a()) {
                        yield $$1;
                    }
                    yield Math.min($$1, this.g.a($$0));
                }
                case 3 -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            };
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            this.f.a($$0, $$1);
            switch (this.b.ordinal()) {
                case 0: {
                    double[] $$2 = new double[$$0.length];
                    this.g.a($$2, $$1);
                    for (int $$3 = 0; $$3 < $$0.length; ++$$3) {
                        $$0[$$3] = $$0[$$3] + $$2[$$3];
                    }
                    break;
                }
                case 1: {
                    for (int $$4 = 0; $$4 < $$0.length; ++$$4) {
                        double $$5 = $$0[$$4];
                        $$0[$$4] = $$5 == 0.0 ? 0.0 : $$5 * this.g.a($$1.a($$4));
                    }
                    break;
                }
                case 2: {
                    double $$6 = this.g.a();
                    for (int $$7 = 0; $$7 < $$0.length; ++$$7) {
                        double $$8 = $$0[$$7];
                        $$0[$$7] = $$8 < $$6 ? $$8 : Math.min($$8, this.g.a($$1.a($$7)));
                    }
                    break;
                }
                case 3: {
                    double $$9 = this.g.b();
                    for (int $$10 = 0; $$10 < $$0.length; ++$$10) {
                        double $$11 = $$0[$$10];
                        $$0[$$10] = $$11 > $$9 ? $$11 : Math.max($$11, this.g.a($$1.a($$10)));
                    }
                    break;
                }
            }
        }

        @Override
        public euj a(euj.f $$0) {
            return $$0.apply(z.a(this.b, this.f.a($$0), this.g.a($$0)));
        }

        @Override
        public double a() {
            return this.h;
        }

        @Override
        public double b() {
            return this.i;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "type;argument1;argument2;minValue;maxValue", "b", "f", "g", "h", "i"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "type;argument1;argument2;minValue;maxValue", "b", "f", "g", "h", "i"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "type;argument1;argument2;minValue;maxValue", "b", "f", "g", "h", "i"}, this, $$0);
        }

        @Override
        public z.a k() {
            return this.b;
        }

        @Override
        public euj l() {
            return this.f;
        }

        @Override
        public euj m() {
            return this.g;
        }
    }

    static final class o
    extends Record
    implements q,
    z {
        private final a b;
        private final euj f;
        private final double g;
        private final double h;
        private final double i;

        o(a $$0, euj $$1, double $$2, double $$3, double $$4) {
            this.b = $$0;
            this.f = $$1;
            this.g = $$2;
            this.h = $$3;
            this.i = $$4;
        }

        @Override
        public z.a k() {
            return this.b == a.a ? z.a.b : z.a.a;
        }

        @Override
        public euj l() {
            return euk.a(this.i);
        }

        @Override
        public euj m() {
            return this.f;
        }

        @Override
        public double a(double $$0) {
            return switch (this.b.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> $$0 * this.i;
                case 1 -> $$0 + this.i;
            };
        }

        @Override
        public euj a(euj.f $$0) {
            double $$9;
            double $$8;
            euj $$1 = this.f.a($$0);
            double $$2 = $$1.a();
            double $$3 = $$1.b();
            if (this.b == a.b) {
                double $$4 = $$2 + this.i;
                double $$5 = $$3 + this.i;
            } else if (this.i >= 0.0) {
                double $$6 = $$2 * this.i;
                double $$7 = $$3 * this.i;
            } else {
                $$8 = $$3 * this.i;
                $$9 = $$2 * this.i;
            }
            return new o(this.b, $$1, $$8, $$9, this.i);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{o.class, "specificType;input;minValue;maxValue;argument", "b", "f", "g", "h", "i"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{o.class, "specificType;input;minValue;maxValue;argument", "b", "f", "g", "h", "i"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{o.class, "specificType;input;minValue;maxValue;argument", "b", "f", "g", "h", "i"}, this, $$0);
        }

        public a n() {
            return this.b;
        }

        @Override
        public euj aG_() {
            return this.f;
        }

        @Override
        public double a() {
            return this.g;
        }

        @Override
        public double b() {
            return this.h;
        }

        public double o() {
            return this.i;
        }

        static final class a
        extends Enum<a> {
            public static final /* enum */ a a = new a();
            public static final /* enum */ a b = new a();
            private static final /* synthetic */ a[] c;

            public static a[] values() {
                return (a[])c.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b};
            }

            static {
                c = euk$o$a.a();
            }
        }
    }

    static interface v
    extends euj {
        public euj.c k();

        @Override
        default public double a() {
            return -this.b();
        }

        @Override
        default public double b() {
            return this.k().a() * 4.0;
        }

        default public double a(double $$0, double $$1, double $$2) {
            return this.k().a($$0 * 0.25, $$1 * 0.25, $$2 * 0.25) * 4.0;
        }

        @Override
        default public void a(double[] $$0, euj.a $$1) {
            $$1.a($$0, this);
        }
    }

    public static interface n
    extends euj {
        public m.a k();

        public euj l();

        @Override
        default public bga<? extends euj> c() {
            return this.k().g;
        }

        @Override
        default public euj a(euj.f $$0) {
            return $$0.apply(new m(this.k(), this.l().a($$0)));
        }
    }

    @bht
    public record k(jd<euj> a) implements euj
    {
        private final jd<euj> a;

        @Override
        public double a(euj.b $$0) {
            return this.a.a().a($$0);
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            this.a.a().a($$0, $$1);
        }

        @Override
        public euj a(euj.f $$0) {
            return $$0.apply(new k(new jd.a<euj>(this.a.a().a($$0))));
        }

        @Override
        public double a() {
            return this.a.b() ? this.a.a().a() : Double.NEGATIVE_INFINITY;
        }

        @Override
        public double b() {
            return this.a.b() ? this.a.a().b() : Double.POSITIVE_INFINITY;
        }

        @Override
        public bga<? extends euj> c() {
            throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{k.class, "function", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{k.class, "function", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{k.class, "function", "a"}, this, $$0);
        }

        public jd<euj> k() {
            return this.a;
        }
    }

    public static interface c
    extends euj.d {
        public static final bga<euj> f = bga.a(MapCodec.unit((Object)euk$b.a));

        @Override
        default public bga<? extends euj> c() {
            return f;
        }
    }

    static interface q
    extends euj {
        public euj aG_();

        @Override
        default public double a(euj.b $$0) {
            return this.a(this.aG_().a($$0));
        }

        @Override
        default public void a(double[] $$0, euj.a $$1) {
            this.aG_().a($$0, $$1);
            for (int $$2 = 0; $$2 < $$0.length; ++$$2) {
                $$0[$$2] = this.a($$0[$$2]);
            }
        }

        public double a(double var1);
    }

    static interface y
    extends euj {
        public euj k();

        @Override
        default public double a(euj.b $$0) {
            return this.a($$0, this.k().a($$0));
        }

        @Override
        default public void a(double[] $$0, euj.a $$1) {
            this.k().a($$0, $$1);
            for (int $$2 = 0; $$2 < $$0.length; ++$$2) {
                $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
            }
        }

        public double a(euj.b var1, double var2);
    }
}

