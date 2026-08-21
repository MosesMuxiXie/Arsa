/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public class ctr
extends cth
implements cti {
    public static final int cv = 200;
    private static final int cG = 10;
    protected static final ImmutableList<? extends cse<? extends csd<? super ctr>>> cw = ImmutableList.of(cse.c, cse.o, cse.f, cse.q, cse.r);
    protected static final ImmutableList<? extends cqw<?>> cx = ImmutableList.of(cqw.s, cqw.g, cqw.h, cqw.k, cqw.l, cqw.o, cqw.n, cqw.F, cqw.u, cqw.p, cqw.q, cqw.L, (Object[])new cqw[]{cqw.z, cqw.O, cqw.C, cqw.P, cqw.Q, cqw.S, cqw.V, cqw.aa});
    private static final alw<Integer> cH = ama.a(ctr.class, aly.b);
    private static final alw<Boolean> cI = ama.a(ctr.class, aly.k);
    private static final alw<Boolean> cJ = ama.a(ctr.class, aly.k);
    public static final double cz = 20.0;
    public static final int cA = 1200;
    private static final int cK = 6000;
    public static final String cB = "Variant";
    private static final int cL = 1800;
    private static final int cM = 2400;
    private static final boolean cN = false;
    public final bep cC = new bep(10, bfj.x);
    public final bep cD = new bep(10, bfj.x);
    public final bep cE = new bep(10, bfj.x);
    public final bep cF = new bep(10, bfj.x);
    private static final int cO = 100;

    public ctr(cgu<? extends ctr> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
        this.a(fls.j, 0.0f);
        this.cp = new d(this);
        this.co = new c(this, 20);
    }

    @Override
    public float a(is $$0, dwr $$1) {
        return 0.0f;
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cH, 0);
        $$0.a(cI, false);
        $$0.a(cJ, false);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a(cB, ctr$e.i, this.gP());
        $$0.a("FromBucket", this.a());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a($$0.a(cB, ctr$e.i).orElse(ctr$e.f));
        this.a($$0.a("FromBucket", false));
    }

    @Override
    public void T() {
        if (this.gQ()) {
            return;
        }
        super.T();
    }

    @Override
    public cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        boolean $$4 = false;
        if ($$2 == cgt.l) {
            return $$3;
        }
        bgr $$5 = $$0.G_();
        if ($$3 instanceof b) {
            if (((b)$$3).a() >= 2) {
                $$4 = true;
            }
        } else {
            $$3 = new b(ctr$e.a($$5), ctr$e.a($$5));
        }
        this.a(((b)$$3).a($$5));
        if ($$4) {
            this.d_(-24000);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void aJ() {
        dwo dwo2;
        int $$0 = this.cK();
        super.aJ();
        if (!this.gG() && (dwo2 = this.ao()) instanceof axf) {
            axf $$1 = (axf)dwo2;
            this.a($$1, $$0);
        }
        if (this.ao().B_()) {
            this.gS();
        }
    }

    private void gS() {
        a $$3;
        if (this.gQ()) {
            a $$0 = ctr$a.a;
        } else if (this.by()) {
            a $$1 = ctr$a.b;
        } else if (this.aV()) {
            a $$2 = ctr$a.c;
        } else {
            $$3 = ctr$a.d;
        }
        this.cC.a($$3 == ctr$a.a);
        this.cD.a($$3 == ctr$a.b);
        this.cE.a($$3 == ctr$a.c);
        boolean $$4 = this.bB.d() || this.ee() != this.ac || this.ec() != this.ab;
        this.cF.a($$4);
    }

    protected void a(axf $$0, int $$1) {
        if (this.cb() && !this.bA()) {
            this.j($$1 - 1);
            if (this.eA()) {
                this.j(0);
                this.a($$0, this.en().t(), 2.0f);
            }
        } else {
            this.j(this.cJ());
        }
    }

    public void p() {
        int $$0 = this.cK() + 1800;
        this.j(Math.min($$0, this.cJ()));
    }

    @Override
    public int cJ() {
        return 6000;
    }

    public e gP() {
        return ctr$e.a(this.az.a(cH));
    }

    private void a(e $$0) {
        this.az.a(cH, $$0.a());
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aW) {
            return ctr.c($$0, this.gP());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aW);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aW) {
            this.a(ctr.c(ki.aW, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    private static boolean a(bgr $$0) {
        return $$0.a(1200) == 0;
    }

    @Override
    public boolean a(dwr $$0) {
        return $$0.f(this);
    }

    @Override
    public boolean db() {
        return false;
    }

    public void x(boolean $$0) {
        this.az.a(cI, $$0);
    }

    public boolean gQ() {
        return this.az.a(cI);
    }

    @Override
    public boolean a() {
        return this.az.a(cJ);
    }

    @Override
    public void a(boolean $$0) {
        this.az.a(cJ, $$0);
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        ctr $$2 = cgu.j.a($$0, cgt.e);
        if ($$2 != null) {
            e $$4;
            if (ctr.a(this.as)) {
                e $$3 = ctr$e.b(this.as);
            } else {
                $$4 = this.as.h() ? this.gP() : ((ctr)$$1).gP();
            }
            $$2.a($$4);
            $$2.gz();
        }
        return $$2;
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.bh);
    }

    @Override
    public boolean aj_() {
        return true;
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("axolotlBrain");
        this.ev().a($$0, this);
        $$1.c();
        $$1.a("axolotlActivityUpdate");
        cts.a(this);
        $$1.c();
        if (!this.gG()) {
            Optional<Integer> $$2 = this.ev().c(cqw.O);
            this.x($$2.isPresent() && $$2.get() > 0);
        }
    }

    public static cir.a gR() {
        return cth.gW().a(cis.u, 14.0).a(cis.x, 1.0).a(cis.d, 2.0).a(cis.D, 1.0);
    }

    @Override
    protected cre b(dwo $$0) {
        return new crb(this, $$0);
    }

    @Override
    public void fN() {
        this.a(bda.aN, 1.0f, 1.0f);
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        float $$3 = this.eZ();
        if (!this.gG() && this.ao().y.a(3) == 0 && ((float)this.ao().y.a(3) < $$2 || $$3 / this.fq() < 0.5f) && $$2 < $$3 && this.by() && ($$1.d() != null || $$1.c() != null) && !this.gQ()) {
            this.ca.a(cqw.O, 200);
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public int ac() {
        return 1;
    }

    @Override
    public int ae() {
        return 1;
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        return cti.a($$0, $$1, this).orElse(super.b($$0, $$1));
    }

    @Override
    public void a(dlt $$02) {
        cti.a((chn)this, $$02);
        $$02.a(ki.aW, (kd)this);
        doe.a(ki.ag, $$02, (uz $$0) -> {
            $$0.a("Age", this.Z_());
            cim<ctr> $$1 = this.ev();
            if ($$1.a(cqw.V)) {
                $$0.a("HuntingCooldown", $$1.e(cqw.V));
            }
        });
    }

    @Override
    public void a(uz $$0) {
        cti.a((chn)this, $$0);
        this.d_($$0.b("Age", 0));
        $$0.f("HuntingCooldown").ifPresentOrElse($$1 -> this.ev().a(cqw.V, true, $$0.b("HuntingCooldown", 0L)), () -> this.ev().a(cqw.V, Optional.empty()));
    }

    @Override
    public dlt b() {
        return new dlt(dlx.sv);
    }

    @Override
    public bcz c() {
        return bda.dw;
    }

    @Override
    public boolean eS() {
        return !this.gQ() && super.eS();
    }

    public static void a(axf $$0, ctr $$1, chl $$2) {
        cgk $$4;
        cex $$3;
        if ($$2.fa() && ($$3 = $$2.fb()) != null && ($$4 = $$3.d()) != null && $$4.ay() == cgu.cb) {
            ddm $$5 = (ddm)$$4;
            List<ddm> $$6 = $$0.a(ddm.class, $$1.dj().g(20.0));
            if ($$6.contains($$5)) {
                $$1.g($$5);
            }
        }
    }

    public void g(ddm $$0) {
        cfm $$1 = $$0.e(cfo.j);
        if ($$1 == null || $$1.a(2399)) {
            int $$2 = $$1 != null ? $$1.d() : 0;
            int $$3 = Math.min(2400, 100 + $$2);
            $$0.b(new cfm(cfo.j, $$3, 0), (cgk)this);
        }
        $$0.g(cfo.d);
    }

    @Override
    public boolean ab() {
        return super.ab() || this.a();
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.aP;
    }

    @Override
    protected @Nullable bcz fd() {
        return bda.aO;
    }

    @Override
    protected @Nullable bcz W() {
        return this.by() ? bda.aR : bda.aQ;
    }

    @Override
    protected bcz bl() {
        return bda.aS;
    }

    @Override
    protected bcz bk() {
        return bda.aT;
    }

    protected cim.b<ctr> ew() {
        return cim.a(cx, cw);
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return cts.a(this.ew().a($$0));
    }

    public cim<ctr> ev() {
        return super.ev();
    }

    @Override
    protected void a(ftm $$0, double $$1, boolean $$2, double $$3) {
        this.a(this.fM(), $$0);
        this.a(chp.a, this.dN());
        this.k(this.dN().c(0.9));
    }

    @Override
    protected void a(ddm $$0, cdb $$1, dlt $$2) {
        if ($$2.a(dlx.su)) {
            $$0.a($$1, dlw.a($$2, $$0, new dlt(dlx.sl)));
        } else {
            super.a($$0, $$1, $$2);
        }
    }

    @Override
    public boolean i(double $$0) {
        return !this.a() && !this.i_();
    }

    @Override
    public @Nullable chl ag_() {
        return this.Q();
    }

    public static boolean a(cgu<? extends chl> $$0, dxf $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.a_($$3.e()).a(bdp.cn);
    }

    static class d
    extends cns {
        private final ctr l;

        public d(ctr $$0) {
            super($$0, 85, 10, 0.1f, 0.5f, false);
            this.l = $$0;
        }

        @Override
        public void a() {
            if (!this.l.gQ()) {
                super.a();
            }
        }
    }

    class c
    extends cnr {
        public c(ctr $$0, int $$1) {
            super($$0, $$1);
        }

        @Override
        public void a() {
            if (!ctr.this.gQ()) {
                super.a();
            }
        }
    }

    public static final class e
    extends Enum<e>
    implements bhh {
        public static final /* enum */ e a = new e(0, "lucy", true);
        public static final /* enum */ e b = new e(1, "wild", true);
        public static final /* enum */ e c = new e(2, "gold", true);
        public static final /* enum */ e d = new e(3, "cyan", true);
        public static final /* enum */ e e = new e(4, "blue", false);
        public static final e f;
        private static final IntFunction<e> j;
        public static final aao<ByteBuf, e> g;
        public static final Codec<e> h;
        @Deprecated
        public static final Codec<e> i;
        private final int k;
        private final String l;
        private final boolean m;
        private static final /* synthetic */ e[] n;

        public static e[] values() {
            return (e[])n.clone();
        }

        public static e valueOf(String $$0) {
            return Enum.valueOf(e.class, $$0);
        }

        private e(int $$0, String $$1, boolean $$2) {
            this.k = $$0;
            this.l = $$1;
            this.m = $$2;
        }

        public int a() {
            return this.k;
        }

        public String b() {
            return this.l;
        }

        @Override
        public String c() {
            return this.l;
        }

        public static e a(int $$0) {
            return j.apply($$0);
        }

        public static e a(bgr $$0) {
            return ctr$e.a($$0, true);
        }

        public static e b(bgr $$0) {
            return ctr$e.a($$0, false);
        }

        private static e a(bgr $$0, boolean $$12) {
            e[] $$2 = (e[])Arrays.stream(ctr$e.values()).filter($$1 -> $$1.m == $$12).toArray(e[]::new);
            return bhs.a($$2, $$0);
        }

        private static /* synthetic */ e[] d() {
            return new e[]{a, b, c, d, e};
        }

        static {
            n = ctr$e.d();
            f = a;
            j = beu.a(e::a, ctr$e.values(), beu.a.a);
            g = aam.a(j, e::a);
            h = bhh.a(e::values);
            i = Codec.INT.xmap(j::apply, e::a);
        }
    }

    public static class b
    extends cfy.a {
        public final e[] a;

        public b(e ... $$0) {
            super(false);
            this.a = $$0;
        }

        public e a(bgr $$0) {
            return this.a[$$0.a(this.a.length)];
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = ctr$a.a();
        }
    }
}

