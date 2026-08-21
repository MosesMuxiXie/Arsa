/*
 * Decompiled with CFR 0.152.
 */
public interface eqx<T> {
    public int onResize(int var1, T var2);

    public static <T> eqx<T> a() {
        return ($$0, $$1) -> {
            throw new IllegalArgumentException("Unexpected palette resize, bits = " + $$0 + ", added value = " + String.valueOf($$1));
        };
    }
}

