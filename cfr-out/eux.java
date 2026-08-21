/*
 * Decompiled with CFR 0.152.
 */
import java.util.stream.Stream;

public class eux {
    public static final float a = -0.50375f;
    private static final float o = 0.08f;
    private static final double p = 1.5;
    private static final double q = 1.5;
    private static final double r = 1.5625;
    private static final double s = -0.703125;
    public static final double b = 0.390625;
    public static final int c = 64;
    public static final long d = 4096L;
    private static final int t = -64;
    private static final int u = 320;
    private static final double v = 1.5;
    private static final double w = -1.5;
    private static final int x = 24;
    private static final double y = 4.0;
    private static final euj z = euk.a(10.0);
    private static final euj A = euk.a();
    private static final amt<euj> B = eux.a("zero");
    private static final amt<euj> C = eux.a("y");
    private static final amt<euj> D = eux.a("shift_x");
    private static final amt<euj> E = eux.a("shift_z");
    private static final amt<euj> F = eux.a("overworld/base_3d_noise");
    private static final amt<euj> G = eux.a("nether/base_3d_noise");
    private static final amt<euj> H = eux.a("end/base_3d_noise");
    public static final amt<euj> e = eux.a("overworld/continents");
    public static final amt<euj> f = eux.a("overworld/erosion");
    public static final amt<euj> g = eux.a("overworld/ridges");
    public static final amt<euj> h = eux.a("overworld/ridges_folded");
    public static final amt<euj> i = eux.a("overworld/offset");
    public static final amt<euj> j = eux.a("overworld/factor");
    public static final amt<euj> k = eux.a("overworld/jaggedness");
    public static final amt<euj> l = eux.a("overworld/depth");
    private static final amt<euj> I = eux.a("overworld/sloped_cheese");
    public static final amt<euj> m = eux.a("overworld_large_biomes/continents");
    public static final amt<euj> n = eux.a("overworld_large_biomes/erosion");
    private static final amt<euj> J = eux.a("overworld_large_biomes/offset");
    private static final amt<euj> K = eux.a("overworld_large_biomes/factor");
    private static final amt<euj> L = eux.a("overworld_large_biomes/jaggedness");
    private static final amt<euj> M = eux.a("overworld_large_biomes/depth");
    private static final amt<euj> N = eux.a("overworld_large_biomes/sloped_cheese");
    private static final amt<euj> O = eux.a("overworld_amplified/offset");
    private static final amt<euj> P = eux.a("overworld_amplified/factor");
    private static final amt<euj> Q = eux.a("overworld_amplified/jaggedness");
    private static final amt<euj> R = eux.a("overworld_amplified/depth");
    private static final amt<euj> S = eux.a("overworld_amplified/sloped_cheese");
    private static final amt<euj> T = eux.a("end/sloped_cheese");
    private static final amt<euj> U = eux.a("overworld/caves/spaghetti_roughness_function");
    private static final amt<euj> V = eux.a("overworld/caves/entrances");
    private static final amt<euj> W = eux.a("overworld/caves/noodle");
    private static final amt<euj> X = eux.a("overworld/caves/pillars");
    private static final amt<euj> Y = eux.a("overworld/caves/spaghetti_2d_thickness_modulator");
    private static final amt<euj> Z = eux.a("overworld/caves/spaghetti_2d");

    private static amt<euj> a(String $$0) {
        return amt.a(mj.bb, amo.b($$0));
    }

