/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class csm {
    public static @Nullable ftm a(cht $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
        boolean $$7 = csp.a($$0, $$1);
        return css.a($$0, () -> csm.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
    }

    public static @Nullable is a(cht $$0, int $$12, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
        is $$8 = css.a($$0.ep(), 0.0, $$12, $$2, $$3, $$4, $$5, $$6);
        if ($$8 == null) {
            return null;
        }
        is $$9 = css.a($$0, (double)$$12, $$0.ep(), $$8);
        if (csp.a($$9, $$0) || csp.a($$7, $$0, $$9)) {
            return null;
        }
        if (csp.b($$0, $$9 = css.a($$9, $$0.ao().aw(), $$1 -> csp.c($$0, $$1)))) {
            return null;
        }
        return $$9;
    }
}

