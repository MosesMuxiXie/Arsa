/*
 * Decompiled with CFR 0.152.
 */
public class iov
extends iox {
    public iov(ctw $$0) {
        super($$0, bda.cc, bdb.g);
        this.j = 0;
    }

    @Override
    protected iot o() {
        return new iow(this.n);
    }

    @Override
    protected boolean p() {
        return !this.n.ab_();
    }
}

