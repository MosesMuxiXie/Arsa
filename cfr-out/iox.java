/*
 * Decompiled with CFR 0.152.
 */
public abstract class iox
extends iot {
    private static final float o = 0.0f;
    private static final float p = 1.2f;
    private static final float q = 0.0f;
    protected final ctw n;
    private boolean r;

    public iox(ctw $$0, bcz $$1, bdb $$2) {
        super($$1, $$2, ipm.u());
        this.n = $$0;
        this.f = (float)$$0.dP();
        this.g = (float)$$0.dR();
        this.h = (float)$$0.dV();
        this.i = true;
        this.j = 0;
        this.d = 0.0f;
    }

    @Override
    public void q() {
        boolean $$0 = this.p();
        if ($$0 && !this.m()) {
            gfj.V().ap().a(this.o());
            this.r = true;
        }
        if (this.n.eh() || this.r) {
            this.n();
            return;
        }
        this.f = (float)this.n.dP();
        this.g = (float)this.n.dR();
        this.h = (float)this.n.dV();
        float $$1 = (float)this.n.dN().i();
        if ($$1 >= 0.01f) {
            this.e = bgj.h(bgj.a($$1, this.t(), this.v()), this.t(), this.v());
            this.d = bgj.h(bgj.a($$1, 0.0f, 0.5f), 0.0f, 1.2f);
        } else {
            this.e = 0.0f;
            this.d = 0.0f;
        }
    }

    private float t() {
        if (this.n.e_()) {
            return 1.1f;
        }
        return 0.7f;
    }

    private float v() {
        if (this.n.e_()) {
            return 1.5f;
        }
        return 1.1f;
    }

    @Override
    public boolean r() {
        return true;
    }

    @Override
    public boolean s() {
        return !this.n.bq();
    }

    protected abstract iot o();

    protected abstract boolean p();
}

