/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.ToDoubleFunction;
import org.jspecify.annotations.Nullable;

public class csr {
    public static @Nullable ftm a(cht $$0, int $$1, int $$2) {
        return csr.a($$0, $$1, $$2, $$0::c);
    }

    public static @Nullable ftm a(cht $$0, int $$1, int $$2, ToDoubleFunction<is> $$3) {
        boolean $$4 = csp.a($$0, $$1);
        return css.a(() -> {
            is $$4 = css.a($$0.ep(), $$1, $$2);
            is $$5 = csr.a($$0, (double)$$1, $$4, $$4);
            if ($$5 == null) {
                return null;
            }
            return csr.a($$0, $$5);
        }, $$3);
    }

    public static @Nullable ftm a(cht $$0, int $$1, int $$2, ftm $$3) {
        ftm $$4 = $$3.a($$0.dP(), $$0.dR(), $$0.dV());
        boolean $$5 = csp.a($$0, $$1);
        return csr.a($$0, 0.0, $$1, $$2, $$4, $$5);
    }

    public static @Nullable ftm b(cht $$0, int $$1, int $$2, ftm $$3) {
        return csr.a($$0, 0.0, $$1, $$2, $$3);
    }

    public static @Nullable ftm a(cht $$0, double $$1, double $$2, int $$3, ftm $$4) {
        ftm $$5 = $$0.dI().d($$4);
        if ($$5.g() == 0.0) {
            $$5 = new ftm($$0.ep().j() - 0.5, 0.0, $$0.ep().j() - 0.5);
        }
        boolean $$6 = csp.a($$0, $$2);
        return csr.a($$0, $$1, $$2, $$3, $$5, $$6);
    }

    private static @Nullable ftm a(cht $$0, double $$1, double $$2, int $$3, ftm $$4, boolean $$5) {
        return css.a($$0, () -> {
            is $$6 = css.a($$0.ep(), $$1, $$2, $$3, 0, $$4.g, $$4.i, 1.5707963705062866);
            if ($$6 == null) {
                return null;
            }
            is $$7 = csr.a($$0, $$2, $$5, $$6);
            if ($$7 == null) {
                return null;
            }
            return csr.a($$0, $$7);
        });
    }

    public static @Nullable is a(cht $$0, is $$12) {
        if (csp.a($$0, $$12 = css.a($$12, $$0.ao().aw(), $$1 -> csp.c($$0, $$1))) || csp.b($$0, $$12)) {
            return null;
        }
        return $$12;
    }

    public static @Nullable is a(cht $$0, double $$1, boolean $$2, is $$3) {
        is $$4 = css.a($$0, $$1, $$0.ep(), $$3);
        if (csp.a($$4, $$0) || csp.a($$2, $$0, $$4) || csp.a($$0.N(), $$4)) {
            return null;
        }
        return $$4;
    }
}

