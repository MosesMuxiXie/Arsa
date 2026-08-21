/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public final class dxo {
    public static final Codec<dxo> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dxo$b.a.forGetter($$0 -> $$0.i), (App)cec.d.optionalFieldOf("attributes", (Object)cec.a).forGetter($$0 -> $$0.l), (App)dxu.a.fieldOf("effects").forGetter($$0 -> $$0.m), (App)dxp.b.forGetter($$0 -> $$0.j), (App)dya.c.forGetter($$0 -> $$0.k)).apply((Applicative)$$02, dxo::new));
    public static final Codec<dxo> b = RecordCodecBuilder.create($$02 -> $$02.group((App)dxo$b.a.forGetter($$0 -> $$0.i), (App)cec.c.optionalFieldOf("attributes", (Object)cec.a).forGetter($$0 -> $$0.l), (App)dxu.a.fieldOf("effects").forGetter($$0 -> $$0.m)).apply((Applicative)$$02, ($$0, $$1, $$2) -> new dxo((b)$$0, (cec)$$1, (dxu)$$2, dxp.a, dya.b)));
    public static final Codec<jd<dxo>> c = amq.a(mj.aS, a);
    public static final Codec<jh<dxo>> d = js.a(mj.aS, a);
    private static final fkg f = new fkg((bgr)new evp(new eur(1234L)), (List<Integer>)ImmutableList.of((Object)0));
    static final fkg g = new fkg((bgr)new evp(new eur(3456L)), (List<Integer>)ImmutableList.of((Object)-2, (Object)-1, (Object)0));
    @Deprecated(forRemoval=true)
    public static final fkg e = new fkg((bgr)new evp(new eur(2345L)), (List<Integer>)ImmutableList.of((Object)0));
    private static final int h = 1024;
    private final b i;
    private final dxp j;
    private final dya k;
    private final cec l;
    private final dxu m;
    private final ThreadLocal<Long2FloatLinkedOpenHashMap> n = ThreadLocal.withInitial(() -> {
        Long2FloatLinkedOpenHashMap $$0 = new Long2FloatLinkedOpenHashMap(1024, 0.25f){

            protected void rehash(int $$0) {
            }
        };
        $$0.defaultReturnValue(Float.NaN);
        return $$0;
    });

    dxo(b $$0, cec $$1, dxu $$2, dxp $$3, dya $$4) {
        this.i = $$0;
        this.j = $$3;
        this.k = $$4;
        this.l = $$1;
        this.m = $$2;
    }

    public dya a() {
        return this.k;
    }

    public boolean b() {
        return this.i.a();
    }

    public c a(is $$0, int $$1) {
        if (!this.b()) {
            return dxo$c.a;
        }
        return this.b($$0, $$1) ? dxo$c.c : dxo$c.b;
    }

    private float e(is $$0, int $$1) {
        float $$2 = this.i.d.a($$0, this.f());
        int $$3 = $$1 + 17;
        if ($$0.v() > $$3) {
            float $$4 = (float)(f.a((float)$$0.u() / 8.0f, (float)$$0.w() / 8.0f, false) * 8.0);
            return $$2 - ($$4 + (float)$$0.v() - (float)$$3) * 0.05f / 40.0f;
        }
        return $$2;
    }

    @Deprecated
    private float f(is $$0, int $$1) {
        long $$2 = $$0.a();
        Long2FloatLinkedOpenHashMap $$3 = this.n.get();
        float $$4 = $$3.get($$2);
        if (!Float.isNaN($$4)) {
            return $$4;
        }
        float $$5 = this.e($$0, $$1);
        if ($$3.size() == 1024) {
            $$3.removeFirstFloat();
        }
        $$3.put($$2, $$5);
        return $$5;
    }

    public boolean a(dwr $$0, is $$1) {
        return this.a($$0, $$1, true);
    }

    public boolean a(dwr $$0, is $$1, boolean $$2) {
        if (this.c($$1, $$0.V())) {
            return false;
        }
        if ($$0.d($$1.v()) && $$0.a(dww.b, $$1) < 10) {
            eoh $$3 = $$0.a_($$1);
            flb $$4 = $$0.b_($$1);
            if ($$4.a() == flc.c && $$3.b() instanceof eeo) {
                boolean $$5;
                if (!$$2) {
                    return true;
                }
                boolean bl2 = $$5 = $$0.F($$1.h()) && $$0.F($$1.i()) && $$0.F($$1.f()) && $$0.F($$1.g());
                if (!$$5) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b(is $$0, int $$1) {
        return !this.c($$0, $$1);
    }

    public boolean c(is $$0, int $$1) {
        return this.f($$0, $$1) >= 0.15f;
    }

    public boolean d(is $$0, int $$1) {
        return this.f($$0, $$1) > 0.1f;
    }

    public boolean b(dwr $$0, is $$1) {
        eoh $$2;
        if (this.a($$1, $$0.V()) != dxo$c.c) {
            return false;
        }
        return $$0.d($$1.v()) && $$0.a(dww.b, $$1) < 10 && (($$2 = $$0.a_($$1)).l() || $$2.a(dzs.ep)) && dzs.ep.m().a($$0, $$1);
    }

    public dxp c() {
        return this.j;
    }

    public int a(double $$0, double $$1) {
        int $$2 = this.j();
        return this.m.e().a($$0, $$1, $$2);
    }

    private int j() {
        Optional<Integer> $$0 = this.m.d();
        if ($$0.isPresent()) {
            return $$0.get();
        }
        return this.k();
    }

    private int k() {
        double $$0 = bgj.a(this.i.c, 0.0f, 1.0f);
        double $$1 = bgj.a(this.i.e, 0.0f, 1.0f);
        return dwm.a($$0, $$1);
    }

    public int d() {
        return this.m.b().orElseGet(this::l);
    }

    private int l() {
        double $$0 = bgj.a(this.i.c, 0.0f, 1.0f);
        double $$1 = bgj.a(this.i.e, 0.0f, 1.0f);
        return dwk.a($$0, $$1);
    }

    public int e() {
        return this.m.c().orElseGet(this::m);
    }

    private int m() {
        double $$0 = bgj.a(this.i.c, 0.0f, 1.0f);
        double $$1 = bgj.a(this.i.e, 0.0f, 1.0f);
        return dwd.a($$0, $$1);
    }

    public float f() {
        return this.i.c;
    }

    public cec g() {
        return this.l;
    }

    public dxu h() {
        return this.m;
    }

    public int i() {
        return this.m.a();
    }

    static final class b
    extends Record {
        private final boolean b;
        final float c;
        final d d;
        final float e;
        public static final MapCodec<b> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.BOOL.fieldOf("has_precipitation").forGetter($$0 -> $$0.b), (App)Codec.FLOAT.fieldOf("temperature").forGetter($$0 -> Float.valueOf($$0.c)), (App)dxo$d.c.optionalFieldOf("temperature_modifier", (Object)dxo$d.a).forGetter($$0 -> $$0.d), (App)Codec.FLOAT.fieldOf("downfall").forGetter($$0 -> Float.valueOf($$0.e))).apply((Applicative)$$02, b::new));

        b(boolean $$0, float $$1, d $$2, float $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "hasPrecipitation;temperature;temperatureModifier;downfall", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "hasPrecipitation;temperature;temperatureModifier;downfall", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "hasPrecipitation;temperature;temperatureModifier;downfall", "b", "c", "d", "e"}, this, $$0);
        }

        public boolean a() {
            return this.b;
        }

        public float b() {
            return this.c;
        }

        public d c() {
            return this.d;
        }

        public float d() {
            return this.e;
        }
    }

    public static final class c
    extends Enum<c>
    implements bhh {
        public static final /* enum */ c a = new c("none");
        public static final /* enum */ c b = new c("rain");
        public static final /* enum */ c c = new c("snow");
        public static final Codec<c> d;
        private final String e;
        private static final /* synthetic */ c[] f;

        public static c[] values() {
            return (c[])f.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private c(String $$0) {
            this.e = $$0;
        }

        @Override
        public String c() {
            return this.e;
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            f = dxo$c.a();
            d = bhh.a(c::values);
        }
    }

    public static abstract sealed class d
    extends Enum<d>
    implements bhh {
        public static final /* enum */ d a = new d("none"){

            @Override
            public float a(is $$0, float $$1) {
                return $$1;
            }
        };
        public static final /* enum */ d b = new d("frozen"){

            @Override
            public float a(is $$0, float $$1) {
                double $$5;
                double $$3;
                double $$2 = g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
                double $$4 = $$2 + ($$3 = dxo.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false));
                if ($$4 < 0.3 && ($$5 = dxo.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false)) < 0.8) {
                    return 0.2f;
                }
                return $$1;
            }
        };
        private final String d;
        public static final Codec<d> c;
        private static final /* synthetic */ d[] e;

        public static d[] values() {
            return (d[])e.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        public abstract float a(is var1, float var2);

        d(String $$0) {
            this.d = $$0;
        }

        public String a() {
            return this.d;
        }

        @Override
        public String c() {
            return this.d;
        }

        private static /* synthetic */ d[] b() {
            return new d[]{a, b};
        }

        static {
            e = dxo$d.b();
            c = bhh.a(d::values);
        }
    }

    public static class a {
        private boolean a = true;
        private @Nullable Float b;
        private d c = dxo$d.a;
        private @Nullable Float d;
        private final cec.a e = cec.a();
        private @Nullable dxu f;
        private @Nullable dya g;
        private @Nullable dxp h;

        public a a(boolean $$0) {
            this.a = $$0;
            return this;
        }

        public a a(float $$0) {
            this.b = Float.valueOf($$0);
            return this;
        }

        public a b(float $$0) {
            this.d = Float.valueOf($$0);
            return this;
        }

        public a a(cec $$0) {
            this.e.a($$0);
            return this;
        }

        public a a(cec.a $$0) {
            return this.a($$0.a());
        }

        public <Value> a a(cea<Value> $$0, Value $$1) {
            this.e.a($$0, $$1);
            return this;
        }

        public <Value, Parameter> a a(cea<Value> $$0, cel<Value, Parameter> $$1, Parameter $$2) {
            this.e.a($$0, $$1, $$2);
            return this;
        }

        public a a(dxu $$0) {
            this.f = $$0;
            return this;
        }

        public a a(dya $$0) {
            this.g = $$0;
            return this;
        }

        public a a(dxp $$0) {
            this.h = $$0;
            return this;
        }

        public a a(d $$0) {
            this.c = $$0;
            return this;
        }

        public dxo a() {
            if (this.b == null || this.d == null || this.f == null || this.g == null || this.h == null) {
                throw new IllegalStateException("You are missing parameters to build a proper biome\n" + String.valueOf(this));
            }
            return new dxo(new b(this.a, this.b.floatValue(), this.c, this.d.floatValue()), this.e.a(), this.f, this.h, this.g);
        }

        public String toString() {
            return "BiomeBuilder{\nhasPrecipitation=" + this.a + ",\ntemperature=" + this.b + ",\ntemperatureModifier=" + String.valueOf(this.c) + ",\ndownfall=" + this.d + ",\nspecialEffects=" + String.valueOf(this.f) + ",\nmobSpawnSettings=" + String.valueOf(this.g) + ",\ngenerationSettings=" + String.valueOf(this.h) + ",\n}";
        }
    }
}

