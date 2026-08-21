/*
 * Decompiled with CFR 0.152.
 */
@FunctionalInterface
public interface hdp {
    public static final hdp a = $$0 -> $$0;

    public static hdp scaling(float $$0) {
        float $$1 = 24.016f * (1.0f - $$0);
        return $$22 -> $$22.a($$2 -> $$2.b($$0).c(0.0f, $$1, 0.0f));
    }

    public hdo apply(hdo var1);
}

