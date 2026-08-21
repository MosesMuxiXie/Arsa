/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class cbu
extends cbq<cbw.c> {
    public cbu(int $$0, Executor $$1, String $$2) {
        super(new cbw.a($$0), $$1, $$2);
        cay.a.a(this);
    }

    public cbw.c b(Runnable $$0) {
        return new cbw.c(0, $$0);
    }

    public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
        CompletableFuture $$2 = new CompletableFuture();
        this.a_(new cbw.c($$0, () -> $$1.accept($$2)));
        return $$2;
    }

    @Override
    public /* synthetic */ Runnable f(Runnable runnable) {
        return this.b(runnable);
    }
}

