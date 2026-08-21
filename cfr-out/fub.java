/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.AbstractDoubleList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class fub
extends AbstractDoubleList
implements fty {
    private final DoubleList a;
    private final DoubleList b;
    private final boolean c;

    protected fub(DoubleList $$0, DoubleList $$1, boolean $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    public int size() {
        return this.a.size() + this.b.size();
    }

    @Override
    public boolean a(fty.a $$0) {
        if (this.c) {
            return this.b(($$1, $$2, $$3) -> $$0.merge($$2, $$1, $$3));
        }
        return this.b($$0);
    }

    private boolean b(fty.a $$0) {
        int $$1 = this.a.size();
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            if ($$0.merge($$2, -1, $$2)) continue;
            return false;
        }
        int $$3 = this.b.size() - 1;
        for (int $$4 = 0; $$4 < $$3; ++$$4) {
            if ($$0.merge($$1 - 1, $$4, $$1 + $$4)) continue;
            return false;
        }
        return true;
    }

    public double getDouble(int $$0) {
        if ($$0 < this.a.size()) {
            return this.a.getDouble($$0);
        }
        return this.b.getDouble($$0 - this.a.size());
    }

    @Override
    public DoubleList a() {
        return this;
    }
}

