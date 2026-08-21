/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import org.jspecify.annotations.Nullable;

public abstract class cup
extends cth
implements cha,
chs,
chv {
    public static final int cG = 499;
    public static final int cH = 500;
    public static final double cI = 0.15;
    private static final float cv = (float)cup.b(() -> 0.0);
    private static final float cw = (float)cup.b(() -> 1.0);
    private static final float cx = (float)cup.a(() -> 0.0);
    private static final float cz = (float)cup.a(() -> 1.0);
    private static final float cA = cup.a((int $$0) -> 0);
    private static final float cB = cup.a((int $$0) -> $$0 - 1);
    private static final float cC = 0.25f;
    private static final float cD = 0.5f;
    private static final csk.a cE = ($$0, $$1) -> {
        cup $$2;
        return $$0 instanceof cup && ($$2 = (cup)$$0).hs();
    };
    private static final csk cF = csk.b().a(16.0).d().a(cE);
    private static final alw<Byte> cU = ama.a(cup.class, aly.a);
    private static final int cV = 2;
    private static final int cW = 8;
    private static final int cX = 16;
    private static final int cY = 32;
    private static final int cZ = 64;
    public static final int cJ = 3;
    private static final int da = 0;
    private static final boolean db = false;
    private static final boolean dc = false;
    private static final boolean dd = false;
    private int de;
    private int df;
    private int dg;
    public int cK;
    public int cL;
    protected cdk cM;
    protected int cN = 0;
    protected float cO;
    protected boolean cP;
    private float dh;
    private float di;
    private float dj;
    private float dk;
    private float dl;
    private float dm;
    protected boolean cQ = true;
    protected int cR;
    private @Nullable cgr<chl> dn;

    protected cup(cgu<? extends cup> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
        this.hv();
    }

    @Override
    protected void D() {
        this.cs.a(1, new a(1.2));
        this.cs.a(1, new cpt(this, 1.2));
        this.cs.a(2, new cnz(this, 1.0, cup.class));
        this.cs.a(4, new coo(this, 1.0));
        this.cs.a(6, new cqd(this, 0.7));
        this.cs.a(7, new cox(this, ddm.class, 6.0f));
        this.cs.a(8, new cpk(this));
        if (this.gU()) {
            this.cs.a(9, new cpl(this));
        }
        this.hp();
    }

    protected void hp() {
        this.cs.a(0, new coh(this));
        this.cs.a(3, new cpy(this, 1.25, $$0 -> $$0.a(bdy.aL), false));
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cU, (byte)0);
    }

    protected boolean s(int $$0) {
        return (this.az.a(cU) & $$0) != 0;
    }

    protected void d(int $$0, boolean $$1) {
        byte $$2 = this.az.a(cU);
        if ($$1) {
            this.az.a(cU, (byte)($$2 | $$0));
        } else {
            this.az.a(cU, (byte)($$2 & ~$$0));
        }
    }

    public boolean hn() {
        return this.s(2);
    }

    @Override
    public @Nullable cgr<chl> ae_() {
        return this.dn;
    }

    public void j(@Nullable chl $$0) {
        this.dn = cgr.a($$0);
    }

    public void y(boolean $$0) {
        this.d(2, $$0);
    }

    @Override
    public void v() {
        super.v();
        if (this.hq()) {
            this.A(false);
        }
    }

    @Override
    public boolean z() {
        return true;
    }

    @Override
    public ftm[] A() {
        return chj.a(this, 0.04, 0.52, 0.23, 0.87);
    }

    public boolean hq() {
        return this.s(16);
    }

    public boolean hr() {
        return this.s(32);
    }

    public boolean hs() {
        return this.s(8);
    }

    public void z(boolean $$0) {
        this.d(8, $$0);
    }

    @Override
    public boolean e(cgv $$0) {
        if ($$0 == cgv.h) {
            return this.cb() && !this.e_() && this.hn();
        }
        return super.e($$0);
    }

    public void b(ddm $$0, dlt $$1) {
        if (this.a($$1, cgv.g)) {
            this.i($$1.b(1, (chl)$$0));
        }
    }

    @Override
    protected boolean f(cgv $$0) {
        return ($$0 == cgv.g || $$0 == cgv.h) && this.hn() || super.f($$0);
    }

    public int ht() {
        return this.cN;
    }

    public void t(int $$0) {
        this.cN = $$0;
    }

    public int u(int $$0) {
        int $$1 = bgj.a(this.ht() + $$0, 0, this.hy());
        this.t($$1);
        return $$1;
    }

    @Override
    public boolean bY() {
        return !this.cr();
    }

    private void p() {
        bcz $$0;
        this.gQ();
        if (!this.bq() && ($$0 = this.gV()) != null) {
            this.ao().a(null, this.dP(), this.dR(), this.dV(), $$0, this.dB(), 1.0f, 1.0f + (this.as.i() - this.as.i()) * 0.2f);
        }
    }

    @Override
    public boolean a(double $$0, float $$1, cex $$2) {
        int $$3;
        if ($$0 > 1.0) {
            this.a(bda.oO, 0.4f, 1.0f);
        }
        if (($$3 = this.a($$0, $$1)) <= 0) {
            return false;
        }
        this.a($$2, (float)$$3);
        this.b($$0, $$1, $$2);
        this.fm();
        return true;
    }

    public final int hu() {
        return dhl.e(this.ad_());
    }

    protected void hv() {
        cdk $$0 = this.cM;
        this.cM = new cdk(this.hu());
        if ($$0 != null) {
            int $$1 = Math.min($$0.b(), this.cM.b());
            for (int $$2 = 0; $$2 < $$1; ++$$2) {
                dlt $$3 = $$0.a($$2);
                if ($$3.f()) continue;
                this.cM.a($$2, $$3.v());
            }
        }
    }

    @Override
    protected jd<bcz> a(cgv $$0, dlt $$1, dun $$2) {
        if ($$0 == cgv.h) {
            return bda.oP;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        boolean $$3 = super.a($$0, $$1, $$2);
        if ($$3 && this.as.a(3) == 0) {
            this.hC();
        }
        return $$3;
    }

    protected boolean gU() {
        return true;
    }

    protected @Nullable bcz gV() {
        return null;
    }

    protected @Nullable bcz hw() {
        return null;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        if ($$1.n()) {
            return;
        }
        eoh $$2 = this.ao().a_($$0.d());
        ehs $$3 = $$1.A();
        if ($$2.a(dzs.ep)) {
            $$3 = $$2.A();
        }
        if (this.cr() && this.cQ) {
            ++this.cR;
            if (this.cR > 5 && this.cR % 3 == 0) {
                this.a($$3);
            } else if (this.cR <= 5) {
                this.a(bda.oR, $$3.a() * 0.15f, $$3.b());
            }
        } else if (this.b($$3)) {
            this.a(bda.oR, $$3.a() * 0.15f, $$3.b());
        } else {
            this.a(bda.oQ, $$3.a() * 0.15f, $$3.b());
        }
    }

    private boolean b(ehs $$0) {
        return $$0 == ehs.b || $$0 == ehs.aW || $$0 == ehs.B || $$0 == ehs.aX || $$0 == ehs.aV;
    }

    protected void a(ehs $$0) {
        this.a(bda.oL, $$0.a() * 0.15f, $$0.b());
    }

    public static cir.a hx() {
        return cth.gW().a(cis.q, 0.7).a(cis.u, 53.0).a(cis.x, 0.225f).a(cis.D, 1.0).a(cis.z, 6.0).a(cis.m, 0.5);
    }

    @Override
    public int aj() {
        return 6;
    }

    public int hy() {
        return 100;
    }

    @Override
    protected float fC() {
        return 0.8f;
    }

    @Override
    public int S() {
        return 400;
    }

    @Override
    public void b(ddm $$0) {
        if (!this.ao().B_() && (!this.cr() || this.z($$0)) && this.hn()) {
            $$0.a(this, (ccv)this.cM);
        }
    }

    public cdc c(ddm $$0, dlt $$1) {
        boolean $$2 = this.a($$0, $$1);
        if ($$2) {
            $$1.a(1, (chl)$$0);
        }
        return $$2 || this.ao().B_() ? cdc.b : cdc.e;
    }

    protected boolean a(ddm $$0, dlt $$1) {
        boolean $$2 = false;
        float $$3 = 0.0f;
        int $$4 = 0;
        int $$5 = 0;
        if ($$1.a(dlx.rc)) {
            $$3 = 2.0f;
            $$4 = 20;
            $$5 = 3;
        } else if ($$1.a(dlx.tE)) {
            $$3 = 1.0f;
            $$4 = 30;
            $$5 = 3;
        } else if ($$1.a(dzs.jb.h())) {
            $$3 = 20.0f;
            $$4 = 180;
        } else if ($$1.a(dlx.pV)) {
            $$3 = 3.0f;
            $$4 = 60;
            $$5 = 3;
        } else if ($$1.a(dlx.dO)) {
            $$3 = 3.0f;
            $$4 = 0;
            $$5 = 3;
        } else if ($$1.a(dlx.wr)) {
            $$3 = 3.0f;
            $$4 = 60;
            $$5 = 3;
        } else if ($$1.a(dlx.ww)) {
            $$3 = 4.0f;
            $$4 = 60;
            $$5 = 5;
            if (!this.ao().B_() && this.hn() && this.Z_() == 0 && !this.hb()) {
                $$2 = true;
                this.h($$0);
            }
        } else if ($$1.a(dlx.rK) || $$1.a(dlx.rL)) {
            $$3 = 10.0f;
            $$4 = 240;
            $$5 = 10;
            if (!this.ao().B_() && this.hn() && this.Z_() == 0 && !this.hb()) {
                $$2 = true;
                this.h($$0);
            }
        }
        if (this.eZ() < this.fq() && $$3 > 0.0f) {
            this.d($$3);
            $$2 = true;
        }
        if (this.e_() && $$4 > 0) {
            this.ao().a(ly.R, this.e(1.0), this.dS() + 0.5, this.h(1.0), 0.0, 0.0, 0.0);
            if (!this.ao().B_()) {
                this.c_($$4);
                $$2 = true;
            }
        }
        if (!($$5 <= 0 || !$$2 && this.hn() || this.ht() >= this.hy() || this.ao().B_())) {
            this.u($$5);
            $$2 = true;
        }
        if ($$2) {
            this.p();
            this.c(etk.m);
        }
        return $$2;
    }

    protected void g(ddm $$0) {
        this.A(false);
        this.hA();
        if (!this.ao().B_()) {
            $$0.v(this.ec());
            $$0.w(this.ee());
            $$0.o(this);
        }
    }

    @Override
    public boolean fE() {
        return super.fE() && this.cr() && this.al() || this.hq() || this.hr();
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aJ);
    }

    private void gP() {
        this.cK = 1;
    }

    @Override
    protected void g(axf $$0) {
        super.g($$0);
        if (this.cM == null) {
            return;
        }
        for (int $$1 = 0; $$1 < this.cM.b(); ++$$1) {
            dlt $$2 = this.cM.a($$1);
            if ($$2.f() || dsq.a($$2, dsp.E)) continue;
            this.a($$0, $$2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void d_() {
        void $$1;
        block9: {
            block8: {
                if (this.as.a(200) == 0) {
                    this.gP();
                }
                super.d_();
                dwo dwo2 = this.ao();
                if (!(dwo2 instanceof axf)) break block8;
                axf $$0 = (axf)dwo2;
                if (this.cb()) break block9;
            }
            return;
        }
        if (this.as.a(900) == 0 && this.bw == 0) {
            this.d(1.0f);
        }
        if (this.hz()) {
            if (!this.hq() && !this.cr() && this.as.a(300) == 0 && $$1.a_(this.dK().e()).a(dzs.i)) {
                this.A(true);
            }
            if (this.hq() && ++this.de > 50) {
                this.de = 0;
                this.A(false);
            }
        }
        this.h((axf)$$1);
    }

    protected void h(axf $$0) {
        cup $$1;
        if (this.hs() && this.e_() && !this.hq() && ($$1 = $$0.a(cup.class, cF, (chl)this, this.dP(), this.dR(), this.dV(), this.dj().g(16.0))) != null && this.g((cgk)$$1) > 4.0) {
            this.cr.a((cgk)$$1, 0);
        }
    }

    public boolean hz() {
        return true;
    }

    @Override
    public void g() {
        super.g();
        if (this.df > 0 && ++this.df > 30) {
            this.df = 0;
            this.d(64, false);
        }
        if (this.dg > 0 && --this.dg <= 0) {
            this.hA();
        }
        if (this.cK > 0 && ++this.cK > 8) {
            this.cK = 0;
        }
        if (this.cL > 0) {
            ++this.cL;
            if (this.cL > 300) {
                this.cL = 0;
            }
        }
        this.di = this.dh;
        if (this.hq()) {
            this.dh += (1.0f - this.dh) * 0.4f + 0.05f;
            if (this.dh > 1.0f) {
                this.dh = 1.0f;
            }
        } else {
            this.dh += (0.0f - this.dh) * 0.4f - 0.05f;
            if (this.dh < 0.0f) {
                this.dh = 0.0f;
            }
        }
        this.dk = this.dj;
        if (this.hr()) {
            this.di = this.dh = 0.0f;
            this.dj += (1.0f - this.dj) * 0.4f + 0.05f;
            if (this.dj > 1.0f) {
                this.dj = 1.0f;
            }
        } else {
            this.cP = false;
            this.dj += (0.8f * this.dj * this.dj * this.dj - this.dj) * 0.6f - 0.05f;
            if (this.dj < 0.0f) {
                this.dj = 0.0f;
            }
        }
        this.dm = this.dl;
        if (this.s(64)) {
            this.dl += (1.0f - this.dl) * 0.7f + 0.05f;
            if (this.dl > 1.0f) {
                this.dl = 1.0f;
            }
        } else {
            this.dl += (0.0f - this.dl) * 0.7f - 0.05f;
            if (this.dl < 0.0f) {
                this.dl = 0.0f;
            }
        }
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        if (this.cr() || this.e_()) {
            return super.b($$0, $$1);
        }
        if (this.hn() && $$0.gA()) {
            this.b($$0);
            return cdc.a;
        }
        dlt $$2 = $$0.b($$1);
        if (!$$2.f()) {
            cdc $$3 = $$2.a($$0, (chl)this, $$1);
            if ($$3.a()) {
                return $$3;
            }
            if (this.a($$2, cgv.g) && !this.am()) {
                this.b($$0, $$2);
                return cdc.a;
            }
        }
        this.g($$0);
        return cdc.a;
    }

    private void gQ() {
        if (!this.ao().B_()) {
            this.df = 1;
            this.d(64, true);
        }
    }

    public void A(boolean $$0) {
        this.d(16, $$0);
    }

    public void v(int $$0) {
        this.A(false);
        this.d(32, true);
        this.dg = $$0;
    }

    public void hA() {
        this.d(32, false);
        this.dg = 0;
    }

    public @Nullable bcz hB() {
        return this.W();
    }

    public void hC() {
        if (this.gU() && (this.dy() || !this.ao().B_())) {
            this.v(20);
        }
    }

    public void hD() {
        if (!this.hr() && !this.ao().B_()) {
            this.hC();
            this.b(this.hw());
        }
    }

    public boolean i(ddm $$0) {
        this.j($$0);
        this.y(true);
        if ($$0 instanceof axg) {
            aj.y.a((axg)$$0, this);
        }
        this.ao().a((cgk)this, (byte)7);
        return true;
    }

    @Override
    protected void a(ddm $$0, ftm $$1) {
        super.a($$0, $$1);
        ftl $$2 = this.i((chl)$$0);
        this.a($$2.k, $$2.j);
        this.bC = this.bE = this.ec();
        this.ab = this.bE;
        if (this.dv()) {
            if ($$1.i <= 0.0) {
                this.cR = 0;
            }
            if (this.aV()) {
                if (this.cO > 0.0f && !this.fS()) {
                    this.b(this.cO, $$1);
                }
                this.cO = 0.0f;
            }
        }
    }

    protected ftl i(chl $$0) {
        return new ftl($$0.ee() * 0.5f, $$0.ec());
    }

    @Override
    protected void q(cgk $$0) {
        super.q($$0);
        $$0.b(this.j(0.0f), this.i(0.0f));
    }

    @Override
    protected ftm b(ddm $$0, ftm $$1) {
        if (this.aV() && this.cO == 0.0f && this.hr() && !this.cP) {
            return ftm.c;
        }
        float $$2 = $$0.bN * 0.5f;
        float $$3 = $$0.bP;
        if ($$3 <= 0.0f) {
            $$3 *= 0.25f;
        }
        return new ftm($$2, 0.0, $$3);
    }

    @Override
    protected float f(ddm $$0) {
        return (float)this.i(cis.x);
    }

    protected void b(float $$0, ftm $$1) {
        double $$2 = this.A($$0);
        ftm $$3 = this.dN();
        this.m($$3.g, $$2, $$3.i);
        this.aF = true;
        if ($$1.i > 0.0) {
            float $$4 = bgj.a((double)(this.ec() * ((float)Math.PI / 180)));
            float $$5 = bgj.b((double)(this.ec() * ((float)Math.PI / 180)));
            this.k(this.dN().b(-0.4f * $$4 * $$0, 0.0, 0.4f * $$5 * $$0));
        }
    }

    protected void hE() {
        this.a(bda.oN, 0.4f, 1.0f);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("EatingHaystack", this.hq());
        $$0.a("Bred", this.hs());
        $$0.a("Temper", this.ht());
        $$0.a("Tame", this.hn());
        cgr.a(this.dn, $$0, "Owner");
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.A($$0.a("EatingHaystack", false));
        this.z($$0.a("Bred", false));
        this.t($$0.a("Temper", 0));
        this.y($$0.a("Tame", false));
        this.dn = cgr.a($$0, "Owner", this.ao());
    }

    @Override
    public boolean a(cth $$0) {
        return false;
    }

    protected boolean hF() {
        return !this.cr() && !this.cq() && this.hn() && !this.e_() && this.eZ() >= this.fq() && this.hb();
    }

    public boolean ho() {
        return false;
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        return null;
    }

    protected void a(cfy $$0, cup $$1) {
        this.a($$0, $$1, cis.u, (double)cA, (double)cB);
        this.a($$0, $$1, cis.q, (double)cx, (double)cz);
        this.a($$0, $$1, cis.x, (double)cv, (double)cw);
    }

    private void a(cfy $$0, cup $$1, jd<cin> $$2, double $$3, double $$4) {
        double $$5 = cup.a(this.j($$2), $$0.j($$2), $$3, $$4, this.as);
        $$1.h($$2).a($$5);
    }

    static double a(double $$0, double $$1, double $$2, double $$3, bgr $$4) {
        double $$8;
        if ($$3 <= $$2) {
            throw new IllegalArgumentException("Incorrect range for an attribute");
        }
        $$0 = bgj.a($$0, $$2, $$3);
        $$1 = bgj.a($$1, $$2, $$3);
        double $$5 = 0.15 * ($$3 - $$2);
        double $$7 = ($$0 + $$1) / 2.0;
        double $$6 = Math.abs($$0 - $$1) + $$5 * 2.0;
        double $$9 = $$7 + $$6 * ($$8 = ($$4.j() + $$4.j() + $$4.j()) / 3.0 - 0.5);
        if ($$9 > $$3) {
            double $$10 = $$9 - $$3;
            return $$3 - $$10;
        }
        if ($$9 < $$2) {
            double $$11 = $$2 - $$9;
            return $$2 + $$11;
        }
        return $$9;
    }

    public float L(float $$0) {
        return bgj.h($$0, this.di, this.dh);
    }

    public float M(float $$0) {
        return bgj.h($$0, this.dk, this.dj);
    }

    public float N(float $$0) {
        return bgj.h($$0, this.dm, this.dl);
    }

    @Override
    public void a(int $$0) {
        if (!this.al()) {
            return;
        }
        if ($$0 < 0) {
            $$0 = 0;
        } else {
            this.cP = true;
            this.hC();
        }
        this.cO = this.e_($$0);
    }

    @Override
    public boolean a() {
        return this.al();
    }

    @Override
    public void b(int $$0) {
        this.cP = true;
        this.hC();
        this.hE();
    }

    @Override
    public void b() {
    }

    protected void B(boolean $$0) {
        md $$1 = $$0 ? ly.T : ly.ai;
        for (int $$2 = 0; $$2 < 7; ++$$2) {
            double $$3 = this.as.k() * 0.02;
            double $$4 = this.as.k() * 0.02;
            double $$5 = this.as.k() * 0.02;
            this.ao().a($$1, this.e(1.0), this.dS() + 0.5, this.h(1.0), $$3, $$4, $$5);
        }
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 7) {
            this.B(true);
        } else if ($$0 == 6) {
            this.B(false);
        } else {
            super.b($$0);
        }
    }

    @Override
    protected void a(cgk $$0, cgk.b $$1) {
        super.a($$0, $$1);
        if ($$0 instanceof chl) {
            ((chl)$$0).bC = this.bC;
        }
    }

    protected static float a(IntUnaryOperator $$0) {
        return 15.0f + (float)$$0.applyAsInt(8) + (float)$$0.applyAsInt(9);
    }

    protected static double a(DoubleSupplier $$0) {
        return (double)0.4f + $$0.getAsDouble() * 0.2 + $$0.getAsDouble() * 0.2 + $$0.getAsDouble() * 0.2;
    }

    protected static double b(DoubleSupplier $$0) {
        return ((double)0.45f + $$0.getAsDouble() * 0.3 + $$0.getAsDouble() * 0.3 + $$0.getAsDouble() * 0.3) * 0.25;
    }

    @Override
    public boolean fl() {
        return false;
    }

    @Override
    public @Nullable cic a_(int $$0) {
        int $$1 = $$0 - 500;
        if ($$1 >= 0 && $$1 < this.cM.b()) {
            return this.cM.a_($$1);
        }
        return super.a_($$0);
    }

    @Override
    public @Nullable chl dl() {
        cgk cgk2;
        if (this.al() && (cgk2 = this.do()) instanceof ddm) {
            ddm $$0 = (ddm)cgk2;
            return $$0;
        }
        return super.dl();
    }

    private @Nullable ftm a(ftm $$0, chl $$1) {
        double $$2 = this.dP() + $$0.g;
        double $$3 = this.dj().b;
        double $$4 = this.dV() + $$0.i;
        is.a $$5 = new is.a();
        block0: for (chx $$6 : $$1.go()) {
            $$5.b($$2, $$3, $$4);
            double $$7 = this.dj().e + 0.75;
            do {
                double $$8 = this.ao().m($$5);
                if ((double)$$5.v() + $$8 > $$7) continue block0;
                if (dfz.a($$8)) {
                    fth $$9 = $$1.f($$6);
                    ftm $$10 = new ftm($$2, (double)$$5.v() + $$8, $$4);
                    if (dfz.a(this.ao(), $$1, $$9.c($$10))) {
                        $$1.c($$6);
                        return $$10;
                    }
                }
                $$5.c(iz.b);
            } while ((double)$$5.v() < $$7);
        }
        return null;
    }

    @Override
    public ftm b(chl $$0) {
        ftm $$1 = cup.a(this.dF(), (double)$$0.dF(), this.ec() + ($$0.at() == chb.b ? 90.0f : -90.0f));
        ftm $$2 = this.a($$1, $$0);
        if ($$2 != null) {
            return $$2;
        }
        ftm $$3 = cup.a(this.dF(), (double)$$0.dF(), this.ec() + ($$0.at() == chb.a ? 90.0f : -90.0f));
        ftm $$4 = this.a($$3, $$0);
        if ($$4 != null) {
            return $$4;
        }
        return this.dI();
    }

    protected void a(bgr $$0) {
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        if ($$3 == null) {
            $$3 = new cfy.a(0.2f);
        }
        this.a($$0.G_());
        return super.a($$0, $$1, $$2, $$3);
    }

    public boolean a(ccv $$0) {
        return this.cM != $$0;
    }

    public int hG() {
        return this.S();
    }

    @Override
    protected ftm a(cgk $$0, cgn $$1, float $$2) {
        return super.a($$0, $$1, $$2).e(new ftm(0.0, 0.15 * (double)this.dk * (double)$$2, -0.7 * (double)this.dk * (double)$$2).b(-this.ec() * ((float)Math.PI / 180)));
    }

    public int ad_() {
        return 0;
    }

    class a
    extends cpi {
        public a(double $$0) {
            super(cup.this, $$0);
        }

        @Override
        public boolean h() {
            return !cup.this.ho() && super.h();
        }
    }
}

