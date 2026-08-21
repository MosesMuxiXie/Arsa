/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntSupplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class axj
extends fkq
implements AutoCloseable {
    public static final int a = 1000;
    private static final Logger e = LogUtils.getLogger();
    private final cbs f;
    private final ObjectList<Pair<a, Runnable>> g = new ObjectArrayList();
    private final awj h;
    private final awl i;
    private final int j = 1000;
    private final AtomicBoolean k = new AtomicBoolean();

    public axj(eqt $$0, awj $$1, boolean $$2, cbs $$3, awl $$4) {
        super($$0, true, $$2);
        this.h = $$1;
        this.i = $$4;
        this.f = $$3;
    }

    @Override
    public void close() {
    }

    @Override
    public int a() {
        throw bhs.b(new UnsupportedOperationException("Ran automatically on a different thread!"));
    }

    @Override
    public void a(is $$0) {
        is $$1 = $$0.j();
        this.a(jw.a($$0.u()), jw.a($$0.w()), axj$a.a, bhs.a(() -> super.a($$1), () -> "checkBlock " + String.valueOf($$1)));
    }

    protected void a(dvu $$0) {
        this.a($$0.h, $$0.i, () -> 0, axj$a.a, bhs.a(() -> {
            super.b($$0, false);
            super.a($$0, false);
            for (int $$1 = this.d(); $$1 < this.e(); ++$$1) {
                super.a(dww.b, jw.a($$0, $$1), null);
                super.a(dww.a, jw.a($$0, $$1), null);
            }
            for (int $$2 = this.d.ay(); $$2 <= this.d.az(); ++$$2) {
                super.a(jw.a($$0, $$2), true);
            }
        }, () -> "updateChunkStatus " + String.valueOf($$0) + " true"));
    }

    @Override
    public void a(jw $$0, boolean $$1) {
        this.a($$0.a(), $$0.c(), () -> 0, axj$a.a, bhs.a(() -> super.a($$0, $$1), () -> "updateSectionStatus " + String.valueOf($$0) + " " + $$1));
    }

    @Override
    public void b(dvu $$0) {
        this.a($$0.h, $$0.i, axj$a.a, bhs.a(() -> super.b($$0), () -> "propagateLight " + String.valueOf($$0)));
    }

    @Override
    public void a(dvu $$0, boolean $$1) {
        this.a($$0.h, $$0.i, axj$a.a, bhs.a(() -> super.a($$0, $$1), () -> "enableLight " + String.valueOf($$0) + " " + $$1));
    }

    @Override
    public void a(dww $$0, jw $$1, @Nullable eql $$2) {
        this.a($$1.a(), $$1.c(), () -> 0, axj$a.a, bhs.a(() -> super.a($$0, $$1, $$2), () -> "queueData " + String.valueOf($$1)));
    }

    private void a(int $$0, int $$1, a $$2, Runnable $$3) {
        this.a($$0, $$1, this.h.d(dvu.d($$0, $$1)), $$2, $$3);
    }

    private void a(int $$0, int $$1, IntSupplier $$2, a $$3, Runnable $$4) {
        this.i.a(() -> {
            this.g.add((Object)Pair.of((Object)((Object)$$3), (Object)$$4));
            if (this.g.size() >= 1000) {
                this.f();
            }
        }, dvu.d($$0, $$1), $$2);
    }

    @Override
    public void b(dvu $$0, boolean $$1) {
        this.a($$0.h, $$0.i, () -> 0, axj$a.a, bhs.a(() -> super.b($$0, $$1), () -> "retainData " + String.valueOf($$0)));
    }

    public CompletableFuture<eqf> a(eqf $$0, boolean $$12) {
        dvu $$2 = $$0.f();
        this.a($$2.h, $$2.i, axj$a.a, bhs.a(() -> {
            eqr[] $$2 = $$0.d();
            for (int $$3 = 0; $$3 < $$0.ax(); ++$$3) {
                eqr $$4 = $$2[$$3];
                if ($$4.c()) continue;
                int $$5 = this.d.h($$3);
                super.a(jw.a($$2, $$5), false);
            }
        }, () -> "initializeLight: " + String.valueOf($$2)));
        return CompletableFuture.supplyAsync(() -> {
            super.a($$2, $$12);
            super.b($$2, false);
            return $$0;
        }, $$1 -> this.a($$0.h, $$0.i, axj$a.b, $$1));
    }

    public CompletableFuture<eqf> b(eqf $$0, boolean $$12) {
        dvu $$2 = $$0.f();
        $$0.a(false);
        this.a($$2.h, $$2.i, axj$a.a, bhs.a(() -> {
            if (!$$12) {
                super.b($$2);
            }
            if (w.M) {
                e.debug("LIT {}", (Object)$$2);
            }
        }, () -> "lightChunk " + String.valueOf($$2) + " " + $$12));
        return CompletableFuture.supplyAsync(() -> {
            $$0.a(true);
            return $$0;
        }, $$1 -> this.a($$0.h, $$0.i, axj$a.b, $$1));
    }

    public void b() {
        if ((!this.g.isEmpty() || super.M_()) && this.k.compareAndSet(false, true)) {
            this.f.a_(() -> {
                this.f();
                this.k.set(false);
            });
        }
    }

    private void f() {
        int $$2;
        int $$0 = Math.min(this.g.size(), 1000);
        ObjectListIterator $$1 = this.g.iterator();
        for ($$2 = 0; $$1.hasNext() && $$2 < $$0; ++$$2) {
            Pair $$3 = (Pair)$$1.next();
            if ($$3.getFirst() != axj$a.a) continue;
            ((Runnable)$$3.getSecond()).run();
        }
        $$1.back($$2);
        super.a();
        for ($$2 = 0; $$1.hasNext() && $$2 < $$0; ++$$2) {
            Pair $$4 = (Pair)$$1.next();
            if ($$4.getFirst() == axj$a.b) {
                ((Runnable)$$4.getSecond()).run();
            }
            $$1.remove();
        }
    }

    public CompletableFuture<?> a(int $$0, int $$1) {
        return CompletableFuture.runAsync(() -> {}, $$2 -> this.a($$0, $$1, axj$a.b, $$2));
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = axj$a.a();
        }
    }
}

