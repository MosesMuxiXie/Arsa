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
import java.nio.file.Path;

public final class esh
extends Record {
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final double p;
    private final int q;
    private final int r;
    private final int s;
    private final bef<dzq> t;
    private final float u;
    private final b v;
    private final c w;
    private final a x;
    private final cec y;
    private final jh<fvn> z;
    public static final int a = is.e;
    public static final int b = 16;
    public static final int c = (1 << a) - 32;
    public static final int d = (c >> 1) - 1;
    public static final int e = d - c + 1;
    public static final int f = d << 4;
    public static final int g = e << 4;
    public static final Codec<esh> h = esh.a(cec.b);
    public static final Codec<esh> i = esh.a(cec.c);
    public static final aao<xq, jd<esh>> j = aam.b(mj.bd);
    public static final float[] k = new float[]{1.0f, 0.75f, 0.5f, 0.25f, 0.0f, 0.25f, 0.5f, 0.75f};
    public static final Codec<jd<esh>> l = amq.a(mj.bd, h);

    public esh(boolean $$0, boolean $$1, boolean $$2, double $$3, int $$4, int $$5, int $$6, bef<dzq> $$7, float $$8, b $$9, c $$10, a $$11, cec $$12, jh<fvn> $$13) {
        if ($$5 < 16) {
            throw new IllegalStateException("height has to be at least 16");
        }
        if ($$4 + $$5 > d + 1) {
            throw new IllegalStateException("min_y + height cannot be higher than: " + (d + 1));
        }
        if ($$6 > $$5) {
            throw new IllegalStateException("logical_height cannot be higher than height");
        }
        if ($$5 % 16 != 0) {
            throw new IllegalStateException("height has to be multiple of 16");
        }
        if ($$4 % 16 != 0) {
            throw new IllegalStateException("min_y has to be a multiple of 16");
        }
        this.m = $$0;
        this.n = $$1;
        this.o = $$2;
        this.p = $$3;
        this.q = $$4;
        this.r = $$5;
        this.s = $$6;
        this.t = $$7;
        this.u = $$8;
        this.v = $$9;
        this.w = $$10;
        this.x = $$11;
        this.y = $$12;
        this.z = $$13;
    }

    private static Codec<esh> a(Codec<cec> $$0) {
        return bfm.e(RecordCodecBuilder.create($$1 -> $$1.group((App)Codec.BOOL.optionalFieldOf("has_fixed_time", (Object)false).forGetter(esh::d), (App)Codec.BOOL.fieldOf("has_skylight").forGetter(esh::e), (App)Codec.BOOL.fieldOf("has_ceiling").forGetter(esh::f), (App)Codec.doubleRange((double)1.0E-5f, (double)3.0E7).fieldOf("coordinate_scale").forGetter(esh::g), (App)Codec.intRange((int)e, (int)d).fieldOf("min_y").forGetter(esh::h), (App)Codec.intRange((int)16, (int)c).fieldOf("height").forGetter(esh::i), (App)Codec.intRange((int)0, (int)c).fieldOf("logical_height").forGetter(esh::j), (App)bef.b(mj.i).fieldOf("infiniburn").forGetter(esh::k), (App)Codec.FLOAT.fieldOf("ambient_light").forGetter(esh::l), (App)esh$b.a.forGetter(esh::m), (App)esh$c.d.optionalFieldOf("skybox", (Object)esh$c.b).forGetter(esh::n), (App)esh$a.c.optionalFieldOf("cardinal_light", (Object)esh$a.a).forGetter(esh::o), (App)$$0.optionalFieldOf("attributes", (Object)cec.a).forGetter(esh::p), (App)js.a(mj.bw).optionalFieldOf("timelines", jh.f()).forGetter(esh::q)).apply((Applicative)$$1, esh::new)));
    }

    public static double a(esh $$0, esh $$1) {
        double $$2 = $$0.g();
        double $$3 = $$1.g();
        return $$2 / $$3;
    }

    public static Path a(amt<dwo> $$0, Path $$1) {
        if ($$0 == dwo.h) {
            return $$1;
        }
        if ($$0 == dwo.j) {
            return $$1.resolve("DIM1");
        }
        if ($$0 == dwo.i) {
            return $$1.resolve("DIM-1");
        }
        return $$1.resolve("dimensions").resolve($$0.a().b()).resolve($$0.a().a());
    }

    public cch a() {
        return this.v.a();
    }

    public int b() {
        return this.v.b();
    }

    public boolean c() {
        return this.w == esh$c.c;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{esh.class, "hasFixedTime;hasSkyLight;hasCeiling;coordinateScale;minY;height;logicalHeight;infiniburn;ambientLight;monsterSettings;skybox;cardinalLightType;attributes;timelines", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{esh.class, "hasFixedTime;hasSkyLight;hasCeiling;coordinateScale;minY;height;logicalHeight;infiniburn;ambientLight;monsterSettings;skybox;cardinalLightType;attributes;timelines", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{esh.class, "hasFixedTime;hasSkyLight;hasCeiling;coordinateScale;minY;height;logicalHeight;infiniburn;ambientLight;monsterSettings;skybox;cardinalLightType;attributes;timelines", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, this, $$0);
    }

    public boolean d() {
        return this.m;
    }

    public boolean e() {
        return this.n;
    }

    public boolean f() {
        return this.o;
    }

    public double g() {
        return this.p;
    }

    public int h() {
        return this.q;
    }

    public int i() {
        return this.r;
    }

    public int j() {
        return this.s;
    }

    public bef<dzq> k() {
        return this.t;
    }

    public float l() {
        return this.u;
    }

    public b m() {
        return this.v;
    }

    public c n() {
        return this.w;
    }

    public a o() {
        return this.x;
    }

    public cec p() {
        return this.y;
    }

    public jh<fvn> q() {
        return this.z;
    }

    public static final class b
    extends Record {
        private final cch b;
        private final int c;
        public static final MapCodec<b> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)cch.b(0, 15).fieldOf("monster_spawn_light_level").forGetter(b::a), (App)Codec.intRange((int)0, (int)15).fieldOf("monster_spawn_block_light_limit").forGetter(b::b)).apply((Applicative)$$0, b::new));

        public b(cch $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "monsterSpawnLightTest;monsterSpawnBlockLightLimit", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "monsterSpawnLightTest;monsterSpawnBlockLightLimit", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "monsterSpawnLightTest;monsterSpawnBlockLightLimit", "b", "c"}, this, $$0);
        }

        public cch a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }
    }

    public static final class c
    extends Enum<c>
    implements bhh {
        public static final /* enum */ c a = new c("none");
        public static final /* enum */ c b = new c("overworld");
        public static final /* enum */ c c = new c("end");
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
            f = esh$c.a();
            d = bhh.a(c::values);
        }
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("default");
        public static final /* enum */ a b = new a("nether");
        public static final Codec<a> c;
        private final String d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.d = $$0;
        }

        @Override
        public String c() {
            return this.d;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            e = esh$a.a();
            c = bhh.a(a::values);
        }
    }
}

