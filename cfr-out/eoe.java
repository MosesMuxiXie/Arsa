/*
 * Decompiled with CFR 0.152.
 */
public class eoe {
    private static final int a = 2100;
    private static final int b = 200;
    private static final int c = 130;
    private static final int d = 3;
    private static final int e = 3;
    private static final int f = 8;
    private static final int g = 5;
    private static final int h = 4;

    public static void a(dwo $$0, is $$1, bgr $$2) {
        if (!$$0.a_($$1.d()).a(dzs.a)) {
            return;
        }
        if ($$2.a(2100) == 0 && eoe.b($$0, $$1)) {
            $$0.a($$1.u(), (double)$$1.v(), (double)$$1.w(), bda.yI, bdb.i, 1.0f, 1.0f, false);
        }
    }

    public static void b(dwo $$0, is $$1, bgr $$2) {
        if ($$2.a(200) == 0 && eoe.a($$0, $$1.e())) {
            $$0.a(bda.iY, bdb.i, 1.0f, 1.0f);
        }
    }

    public static void c(dwo $$0, is $$1, bgr $$2) {
        if ($$2.a(130) == 0) {
            eoh $$3 = $$0.a_($$1.e());
            if (($$3.a(dzs.N) || $$3.a(bdp.af)) && $$2.a(3) != 0) {
                return;
            }
            if (eoe.a($$0, $$1.e())) {
                $$0.a($$1.u(), (double)$$1.v(), (double)$$1.w(), bda.hT, bdb.i, 1.0f, 1.0f, false);
            }
        }
    }

    public static boolean a(dwo $$0, is $$1) {
        return $$0.a_($$1).a(bdp.cT) && $$0.a_($$1.e()).a(bdp.cT);
    }

    private static boolean b(dwo $$0, is $$1) {
        int $$2 = 0;
        int $$3 = 0;
        is.a $$4 = $$1.k();
        for (iz $$5 : iz.c.a) {
            int $$6;
            int $$7;
            boolean $$8;
            $$4.g($$1).c($$5, 8);
            if (eoe.a($$0, $$4) && $$2++ >= 3) {
                return true;
            }
            if ($$8 = ($$7 = ($$6 = 4 - ++$$3) + $$2) >= 3) continue;
            return false;
        }
        return false;
    }

    private static boolean a(dwo $$0, is.a $$1) {
        int $$2 = $$0.b(euq.a.b, $$1) - 1;
        if (Math.abs($$2 - $$1.v()) <= 5) {
            boolean $$3 = $$0.a_($$1.q($$2 + 1)).l();
            return $$3 && eoe.a($$0.a_($$1.q($$2)));
        }
        $$1.c(iz.b, 6);
        eoh $$4 = $$0.a_($$1);
        $$1.c(iz.a);
        for (int $$5 = 0; $$5 < 10; ++$$5) {
            eoh $$6 = $$0.a_($$1);
            if ($$4.l() && eoe.a($$6)) {
                return true;
            }
            $$4 = $$6;
            $$1.c(iz.a);
        }
        return false;
    }

    private static boolean a(eoh $$0) {
        return $$0.a(bdp.cS);
    }
}

