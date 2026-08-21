/*
 * Decompiled with CFR 0.152.
 */
public abstract class cvg
extends cvm
implements cti {
    private static final alw<Boolean> a = ama.a(cvg.class, aly.k);
    private static final boolean b = false;

    public cvg(cgu<? extends cvg> $$0, dwo $$1) {
        super((cgu<? extends cvm>)$$0, $$1);
        this.cp = new a(this);
    }

    public static cir.a k() {
        return chn.E().a(cis.u, 3.0);
    }

    @Override
    public boolean ab() {
        return super.ab() || this.a();
    }

    @Override
    public boolean i(double $$0) {
        return !this.a() && !this.i_();
    }

    @Override
    public int aj() {
        return 8;
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(a, false);
    }

    @Override
    public boolean a() {
        return this.az.a(a);
    }

    @Override
    public void a(boolean $$0) {
        this.az.a(a, $$0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("FromBucket", this.a());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a($$0.a("FromBucket", false));
    }

    @Override
    protected void D() {
        super.D();
        this.cs.a(0, new cpi(this, 1.25));
        this.cs.a(2, new cnu<ddm>(this, ddm.class, 8.0f, 1.6, 1.4, cgs.f));
        this.cs.a(4, new b(this));
    }

    @Override
    protected cre b(dwo $$0) {
        return new crg(this, $$0);
    }

    @Override
    protected void a(ftm $$0, double $$1, boolean $$2, double $$3) {
        this.a(0.01f, $$0);
        this.a(chp.a, this.dN());
        this.k(this.dN().c(0.9));
        if (this.ag_() == null) {
            this.k(this.dN().b(0.0, -0.005, 0.0));
        }
    }

    @Override
    public void d_() {
        if (!this.by() && this.aV() && this.ae) {
            this.k(this.dN().b((this.as.i() * 2.0f - 1.0f) * 0.05f, 0.4f, (this.as.i() * 2.0f - 1.0f) * 0.05f));
            this.e(false);
            this.aF = true;
            this.b(this.gP());
        }
        super.d_();
    }

    @Override
    protected cdc b(ddm $$0, cdb $$1) {
        return cti.a($$0, $$1, this).orElse(super.b($$0, $$1));
    }

    @Override
    public void a(dlt $$0) {
        cti.a((chn)this, $$0);
    }

    @Override
    public void a(uz $$0) {
        cti.a((chn)this, $$0);
    }

    @Override
    public bcz c() {
        return bda.dx;
    }

    protected boolean p() {
        return true;
    }

    protected abstract bcz gP();

    @Override
    protected bcz bk() {
        return bda.kJ;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
    }

    static class a
    extends cnq {
        private final cvg l;

        a(cvg $$0) {
            super($$0);
            this.l = $$0;
        }

        @Override
        public void a() {
            if (((cgk)this.l).a(bdv.a)) {
                this.l.k(this.l.dN().b(0.0, 0.005, 0.0));
            }
            if (this.k != cnq.a.b || this.l.N().l()) {
                this.l.C(0.0f);
                return;
            }
            float $$0 = (float)(this.h * this.l.i(cis.x));
            this.l.C(bgj.h(0.125f, this.l.fM(), $$0));
            double $$1 = this.e - this.l.dP();
            double $$2 = this.f - this.l.dR();
            double $$3 = this.g - this.l.dV();
            if ($$2 != 0.0) {
                double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
                this.l.k(this.l.dN().b(0.0, (double)this.l.fM() * ($$2 / $$4) * 0.1, 0.0));
            }
            if ($$1 != 0.0 || $$3 != 0.0) {
                float $$5 = (float)(bgj.d($$3, $$1) * 57.2957763671875) - 90.0f;
                this.l.v(this.b(this.l.ec(), $$5, 90.0f));
                this.l.bC = this.l.ec();
            }
        }
    }

    static class b
    extends cpn {
        private final cvg i;

        public b(cvg $$0) {
            super($$0, 1.0, 40);
            this.i = $$0;
        }

        @Override
        public boolean b() {
            return this.i.p() && super.b();
        }
    }
}

