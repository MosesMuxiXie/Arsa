/*
 * Decompiled with CFR 0.152.
 */
public class ceh {
    private static final int a = 2;
    private static final int b = 6;
    private static final double[] c = new double[]{0.0, 1.0, 4.0, 6.0, 4.0, 1.0, 0.0};

    public static <V> void a(ftm $$0, b<V> $$1, a<V> $$2) {
        $$0 = $$0.a(0.5, 0.5, 0.5);
        int $$3 = bgj.c($$0.a());
        int $$4 = bgj.c($$0.b());
        int $$5 = bgj.c($$0.c());
        double $$6 = $$0.a() - (double)$$3;
        double $$7 = $$0.b() - (double)$$4;
        double $$8 = $$0.c() - (double)$$5;
        for (int $$9 = 0; $$9 < 6; ++$$9) {
            double $$10 = bgj.d($$8, c[$$9 + 1], c[$$9]);
            int $$11 = $$5 - 2 + $$9;
            for (int $$12 = 0; $$12 < 6; ++$$12) {
                double $$13 = bgj.d($$6, c[$$12 + 1], c[$$12]);
                int $$14 = $$3 - 2 + $$12;
                for (int $$15 = 0; $$15 < 6; ++$$15) {
                    double $$16 = bgj.d($$7, c[$$15 + 1], c[$$15]);
                    int $$17 = $$4 - 2 + $$15;
                    double $$18 = $$13 * $$16 * $$10;
                    V $$19 = $$1.get($$14, $$17, $$11);
                    $$2.accumulate($$18, $$19);
                }
            }
        }
    }

    @FunctionalInterface
    public static interface b<V> {
        public V get(int var1, int var2, int var3);
    }

    @FunctionalInterface
    public static interface a<V> {
        public void accumulate(double var1, V var3);
    }
}

