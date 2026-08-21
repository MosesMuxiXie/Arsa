/*
 * Decompiled with CFR 0.152.
 */
public abstract class deg
extends dec {
    private static final float b = 12.25f;

    protected deg(cgu<? extends deg> $$0, dwo $$1) {
        super((cgu<? extends dec>)$$0, $$1);
    }

    protected deg(cgu<? extends deg> $$0, double $$1, double $$2, double $$3, dwo $$4) {
        this($$0, $$4);
        this.a_($$1, $$2, $$3);
    }

    @Override
    public boolean a(double $$0) {
        if (this.at < 2 && $$0 < 12.25) {
            return false;
        }
        double $$1 = this.dj().a() * 4.0;
        if (Double.isNaN($$1)) {
            $$1 = 4.0;
        }
        return $$0 < ($$1 *= 64.0) * $$1;
    }

    @Override
    public boolean o(boolean $$0) {
        return true;
    }

    @Override
    public void g() {
        ftm $$2;
        this.i();
        this.bu();
        this.f();
        ftk $$0 = dee.a((cgk)this, this::b);
        if ($$0.d() != ftk.a.a) {
            ftm $$1 = $$0.g();
        } else {
            $$2 = this.dI().e(this.dN());
        }
        this.b($$2);
        this.q();
        this.aW();
        super.g();
        if ($$0.d() != ftk.a.a && this.cb()) {
            this.a($$0);
        }
    }

    private void f() {
        float $$5;
        ftm $$0 = this.dN();
        ftm $$1 = this.dI();
        if (this.by()) {
            for (int $$2 = 0; $$2 < 4; ++$$2) {
                float $$3 = 0.25f;
                this.ao().a(ly.d, $$1.g - $$0.g * 0.25, $$1.h - $$0.h * 0.25, $$1.i - $$0.i * 0.25, $$0.g, $$0.h, $$0.i);
            }
            float $$4 = 0.8f;
        } else {
            $$5 = 0.99f;
        }
        this.k($$0.c((double)$$5));
    }

    private void i() {
        if (this.ay) {
            for (is $$0 : is.a(this.dj())) {
                eoh $$1 = this.ao().a_($$0);
                if (!$$1.a(dzs.oa)) continue;
                $$1.a(this.ao(), $$0, this, chc.a, true);
            }
        }
    }

    @Override
    protected double bs() {
        return 0.03;
    }
}

