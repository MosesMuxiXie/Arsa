/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface ess<T>
extends AutoCloseable {
    public CompletableFuture<esn<T>> a(dvu var1);

    public void a(esn<T> var1);

    public void a(boolean var1);

    @Override
    default public void close() throws IOException {
    }
}

