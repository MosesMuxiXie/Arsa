/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class dkm
extends dmo {
    private static final float o = 1.25f;
    public static final int a = 8;
    private boolean p = false;
    private boolean q = false;
    private static final float r = 0.2f;
    private static final float s = 0.5f;
    private static final float t = 3.15f;
    private static final float u = 1.6f;
    public static final float b = 1.6f;
    private static final b v = new b(Optional.of(bda.hO), Optional.of(bda.hN), Optional.of(bda.hM));

    public dkm(dlp.a $$0) {
        super($$0);
    }

    @Override
    public Predicate<dlt> c() {
        return d;
    }

    @Override
    public Predicate<dlt> a() {
        return c;
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        dlt $$3 = $$1.b($$2);
        doa $$4 = $$3.a(ki.W);
        if ($$4 != null && !$$4.b()) {
            this.a($$0, $$1, $$2, $$3, dkm.a($$4), 1.0f, null);
            return cdc.c;
        }
        if (!$$1.d($$3).f()) {
            this.p = false;
            this.q = false;
            $$1.c($$2);
            return cdc.c;
        }
        return cdc.d;
    }

    private static float a(doa $$0) {
        if ($$0.a(dlx.wG)) {
            return 1.6f;
        }
        return 3.15f;
    }

    @Override
    public boolean a(dlt $$0, dwo $$1, chl $$2, int $$3) {
        int $$4 = this.a($$0, $$2) - $$3;
        return dkm.a($$4, $$0, $$2) >= 1.0f && dkm.g($$0);
    }

    private static boolean a(chl $$0, dlt $$1) {
        List<dlt> $$2 = dkm.a($$1, $$0.d($$1), $$0);
        if (!$$2.isEmpty()) {
            $$1.b(ki.W, doa.a($$2));
            return true;
        }
        return false;
    }

    public static boolean g(dlt $$0) {
        doa $$1 = $$0.a(ki.W, doa.a);
        return !$$1.b();
    }

    @Override
    protected void a(chl $$0, dec $$1, int $$2, float $$3, float $$4, float $$5, @Nullable chl $$6) {
        Vector3f $$15;
        if ($$6 != null) {
            double $$7 = $$6.dP() - $$0.dP();
            double $$8 = $$6.dV() - $$0.dV();
            double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
            double $$10 = $$6.f(0.3333333333333333) - $$1.dR() + $$9 * (double)0.2f;
            Vector3f $$11 = dkm.a($$0, new ftm($$7, $$10, $$8), $$5);
        } else {
            ftm $$12 = $$0.m(1.0f);
            Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * ((float)Math.PI / 180)), $$12.g, $$12.h, $$12.i);
            ftm $$14 = $$0.h(1.0f);
            $$15 = $$14.m().rotate((Quaternionfc)$$13);
        }
        $$1.d($$15.x(), $$15.y(), $$15.z(), $$3, $$4);
        float $$16 = dkm.a($$0.ep(), $$2);
        $$0.ao().a(null, $$0.dP(), $$0.dR(), $$0.dV(), bda.hS, $$0.dB(), 1.0f, $$16);
    }

    private static Vector3f a(chl $$0, ftm $$1, float $$2) {
        Vector3f $$3 = $$1.m().normalize();
        Vector3f $$4 = new Vector3f((Vector3fc)$$3).cross((Vector3fc)new Vector3f(0.0f, 1.0f, 0.0f));
        if ((double)$$4.lengthSquared() <= 1.0E-7) {
            ftm $$5 = $$0.m(1.0f);
            $$4 = new Vector3f((Vector3fc)$$3).cross((Vector3fc)$$5.m());
        }
        Vector3f $$6 = new Vector3f((Vector3fc)$$3).rotateAxis(1.5707964f, $$4.x, $$4.y, $$4.z);
        return new Vector3f((Vector3fc)$$3).rotateAxis($$2 * ((float)Math.PI / 180), $$6.x, $$6.y, $$6.z);
    }

    @Override
    protected dec a(dwo $$0, chl $$1, dlt $$2, dlt $$3, boolean $$4) {
        if ($$3.a(dlx.wG)) {
            return new ddy($$0, $$3, $$1, $$1.dP(), $$1.dT() - (double)0.15f, $$1.dV(), true);
        }
        dec $$5 = super.a($$0, $$1, $$2, $$3, $$4);
        if ($$5 instanceof deh) {
            deh $$6 = (deh)$$5;
            $$6.b(bda.hL);
        }
        return $$5;
    }

    @Override
    protected int h(dlt $$0) {
        return $$0.a(dlx.wG) ? 3 : 1;
    }

    /*
     * WARNING - void declaration
     */
    public void a(dwo $$0, chl $$1, cdb $$2, dlt $$3, float $$4, float $$5, @Nullable chl $$6) {
        void $$8;
        if (!($$0 instanceof axf)) {
            return;
        }
        axf $$7 = (axf)$$0;
        doa $$9 = $$3.b(ki.W, doa.a);
        if ($$9 == null || $$9.b()) {
            return;
        }
        this.a((axf)$$8, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof ddm, $$6);
        if ($$1 instanceof axg) {
            axg $$10 = (axg)$$1;
            aj.G.a($$10, $$3);
            $$10.b(bdk.c.b($$3.h()));
        }
    }

    private static float a(bgr $$0, int $$1) {
        if ($$1 == 0) {
            return 1.0f;
        }
        return dkm.a(($$1 & 1) == 1, $$0);
    }

    private static float a(boolean $$0, bgr $$1) {
        float $$2 = $$0 ? 0.63f : 0.43f;
        return 1.0f / ($$1.i() * 0.5f + 1.8f) + $$2;
    }

    @Override
    public void a(dwo $$0, chl $$1, dlt $$22, int $$3) {
        if (!$$0.B_()) {
            b $$4 = this.i($$22);
            float $$5 = (float)($$22.a($$1) - $$3) / (float)dkm.b($$22, $$1);
            if ($$5 < 0.2f) {
                this.p = false;
                this.q = false;
            }
            if ($$5 >= 0.2f && !this.p) {
                this.p = true;
                $$4.a().ifPresent($$2 -> $$0.a(null, $$1.dP(), $$1.dR(), $$1.dV(), (bcz)$$2.a(), bdb.h, 0.5f, 1.0f));
            }
            if ($$5 >= 0.5f && !this.q) {
                this.q = true;
                $$4.b().ifPresent($$2 -> $$0.a(null, $$1.dP(), $$1.dR(), $$1.dV(), (bcz)$$2.a(), bdb.h, 0.5f, 1.0f));
            }
            if ($$5 >= 1.0f && !dkm.g($$22) && dkm.a($$1, $$22)) {
                $$4.c().ifPresent($$2 -> $$0.a(null, $$1.dP(), $$1.dR(), $$1.dV(), (bcz)$$2.a(), $$1.dB(), 1.0f, 1.0f / ($$0.G_().i() * 0.5f + 1.0f) + 0.2f));
            }
        }
    }

    @Override
    public int a(dlt $$0, chl $$1) {
        return 72000;
    }

    public static int b(dlt $$0, chl $$1) {
        float $$2 = dsq.a($$0, $$1, 1.25f);
        return bgj.b($$2 * 20.0f);
    }

    @Override
    public dlv b(dlt $$0) {
        return dlv.g;
    }

    b i(dlt $$0) {
        return dsq.b($$0, dsp.C).orElse(v);
    }

    private static float a(int $$0, dlt $$1, chl $$2) {
        float $$3 = (float)$$0 / (float)dkm.b($$1, $$2);
        if ($$3 > 1.0f) {
            $$3 = 1.0f;
        }
        return $$3;
    }

    @Override
    public boolean e_(dlt $$0) {
        return $$0.a(this);
    }

    @Override
    public int b() {
        return 8;
    }

    public static final class b
    extends Record {
        private final Optional<jd<bcz>> b;
        private final Optional<jd<bcz>> c;
        private final Optional<jd<bcz>> d;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bcz.b.optionalFieldOf("start").forGetter(b::a), (App)bcz.b.optionalFieldOf("mid").forGetter(b::b), (App)bcz.b.optionalFieldOf("end").forGetter(b::c)).apply((Applicative)$$0, b::new));

        public b(Optional<jd<bcz>> $$0, Optional<jd<bcz>> $$1, Optional<jd<bcz>> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "start;mid;end", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "start;mid;end", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "start;mid;end", "b", "c", "d"}, this, $$0);
        }

        public Optional<jd<bcz>> a() {
            return this.b;
        }

        public Optional<jd<bcz>> b() {
            return this.c;
        }

        public Optional<jd<bcz>> c() {
            return this.d;
        }
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("none");
        public static final /* enum */ a b = new a("arrow");
        public static final /* enum */ a c = new a("rocket");
        public static final Codec<a> d;
        private final String e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.e = $$0;
        }

        @Override
        public String c() {
            return this.e;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            f = dkm$a.a();
            d = bhh.a(a::values);
        }
    }
}

