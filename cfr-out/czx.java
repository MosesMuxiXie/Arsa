/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class czx
extends czz {
    protected static final int b = 80;
    private static final alw<Boolean> a = ama.a(czx.class, aly.k);
    private static final alw<Integer> d = ama.a(czx.class, aly.b);
    private float e;
    private float f;
    private float cv;
    private float cw;
    private float cx;
    private @Nullable chl cy;
    private int cz;
    private boolean cA;
    protected @Nullable cpm c;

    public czx(cgu<? extends czx> $$0, dwo $$1) {
        super((cgu<? extends czz>)$$0, $$1);
        this.cn = 10;
        this.a(fls.j, 0.0f);
        this.cp = new c(this);
        this.f = this.e = this.as.i();
    }

    @Override
    protected void D() {
        cpd $$0 = new cpd(this, 1.0);
        this.c = new cpm(this, 1.0, 80);
        this.cs.a(4, new a(this));
        this.cs.a(5, $$0);
        this.cs.a(7, this.c);
        this.cs.a(8, new cox(this, ddm.class, 8.0f));
        this.cs.a(8, new cox(this, czx.class, 12.0f, 0.01f));
        this.cs.a(9, new cpk(this));
        this.c.a(EnumSet.of(cop.a.a, cop.a.b));
        $$0.a(EnumSet.of(cop.a.a, cop.a.b));
        this.ct.a(1, new cqj<chl>(this, chl.class, 10, true, false, new b(this)));
    }

    public static cir.a gQ() {
        return czz.gW().a(cis.d, 6.0).a(cis.x, 0.5).a(cis.u, 30.0);
    }

    @Override
    protected cre b(dwo $$0) {
        return new crg(this, $$0);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(a, false);
        $$0.a(d, 0);
    }

    public boolean gR() {
        return this.az.a(a);
    }

    void x(boolean $$0) {
        this.az.a(a, $$0);
    }

    public int p() {
        return 80;
    }

    void a(int $$0) {
        this.az.a(d, $$0);
    }

    public boolean gS() {
        return this.az.a(d) != 0;
    }

    public @Nullable chl gT() {
        if (!this.gS()) {
            return null;
        }
        if (this.ao().B_()) {
            if (this.cy != null) {
                return this.cy;
            }
            cgk $$0 = this.ao().a(this.az.a(d));
            if ($$0 instanceof chl) {
                this.cy = (chl)$$0;
                return this.cy;
            }
            return null;
        }
        return this.ag_();
    }

    @Override
    public void a(alw<?> $$0) {
        super.a($$0);
        if (d.equals($$0)) {
            this.cz = 0;
            this.cy = null;
        }
    }

    @Override
    public int S() {
        return 160;
    }

    @Override
    protected bcz W() {
        return this.by() ? bda.ng : bda.nh;
    }

    @Override
    protected bcz h(cex $$0) {
        return this.by() ? bda.nm : bda.nn;
    }

    @Override
    protected bcz fd() {
        return this.by() ? bda.nj : bda.nk;
    }

    @Override
    protected cgk.d bv() {
        return cgk.d.c;
    }

    @Override
    public float a(is $$0, dwr $$1) {
        if ($$1.b_($$0).a(bdv.a)) {
            return 10.0f + $$1.C($$0);
        }
        return super.a($$0, $$1);
    }

    @Override
    public void d_() {
        if (this.cb()) {
            if (this.ao().B_()) {
                this.f = this.e;
                if (!this.by()) {
                    this.cv = 2.0f;
                    ftm $$0 = this.dN();
                    if ($$0.h > 0.0 && this.cA && !this.bq()) {
                        this.ao().a(this.dP(), this.dR(), this.dV(), this.gP(), this.dB(), 1.0f, 1.0f, false);
                    }
                    this.cA = $$0.h < 0.0 && this.ao().a(this.dK().e(), this);
                } else {
                    this.cv = this.gR() ? (this.cv < 0.5f ? 4.0f : (this.cv += (0.5f - this.cv) * 0.1f)) : (this.cv += (0.125f - this.cv) * 0.2f);
                }
                this.e += this.cv;
                this.cx = this.cw;
                this.cw = !this.by() ? this.as.i() : (this.gR() ? (this.cw += (0.0f - this.cw) * 0.25f) : (this.cw += (1.0f - this.cw) * 0.06f));
                if (this.gR() && this.by()) {
                    ftm $$1 = this.h(0.0f);
                    for (int $$2 = 0; $$2 < 2; ++$$2) {
                        this.ao().a(ly.d, this.e(0.5) - $$1.g * 1.5, this.dS() - $$1.h * 1.5, this.h(0.5) - $$1.i * 1.5, 0.0, 0.0, 0.0);
                    }
                }
                if (this.gS()) {
                    chl $$3;
                    if (this.cz < this.p()) {
                        ++this.cz;
                    }
                    if (($$3 = this.gT()) != null) {
                        this.J().a($$3, 90.0f, 90.0f);
                        this.J().a();
                        double $$4 = this.N(0.0f);
                        double $$5 = $$3.dP() - this.dP();
                        double $$6 = $$3.f(0.5) - this.dT();
                        double $$7 = $$3.dV() - this.dV();
                        double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                        $$5 /= $$8;
                        $$6 /= $$8;
                        $$7 /= $$8;
                        double $$9 = this.as.j();
                        while ($$9 < $$8) {
                            this.ao().a(ly.d, this.dP() + $$5 * ($$9 += 1.8 - $$4 + this.as.j() * (1.7 - $$4)), this.dT() + $$6 * $$9, this.dV() + $$7 * $$9, 0.0, 0.0, 0.0);
                        }
                    }
                }
            }
            if (this.by()) {
                this.j(300);
            } else if (this.aV()) {
                this.k(this.dN().b((this.as.i() * 2.0f - 1.0f) * 0.4f, 0.5, (this.as.i() * 2.0f - 1.0f) * 0.4f));
                this.v(this.as.i() * 360.0f);
                this.e(false);
                this.aF = true;
            }
            if (this.gS()) {
                this.v(this.bE);
            }
        }
        super.d_();
    }

    protected bcz gP() {
        return bda.nl;
    }

    public float L(float $$0) {
        return bgj.h($$0, this.f, this.e);
    }

    public float M(float $$0) {
        return bgj.h($$0, this.cx, this.cw);
    }

    public float N(float $$0) {
        return ((float)this.cz + $$0) / (float)this.p();
    }

    public float gU() {
        return this.cz;
    }

    @Override
    public boolean a(dwr $$0) {
        return $$0.f(this);
    }

    public static boolean b(cgu<? extends czx> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return !($$4.a(20) != 0 && $$1.B($$3) || $$1.av() == ccz.a || !cgt.a($$2) && !$$1.b_($$3).a(bdv.a) || !$$1.b_($$3.e()).a(bdv.a));
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        cgk cgk2;
        if (!this.gR() && !$$1.a(bdq.w) && !$$1.a(cfa.Q) && (cgk2 = $$1.c()) instanceof chl) {
            chl $$3 = (chl)cgk2;
            $$3.a($$0, this.en().d(this), 2.0f);
        }
        if (this.c != null) {
            this.c.i();
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public int ac() {
        return 180;
    }

    @Override
    protected void a(ftm $$0, double $$1, boolean $$2, double $$3) {
        this.a(0.1f, $$0);
        this.a(chp.a, this.dN());
        this.k(this.dN().c(0.9));
        if (!this.gR() && this.ag_() == null) {
            this.k(this.dN().b(0.0, -0.005, 0.0));
        }
    }

    static class c
    extends cnq {
        private final czx l;

        public c(czx $$0) {
            super($$0);
            this.l = $$0;
        }

        @Override
        public void a() {
            if (this.k != cnq.a.b || this.l.N().l()) {
                this.l.C(0.0f);
                this.l.x(false);
                return;
            }
            ftm $$0 = new ftm(this.e - this.l.dP(), this.f - this.l.dR(), this.g - this.l.dV());
            double $$1 = $$0.g();
            double $$2 = $$0.g / $$1;
            double $$3 = $$0.h / $$1;
            double $$4 = $$0.i / $$1;
            float $$5 = (float)(bgj.d($$0.i, $$0.g) * 57.2957763671875) - 90.0f;
            this.l.v(this.b(this.l.ec(), $$5, 90.0f));
            this.l.bC = this.l.ec();
            float $$6 = (float)(this.h * this.l.i(cis.x));
            float $$7 = bgj.h(0.125f, this.l.fM(), $$6);
            this.l.C($$7);
            double $$8 = Math.sin((double)(this.l.at + this.l.aA()) * 0.5) * 0.05;
            double $$9 = Math.cos(this.l.ec() * ((float)Math.PI / 180));
            double $$10 = Math.sin(this.l.ec() * ((float)Math.PI / 180));
            double $$11 = Math.sin((double)(this.l.at + this.l.aA()) * 0.75) * 0.05;
            this.l.k(this.l.dN().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            cnp $$12 = this.l.J();
            double $$13 = this.l.dP() + $$2 * 2.0;
            double $$14 = this.l.dT() + $$3 / $$1;
            double $$15 = this.l.dV() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
                $$16 = $$13;
                $$17 = $$14;
                $$18 = $$15;
            }
            this.l.J().a(bgj.d(0.125, $$16, $$13), bgj.d(0.125, $$17, $$14), bgj.d(0.125, $$18, $$15), 10.0f, 40.0f);
            this.l.x(true);
        }
    }

    static class a
    extends cop {
        private final czx a;
        private int b;
        private final boolean c;

        public a(czx $$0) {
            this.a = $$0;
            this.c = $$0 instanceof czr;
            this.a(EnumSet.of(cop.a.a, cop.a.b));
        }

        @Override
        public boolean b() {
            chl $$0 = this.a.ag_();
            return $$0 != null && $$0.cb();
        }

        @Override
        public boolean c() {
            return super.c() && (this.c || this.a.ag_() != null && this.a.g((cgk)this.a.ag_()) > 9.0);
        }

        @Override
        public void d() {
            this.b = -10;
            this.a.N().n();
            chl $$0 = this.a.ag_();
            if ($$0 != null) {
                this.a.J().a($$0, 90.0f, 90.0f);
            }
            this.a.aF = true;
        }

        @Override
        public void e() {
            this.a.a(0);
            this.a.g((chl)null);
            this.a.c.i();
        }

        @Override
        public boolean X_() {
            return true;
        }

        @Override
        public void a() {
            chl $$0 = this.a.ag_();
            if ($$0 == null) {
                return;
            }
            this.a.N().n();
            this.a.J().a($$0, 90.0f, 90.0f);
            if (!this.a.G($$0)) {
                this.a.g((chl)null);
                return;
            }
            ++this.b;
            if (this.b == 0) {
                this.a.a($$0.aA());
                if (!this.a.bq()) {
                    this.a.ao().a((cgk)this.a, (byte)21);
                }
            } else if (this.b >= this.a.p()) {
                float $$1 = 1.0f;
                if (this.a.ao().av() == ccz.d) {
                    $$1 += 2.0f;
                }
                if (this.c) {
                    $$1 += 2.0f;
                }
                axf $$2 = czx$a.a(this.a);
                $$0.a($$2, this.a.en().c((cgk)this.a, (cgk)this.a), $$1);
                this.a.c($$2, (cgk)$$0);
                this.a.g((chl)null);
            }
            super.a();
        }
    }

    static class b
    implements csk.a {
        private final czx a;

        public b(czx $$0) {
            this.a = $$0;
        }

        @Override
        public boolean test(@Nullable chl $$0, axf $$1) {
            return ($$0 instanceof ddm || $$0 instanceof cxq || $$0 instanceof ctr) && $$0.g(this.a) > 9.0;
        }
    }
}

