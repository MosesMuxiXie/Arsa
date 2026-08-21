/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class cum
extends ctg {
    private static final alw<Boolean> cy = ama.a(cum.class, aly.k);
    private static final alw<Integer> cz = ama.a(cum.class, aly.b);
    static final csk cA = csk.b().a(10.0).d();
    public static final int cv = 4800;
    private static final int cB = 2400;
    public static final Predicate<czl> cw = $$0 -> !$$0.n() && $$0.cb() && $$0.by();
    public static final float cx = 0.65f;
    private static final boolean cC = false;
    @Nullable is cD;

    public cum(cgu<? extends cum> $$0, dwo $$1) {
        super((cgu<? extends ctg>)$$0, $$1);
        this.cp = new cns(this, 85, 10, 0.02f, 0.1f, true);
        this.co = new cnr(this, 10);
        this.b_(true);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        this.j(this.cJ());
        this.w(0.0f);
        cie $$4 = Objects.requireNonNullElseGet($$3, () -> new cfy.a(0.1f));
        return super.a($$0, $$1, $$2, $$4);
    }

    public @Nullable cum b(axf $$0, cfy $$1) {
        return cgu.L.a($$0, cgt.e);
    }

    @Override
    public float eE() {
        return this.e_() ? 0.65f : 1.0f;
    }

    @Override
    protected void r(int $$0) {
    }

    public boolean p() {
        return this.az.a(cy);
    }

    public void x(boolean $$0) {
        this.az.a(cy, $$0);
    }

    public int gP() {
        return this.az.a(cz);
    }

    public void s(int $$0) {
        this.az.a(cz, $$0);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cy, false);
        $$0.a(cz, 2400);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("GotFish", this.p());
        $$0.a("Moistness", this.gP());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.x($$0.a("GotFish", false));
        this.s($$0.a("Moistness", 2400));
    }

    @Override
    protected void D() {
        this.cs.a(0, new cny(this));
        this.cs.a(0, new cqa(this));
        this.cs.a(1, new a(this));
        this.cs.a(2, new b(this, 4.0));
        this.cs.a(4, new cpn(this, 1.0, 10));
        this.cs.a(4, new cpk(this));
        this.cs.a(5, new cox(this, ddm.class, 6.0f));
        this.cs.a(5, new cod(this, 10));
        this.cs.a(6, new coz(this, 1.2f, true));
        this.cs.a(8, new c());
        this.cs.a(8, new coi(this));
        this.cs.a(9, new cnu<czx>(this, czx.class, 8.0f, 1.0, 1.0));
        this.ct.a(1, new cqi(this, czx.class).a(new Class[0]));
    }

    public static cir.a gQ() {
        return chn.E().a(cis.u, 10.0).a(cis.x, 1.2f).a(cis.d, 3.0);
    }

    @Override
    protected cre b(dwo $$0) {
        return new crg(this, $$0);
    }

    @Override
    public void fN() {
        this.a(bda.iw, 1.0f, 1.0f);
    }

    @Override
    public boolean c(chl $$0) {
        return !this.e_() && super.c($$0);
    }

    @Override
    public int cJ() {
        return 4800;
    }

    @Override
    protected int m(int $$0) {
        return this.cJ();
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
    protected boolean p(cgk $$0) {
        return true;
    }

    @Override
    protected boolean f(cgv $$0) {
        return $$0 == cgv.a && this.gn();
    }

    @Override
    protected void a(axf $$0, czl $$1) {
        dlt $$2;
        if (this.a(cgv.a).f() && this.h($$2 = $$1.e())) {
            this.a($$1);
            this.a(cgv.a, $$2);
            this.g(cgv.a);
            this.a((cgk)$$1, $$2.N());
            $$1.aC();
        }
    }

    @Override
    public void g() {
        super.g();
        if (this.gG()) {
            this.j(this.cJ());
            return;
        }
        if (this.bA()) {
            this.s(2400);
        } else {
            this.s(this.gP() - 1);
            if (this.gP() <= 0) {
                this.a(this.en().t(), 1.0f);
            }
            if (this.aV()) {
                this.k(this.dN().b((this.as.i() * 2.0f - 1.0f) * 0.2f, 0.5, (this.as.i() * 2.0f - 1.0f) * 0.2f));
                this.v(this.as.i() * 360.0f);
                this.e(false);
                this.aF = true;
            }
        }
        if (this.ao().B_() && this.by() && this.dN().h() > 0.03) {
            ftm $$0 = this.h(0.0f);
            float $$1 = bgj.b((double)(this.ec() * ((float)Math.PI / 180))) * 0.3f;
            float $$2 = bgj.a((double)(this.ec() * ((float)Math.PI / 180))) * 0.3f;
            float $$3 = 1.2f - this.as.i() * 0.7f;
            for (int $$4 = 0; $$4 < 2; ++$$4) {
                this.ao().a(ly.aw, this.dP() - $$0.g * (double)$$3 + (double)$$1, this.dR() - $$0.h, this.dV() - $$0.i * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
                this.ao().a(ly.aw, this.dP() - $$0.g * (double)$$3 - (double)$$1, this.dR() - $$0.h, this.dV() - $$0.i * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 38) {
            this.a(ly.R);
        } else {
            super.b($$0);
        }
    }

    private void a(lw $$0) {
        for (int $$1 = 0; $$1 < 7; ++$$1) {
            double $$2 = this.as.k() * 0.01;
            double $$3 = this.as.k() * 0.01;
            double $$4 = this.as.k() * 0.01;
            this.ao().a($$0, this.e(1.0), this.dS() + 0.2, this.h(1.0), $$2, $$3, $$4);
        }
    }

    @Override
    protected cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if (!$$2.f() && $$2.a(bdy.bo)) {
            if (!this.ao().B_()) {
                this.a(bda.iy, 1.0f, 1.0f);
            }
            if (this.e_()) {
                $$2.a(1, (chl)$$0);
                this.a(cum.d(-this.d), true);
            } else {
                this.x(true);
                $$2.a(1, (chl)$$0);
            }
            return cdc.a;
        }
        return super.b($$0, $$1);
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.iz;
    }

    @Override
    protected @Nullable bcz fd() {
        return bda.ix;
    }

    @Override
    protected @Nullable bcz W() {
        return this.by() ? bda.iv : bda.iu;
    }

    @Override
    protected bcz bl() {
        return bda.iC;
    }

    @Override
    protected bcz bk() {
        return bda.iD;
    }

    protected boolean gR() {
        is $$0 = this.N().h();
        if ($$0 != null) {
            return $$0.a(this.dI(), 12.0);
        }
        return false;
    }

    @Override
    protected void a(ftm $$0, double $$1, boolean $$2, double $$3) {
        this.a(this.fM(), $$0);
        this.a(chp.a, this.dN());
        this.k(this.dN().c(0.9));
        if (this.ag_() == null) {
            this.k(this.dN().b(0.0, -0.005, 0.0));
        }
    }

    @Override
    public boolean aj_() {
        return true;
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }

    static class a
    extends cop {
        private final cum a;
        private boolean b;

        a(cum $$0) {
            this.a = $$0;
            this.a(EnumSet.of(cop.a.a, cop.a.b));
        }

        @Override
        public boolean W_() {
            return false;
        }

        @Override
        public boolean b() {
            return this.a.p() && this.a.cK() >= 100;
        }

        @Override
        public boolean c() {
            is $$0 = this.a.cD;
            if ($$0 == null) {
                return false;
            }
            return !is.a((double)$$0.u(), this.a.dR(), (double)$$0.w()).a(this.a.dI(), 4.0) && !this.b && this.a.cK() >= 100;
        }

        @Override
        public void d() {
            if (!(this.a.ao() instanceof axf)) {
                return;
            }
            axf $$0 = (axf)this.a.ao();
            this.b = false;
            this.a.N().n();
            is $$1 = this.a.dK();
            is $$2 = $$0.a(beb.b, $$1, 50, false);
            if ($$2 == null) {
                this.b = true;
                return;
            }
            this.a.cD = $$2;
            $$0.a((cgk)this.a, (byte)38);
        }

        @Override
        public void e() {
            is $$0 = this.a.cD;
            if ($$0 == null || is.a((double)$$0.u(), this.a.dR(), (double)$$0.w()).a(this.a.dI(), 4.0) || this.b) {
                this.a.x(false);
            }
        }

        @Override
        public void a() {
            if (this.a.cD == null) {
                return;
            }
            dwo $$0 = this.a.ao();
            if (this.a.gR() || this.a.N().l()) {
                is $$3;
                ftm $$1 = ftm.b(this.a.cD);
                ftm $$2 = cso.a((cht)this.a, 16, 1, $$1, 0.3926991f);
                if ($$2 == null) {
                    $$2 = cso.a((cht)this.a, 8, 4, $$1, 1.5707963705062866);
                }
                if (!($$2 == null || $$0.b_($$3 = is.a($$2)).a(bdv.a) && $$0.a_($$3).a(flq.b))) {
                    $$2 = cso.a((cht)this.a, 8, 5, $$1, 1.5707963705062866);
                }
                if ($$2 == null) {
                    this.b = true;
                    return;
                }
                this.a.J().a($$2.g, $$2.h, $$2.i, this.a.ae() + 20, this.a.ac());
                this.a.N().a($$2.g, $$2.h, $$2.i, 1.3);
                if ($$0.y.a(this.a(80)) == 0) {
                    $$0.a((cgk)this.a, (byte)38);
                }
            }
        }
    }

    static class b
    extends cop {
        private final cum a;
        private final double b;
        private @Nullable ddm c;

        b(cum $$0, double $$1) {
            this.a = $$0;
            this.b = $$1;
            this.a(EnumSet.of(cop.a.a, cop.a.b));
        }

        @Override
        public boolean b() {
            this.c = cum$b.a(this.a).a(cA, this.a);
            if (this.c == null) {
                return false;
            }
            return this.c.cB() && this.a.ag_() != this.c;
        }

        @Override
        public boolean c() {
            return this.c != null && this.c.cB() && this.a.g((cgk)this.c) < 256.0;
        }

        @Override
        public void d() {
            this.c.b(new cfm(cfo.D, 100), (cgk)this.a);
        }

        @Override
        public void e() {
            this.c = null;
            this.a.N().n();
        }

        @Override
        public void a() {
            this.a.J().a(this.c, (float)(this.a.ae() + 20), (float)this.a.ac());
            if (this.a.g((cgk)this.c) < 6.25) {
                this.a.N().n();
            } else {
                this.a.N().a((cgk)this.c, this.b);
            }
            if (this.c.cB() && this.c.ao().y.a(6) == 0) {
                this.c.b(new cfm(cfo.D, 100), (cgk)this.a);
            }
        }
    }

    class c
    extends cop {
        private int b;

        c() {
        }

        @Override
        public boolean b() {
            if (this.b > cum.this.at) {
                return false;
            }
            List<czl> $$0 = cum.this.ao().a(czl.class, cum.this.dj().c(8.0, 8.0, 8.0), cw);
            return !$$0.isEmpty() || !cum.this.a(cgv.a).f();
        }

        @Override
        public void d() {
            List<czl> $$0 = cum.this.ao().a(czl.class, cum.this.dj().c(8.0, 8.0, 8.0), cw);
            if (!$$0.isEmpty()) {
                cum.this.N().a((cgk)$$0.get(0), (double)1.2f);
                cum.this.a(bda.iB, 1.0f, 1.0f);
            }
            this.b = 0;
        }

        @Override
        public void e() {
            dlt $$0 = cum.this.a(cgv.a);
            if (!$$0.f()) {
                this.a($$0);
                cum.this.a(cgv.a, dlt.l);
                this.b = cum.this.at + cum.this.as.a(100);
            }
        }

        @Override
        public void a() {
            List<czl> $$0 = cum.this.ao().a(czl.class, cum.this.dj().c(8.0, 8.0, 8.0), cw);
            dlt $$1 = cum.this.a(cgv.a);
            if (!$$1.f()) {
                this.a($$1);
                cum.this.a(cgv.a, dlt.l);
            } else if (!$$0.isEmpty()) {
                cum.this.N().a((cgk)$$0.get(0), (double)1.2f);
            }
        }

        private void a(dlt $$0) {
            if ($$0.f()) {
                return;
            }
            double $$1 = cum.this.dT() - (double)0.3f;
            czl $$2 = new czl(cum.this.ao(), cum.this.dP(), $$1, cum.this.dV(), $$0);
            $$2.a(40);
            $$2.b((cgk)cum.this);
            float $$3 = 0.3f;
            float $$4 = cum.this.as.i() * ((float)Math.PI * 2);
            float $$5 = 0.02f * cum.this.as.i();
            $$2.m(0.3f * -bgj.a((double)(cum.this.ec() * ((float)Math.PI / 180))) * bgj.b((double)(cum.this.ee() * ((float)Math.PI / 180))) + bgj.b((double)$$4) * $$5, 0.3f * bgj.a((double)(cum.this.ee() * ((float)Math.PI / 180))) * 1.5f, 0.3f * bgj.b((double)(cum.this.ec() * ((float)Math.PI / 180))) * bgj.b((double)(cum.this.ee() * ((float)Math.PI / 180))) + bgj.a((double)$$4) * $$5);
            cum.this.ao().b($$2);
        }
    }
}

