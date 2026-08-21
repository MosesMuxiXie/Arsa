/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntList
 */
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;

public class hkz {

    public static class d
    implements hlu<md> {
        private final hmo a;

        public d(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            c $$9 = new c($$1, $$2, $$3, $$4, $$5, $$6, $$7, gfj.V().f, this.a);
            $$9.e(0.99f);
            return $$9;
        }
    }

    public static class a
    implements hlu<lq> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(lq $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            b $$9 = new b($$1, $$2, $$3, $$4, this.a.a($$8));
            $$9.a($$0.b(), $$0.c(), $$0.d());
            $$9.e($$0.e());
            return $$9;
        }
    }

    public static class b
    extends hmg {
        b(hif $$0, double $$1, double $$2, double $$3, ilp $$4) {
            super($$0, $$1, $$2, $$3, $$4);
            this.A = 4;
        }

        @Override
        public hmg.b b() {
            return hmg.b.d;
        }

        @Override
        public void a(iku $$0, ger $$1, float $$2) {
            this.e(0.6f - ((float)this.z + $$2 - 1.0f) * 0.25f * 0.5f);
            super.a($$0, $$1, $$2);
        }

        @Override
        public float b(float $$0) {
            return 7.1f * bgj.a((double)(((float)this.z + $$0 - 1.0f) * 0.25f * (float)Math.PI));
        }
    }

    static class c
    extends hmf {
        private boolean b;
        private boolean F;
        private final hls G;
        private float H;
        private float I;
        private float J;
        private boolean K;

        c(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hls $$7, hmo $$8) {
            super($$0, $$1, $$2, $$3, $$8, 0.1f);
            this.q = $$4;
            this.r = $$5;
            this.s = $$6;
            this.G = $$7;
            this.c *= 0.75f;
            this.A = 48 + this.y.a(12);
            this.a($$8);
        }

        public void a(boolean $$0) {
            this.b = $$0;
        }

        public void b(boolean $$0) {
            this.F = $$0;
        }

        @Override
        public void a(iku $$0, ger $$1, float $$2) {
            if (!this.F || this.z < this.A / 3 || (this.z + this.A) / 3 % 2 == 0) {
                super.a($$0, $$1, $$2);
            }
        }

        @Override
        public void a() {
            super.a();
            if (this.b && this.z < this.A / 2 && (this.z + this.A) % 2 == 0) {
                c $$0 = new c(this.j, this.n, this.o, this.p, 0.0, 0.0, 0.0, this.G, this.a);
                $$0.e(0.99f);
                $$0.a(this.d, this.e, this.f);
                $$0.z = $$0.A / 2;
                if (this.K) {
                    $$0.K = true;
                    $$0.H = this.H;
                    $$0.I = this.I;
                    $$0.J = this.J;
                }
                $$0.F = this.F;
                this.G.a($$0);
            }
        }
    }

    public static class e
    extends hln {
        private static final double[][] a = new double[][]{{0.0, 0.2}, {0.2, 0.2}, {0.2, 0.6}, {0.6, 0.6}, {0.6, 0.2}, {0.2, 0.2}, {0.2, 0.0}, {0.4, 0.0}, {0.4, -0.6}, {0.2, -0.6}, {0.2, -0.4}, {0.0, -0.4}};
        private static final double[][] b = new double[][]{{0.0, 1.0}, {0.3455, 0.309}, {0.9511, 0.309}, {0.3795918367346939, -0.12653061224489795}, {0.6122448979591837, -0.8040816326530612}, {0.0, -0.35918367346938773}};
        private int c;
        private final hls d;
        private final List<dok> e;
        private boolean f;

        public e(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hls $$7, List<dok> $$8) {
            super($$0, $$1, $$2, $$3);
            this.q = $$4;
            this.r = $$5;
            this.s = $$6;
            this.d = $$7;
            if ($$8.isEmpty()) {
                throw new IllegalArgumentException("Cannot create firework starter with no explosions");
            }
            this.e = $$8;
            this.A = $$8.size() * 2 - 1;
            for (dok $$9 : $$8) {
                if (!$$9.e()) continue;
                this.f = true;
                this.A += 15;
                break;
            }
        }

        @Override
        public void a() {
            if (this.c == 0) {
                bcz $$4;
                boolean $$0 = this.c();
                boolean $$1 = false;
                if (this.e.size() >= 3) {
                    $$1 = true;
                } else {
                    for (dok $$2 : this.e) {
                        if ($$2.a() != dok.a.b) continue;
                        $$1 = true;
                        break;
                    }
                }
                if ($$1) {
                    bcz $$3 = $$0 ? bda.kC : bda.kB;
                } else {
                    $$4 = $$0 ? bda.kA : bda.kz;
                }
                this.j.a(this.n, this.o, this.p, $$4, bdb.i, 20.0f, 0.95f + this.y.i() * 0.1f, true);
            }
            if (this.c % 2 == 0 && this.c / 2 < this.e.size()) {
                int $$5 = this.c / 2;
                dok $$6 = this.e.get($$5);
                boolean $$7 = $$6.d();
                boolean $$8 = $$6.e();
                IntList $$9 = $$6.b();
                IntList $$10 = $$6.c();
                if ($$9.isEmpty()) {
                    $$9 = IntList.of((int)dkr.p.f());
                }
                switch ($$6.a()) {
                    case a: {
                        this.a(0.25, 2, $$9, $$10, $$7, $$8);
                        break;
                    }
                    case b: {
                        this.a(0.5, 4, $$9, $$10, $$7, $$8);
                        break;
                    }
                    case c: {
                        this.a(0.5, b, $$9, $$10, $$7, $$8, false);
                        break;
                    }
                    case d: {
                        this.a(0.5, a, $$9, $$10, $$7, $$8, true);
                        break;
                    }
                    case e: {
                        this.a($$9, $$10, $$7, $$8);
                    }
                }
                int $$11 = $$9.getInt(0);
                this.d.a(lq.a(ly.Q, $$11), this.n, this.o, this.p, 0.0, 0.0, 0.0);
            }
            ++this.c;
            if (this.c > this.A) {
                if (this.f) {
                    boolean $$12 = this.c();
                    bcz $$13 = $$12 ? bda.kG : bda.kF;
                    this.j.a(this.n, this.o, this.p, $$13, bdb.i, 20.0f, 0.9f + this.y.i() * 0.15f, true);
                }
                this.k();
            }
        }

        private boolean c() {
            gfj $$0 = gfj.V();
            return $$0.i.p().b().c(this.n, this.o, this.p) >= 256.0;
        }

        private void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, IntList $$6, IntList $$7, boolean $$8, boolean $$9) {
            c $$10 = (c)this.d.a(ly.E, $$0, $$1, $$2, $$3, $$4, $$5);
            $$10.a($$8);
            $$10.b($$9);
            $$10.e(0.99f);
            $$10.b((Integer)bhs.a($$6, this.y));
            if (!$$7.isEmpty()) {
                $$10.c((Integer)bhs.a($$7, this.y));
            }
        }

        private void a(double $$0, int $$1, IntList $$2, IntList $$3, boolean $$4, boolean $$5) {
            double $$6 = this.n;
            double $$7 = this.o;
            double $$8 = this.p;
            for (int $$9 = -$$1; $$9 <= $$1; ++$$9) {
                for (int $$10 = -$$1; $$10 <= $$1; ++$$10) {
                    for (int $$11 = -$$1; $$11 <= $$1; ++$$11) {
                        double $$12 = (double)$$10 + (this.y.j() - this.y.j()) * 0.5;
                        double $$13 = (double)$$9 + (this.y.j() - this.y.j()) * 0.5;
                        double $$14 = (double)$$11 + (this.y.j() - this.y.j()) * 0.5;
                        double $$15 = Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14) / $$0 + this.y.k() * 0.05;
                        this.a($$6, $$7, $$8, $$12 / $$15, $$13 / $$15, $$14 / $$15, $$2, $$3, $$4, $$5);
                        if ($$9 == -$$1 || $$9 == $$1 || $$10 == -$$1 || $$10 == $$1) continue;
                        $$11 += $$1 * 2 - 1;
                    }
                }
            }
        }

        private void a(double $$0, double[][] $$1, IntList $$2, IntList $$3, boolean $$4, boolean $$5, boolean $$6) {
            double $$7 = $$1[0][0];
            double $$8 = $$1[0][1];
            this.a(this.n, this.o, this.p, $$7 * $$0, $$8 * $$0, 0.0, $$2, $$3, $$4, $$5);
            float $$9 = this.y.i() * (float)Math.PI;
            double $$10 = $$6 ? 0.034 : 0.34;
            for (int $$11 = 0; $$11 < 3; ++$$11) {
                double $$12 = (double)$$9 + (double)((float)$$11 * (float)Math.PI) * $$10;
                double $$13 = $$7;
                double $$14 = $$8;
                for (int $$15 = 1; $$15 < $$1.length; ++$$15) {
                    double $$16 = $$1[$$15][0];
                    double $$17 = $$1[$$15][1];
                    for (double $$18 = 0.25; $$18 <= 1.0; $$18 += 0.25) {
                        double $$19 = bgj.d($$18, $$13, $$16) * $$0;
                        double $$20 = bgj.d($$18, $$14, $$17) * $$0;
                        double $$21 = $$19 * Math.sin($$12);
                        $$19 *= Math.cos($$12);
                        for (double $$22 = -1.0; $$22 <= 1.0; $$22 += 2.0) {
                            this.a(this.n, this.o, this.p, $$19 * $$22, $$20, $$21 * $$22, $$2, $$3, $$4, $$5);
                        }
                    }
                    $$13 = $$16;
                    $$14 = $$17;
                }
            }
        }

        private void a(IntList $$0, IntList $$1, boolean $$2, boolean $$3) {
            double $$4 = this.y.k() * 0.05;
            double $$5 = this.y.k() * 0.05;
            for (int $$6 = 0; $$6 < 70; ++$$6) {
                double $$7 = this.q * 0.5 + this.y.k() * 0.15 + $$4;
                double $$8 = this.s * 0.5 + this.y.k() * 0.15 + $$5;
                double $$9 = this.r * 0.5 + this.y.j() * 0.5;
                this.a(this.n, this.o, this.p, $$7, $$9, $$8, $$0, $$1, $$2, $$3);
            }
        }
    }
}

