/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cso {
    public static @Nullable ftm a(cht $$0, int $$1, int $$2) {
        boolean $$3 = csp.a($$0, $$1);
        return css.a($$0, () -> {
            is $$4 = css.a($$0.ep(), $$1, $$2);
            return cso.a($$0, $$1, $$3, $$4);
        });
    }

    public static @Nullable ftm a(cht $$0, int $$1, int $$2, ftm $$3, double $$4) {
        ftm $$5 = $$3.a($$0.dP(), $$0.dR(), $$0.dV());
        boolean $$6 = csp.a($$0, $$1);
        return css.a($$0, () -> {
            is $$6 = css.a($$0.ep(), 0.0, $$1, $$2, 0, $$3.g, $$3.i, $$4);
            if ($$6 == null) {
                return null;
            }
            return cso.a($$0, $$1, $$6, $$6);
        });
    }

    public static @Nullable ftm a(cht $$0, int $$1, int $$2, ftm $$3) {
        ftm $$4 = $$0.dI().d($$3);
        boolean $$5 = csp.a($$0, $$1);
        return css.a($$0, () -> {
            is $$5 = css.a($$0.ep(), 0.0, $$1, $$2, 0, $$3.g, $$3.i, 1.5707963705062866);
            if ($$5 == null) {
                return null;
            }
            return cso.a($$0, $$1, $$5, $$5);
        });
    }

    private static @Nullable is a(cht $$0, int $$1, boolean $$2, is $$3) {
        is $$4 = css.a($$0, (double)$$1, $$0.ep(), $$3);
        if (csp.a($$4, $$0) || csp.a($$2, $$0, $$4) || csp.a($$0.N(), $$4) || csp.b($$0, $$4)) {
            return null;
        }
        return $$4;
    }
}

