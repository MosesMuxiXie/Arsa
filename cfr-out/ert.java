/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.io.IOException;
import java.nio.file.Path;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.SequencedMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ert
implements err,
AutoCloseable {
    public static final Supplier<uz> a = () -> null;
    private static final Logger b = LogUtils.getLogger();
    private final AtomicBoolean c = new AtomicBoolean();
    private final cbu d;
    private final ery e;
    private final SequencedMap<dvu, a> f = new LinkedHashMap<dvu, a>();
    private final Long2ObjectLinkedOpenHashMap<CompletableFuture<BitSet>> g = new Long2ObjectLinkedOpenHashMap();
    private static final int h = 1024;

    protected ert(esa $$0, Path $$1, boolean $$2) {
        this.e = new ery($$0, $$1, $$2);
        this.d = new cbu(ert$b.values().length, (Executor)bhs.i(), "IOWorker-" + $$0.c());
    }

    public boolean a(dvu $$0, int $$1) {
        dvu $$2 = new dvu($$0.h - $$1, $$0.i - $$1);
        dvu $$3 = new dvu($$0.h + $$1, $$0.i + $$1);
        for (int $$4 = $$2.i(); $$4 <= $$3.i(); ++$$4) {
            for (int $$5 = $$2.j(); $$5 <= $$3.j(); ++$$5) {
                BitSet $$6 = this.a($$4, $$5).join();
                if ($$6.isEmpty()) continue;
                dvu $$7 = dvu.a($$4, $$5);
                int $$8 = Math.max($$2.h - $$7.h, 0);
                int $$9 = Math.max($$2.i - $$7.i, 0);
                int $$10 = Math.min($$3.h - $$7.h, 31);
                int $$11 = Math.min($$3.i - $$7.i, 31);
                for (int $$12 = $$8; $$12 <= $$10; ++$$12) {
                    for (int $$13 = $$9; $$13 <= $$11; ++$$13) {
                        int $$14 = $$13 * 32 + $$12;
                        if (!$$6.get($$14)) continue;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private CompletableFuture<BitSet> a(int $$0, int $$1) {
        long $$2 = dvu.d($$0, $$1);
        Long2ObjectLinkedOpenHashMap<CompletableFuture<BitSet>> long2ObjectLinkedOpenHashMap = this.g;
        synchronized (long2ObjectLinkedOpenHashMap) {
            CompletableFuture<BitSet> $$3 = (CompletableFuture<BitSet>)this.g.getAndMoveToFirst($$2);
            if ($$3 == null) {
                $$3 = this.b($$0, $$1);
                this.g.putAndMoveToFirst($$2, $$3);
                if (this.g.size() > 1024) {
                    this.g.removeLast();
                }
            }
            return $$3;
        }
    }

    private CompletableFuture<BitSet> b(int $$0, int $$1) {
        return CompletableFuture.supplyAsync(() -> {
            dvu $$2 = dvu.a($$0, $$1);
            dvu $$3 = dvu.b($$0, $$1);
            BitSet $$4 = new BitSet();
            dvu.a($$2, $$3).forEach($$1 -> {
                uz $$5;
                wg $$2 = new wg(new wi(ve.a, "DataVersion"), new wi(uz.b, "blending_data"));
                try {
                    this.a((dvu)$$1, $$2).join();
                }
                catch (Exception $$3) {
                    b.warn("Failed to scan chunk {}", $$1, (Object)$$3);
                    return;
                }
                vz $$4 = $$2.d();
                if ($$4 instanceof uz && this.a($$5 = (uz)$$4)) {
                    int $$6 = $$1.l() * 32 + $$1.k();
                    $$4.set($$6);
                }
            });
            return $$4;
        }, bhs.h());
    }

    private boolean a(uz $$0) {
        if ($$0.b("DataVersion", 0) < 4295) {
            return true;
        }
        return $$0.m("blending_data").isPresent();
    }

    public CompletableFuture<Void> a(dvu $$0, uz $$1) {
        return this.a($$0, () -> $$1);
    }

    public CompletableFuture<Void> a(dvu $$0, Supplier<uz> $$1) {
        return this.a(() -> {
            uz $$2 = (uz)$$1.get();
            a $$3 = this.f.computeIfAbsent($$0, $$1 -> new a($$2));
            $$3.a = $$2;
            return $$3.b;
        }).thenCompose(Function.identity());
    }

    public CompletableFuture<Optional<uz>> a(dvu $$0) {
        return this.a(() -> {
            a $$1 = (a)this.f.get($$0);
            if ($$1 != null) {
                return Optional.ofNullable($$1.a());
            }
            try {
                uz $$2 = this.e.a($$0);
                return Optional.ofNullable($$2);
            }
            catch (Exception $$3) {
                b.warn("Failed to read chunk {}", (Object)$$0, (Object)$$3);
                throw $$3;
            }
        });
    }

    public CompletableFuture<Void> a(boolean $$02) {
        CompletionStage $$1 = this.a(() -> CompletableFuture.allOf((CompletableFuture[])this.f.values().stream().map($$0 -> $$0.b).toArray(CompletableFuture[]::new))).thenCompose(Function.identity());
        if ($$02) {
            return ((CompletableFuture)$$1).thenCompose($$0 -> this.a(() -> {
                try {
                    this.e.a();
                    return null;
                }
                catch (Exception $$0) {
                    b.warn("Failed to synchronize chunks", (Throwable)$$0);
                    throw $$0;
                }
            }));
        }
        return ((CompletableFuture)$$1).thenCompose($$0 -> this.a(() -> null));
    }

    @Override
    public CompletableFuture<Void> a(dvu $$0, vw $$1) {
        return this.a(() -> {
            try {
                a $$2 = (a)this.f.get($$0);
                if ($$2 != null) {
                    if ($$2.a != null) {
                        $$2.a.b($$1);
                    }
                } else {
                    this.e.a($$0, $$1);
                }
                return null;
            }
            catch (Exception $$3) {
                b.warn("Failed to bulk scan chunk {}", (Object)$$0, (Object)$$3);
                throw $$3;
            }
        });
    }

    private <T> CompletableFuture<T> a(c<T> $$0) {
        return this.d.a(ert$b.a.ordinal(), (CompletableFuture<Source> $$1) -> {
            if (!this.c.get()) {
                try {
                    $$1.complete($$0.get());
                }
                catch (Exception $$2) {
                    $$1.completeExceptionally($$2);
                }
            }
            this.c();
        });
    }

    private <T> CompletableFuture<T> a(Supplier<T> $$0) {
        return this.d.a(ert$b.a.ordinal(), (CompletableFuture<Source> $$1) -> {
            if (!this.c.get()) {
                $$1.complete($$0.get());
            }
            this.c();
        });
    }

    private void b() {
        Map.Entry<dvu, a> $$0 = this.f.pollFirstEntry();
        if ($$0 == null) {
            return;
        }
        this.a($$0.getKey(), $$0.getValue());
        this.c();
    }

    private void c() {
        this.d.a_(new cbw.c(ert$b.b.ordinal(), this::b));
    }

    private void a(dvu $$0, a $$1) {
        try {
            this.e.a($$0, $$1.a);
            $$1.b.complete(null);
        }
        catch (Exception $$2) {
            b.error("Failed to store chunk {}", (Object)$$0, (Object)$$2);
            $$1.b.completeExceptionally($$2);
        }
    }

    @Override
    public void close() throws IOException {
        if (!this.c.compareAndSet(false, true)) {
            return;
        }
        this.d();
        this.d.close();
        try {
            this.e.close();
        }
        catch (Exception $$0) {
            b.error("Failed to close storage", (Throwable)$$0);
        }
    }

    private void d() {
        this.d.a(ert$b.c.ordinal(), (CompletableFuture<Source> $$0) -> $$0.complete(bhr.a)).join();
    }

    public esa a() {
        return this.e.b();
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = ert$b.a();
        }
    }

    @FunctionalInterface
    static interface c<T> {
        public @Nullable T get() throws Exception;
    }

    static class a {
        @Nullable uz a;
        final CompletableFuture<Void> b = new CompletableFuture();

        public a(@Nullable uz $$0) {
            this.a = $$0;
        }

        @Nullable uz a() {
            uz $$0 = this.a;
            return $$0 == null ? null : $$0.l();
        }
    }
}

