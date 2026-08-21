/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class aus
implements aur {
    private final ary a;

    public aus(ary $$0) {
        this.a = $$0;
    }

    @Override
    public <V> CompletableFuture<V> a(Supplier<V> $$0) {
        return this.a.a($$0);
    }

    @Override
    public CompletableFuture<Void> a(Runnable $$0) {
        return this.a.g($$0);
    }
}

