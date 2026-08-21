/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class dcl
extends dcn
implements dac {
    public static final float a = 0.03f;
    private static final float f = 0.5f;
    boolean cv;

    public dcl(cgu<? extends dcl> $$0, dwo $$1) {
        super((cgu<? extends dcn>)$$0, $$1);
        this.cp = new d(this);
        this.a(fls.j, 0.0f);
    }

    public static cir.a k() {
        return dcn.gT().a(cis.D, 1.0);
    }

    @Override
    protected cre b(dwo $$0) {
        return new crb(this, $$0);
    }

    @Override
    protected void p() {
        this.cs.a(1, new c(this, 1.0));
        this.cs.a(2, new f(this, 1.0, 40, 10.0f));
        this.cs.a(2, new a(this, 1.0, false));
        this.cs.a(5, new b(this, 1.0));
        this.cs.a(6, new e(this, 1.0, this.ao().V()));
        this.cs.a(7, new cpm(this, 1.0));
        this.ct.a(1, new cqi(this, dcl.class).a(dcp.class));
        this.ct.a(2, new cqj<ddm>(this, ddm.class, 10, true, false, ($$0, $$1) -> this.i($$0)));
        this.ct.a(3, new cqj<dcw>((chn)this, dcw.class, false));
        this.ct.a(3, new cqj<cwh>((chn)this, cwh.class, true));
        this.ct.a(3, new cqj<ctr>((chn)this, ctr.class, true, false));
        this.ct.a(5, new cqj<cxs>(this, cxs.class, 10, true, false, cxs.cv));
    }

    @Override
    public cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        cwq $$4;
        $$3 = super.a($$0, $$1, $$2, $$3);
        if (this.a(cgv.b).f() && $$0.G_().i() < 0.03f) {
            this.a(cgv.b, new dlt(dlx.ys));
            this.g(cgv.b);
        }
        if (($$2 == cgt.a || $$2 == cgt.d) && this.fx().a(dlx.yr) && $$0.G_().i() < 0.5f && !this.e_() && !$$0.z(this.dK()).a(bdo.am) && ($$4 = cgu.bY.a(this.ao(), cgt.g)) != null) {
            if ($$2 == cgt.d) {
                $$4.gz();
            }
            $$4.b(this.dP(), this.dR(), this.dV(), this.ec(), 0.0f);
            $$4.a($$0, $$1, $$2, null);
            this.a((cgk)$$4, false, false);
            $$0.b($$4);
        }
        return $$3;
    }

    public static boolean c(cgu<dcl> $$0, dxf $$1, cgt $$2, is $$3, bgr $$4) {
        boolean $$6;
        if (!$$1.b_($$3.e()).a(bdv.a) && !cgt.a($$2)) {
            return false;
        }
        jd<dxo> $$5 = $$1.z($$3);
        boolean bl2 = $$6 = !($$1.av() == ccz.a || !cgt.b($$2) && !dcl.a($$1, $$3, $$4) || !cgt.a($$2) && !$$1.b_($$3).a(bdv.a));
        if ($$6 && (cgt.a($$2) || $$2 == cgt.j)) {
            return true;
        }
        if ($$5.a(bdo.am)) {
            return $$4.a(15) == 0 && $$6;
        }
        return $$4.a(40) == 0 && dcl.a($$1, $$3) && $$6;
    }

    private static boolean a(dwp $$0, is $$1) {
        return $$1.v() < $$0.V() - 5;
    }

    @Override
    protected bcz W() {
        if (this.by()) {
            return bda.jm;
        }
        return bda.jl;
    }

    @Override
    protected bcz h(cex $$0) {
        if (this.by()) {
            return bda.jq;
        }
        return bda.jp;
    }

    @Override
    protected bcz fd() {
        if (this.by()) {
            return bda.jo;
        }
        return bda.jn;
    }

    @Override
    protected bcz gP() {
        return bda.js;
    }

    @Override
    protected bcz bk() {
        return bda.jt;
    }

    @Override
    protected boolean gQ() {
        return true;
    }

    @Override
    protected void a(bgr $$0, cda $$1) {
        if ((double)$$0.i() > 0.9) {
            int $$2 = $$0.a(16);
            if ($$2 < 10) {
                this.a(cgv.a, new dlt(dlx.yr));
            } else {
                this.a(cgv.a, new dlt(dlx.sZ));
            }
        }
    }

    @Override
    protected boolean a(dlt $$0, dlt $$1, cgv $$2) {
        if ($$1.a(dlx.ys)) {
            return false;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected boolean gR() {
        return false;
    }

    @Override
    public boolean a(dwr $$0) {
        return $$0.f(this);
    }

    public boolean i(@Nullable chl $$0) {
        if ($$0 != null) {
            return !this.ao().ag() || $$0.by();
        }
        return false;
    }

    @Override
    public boolean db() {
        return !this.cB();
    }

    boolean gZ() {
        if (this.cv) {
            return true;
        }
        chl $$0 = this.ag_();
        return $$0 != null && $$0.by();
    }

    @Override
    protected void a(ftm $$0, double $$1, boolean $$2, double $$3) {
        if (this.bC() && this.gZ()) {
            this.a(0.01f, $$0);
            this.a(chp.a, this.dN());
            this.k(this.dN().c(0.9));
        } else {
            super.a($$0, $$1, $$2, $$3);
        }
    }

    @Override
    public void bF() {
        if (!this.ao().B_()) {
            this.j(this.dy() && this.bC() && this.gZ());
        }
    }

    @Override
    public boolean cC() {
        return this.cB() && !this.cq();
    }

    protected boolean gS() {
        double $$2;
        is $$1;
        flp $$0 = this.N().j();
        return $$0 != null && ($$1 = $$0.l()) != null && ($$2 = this.h($$1.u(), $$1.v(), $$1.w())) < 4.0;
    }

    @Override
    public void a(chl $$0, float $$1) {
        dlt $$2 = this.fx();
        dlt $$3 = $$2.a(dlx.yr) ? $$2 : new dlt(dlx.yr);
        dek $$4 = new dek(this.ao(), this, $$3);
        double $$5 = $$0.dP() - this.dP();
        double $$6 = $$0.f(0.3333333333333333) - $$4.dR();
        double $$7 = $$0.dV() - this.dV();
        double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$9 = (axf)dwo2;
            dec.a($$4, $$9, $$3, $$5, $$6 + $$8 * (double)0.2f, $$7, 1.6f, 14 - this.ao().av().a() * 4);
        }
        this.a(bda.jr, 1.0f, 1.0f / (this.ep().i() * 0.4f + 0.8f));
    }

    @Override
    public bef<dlp> aa() {
        return bdy.co;
    }

    public void x(boolean $$0) {
        this.cv = $$0;
    }

    @Override
    public void t() {
        super.t();
        cgk cgk2 = this.dA();
        if (cgk2 instanceof cht) {
            cht $$0 = (cht)cgk2;
            this.bC = $$0.bC;
        }
    }

    @Override
    public boolean c(axf $$0, dlt $$1) {
        if ($$1.a(bdy.cf)) {
            return false;
        }
        return super.c($$0, $$1);
    }

    static class d
    extends cnq {
        private final dcl l;

        public d(dcl $$0) {
            super($$0);
            this.l = $$0;
        }

        @Override
        public void a() {
            chl $$0 = this.l.ag_();
            if (this.l.gZ() && this.l.by()) {
                if ($$0 != null && $$0.dR() > this.l.dR() || this.l.cv) {
                    this.l.k(this.l.dN().b(0.0, 0.002, 0.0));
                }
                if (this.k != cnq.a.b || this.l.N().l()) {
                    this.l.C(0.0f);
                    return;
                }
                double $$1 = this.e - this.l.dP();
                double $$2 = this.f - this.l.dR();
                double $$3 = this.g - this.l.dV();
                double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
                $$2 /= $$4;
                float $$5 = (float)(bgj.d($$3, $$1) * 57.2957763671875) - 90.0f;
                this.l.v(this.b(this.l.ec(), $$5, 90.0f));
                this.l.bC = this.l.ec();
                float $$6 = (float)(this.h * this.l.i(cis.x));
                float $$7 = bgj.h(0.125f, this.l.fM(), $$6);
                this.l.C($$7);
                this.l.k(this.l.dN().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
            } else {
                if (!this.l.aV()) {
                    this.l.k(this.l.dN().b(0.0, -0.008, 0.0));
                }
                super.a();
            }
        }
    }

    static class c
    extends cop {
        private final cht a;
        private double b;
        private double c;
        private double d;
        private final double e;
        private final dwo f;

        public c(cht $$0, double $$1) {
            this.a = $$0;
            this.e = $$1;
            this.f = $$0.ao();
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean b() {
            if (!this.f.ag()) {
                return false;
            }
            if (this.a.by()) {
                return false;
            }
            ftm $$0 = this.h();
            if ($$0 == null) {
                return false;
            }
            this.b = $$0.g;
            this.c = $$0.h;
            this.d = $$0.i;
            return true;
        }

        @Override
        public boolean c() {
            return !this.a.N().l();
        }

        @Override
        public void d() {
            this.a.N().a(this.b, this.c, this.d, this.e);
        }

        private @Nullable ftm h() {
            bgr $$0 = this.a.ep();
            is $$1 = this.a.dK();
            for (int $$2 = 0; $$2 < 10; ++$$2) {
                is $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
                if (!this.f.a_($$3).a(dzs.J)) continue;
                return ftm.c($$3);
            }
            return null;
        }
    }

    static class f
    extends cpo {
        private final dcl a;

        public f(dac $$0, double $$1, int $$2, float $$3) {
            super($$0, $$1, $$2, $$3);
            this.a = (dcl)$$0;
        }

        @Override
        public boolean b() {
            return super.b() && this.a.fx().a(dlx.yr);
        }

        @Override
        public void d() {
            super.d();
            this.a.w(true);
            this.a.c(cdb.a);
        }

        @Override
        public void e() {
            super.e();
            this.a.gf();
            this.a.w(false);
        }
    }

    static class a
    extends cqf {
        private final dcl b;

        public a(dcl $$0, double $$1, boolean $$2) {
            super($$0, $$1, $$2);
            this.b = $$0;
        }

        @Override
        public boolean b() {
            return super.b() && this.b.i(this.b.ag_());
        }

        @Override
        public boolean c() {
            return super.c() && this.b.i(this.b.ag_());
        }
    }

    static class b
    extends cpc {
        private final dcl g;

        public b(dcl $$0, double $$1) {
            super($$0, $$1, 8, 2);
            this.g = $$0;
        }

        @Override
        public boolean b() {
            return super.b() && !this.g.ao().ag() && this.g.by() && this.g.dR() >= (double)(this.g.ao().V() - 3);
        }

        @Override
        public boolean c() {
            return super.c();
        }

        @Override
        protected boolean a(dwr $$0, is $$1) {
            is $$2 = $$1.d();
            if (!$$0.A($$2) || !$$0.A($$2.d())) {
                return false;
            }
            return $$0.a_($$1).b((dvt)$$0, $$1, this.g);
        }

        @Override
        public void d() {
            this.g.x(false);
            super.d();
        }

        @Override
        public void e() {
            super.e();
        }
    }

    static class e
    extends cop {
        private final dcl a;
        private final double b;
        private final int c;
        private boolean d;

        public e(dcl $$0, double $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public boolean b() {
            return !this.a.ao().ag() && this.a.by() && this.a.dR() < (double)(this.c - 2);
        }

        @Override
        public boolean c() {
            return this.b() && !this.d;
        }

        @Override
        public void a() {
            if (this.a.dR() < (double)(this.c - 1) && (this.a.N().l() || this.a.gS())) {
                ftm $$0 = cso.a((cht)this.a, 4, 8, new ftm(this.a.dP(), this.c - 1, this.a.dV()), 1.5707963705062866);
                if ($$0 == null) {
                    this.d = true;
                    return;
                }
                this.a.N().a($$0.g, $$0.h, $$0.i, this.b);
            }
        }

        @Override
        public void d() {
            this.a.x(true);
            this.d = false;
        }

        @Override
        public void e() {
            this.a.x(false);
        }
    }
}

