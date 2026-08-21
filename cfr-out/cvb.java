/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class cvb
extends cii {
    public static final double cz = 0.6;
    public static final double cA = 0.8;
    public static final double cB = 1.33;
    private static final alw<jd<cvc>> cC = ama.a(cvb.class, aly.w);
    private static final alw<Boolean> cD = ama.a(cvb.class, aly.k);
    private static final alw<Boolean> cE = ama.a(cvb.class, aly.k);
    private static final alw<Integer> cF = ama.a(cvb.class, aly.b);
    private static final amt<cvc> cG = cvd.b;
    private static final dkr cH = dkr.o;
    private @Nullable a<ddm> cI;
    private @Nullable cpy cJ;
    private float cK;
    private float cL;
    private float cM;
    private float cN;
    private boolean cO;
    private float cP;
    private float cQ;

    public cvb(cgu<? extends cvb> $$0, dwo $$1) {
        super((cgu<? extends cii>)$$0, $$1);
        this.hj();
    }

    @Override
    protected void D() {
        this.cJ = new c(this, 0.6, $$0 -> $$0.a(bdy.aI), true);
        this.cs.a(1, new coh(this));
        this.cs.a(1, new cii.a(1.5));
        this.cs.a(2, new cpu(this));
        this.cs.a(3, new b(this));
        this.cs.a(4, this.cJ);
        this.cs.a(5, new coa(this, 1.1, 8));
        this.cs.a(6, new col(this, 1.0, 10.0f, 5.0f));
        this.cs.a(7, new cob(this, 0.8));
        this.cs.a(8, new cov(this, 0.3f));
        this.cs.a(9, new cpf(this));
        this.cs.a(10, new cnz(this, 0.8));
        this.cs.a(11, new cqd((cht)this, 0.8, 1.0000001E-5f));
        this.cs.a(12, new cox(this, ddm.class, 10.0f));
        this.ct.a(1, new cqm<cxh>(this, cxh.class, false, null));
        this.ct.a(1, new cqm<cxs>(this, cxs.class, false, cxs.cv));
    }

    public jd<cvc> hd() {
        return this.az.a(cC);
    }

    private void b(jd<cvc> $$0) {
        this.az.a(cC, $$0);
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aX) {
            return cvb.c($$0, this.hd());
        }
        if ($$0 == ki.aY) {
            return cvb.c($$0, this.hf());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aX);
        this.a($$0, ki.aY);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aX) {
            this.b(cvb.c(ki.aX, $$1));
            return true;
        }
        if ($$0 == ki.aY) {
            this.a(cvb.c(ki.aY, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    public void A(boolean $$0) {
        this.az.a(cD, $$0);
    }

    public boolean he() {
        return this.az.a(cD);
    }

    void B(boolean $$0) {
        this.az.a(cE, $$0);
    }

    boolean hk() {
        return this.az.a(cE);
    }

    public dkr hf() {
        return dkr.a(this.az.a(cF));
    }

    private void a(dkr $$0) {
        this.az.a(cF, $$0.a());
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cC, dfw.a(this.eo(), cG));
        $$0.a(cD, false);
        $$0.a(cE, false);
        $$0.a(cF, cH.a());
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        dfw.a($$0, this.hd());
        $$0.a("CollarColor", dkr.s, this.hf());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        dfw.a($$0, mj.aT).ifPresent(this::b);
        this.a($$0.a("CollarColor", dkr.s).orElse(cH));
    }

    @Override
    public void a(axf $$0) {
        if (this.K().b()) {
            double $$1 = this.K().c();
            if ($$1 == 0.6) {
                this.c(chx.f);
                this.i(false);
            } else if ($$1 == 1.33) {
                this.c(chx.a);
                this.i(true);
            } else {
                this.c(chx.a);
                this.i(false);
            }
        } else {
            this.c(chx.a);
            this.i(false);
        }
    }

    @Override
    protected @Nullable bcz W() {
        if (this.p()) {
            if (this.hb()) {
                return bda.ey;
            }
            if (this.as.a(4) == 0) {
                return bda.ez;
            }
            return bda.er;
        }
        return bda.es;
    }

    @Override
    public int S() {
        return 120;
    }

    public void hg() {
        this.b(bda.ev);
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.ex;
    }

    @Override
    protected bcz fd() {
        return bda.et;
    }

    public static cir.a hh() {
        return cth.gW().a(cis.u, 10.0).a(cis.x, 0.3f).a(cis.d, 3.0);
    }

    @Override
    protected void gX() {
        this.a(bda.eu, 1.0f, 1.0f);
    }

    @Override
    public void g() {
        super.g();
        if (this.cJ != null && this.cJ.k() && !this.p() && this.at % 100 == 0) {
            this.a(bda.ew, 1.0f, 1.0f);
        }
        this.hl();
    }

    private void hl() {
        if ((this.he() || this.hk()) && this.at % 5 == 0) {
            this.a(bda.ey, 0.6f + 0.4f * (this.as.i() - this.as.i()), 1.0f);
        }
        this.hm();
        this.hn();
        this.cO = false;
        if (this.he()) {
            is $$0 = this.dK();
            List<ddm> $$1 = this.ao().a(ddm.class, new fth($$0).c(2.0, 2.0, 2.0));
            for (ddm $$2 : $$1) {
                if (!$$2.gr()) continue;
                this.cO = true;
                break;
            }
        }
    }

    public boolean hi() {
        return this.cO;
    }

    private void hm() {
        this.cL = this.cK;
        this.cN = this.cM;
        if (this.he()) {
            this.cK = Math.min(1.0f, this.cK + 0.15f);
            this.cM = Math.min(1.0f, this.cM + 0.08f);
        } else {
            this.cK = Math.max(0.0f, this.cK - 0.22f);
            this.cM = Math.max(0.0f, this.cM - 0.13f);
        }
    }

    private void hn() {
        this.cQ = this.cP;
        this.cP = this.hk() ? Math.min(1.0f, this.cP + 0.1f) : Math.max(0.0f, this.cP - 0.13f);
    }

    public float L(float $$0) {
        return bgj.h($$0, this.cL, this.cK);
    }

    public float M(float $$0) {
        return bgj.h($$0, this.cN, this.cM);
    }

    public float N(float $$0) {
        return bgj.h($$0, this.cQ, this.cP);
    }

    public @Nullable cvb b(axf $$0, cfy $$1) {
        cvb $$2 = cgu.x.a($$0, cgt.e);
        if ($$2 != null && $$1 instanceof cvb) {
            cvb $$3 = (cvb)$$1;
            if (this.as.h()) {
                $$2.b(this.hd());
            } else {
                $$2.b($$3.hd());
            }
            if (this.p()) {
                $$2.b(this.ae_());
                $$2.a(true, true);
                dkr $$4 = this.hf();
                dkr $$5 = $$3.hf();
                $$2.a(dkr.a($$0, $$4, $$5));
            }
        }
        return $$2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(cth $$0) {
        void $$2;
        if (!this.p()) {
            return false;
        }
        if (!($$0 instanceof cvb)) {
            return false;
        }
        cvb $$1 = (cvb)$$0;
        return $$2.p() && super.a($$0);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        $$3 = super.a($$0, $$1, $$2, $$3);
        dfw.a(dft.a($$0, this.dK()), mj.aT).ifPresent(this::b);
        return $$3;
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        cdc $$8;
        dlt $$2 = $$0.b($$1);
        dlp $$3 = $$2.h();
        if (this.p()) {
            if (this.j($$0)) {
                cdc $$7;
                if ($$3 instanceof dks) {
                    dks $$4 = (dks)$$3;
                    dkr $$5 = $$4.a();
                    if ($$5 != this.hf()) {
                        if (!this.ao().B_()) {
                            this.a($$5);
                            $$2.a(1, (chl)$$0);
                            this.gz();
                        }
                        return cdc.a;
                    }
                } else if (this.j($$2) && this.eZ() < this.fq()) {
                    if (!this.ao().B_()) {
                        this.a($$0, $$1, $$2);
                        dhf $$6 = $$2.a(ki.y);
                        this.d($$6 != null ? (float)$$6.a() : 1.0f);
                        this.gX();
                    }
                    return cdc.a;
                }
                if (!($$7 = super.b($$0, $$1)).a()) {
                    this.z(!this.gR());
                    return cdc.a;
                }
                return $$7;
            }
        } else if (this.j($$2)) {
            if (!this.ao().B_()) {
                this.a($$0, $$1, $$2);
                this.i($$0);
                this.gz();
                this.gX();
            }
            return cdc.a;
        }
        if (($$8 = super.b($$0, $$1)).a()) {
            this.gz();
        }
        return $$8;
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aI);
    }

    @Override
    public boolean i(double $$0) {
        return !this.p() && this.at > 2400;
    }

    @Override
    public void a(boolean $$0, boolean $$1) {
        super.a($$0, $$1);
        this.hj();
    }

    protected void hj() {
        if (this.cI == null) {
            this.cI = new a<ddm>(this, ddm.class, 16.0f, 0.8, 1.33);
        }
        this.cs.a(this.cI);
        if (!this.p()) {
            this.cs.a(4, this.cI);
        }
    }

    private void i(ddm $$0) {
        if (this.as.a(3) == 0) {
            this.g($$0);
            this.z(true);
            this.ao().a((cgk)this, (byte)7);
        } else {
            this.ao().a((cgk)this, (byte)6);
        }
    }

    @Override
    public boolean cv() {
        return this.cz() || super.cv();
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }

    static class c
    extends cpy {
        private @Nullable ddm d;
        private final cvb e;

        public c(cvb $$0, double $$1, Predicate<dlt> $$2, boolean $$3) {
            super($$0, $$1, $$2, $$3);
            this.e = $$0;
        }

        @Override
        public void a() {
            super.a();
            if (this.d == null && this.a.ep().a(this.a(600)) == 0) {
                this.d = this.c;
            } else if (this.a.ep().a(this.a(500)) == 0) {
                this.d = null;
            }
        }

        @Override
        protected boolean h() {
            if (this.d != null && this.d.equals(this.c)) {
                return false;
            }
            return super.h();
        }

        @Override
        public boolean b() {
            return super.b() && !this.e.p();
        }
    }

    static class b
    extends cop {
        private final cvb a;
        private @Nullable ddm b;
        private @Nullable is c;
        private int d;

        public b(cvb $$0) {
            this.a = $$0;
        }

        @Override
        public boolean b() {
            if (!this.a.p()) {
                return false;
            }
            if (this.a.gR()) {
                return false;
            }
            chl $$0 = this.a.U_();
            if ($$0 instanceof ddm) {
                ddm $$12;
                this.b = $$12 = (ddm)$$0;
                if (!$$0.gr()) {
                    return false;
                }
                if (this.a.g((cgk)this.b) > 100.0) {
                    return false;
                }
                is $$2 = this.b.dK();
                eoh $$3 = this.a.ao().a_($$2);
                if ($$3.a(bdp.R)) {
                    this.c = $$3.d(dzj.f).map($$1 -> $$2.a($$1.g())).orElseGet(() -> new is($$2));
                    return !this.h();
                }
            }
            return false;
        }

        private boolean h() {
            List<cvb> $$0 = this.a.ao().a(cvb.class, new fth(this.c).g(2.0));
            for (cvb $$1 : $$0) {
                if ($$1 == this.a || !$$1.he() && !$$1.hk()) continue;
                return true;
            }
            return false;
        }

        @Override
        public boolean c() {
            return this.a.p() && !this.a.gR() && this.b != null && this.b.gr() && this.c != null && !this.h();
        }

        @Override
        public void d() {
            if (this.c != null) {
                this.a.y(false);
                this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1f);
            }
        }

        @Override
        public void e() {
            this.a.A(false);
            if (this.b.gQ() >= 100 && this.a.ao().G_().i() < this.a.ao().c().a(ceg.N, this.a.dI()).floatValue()) {
                this.i();
            }
            this.d = 0;
            this.a.B(false);
            this.a.N().n();
        }

        private void i() {
            bgr $$0 = this.a.ep();
            is.a $$12 = new is.a();
            $$12.g(this.a.S_() ? this.a.C().dK() : this.a.dK());
            this.a.b($$12.u() + $$0.a(11) - 5, $$12.v() + $$0.a(5) - 2, $$12.w() + $$0.a(11) - 5, false);
            $$12.g(this.a.dK());
            this.a.a(cvb$b.a(this.a), fnv.aq, (axf $$1, dlt $$2) -> $$1.b(new czl((dwo)$$1, (double)$$12.u() - (double)bgj.a((double)(this.a.bC * ((float)Math.PI / 180))), $$12.v(), (double)$$12.w() + (double)bgj.b((double)(this.a.bC * ((float)Math.PI / 180))), (dlt)$$2)));
        }

        @Override
        public void a() {
            if (this.b != null && this.c != null) {
                this.a.y(false);
                this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1f);
                if (this.a.g((cgk)this.b) < 2.5) {
                    ++this.d;
                    if (this.d > this.a(16)) {
                        this.a.A(true);
                        this.a.B(false);
                    } else {
                        this.a.a((cgk)this.b, 45.0f, 45.0f);
                        this.a.B(true);
                    }
                } else {
                    this.a.A(false);
                }
            }
        }
    }

    static class a<T extends chl>
    extends cnu<T> {
        private final cvb i;

        public a(cvb $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
            super($$0, $$1, $$2, $$3, $$4, cgs.e);
            this.i = $$0;
        }

        @Override
        public boolean b() {
            return !this.i.p() && super.b();
        }

        @Override
        public boolean c() {
            return !this.i.p() && super.c();
        }
    }
}

