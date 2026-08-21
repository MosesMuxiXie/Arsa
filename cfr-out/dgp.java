/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class dgp
extends dgj
implements eme {
    private static final boolean e = true;
    private boolean f = true;
    private boolean g = false;

    public dgp(cgu<? extends dgp> $$0, dwo $$1) {
        super($$0, $$1);
    }

    @Override
    public eoh w() {
        return dzs.hT.m();
    }

    @Override
    public int y() {
        return 1;
    }

    @Override
    public int b() {
        return 5;
    }

    @Override
    public void a(axf $$0, int $$1, int $$2, int $$3, boolean $$4) {
        boolean $$5;
        boolean bl2 = $$5 = !$$4;
        if ($$5 != this.B()) {
            this.r($$5);
        }
    }

    public boolean B() {
        return this.f;
    }

    public void r(boolean $$0) {
        this.f = $$0;
    }

    @Override
    public double C() {
        return this.dP();
    }

    @Override
    public double D() {
        return this.dR() + 0.5;
    }

    @Override
    public double E() {
        return this.dV();
    }

    @Override
    public boolean F() {
        return false;
    }

    @Override
    public void g() {
        this.g = false;
        super.g();
        this.H();
    }

    @Override
    protected double a(is $$0, epl $$1, double $$2) {
        double $$3 = super.a($$0, $$1, $$2);
        this.H();
        return $$3;
    }

    private void H() {
        if (!this.ao().B_() && this.cb() && this.B() && !this.g && this.G()) {
            this.g = true;
            this.e();
        }
    }

    public boolean G() {
        if (emf.a(this.ao(), this)) {
            return true;
        }
        List<cgk> $$0 = this.ao().a(czl.class, this.dj().c(0.25, 0.0, 0.25), cgs.a);
        for (czl czl2 : $$0) {
            if (!emf.a((ccv)this, czl2)) continue;
            return true;
        }
        return false;
    }

    @Override
    protected dlp p() {
        return dlx.pm;
    }

    @Override
    public dlt dZ() {
        return new dlt(dlx.pm);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Enabled", this.f);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.f = $$0.a("Enabled", true);
    }

    @Override
    public dhi a(int $$0, ddl $$1) {
        return new dik($$0, $$1, this);
    }
}

