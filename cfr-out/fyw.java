/*
 * Decompiled with CFR 0.152.
 */
public interface fyw<T> {
    public static final fyw<?> a = () -> {
        throw new IllegalStateException("Cannot dereference handle with no underlying resource");
    };

    public static <T> fyw<T> a() {
        return a;
    }

    public T get();
}

