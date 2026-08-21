/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class dem
extends dec {
    public static final double b = 0.1;
    public static final double c = 0.5;
    public double d = 0.1;

    protected dem(cgu<? extends dem> $$0, dwo $$1) {
        super((cgu<? extends dec>)$$0, $$1);
    }

    protected dem(cgu<? extends dem> $$0, double $$1, double $$2, double $$3, dwo $$4) {
        this($$0, $$4);
        this.a_($$1, $$2, $$3);
    }

    public dem(cgu<? extends dem> $$0, double $$1, double $$2, double $$3, ftm $$4, dwo $$5) {
        this($$0, $$5);
        this.b($$1, $$2, $$3, this.ec(), this.ee());
        this.aH();
        this.a($$4, this.d);
    }

    public dem(cgu<? extends dem> $$0, chl $$1, ftm $$2, dwo $$3) {
        this($$0, $$1.dP(), $$1.dR(), $$1.dV(), $$2, $$3);
        this.d($$1);
        this.a($$1.ec(), $$1.ee());
    }

    @Override
    protected void a(ama.a $$0) {
    }

    @Override
    public boolean a(double $$0) {
        double $$1 = this.dj().a() * 4.0;
        if (Double.isNaN($$1)) {
            $$1 = 4.0;
        }
        return $$0 < ($$1 *= 64.0) * $$1;
    }

    protected dvw.a f() {
        return dvw.a.a;
    }

    @Override
    public void g() {
        ftm $$3;
        cgk $$0 = this.p();
        this.u();
        if (!this.ao().B_() && ($$0 != null && $$0.eh() || !this.ao().H(this.dK()))) {
            this.aC();
            return;
        }
        ftk $$1 = dee.a((cgk)this, this::b, this.f());
        if ($$1.d() != ftk.a.a) {
            ftm $$2 = $$1.g();
        } else {
            $$3 = this.dI().e(this.dN());
        }
        dee.a((cgk)this, 0.2f);
        this.b($$3);
        this.aW();
        super.g();
        if (this.i()) {
            this.e(1.0f);
        }
        if ($$1.d() != ftk.a.a && this.cb()) {
            this.a($$1);
        }
        this.v();
    }

    private void u() {
        float $$5;
        ftm $$0 = this.dN();
        ftm $$1 = this.dI();
        if (this.by()) {
            for (int $$2 = 0; $$2 < 4; ++$$2) {
                float $$3 = 0.25f;
                this.ao().a(ly.d, $$1.g - $$0.g * 0.25, $$1.h - $$0.h * 0.25, $$1.i - $$0.i * 0.25, $$0.g, $$0.h, $$0.i);
            }
            float $$4 = this.s();
        } else {
            $$5 = this.r();
        }
        this.k($$0.e($$0.d().c(this.d)).c((double)$$5));
    }

    private void v() {
        lw $$0 = this.k();
        ftm $$1 = this.dI();
        if ($$0 != null) {
            this.ao().a($$0, $$1.g, $$1.h + 0.5, $$1.i, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        return false;
    }

    @Override
    protected boolean b(cgk $$0) {
        return super.b($$0) && !$$0.ar;
    }

    protected boolean i() {
        return true;
    }

    protected @Nullable lw k() {
        return ly.ai;
    }

    protected float r() {
        return 0.95f;
    }

    protected float s() {
        return 0.8f;
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("acceleration_power", this.d);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.d = $$0.a("acceleration_power", 0.1);
    }

    @Override
    public float bO() {
        return 1.0f;
    }

    private void a(ftm $$0, double $$1) {
        this.k($$0.d().c($$1));
        this.aF = true;
    }

    @Override
    protected void a(boolean $$0) {
        super.a($$0);
        this.d = $$0 ? 0.1 : (this.d *= 0.5);
    }
}

