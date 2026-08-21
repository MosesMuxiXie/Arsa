/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class ftt
extends fug {
    protected ftt(ftv $$0) {
        super($$0);
    }

    @Override
    public DoubleList a(iz.a $$0) {
        return new fts(this.a.c($$0));
    }

    @Override
    protected int a(iz.a $$0, double $$1) {
        int $$2 = this.a.c($$0);
        return bgj.c(bgj.a($$1 * (double)$$2, -1.0, (double)$$2));
    }
}

