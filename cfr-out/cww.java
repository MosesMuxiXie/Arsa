/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public class cww
extends cth {
    private static final alw<Integer> cx = ama.a(cww.class, aly.b);
    private static final alw<Integer> cz = ama.a(cww.class, aly.b);
    private static final alw<Integer> cA = ama.a(cww.class, aly.b);
    private static final alw<Byte> cB = ama.a(cww.class, aly.a);
    private static final alw<Byte> cC = ama.a(cww.class, aly.a);
    private static final alw<Byte> cD = ama.a(cww.class, aly.a);
    static final csk cE = csk.b().a(8.0);
    private static final cgn cF = cgu.aU.n().a(0.5f).a(cgm.a().a(cgl.a, 0.0f, 0.40625f, 0.0f));
    private static final int cG = 2;
    private static final int cH = 4;
    private static final int cI = 8;
    private static final int cJ = 16;
    private static final int cK = 5;
    public static final int cv = 32;
    private static final int cL = 32;
    boolean cM;
    boolean cN;
    public int cw;
    private ftm cO;
    private float cP;
    private float cQ;
    private float cR;
    private float cU;
    private float cV;
    private float cW;
    g cX;

    public cww(cgu<? extends cww> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
        this.cp = new h(this);
        if (!this.e_()) {
            this.b_(true);
        }
    }

    @Override
    protected boolean f(cgv $$0) {
        return $$0 == cgv.a && this.gn();
    }

    public int p() {
        return this.az.a(cx);
    }

    public void s(int $$0) {
        this.az.a(cx, $$0);
    }

    public boolean gP() {
        return this.v(2);
    }

    public boolean gQ() {
        return this.v(8);
    }

    public void x(boolean $$0) {
        this.d(8, $$0);
    }

    public boolean gR() {
        return this.v(16);
    }

    public void y(boolean $$0) {
        this.d(16, $$0);
    }

    public boolean gS() {
        return this.az.a(cA) > 0;
    }

    public void z(boolean $$0) {
        this.az.a(cA, $$0 ? 1 : 0);
    }

    private int ho() {
        return this.az.a(cA);
    }

    private void u(int $$0) {
        this.az.a(cA, $$0);
    }

    public void A(boolean $$0) {
        this.d(2, $$0);
        if (!$$0) {
            this.t(0);
        }
    }

    public int gT() {
        return this.az.a(cz);
    }

    public void t(int $$0) {
        this.az.a(cz, $$0);
    }

    public a gU() {
        return cww$a.a(this.az.a(cB).byteValue());
    }

    public void a(a $$0) {
        if ($$0.a() > 6) {
            $$0 = cww$a.a(this.as);
        }
        this.az.a(cB, (byte)$$0.a());
    }

    public a gV() {
        return cww$a.a(this.az.a(cC).byteValue());
    }

    public void b(a $$0) {
        if ($$0.a() > 6) {
            $$0 = cww$a.a(this.as);
        }
        this.az.a(cC, (byte)$$0.a());
    }

    public boolean hd() {
        return this.v(4);
    }

    public void B(boolean $$0) {
        this.d(4, $$0);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cx, 0);
        $$0.a(cz, 0);
        $$0.a(cB, (byte)0);
        $$0.a(cC, (byte)0);
        $$0.a(cD, (byte)0);
        $$0.a(cA, 0);
    }

    private boolean v(int $$0) {
        return (this.az.a(cD) & $$0) != 0;
    }

    private void d(int $$0, boolean $$1) {
        byte $$2 = this.az.a(cD);
        if ($$1) {
            this.az.a(cD, (byte)($$2 | $$0));
        } else {
            this.az.a(cD, (byte)($$2 & ~$$0));
        }
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("MainGene", cww$a.h, this.gU());
        $$0.a("HiddenGene", cww$a.h, this.gV());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a($$0.a("MainGene", cww$a.h).orElse(cww$a.a));
        this.b($$0.a("HiddenGene", cww$a.h).orElse(cww$a.a));
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        cww $$2 = cgu.aU.a($$0, cgt.e);
        if ($$2 != null) {
            if ($$1 instanceof cww) {
                cww $$3 = (cww)$$1;
                $$2.a(this, $$3);
            }
            $$2.hm();
        }
        return $$2;
    }

    @Override
    protected void D() {
        this.cs.a(0, new coh(this));
        this.cs.a(2, new i(this, 2.0));
        this.cs.a(2, new d(this, 1.0));
        this.cs.a(3, new b(this, (double)1.2f, true));
        this.cs.a(4, new cpy(this, 1.0, $$0 -> $$0.a(bdy.aY), false));
        this.cs.a(6, new c<ddm>(this, ddm.class, 8.0f, 2.0, 2.0));
        this.cs.a(6, new c<czz>(this, czz.class, 4.0f, 2.0, 2.0));
        this.cs.a(7, new k());
        this.cs.a(8, new f(this));
        this.cs.a(8, new l(this));
        this.cX = new g(this, ddm.class, 6.0f);
        this.cs.a(9, this.cX);
        this.cs.a(10, new cpk(this));
        this.cs.a(12, new j(this));
        this.cs.a(13, new coo(this, 1.25));
        this.cs.a(14, new cqd(this, 1.0));
        this.ct.a(1, new e(this, new Class[0]).a(new Class[0]));
    }

    public static cir.a he() {
        return cth.gW().a(cis.x, 0.15f).a(cis.d, 6.0);
    }

    public a hf() {
        return cww$a.a(this.gU(), this.gV());
    }

    public boolean hg() {
        return this.hf() == cww$a.b;
    }

    public boolean hh() {
        return this.hf() == cww$a.c;
    }

    public boolean hi() {
        return this.hf() == cww$a.d;
    }

    public boolean hj() {
        return this.hf() == cww$a.e;
    }

    public boolean hk() {
        return this.hf() == cww$a.f;
    }

    @Override
    public boolean gI() {
        return this.hf() == cww$a.g;
    }

    @Override
    public boolean aj_() {
        return false;
    }

    @Override
    public boolean c(axf $$0, cgk $$1) {
        if (!this.gI()) {
            this.cN = true;
        }
        return super.c($$0, $$1);
    }

    @Override
    public void fN() {
        this.a(bda.vh, 1.0f, 1.0f);
    }

    @Override
    public void g() {
        chl $$0;
        super.g();
        if (this.hh()) {
            if (this.ao().an() && !this.by()) {
                this.x(true);
                this.z(false);
            } else if (!this.gS()) {
                this.x(false);
            }
        }
        if (($$0 = this.ag_()) == null) {
            this.cM = false;
            this.cN = false;
        }
        if (this.p() > 0) {
            if ($$0 != null) {
                this.a((cgk)$$0, 90.0f, 90.0f);
            }
            if (this.p() == 29 || this.p() == 14) {
                this.a(bda.vd, 1.0f, 1.0f);
            }
            this.s(this.p() - 1);
        }
        if (this.gP()) {
            this.t(this.gT() + 1);
            if (this.gT() > 20) {
                this.A(false);
                this.hv();
            } else if (this.gT() == 1) {
                this.a(bda.uX, 1.0f, 1.0f);
            }
        }
        if (this.hd()) {
            this.hu();
        } else {
            this.cw = 0;
        }
        if (this.gQ()) {
            this.w(0.0f);
        }
        this.hr();
        this.hp();
        this.hs();
        this.ht();
    }

    public boolean hl() {
        return this.hh() && this.ao().an();
    }

    private void hp() {
        if (!this.gS() && this.gQ() && !this.hl() && !this.a(cgv.a).f() && this.as.a(80) == 1) {
            this.z(true);
        } else if (this.a(cgv.a).f() || !this.gQ()) {
            this.z(false);
        }
        if (this.gS()) {
            this.hq();
            if (!this.ao().B_() && this.ho() > 80 && this.as.a(20) == 1) {
                if (this.ho() > 100 && this.a(cgv.a).a(bdy.aZ)) {
                    if (!this.ao().B_()) {
                        this.a(cgv.a, dlt.l);
                        this.c(etk.m);
                    }
                    this.x(false);
                }
                this.z(false);
                return;
            }
            this.u(this.ho() + 1);
        }
    }

    private void hq() {
        if (this.ho() % 5 == 0) {
            this.a(bda.vb, 0.5f + 0.5f * (float)this.as.a(2), (this.as.i() - this.as.i()) * 0.2f + 1.0f);
            for (int $$0 = 0; $$0 < 6; ++$$0) {
                ftm $$1 = new ftm(((double)this.as.i() - 0.5) * 0.1, (double)this.as.i() * 0.1 + 0.1, ((double)this.as.i() - 0.5) * 0.1);
                $$1 = $$1.a(-this.ee() * ((float)Math.PI / 180));
                $$1 = $$1.b(-this.ec() * ((float)Math.PI / 180));
                double $$2 = (double)(-this.as.i()) * 0.6 - 0.3;
                ftm $$3 = new ftm(((double)this.as.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.as.i() - 0.5) * 0.4);
                $$3 = $$3.b(-this.bC * ((float)Math.PI / 180));
                $$3 = $$3.b(this.dP(), this.dT() + 1.0, this.dV());
                this.ao().a(new lu(ly.V, this.a(cgv.a)), $$3.g, $$3.h, $$3.i, $$1.g, $$1.h + 0.05, $$1.i);
            }
        }
    }

    private void hr() {
        this.cQ = this.cP;
        this.cP = this.gQ() ? Math.min(1.0f, this.cP + 0.15f) : Math.max(0.0f, this.cP - 0.19f);
    }

    private void hs() {
        this.cU = this.cR;
        this.cR = this.gR() ? Math.min(1.0f, this.cR + 0.15f) : Math.max(0.0f, this.cR - 0.19f);
    }

    private void ht() {
        this.cW = this.cV;
        this.cV = this.hd() ? Math.min(1.0f, this.cV + 0.15f) : Math.max(0.0f, this.cV - 0.19f);
    }

    public float L(float $$0) {
        return bgj.h($$0, this.cQ, this.cP);
    }

    public float M(float $$0) {
        return bgj.h($$0, this.cU, this.cR);
    }

    public float N(float $$0) {
        return bgj.h($$0, this.cW, this.cV);
    }

    private void hu() {
        ++this.cw;
        if (this.cw > 32) {
            this.B(false);
            return;
        }
        if (!this.ao().B_()) {
            ftm $$0 = this.dN();
            if (this.cw == 1) {
                float $$1 = this.ec() * ((float)Math.PI / 180);
                float $$2 = this.e_() ? 0.1f : 0.2f;
                this.cO = new ftm($$0.g + (double)(-bgj.a((double)$$1) * $$2), 0.0, $$0.i + (double)(bgj.b((double)$$1) * $$2));
                this.k(this.cO.b(0.0, 0.27, 0.0));
            } else if ((float)this.cw == 7.0f || (float)this.cw == 15.0f || (float)this.cw == 23.0f) {
                this.m(0.0, this.aV() ? 0.27 : $$0.h, 0.0);
            } else {
                this.m(this.cO.g, $$0.h, this.cO.i);
            }
        }
    }

    private void hv() {
        axf $$4;
        ftm $$0 = this.dN();
        dwo $$1 = this.ao();
        $$1.a(ly.ak, this.dP() - (double)(this.dF() + 1.0f) * 0.5 * (double)bgj.a((double)(this.bC * ((float)Math.PI / 180))), this.dT() - (double)0.1f, this.dV() + (double)(this.dF() + 1.0f) * 0.5 * (double)bgj.b((double)(this.bC * ((float)Math.PI / 180))), $$0.g, 0.0, $$0.i);
        this.a(bda.uY, 1.0f, 1.0f);
        List<cww> $$2 = $$1.a(cww.class, this.dj().g(10.0));
        for (cww $$3 : $$2) {
            if ($$3.e_() || !$$3.aV() || $$3.by() || !$$3.hn()) continue;
            $$3.u();
        }
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf && ($$4 = (axf)dwo2).U().a(eua.D).booleanValue()) {
            this.a($$4, fnv.aH, this::a);
        }
    }

    @Override
    protected void a(axf $$0, czl $$1) {
        if (this.a(cgv.a).f() && cww.b($$1)) {
            this.a($$1);
            dlt $$2 = $$1.e();
            this.a(cgv.a, $$2);
            this.g(cgv.a);
            this.a((cgk)$$1, $$2.N());
            $$1.aC();
        }
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        this.x(false);
        return super.a($$0, $$1, $$2);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        bgr $$4 = $$0.G_();
        this.a(cww$a.a($$4));
        this.b(cww$a.a($$4));
        this.hm();
        if ($$3 == null) {
            $$3 = new cfy.a(0.2f);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    public void a(cww $$0, @Nullable cww $$1) {
        if ($$1 == null) {
            if (this.as.h()) {
                this.a($$0.hw());
                this.b(cww$a.a(this.as));
            } else {
                this.a(cww$a.a(this.as));
                this.b($$0.hw());
            }
        } else if (this.as.h()) {
            this.a($$0.hw());
            this.b($$1.hw());
        } else {
            this.a($$1.hw());
            this.b($$0.hw());
        }
        if (this.as.a(32) == 0) {
            this.a(cww$a.a(this.as));
        }
        if (this.as.a(32) == 0) {
            this.b(cww$a.a(this.as));
        }
    }

    private a hw() {
        if (this.as.h()) {
            return this.gU();
        }
        return this.gV();
    }

    public void hm() {
        if (this.hk()) {
            this.h(cis.u).a(10.0);
        }
        if (this.hg()) {
            this.h(cis.x).a(0.07f);
        }
    }

    void hx() {
        if (!this.by()) {
            this.I(0.0f);
            this.N().n();
            this.x(true);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if (this.hl()) {
            return cdc.e;
        }
        if (this.gR()) {
            this.y(false);
            return cdc.a;
        }
        if (!this.j($$2)) return cdc.e;
        if (this.ag_() != null) {
            this.cM = true;
        }
        if (this.e_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.Z_() / 20) * 0.1f), true);
            return cdc.b;
        } else if (!this.ao().B_() && this.Z_() == 0 && this.gY()) {
            this.a($$0, $$1, $$2);
            this.h($$0);
            return cdc.b;
        } else {
            dwo dwo2 = this.ao();
            if (!(dwo2 instanceof axf)) return cdc.e;
            axf $$3 = (axf)dwo2;
            if (this.gQ() || this.by()) return cdc.e;
            this.hx();
            this.z(true);
            dlt $$4 = this.a(cgv.a);
            if (!$$4.f() && !$$0.gv()) {
                this.a($$3, $$4);
            }
            this.a(cgv.a, new dlt($$2.h(), 1));
            this.a($$0, $$1, $$2);
        }
        return cdc.b;
    }

    @Override
    protected @Nullable bcz W() {
        if (this.gI()) {
            return bda.ve;
        }
        if (this.hh()) {
            return bda.vf;
        }
        return bda.uZ;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.vc, 0.15f, 1.0f);
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aY);
    }

    @Override
    protected @Nullable bcz fd() {
        return bda.va;
    }

    @Override
    protected @Nullable bcz h(cex $$0) {
        return bda.vg;
    }

    public boolean hn() {
        return !this.gR() && !this.hl() && !this.gS() && !this.hd() && !this.gQ();
    }

    @Override
    public cgn b(chx $$0) {
        return this.e_() ? cF : super.b($$0);
    }

    private static boolean b(czl $$0) {
        return $$0.e().a(bdy.aZ) && $$0.cb() && !$$0.n();
    }

    static class h
    extends cnq {
        private final cww l;

        public h(cww $$0) {
            super($$0);
            this.l = $$0;
        }

        @Override
        public void a() {
            if (!this.l.hn()) {
                return;
            }
            super.a();
        }
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a(0, "normal", false);
        public static final /* enum */ a b = new a(1, "lazy", false);
        public static final /* enum */ a c = new a(2, "worried", false);
        public static final /* enum */ a d = new a(3, "playful", false);
        public static final /* enum */ a e = new a(4, "brown", true);
        public static final /* enum */ a f = new a(5, "weak", true);
        public static final /* enum */ a g = new a(6, "aggressive", false);
        public static final Codec<a> h;
        private static final IntFunction<a> i;
        private static final int j = 6;
        private final int k;
        private final String l;
        private final boolean m;
        private static final /* synthetic */ a[] n;

        public static a[] values() {
            return (a[])n.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, String $$1, boolean $$2) {
            this.k = $$0;
            this.l = $$1;
            this.m = $$2;
        }

        public int a() {
            return this.k;
        }

        @Override
        public String c() {
            return this.l;
        }

        public boolean b() {
            return this.m;
        }

        static a a(a $$0, a $$1) {
            if ($$0.b()) {
                if ($$0 == $$1) {
                    return $$0;
                }
                return a;
            }
            return $$0;
        }

        public static a a(int $$0) {
            return i.apply($$0);
        }

        public static a a(bgr $$0) {
            int $$1 = $$0.a(16);
            if ($$1 == 0) {
                return b;
            }
            if ($$1 == 1) {
                return c;
            }
            if ($$1 == 2) {
                return d;
            }
            if ($$1 == 4) {
                return g;
            }
            if ($$1 < 9) {
                return f;
            }
            if ($$1 < 11) {
                return e;
            }
            return a;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{a, b, c, d, e, f, g};
        }

        static {
            n = cww$a.d();
            h = bhh.a(a::values);
            i = beu.a(a::a, cww$a.values(), beu.a.a);
        }
    }

    static class i
    extends cpi {
        private final cww a;

        public i(cww $$0, double $$1) {
            super((cht)$$0, $$1, bdq.G);
            this.a = $$0;
        }

        @Override
        public boolean c() {
            if (this.a.gQ()) {
                this.a.N().n();
                return false;
            }
            return super.c();
        }
    }

    static class d
    extends cnz {
        private final cww d;
        private int e;

        public d(cww $$0, double $$1) {
            super($$0, $$1);
            this.d = $$0;
        }

        @Override
        public boolean b() {
            if (super.b() && this.d.p() == 0) {
                if (!this.h()) {
                    if (this.e <= this.d.at) {
                        this.d.s(32);
                        this.e = this.d.at + 600;
                        if (this.d.dy()) {
                            ddm $$0 = this.b.a(cE, this.d);
                            this.d.cX.a($$0);
                        }
                    }
                    return false;
                }
                return true;
            }
            return false;
        }

        private boolean h() {
            is $$0 = this.d.dK();
            is.a $$1 = new is.a();
            for (int $$2 = 0; $$2 < 3; ++$$2) {
                for (int $$3 = 0; $$3 < 8; ++$$3) {
                    int $$4 = 0;
                    while ($$4 <= $$3) {
                        int $$5;
                        int n2 = $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0;
                        while ($$5 <= $$3) {
                            $$1.a($$0, $$4, $$2, $$5);
                            if (this.b.a_($$1).a(dzs.nW)) {
                                return true;
                            }
                            $$5 = $$5 > 0 ? -$$5 : 1 - $$5;
                        }
                        $$4 = $$4 > 0 ? -$$4 : 1 - $$4;
                    }
                }
            }
            return false;
        }
    }

    static class b
    extends coz {
        private final cww b;

        public b(cww $$0, double $$1, boolean $$2) {
            super($$0, $$1, $$2);
            this.b = $$0;
        }

        @Override
        public boolean b() {
            return this.b.hn() && super.b();
        }
    }

    static class c<T extends chl>
    extends cnu<T> {
        private final cww i;

        public c(cww $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
            super($$0, $$1, $$2, $$3, $$4, cgs.f);
            this.i = $$0;
        }

        @Override
        public boolean b() {
            return this.i.hh() && this.i.hn() && super.b();
        }
    }

    class k
    extends cop {
        private int b;

        public k() {
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean b() {
            if (this.b > cww.this.at || cww.this.e_() || cww.this.by() || !cww.this.hn() || cww.this.p() > 0) {
                return false;
            }
            if (!cww.this.a(cgv.a).f()) {
                return true;
            }
            return !cww.this.ao().a(czl.class, cww.this.dj().c(6.0, 6.0, 6.0), cww::b).isEmpty();
        }

        @Override
        public boolean c() {
            if (cww.this.by() || !cww.this.hg() && cww.this.as.a(k.b(600)) == 1) {
                return false;
            }
            return cww.this.as.a(k.b(2000)) != 1;
        }

        @Override
        public void a() {
            if (!cww.this.gQ() && !cww.this.a(cgv.a).f()) {
                cww.this.hx();
            }
        }

        @Override
        public void d() {
            if (cww.this.a(cgv.a).f()) {
                List<czl> $$0 = cww.this.ao().a(czl.class, cww.this.dj().c(8.0, 8.0, 8.0), cww::b);
                if (!$$0.isEmpty()) {
                    cww.this.N().a((cgk)$$0.getFirst(), (double)1.2f);
                }
            } else {
                cww.this.hx();
            }
            this.b = 0;
        }

        @Override
        public void e() {
            dlt $$0 = cww.this.a(cgv.a);
            if (!$$0.f()) {
                cww.this.a(k.a(cww.this.ao()), $$0);
                cww.this.a(cgv.a, dlt.l);
                int $$1 = cww.this.hg() ? cww.this.as.a(50) + 10 : cww.this.as.a(150) + 10;
                this.b = cww.this.at + $$1 * 20;
            }
            cww.this.x(false);
        }
    }

    static class f
    extends cop {
        private final cww a;
        private int b;

        public f(cww $$0) {
            this.a = $$0;
        }

        @Override
        public boolean b() {
            return this.b < this.a.at && this.a.hg() && this.a.hn() && this.a.as.a(cww$f.b(400)) == 1;
        }

        @Override
        public boolean c() {
            if (this.a.by() || !this.a.hg() && this.a.as.a(cww$f.b(600)) == 1) {
                return false;
            }
            return this.a.as.a(cww$f.b(2000)) != 1;
        }

        @Override
        public void d() {
            this.a.y(true);
            this.b = 0;
        }

        @Override
        public void e() {
            this.a.y(false);
            this.b = this.a.at + 200;
        }
    }

    static class l
    extends cop {
        private final cww a;

        public l(cww $$0) {
            this.a = $$0;
        }

        @Override
        public boolean b() {
            if (!this.a.e_() || !this.a.hn()) {
                return false;
            }
            if (this.a.hk() && this.a.as.a(l.b(500)) == 1) {
                return true;
            }
            return this.a.as.a(l.b(6000)) == 1;
        }

        @Override
        public boolean c() {
            return false;
        }

        @Override
        public void d() {
            this.a.A(true);
        }
    }

    static class g
    extends cox {
        private final cww h;

        public g(cww $$0, Class<? extends chl> $$1, float $$2) {
            super($$0, $$1, $$2);
            this.h = $$0;
        }

        public void a(chl $$0) {
            this.c = $$0;
        }

        @Override
        public boolean c() {
            return this.c != null && super.c();
        }

        @Override
        public boolean b() {
            if (this.b.ep().i() >= this.e) {
                return false;
            }
            if (this.c == null) {
                axf $$02 = g.a(this.b);
                this.c = this.f == ddm.class ? $$02.a(this.g, this.b, this.b.dP(), this.b.dT(), this.b.dV()) : $$02.a(this.b.ao().a(this.f, this.b.dj().c(this.d, 3.0, this.d), $$0 -> true), this.g, this.b, this.b.dP(), this.b.dT(), this.b.dV());
            }
            return this.h.hn() && this.c != null;
        }

        @Override
        public void a() {
            if (this.c != null) {
                super.a();
            }
        }
    }

    static class j
    extends cop {
        private final cww a;

        public j(cww $$0) {
            this.a = $$0;
            this.a(EnumSet.of(cop.a.a, cop.a.b, cop.a.c));
        }

        @Override
        public boolean b() {
            int $$4;
            if (!this.a.e_() && !this.a.hi() || !this.a.aV()) {
                return false;
            }
            if (!this.a.hn()) {
                return false;
            }
            float $$0 = this.a.ec() * ((float)Math.PI / 180);
            float $$1 = -bgj.a((double)$$0);
            float $$2 = bgj.b((double)$$0);
            int $$3 = (double)Math.abs($$1) > 0.5 ? bgj.m($$1) : 0;
            int n2 = $$4 = (double)Math.abs($$2) > 0.5 ? bgj.m($$2) : 0;
            if (this.a.ao().a_(this.a.dK().b($$3, -1, $$4)).l()) {
                return true;
            }
            if (this.a.hi() && this.a.as.a(j.b(60)) == 1) {
                return true;
            }
            return this.a.as.a(j.b(500)) == 1;
        }

        @Override
        public boolean c() {
            return false;
        }

        @Override
        public void d() {
            this.a.B(true);
        }

        @Override
        public boolean W_() {
            return false;
        }
    }

    static class e
    extends cqi {
        private final cww a;

        public e(cww $$0, Class<?> ... $$1) {
            super($$0, $$1);
            this.a = $$0;
        }

        @Override
        public boolean c() {
            if (this.a.cM || this.a.cN) {
                this.a.g((chl)null);
                return false;
            }
            return super.c();
        }

        @Override
        protected void a(chn $$0, chl $$1) {
            if ($$0 instanceof cww && $$0.gI()) {
                $$0.g($$1);
            }
        }
    }
}

