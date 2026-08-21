/*
 * Decompiled with CFR 0.152.
 */
public abstract class coe
extends cop {
    protected chn d;
    protected is e = is.c;
    protected boolean f;
    private boolean a;
    private float b;
    private float c;

    public coe(chn $$0) {
        this.d = $$0;
        if (!csp.a($$0)) {
            throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
        }
    }

    protected boolean h() {
        if (!this.f) {
            return false;
        }
        eoh $$0 = this.d.ao().a_(this.e);
        if (!($$0.b() instanceof ebz)) {
            this.f = false;
            return false;
        }
        return $$0.c(ebz.e);
    }

    protected void a(boolean $$0) {
        eoh $$1;
        if (this.f && ($$1 = this.d.ao().a_(this.e)).b() instanceof ebz) {
            ((ebz)$$1.b()).a(this.d, this.d.ao(), $$1, this.e, $$0);
        }
    }

    @Override
    public boolean b() {
        if (!csp.a(this.d)) {
            return false;
        }
        if (!this.d.ad) {
            return false;
        }
        flp $$0 = this.d.N().j();
        if ($$0 == null || $$0.c()) {
            return false;
        }
        for (int $$1 = 0; $$1 < Math.min($$0.f() + 2, $$0.e()); ++$$1) {
            fln $$2 = $$0.a($$1);
            this.e = new is($$2.a, $$2.b + 1, $$2.c);
            if (this.d.h(this.e.u(), this.d.dR(), this.e.w()) > 2.25) continue;
            this.f = ebz.a(this.d.ao(), this.e);
            if (!this.f) continue;
            return true;
        }
        this.e = this.d.dK().d();
        this.f = ebz.a(this.d.ao(), this.e);
        return this.f;
    }

    @Override
    public boolean c() {
        return !this.a;
    }

    @Override
    public void d() {
        this.a = false;
        this.b = (float)((double)this.e.u() + 0.5 - this.d.dP());
        this.c = (float)((double)this.e.w() + 0.5 - this.d.dV());
    }

    @Override
    public boolean X_() {
        return true;
    }

    @Override
    public void a() {
        float $$1;
        float $$0 = (float)((double)this.e.u() + 0.5 - this.d.dP());
        float $$2 = this.b * $$0 + this.c * ($$1 = (float)((double)this.e.w() + 0.5 - this.d.dV()));
        if ($$2 < 0.0f) {
            this.a = true;
        }
    }
}

