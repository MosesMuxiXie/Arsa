/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class csq {
    public static @Nullable ftm a(cht $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
        boolean $$8 = csp.a($$0, $$1);
        return css.a($$0, () -> {
            is $$9 = css.a($$0.ep(), 0.0, $$1, $$2, 0, $$3, $$4, $$5);
            if ($$9 == null) {
                return null;
            }
            is $$10 = csr.a($$0, (double)$$1, $$8, $$9);
            if ($$10 == null) {
                return null;
            }
            if (csp.a($$0, $$10 = css.a($$10, $$0.ep().a($$6 - $$7 + 1) + $$7, $$0.ao().aw(), $$1 -> csp.c($$0, $$1))) || csp.b($$0, $$10)) {
                return null;
            }
            return $$10;
        });
    }
}