    public static jd<? extends euj> a(qr<euj> $$0) {
        je<fke.a> $$1 = $$0.a(mj.bm);
        je<euj> $$2 = $$0.a(mj.bb);
        $$0.a(B, euk.a());
        int $$3 = esh.e * 2;
        int $$4 = esh.d * 2;
        $$0.a(C, euk.a($$3, $$4, (double)$$3, (double)$$4));
        euj $$5 = eux.a($$0, D, euk.b(euk.c(euk.b($$1.b(euz.j)))));
        euj $$6 = eux.a($$0, E, euk.b(euk.c(euk.c($$1.b(euz.j)))));
        $$0.a(F, fkb.a(0.25, 0.125, 80.0, 160.0, 8.0));
        $$0.a(G, fkb.a(0.25, 0.375, 80.0, 60.0, 8.0));
        $$0.a(H, fkb.a(0.25, 0.25, 80.0, 160.0, 4.0));
        jd.c<euj> $$7 = $$0.a(e, euk.b(euk.a($$5, $$6, 0.25, $$1.b(euz.c))));
        jd.c<euj> $$8 = $$0.a(f, euk.b(euk.a($$5, $$6, 0.25, $$1.b(euz.d))));
        euj $$9 = eux.a($$0, g, euk.b(euk.a($$5, $$6, 0.25, $$1.b(euz.i))));
        $$0.a(h, eux.b($$9));
        euj $$10 = euk.b($$1.b(euz.M), 1500.0, 0.0);
        eux.a($$0, $$2, $$10, $$7, $$8, i, j, k, l, I, false);
        jd.c<euj> $$11 = $$0.a(m, euk.b(euk.a($$5, $$6, 0.25, $$1.b(euz.g))));
        jd.c<euj> $$12 = $$0.a(n, euk.b(euk.a($$5, $$6, 0.25, $$1.b(euz.h))));
        eux.a($$0, $$2, $$10, $$11, $$12, J, K, L, M, N, false);
        eux.a($$0, $$2, $$10, $$7, $$8, O, P, Q, R, S, true);
        $$0.a(T, euk.a(euk.a(0L), eux.a($$2, H)));
        $$0.a(U, eux.b($$1));
        $$0.a(Y, euk.d(euk.a($$1.b(euz.u), 2.0, 1.0, -0.6, -1.3)));
        $$0.a(Z, eux.f($$2, $$1));
        $$0.a(V, eux.d($$2, $$1));
        $$0.a(W, eux.e($$2, $$1));
        return $$0.a(X, eux.c($$1));
    }

    private static void a(qr<euj> $$0, je<euj> $$1, euj $$2, jd<euj> $$3, jd<euj> $$4, amt<euj> $$5, amt<euj> $$6, amt<euj> $$7, amt<euj> $$8, amt<euj> $$9, boolean $$10) {
        euk.x.a $$11 = new euk.x.a($$3);
        euk.x.a $$12 = new euk.x.a($$4);
        euk.x.a $$13 = new euk.x.a($$1.b(g));
        euk.x.a $$14 = new euk.x.a($$1.b(h));
        euj $$15 = eux.a($$0, $$5, eux.a(euk.a(euk.a(-0.50375f), euk.a(rg.a($$11, $$12, $$14, $$10))), euk.c()));
        euj $$16 = eux.a($$0, $$6, eux.a(euk.a(rg.a($$11, $$12, $$13, $$14, $$10)), z));
        euj $$17 = eux.a($$0, $$8, eux.a($$15));
        euj $$18 = eux.a($$0, $$7, eux.a(euk.a(rg.b($$11, $$12, $$13, $$14, $$10)), A));
        euj $$19 = euk.b($$18, $$2.g());
        euj $$20 = eux.b($$16, euk.a($$17, $$19));
        $$0.a($$9, euk.a($$20, eux.a($$1, F)));
    }

    private static euj a(euj $$0) {
        return euk.a(euk.a(-64, 320, 1.5, -1.5), $$0);
    }

    private static euj a(qr<euj> $$0, amt<euj> $$1, euj $$2) {
        return new euk.k($$0.a($$1, $$2));
    }

    private static euj a(je<euj> $$0, amt<euj> $$1) {
        return new euk.k($$0.b($$1));
    }

    private static euj b(euj $$0) {
        return euk.b(euk.a(euk.a($$0.d(), euk.a(-0.6666666666666666)).d(), euk.a(-0.3333333333333333)), euk.a(-3.0));
    }

