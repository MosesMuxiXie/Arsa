/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class ftx
implements fty {
    private final DoubleList a;

    public ftx(DoubleList $$0) {
        this.a = $$0;
    }

    @Override
    public boolean a(fty.a $$0) {
        int $$1 = this.a.size() - 1;
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            if ($$0.merge($$2, $$2, $$2)) continue;
            return false;
        }
        return true;
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public DoubleList a() {
        return this.a;
    }
}

