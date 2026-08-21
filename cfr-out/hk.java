/*
 * Decompiled with CFR 0.152.
 */
@FunctionalInterface
public interface hk<T> {
    public void execute(T var1, hg<T> var2, hi var3);

    default public hf<T> bind(T $$0) {
        return ($$1, $$2) -> this.execute($$0, $$1, $$2);
    }
}

