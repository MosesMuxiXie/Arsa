/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public interface aur {
    public <V> CompletableFuture<V> a(Supplier<V> var1);

    public CompletableFuture<Void> a(Runnable var1);
}

