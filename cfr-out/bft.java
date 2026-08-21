/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class bft
implements bhj,
AutoCloseable {
    private static final Logger b = LogUtils.getLogger();
    private CompletableFuture<?> c = CompletableFuture.completedFuture(null);
    private final Executor d;
    private volatile boolean e;

    public bft(Executor $$0) {
        this.d = $$0;
    }

    @Override
    public <T> void append(CompletableFuture<T> $$02, Consumer<T> $$12) {
        this.c = ((CompletableFuture)((CompletableFuture)this.c.thenCombine($$02, ($$0, $$1) -> $$1)).thenAcceptAsync($$1 -> {
            if (!this.e) {
                $$12.accept($$1);
            }
        }, this.d)).exceptionally($$0 -> {
            if ($$0 instanceof CompletionException) {
                CompletionException $$1 = (CompletionException)$$0;
                $$0 = $$1.getCause();
            }
            if ($$0 instanceof CancellationException) {
                CancellationException $$2 = (CancellationException)$$0;
                throw $$2;
            }
            b.error("Chain link failed, continuing to next one", $$0);
            return null;
        });
    }

    @Override
    public void close() {
        this.e = true;
    }
}

