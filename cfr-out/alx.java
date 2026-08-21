/*
 * Decompiled with CFR 0.152.
 */
public interface alx<T> {
    public aao<? super xq, T> codec();

    default public alw<T> a(int $$0) {
        return new alw($$0, this);
    }

    public T copy(T var1);

    public static <T> alx<T> a(aao<? super xq, T> $$0) {
        return () -> $$0;
    }

    public static interface a<T>
    extends alx<T> {
        @Override
        default public T copy(T $$0) {
            return $$0;
        }
    }
}