    public static float a(float $$0) {
        return -(Math.abs(Math.abs($$0) - 0.6666667f) - 0.33333334f) * 3.0f;
    }

    private static euj b(je<fke.a> $$0) {
        euj $$1 = euk.a($$0.b(euz.z));
        euj $$2 = euk.a($$0.b(euz.A), 0.0, -0.1);
        return euk.d(euk.b($$2, euk.a($$1.d(), euk.a(-0.4))));
    }

    private static euj d(je<euj> $$0, je<fke.a> $$1) {
        euj $$2 = euk.d(euk.b($$1.b(euz.x), 2.0, 1.0));
        euj $$3 = euk.a($$1.b(euz.y), -0.065, -0.088);
        euj $$4 = euk.a($$2, $$1.b(euz.v), euk.aa.a.a);
        euj $$5 = euk.a($$2, $$1.b(euz.w), euk.aa.a.a);
        euj $$6 = euk.a(euk.d($$4, $$5), $$3).a(-1.0, 1.0);
        euj $$7 = eux.a($$0, U);
        euj $$8 = euk.b($$1.b(euz.B), 0.75, 0.5);
        euj $$9 = euk.a(euk.a($$8, euk.a(0.37)), euk.a(-10, 30, 0.3, 0.0));
        return euk.d(euk.c($$9, euk.a($$7, $$6)));
    }

