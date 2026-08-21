/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class qa<T>
implements mq {
    protected final ms.a e;
    private final CompletableFuture<jf.a> d;
    private final CompletableFuture<Void> g = new CompletableFuture();
    private final CompletableFuture<b<T>> h;
    protected final amt<? extends jq<T>> f;
    private final Map<amo, bec> i = Maps.newLinkedHashMap();

    protected qa(ms $$0, amt<? extends jq<T>> $$1, CompletableFuture<jf.a> $$2) {
        this($$0, $$1, $$2, CompletableFuture.completedFuture(b.empty()));
    }

    protected qa(ms $$0, amt<? extends jq<T>> $$1, CompletableFuture<jf.a> $$2, CompletableFuture<b<T>> $$3) {
        this.e = $$0.b($$1);
        this.f = $$1;
        this.h = $$3;
        this.d = $$2;
    }

    @Override
    public final String a() {
        return "Tags for " + String.valueOf(this.f.a());
    }

    protected abstract void a(jf.a var1);

    @Override
    public CompletableFuture<?> a(mo $$02) {
        final class A<T>
        extends Record {
            final jf.a a;
            final b<T> b;

            A(jf.a $$0, b<T> $$1) {
                this.a = $$0;
                this.b = $$1;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "contents;parent", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "contents;parent", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "contents;parent", "a", "b"}, this, $$0);
            }

            public jf.a a() {
                return this.a;
            }

            public b<T> b() {
                return this.b;
            }
        }
        return ((CompletableFuture)((CompletableFuture)this.c().thenApply($$0 -> {
            this.g.complete(null);
            return $$0;
        })).thenCombineAsync(this.h, ($$0, $$1) -> new A((jf.a)$$0, $$1), (Executor)bhs.h())).thenCompose($$12 -> {
            jf.b $$2 = $$12.a.e(this.f);
            Predicate<amo> $$3 = $$1 -> $$2.a(amt.a(this.f, $$1)).isPresent();
            Predicate<amo> $$42 = $$1 -> this.i.containsKey($$1) || $$0.b.contains(bef.a(this.f, $$1));
            return CompletableFuture.allOf((CompletableFuture[])this.i.entrySet().stream().map($$4 -> {
                amo $$5 = (amo)$$4.getKey();
                bec $$6 = (bec)$$4.getValue();
                List<bed> $$7 = $$6.b();
                List<bed> $$8 = $$7.stream().filter($$2 -> !$$2.a($$3, $$42)).toList();
                if (!$$8.isEmpty()) {
                    throw new IllegalArgumentException(String.format(Locale.ROOT, "Couldn't define tag %s as it is missing following references: %s", $$5, $$8.stream().map(Objects::toString).collect(Collectors.joining(","))));
                }
                Path $$9 = this.e.a($$5);
                return mq.a($$02, $$3.a, bee.a, new bee($$7, false), $$9);
            }).toArray(CompletableFuture[]::new));
        });
    }

    protected bec b(bef<T> $$02) {
        return this.i.computeIfAbsent($$02.b(), $$0 -> bec.a());
    }

    public CompletableFuture<b<T>> b() {
        return this.g.thenApply($$02 -> $$0 -> Optional.ofNullable(this.i.get($$0.b())));
    }

    protected CompletableFuture<jf.a> c() {
        return this.d.thenApply($$0 -> {
            this.i.clear();
            this.a((jf.a)$$0);
            return $$0;
        });
    }

    @FunctionalInterface
    public static interface b<T>
    extends Function<bef<T>, Optional<bec>> {
        public static <T> b<T> empty() {
            return $$0 -> Optional.empty();
        }

        default public boolean contains(bef<T> $$0) {
            return ((Optional)this.apply($$0)).isPresent();
        }
    }
}

