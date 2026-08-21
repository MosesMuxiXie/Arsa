/*
 * Decompiled with CFR 0.152.
 */
public class dgk
extends dgi {
    private float e;
    private float f;

    public dgk(cgu<?> $$0, dwo $$1) {
        super($$0, $$1);
    }

    @Override
    public cdc a(ddm $$0, cdb $$1) {
        if (!$$0.gA() && !this.cr() && (this.ao().B_() || $$0.o(this))) {
            this.f = this.e;
            if (!this.ao().B_()) {
                return $$0.o(this) ? cdc.c : cdc.e;
            }
            return cdc.a;
        }
        return cdc.e;
    }

    @Override
    protected dlp p() {
        return dlx.pi;
    }

    @Override
    public dlt dZ() {
        return new dlt(dlx.pi);
    }

    @Override
    public void a(axf $$0, int $$1, int $$2, int $$3, boolean $$4) {
        if ($$4) {
            if (this.cr()) {
                this.ce();
            }
            if (this.m() == 0) {
                this.l(-this.n());
                this.d(10);
                this.a(50.0f);
                this.bT();
            }
        }
    }

    @Override
    public boolean z() {
        return true;
    }

    @Override
    public void g() {
        double $$0 = this.ec();
        ftm $$1 = this.dI();
        super.g();
        double $$2 = ((double)this.ec() - $$0) % 360.0;
        if (this.ao().B_() && $$1.f(this.dI()) > 0.01) {
            this.e += (float)$$2;
            this.e %= 360.0f;
        }
    }

    @Override
    protected void a(cgk $$0, cgk.b $$1) {
        ddm $$2;
        super.a($$0, $$1);
        if (this.ao().B_() && $$0 instanceof ddm && ($$2 = (ddm)$$0).hs() && dgk.b(this.ao())) {
            float $$3 = (float)bgj.e(0.5, (double)this.f, (double)this.e);
            $$2.v($$2.ec() - ($$3 - this.f));
            this.f = $$3;
        }
    }
}

