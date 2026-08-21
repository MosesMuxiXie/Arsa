/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.mutable.MutableDouble
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import org.apache.commons.lang3.mutable.MutableDouble;
import org.jspecify.annotations.Nullable;

public interface euc {
    public static euc a(euu $$0, dvu $$1, euw $$2, evd $$3, int $$4, int $$5, a $$6) {
        return new c($$0, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    public static euc a(final a $$0) {
        return new euc(){

            @Override
            public @Nullable eoh a(euj.b $$02, double $$1) {
                if ($$1 > 0.0) {
                    return null;
                }
                return $$0.computeFluid($$02.a(), $$02.b(), $$02.c()).a($$02.b());
            }

            @Override
            public boolean a() {
                return false;
            }
        };
    }

    public @Nullable eoh a(euj.b var1, double var2);

    public boolean a();

    public static class c
    implements euc {
        private static final int a = 10;
        private static final int b = 9;
        private static final int c = 10;
        private static final int d = 6;
        private static final int e = 3;
        private static final int f = 6;
        private static final int g = 16;
        private static final int h = 12;
        private static final int i = 16;
        private static final int j = 4;
        private static final int k = 4;
        private static final int l = 11;
        private static final double m = euc$c.a(bgj.i(10), bgj.i(12));
        private static final int n = -5;
        private static final int o = 1;
        private static final int p = -5;
        private static final int q = 0;
        private static final int r = -1;
        private static final int s = 0;
        private static final int t = 1;
        private static final int u = 1;
        private static final int v = 1;
        private final euu w;
        private final euj x;
        private final euj y;
        private final euj z;
        private final euj A;
        private final evd B;
        private final @Nullable b[] C;
        private final long[] D;
        private final a E;
        private final euj F;
        private final euj G;
        private boolean H;
        private final int I;
        private final int J;
        private final int K;
        private final int L;
        private final int M;
        private final int N;
        private static final int[][] O = new int[][]{{0, 0}, {-2, -1}, {-1, -1}, {0, -1}, {1, -1}, {-3, 0}, {-2, 0}, {-1, 0}, {1, 0}, {-2, 1}, {-1, 1}, {0, 1}, {1, 1}};

        c(euu $$0, dvu $$1, euw $$2, evd $$3, int $$4, int $$5, a $$6) {
            this.w = $$0;
            this.x = $$2.a();
            this.y = $$2.b();
            this.z = $$2.c();
            this.A = $$2.d();
            this.F = $$2.h();
            this.G = $$2.i();
            this.B = $$3;
            this.J = euc$c.a($$1.e() + -5) + 0;
            this.E = $$6;
            int $$7 = euc$c.a($$1.g() + -5) + 1;
            this.M = $$7 - this.J + 1;
            this.K = euc$c.b($$4 + 1) + -1;
            int $$8 = euc$c.b($$4 + $$5 + 1) + 1;
            int $$9 = $$8 - this.K + 1;
            this.L = euc$c.c($$1.f() + -5) + 0;
            int $$10 = euc$c.c($$1.h() + -5) + 1;
            this.N = $$10 - this.L + 1;
            int $$11 = this.M * $$9 * this.N;
            this.C = new b[$$11];
            this.D = new long[$$11];
            Arrays.fill(this.D, Long.MAX_VALUE);
            int $$12 = this.e($$0.a(euc$c.b(this.J, 0), euc$c.d(this.L, 0), euc$c.b($$7, 9), euc$c.d($$10, 9)));
            int $$13 = euc$c.b($$12 + 12) - -1;
            this.I = euc$c.c($$13, 11) - 1;
        }

        private int a(int $$0, int $$1, int $$2) {
            int $$3 = $$0 - this.J;
            int $$4 = $$1 - this.K;
            int $$5 = $$2 - this.L;
            return ($$4 * this.N + $$5) * this.M + $$3;
        }

        @Override
        public @Nullable eoh a(euj.b $$0, double $$1) {
            boolean $$47;
            double $$44;
            double $$42;
            eoh $$35;
            if ($$1 > 0.0) {
                this.H = false;
                return null;
            }
            int $$2 = $$0.a();
            int $$3 = $$0.b();
            int $$4 = $$0.c();
            b $$5 = this.E.computeFluid($$2, $$3, $$4);
            if ($$3 > this.I) {
                this.H = false;
                return $$5.a($$3);
            }
            if ($$5.a($$3).a(dzs.K)) {
                this.H = false;
                return w.ay ? dzs.a.m() : dzs.K.m();
            }
            int $$6 = euc$c.a($$2 + -5);
            int $$7 = euc$c.b($$3 + 1);
            int $$8 = euc$c.c($$4 + -5);
            int $$9 = Integer.MAX_VALUE;
            int $$10 = Integer.MAX_VALUE;
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = 0;
            int $$14 = 0;
            int $$15 = 0;
            int $$16 = 0;
            for (int $$17 = 0; $$17 <= 1; ++$$17) {
                for (int $$18 = -1; $$18 <= 1; ++$$18) {
                    for (int $$19 = 0; $$19 <= 1; ++$$19) {
                        long $$27;
                        int $$20 = $$6 + $$17;
                        int $$21 = $$7 + $$18;
                        int $$22 = $$8 + $$19;
                        int $$23 = this.a($$20, $$21, $$22);
                        long $$24 = this.D[$$23];
                        if ($$24 != Long.MAX_VALUE) {
                            long $$25 = $$24;
                        } else {
                            bgr $$26 = this.B.a($$20, $$21, $$22);
                            this.D[$$23] = $$27 = is.a(euc$c.b($$20, $$26.a(10)), euc$c.c($$21, $$26.a(9)), euc$c.d($$22, $$26.a(10)));
                        }
                        int $$28 = is.a($$27) - $$2;
                        int $$29 = is.b($$27) - $$3;
                        int $$30 = is.c($$27) - $$4;
                        int $$31 = $$28 * $$28 + $$29 * $$29 + $$30 * $$30;
                        if ($$9 >= $$31) {
                            $$16 = $$15;
                            $$15 = $$14;
                            $$14 = $$13;
                            $$13 = $$23;
                            $$12 = $$11;
                            $$11 = $$10;
                            $$10 = $$9;
                            $$9 = $$31;
                            continue;
                        }
                        if ($$10 >= $$31) {
                            $$16 = $$15;
                            $$15 = $$14;
                            $$14 = $$23;
                            $$12 = $$11;
                            $$11 = $$10;
                            $$10 = $$31;
                            continue;
                        }
                        if ($$11 >= $$31) {
                            $$16 = $$15;
                            $$15 = $$23;
                            $$12 = $$11;
                            $$11 = $$31;
                            continue;
                        }
                        if ($$12 < $$31) continue;
                        $$16 = $$23;
                        $$12 = $$31;
                    }
                }
            }
            b $$32 = this.d($$13);
            double $$33 = euc$c.a($$9, $$10);
            eoh $$34 = $$32.a($$3);
            eoh eoh2 = $$35 = w.ay ? dzs.a.m() : $$34;
            if ($$33 <= 0.0) {
                b $$36;
                this.H = $$33 >= m ? !$$32.equals($$36 = this.d($$14)) : false;
                return $$35;
            }
            if ($$34.a(dzs.J) && this.E.computeFluid($$2, $$3 - 1, $$4).a($$3 - 1).a(dzs.K)) {
                this.H = true;
                return $$35;
            }
            MutableDouble $$37 = new MutableDouble(Double.NaN);
            b $$38 = this.d($$14);
            double $$39 = $$33 * this.a($$0, $$37, $$32, $$38);
            if ($$1 + $$39 > 0.0) {
                this.H = false;
                return null;
            }
            b $$40 = this.d($$15);
            double $$41 = euc$c.a($$9, $$11);
            if ($$41 > 0.0 && $$1 + ($$42 = $$33 * $$41 * this.a($$0, $$37, $$32, $$40)) > 0.0) {
                this.H = false;
                return null;
            }
            double $$43 = euc$c.a($$10, $$11);
            if ($$43 > 0.0 && $$1 + ($$44 = $$33 * $$43 * this.a($$0, $$37, $$38, $$40)) > 0.0) {
                this.H = false;
                return null;
            }
            boolean $$45 = !$$32.equals($$38);
            boolean $$46 = $$43 >= m && !$$38.equals($$40);
            boolean bl2 = $$47 = $$41 >= m && !$$32.equals($$40);
            this.H = $$45 || $$46 || $$47 ? true : $$41 >= m && euc$c.a($$9, $$12) >= m && !$$32.equals(this.d($$16));
            return $$35;
        }

        @Override
        public boolean a() {
            return this.H;
        }

        private static double a(int $$0, int $$1) {
            double $$2 = 25.0;
            return 1.0 - (double)($$1 - $$0) / 25.0;
        }

        private double a(euj.b $$0, MutableDouble $$1, b $$2, b $$3) {
            double $$29;
            double $$23;
            int $$4 = $$0.b();
            eoh $$5 = $$2.a($$4);
            eoh $$6 = $$3.a($$4);
            if ($$5.a(dzs.K) && $$6.a(dzs.J) || $$5.a(dzs.J) && $$6.a(dzs.K)) {
                return 2.0;
            }
            int $$7 = Math.abs($$2.a - $$3.a);
            if ($$7 == 0) {
                return 0.0;
            }
            double $$8 = 0.5 * (double)($$2.a + $$3.a);
            double $$9 = (double)$$4 + 0.5 - $$8;
            double $$10 = (double)$$7 / 2.0;
            double $$11 = 0.0;
            double $$12 = 2.5;
            double $$13 = 1.5;
            double $$14 = 3.0;
            double $$15 = 10.0;
            double $$16 = 3.0;
            double $$17 = $$10 - Math.abs($$9);
            if ($$9 > 0.0) {
                double $$18 = 0.0 + $$17;
                if ($$18 > 0.0) {
                    double $$19 = $$18 / 1.5;
                } else {
                    double $$20 = $$18 / 2.5;
                }
            } else {
                double $$21 = 3.0 + $$17;
                if ($$21 > 0.0) {
                    double $$22 = $$21 / 3.0;
                } else {
                    $$23 = $$21 / 10.0;
                }
            }
            double $$24 = 2.0;
            if ($$23 < -2.0 || $$23 > 2.0) {
                double $$25 = 0.0;
            } else {
                double $$26 = $$1.doubleValue();
                if (Double.isNaN($$26)) {
                    double $$27 = this.x.a($$0);
                    $$1.setValue($$27);
                    double $$28 = $$27;
                } else {
                    $$29 = $$26;
                }
            }
            return 2.0 * ($$29 + $$23);
        }

        private static int a(int $$0) {
            return $$0 >> 4;
        }

        private static int b(int $$0, int $$1) {
            return ($$0 << 4) + $$1;
        }

        private static int b(int $$0) {
            return Math.floorDiv($$0, 12);
        }

        private static int c(int $$0, int $$1) {
            return $$0 * 12 + $$1;
        }

        private static int c(int $$0) {
            return $$0 >> 4;
        }

        private static int d(int $$0, int $$1) {
            return ($$0 << 4) + $$1;
        }

        private b d(int $$0) {
            b $$3;
            b $$1 = this.C[$$0];
            if ($$1 != null) {
                return $$1;
            }
            long $$2 = this.D[$$0];
            this.C[$$0] = $$3 = this.b(is.a($$2), is.b($$2), is.c($$2));
            return $$3;
        }

        private b b(int $$0, int $$1, int $$2) {
            b $$3 = this.E.computeFluid($$0, $$1, $$2);
            int $$4 = Integer.MAX_VALUE;
            int $$5 = $$1 + 12;
            int $$6 = $$1 - 12;
            boolean $$7 = false;
            for (int[] $$8 : O) {
                b $$15;
                boolean $$14;
                boolean $$13;
                int $$9 = $$0 + jw.c($$8[0]);
                int $$10 = $$2 + jw.c($$8[1]);
                int $$11 = this.w.a($$9, $$10);
                int $$12 = this.e($$11);
                boolean bl2 = $$13 = $$8[0] == 0 && $$8[1] == 0;
                if ($$13 && $$6 > $$12) {
                    return $$3;
                }
                boolean bl3 = $$14 = $$5 > $$12;
                if (($$14 || $$13) && !($$15 = this.E.computeFluid($$9, $$12, $$10)).a($$12).l()) {
                    if ($$13) {
                        $$7 = true;
                    }
                    if ($$14) {
                        return $$15;
                    }
                }
                $$4 = Math.min($$4, $$11);
            }
            int $$16 = this.a($$0, $$1, $$2, $$3, $$4, $$7);
            return new b($$16, this.a($$0, $$1, $$2, $$3, $$16));
        }

        private int e(int $$0) {
            return $$0 + 8;
        }

        private int a(int $$0, int $$1, int $$2, b $$3, int $$4, boolean $$5) {
            int $$19;
            double $$16;
            double $$15;
            euj.e $$6 = new euj.e($$0, $$1, $$2);
            if (dye.a(this.F, this.G, $$6)) {
                double $$7 = -1.0;
                double $$8 = -1.0;
            } else {
                int $$9 = $$4 + 8 - $$1;
                int $$10 = 64;
                double $$11 = $$5 ? bgj.a((double)$$9, 0.0, 64.0, 1.0, 0.0) : 0.0;
                double $$12 = bgj.a(this.y.a($$6), -1.0, 1.0);
                double $$13 = bgj.b($$11, 1.0, 0.0, -0.3, 0.8);
                double $$14 = bgj.b($$11, 1.0, 0.0, -0.8, 0.4);
                $$15 = $$12 - $$14;
                $$16 = $$12 - $$13;
            }
            if ($$16 > 0.0) {
                int $$17 = $$3.a;
            } else if ($$15 > 0.0) {
                int $$18 = this.a($$0, $$1, $$2, $$4);
            } else {
                $$19 = esh.g;
            }
            return $$19;
        }

        private int a(int $$0, int $$1, int $$2, int $$3) {
            int $$4 = 16;
            int $$5 = 40;
            int $$6 = Math.floorDiv($$0, 16);
            int $$7 = Math.floorDiv($$1, 40);
            int $$8 = Math.floorDiv($$2, 16);
            int $$9 = $$7 * 40 + 20;
            int $$10 = 10;
            double $$11 = this.z.a(new euj.e($$6, $$7, $$8)) * 10.0;
            int $$12 = bgj.a($$11, 3);
            int $$13 = $$9 + $$12;
            return Math.min($$3, $$13);
        }

        private eoh a(int $$0, int $$1, int $$2, b $$3, int $$4) {
            eoh $$5 = $$3.b;
            if ($$4 <= -10 && $$4 != esh.g && $$3.b != dzs.K.m()) {
                int $$10;
                int $$9;
                int $$6 = 64;
                int $$7 = 40;
                int $$8 = Math.floorDiv($$0, 64);
                double $$11 = this.A.a(new euj.e($$8, $$9 = Math.floorDiv($$1, 40), $$10 = Math.floorDiv($$2, 64)));
                if (Math.abs($$11) > 0.3) {
                    $$5 = dzs.K.m();
                }
            }
            return $$5;
        }
    }

    public static interface a {
        public b computeFluid(int var1, int var2, int var3);
    }

    public static final class b
    extends Record {
        final int a;
        final eoh b;

        public b(int $$0, eoh $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public eoh a(int $$0) {
            return $$0 < this.a ? this.b : dzs.a.m();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "fluidLevel;fluidType", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "fluidLevel;fluidType", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "fluidLevel;fluidType", "a", "b"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public eoh b() {
            return this.b;
        }
    }
}

