/*
 * Decompiled with CFR 0.152.
 */
public abstract class gix
extends gjc {
    public static final int b = 6;
    private double a;
    private static final amo c = amo.b("widget/scroller");
    private static final amo d = amo.b("widget/scroller_background");
    private boolean e;

    public gix(int $$0, int $$1, int $$2, int $$3, yh $$4) {
        super($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2, double $$3) {
        if (!this.l) {
            return false;
        }
        this.a(this.h() - $$3 * this.p());
        return true;
    }

    @Override
    public boolean a(gzc $$0, double $$1, double $$2) {
        if (this.e) {
            if ($$0.v() < (double)this.aU_()) {
                this.a(0.0);
            } else if ($$0.v() > (double)this.F()) {
                this.a((double)this.j());
            } else {
                double $$3 = Math.max(1, this.j());
                int $$4 = this.l();
                double $$5 = Math.max(1.0, $$3 / (double)(this.h - $$4));
                this.a(this.h() + $$2 * $$5);
            }
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void a(gzc $$0) {
        this.e = false;
    }

    public double h() {
        return this.a;
    }

    public void a(double $$0) {
        this.a = bgj.a($$0, 0.0, (double)this.j());
    }

    public boolean c(gzc $$0) {
        this.e = this.k() && this.a($$0.w()) && this.a($$0.u(), $$0.v());
        return this.e;
    }

    protected boolean a(double $$0, double $$1) {
        return $$0 >= (double)this.m() && $$0 <= (double)(this.m() + 6) && $$1 >= (double)this.aU_() && $$1 < (double)this.F();
    }

    public void i() {
        this.a(this.a);
    }

    public int j() {
        return Math.max(0, this.o() - this.h);
    }

    protected boolean k() {
        return this.j() > 0;
    }

    protected int l() {
        return bgj.a((int)((float)(this.h * this.h) / (float)this.o()), 32, this.h - 8);
    }

    protected int m() {
        return this.E() - 6;
    }

    protected int n() {
        return Math.max(this.aU_(), (int)this.a * (this.h - this.l()) / this.j() + this.aU_());
    }

    protected void a(gir $$0, int $$1, int $$2) {
        if (this.k()) {
            int $$3 = this.m();
            int $$4 = this.l();
            int $$5 = this.n();
            $$0.a(hpa.at, d, $$3, this.aU_(), 6, this.aR_());
            $$0.a(hpa.at, c, $$3, $$5, 6, $$4);
            if (this.a($$1, $$2)) {
                $$0.a(this.e ? fyn.e : fyn.d);
            }
        }
    }

    protected abstract int o();

    protected abstract double p();
}

