/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface ded {
    public static final ded a = ($$0, $$1, $$2) -> {};
    public static final ded b = ($$0, $$1, $$2) -> {
        float $$3 = 170.0f + $$2.i() * 20.0f;
        $$0.k($$0.dN().c(-0.5));
        $$0.v($$0.ec() + $$3);
        $$0.ab += $$3;
        $$0.aF = true;
    };
    public static final ded c = ($$0, $$1, $$2) -> {
        if ($$1 != null) {
            ftm $$3 = $$1.cj();
            $$0.k($$3);
            $$0.aF = true;
        }
    };
    public static final ded d = ($$0, $$1, $$2) -> {
        if ($$1 != null) {
            ftm $$3 = $$1.dN().d();
            $$0.k($$3);
            $$0.aF = true;
        }
    };

    public void deflect(dec var1, @Nullable cgk var2, bgr var3);
}

