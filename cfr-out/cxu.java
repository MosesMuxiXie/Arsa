/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class cxu
extends cii
implements chq {
    private static final alw<Boolean> cB = ama.a(cxu.class, aly.k);
    private static final alw<Integer> cC = ama.a(cxu.class, aly.b);
    private static final alw<Long> cD = ama.a(cxu.class, aly.c);
    private static final alw<jd<cxx>> cE = ama.a(cxu.class, aly.z);
    private static final alw<jd<cxv>> cF = ama.a(cxu.class, aly.A);
    public static final csk.a cz = ($$0, $$1) -> {
        cgu<?> $$2 = $$0.ay();
        return $$2 == cgu.bj || $$2 == cgu.bg || $$2 == cgu.ae;
    };
    private static final float cG = 8.0f;
    private static final float cH = 40.0f;
    private static final float cI = 0.125f;
    public static final float cA = 0.62831855f;
    private static final dkr cJ = dkr.o;
    private float cK;
    private float cL;
    private boolean cM;
    private boolean cN;
    private float cO;
    private float cP;
    private static final ccn cQ = bhn.a(20, 39);
    private @Nullable cgr<chl> cR;

    public cxu(cgu<? extends cxu> $$0, dwo $$1) {
        super((cgu<? extends cii>)$$0, $$1);
        this.a(false, false);
        this.a(fls.f, -1.0f);
        this.a(fls.g, -1.0f);
    }

    @Override
    protected void D() {
        this.cs.a(1, new coh(this));
        this.cs.a(1, new cii.a(1.5, bdq.G));
        this.cs.a(2, new cpu(this));
        this.cs.a(3, new a<cus>(this, cus.class, 24.0f, 1.5, 1.5));
        this.cs.a(4, new cov(this, 0.4f));
        this.cs.a(5, new coz(this, 1.0, true));
        this.cs.a(6, new col(this, 1.0, 10.0f, 2.0f));
        this.cs.a(7, new cnz(this, 1.0));
        this.cs.a(8, new cqd(this, 1.0));
        this.cs.a(9, new cnv(this, 8.0f));
        this.cs.a(10, new cox(this, ddm.class, 8.0f));
        this.cs.a(10, new cpk(this));
        this.ct.a(1, new cqn(this));
        this.ct.a(2, new cqo(this));
        this.ct.a(3, new cqi(this, new Class[0]).a(new Class[0]));
        this.ct.a(4, new cqj<ddm>(this, ddm.class, 10, true, false, this::a));
        this.ct.a(5, new cqm<cth>(this, cth.class, false, cz));
        this.ct.a(6, new cqm<cxs>(this, cxs.class, false, cxs.cv));
        this.ct.a(7, new cqj<dbv>((chn)this, dbv.class, false));
        this.ct.a(8, new cqp<cxu>(this, true));
    }

    public amo hd() {
        cxx $$0 = this.hi().a();
        if (this.p()) {
            return $$0.b().b().b();
        }
        if (this.ab_()) {
            return $$0.b().c().b();
        }
        return $$0.b().a().b();
    }

    private jd<cxx> hi() {
        return this.az.a(cE);
    }

    private void b(jd<cxx> $$0) {
        this.az.a(cE, $$0);
    }

    private jd<cxv> hj() {
        return this.az.a(cF);
    }

    private void k(jd<cxv> $$0) {
        this.az.a(cF, $$0);
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aD) {
            return cxu.c($$0, this.hi());
        }
        if ($$0 == ki.aE) {
            return cxu.c($$0, this.hj());
        }
        if ($$0 == ki.aF) {
            return cxu.c($$0, this.hg());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aD);
        this.a($$0, ki.aE);
        this.a($$0, ki.aF);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aD) {
            this.b(cxu.c(ki.aD, $$1));
            return true;
        }
        if ($$0 == ki.aE) {
            this.k(cxu.c(ki.aE, $$1));
            return true;
        }
        if ($$0 == ki.aF) {
            this.a(cxu.c(ki.aF, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    public static cir.a he() {
        return cth.gW().a(cis.x, 0.3f).a(cis.u, 8.0).a(cis.d, 4.0);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        jq<cxv> $$1 = this.eo().f(mj.bC);
        $$0.a(cE, dfw.a(this.eo(), cxy.j));
        $$0.a(cF, (jd)$$1.a(cxw.a).or($$1::a).orElseThrow());
        $$0.a(cB, false);
        $$0.a(cC, cJ.a());
        $$0.a(cD, -1L);
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.Gg, 0.15f, 1.0f);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("CollarColor", dkr.s, this.hg());
        dfw.a($$0, this.hi());
        this.b_($$0);
        this.hj().e().ifPresent($$1 -> $$0.a("sound_variant", amt.a(mj.bC), $$1));
    }

    @Override
    protected void a(fnq $$02) {
        super.a($$02);
        dfw.a($$02, mj.bB).ifPresent(this::b);
        this.a($$02.a("CollarColor", dkr.s).orElse(cJ));
        this.a(this.ao(), $$02);
        $$02.a("sound_variant", amt.a(mj.bC)).flatMap($$0 -> this.eo().f(mj.bC).a((amt)$$0)).ifPresent(this::k);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        if ($$3 instanceof b) {
            b $$4 = (b)$$3;
            this.b($$4.a);
        } else {
            Optional $$5 = dfw.a(dft.a($$0, this.dK()), mj.bB);
            if ($$5.isPresent()) {
                this.b($$5.get());
                $$3 = new b($$5.get());
            }
        }
        this.k(cxw.a(this.eo(), $$0.G_()));
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected bcz W() {
        if (this.ab_()) {
            return this.hj().a().c().a();
        }
        if (this.as.a(3) == 0) {
            if (this.p() && this.eZ() < 20.0f) {
                return this.hj().a().f().a();
            }
            return this.hj().a().e().a();
        }
        return this.hj().a().a().a();
    }

    @Override
    protected bcz h(cex $$0) {
        if (this.i($$0)) {
            return bda.Gd;
        }
        return this.hj().a().d().a();
    }

    @Override
    protected bcz fd() {
        return this.hj().a().b().a();
    }

    @Override
    protected float fC() {
        return 0.4f;
    }

    @Override
    public void d_() {
        super.d_();
        if (!this.ao().B_() && this.cM && !this.cN && !this.gL() && this.aV()) {
            this.cN = true;
            this.cO = 0.0f;
            this.cP = 0.0f;
            this.ao().a((cgk)this, (byte)8);
        }
        if (!this.ao().B_()) {
            this.a((axf)this.ao(), true);
        }
    }

    @Override
    public void g() {
        super.g();
        if (!this.cb()) {
            return;
        }
        this.cL = this.cK;
        this.cK = this.hh() ? (this.cK += (1.0f - this.cK) * 0.4f) : (this.cK += (0.0f - this.cK) * 0.4f);
        if (this.bA()) {
            this.cM = true;
            if (this.cN && !this.ao().B_()) {
                this.ao().a((cgk)this, (byte)56);
                this.hk();
            }
        } else if ((this.cM || this.cN) && this.cN) {
            if (this.cO == 0.0f) {
                this.a(bda.Gf, this.fC(), (this.as.i() - this.as.i()) * 0.2f + 1.0f);
                this.c(etk.u);
            }
            this.cP = this.cO;
            this.cO += 0.05f;
            if (this.cP >= 2.0f) {
                this.cM = false;
                this.cN = false;
                this.cP = 0.0f;
                this.cO = 0.0f;
            }
            if (this.cO > 0.4f) {
                float $$0 = (float)this.dR();
                int $$1 = (int)(bgj.a((double)((this.cO - 0.4f) * (float)Math.PI)) * 7.0f);
                ftm $$2 = this.dN();
                for (int $$3 = 0; $$3 < $$1; ++$$3) {
                    float $$4 = (this.as.i() * 2.0f - 1.0f) * this.dF() * 0.5f;
                    float $$5 = (this.as.i() * 2.0f - 1.0f) * this.dF() * 0.5f;
                    this.ao().a(ly.aq, this.dP() + (double)$$4, (double)($$0 + 0.8f), this.dV() + (double)$$5, $$2.g, $$2.h, $$2.i);
                }
            }
        }
    }

    private void hk() {
        this.cN = false;
        this.cO = 0.0f;
        this.cP = 0.0f;
    }

    @Override
    public void a(cex $$0) {
        this.cM = false;
        this.cN = false;
        this.cP = 0.0f;
        this.cO = 0.0f;
        super.a($$0);
    }

    public float L(float $$0) {
        if (!this.cM) {
            return 1.0f;
        }
        return Math.min(0.75f + bgj.h($$0, this.cP, this.cO) / 2.0f * 0.25f, 1.0f);
    }

    public float M(float $$0) {
        return bgj.h($$0, this.cP, this.cO);
    }

    public float N(float $$0) {
        return bgj.h($$0, this.cL, this.cK) * 0.15f * (float)Math.PI;
    }

    @Override
    public int ac() {
        if (this.gQ()) {
            return 20;
        }
        return super.ac();
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (this.a($$0, $$1)) {
            return false;
        }
        this.z(false);
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected void c(axf $$0, cex $$1, float $$2) {
        if (!this.i($$1)) {
            super.c($$0, $$1, $$2);
            return;
        }
        dlt $$3 = this.ak();
        int $$4 = $$3.o();
        int $$5 = $$3.p();
        $$3.a(bgj.d($$2), (chl)this, cgv.g);
        if (cgg.b.a($$4, $$5) != cgg.b.a(this.ak())) {
            this.a(bda.Gc);
            $$0.a(new lu(ly.V, dlx.pR.m()), this.dP(), this.dR() + 1.0, this.dV(), 20, 0.2, 0.1, 0.2, 0.1);
        }
    }

    private boolean i(cex $$0) {
        return this.ak().a(dlx.pS) && !$$0.a(bdq.C);
    }

    @Override
    protected void gP() {
        if (this.p()) {
            this.h(cis.u).a(40.0);
            this.x(40.0f);
        } else {
            this.h(cis.u).a(8.0);
        }
    }

    @Override
    protected void c(cex $$0, float $$1) {
        this.a($$0, $$1, cgv.g);
    }

    @Override
    protected boolean b_(ddm $$0) {
        return this.j($$0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        dlp $$3 = $$2.h();
        if (this.p()) {
            if (this.j($$2) && this.eZ() < this.fq()) {
                this.a($$0, $$1, $$2);
                dhf $$4 = $$2.a(ki.y);
                float $$5 = $$4 != null ? (float)$$4.a() : 1.0f;
                this.d(2.0f * $$5);
                return cdc.a;
            }
            if ($$3 instanceof dks) {
                dks $$6 = (dks)$$3;
                if (this.j($$0)) {
                    dkr $$7 = $$6.a();
                    if ($$7 == this.hg()) return super.b($$0, $$1);
                    this.a($$7);
                    $$2.a(1, (chl)$$0);
                    return cdc.a;
                }
            }
            if (this.a($$2, cgv.g) && !this.am() && this.j($$0) && !this.e_()) {
                this.i($$2.c(1));
                $$2.a(1, (chl)$$0);
                return cdc.a;
            }
            if (this.gQ() && this.am() && this.j($$0) && this.ak().n() && this.ak().c($$2)) {
                $$2.h(1);
                this.a(bda.Ge);
                dlt $$8 = this.ak();
                int $$9 = (int)((float)$$8.p() * 0.125f);
                $$8.b(Math.max(0, $$8.o() - $$9));
                return cdc.a;
            }
            cdc $$10 = super.b($$0, $$1);
            if ($$10.a() || !this.j($$0)) return $$10;
            this.z(!this.gR());
            this.bM = false;
            this.cr.n();
            this.g((chl)null);
            return cdc.a.b();
        }
        if (this.ao().B_() || !$$2.a(dlx.tD) || this.ab_()) return super.b($$0, $$1);
        $$2.a(1, (chl)$$0);
        this.i($$0);
        return cdc.b;
    }

    private void i(ddm $$0) {
        if (this.as.a(3) == 0) {
            this.g($$0);
            this.cr.n();
            this.g((chl)null);
            this.z(true);
            this.ao().a((cgk)this, (byte)7);
        } else {
            this.ao().a((cgk)this, (byte)6);
        }
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 8) {
            this.cN = true;
            this.cO = 0.0f;
            this.cP = 0.0f;
        } else if ($$0 == 56) {
            this.hk();
        } else {
            super.b($$0);
        }
    }

    public float hf() {
        if (this.ab_()) {
            return 1.5393804f;
        }
        if (this.p()) {
            float $$0 = this.fq();
            float $$1 = ($$0 - this.eZ()) / $$0;
            return (0.55f - $$1 * 0.4f) * (float)Math.PI;
        }
        return 0.62831855f;
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aH);
    }

    @Override
    public int aj() {
        return 8;
    }

    @Override
    public long a() {
        return this.az.a(cD);
    }

    @Override
    public void b(long $$0) {
        this.az.a(cD, $$0);
    }

    @Override
    public void c() {
        this.a(cQ.a(this.as));
    }

    @Override
    public @Nullable cgr<chl> b() {
        return this.cR;
    }

    @Override
    public void a(@Nullable cgr<chl> $$0) {
        this.cR = $$0;
    }

    public dkr hg() {
        return dkr.a(this.az.a(cC));
    }

    private void a(dkr $$0) {
        this.az.a(cC, $$0.a());
    }

    public @Nullable cxu b(axf $$0, cfy $$1) {
        cxu $$2 = cgu.bU.a($$0, cgt.e);
        if ($$2 != null && $$1 instanceof cxu) {
            cxu $$3 = (cxu)$$1;
            if (this.as.h()) {
                $$2.b(this.hi());
            } else {
                $$2.b($$3.hi());
            }
            if (this.p()) {
                $$2.b(this.ae_());
                $$2.a(true, true);
                dkr $$4 = this.hg();
                dkr $$5 = $$3.hg();
                $$2.a(dkr.a($$0, $$4, $$5));
            }
            $$2.k(cxw.a(this.eo(), this.as));
        }
        return $$2;
    }

    public void A(boolean $$0) {
        this.az.a(cB, $$0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(cth $$0) {
        void $$2;
        if ($$0 == this) {
            return false;
        }
        if (!this.p()) {
            return false;
        }
        if (!($$0 instanceof cxu)) {
            return false;
        }
        cxu $$1 = (cxu)$$0;
        if (!$$2.p()) {
            return false;
        }
        if ($$2.gQ()) {
            return false;
        }
        return this.hb() && $$2.hb();
    }

    public boolean hh() {
        return this.az.a(cB);
    }

    @Override
    public boolean a(chl $$0, chl $$1) {
        cii $$6;
        cup $$5;
        if ($$0 instanceof czp || $$0 instanceof czv || $$0 instanceof cyy) {
            return false;
        }
        if ($$0 instanceof cxu) {
            cxu $$2 = (cxu)$$0;
            return !$$2.p() || $$2.U_() != $$1;
        }
        if ($$0 instanceof ddm) {
            ddm $$4;
            ddm $$3 = (ddm)$$0;
            if ($$1 instanceof ddm && !($$4 = (ddm)$$1).a($$3)) {
                return false;
            }
        }
        if ($$0 instanceof cup && ($$5 = (cup)$$0).hn()) {
            return false;
        }
        return !($$0 instanceof cii) || !($$6 = (cii)$$0).p();
    }

    @Override
    public boolean aj_() {
        return !this.ab_();
    }

    @Override
    public ftm B() {
        return new ftm(0.0, 0.6f * this.dk(), this.dF() * 0.4f);
    }

    public static boolean c(cgu<cxu> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.a_($$3.e()).a(bdp.cu) && cxu.a($$1, $$3);
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }

    class a<T extends chl>
    extends cnu<T> {
        private final cxu j;

        public a(cxu $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
            super($$0, $$1, $$2, $$3, $$4);
            this.j = $$0;
        }

        @Override
        public boolean b() {
            if (super.b() && this.b instanceof cus) {
                return !this.j.p() && this.a((cus)this.b);
            }
            return false;
        }

        private boolean a(cus $$0) {
            return $$0.gT() >= cxu.this.as.a(5);
        }

        @Override
        public void d() {
            cxu.this.g((chl)null);
            super.d();
        }

        @Override
        public void a() {
            cxu.this.g((chl)null);
            super.a();
        }
    }

    public static class b
    extends cfy.a {
        public final jd<cxx> a;

        public b(jd<cxx> $$0) {
            super(false);
            this.a = $$0;
        }
    }
}

