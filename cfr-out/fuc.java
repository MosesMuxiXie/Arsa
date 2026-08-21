/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.AbstractDoubleList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class fuc
extends AbstractDoubleList {
    private final DoubleList a;
    private final double b;

    public fuc(DoubleList $$0, double $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public double getDouble(int $$0) {
        return this.a.getDouble($$0) + this.b;
    }

    public int size() {
        return this.a.size();
    }
}

