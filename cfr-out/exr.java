/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public class exr {
    protected static double a(double $$0, double $$1, double $$2, double $$3) {
        if ($$0 < $$3) {
            $$0 = $$3;
        }
        double $$4 = 0.384;
        double $$5 = $$0 / $$1 * 0.384;
        double $$6 = 0.75 * Math.pow($$5, 1.3333333333333333);
        double $$7 = Math.pow($$5, 0.6666666666666666);
        double $$8 = 0.3333333333333333 * Math.log($$5);
        double $$9 = $$2 * ($$6 - $$7 - $$8);
        $$9 = Math.max($$9, 0.0);
        return $$9 / 0.384 * $$1;
    }

    protected static boolean a(dxn $$0, is $$1, int $$2) {
        if (exr.b($$0, $$1)) {
            return false;
        }
        float $$3 = 6.0f;
        float $$4 = 6.0f / (float)$$2;
        for (float $$5 = 0.0f; $$5 < (float)Math.PI * 2; $$5 += $$4) {
            int $$7;
            int $$6 = (int)(bgj.b((double)$$5) * (float)$$2);
            if (!exr.b($$0, $$1.b($$6, 0, $$7 = (int)(bgj.a((double)$$5) * (float)$$2)))) continue;
            return false;
        }
        return true;
    }

    protected static boolean a(dwp $$0, is $$1) {
        return $$0.a($$1, exr::c);
    }

    protected static boolean b(dwp $$0, is $$1) {
        return $$0.a($$1, exr::e);
    }

    protected static void a(iz $$0, int $$1, boolean $$2, Consumer<eoh> $$3) {
        if ($$1 >= 3) {
            $$3.accept(exr.a($$0, epe.e));
            for (int $$4 = 0; $$4 < $$1 - 3; ++$$4) {
                $$3.accept(exr.a($$0, epe.d));
            }
        }
        if ($$1 >= 2) {
            $$3.accept(exr.a($$0, epe.c));
        }
        if ($$1 >= 1) {
            $$3.accept(exr.a($$0, $$2 ? epe.a : epe.b));
        }
    }

    protected static void a(dwp $$0, is $$1, iz $$2, int $$32, boolean $$4) {
        if (!exr.b($$0.a_($$1.a($$2.g())))) {
            return;
        }
        is.a $$5 = $$1.k();
        exr.a($$2, $$32, $$4, (eoh $$3) -> {
            if ($$3.a(dzs.tQ)) {
                $$3 = (eoh)$$3.b(efq.d, $$0.F($$5));
            }
            $$0.a((is)$$5, (eoh)$$3, 2);
            $$5.c($$2);
        });
    }

    protected static boolean c(dwp $$0, is $$1) {
        eoh $$2 = $$0.a_($$1);
        if ($$2.a(bdp.bF)) {
            $$0.a($$1, dzs.tR.m(), 2);
            return true;
        }
        return false;
    }

    private static eoh a(iz $$0, epe $$1) {
        return (eoh)((eoh)dzs.tQ.m().b(efq.b, $$0)).b(efq.c, $$1);
    }

    public static boolean a(eoh $$0) {
        return exr.b($$0) || $$0.a(dzs.K);
    }

    public static boolean b(eoh $$0) {
        return $$0.a(dzs.tR) || $$0.a(bdp.bF);
    }

    public static boolean c(eoh $$0) {
        return $$0.l() || $$0.a(dzs.J);
    }

    public static boolean d(eoh $$0) {
        return !$$0.l() && !$$0.a(dzs.J);
    }

    public static boolean e(eoh $$0) {
        return $$0.l() || $$0.a(dzs.J) || $$0.a(dzs.K);
    }
}

