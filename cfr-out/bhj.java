/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import org.slf4j.Logger;

@FunctionalInterface
public interface bhj {
    public static final Logger a = LogUtils.getLogger();

    public static bhj immediate(final Executor $$0) {
        return new bhj(){

            @Override
            public <T> void append(CompletableFuture<T> $$02, Consumer<T> $$1) {
                ((CompletableFuture)$$02.thenAcceptAsync((Consumer)$$1, $$0)).exceptionally($$0 -> {
                    a.error("Task failed", $$0);
                    return null;
                });
            }
        };
    }

    default public void append(Runnable $$0) {
        this.append(CompletableFuture.completedFuture(null), $$1 -> $$0.run());
    }

    public <T> void append(CompletableFuture<T> var1, Consumer<T> var2);
}

