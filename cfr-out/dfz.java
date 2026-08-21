/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class dfz {
    public static int[][] a(iz $$0) {
        iz $$1 = $$0.h();
        iz $$2 = $$1.g();
        iz $$3 = $$0.g();
        return new int[][]{{$$1.j(), $$1.l()}, {$$2.j(), $$2.l()}, {$$3.j() + $$1.j(), $$3.l() + $$1.l()}, {$$3.j() + $$2.j(), $$3.l() + $$2.l()}, {$$0.j() + $$1.j(), $$0.l() + $$1.l()}, {$$0.j() + $$2.j(), $$0.l() + $$2.l()}, {$$3.j(), $$3.l()}, {$$0.j(), $$0.l()}};
    }

    public static boolean a(double $$0) {
        return !Double.isInfinite($$0) && $$0 < 1.0;
    }

    public static boolean a(dvx $$0, chl $$1, fth $$2) {
        Iterable<fug> $$3 = $$0.g($$1, $$2);
        for (fug $$4 : $$3) {
            if ($$4.c()) continue;
            return false;
        }
        return $$0.w().a($$2);
    }

    public static boolean a(dvx $$0, ftm $$1, chl $$2, chx $$3) {
        return dfz.a($$0, $$2, $$2.f($$3).c($$1));
    }

    public static fug a(dvt $$0, is $$1) {
        eoh $$2 = $$0.a_($$1);
        if ($$2.a(bdp.bd) || $$2.b() instanceof eiw && $$2.c(eiw.b).booleanValue()) {
            return fud.a();
        }
        return $$2.g($$0, $$1);
    }

    public static double a(is $$0, int $$1, Function<is, fug> $$2) {
        is.a $$3 = $$0.k();
        for (int $$4 = 0; $$4 < $$1; ++$$4) {
            fug $$5 = $$2.apply($$3);
            if (!$$5.c()) {
                return (double)($$0.v() + $$4) + $$5.b(iz.a.b);
            }
            $$3.c(iz.b);
        }
        return Double.POSITIVE_INFINITY;
    }

    public static @Nullable ftm a(cgu<?> $$0, dvx $$1, is $$2, boolean $$3) {
        if ($$3 && $$0.a($$1.a_($$2))) {
            return null;
        }
        double $$4 = $$1.a(dfz.a((dvt)$$1, $$2), () -> dfz.a((dvt)$$1, $$2.e()));
        if (!dfz.a($$4)) {
            return null;
        }
        if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
        }
        ftm $$5 = ftm.a($$2, $$4);
        fth $$6 = $$0.n().a($$5);
        Iterable<fug> $$7 = $$1.g(null, $$6);
        for (fug $$8 : $$7) {
            if ($$8.c()) continue;
            return null;
        }
        if ($$0 == cgu.cb && ($$1.a_($$2).a(bdp.cI) || $$1.a_($$2.d()).a(bdp.cI))) {
            return null;
        }
        if (!$$1.w().a($$6)) {
            return null;
        }
        return $$5;
    }
}

