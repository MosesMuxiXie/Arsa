/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface bba
extends bat {
    @Override
    default public CompletableFuture<Void> reload(bat.b $$0, Executor $$1, bat.a $$2, Executor $$3) {
        baz $$4 = $$0.a();
        return $$2.wait(bhr.a).thenRunAsync(() -> {
            bzm $$1 = bzl.a();
            $$1.a("listener");
            this.a($$4);
            $$1.c();
        }, $$3);
    }

    public void a(baz var1);
}

