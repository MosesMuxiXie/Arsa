/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class csn {
    public static @Nullable ftm a(cht $$0, int $$1, int $$2, int $$3, ftm $$4, double $$5) {
        ftm $$6 = $$4.a($$0.dP(), $$0.dR(), $$0.dV());
        boolean $$7 = csp.a($$0, $$1);
        return css.a($$0, () -> {
            is $$7 = csm.a($$0, $$1, $$2, $$3, $$4.g, $$4.i, $$5, $$7);
            if ($$7 == null || csp.a($$0, $$7)) {
                return null;
            }
            return $$7;
        });
    }
}

