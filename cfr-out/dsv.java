/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public interface dsv {
    public static final Codec<dsv> a = mi.as.q().dispatch(dsv::a, $$0 -> $$0);
    public static final Codec<dsv> b = Codec.either(dsv$b.c, a).xmap($$02 -> (dsv)$$02.map($$0 -> $$0, $$0 -> $$0), $$0 -> {
        Either either;
        if ($$0 instanceof b) {
            b $$1 = (b)$$0;
            either = Either.left((Object)$$1);
        } else {
            either = Either.right((Object)$$0);
        }
        return either;
    });

    public static MapCodec<? extends dsv> a(jq<MapCodec<? extends dsv>> $$0) {
        jq.a($$0, "clamped", dsv$a.c);
        jq.a($$0, "fraction", d.c);
        jq.a($$0, "levels_squared", e.c);
        jq.a($$0, "linear", f.c);
        jq.a($$0, "exponent", c.c);
        return jq.a($$0, "lookup", g.c);
    }

    public static b a(float $$0) {
        return new b($$0);
    }

    public static f a(float $$0, float $$1) {
        return new f($$0, $$1);
    }

    public static f b(float $$0) {
        return dsv.a($$0, $$0);
    }

    public static g a(List<Float> $$0, dsv $$1) {
        return new g($$0, $$1);
    }

    public float a(int var1);

    public MapCodec<? extends dsv> a();

    public static final class a
    extends Record
    implements dsv {
        private final dsv d;
        private final float e;
        private final float f;
        public static final MapCodec<a> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)b.fieldOf("value").forGetter(a::b), (App)Codec.FLOAT.fieldOf("min").forGetter(a::c), (App)Codec.FLOAT.fieldOf("max").forGetter(a::d)).apply((Applicative)$$0, a::new)).validate($$0 -> {
            if ($$0.f <= $$0.e) {
                return DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f);
            }
            return DataResult.success((Object)$$0);
        });

        public a(dsv $$0, float $$1, float $$2) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
        }

        @Override
        public float a(int $$0) {
            return bgj.a(this.d.a($$0), this.e, this.f);
        }

        public MapCodec<a> a() {
            return c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "value;min;max", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "value;min;max", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "value;min;max", "d", "e", "f"}, this, $$0);
        }

        public dsv b() {
            return this.d;
        }

        public float c() {
            return this.e;
        }

        public float d() {
            return this.f;
        }
    }

    public static final class d
    extends Record
    implements dsv {
        private final dsv d;
        private final dsv e;
        public static final MapCodec<d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)b.fieldOf("numerator").forGetter(d::b), (App)b.fieldOf("denominator").forGetter(d::c)).apply((Applicative)$$0, d::new));

        public d(dsv $$0, dsv $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        @Override
        public float a(int $$0) {
            float $$1 = this.e.a($$0);
            if ($$1 == 0.0f) {
                return 0.0f;
            }
            return this.d.a($$0) / $$1;
        }

        public MapCodec<d> a() {
            return c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "numerator;denominator", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "numerator;denominator", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "numerator;denominator", "d", "e"}, this, $$0);
        }

        public dsv b() {
            return this.d;
        }

        public dsv c() {
            return this.e;
        }
    }

    public static final class e
    extends Record
    implements dsv {
        private final float d;
        public static final MapCodec<e> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.FLOAT.fieldOf("added").forGetter(e::b)).apply((Applicative)$$0, e::new));

        public e(float $$0) {
            this.d = $$0;
        }

        @Override
        public float a(int $$0) {
            return (float)bgj.i($$0) + this.d;
        }

        public MapCodec<e> a() {
            return c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "added", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "added", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "added", "d"}, this, $$0);
        }

        public float b() {
            return this.d;
        }
    }

    public static final class f
    extends Record
    implements dsv {
        private final float d;
        private final float e;
        public static final MapCodec<f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.FLOAT.fieldOf("base").forGetter(f::b), (App)Codec.FLOAT.fieldOf("per_level_above_first").forGetter(f::c)).apply((Applicative)$$0, f::new));

        public f(float $$0, float $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        @Override
        public float a(int $$0) {
            return this.d + this.e * (float)($$0 - 1);
        }

        public MapCodec<f> a() {
            return c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "base;perLevelAboveFirst", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "base;perLevelAboveFirst", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "base;perLevelAboveFirst", "d", "e"}, this, $$0);
        }

        public float b() {
            return this.d;
        }

        public float c() {
            return this.e;
        }
    }

    public static final class c
    extends Record
    implements dsv {
        private final dsv d;
        private final dsv e;
        public static final MapCodec<c> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)b.fieldOf("base").forGetter(c::b), (App)b.fieldOf("power").forGetter(c::c)).apply((Applicative)$$0, c::new));

        public c(dsv $$0, dsv $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        @Override
        public float a(int $$0) {
            return (float)Math.pow(this.d.a($$0), this.e.a($$0));
        }

        public MapCodec<c> a() {
            return c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "base;power", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "base;power", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "base;power", "d", "e"}, this, $$0);
        }

        public dsv b() {
            return this.d;
        }

        public dsv c() {
            return this.e;
        }
    }

    public static final class g
    extends Record
    implements dsv {
        private final List<Float> d;
        private final dsv e;
        public static final MapCodec<g> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.FLOAT.listOf().fieldOf("values").forGetter(g::b), (App)b.fieldOf("fallback").forGetter(g::c)).apply((Applicative)$$0, g::new));

        public g(List<Float> $$0, dsv $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        @Override
        public float a(int $$0) {
            return $$0 <= this.d.size() ? this.d.get($$0 - 1).floatValue() : this.e.a($$0);
        }

        public MapCodec<g> a() {
            return c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{g.class, "values;fallback", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{g.class, "values;fallback", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{g.class, "values;fallback", "d", "e"}, this, $$0);
        }

        public List<Float> b() {
            return this.d;
        }

        public dsv c() {
            return this.e;
        }
    }

    public static final class b
    extends Record
    implements dsv {
        private final float e;
        public static final Codec<b> c = Codec.FLOAT.xmap(b::new, b::b);
        public static final MapCodec<b> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.FLOAT.fieldOf("value").forGetter(b::b)).apply((Applicative)$$0, b::new));

        public b(float $$0) {
            this.e = $$0;
        }

        @Override
        public float a(int $$0) {
            return this.e;
        }

        public MapCodec<b> a() {
            return d;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "value", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "value", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "value", "e"}, this, $$0);
        }

        public float b() {
            return this.e;
        }
    }
}

