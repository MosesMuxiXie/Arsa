/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public interface bfj {
    public static final bfm.b<String, bfj> a = new bfm.b();
    public static final Codec<bfj> b = Codec.either(a.a((Codec<String>)Codec.STRING), bfj$a.I).xmap(Either::unwrap, $$0 -> {
        Either either;
        if ($$0 instanceof a) {
            a $$1 = (a)$$0;
            either = Either.right((Object)$$1);
        } else {
            either = Either.left((Object)$$0);
        }
        return either;
    });
    public static final bfj c = bfj.a("constant", $$0 -> 0.0f);
    public static final bfj d = bfj.a("linear", $$0 -> $$0);
    public static final bfj e = bfj.a("in_back", bfi::a);
    public static final bfj f = bfj.a("in_bounce", bfi::b);
    public static final bfj g = bfj.a("in_circ", bfi::C);
    public static final bfj h = bfj.a("in_cubic", bfi::c);
    public static final bfj i = bfj.a("in_elastic", bfi::d);
    public static final bfj j = bfj.a("in_expo", bfi::e);
    public static final bfj k = bfj.a("in_quad", bfi::z);
    public static final bfj l = bfj.a("in_quart", bfi::f);
    public static final bfj m = bfj.a("in_quint", bfi::g);
    public static final bfj n = bfj.a("in_sine", bfi::h);
    public static final bfj o = bfj.a("in_out_back", bfi::D);
    public static final bfj p = bfj.a("in_out_bounce", bfi::i);
    public static final bfj q = bfj.a("in_out_circ", bfi::j);
    public static final bfj r = bfj.a("in_out_cubic", bfi::k);
    public static final bfj s = bfj.a("in_out_elastic", bfi::B);
    public static final bfj t = bfj.a("in_out_expo", bfi::y);
    public static final bfj u = bfj.a("in_out_quad", bfi::l);
    public static final bfj v = bfj.a("in_out_quart", bfi::m);
    public static final bfj w = bfj.a("in_out_quint", bfi::n);
    public static final bfj x = bfj.a("in_out_sine", bfi::u);
    public static final bfj y = bfj.a("out_back", bfi::v);
    public static final bfj z = bfj.a("out_bounce", bfi::o);
    public static final bfj A = bfj.a("out_circ", bfi::A);
    public static final bfj B = bfj.a("out_cubic", bfi::x);
    public static final bfj C = bfj.a("out_elastic", bfi::p);
    public static final bfj D = bfj.a("out_expo", bfi::q);
    public static final bfj E = bfj.a("out_quad", bfi::r);
    public static final bfj F = bfj.a("out_quart", bfi::w);
    public static final bfj G = bfj.a("out_quint", bfi::s);
    public static final bfj H = bfj.a("out_sine", bfi::t);

    public static bfj a(String $$0, bfj $$1) {
        a.a($$0, $$1);
        return $$1;
    }

    public static bfj a(float $$0, float $$1, float $$2, float $$3) {
        return new a(new b($$0, $$1, $$2, $$3));
    }

    public static bfj a(float $$0, float $$1) {
        return bfj.a($$0, $$1, 1.0f - $$0, 1.0f - $$1);
    }

    public float apply(float var1);

    public static final class bfj$a
    implements bfj {
        public static final Codec<bfj$a> I = RecordCodecBuilder.create($$02 -> $$02.group((App)bfj$b.a.fieldOf("cubic_bezier").forGetter($$0 -> $$0.K)).apply((Applicative)$$02, bfj$a::new));
        private static final int J = 4;
        private final b K;
        private final a L;
        private final a M;

        public bfj$a(b $$0) {
            this.K = $$0;
            this.L = bfj$a.b($$0.b, $$0.d);
            this.M = bfj$a.b($$0.c, $$0.e);
        }

        private static a b(float $$0, float $$1) {
            return new a(3.0f * $$0 - 3.0f * $$1 + 1.0f, -6.0f * $$0 + 3.0f * $$1, 3.0f * $$0);
        }

        @Override
        public float apply(float $$0) {
            float $$3;
            float $$1 = $$0;
            for (int $$2 = 0; $$2 < 4 && !(($$3 = this.L.b($$1)) < 1.0E-5f); ++$$2) {
                float $$4 = this.L.a($$1) - $$0;
                $$1 -= $$4 / $$3;
            }
            return this.M.a($$1);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean equals(Object $$0) {
            if (!($$0 instanceof bfj$a)) return false;
            bfj$a $$1 = (bfj$a)$$0;
            if (!this.K.equals($$1.K)) return false;
            return true;
        }

        public int hashCode() {
            return this.K.hashCode();
        }

        public String toString() {
            return "CubicBezier(" + this.K.b + ", " + this.K.c + ", " + this.K.d + ", " + this.K.e + ")";
        }

        record a(float a, float b, float c) {
            public float a(float $$0) {
                return ((this.a * $$0 + this.b) * $$0 + this.c) * $$0;
            }

            public float b(float $$0) {
                return (3.0f * this.a * $$0 + 2.0f * this.b) * $$0 + this.c;
            }
        }
    }

    public static final class b
    extends Record {
        final float b;
        final float c;
        final float d;
        final float e;
        public static final Codec<b> a = Codec.FLOAT.listOf(4, 4).xmap($$0 -> new b(((Float)$$0.get(0)).floatValue(), ((Float)$$0.get(1)).floatValue(), ((Float)$$0.get(2)).floatValue(), ((Float)$$0.get(3)).floatValue()), $$0 -> List.of(Float.valueOf($$0.b), Float.valueOf($$0.c), Float.valueOf($$0.d), Float.valueOf($$0.e))).validate(b::e);

        public b(float $$0, float $$1, float $$2, float $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        private DataResult<b> e() {
            if (this.b < 0.0f || this.b > 1.0f) {
                return DataResult.error(() -> "x1 must be in range [0; 1]");
            }
            if (this.d < 0.0f || this.d > 1.0f) {
                return DataResult.error(() -> "x2 must be in range [0; 1]");
            }
            return DataResult.success((Object)this);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "x1;y1;x2;y2", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "x1;y1;x2;y2", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "x1;y1;x2;y2", "b", "c", "d", "e"}, this, $$0);
        }

        public float a() {
            return this.b;
        }

        public float b() {
            return this.c;
        }

        public float c() {
            return this.d;
        }

        public float d() {
            return this.e;
        }
    }
}

