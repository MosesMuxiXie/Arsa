/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableInt;
import org.jspecify.annotations.Nullable;

public class fma {
    private static final int c = 2;
    public static final int a = 21;
    private static final int d = 3;
    public static final int b = 21;
    private static final eog.f e = ($$0, $$1, $$2) -> $$0.a(dzs.cK);
    private static final float f = 4.0f;
    private static final double g = 1.0;
    private final iz.a h;
    private final iz i;
    private final int j;
    private final is k;
    private final int l;
    private final int m;

    private fma(iz.a $$0, int $$1, iz $$2, is $$3, int $$4, int $$5) {
        this.h = $$0;
        this.j = $$1;
        this.i = $$2;
        this.k = $$3;
        this.m = $$4;
        this.l = $$5;
    }

    public static Optional<fma> a(dwp $$02, is $$1, iz.a $$2) {
        return fma.a($$02, $$1, (fma $$0) -> $$0.a() && $$0.j == 0, $$2);
    }

    public static Optional<fma> a(dwp $$0, is $$1, Predicate<fma> $$2, iz.a $$3) {
        Optional<fma> $$4 = Optional.of(fma.a((dvt)$$0, $$1, $$3)).filter($$2);
        if ($$4.isPresent()) {
            return $$4;
        }
        iz.a $$5 = $$3 == iz.a.a ? iz.a.c : iz.a.a;
        return Optional.of(fma.a((dvt)$$0, $$1, $$5)).filter($$2);
    }

    public static fma a(dvt $$0, is $$1, iz.a $$2) {
        iz $$3 = $$2 == iz.a.a ? iz.e : iz.d;
        is $$4 = fma.a($$0, $$3, $$1);
        if ($$4 == null) {
            return new fma($$2, 0, $$3, $$1, 0, 0);
        }
        int $$5 = fma.a($$0, $$4, $$3);
        if ($$5 == 0) {
            return new fma($$2, 0, $$3, $$4, 0, 0);
        }
        MutableInt $$6 = new MutableInt();
        int $$7 = fma.a($$0, $$4, $$3, $$5, $$6);
        return new fma($$2, $$6.intValue(), $$3, $$4, $$5, $$7);
    }

    private static @Nullable is a(dvt $$0, iz $$1, is $$2) {
        int $$3 = Math.max($$0.K_(), $$2.v() - 21);
        while ($$2.v() > $$3 && fma.a($$0.a_($$2.e()))) {
            $$2 = $$2.e();
        }
        iz $$4 = $$1.g();
        int $$5 = fma.b($$0, $$2, $$4) - 1;
        if ($$5 < 0) {
            return null;
        }
        return $$2.a($$4, $$5);
    }

    private static int a(dvt $$0, is $$1, iz $$2) {
        int $$3 = fma.b($$0, $$1, $$2);
        if ($$3 < 2 || $$3 > 21) {
            return 0;
        }
        return $$3;
    }

    private static int b(dvt $$0, is $$1, iz $$2) {
        is.a $$3 = new is.a();
        for (int $$4 = 0; $$4 <= 21; ++$$4) {
            $$3.g($$1).c($$2, $$4);
            eoh $$5 = $$0.a_($$3);
            if (!fma.a($$5)) {
                if (!e.test($$5, $$0, $$3)) break;
                return $$4;
            }
            eoh $$6 = $$0.a_($$3.c(iz.a));
            if (!e.test($$6, $$0, $$3)) break;
        }
        return 0;
    }

    private static int a(dvt $$0, is $$1, iz $$2, int $$3, MutableInt $$4) {
        is.a $$5 = new is.a();
        int $$6 = fma.a($$0, $$1, $$2, $$5, $$3, $$4);
        if ($$6 < 3 || $$6 > 21 || !fma.a($$0, $$1, $$2, $$5, $$3, $$6)) {
            return 0;
        }
        return $$6;
    }

