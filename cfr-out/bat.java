/*
 * Decompiled with CFR 0.152.
 */
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@FunctionalInterface
public interface bat {
    public CompletableFuture<Void> reload(b var1, Executor var2, a var3, Executor var4);

    default public void prepareSharedState(b $$0) {
    }

    default public String getName() {
        return this.getClass().getSimpleName();
    }

    public static final class b {
        private final baz a;
        private final Map<c<?>, Object> b = new IdentityHashMap();

        public b(baz $$0) {
            this.a = $$0;
        }

        public baz a() {
            return this.a;
        }

        public <T> void a(c<T> $$0, T $$1) {
            this.b.put($$0, $$1);
        }

        public <T> T a(c<T> $$0) {
            return (T)Objects.requireNonNull(this.b.get($$0));
        }
    }

    public static final class c<T> {
    }

    @FunctionalInterface
    public static interface a {
        public <T> CompletableFuture<T> wait(T var1);
    }
}

