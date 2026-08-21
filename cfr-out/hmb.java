/*
 * Decompiled with CFR 0.152.
 */
public abstract class hmb
extends hmg {
    protected hmb(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ilp $$7) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        this.C = 0.96f;
        this.q = this.q * (double)0.01f + $$4;
        this.r = this.r * (double)0.01f + $$5;
        this.s = this.s * (double)0.01f + $$6;
        this.n += (double)((this.y.i() - this.y.i()) * 0.05f);
        this.o += (double)((this.y.i() - this.y.i()) * 0.05f);
        this.p += (double)((this.y.i() - this.y.i()) * 0.05f);
        this.A = (int)(8.0 / ((double)this.y.i() * 0.8 + 0.2)) + 4;
    }
}

