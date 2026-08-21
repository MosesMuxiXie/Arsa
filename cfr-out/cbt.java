/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import org.jspecify.annotations.Nullable;

public class cbt {
    private static final int a = 16;

    public static <K, U, V> CompletableFuture<Map<K, V>> a(Map<K, U> $$0, BiFunction<K, U, @Nullable V> $$1, int $$2, Executor $$3) {
        int $$4 = $$0.size();
        if ($$4 == 0) {
            return CompletableFuture.completedFuture(Map.of());
        }
        if ($$4 == 1) {
            Map.Entry<K, U> $$5 = $$0.entrySet().iterator().next();
            Object $$6 = $$5.getKey();
            Object $$7 = $$5.getValue();
            return CompletableFuture.supplyAsync(() -> {
                Object $$3 = $$1.apply($$6, $$7);
                return $$3 != null ? Map.of($$6, $$3) : Map.of();
            }, $$3);
        }
        d $$8 = $$4 <= $$2 ? new c<K, U, V>($$1, $$4) : new a<K, U, V>($$1, $$4, $$2);
        return $$8.a($$0, $$3);
    }

    public static <K, U, V> CompletableFuture<Map<K, V>> a(Map<K, U> $$0, BiFunction<K, U, @Nullable V> $$1, Executor $$2) {
        int $$3 = bhs.g() * 16;
        return cbt.a($$0, $$1, $$3, $$2);
    }

    static class c<K, U, V>
    extends d<K, U, V> {
        c(BiFunction<K, U, V> $$0, int $$1) {
            super($$0, $$1, $$1);
        }

        @Override
        protected int a(int $$0) {
            return 1;
        }

        @Override
        protected CompletableFuture<?> a(b<K, U, V> $$0, int $$1, int $$2, Executor $$3) {
            assert ($$1 + 1 == $$2);
            return CompletableFuture.runAsync(() -> $$0.a($$1), $$3);
        }

        @Override
        protected CompletableFuture<Map<K, V>> a(CompletableFuture<?> $$0, b<K, U, V> $$12) {
            return $$0.thenApply($$1 -> {
                HashMap $$2 = new HashMap($$12.a());
                for (int $$3 = 0; $$3 < $$12.a(); ++$$3) {
                    $$12.a($$3, $$2);
                }
                return $$2;
            });
        }
    }

    static class a<K, U, V>
    extends d<K, U, V> {
        private final Map<K, V> c;
        private final int d;
        private final int e;

        a(BiFunction<K, U, V> $$0, int $$1, int $$2) {
            super($$0, $$1, $$2);
            this.c = new HashMap($$1);
            this.d = bgj.f($$1, $$2);
            int $$3 = this.d * $$2;
            int $$4 = $$3 - $$1;
            this.e = $$2 - $$4;
            assert (this.e > 0 && this.e <= $$2);
        }

        @Override
        protected CompletableFuture<?> a(b<K, U, V> $$0, int $$1, int $$2, Executor $$3) {
            int $$4 = $$2 - $$1;
            assert ($$4 == this.d || $$4 == this.d - 1);
            return CompletableFuture.runAsync(cbt$a.a(this.c, $$1, $$2, $$0), $$3);
        }

        @Override
        protected int a(int $$0) {
            return $$0 < this.e ? this.d : this.d - 1;
        }

        private static <K, U, V> Runnable a(Map<K, V> $$0, int $$1, int $$2, b<K, U, V> $$3) {
            return () -> {
                for (int $$4 = $$1; $$4 < $$2; ++$$4) {
                    $$3.a($$4);
                }
                Map map = $$0;
                synchronized (map) {
                    for (int $$5 = $$1; $$5 < $$2; ++$$5) {
                        $$3.a($$5, $$0);
                    }
                }
            };
        }

        @Override
        protected CompletableFuture<Map<K, V>> a(CompletableFuture<?> $$0, b<K, U, V> $$12) {
            Map $$2 = this.c;
            return $$0.thenApply($$1 -> $$2);
        }
    }

    static abstract class d<K, U, V> {
        private int a;
        private int c;
        private final CompletableFuture<?>[] d;
        private int e;
        private final b<K, U, V> f;

        d(BiFunction<K, U, V> $$0, int $$1, int $$2) {
            this.f = new b<K, U, V>($$0, $$1);
            this.d = new CompletableFuture[$$2];
        }

        private int a() {
            return this.c - this.a;
        }

        public CompletableFuture<Map<K, V>> a(Map<K, U> $$0, Executor $$12) {
            $$0.forEach(($$1, $$2) -> {
                this.f.a(this.c++, $$1, $$2);
                if (this.a() == this.a(this.e)) {
                    this.d[this.e++] = this.a(this.f, this.a, this.c, $$12);
                    this.a = this.c;
                }
            });
            assert (this.c == this.f.a());
            assert (this.a == this.c);
            assert (this.e == this.d.length);
            return this.a(CompletableFuture.allOf(this.d), this.f);
        }

        protected abstract int a(int var1);

        protected abstract CompletableFuture<?> a(b<K, U, V> var1, int var2, int var3, Executor var4);

        protected abstract CompletableFuture<Map<K, V>> a(CompletableFuture<?> var1, b<K, U, V> var2);
    }

    record b<K, U, V>(BiFunction<K, U, V> a, @Nullable Object[] b, @Nullable Object[] c) {
        private final BiFunction<K, U, V> a;
        private final @Nullable Object[] b;
        private final @Nullable Object[] c;

        public b(BiFunction<K, U, V> $$0, int $$1) {
            this($$0, new Object[$$1], new Object[$$1]);
        }

        public void a(int $$0, K $$1, U $$2) {
            this.b[$$0] = $$1;
            this.c[$$0] = $$2;
        }

        private @Nullable K b(int $$0) {
            return (K)this.b[$$0];
        }

        private @Nullable V c(int $$0) {
            return (V)this.c[$$0];
        }

        private @Nullable U d(int $$0) {
            return (U)this.c[$$0];
        }

        public void a(int $$0) {
            this.c[$$0] = this.a.apply(this.b($$0), this.d($$0));
        }

        public void a(int $$0, Map<K, V> $$1) {
            V $$2 = this.c($$0);
            if ($$2 != null) {
                K $$3 = this.b($$0);
                $$1.put($$3, $$2);
            }
        }

        public int a() {
            return this.b.length;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "operation;keys;values", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "operation;keys;values", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "operation;keys;values", "a", "b", "c"}, this, $$0);
        }

        public BiFunction<K, U, V> b() {
            return this.a;
        }

        public @Nullable Object[] c() {
            return this.b;
        }

        public @Nullable Object[] d() {
            return this.c;
        }
    }
}

