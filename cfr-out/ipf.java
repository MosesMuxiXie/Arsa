/*
 * Decompiled with CFR 0.152.
 */
public class ipf
extends iot {
    private final ddm n;
    private final cgk o;
    private final boolean p;
    private final float q;
    private final float r;
    private final float s;

    public ipf(ddm $$0, cgk $$1, boolean $$2, bcz $$3, bdb $$4, float $$5, float $$6, float $$7) {
        super($$3, $$4, ipm.u());
        this.n = $$0;
        this.o = $$1;
        this.p = $$2;
        this.q = $$5;
        this.r = $$6;
        this.s = $$7;
        this.k = ipm.a.a;
        this.i = true;
        this.j = 0;
        this.d = $$5;
    }

    @Override
    public boolean s() {
        return !this.o.bq();
    }

    @Override
    public boolean r() {
        return true;
    }

    protected boolean o() {
        return this.p != this.o.bC();
    }

    protected float p() {
        return (float)this.o.dN().g();
    }

    protected boolean t() {
        return true;
    }

    @Override
    public void q() {
        if (this.o.eh() || !this.n.cq() || this.n.dz() != this.o) {
            this.n();
            return;
        }
        if (this.o()) {
            this.d = this.q;
            return;
        }
        float $$0 = this.p();
        this.d = $$0 >= 0.01f && this.t() ? this.s * bgj.b($$0, this.q, this.r) : this.q;
    }
}

