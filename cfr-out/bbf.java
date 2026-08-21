/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.jspecify.annotations.Nullable;

public class bbf<S>
implements bav {
    private static final int a = 2;
    private static final int b = 2;
    private static final int c = 1;
    final CompletableFuture<bhr> d = new CompletableFuture();
    private @Nullable CompletableFuture<List<S>> e;
    final Set<bat> f;
    private final int g;
    private final AtomicInteger h = new AtomicInteger();
    private final AtomicInteger i = new AtomicInteger();
    private final AtomicInteger j = new AtomicInteger();
    private final AtomicInteger k = new AtomicInteger();

    public static bav b(baz $$0, List<bat> $$1, Executor $$2, Executor $$3, CompletableFuture<bhr> $$4) {
        bbf<Void> $$5 = new bbf<Void>($$1);
        $$5.b($$2, $$3, $$0, $$1, bbf$a.a, $$4);
        return $$5;
    }

    protected bbf(List<bat> $$0) {
        this.g = $$0.size();
        this.f = new HashSet<bat>($$0);
    }

    protected void b(Executor $$0, Executor $$1, baz $$2, List<bat> $$3, a<S> $$4, CompletableFuture<?> $$5) {
        this.e = this.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    protected CompletableFuture<List<S>> a(Executor $$0, Executor $$12, baz $$2, List<bat> $$3, a<S> $$4, CompletableFuture<?> $$5) {
        Executor $$6 = $$1 -> {
            this.h.incrementAndGet();
            $$0.execute(() -> {
                $$1.run();
                this.i.incrementAndGet();
            });
        };
        Executor $$7 = $$1 -> {
            this.j.incrementAndGet();
            $$12.execute(() -> {
                $$1.run();
                this.k.incrementAndGet();
            });
        };
        this.h.incrementAndGet();
        $$5.thenRun(this.i::incrementAndGet);
        bat.b $$8 = new bat.b($$2);
        $$3.forEach($$1 -> $$1.prepareSharedState($$8));
        CompletableFuture<Object> $$9 = $$5;
        ArrayList<CompletableFuture<S>> $$10 = new ArrayList<CompletableFuture<S>>();
        for (bat $$11 : $$3) {
            bat.a $$122 = this.a($$11, $$9, $$12);
            CompletableFuture<S> $$13 = $$4.create($$8, $$122, $$11, $$6, $$7);
            $$10.add($$13);
            $$9 = $$13;
        }
        return bhs.d($$10);
    }

    private bat.a a(final bat $$0, final CompletableFuture<?> $$1, final Executor $$2) {
        return new bat.a(){

            @Override
            public <T> CompletableFuture<T> wait(T $$02) {
                $$2.execute(() -> {
                    bbf.this.f.remove($$0);
                    if (bbf.this.f.isEmpty()) {
                        bbf.this.d.complete(bhr.a);
                    }
                });
                return bbf.this.d.thenCombine((CompletionStage)$$1, ($$1, $$2) -> $$02);
            }
        };
    }

    @Override
    public CompletableFuture<?> a() {
        return Objects.requireNonNull(this.e, "not started");
    }

    @Override
    public float b() {
        int $$0 = this.g - this.f.size();
        float $$1 = bbf.a(this.i.get(), this.k.get(), $$0);
        float $$2 = bbf.a(this.h.get(), this.j.get(), this.g);
        return $$1 / $$2;
    }

    private static int a(int $$0, int $$1, int $$2) {
        return $$0 * 2 + $$1 * 2 + $$2 * 1;
    }

    public static bav a(baz $$0, List<bat> $$1, Executor $$2, Executor $$3, CompletableFuture<bhr> $$4, boolean $$5) {
        if ($$5) {
            return bau.a($$0, $$1, $$2, $$3, $$4);
        }
        return bbf.b($$0, $$1, $$2, $$3, $$4);
    }

    @FunctionalInterface
    protected static interface a<S> {
        public static final a<Void> a = ($$0, $$1, $$2, $$3, $$4) -> $$2.reload($$0, $$3, $$1, $$4);

        public CompletableFuture<S> create(bat.b var1, bat.a var2, bat var3, Executor var4, Executor var5);
    }
}