    private static euj e(je<euj> $$0, je<fke.a> $$1) {
        euj $$2 = eux.a($$0, C);
        int $$3 = -64;
        int $$4 = -60;
        int $$5 = 320;
        euj $$6 = eux.a($$2, euk.b($$1.b(euz.I), 1.0, 1.0), -60, 320, -1);
        euj $$7 = eux.a($$2, euk.a($$1.b(euz.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
        double $$8 = 2.6666666666666665;
        euj $$9 = eux.a($$2, euk.b($$1.b(euz.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
        euj $$10 = eux.a($$2, euk.b($$1.b(euz.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
        euj $$11 = euk.b(euk.a(1.5), euk.d($$9.d(), $$10.d()));
        return euk.a($$6, -1000000.0, 0.0, euk.a(64.0), euk.a($$7, $$11));
    }

    private static euj c(je<fke.a> $$0) {
        double $$1 = 25.0;
        double $$2 = 0.3;
        euj $$3 = euk.b($$0.b(euz.o), 25.0, 0.3);
        euj $$4 = euk.a($$0.b(euz.p), 0.0, -2.0);
        euj $$5 = euk.a($$0.b(euz.q), 0.0, 1.1);
        euj $$6 = euk.a(euk.b($$3, euk.a(2.0)), $$4);
        return euk.d(euk.b($$6, $$5.f()));
    }

    private static euj f(je<euj> $$0, je<fke.a> $$1) {
        euj $$2 = euk.b($$1.b(euz.t), 2.0, 1.0);
        euj $$3 = euk.a($$2, $$1.b(euz.r), euk.aa.a.b);
        euj $$4 = euk.a($$1.b(euz.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
        euj $$5 = eux.a($$0, Y);
        euj $$6 = euk.a($$4, euk.a(-64, 320, 8.0, -40.0)).d();
        euj $$7 = euk.a($$6, $$5).f();
        double $$8 = 0.083;
        euj $$9 = euk.a($$3, euk.b(euk.a(0.083), $$5));
        return euk.d($$9, $$7).a(-1.0, 1.0);
    }

    private static euj a(je<euj> $$0, je<fke.a> $$1, euj $$2) {
        euj $$3 = eux.a($$0, Z);
        euj $$4 = eux.a($$0, U);
        euj $$5 = euk.a($$1.b(euz.C), 8.0);
        euj $$6 = euk.b(euk.a(4.0), $$5.e());
        euj $$7 = euk.a($$1.b(euz.D), 0.6666666666666666);
        euj $$8 = euk.a(euk.a(euk.a(0.27), $$7).a(-1.0, 1.0), euk.a(euk.a(1.5), euk.b(euk.a(-0.64), $$2)).a(0.0, 0.5));
        euj $$9 = euk.a($$6, $$8);
        euj $$10 = euk.c(euk.c($$9, eux.a($$0, V)), euk.a($$3, $$4));
        euj $$11 = eux.a($$0, X);
        euj $$12 = euk.a($$11, -1000000.0, 0.03, euk.a(-1000000.0), $$11);
        return euk.d($$10, $$12);
    }

    private static euj c(euj $$0) {
        euj $$1 = euk.f($$0);
        return euk.b(euk.a($$1), euk.a(0.64)).j();
    }

    private static euj a(euj $$0, double $$1, double $$2, double $$3, double $$4) {
        double $$5 = ($$4 - $$3) / ($$2 - $$1);
        double $$6 = $$3 - $$1 * $$5;
        return euk.a(euk.b($$0, euk.a($$5)), euk.a($$6));
    }

    protected static euw a(je<euj> $$02, je<fke.a> $$1, boolean $$2, boolean $$3) {
        euj $$4 = euk.a($$1.b(euz.k), 0.5);
        euj $$5 = euk.a($$1.b(euz.l), 0.67);
        euj $$6 = euk.a($$1.b(euz.n), 0.7142857142857143);
        euj $$7 = euk.a($$1.b(euz.m));
        euj $$8 = eux.a($$02, D);
        euj $$9 = eux.a($$02, E);
        euj $$10 = euk.a($$8, $$9, 0.25, $$1.b($$2 ? euz.e : euz.a));
        euj $$11 = euk.a($$8, $$9, 0.25, $$1.b($$2 ? euz.f : euz.b));
        euj $$12 = eux.a($$02, $$2 ? J : ($$3 ? O : i));
        euj $$13 = eux.a($$02, $$2 ? K : ($$3 ? P : j));
        euj $$14 = eux.a($$02, $$2 ? M : ($$3 ? R : l));
        euj $$15 = eux.a($$12, $$13, $$3);
        euj $$16 = eux.a($$02, $$2 ? N : ($$3 ? S : I));
        euj $$17 = euk.c($$16, euk.b(euk.a(5.0), eux.a($$02, V)));
        euj $$18 = euk.a($$16, -1000000.0, 1.5625, $$17, eux.a($$02, $$1, $$16));
        euj $$19 = euk.c(eux.c(eux.a($$3, $$18)), eux.a($$02, W));
        euj $$20 = eux.a($$02, C);
        int $$21 = Stream.of(eva.a.values()).mapToInt($$0 -> $$0.c).min().orElse(-esh.e * 2);
        int $$22 = Stream.of(eva.a.values()).mapToInt($$0 -> $$0.d).max().orElse(-esh.e * 2);
        euj $$23 = eux.a($$20, euk.b($$1.b(euz.E), 1.5, 1.5), $$21, $$22, 0);
        float $$24 = 4.0f;
        euj $$25 = eux.a($$20, euk.b($$1.b(euz.F), 4.0, 4.0), $$21, $$22, 0).d();
        euj $$26 = eux.a($$20, euk.b($$1.b(euz.G), 4.0, 4.0), $$21, $$22, 0).d();
        euj $$27 = euk.a(euk.a(-0.08f), euk.d($$25, $$26));
        euj $$28 = euk.a($$1.b(euz.H));
        return new euw($$4, $$5, $$6, $$7, $$10, $$11, eux.a($$02, $$2 ? m : e), eux.a($$02, $$2 ? n : f), $$14, eux.a($$02, g), $$15, $$19, $$23, $$27, $$28);
    }

    private static euw b(je<euj> $$0, je<fke.a> $$1, euj $$2) {
        euj $$3 = eux.a($$0, D);
        euj $$4 = eux.a($$0, E);
        euj $$5 = euk.a($$3, $$4, 0.25, $$1.b(euz.a));
        euj $$6 = euk.a($$3, $$4, 0.25, $$1.b(euz.b));
        euj $$7 = eux.c($$2);
        return new euw(euk.a(), euk.a(), euk.a(), euk.a(), $$5, $$6, euk.a(), euk.a(), euk.a(), euk.a(), euk.a(), $$7, euk.a(), euk.a(), euk.a());
    }

    private static euj a(boolean $$0, euj $$1) {
        return eux.a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
    }

    private static euj a(je<euj> $$0, int $$1, int $$2) {
        return eux.a(eux.a($$0, G), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
    }

    private static euj a(euj $$0, int $$1, int $$2) {
        return eux.a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
    }

    protected static euw a(je<euj> $$0, je<fke.a> $$1) {
        return eux.b($$0, $$1, eux.a($$0, 0, 128));
    }

    protected static euw b(je<euj> $$0, je<fke.a> $$1) {
        return eux.b($$0, $$1, eux.a($$0, -64, 192));
    }

    protected static euw c(je<euj> $$0, je<fke.a> $$1) {
        return eux.b($$0, $$1, eux.a(eux.a($$0, H), 0, 256));
    }

    private static euj d(euj $$0) {
        return eux.a($$0, 0, 128);
    }

    protected static euw a(je<euj> $$0) {
        euj $$1 = euk.c(euk.a(0L));
        euj $$2 = eux.c(eux.d(eux.a($$0, T)));
        return new euw(euk.a(), euk.a(), euk.a(), euk.a(), euk.a(), euk.a(), euk.a(), $$1, euk.a(), euk.a(), euk.a(), $$2, euk.a(), euk.a(), euk.a());
    }

    protected static euw a() {
        return new euw(euk.a(), euk.a(), euk.a(), euk.a(), euk.a(), euk.a(), euk.a(), euk.a(), euk.a(), euk.a(), euk.a(), euk.a(), euk.a(), euk.a(), euk.a());
    }

    private static euj a(euj $$0, euj $$1) {
        euj $$2 = euk.a(euk.b(), $$1, $$0);
        return euk.b(euk.c($$2));
    }

    private static euj b(euj $$0, euj $$1) {
        euj $$2 = euk.b($$1, $$0);
        return euk.b(euk.a(4.0), $$2.h());
    }

    private static euj a(euj $$0, euj $$1, boolean $$2) {
        euj $$3 = euk.c($$1);
        euj $$4 = euk.c($$0);
        euj $$5 = eux.a(euk.a(euk.b(euk.a(0.2734375), $$3.i()), euk.b(euk.a(-1.0), $$4)), 1.5, -1.5, -64.0, 320.0);
        $$5 = $$5.a(-40.0, 320.0);
        euj $$6 = euk.a(eux.a($$2, euk.a(eux.b($$3, eux.a($$4)), euk.a(-0.703125)).a(-64.0, 64.0)), euk.a(-0.390625));
        return euk.a($$6, $$5, -64, euy.b.a());
    }

    private static euj a(euj $$0, euj $$1, int $$2, int $$3, int $$4) {
        return euk.a(euk.a($$0, (double)$$2, (double)($$3 + 1), $$1, euk.a((double)$$4)));
    }

    private static euj a(euj $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
        euj $$9 = $$0;
        euj $$10 = euk.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
        $$9 = euk.a($$10, $$5, $$9);
        euj $$11 = euk.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
        $$9 = euk.a($$11, $$8, $$9);
        return $$9;
    }

    protected static final class a {
        protected a() {
        }

        protected static double a(double $$0) {
            if ($$0 < -0.75) {
                return 0.5;
            }
            if ($$0 < -0.5) {
                return 0.75;
            }
            if ($$0 < 0.5) {
                return 1.0;
            }
            if ($$0 < 0.75) {
                return 2.0;
            }
            return 3.0;
        }

        protected static double b(double $$0) {
            if ($$0 < -0.5) {
                return 0.75;
            }
            if ($$0 < 0.0) {
                return 1.0;
            }
            if ($$0 < 0.5) {
                return 1.5;
            }
            return 2.0;
        }
    }
}

