/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.math.IntMath
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class ftu
implements fty {
    private final fts a;
    private final int b;
    private final int c;

    ftu(int $$0, int $$1) {
        this.a = new fts((int)fud.a($$0, $$1));
        int $$2 = IntMath.gcd((int)$$0, (int)$$1);
        this.b = $$0 / $$2;
        this.c = $$1 / $$2;
    }

    @Override
    public boolean a(fty.a $$0) {
        int $$1 = this.a.size() - 1;
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            if ($$0.merge($$2 / this.c, $$2 / this.b, $$2)) continue;
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

