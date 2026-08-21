/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import static i.a;

public abstract class cgh
extends cgk {
    static final Logger o = LogUtils.getLogger();
    public static final int a = -1;
    private static final alw<Integer> p = ama.a(cgh.class, aly.b);
    private static final alw<Integer> q = ama.a(cgh.class, aly.b);
    private static final alw<Integer> r = ama.a(cgh.class, aly.b);
    private static final alw<Vector3fc> s = ama.a(cgh.class, aly.J);
    private static final alw<Vector3fc> t = ama.a(cgh.class, aly.J);
    private static final alw<Quaternionfc> u = ama.a(cgh.class, aly.K);
    private static final alw<Quaternionfc> aN = ama.a(cgh.class, aly.K);
    private static final alw<Byte> aO = ama.a(cgh.class, aly.a);
    private static final alw<Integer> aP = ama.a(cgh.class, aly.b);
    private static final alw<Float> aQ = ama.a(cgh.class, aly.d);
    private static final alw<Float> aR = ama.a(cgh.class, aly.d);
    private static final alw<Float> aS = ama.a(cgh.class, aly.d);
    private static final alw<Float> aT = ama.a(cgh.class, aly.d);
    private static final alw<Float> aU = ama.a(cgh.class, aly.d);
    private static final alw<Integer> aV = ama.a(cgh.class, aly.b);
    private static final IntSet aW = IntSet.of((int[])new int[]{s.a(), t.a(), u.a(), aN.a(), aO.a(), aP.a(), aR.a(), aS.a()});
    private static final int aX = 0;
    private static final int aY = 0;
    private static final int aZ = 0;
    private static final float ba = 0.0f;
    private static final float bb = 1.0f;
    private static final float bc = 1.0f;
    private static final float bd = 0.0f;
    private static final float be = 0.0f;
    private static final int bf = -1;
    public static final String b = "teleport_duration";
    public static final String c = "interpolation_duration";
    public static final String d = "start_interpolation";
    public static final String e = "transformation";
    public static final String f = "billboard";
    public static final String g = "brightness";
    public static final String h = "view_range";
    public static final String i = "shadow_radius";
    public static final String j = "shadow_strength";
    public static final String k = "width";
    public static final String l = "height";
    public static final String m = "glow_color_override";
    private long bg = Integer.MIN_VALUE;
    private int bh;
    private float bi;
    private fth bj;
    private boolean bk = true;
    protected boolean n;
    private boolean bl;
    private boolean bm;
    private @Nullable j bn;
    private final chf bo = new chf((cgk)this, 0);

    public cgh(cgu<?> $$0, dwo $$1) {
        super($$0, $$1);
        this.ar = true;
        this.bj = this.dj();
    }

    @Override
    public void a(alw<?> $$0) {
        super.a($$0);
        if (aU.equals($$0) || aT.equals($$0)) {
            this.z();
        }
        if (p.equals($$0)) {
            this.bl = true;
        }
        if (r.equals($$0)) {
            this.bo.a(this.n());
        }
        if (q.equals($$0)) {
            this.bm = true;
        }
        if (aW.contains($$0.a())) {
            this.n = true;
        }
    }

    @Override
    public final boolean a(axf $$0, cex $$1, float $$2) {
        return false;
    }

    private static i a(ama $$0) {
        Vector3fc $$1 = $$0.a(s);
        Quaternionfc $$2 = $$0.a(u);
        Vector3fc $$3 = $$0.a(t);
        Quaternionfc $$4 = $$0.a(aN);
        return new i($$1, $$2, $$3, $$4);
    }

    @Override
    public void g() {
        cgk $$0 = this.dz();
        if ($$0 != null && $$0.eh()) {
            this.cf();
        }
        if (this.ao().B_()) {
            if (this.bl) {
                this.bl = false;
                int $$1 = this.m();
                this.bg = this.at + $$1;
            }
            if (this.bm) {
                this.bm = false;
                this.bh = this.k();
            }
            if (this.n) {
                this.n = false;
                boolean $$2 = this.bh != 0;
                this.bn = $$2 && this.bn != null ? this.a(this.bn, this.bi) : this.A();
                this.a($$2, this.bi);
            }
            this.bo.e();
        }
    }

    @Override
    public chf l_() {
        return this.bo;
    }

    protected abstract void a(boolean var1, float var2);

    @Override
    protected void a(ama.a $$0) {
        $$0.a(r, 0);
        $$0.a(p, 0);
        $$0.a(q, 0);
        $$0.a(s, new Vector3f());
        $$0.a(t, new Vector3f(1.0f, 1.0f, 1.0f));
        $$0.a(aN, new Quaternionf());
        $$0.a(u, new Quaternionf());
        $$0.a(aO, cgh$a.a.a());
        $$0.a(aP, -1);
        $$0.a(aQ, Float.valueOf(1.0f));
        $$0.a(aR, Float.valueOf(0.0f));
        $$0.a(aS, Float.valueOf(1.0f));
        $$0.a(aT, Float.valueOf(0.0f));
        $$0.a(aU, Float.valueOf(0.0f));
        $$0.a(aV, -1);
    }

    @Override
    protected void a(fnq $$0) {
        this.a($$0.a(e, i.b).orElse(a()));
        this.a($$0.a(c, 0));
        this.b($$0.a(d, 0));
        int $$1 = $$0.a(b, 0);
        this.d(bgj.a($$1, 0, 59));
        this.a($$0.a(f, cgh$a.e).orElse(cgh$a.a));
        this.b($$0.a(h, 1.0f));
        this.c($$0.a(i, 0.0f));
        this.d($$0.a(j, 1.0f));
        this.x($$0.a(k, 0.0f));
        this.y($$0.a(l, 0.0f));
        this.l($$0.a(m, -1));
        this.a((bet)$$0.a(g, bet.b).orElse(null));
    }

    private void a(i $$0) {
        this.az.a(s, $$0.e());
        this.az.a(u, $$0.f());
        this.az.a(t, $$0.g());
        this.az.a(aN, $$0.h());
    }

    @Override
    protected void a(fns $$0) {
        $$0.a(e, i.b, cgh.a(this.az));
        $$0.a(f, cgh$a.e, this.p());
        $$0.a(c, this.k());
        $$0.a(b, this.n());
        $$0.a(h, this.s());
        $$0.a(i, this.u());
        $$0.a(j, this.v());
        $$0.a(k, this.w());
        $$0.a(l, this.y());
        $$0.a(m, this.x());
        $$0.b(g, bet.b, this.q());
    }

    public fth e() {
        return this.bj;
    }

    public boolean f() {
        return !this.bk;
    }

    @Override
    public flg n_() {
        return flg.d;
    }

    @Override
    public boolean m_() {
        return true;
    }

    public @Nullable j i() {
        return this.bn;
    }

    private void a(int $$0) {
        this.az.a(q, $$0);
    }

    private int k() {
        return this.az.a(q);
    }

    private void b(int $$0) {
        this.az.a(p, $$0, true);
    }

    private int m() {
        return this.az.a(p);
    }

    private void d(int $$0) {
        this.az.a(r, $$0);
    }

    private int n() {
        return this.az.a(r);
    }

    private void a(a $$0) {
        this.az.a(aO, $$0.a());
    }

    private a p() {
        return cgh$a.f.apply(this.az.a(aO).byteValue());
    }

    private void a(@Nullable bet $$0) {
        this.az.a(aP, $$0 != null ? $$0.a() : -1);
    }

    private @Nullable bet q() {
        int $$0 = this.az.a(aP);
        return $$0 != -1 ? bet.c($$0) : null;
    }

    private int r() {
        return this.az.a(aP);
    }

    private void b(float $$0) {
        this.az.a(aQ, Float.valueOf($$0));
    }

    private float s() {
        return this.az.a(aQ).floatValue();
    }

    private void c(float $$0) {
        this.az.a(aR, Float.valueOf($$0));
    }

    private float u() {
        return this.az.a(aR).floatValue();
    }

    private void d(float $$0) {
        this.az.a(aS, Float.valueOf($$0));
    }

    private float v() {
        return this.az.a(aS).floatValue();
    }

    private void x(float $$0) {
        this.az.a(aT, Float.valueOf($$0));
    }

    private float w() {
        return this.az.a(aT).floatValue();
    }

    private void y(float $$0) {
        this.az.a(aU, Float.valueOf($$0));
    }

    private int x() {
        return this.az.a(aV);
    }

    private void l(int $$0) {
        this.az.a(aV, $$0);
    }

    public float a(float $$0) {
        float $$4;
        int $$1 = this.bh;
        if ($$1 <= 0) {
            return 1.0f;
        }
        float $$2 = (long)this.at - this.bg;
        float $$3 = $$2 + $$0;
        this.bi = $$4 = bgj.a(bgj.f($$3, 0.0f, $$1), 0.0f, 1.0f);
        return $$4;
    }

    private float y() {
        return this.az.a(aU).floatValue();
    }

    @Override
    public void a_(double $$0, double $$1, double $$2) {
        super.a_($$0, $$1, $$2);
        this.z();
    }

    private void z() {
        float $$0 = this.w();
        float $$1 = this.y();
        this.bk = $$0 == 0.0f || $$1 == 0.0f;
        float $$2 = $$0 / 2.0f;
        double $$3 = this.dP();
        double $$4 = this.dR();
        double $$5 = this.dV();
        this.bj = new fth($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
    }

    @Override
    public boolean a(double $$0) {
        return $$0 < bgj.n((double)this.s() * 64.0 * cgh.dc());
    }

    @Override
    public int h_() {
        int $$0 = this.x();
        return $$0 != -1 ? $$0 : super.h_();
    }

    private j A() {
        return new j(cgh$e.constant(cgh.a(this.az)), this.p(), this.r(), cgh$d.constant(this.u()), cgh$d.constant(this.v()), this.x());
    }

    private j a(j $$0, float $$1) {
        i $$2 = $$0.a.get($$1);
        float $$3 = $$0.d.get($$1);
        float $$4 = $$0.e.get($$1);
        return new j(new l($$2, cgh.a(this.az)), this.p(), this.r(), new h($$3, this.u()), new h($$4, this.v()), this.x());
    }

    public static final class j
    extends Record {
        final e<i> a;
        private final a b;
        private final int c;
        final d d;
        final d e;
        private final int f;

        public j(e<i> $$0, a $$1, int $$2, d $$3, d $$4, int $$5) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{j.class, "transformation;billboardConstraints;brightnessOverride;shadowRadius;shadowStrength;glowColorOverride", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{j.class, "transformation;billboardConstraints;brightnessOverride;shadowRadius;shadowStrength;glowColorOverride", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{j.class, "transformation;billboardConstraints;brightnessOverride;shadowRadius;shadowStrength;glowColorOverride", "a", "b", "c", "d", "e", "f"}, this, $$0);
        }

        public e<i> a() {
            return this.a;
        }

        public a b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public d d() {
            return this.d;
        }

        public d e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a(0, "fixed");
        public static final /* enum */ a b = new a(1, "vertical");
        public static final /* enum */ a c = new a(2, "horizontal");
        public static final /* enum */ a d = new a(3, "center");
        public static final Codec<a> e;
        public static final IntFunction<a> f;
        private final byte g;
        private final String h;
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(byte $$0, String $$1) {
            this.h = $$1;
            this.g = $$0;
        }

        @Override
        public String c() {
            return this.h;
        }

        byte a() {
            return this.g;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d};
        }

        static {
            i = cgh$a.b();
            e = bhh.a(a::values);
            f = beu.a(a::a, cgh$a.values(), beu.a.a);
        }
    }

    @FunctionalInterface
    public static interface e<T> {
        public static <T> e<T> constant(T $$0) {
            return $$1 -> $$0;
        }

        public T get(float var1);
    }

    @FunctionalInterface
    public static interface d {
        public static d constant(float $$0) {
            return $$1 -> $$0;
        }

        public float get(float var1);
    }

    record l(i a, i b) implements e<i>
    {
        public i a(float $$0) {
            if ((double)$$0 >= 1.0) {
                return this.b;
            }
            return this.a.a(this.b, $$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{l.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{l.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{l.class, "previous;current", "a", "b"}, this, $$0);
        }

        @Override
        public /* synthetic */ Object get(float f2) {
            return this.a(f2);
        }
    }

    record h(float a, float b) implements d
    {
        @Override
        public float get(float $$0) {
            return bgj.h($$0, this.a, this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{h.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{h.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{h.class, "previous;current", "a", "b"}, this, $$0);
        }
    }

    record c(int a, int b) implements f
    {
        @Override
        public int get(float $$0) {
            return bel.a($$0, this.a, this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "previous;current", "a", "b"}, this, $$0);
        }
    }

    record i(int a, int b) implements f
    {
        @Override
        public int get(float $$0) {
            return bgj.a($$0, this.a, this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{i.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{i.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{i.class, "previous;current", "a", "b"}, this, $$0);
        }
    }

    @FunctionalInterface
    public static interface f {
        public static f constant(int $$0) {
            return $$1 -> $$0;
        }

        public int get(float var1);
    }

    public static class k
    extends cgh {
        public static final String o = "text";
        private static final String aN = "line_width";
        private static final String aO = "text_opacity";
        private static final String aP = "background";
        private static final String aQ = "shadow";
        private static final String aR = "see_through";
        private static final String aS = "default_background";
        private static final String aT = "alignment";
        public static final byte p = 1;
        public static final byte q = 2;
        public static final byte r = 4;
        public static final byte s = 8;
        public static final byte t = 16;
        private static final byte aU = -1;
        public static final int u = 0x40000000;
        private static final int aV = 200;
        private static final alw<yh> aW = ama.a(k.class, aly.f);
        private static final alw<Integer> aX = ama.a(k.class, aly.b);
        private static final alw<Integer> aY = ama.a(k.class, aly.b);
        private static final alw<Byte> aZ = ama.a(k.class, aly.a);
        private static final alw<Byte> ba = ama.a(k.class, aly.a);
        private static final IntSet bb = IntSet.of((int[])new int[]{aW.a(), aX.a(), aY.a(), aZ.a(), ba.a()});
        private @Nullable b bc;
        private @Nullable e bd;

        public k(cgu<?> $$0, dwo $$1) {
            super($$0, $$1);
        }

        @Override
        protected void a(ama.a $$0) {
            super.a($$0);
            $$0.a(aW, yh.i());
            $$0.a(aX, 200);
            $$0.a(aY, 0x40000000);
            $$0.a(aZ, (byte)-1);
            $$0.a(ba, (byte)0);
        }

        @Override
        public void a(alw<?> $$0) {
            super.a($$0);
            if (bb.contains($$0.a())) {
                this.n = true;
            }
        }

        private yh m() {
            return this.az.a(aW);
        }

        private void a(yh $$0) {
            this.az.a(aW, $$0);
        }

        @Override
        private int n() {
            return this.az.a(aX);
        }

        @Override
        private void a(int $$0) {
            this.az.a(aX, $$0);
        }

        private byte p() {
            return this.az.a(aZ);
        }

        private void c(byte $$0) {
            this.az.a(aZ, $$0);
        }

        private int q() {
            return this.az.a(aY);
        }

        @Override
        private void b(int $$0) {
            this.az.a(aY, $$0);
        }

        private byte r() {
            return this.az.a(ba);
        }

        private void d(byte $$0) {
            this.az.a(ba, $$0);
        }

        private static byte a(byte $$0, fnq $$1, String $$2, byte $$3) {
            if ($$1.a($$2, false)) {
                return (byte)($$0 | $$3);
            }
            return $$0;
        }

        @Override
        protected void a(fnq $$0) {
            super.a($$0);
            this.a($$0.a(aN, 200));
            this.c($$0.a(aO, (byte)-1));
            this.b($$0.a(aP, 0x40000000));
            byte $$1 = cgh$k.a((byte)0, $$0, aQ, (byte)1);
            $$1 = cgh$k.a($$1, $$0, aR, (byte)2);
            $$1 = cgh$k.a($$1, $$0, aS, (byte)4);
            Optional<a> $$2 = $$0.a(aT, a.d);
            if ($$2.isPresent()) {
                $$1 = switch ($$2.get().ordinal()) {
                    default -> throw new MatchException(null, null);
                    case 0 -> $$1;
                    case 1 -> (byte)($$1 | 8);
                    case 2 -> (byte)($$1 | 0x10);
                };
            }
            this.d($$1);
            Optional<yh> $$3 = $$0.a(o, yj.a);
            if ($$3.isPresent()) {
                try {
                    dwo dwo2 = this.ao();
                    if (dwo2 instanceof axf) {
                        axf $$4 = (axf)dwo2;
                        ed $$5 = this.d($$4).a(bbh.c);
                        yw $$6 = yk.a($$5, $$3.get(), (cgk)this, 0);
                        this.a($$6);
                    } else {
                        this.a(yh.i());
                    }
                }
                catch (Exception $$7) {
                    o.warn("Failed to parse display entity text {}", $$3, (Object)$$7);
                }
            }
        }

        private static void a(byte $$0, fns $$1, String $$2, byte $$3) {
            $$1.a($$2, ($$0 & $$3) != 0);
        }

        @Override
        protected void a(fns $$0) {
            super.a($$0);
            $$0.a(o, yj.a, this.m());
            $$0.a(aN, this.n());
            $$0.a(aP, this.q());
            $$0.a(aO, this.p());
            byte $$1 = this.r();
            cgh$k.a($$1, $$0, aQ, (byte)1);
            cgh$k.a($$1, $$0, aR, (byte)2);
            cgh$k.a($$1, $$0, aS, (byte)4);
            $$0.a(aT, a.d, cgh$k.a($$1));
        }

        @Override
        protected void a(boolean $$0, float $$1) {
            this.bd = $$0 && this.bd != null ? this.a(this.bd, $$1) : this.s();
            this.bc = null;
        }

        public @Nullable e k() {
            return this.bd;
        }

        private e s() {
            return new e(this.m(), this.n(), cgh$f.constant(this.p()), cgh$f.constant(this.q()), this.r());
        }

        private e a(e $$0, float $$1) {
            int $$2 = $$0.d.get($$1);
            int $$3 = $$0.c.get($$1);
            return new e(this.m(), this.n(), new i($$3, this.p()), new cgh$c($$2, this.q()), this.r());
        }

        public b a(d $$0) {
            if (this.bc == null) {
                this.bc = this.bd != null ? $$0.split(this.bd.a(), this.bd.b()) : new b(List.of(), 0);
            }
            return this.bc;
        }

        public static a a(byte $$0) {
            if (($$0 & 8) != 0) {
                return a.b;
            }
            if (($$0 & 0x10) != 0) {
                return a.c;
            }
            return a.a;
        }

        public static final class a
        extends Enum<a>
        implements bhh {
            public static final /* enum */ a a = new a("center");
            public static final /* enum */ a b = new a("left");
            public static final /* enum */ a c = new a("right");
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
                f = cgh$k$a.a();
                d = bhh.a(a::values);
            }
        }

        public static final class e
        extends Record {
            private final yh a;
            private final int b;
            final f c;
            final f d;
            private final byte e;

            public e(yh $$0, int $$1, f $$2, f $$3, byte $$4) {
                this.a = $$0;
                this.b = $$1;
                this.c = $$2;
                this.d = $$3;
                this.e = $$4;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "text;lineWidth;textOpacity;backgroundColor;flags", "a", "b", "c", "d", "e"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "text;lineWidth;textOpacity;backgroundColor;flags", "a", "b", "c", "d", "e"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "text;lineWidth;textOpacity;backgroundColor;flags", "a", "b", "c", "d", "e"}, this, $$0);
            }

            public yh a() {
                return this.a;
            }

            public int b() {
                return this.b;
            }

            public f c() {
                return this.c;
            }

            public f d() {
                return this.d;
            }

            public byte e() {
                return this.e;
            }
        }

        public record b(List<c> a, int b) {
            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "lines;width", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "lines;width", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "lines;width", "a", "b"}, this, $$0);
            }
        }

        @FunctionalInterface
        public static interface d {
            public b split(yh var1, int var2);
        }

        public record c(bfr a, int b) {
            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "contents;width", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "contents;width", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "contents;width", "a", "b"}, this, $$0);
            }
        }
    }

    public static class b
    extends cgh {
        public static final String o = "block_state";
        private static final alw<eoh> p = ama.a(b.class, aly.i);
        private @Nullable a q;

        public b(cgu<?> $$0, dwo $$1) {
            super($$0, $$1);
        }

        @Override
        protected void a(ama.a $$0) {
            super.a($$0);
            $$0.a(p, dzs.a.m());
        }

        @Override
        public void a(alw<?> $$0) {
            super.a($$0);
            if ($$0.equals(p)) {
                this.n = true;
            }
        }

        private eoh m() {
            return this.az.a(p);
        }

        private void c(eoh $$0) {
            this.az.a(p, $$0);
        }

        @Override
        protected void a(fnq $$0) {
            super.a($$0);
            this.c($$0.a(o, eoh.a).orElse(dzs.a.m()));
        }

        @Override
        protected void a(fns $$0) {
            super.a($$0);
            $$0.a(o, eoh.a, this.m());
        }

        public @Nullable a k() {
            return this.q;
        }

        @Override
        protected void a(boolean $$0, float $$1) {
            this.q = new a(this.m());
        }

        public record a(eoh a) {
            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "blockState", "a"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "blockState", "a"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "blockState", "a"}, this, $$0);
            }
        }
    }

    public static class g
    extends cgh {
        private static final String o = "item";
        private static final String p = "item_display";
        private static final alw<dlt> q = ama.a(g.class, aly.h);
        private static final alw<Byte> r = ama.a(g.class, aly.a);
        private final cic s = cic.a(this::m, this::a);
        private @Nullable a t;

        public g(cgu<?> $$0, dwo $$1) {
            super($$0, $$1);
        }

        @Override
        protected void a(ama.a $$0) {
            super.a($$0);
            $$0.a(q, dlt.l);
            $$0.a(r, dlr.a.a());
        }

        @Override
        public void a(alw<?> $$0) {
            super.a($$0);
            if (q.equals($$0) || r.equals($$0)) {
                this.n = true;
            }
        }

        private dlt m() {
            return this.az.a(q);
        }

        private void a(dlt $$0) {
            this.az.a(q, $$0);
        }

        private void a(dlr $$0) {
            this.az.a(r, $$0.a());
        }

        private dlr n() {
            return dlr.l.apply(this.az.a(r).byteValue());
        }

        @Override
        protected void a(fnq $$0) {
            super.a($$0);
            this.a($$0.a(o, dlt.b).orElse(dlt.l));
            this.a($$0.a(p, dlr.k).orElse(dlr.a));
        }

        @Override
        protected void a(fns $$0) {
            super.a($$0);
            dlt $$1 = this.m();
            if (!$$1.f()) {
                $$0.a(o, dlt.b, $$1);
            }
            $$0.a(p, dlr.k, this.n());
        }

        @Override
        public @Nullable cic a_(int $$0) {
            if ($$0 == 0) {
                return this.s;
            }
            return null;
        }

        public @Nullable a k() {
            return this.t;
        }

        @Override
        protected void a(boolean $$0, float $$1) {
            dlt $$2 = this.m();
            $$2.a(this);
            this.t = new a($$2, this.n());
        }

        public record a(dlt a, dlr b) {
            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "itemStack;itemTransform", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "itemStack;itemTransform", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "itemStack;itemTransform", "a", "b"}, this, $$0);
            }
        }
    }
}

