/*
 * Decompiled with CFR 0.152.
 */
public class ipg
extends ipf {
    private final ddm n;
    private final dgi o;
    private final boolean p;

    public ipg(ddm $$0, dgi $$1, boolean $$2, bcz $$3, float $$4, float $$5, float $$6) {
        super($$0, $$1, $$2, $$3, bdb.g, $$4, $$5, $$6);
        this.n = $$0;
        this.o = $$1;
        this.p = $$2;
    }

    @Override
    protected boolean o() {
        return this.p != this.n.bC();
    }

    @Override
    protected float p() {
        return (float)this.o.dN().i();
    }

    @Override
    protected boolean t() {
        return this.o.cH() || !(this.o.q() instanceof dgs);
    }
}