    private static boolean a(dvt $$0, is $$1, iz $$2, is.a $$3, int $$4, int $$5) {
        for (int $$6 = 0; $$6 < $$4; ++$$6) {
            is.a $$7 = $$3.g($$1).c(iz.b, $$5).c($$2, $$6);
            if (e.test($$0.a_($$7), $$0, $$7)) continue;
            return false;
        }
        return true;
    }

    private static int a(dvt $$0, is $$1, iz $$2, is.a $$3, int $$4, MutableInt $$5) {
        for (int $$6 = 0; $$6 < 21; ++$$6) {
            $$3.g($$1).c(iz.b, $$6).c($$2, -1);
            if (!e.test($$0.a_($$3), $$0, $$3)) {
                return $$6;
            }
            $$3.g($$1).c(iz.b, $$6).c($$2, $$4);
            if (!e.test($$0.a_($$3), $$0, $$3)) {
                return $$6;
            }
            for (int $$7 = 0; $$7 < $$4; ++$$7) {
                $$3.g($$1).c(iz.b, $$6).c($$2, $$7);
                eoh $$8 = $$0.a_($$3);
                if (!fma.a($$8)) {
                    return $$6;
                }
                if (!$$8.a(dzs.eI)) continue;
                $$5.increment();
            }
        }
        return 21;
    }

    private static boolean a(eoh $$0) {
        return $$0.l() || $$0.a(bdp.aY) || $$0.a(dzs.eI);
    }

    public boolean a() {
        return this.m >= 2 && this.m <= 21 && this.l >= 3 && this.l <= 21;
    }

    public void a(dwp $$0) {
        eoh $$1 = (eoh)dzs.eI.m().b(efd.b, this.h);
        is.c(this.k, this.k.a(iz.b, this.l - 1).a(this.i, this.m - 1)).forEach($$2 -> $$0.a((is)$$2, $$1, 18));
    }

    public boolean b() {
        return this.a() && this.j == this.m * this.l;
    }

    public static ftm a(ber.a $$0, iz.a $$1, ftm $$2, cgn $$3) {
        double $$12;
        double $$9;
        double $$4 = (double)$$0.b - (double)$$3.a();
        double $$5 = (double)$$0.c - (double)$$3.b();
        is $$6 = $$0.a;
        if ($$4 > 0.0) {
            double $$7 = (double)$$6.a($$1) + (double)$$3.a() / 2.0;
            double $$8 = bgj.a(bgj.c($$2.a($$1) - $$7, 0.0, $$4), 0.0, 1.0);
        } else {
            $$9 = 0.5;
        }
        if ($$5 > 0.0) {
            iz.a $$10 = iz.a.b;
            double $$11 = bgj.a(bgj.c($$2.a($$10) - (double)$$6.a($$10), 0.0, $$5), 0.0, 1.0);
        } else {
            $$12 = 0.0;
        }
        iz.a $$13 = $$1 == iz.a.a ? iz.a.c : iz.a.a;
        double $$14 = $$2.a($$13) - ((double)$$6.a($$13) + 0.5);
        return new ftm($$9, $$12, $$14);
    }

    public static ftm a(ftm $$0, axf $$12, cgk $$2, cgn $$3) {
        if ($$3.a() > 4.0f || $$3.b() > 4.0f) {
            return $$0;
        }
        double $$4 = (double)$$3.b() / 2.0;
        ftm $$5 = $$0.b(0.0, $$4, 0.0);
        fug $$6 = fud.a(fth.a($$5, $$3.a(), 0.0, $$3.a()).b(0.0, 1.0, 0.0).g(1.0E-6));
        Optional<ftm> $$7 = $$12.a($$2, $$6, $$5, (double)$$3.a(), (double)$$3.b(), (double)$$3.a());
        Optional<ftm> $$8 = $$7.map($$1 -> $$1.a(0.0, $$4, 0.0));
        return $$8.orElse($$0);
    }
}

