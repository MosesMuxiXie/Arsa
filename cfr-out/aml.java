/*
 * Decompiled with CFR 0.152.
 */
@FunctionalInterface
public interface aml<T, V> {
    public V get(amt<T> var1);

    public static <T, V> aml<T, V> fixed(V $$0) {
        return $$1 -> $$0;
    }
}

