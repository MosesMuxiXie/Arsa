/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class cwn
extends cii
implements cha,
chv {
    public static final int cz = 500;
    public static final int cA = 3;
    public static final int cB = 16;
    public static final int cC = 32;
    public static final int cD = 8;
    private static final int cG = 60;
    private static final int cH = 40;
    private static final double cI = 0.9;
    private static final float cJ = 0.011f;
    private static final float cK = 0.0325f;
    private static final float cL = 0.02f;
    private static final alw<Boolean> cM = ama.a(cwn.class, aly.k);
    private static final int cN = 40;
    private static final int cO = 5;
    private static final float cP = 1.2f;
    private static final float cQ = 0.5f;
    private int cR = 0;
    protected float cE;
    protected cdk cF;
    private static final double cU = 0.8;
    private static final double cV = 1.1;
    private static final double cW = 0.25;
    private static final double cX = 2.0;
    private static final float cY = 0.15f;
    private static final float cZ = 1.0f;

    protected cwn(cgu<? extends cwn> $$0, dwo $$1) {
        super((cgu<? extends cii>)$$0, $$1);
        this.cp = new cns(this, 85, 10, 0.011f, 0.0f, true);
        this.co = new cnr(this, 10);
        this.a(fls.j, 0.0f);
        this.hj();
    }

    @Override
    public boolean j(dlt $$0) {
        return this.p() || this.e_() ? $$0.a(bdy.bj) : $$0.a(bdy.bk);
    }

    @Override
    protected void a(ddm $$0, cdb $$1, dlt $$2) {
        if ($$2.a(bdy.bi)) {
            $$0.a($$1, dlw.a($$2, $$0, new dlt(dlx.sl)));
        } else {
            super.a($$0, $$1, $$2);
        }
    }

    public static cir.a hd() {
        return cth.gW().a(cis.u, 15.0).a(cis.x, 1.0).a(cis.d, 3.0).a(cis.r, 0.3f);
    }

    @Override
    public boolean db() {
        return false;
    }

    @Override
    protected cre b(dwo $$0) {
        return new crg(this, $$0);
    }

    @Override
    public float a(is $$0, dwr $$1) {
        return 0.0f;
    }

    public static boolean c(cgu<? extends cwn> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        int $$5 = $$1.V();
        int $$6 = $$5 - 25;
        return $$3.v() >= $$6 && $$3.v() <= $$5 - 5 && $$1.b_($$3.e()).a(bdv.a) && $$1.a_($$3.d()).a(dzs.J);
    }

    @Override
    public boolean a(dwr $$0) {
        return $$0.f(this);
    }

    @Override
    public boolean e(cgv $$0) {
        if ($$0 == cgv.h || $$0 == cgv.g) {
            return this.cb() && !this.e_() && this.p();
        }
        return super.e($$0);
    }

    @Override
    protected boolean f(cgv $$0) {
        return $$0 == cgv.g || $$0 == cgv.h || super.f($$0);
    }

    @Override
    protected boolean s(cgk $$0) {
        return !this.cr();
    }

    @Override
    public @Nullable chl dl() {
        cgk $$0 = this.do();
        if (this.al() && $$0 instanceof ddm) {
            ddm $$1 = (ddm)$$0;
            return $$1;
        }
        return super.dl();
    }

    @Override
    protected ftm b(ddm $$0, ftm $$1) {
        float $$2 = $$0.bN;
        float $$3 = 0.0f;
        float $$4 = 0.0f;
        if ($$0.bP != 0.0f) {
            float $$5 = bgj.b((double)($$0.ee() * ((float)Math.PI / 180)));
            float $$6 = -bgj.a((double)($$0.ee() * ((float)Math.PI / 180)));
            if ($$0.bP < 0.0f) {
                $$5 *= -0.5f;
                $$6 *= -0.5f;
            }
            $$4 = $$6;
            $$3 = $$5;
        }
        return new ftm($$2, $$4, $$3);
    }

    protected ftl k(chl $$0) {
        return new ftl($$0.ee() * 0.5f, $$0.ec());
    }

    @Override
    protected void a(ddm $$0, ftm $$1) {
        super.a($$0, $$1);
        ftl $$2 = this.k($$0);
        float $$3 = this.ec();
        float $$4 = bgj.f($$2.k - $$3);
        float $$5 = 0.5f;
        this.a($$3 += $$4 * 0.5f, $$2.j);
        this.bC = this.bE = $$3;
        this.ab = this.bE;
        if (this.dv()) {
            if (this.cE > 0.0f && !this.fS()) {
                this.a(this.cE, $$0);
            }
            this.cE = 0.0f;
        }
    }

    @Override
    protected void a(ftm $$0, double $$1, boolean $$2, double $$3) {
        float $$4 = this.fM();
        this.a($$4, $$0);
        this.a(chp.a, this.dN());
        this.k(this.dN().c(0.9));
    }

    @Override
    protected float f(ddm $$0) {
        return this.by() ? 0.0325f * (float)this.i(cis.x) : 0.02f * (float)this.i(cis.x);
    }

    protected void i(ddm $$0) {
        if (!this.ao().B_()) {
            $$0.o(this);
            if (!this.cr()) {
                this.gE();
            }
        }
    }

    private int hn() {
        if (!this.e_() && this.a(cgv.h).f()) {
            return 32;
        }
        return 16;
    }

    protected void he() {
        if (this.S_() || this.cr() || !this.p()) {
            return;
        }
        int $$0 = this.hn();
        if (this.gF() && this.gC().a(this.dK(), (double)($$0 + 8)) && $$0 == this.gD()) {
            return;
        }
        this.a(this.dK(), $$0);
    }

    @Override
    protected void a(axf $$0) {
        this.he();
        super.a($$0);
    }

    private void c(dwo $$0) {
        cgk $$1 = this.do();
        if ($$1 instanceof ddm) {
            boolean $$4;
            ddm $$2 = (ddm)$$1;
            boolean $$3 = $$2.d(cfo.N);
            boolean bl2 = $$4 = $$0.au() % 40L == 0L;
            if (!$$3 || $$4) {
                $$2.a(new cfm(cfo.N, 60, 0, true, true, true));
            }
        }
    }

    private void ho() {
        double $$0 = this.dN().g();
        double $$1 = bgj.a($$0 * 2.0, (double)0.15f, 1.0);
        if ((double)this.as.i() < $$1) {
            float $$2 = this.ec();
            float $$3 = bgj.a(this.ee(), -10.0f, 10.0f);
            ftm $$4 = this.c($$3, $$2);
            double $$5 = this.as.j() * 0.8 * (1.0 + $$0);
            double $$6 = ((double)this.as.i() - 0.5) * $$5;
            double $$7 = ((double)this.as.i() - 0.5) * $$5;
            double $$8 = ((double)this.as.i() - 0.5) * $$5;
            this.ao().a(ly.d, this.dP() - $$4.g * 1.1, this.dR() - $$4.h + 0.25, this.dV() - $$4.i * 1.1, $$6, $$7, $$8);
        }
    }

    @Override
    public void g() {
        super.g();
        if (!this.ao().B_()) {
            this.c(this.ao());
        }
        if (this.hf() && this.cR < 35) {
            this.A(false);
        }
        if (this.cR > 0) {
            --this.cR;
            if (this.cR == 0) {
                this.b(this.hh());
            }
        }
        if (this.by()) {
            this.ho();
        }
    }

    @Override
    public boolean a() {
        return this.al();
    }

    @Override
    public void a(int $$0) {
        if (!this.al() || this.cR > 0) {
            return;
        }
        this.cE = this.e_($$0);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cM, false);
    }

    public boolean hf() {
        return this.az.a(cM);
    }

    public void A(boolean $$0) {
        this.az.a(cM, $$0);
    }

    protected void a(float $$0, ddm $$1) {
        this.l($$1.cj().c((double)((this.by() ? 1.2f : 0.5f) * $$0) * this.i(cis.x) * (double)this.bi()));
        this.cR = 40;
        this.A(true);
        this.aF = true;
    }

    @Override
    public void b(int $$0) {
        this.b(this.hg());
        this.c(etk.u);
        this.A(true);
    }

    @Override
    public int c() {
        return this.cR;
    }

    @Override
    public void a(alw<?> $$0) {
        if (!this.ay && cM.equals($$0)) {
            this.cR = this.cR == 0 ? 40 : this.cR;
        }
        super.a($$0);
    }

    @Override
    public void b() {
    }

    @Override
    protected void b(is $$0, eoh $$1) {
    }

    protected @Nullable bcz hg() {
        return null;
    }

    protected @Nullable bcz hh() {
        return null;
    }

    @Override
    public cdc a(ddm $$0, cdb $$1) {
        this.gz();
        return super.a($$0, $$1);
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if (this.e_()) {
            return super.b($$0, $$1);
        }
        if (this.p() && $$0.gA()) {
            this.b($$0);
            return cdc.a;
        }
        if (!$$2.f()) {
            if (!this.ao().B_() && !this.p() && this.j($$2)) {
                this.a($$0, $$1, $$2);
                this.j($$0);
                return cdc.b;
            }
            if (this.j($$2) && this.eZ() < this.fq()) {
                dhf $$3 = $$2.a(ki.y);
                this.d($$3 != null ? (float)(2 * $$3.a()) : 1.0f);
                this.a($$0, $$1, $$2);
                this.gX();
                return cdc.a;
            }
            cdc $$4 = $$2.a($$0, (chl)this, $$1);
            if ($$4.a()) {
                return $$4;
            }
        }
        if (this.p() && !$$0.gA() && !this.j($$2)) {
            this.i($$0);
            return cdc.a;
        }
        return super.b($$0, $$1);
    }

    private void j(ddm $$0) {
        if (this.as.a(3) == 0) {
            this.g($$0);
            this.cr.n();
            this.ao().a((cgk)this, (byte)7);
        } else {
            this.ao().a((cgk)this, (byte)6);
        }
        this.gX();
    }

    @Override
    public boolean i(double $$0) {
        return true;
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        cgk cgk2;
        boolean $$3 = super.a($$0, $$1, $$2);
        if ($$3 && (cgk2 = $$1.d()) instanceof chl) {
            chl $$4 = (chl)cgk2;
            cwp.a($$0, this, $$4);
        }
        return $$3;
    }

    @Override
    public boolean b(cfm $$0) {
        if ($$0.c() == cfo.s) {
            return false;
        }
        return super.b($$0);
    }

    @Override
    public cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        bgr $$4 = $$0.G_();
        cwp.a(this, $$4);
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected jd<bcz> a(cgv $$0, dlt $$1, dun $$2) {
        if ($$0 == cgv.h && this.bC()) {
            return bda.Hv;
        }
        if ($$0 == cgv.h) {
            return bda.Hw;
        }
        return super.a($$0, $$1, $$2);
    }

    public final int hi() {
        return dhl.e(this.hk());
    }

    protected void hj() {
        cdk $$0 = this.cF;
        this.cF = new cdk(this.hi());
        if ($$0 != null) {
            int $$1 = Math.min($$0.b(), this.cF.b());
            for (int $$2 = 0; $$2 < $$1; ++$$2) {
                dlt $$3 = $$0.a($$2);
                if ($$3.f()) continue;
                this.cF.a($$2, $$3.v());
            }
        }
    }

    @Override
    public void b(ddm $$0) {
        if (!this.ao().B_() && (!this.cr() || this.z($$0)) && this.p()) {
            $$0.a(this, (ccv)this.cF);
        }
    }

    @Override
    public @Nullable cic a_(int $$0) {
        int $$1 = $$0 - 500;
        if ($$1 >= 0 && $$1 < this.cF.b()) {
            return this.cF.a_($$1);
        }
        return super.a_($$0);
    }

    public boolean a(ccv $$0) {
        return this.cF != $$0;
    }

    public int hk() {
        return 0;
    }

    protected boolean hl() {
        return this.do() instanceof chn;
    }

    protected boolean hm() {
        return this.ev().a(cqw.am) || this.ev().a(cqw.p);
    }
}

