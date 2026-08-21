/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.AbstractDoubleList
 */
import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;

public class fts
extends AbstractDoubleList {
    private final int a;

    public fts(int $$0) {
        if ($$0 <= 0) {
            throw new IllegalArgumentException("Need at least 1 part");
        }
        this.a = $$0;
    }

    public double getDouble(int $$0) {
        return (double)$$0 / (double)this.a;
    }

    public int size() {
        return this.a + 1;
    }
}

