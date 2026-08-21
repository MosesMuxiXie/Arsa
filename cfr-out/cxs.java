/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cxs
extends cth {
    private static final alw<Boolean> cw = ama.a(cxs.class, aly.k);
    private static final alw<Boolean> cx = ama.a(cxs.class, aly.k);
    private static final float cz = 0.3f;
    private static final cgn cA = cgu.bJ.n().a(cgm.a().a(cgl.a, 0.0f, cgu.bJ.m(), -0.25f)).a(0.3f);
    private static final boolean cB = false;
    int cC;
    public static final csk.a cv = ($$0, $$1) -> $$0.e_() && !$$0.by();
    is cD = is.c;
    @Nullable is cE;
    boolean cF;

    public cxs(cgu<? extends cxs> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
        this.a(fls.j, 0.0f);
        this.a(fls.t, -1.0f);
        this.a(fls.s, -1.0f);
        this.a(fls.r, -1.0f);
        this.cp = new e(this);
    }

    public void h(is $$0) {
        this.cD = $$0;
    }

    public boolean p() {
        return this.az.a(cw);
    }

    void x(boolean $$0) {
        this.az.a(cw, $$0);
    }

    public boolean gP() {
        return this.az.a(cx);
    }

    void y(boolean $$0) {
        this.cC = $$0 ? 1 : 0;
        this.az.a(cx, $$0);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cw, false);
        $$0.a(cx, false);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("home_pos", is.a, this.cD);
        $$0.a("has_egg", this.p());
    }

    @Override
    protected void a(fnq $$0) {
        this.h($$0.a("home_pos", is.a).orElse(this.dK()));
        super.a($$0);
        this.x($$0.a("has_egg", false));
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        this.h(this.dK());
        return super.a($$0, $$1, $$2, $$3);
    }

    public static boolean c(cgu<cxs> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$3.v() < $$1.V() + 4 && ejb.a($$1, $$3) && cxs.a($$1, $$3);
    }

    @Override
    protected void D() {
        this.cs.a(0, new f(this, 1.2));
        this.cs.a(1, new a(this, 1.0));
        this.cs.a(1, new d(this, 1.0));
        this.cs.a(2, new cpy(this, 1.1, $$0 -> $$0.a(bdy.be), false));
        this.cs.a(3, new c(this, 1.0));
        this.cs.a(4, new b(this, 1.0));
        this.cs.a(7, new i(this, 1.0));
        this.cs.a(8, new cox(this, ddm.class, 8.0f));
        this.cs.a(9, new h(this, 1.0, 100));
    }

    public static cir.a gQ() {
        return cth.gW().a(cis.u, 30.0).a(cis.x, 0.25).a(cis.D, 1.0);
    }

    @Override
    public boolean db() {
        return false;
    }

    @Override
    public int S() {
        return 200;
    }

    @Override
    protected @Nullable bcz W() {
        if (!this.by() && this.aV() && !this.e_()) {
            return bda.Dx;
        }
        return super.W();
    }

    @Override
    protected void g(float $$0) {
        super.g($$0 * 1.5f);
    }

    @Override
    protected bcz bk() {
        return bda.DI;
    }

    @Override
    protected @Nullable bcz h(cex $$0) {
        if (this.e_()) {
            return bda.DE;
        }
        return bda.DD;
    }

    @Override
    protected @Nullable bcz fd() {
        if (this.e_()) {
            return bda.Dz;
        }
        return bda.Dy;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        bcz $$2 = this.e_() ? bda.DH : bda.DG;
        this.a($$2, 0.15f, 1.0f);
    }

    @Override
    public boolean gY() {
        return super.gY() && !this.p();
    }

    @Override
    protected float bj() {
        return this.al + 0.15f;
    }

    @Override
    public float eE() {
        return this.e_() ? 0.3f : 1.0f;
    }

    @Override
    protected cre b(dwo $$0) {
        return new g(this, $$0);
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        return cgu.bJ.a($$0, cgt.e);
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.be);
    }

    @Override
    public float a(is $$0, dwr $$1) {
        if (!this.cF && $$1.b_($$0).a(bdv.a)) {
            return 10.0f;
        }
        if (ejb.a($$1, $$0)) {
            return 10.0f;
        }
        return $$1.C($$0);
    }

    @Override
    public void d_() {
        super.d_();
        if (this.cb() && this.gP() && this.cC >= 1 && this.cC % 5 == 0) {
            is $$0 = this.dK();
            if (ejb.a(this.ao(), $$0)) {
                this.ao().c(2001, $$0, dzq.j(this.ao().a_($$0.e())));
                this.c(etk.u);
            }
        }
    }

    @Override
    protected void h() {
        axf $$0;
        dwo dwo2;
        super.h();
        if (!this.e_() && (dwo2 = this.ao()) instanceof axf && ($$0 = (axf)dwo2).U().a(eua.D).booleanValue()) {
            this.a($$0, fnv.aK, this::a);
        }
    }

    @Override
    protected void a(ftm $$0, double $$1, boolean $$2, double $$3) {
        this.a(0.1f, $$0);
        this.a(chp.a, this.dN());
        this.k(this.dN().c(0.9));
        if (!(this.ag_() != null || this.cF && this.cD.a(this.dI(), 20.0))) {
            this.k(this.dN().b(0.0, -0.005, 0.0));
        }
    }

    @Override
    public boolean aj_() {
        return false;
    }

    @Override
    public void a(axf $$0, chk $$1) {
        this.a($$0, this.en().c(), Float.MAX_VALUE);
    }

    @Override
    public cgn b(chx $$0) {
        return this.e_() ? cA : super.b($$0);
    }

    static class e
    extends cnq {
        private final cxs l;

        e(cxs $$0) {
            super($$0);
            this.l = $$0;
        }

        private void h() {
            if (this.l.by()) {
                this.l.k(this.l.dN().b(0.0, 0.005, 0.0));
                if (!this.l.cD.a(this.l.dI(), 16.0)) {
                    this.l.C(Math.max(this.l.fM() / 2.0f, 0.08f));
                }
                if (this.l.e_()) {
                    this.l.C(Math.max(this.l.fM() / 3.0f, 0.06f));
                }
            } else if (this.l.aV()) {
                this.l.C(Math.max(this.l.fM() / 2.0f, 0.06f));
            }
        }

        @Override
        public void a() {
            double $$2;
            double $$1;
            this.h();
            if (this.k != cnq.a.b || this.l.N().l()) {
                this.l.C(0.0f);
                return;
            }
            double $$0 = this.e - this.l.dP();
            double $$3 = Math.sqrt($$0 * $$0 + ($$1 = this.f - this.l.dR()) * $$1 + ($$2 = this.g - this.l.dV()) * $$2);
            if ($$3 < (double)1.0E-5f) {
                this.d.C(0.0f);
                return;
            }
            $$1 /= $$3;
            float $$4 = (float)(bgj.d($$2, $$0) * 57.2957763671875) - 90.0f;
            this.l.v(this.b(this.l.ec(), $$4, 90.0f));
            this.l.bC = this.l.ec();
            float $$5 = (float)(this.h * this.l.i(cis.x));
            this.l.C(bgj.h(0.125f, this.l.fM(), $$5));
            this.l.k(this.l.dN().b(0.0, (double)this.l.fM() * $$1 * 0.1, 0.0));
        }
    }

    static class f
    extends cpi {
        f(cxs $$0, double $$1) {
            super($$0, $$1);
        }

        @Override
        public boolean b() {
            if (!this.h()) {
                return false;
            }
            is $$0 = this.a(this.c.ao(), this.c, 7);
            if ($$0 != null) {
                this.e = $$0.u();
                this.f = $$0.v();
                this.g = $$0.w();
                return true;
            }
            return this.i();
        }
    }

    static class a
    extends cnz {
        private final cxs d;

        a(cxs $$0, double $$1) {
            super($$0, $$1);
            this.d = $$0;
        }

        @Override
        public boolean b() {
            return super.b() && !this.d.p();
        }

        @Override
        protected void g() {
            axg $$0 = this.a.ha();
            if ($$0 == null && this.c.ha() != null) {
                $$0 = this.c.ha();
            }
            if ($$0 != null) {
                $$0.a(bdk.R);
                aj.p.a($$0, this.a, this.c, null);
            }
            this.d.x(true);
            this.a.d_(6000);
            this.c.d_(6000);
            this.a.hc();
            this.c.hc();
            bgr $$1 = this.a.ep();
            if (cxs$a.a(this.b).U().a(eua.D).booleanValue()) {
                this.b.b(new cgz(this.b, this.a.dP(), this.a.dR(), this.a.dV(), $$1.a(7) + 1));
            }
        }
    }

    static class d
    extends cpc {
        private final cxs g;

        d(cxs $$0, double $$1) {
            super($$0, $$1, 16);
            this.g = $$0;
        }

        @Override
        public boolean b() {
            if (this.g.p() && this.g.cD.a(this.g.dI(), 9.0)) {
                return super.b();
            }
            return false;
        }

        @Override
        public boolean c() {
            return super.c() && this.g.p() && this.g.cD.a(this.g.dI(), 9.0);
        }

        @Override
        public void a() {
            super.a();
            is $$0 = this.g.dK();
            if (!this.g.by() && this.m()) {
                if (this.g.cC < 1) {
                    this.g.y(true);
                } else if (this.g.cC > this.a(200)) {
                    dwo $$1 = this.g.ao();
                    $$1.a(null, $$0, bda.DF, bdb.e, 0.3f, 0.9f + $$1.y.i() * 0.2f);
                    is $$2 = this.e.d();
                    eoh $$3 = (eoh)dzs.nb.m().b(ejb.c, this.g.as.a(4) + 1);
                    $$1.a($$2, $$3, 3);
                    $$1.a(etk.i, $$2, etk.a.a(this.g, $$3));
                    this.g.x(false);
                    this.g.y(false);
                    this.g.r(600);
                }
                if (this.g.gP()) {
                    ++this.g.cC;
                }
            }
        }

        @Override
        protected boolean a(dwr $$0, is $$1) {
            if (!$$0.A($$1.d())) {
                return false;
            }
            return ejb.b($$0, $$1);
        }
    }

    static class c
    extends cpc {
        private static final int g = 1200;
        private final cxs h;

        c(cxs $$0, double $$1) {
            super($$0, $$0.e_() ? 2.0 : $$1, 24);
            this.h = $$0;
            this.f = -1;
        }

        @Override
        public boolean c() {
            return !this.h.by() && this.d <= 1200 && this.a(this.h.ao(), this.e);
        }

        @Override
        public boolean b() {
            if (this.h.e_() && !this.h.by()) {
                return super.b();
            }
            if (!(this.h.cF || this.h.by() || this.h.p())) {
                return super.b();
            }
            return false;
        }

        @Override
        public boolean l() {
            return this.d % 160 == 0;
        }

        @Override
        protected boolean a(dwr $$0, is $$1) {
            return $$0.a_($$1).a(dzs.J);
        }
    }

    static class b
    extends cop {
        private final cxs a;
        private final double b;
        private boolean c;
        private int d;
        private static final int e = 600;

        b(cxs $$0, double $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public boolean b() {
            if (this.a.e_()) {
                return false;
            }
            if (this.a.p()) {
                return true;
            }
            if (this.a.ep().a(cxs$b.b(700)) != 0) {
                return false;
            }
            return !this.a.cD.a(this.a.dI(), 64.0);
        }

        @Override
        public void d() {
            this.a.cF = true;
            this.c = false;
            this.d = 0;
        }

        @Override
        public void e() {
            this.a.cF = false;
        }

        @Override
        public boolean c() {
            return !this.a.cD.a(this.a.dI(), 7.0) && !this.c && this.d <= this.a(600);
        }

        @Override
        public void a() {
            is $$0 = this.a.cD;
            boolean $$1 = $$0.a(this.a.dI(), 16.0);
            if ($$1) {
                ++this.d;
            }
            if (this.a.N().l()) {
                ftm $$2 = ftm.c($$0);
                ftm $$3 = cso.a((cht)this.a, 16, 3, $$2, 0.3141592741012573);
                if ($$3 == null) {
                    $$3 = cso.a((cht)this.a, 8, 7, $$2, 1.5707963705062866);
                }
                if ($$3 != null && !$$1 && !this.a.ao().a_(is.a($$3)).a(dzs.J)) {
                    $$3 = cso.a((cht)this.a, 16, 5, $$2, 1.5707963705062866);
                }
                if ($$3 == null) {
                    this.c = true;
                    return;
                }
                this.a.N().a($$3.g, $$3.h, $$3.i, this.b);
            }
        }
    }

    static class i
    extends cop {
        private final cxs a;
        private final double b;
        private boolean c;

        i(cxs $$0, double $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public boolean b() {
            return !this.a.cF && !this.a.p() && this.a.by();
        }

        @Override
        public void d() {
            int $$0 = 512;
            int $$1 = 4;
            bgr $$2 = this.a.as;
            int $$3 = $$2.a(1025) - 512;
            int $$4 = $$2.a(9) - 4;
            int $$5 = $$2.a(1025) - 512;
            if ((double)$$4 + this.a.dR() > (double)(this.a.ao().V() - 1)) {
                $$4 = 0;
            }
            this.a.cE = is.a((double)$$3 + this.a.dP(), (double)$$4 + this.a.dR(), (double)$$5 + this.a.dV());
            this.c = false;
        }

        @Override
        public void a() {
            if (this.a.cE == null) {
                this.c = true;
                return;
            }
            if (this.a.N().l()) {
                ftm $$0 = ftm.c(this.a.cE);
                ftm $$1 = cso.a((cht)this.a, 16, 3, $$0, 0.3141592741012573);
                if ($$1 == null) {
                    $$1 = cso.a((cht)this.a, 8, 7, $$0, 1.5707963705062866);
                }
                if ($$1 != null) {
                    int $$2 = bgj.c($$1.g);
                    int $$3 = bgj.c($$1.i);
                    int $$4 = 34;
                    if (!this.a.ao().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                        $$1 = null;
                    }
                }
                if ($$1 == null) {
                    this.c = true;
                    return;
                }
                this.a.N().a($$1.g, $$1.h, $$1.i, this.b);
            }
        }

        @Override
        public boolean c() {
            return !this.a.N().l() && !this.c && !this.a.cF && !this.a.hb() && !this.a.p();
        }

        @Override
        public void e() {
            this.a.cE = null;
            super.e();
        }
    }

    static class h
    extends cpm {
        private final cxs i;

        h(cxs $$0, double $$1, int $$2) {
            super($$0, $$1, $$2);
            this.i = $$0;
        }

        @Override
        public boolean b() {
            if (!(this.b.by() || this.i.cF || this.i.p())) {
                return super.b();
            }
            return false;
        }
    }

    static class g
    extends crb {
        g(cxs $$0, dwo $$1) {
            super($$0, $$1);
        }

        @Override
        public boolean a(is $$0) {
            chn chn2 = this.a;
            if (chn2 instanceof cxs) {
                cxs $$1 = (cxs)chn2;
                if ($$1.cE != null) {
                    return this.b.a_($$0).a(dzs.J);
                }
            }
            return !this.b.a_($$0.e()).l();
        }
    }
}

