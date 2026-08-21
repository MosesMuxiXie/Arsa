/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 */
import com.google.gson.JsonElement;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public record aub<Result>(jd.c<? extends atz<?, ? extends Result>> a, CompletableFuture<Result> b, long c) {
    public void a(JsonElement $$0) {
        try {
            Result $$1 = this.a.a().a($$0);
            this.b.complete(Objects.requireNonNull($$1));
        }
        catch (Exception $$2) {
            this.b.completeExceptionally($$2);
        }
    }

    public boolean a(long $$0) {
        return $$0 > this.c;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aub.class, "method;resultFuture;timeoutTime", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aub.class, "method;resultFuture;timeoutTime", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aub.class, "method;resultFuture;timeoutTime", "a", "b", "c"}, this, $$0);
    }
}

