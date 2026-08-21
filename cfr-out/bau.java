/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.base.Stopwatch;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.slf4j.Logger;

public class bau
extends bbf<a> {
    private static final Logger a = LogUtils.getLogger();
    private final Stopwatch b = Stopwatch.createUnstarted();

    public static bav a(baz $$0, List<bat> $$12, Executor $$22, Executor $$32, CompletableFuture<bhr> $$42) {
        bau $$5 = new bau($$12);
        $$5.b($$22, $$32, $$0, $$12, ($$1, $$2, $$3, $$4, $$52) -> {
            AtomicLong $$6 = new AtomicLong();
            AtomicLong $$7 = new AtomicLong();
            AtomicLong $$8 = new AtomicLong();
            AtomicLong $$9 = new AtomicLong();
            CompletableFuture<Void> $$10 = $$3.reload($$1, bau.a($$4, $$6, $$7, $$3.getName()), $$2, bau.a($$52, $$8, $$9, $$3.getName()));
            return $$10.thenApplyAsync($$5 -> {
                a.debug("Finished reloading {}", (Object)$$3.getName());
                return new a($$3.getName(), $$6, $$7, $$8, $$9);
            }, $$32);
        }, $$42);
        return $$5;
    }

    private bau(List<bat> $$0) {
        super($$0);
        this.b.start();
    }

    @Override
    protected CompletableFuture<List<a>> a(Executor $$0, Executor $$1, baz $$2, List<bat> $$3, bbf.a<a> $$4, CompletableFuture<?> $$5) {
        return super.a($$0, $$1, $$2, $$3, $$4, $$5).thenApplyAsync(this::a, $$1);
    }

    private static Executor a(Executor $$0, AtomicLong $$1, AtomicLong $$2, String $$3) {
        return $$4 -> $$0.execute(() -> {
            Runnable $$4 = bzl.a();
            $$4.a($$3);
            long $$5 = bhs.d();
            $$4.run();
            $$1.addAndGet(bhs.d() - $$5);
            $$2.incrementAndGet();
            $$4.c();
        });
    }

    private List<a> a(List<a> $$0) {
        this.b.stop();
        long $$1 = 0L;
        a.info("Resource reload finished after {} ms", (Object)this.b.elapsed(TimeUnit.MILLISECONDS));
        for (a $$2 : $$0) {
            long $$3 = TimeUnit.NANOSECONDS.toMillis($$2.b.get());
            long $$4 = $$2.c.get();
            long $$5 = TimeUnit.NANOSECONDS.toMillis($$2.d.get());
            long $$6 = $$2.e.get();
            long $$7 = $$3 + $$5;
            long $$8 = $$4 + $$6;
            String $$9 = $$2.a;
            a.info("{} took approximately {} tasks/{} ms ({} tasks/{} ms preparing, {} tasks/{} ms applying)", new Object[]{$$9, $$8, $$7, $$4, $$3, $$6, $$5});
            $$1 += $$5;
        }
        a.info("Total blocking time: {} ms", (Object)$$1);
        return $$0;
    }

    public static final class a
    extends Record {
        final String a;
        final AtomicLong b;
        final AtomicLong c;
        final AtomicLong d;
        final AtomicLong e;

        public a(String $$0, AtomicLong $$1, AtomicLong $$2, AtomicLong $$3, AtomicLong $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "name;preparationNanos;preparationCount;reloadNanos;reloadCount", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "name;preparationNanos;preparationCount;reloadNanos;reloadCount", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "name;preparationNanos;preparationCount;reloadNanos;reloadCount", "a", "b", "c", "d", "e"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        public AtomicLong b() {
            return this.b;
        }

        public AtomicLong c() {
            return this.c;
        }

        public AtomicLong d() {
            return this.d;
        }

        public AtomicLong e() {
            return this.e;
        }
    }
}

