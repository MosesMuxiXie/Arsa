/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CompletableFuture;

public interface bav {
    public CompletableFuture<?> a();

    public float b();

    default public boolean c() {
        return this.a().isDone();
    }

    default public void d() {
        CompletableFuture<?> $$0 = this.a();
        if ($$0.isCompletedExceptionally()) {
            $$0.join();
        }
    }
}

