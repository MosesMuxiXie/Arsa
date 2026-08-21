/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  it.unimi.dsi.fastutil.doubles.DoubleLists
 */
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleLists;

public class ftz
implements fty {
    private static final DoubleList a = DoubleLists.unmodifiable((DoubleList)DoubleArrayList.wrap((double[])new double[]{0.0}));
    private final double[] b;
    private final int[] c;
    private final int[] d;
    private final int e;

    public ftz(DoubleList $$0, DoubleList $$1, boolean $$2, boolean $$3) {
        double $$4 = Double.NaN;
        int $$5 = $$0.size();
        int $$6 = $$1.size();
        int $$7 = $$5 + $$6;
        this.b = new double[$$7];
        this.c = new int[$$7];
        this.d = new int[$$7];
        boolean $$8 = !$$2;
        boolean $$9 = !$$3;
        int $$10 = 0;
        int $$11 = 0;
        int $$12 = 0;
        while (true) {
            double $$18;
            boolean $$15;
            boolean $$14;
            boolean $$13 = $$11 >= $$5;
            boolean bl2 = $$14 = $$12 >= $$6;
            if ($$13 && $$14) break;
            boolean bl3 = $$15 = !$$13 && ($$14 || $$0.getDouble($$11) < $$1.getDouble($$12) + 1.0E-7);
            if ($$15) {
                ++$$11;
                if ($$8 && ($$12 == 0 || $$14)) {
                    continue;
                }
            } else {
                ++$$12;
                if ($$9 && ($$11 == 0 || $$13)) continue;
            }
            int $$16 = $$11 - 1;
            int $$17 = $$12 - 1;
            double d2 = $$18 = $$15 ? $$0.getDouble($$16) : $$1.getDouble($$17);
            if (!($$4 >= $$18 - 1.0E-7)) {
                this.c[$$10] = $$16;
                this.d[$$10] = $$17;
                this.b[$$10] = $$18;
                ++$$10;
                $$4 = $$18;
                continue;
            }
            this.c[$$10 - 1] = $$16;
            this.d[$$10 - 1] = $$17;
        }
        this.e = Math.max(1, $$10);
    }

    @Override
    public boolean a(fty.a $$0) {
        int $$1 = this.e - 1;
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            if ($$0.merge(this.c[$$2], this.d[$$2], $$2)) continue;
            return false;
        }
        return true;
    }

    @Override
    public int size() {
        return this.e;
    }

    @Override
    public DoubleList a() {
        return this.e <= 1 ? a : DoubleArrayList.wrap((double[])this.b, (int)this.e);
    }
}

