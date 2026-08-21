/*
 * Decompiled with CFR 0.152.
 */
public abstract class aav<T extends xk>
implements aay<T> {
    private final Iterable<aay<? super T>> a;

    protected aav(Iterable<aay<? super T>> $$0) {
        this.a = $$0;
    }

    public final Iterable<aay<? super T>> b() {
        return this.a;
    }

    @Override
    public abstract aba<? extends aav<T>> a();
}

