/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P5
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public abstract class fgl {
    public static final Codec<fgl> b = mi.P.q().dispatch(fgl::e, fgm::codec);
    private static final int a = 10387320;
    private final jy c;
    private final c d;
    private final float e;
    private final int f;
    private final Optional<a> g;

    protected static <S extends fgl> Products.P5<RecordCodecBuilder.Mu<S>, jy, c, Float, Integer, Optional<a>> a(RecordCodecBuilder.Instance<S> $$0) {
        return $$0.group((App)jy.v(16).optionalFieldOf("locate_offset", (Object)jy.i).forGetter(fgl::f), (App)fgl$c.e.optionalFieldOf("frequency_reduction_method", (Object)fgl$c.a).forGetter(fgl::g), (App)Codec.floatRange((float)0.0f, (float)1.0f).optionalFieldOf("frequency", (Object)Float.valueOf(1.0f)).forGetter(fgl::h), (App)bfm.q.fieldOf("salt").forGetter(fgl::i), (App)fgl$a.a.optionalFieldOf("exclusion_zone").forGetter(fgl::j));
    }

    protected fgl(jy $$0, c $$1, float $$2, int $$3, Optional<a> $$4) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
    }

    protected jy f() {
        return this.c;
    }

    protected c g() {
        return this.d;
    }

    protected float h() {
        return this.e;
    }

    protected int i() {
        return this.f;
    }

    protected Optional<a> j() {
        return this.g;
    }

    public boolean b(eqh $$0, int $$1, int $$2) {
        return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
    }

    public boolean a(int $$0, int $$1, long $$2) {
        return !(this.e < 1.0f) || this.d.a($$2, this.f, $$0, $$1, this.e);
    }

    public boolean c(eqh $$0, int $$1, int $$2) {
        return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
    }

    protected abstract boolean a(eqh var1, int var2, int var3);

    public is a(dvu $$0) {
        return new is($$0.e(), 0, $$0.f()).a(this.f());
    }

    public abstract fgm<?> e();

    private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
        evp $$5 = new evp(new eur(0L));
        $$5.a($$0, $$1, $$2, $$3);
        return $$5.i() < $$4;
    }

    private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
        evp $$5 = new evp(new eur(0L));
        $$5.c($$0, $$2, $$3);
        return $$5.j() < (double)$$4;
    }

    private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
        evp $$5 = new evp(new eur(0L));
        $$5.a($$0, $$2, $$3, 10387320);
        return $$5.i() < $$4;
    }

    private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
        int $$5 = $$2 >> 4;
        int $$6 = $$3 >> 4;
        evp $$7 = new evp(new eur(0L));
        $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
        $$7.f();
        return $$7.a((int)(1.0f / $$4)) == 0;
    }

    public static final class c
    extends Enum<c>
    implements bhh {
        public static final /* enum */ c a = new c("default", fgl::a);
        public static final /* enum */ c b = new c("legacy_type_1", fgl::d);
        public static final /* enum */ c c = new c("legacy_type_2", fgl::c);
        public static final /* enum */ c d = new c("legacy_type_3", fgl::b);
        public static final Codec<c> e;
        private final String f;
        private final b g;
        private static final /* synthetic */ c[] h;

        public static c[] values() {
            return (c[])h.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private c(String $$0, b $$1) {
            this.f = $$0;
            this.g = $$1;
        }

        public boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
            return this.g.shouldGenerate($$0, $$1, $$2, $$3, $$4);
        }

        @Override
        public String c() {
            return this.f;
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c, d};
        }

        static {
            h = fgl$c.a();
            e = bhh.a(c::values);
        }
    }

    @Deprecated
    public static final class a
    extends Record {
        private final jd<ffu> b;
        private final int c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)amq.a(mj.br, ffu.a, false).fieldOf("other_set").forGetter(a::a), (App)Codec.intRange((int)1, (int)16).fieldOf("chunk_count").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(jd<ffu> $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        boolean a(eqh $$0, int $$1, int $$2) {
            return $$0.a(this.b, $$1, $$2, this.c);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "otherSet;chunkCount", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "otherSet;chunkCount", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "otherSet;chunkCount", "b", "c"}, this, $$0);
        }

        public jd<ffu> a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }
    }

    @FunctionalInterface
    public static interface b {
        public boolean shouldGenerate(long var1, int var3, int var4, int var5, float var6);
    }
}

