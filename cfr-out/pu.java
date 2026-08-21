/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public abstract class pu<T>
extends qa<T> {
    private final Function<T, amt<T>> d;

    public pu(ms $$0, amt<? extends jq<T>> $$1, CompletableFuture<jf.a> $$2, Function<T, amt<T>> $$3) {
        super($$0, $$1, $$2);
        this.d = $$3;
    }

    public pu(ms $$0, amt<? extends jq<T>> $$1, CompletableFuture<jf.a> $$2, CompletableFuture<qa.b<T>> $$3, Function<T, amt<T>> $$4) {
        super($$0, $$1, $$2, $$3);
        this.d = $$4;
    }

    protected pz<T, T> a(bef<T> $$0) {
        bec $$1 = this.b($$0);
        return pz.a($$1).a(this.d);
    }
}

