/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import org.jspecify.annotations.Nullable;

public class css {
    private static final int a = 10;

    public static is a(bgr $$0, int $$1, int $$2) {
        int $$3 = $$0.a(2 * $$1 + 1) - $$1;
        int $$4 = $$0.a(2 * $$2 + 1) - $$2;
        int $$5 = $$0.a(2 * $$1 + 1) - $$1;
        return new is($$3, $$4, $$5);
    }

    public static @Nullable is a(bgr $$0, double $$1, double $$2, int $$3, int $$4, double $$5, double $$6, double $$7) {
        double $$8 = bgj.d($$6, $$5) - 1.5707963705062866;
        double $$9 = $$8 + (double)(2.0f * $$0.i() - 1.0f) * $$7;
        double $$10 = bgj.d(Math.sqrt($$0.j()), $$1, $$2) * (double)bgj.g;
        double $$11 = -$$10 * Math.sin($$9);
        double $$12 = $$10 * Math.cos($$9);
        if (Math.abs($$11) > $$2 || Math.abs($$12) > $$2) {
            return null;
        }
        int $$13 = $$0.a(2 * $$3 + 1) - $$3 + $$4;
        return is.a($$11, (double)$$13, $$12);
    }

    @VisibleForTesting
    public static is a(is $$0, int $$1, Predicate<is> $$2) {
        if ($$2.test($$0)) {
            is.a $$3 = $$0.k().c(iz.b);
            while ($$3.v() <= $$1 && $$2.test($$3)) {
                $$3.c(iz.b);
            }
            return $$3.j();
        }
        return $$0;
    }

    @VisibleForTesting
    public static is a(is $$0, int $$1, int $$2, Predicate<is> $$3) {
        if ($$1 < 0) {
            throw new IllegalArgumentException("aboveSolidAmount was " + $$1 + ", expected >= 0");
        }
        if ($$3.test($$0)) {
            is.a $$4 = $$0.k().c(iz.b);
            while ($$4.v() <= $$2 && $$3.test($$4)) {
                $$4.c(iz.b);
            }
            int $$5 = $$4.v();
            while ($$4.v() <= $$2 && $$4.v() - $$5 < $$1) {
                $$4.c(iz.b);
                if (!$$3.test($$4)) continue;
                $$4.c(iz.a);
                break;
            }
            return $$4.j();
        }
        return $$0;
    }

    public static @Nullable ftm a(cht $$0, Supplier<@Nullable is> $$1) {
        return css.a($$1, $$0::c);
    }

    public static @Nullable ftm a(Supplier<@Nullable is> $$0, ToDoubleFunction<is> $$1) {
        double $$2 = Double.NEGATIVE_INFINITY;
        is $$3 = null;
        for (int $$4 = 0; $$4 < 10; ++$$4) {
            double $$6;
            is $$5 = $$0.get();
            if ($$5 == null || !(($$6 = $$1.applyAsDouble($$5)) > $$2)) continue;
            $$2 = $$6;
            $$3 = $$5;
        }
        return $$3 != null ? ftm.c($$3) : null;
    }

    public static is a(cht $$0, double $$1, bgr $$2, is $$3) {
        double $$4 = $$3.u();
        double $$5 = $$3.w();
        if ($$0.gF() && $$1 > 1.0) {
            is $$6 = $$0.gC();
            $$4 = $$0.dP() > (double)$$6.u() ? ($$4 -= $$2.j() * $$1 / 2.0) : ($$4 += $$2.j() * $$1 / 2.0);
            $$5 = $$0.dV() > (double)$$6.w() ? ($$5 -= $$2.j() * $$1 / 2.0) : ($$5 += $$2.j() * $$1 / 2.0);
        }
        return is.a($$4 + $$0.dP(), (double)$$3.v() + $$0.dR(), $$5 + $$0.dV());
    }
}

