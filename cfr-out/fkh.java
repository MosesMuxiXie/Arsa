/*
 * Decompiled with CFR 0.152.
 */
public class fkh {
    protected static final int[][] a = new int[][]{{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}, {1, 1, 0}, {0, -1, 1}, {-1, 1, 0}, {0, -1, -1}};
    private static final double e = Math.sqrt(3.0);
    private static final double f = 0.5 * (e - 1.0);
    private static final double g = (3.0 - e) / 6.0;
    private final int[] h = new int[512];
    public final double b;
    public final double c;
    public final double d;

    public fkh(bgr $$0) {
        this.b = $$0.j() * 256.0;
        this.c = $$0.j() * 256.0;
        this.d = $$0.j() * 256.0;
        for (int $$1 = 0; $$1 < 256; ++$$1) {
            this.h[$$1] = $$1;
        }
        for (int $$2 = 0; $$2 < 256; ++$$2) {
            int $$3 = $$0.a(256 - $$2);
            int $$4 = this.h[$$2];
            this.h[$$2] = this.h[$$3 + $$2];
            this.h[$$3 + $$2] = $$4;
        }
    }

    private int a(int $$0) {
        return this.h[$$0 & 0xFF];
    }

    protected static double a(int[] $$0, double $$1, double $$2, double $$3) {
        return (double)$$0[0] * $$1 + (double)$$0[1] * $$2 + (double)$$0[2] * $$3;
    }

    private double a(int $$0, double $$1, double $$2, double $$3, double $$4) {
        double $$7;
        double $$5 = $$4 - $$1 * $$1 - $$2 * $$2 - $$3 * $$3;
        if ($$5 < 0.0) {
            double $$6 = 0.0;
        } else {
            $$5 *= $$5;
            $$7 = $$5 * $$5 * fkh.a(a[$$0], $$1, $$2, $$3);
        }
        return $$7;
    }

    public double a(double $$0, double $$1) {
        int $$13;
        int $$12;
        double $$7;
        double $$9;
        int $$4;
        double $$5;
        double $$2 = ($$0 + $$1) * f;
        int $$3 = bgj.c($$0 + $$2);
        double $$6 = (double)$$3 - ($$5 = (double)($$3 + ($$4 = bgj.c($$1 + $$2))) * g);
        double $$8 = $$0 - $$6;
        if ($$8 > ($$9 = $$1 - ($$7 = (double)$$4 - $$5))) {
            boolean $$10 = true;
            boolean $$11 = false;
        } else {
            $$12 = 0;
            $$13 = 1;
        }
        double $$14 = $$8 - (double)$$12 + g;
        double $$15 = $$9 - (double)$$13 + g;
        double $$16 = $$8 - 1.0 + 2.0 * g;
        double $$17 = $$9 - 1.0 + 2.0 * g;
        int $$18 = $$3 & 0xFF;
        int $$19 = $$4 & 0xFF;
        int $$20 = this.a($$18 + this.a($$19)) % 12;
        int $$21 = this.a($$18 + $$12 + this.a($$19 + $$13)) % 12;
        int $$22 = this.a($$18 + 1 + this.a($$19 + 1)) % 12;
        double $$23 = this.a($$20, $$8, $$9, 0.0, 0.5);
        double $$24 = this.a($$21, $$14, $$15, 0.0, 0.5);
        double $$25 = this.a($$22, $$16, $$17, 0.0, 0.5);
        return 70.0 * ($$23 + $$24 + $$25);
    }

    public double a(double $$0, double $$1, double $$2) {
        int $$51;
        int $$50;
        int $$49;
        int $$48;
        int $$47;
        int $$46;
        double $$3 = 0.3333333333333333;
        double $$4 = ($$0 + $$1 + $$2) * 0.3333333333333333;
        int $$5 = bgj.c($$0 + $$4);
        int $$6 = bgj.c($$1 + $$4);
        int $$7 = bgj.c($$2 + $$4);
        double $$8 = 0.16666666666666666;
        double $$9 = (double)($$5 + $$6 + $$7) * 0.16666666666666666;
        double $$10 = (double)$$5 - $$9;
        double $$11 = (double)$$6 - $$9;
        double $$12 = (double)$$7 - $$9;
        double $$13 = $$0 - $$10;
        double $$14 = $$1 - $$11;
        double $$15 = $$2 - $$12;
        if ($$13 >= $$14) {
            if ($$14 >= $$15) {
                boolean $$16 = true;
                boolean $$17 = false;
                boolean $$18 = false;
                boolean $$19 = true;
                boolean $$20 = true;
                boolean $$21 = false;
            } else if ($$13 >= $$15) {
                boolean $$22 = true;
                boolean $$23 = false;
                boolean $$24 = false;
                boolean $$25 = true;
                boolean $$26 = false;
                boolean $$27 = true;
            } else {
                boolean $$28 = false;
                boolean $$29 = false;
                boolean $$30 = true;
                boolean $$31 = true;
                boolean $$32 = false;
                boolean $$33 = true;
            }
        } else if ($$14 < $$15) {
            boolean $$34 = false;
            boolean $$35 = false;
            boolean $$36 = true;
            boolean $$37 = false;
            boolean $$38 = true;
            boolean $$39 = true;
        } else if ($$13 < $$15) {
            boolean $$40 = false;
            boolean $$41 = true;
            boolean $$42 = false;
            boolean $$43 = false;
            boolean $$44 = true;
            boolean $$45 = true;
        } else {
            $$46 = 0;
            $$47 = 1;
            $$48 = 0;
            $$49 = 1;
            $$50 = 1;
            $$51 = 0;
        }
        double $$52 = $$13 - (double)$$46 + 0.16666666666666666;
        double $$53 = $$14 - (double)$$47 + 0.16666666666666666;
        double $$54 = $$15 - (double)$$48 + 0.16666666666666666;
        double $$55 = $$13 - (double)$$49 + 0.3333333333333333;
        double $$56 = $$14 - (double)$$50 + 0.3333333333333333;
        double $$57 = $$15 - (double)$$51 + 0.3333333333333333;
        double $$58 = $$13 - 1.0 + 0.5;
        double $$59 = $$14 - 1.0 + 0.5;
        double $$60 = $$15 - 1.0 + 0.5;
        int $$61 = $$5 & 0xFF;
        int $$62 = $$6 & 0xFF;
        int $$63 = $$7 & 0xFF;
        int $$64 = this.a($$61 + this.a($$62 + this.a($$63))) % 12;
        int $$65 = this.a($$61 + $$46 + this.a($$62 + $$47 + this.a($$63 + $$48))) % 12;
        int $$66 = this.a($$61 + $$49 + this.a($$62 + $$50 + this.a($$63 + $$51))) % 12;
        int $$67 = this.a($$61 + 1 + this.a($$62 + 1 + this.a($$63 + 1))) % 12;
        double $$68 = this.a($$64, $$13, $$14, $$15, 0.6);
        double $$69 = this.a($$65, $$52, $$53, $$54, 0.6);
        double $$70 = this.a($$66, $$55, $$56, $$57, 0.6);
        double $$71 = this.a($$67, $$58, $$59, $$60, 0.6);
        return 32.0 * ($$68 + $$69 + $$70 + $$71);
    }
}

