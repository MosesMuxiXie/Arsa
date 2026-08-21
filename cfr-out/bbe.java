/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class bbe<T>
implements bat {
    @Override
    public final CompletableFuture<Void> reload(bat.b $$0, Executor $$12, bat.a $$2, Executor $$3) {
        baz $$4 = $$0.a();
        return ((CompletableFuture)CompletableFuture.supplyAsync(() -> this.b($$4, bzl.a()), $$12).thenCompose($$2::wait)).thenAcceptAsync($$1 -> this.a($$1, $$4, bzl.a()), $$3);
    }

    protected abstract T b(baz var1, bzm var2);

    protected abstract void a(T var1, baz var2, bzm var3);
}

