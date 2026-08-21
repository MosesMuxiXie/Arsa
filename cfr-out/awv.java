/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;

public abstract class awv {
    private static final List<erj> a = erj.a();
    private static final awk<eqf> e = awk.a("Not done yet");
    public static final awk<eqf> b = awk.a("Unloaded chunk");
    public static final CompletableFuture<awk<eqf>> c = CompletableFuture.completedFuture(b);
    protected final dvu d;
    private volatile @Nullable erj f;
    private final AtomicReference<@Nullable erj> g = new AtomicReference();
    private final AtomicReferenceArray<@Nullable CompletableFuture<awk<eqf>>> h = new AtomicReferenceArray(a.size());
    private final AtomicReference<@Nullable awf> i = new AtomicReference();
    private final AtomicInteger j = new AtomicInteger();
    private volatile CompletableFuture<Void> k = CompletableFuture.completedFuture(null);

    public awv(dvu $$0) {
        this.d = $$0;
        if (!$$0.a()) {
            throw new IllegalStateException("Trying to create chunk out of reasonable bounds: " + String.valueOf($$0));
        }
    }

    public CompletableFuture<awk<eqf>> a(erj $$0, awj $$1) {
        if (this.f($$0)) {
            return c;
        }
        CompletableFuture<awk<eqf>> $$2 = this.c($$0);
        if ($$2.isDone()) {
            return $$2;
        }
        awf $$3 = this.i.get();
        if ($$3 == null || $$0.b($$3.a)) {
            this.a($$1, $$0);
        }
        return $$2;
    }

    CompletableFuture<awk<eqf>> a(erm $$0, awu $$12, bhe<awv> $$22) {
        if (this.f($$0.a())) {
            return c;
        }
        if (this.e($$0.a())) {
            return $$12.a(this, $$0, $$22).handle(($$1, $$2) -> {
                if ($$2 != null) {
                    m $$3 = m.a($$2, "Exception chunk generation/loading");
                    MinecraftServer.a(new v($$3));
                } else {
                    this.a($$0.a(), (eqf)$$1);
                }
                return awk.a($$1);
            });
        }
        return this.c($$0.a());
    }

    protected void a(awj $$0) {
        boolean $$3;
        erj $$2;
        erj $$1 = this.f;
        this.f = $$2 = awh.a(this.j());
        boolean bl2 = $$3 = $$1 != null && ($$2 == null || $$2.d($$1));
        if ($$3) {
            this.a($$2, $$1);
            if (this.i.get() != null) {
                this.a($$0, this.d($$2));
            }
        }
    }

    public void a(eqp $$0) {
        CompletableFuture<awk<eqp>> $$1 = CompletableFuture.completedFuture(awk.a($$0));
        for (int $$2 = 0; $$2 < this.h.length() - 1; ++$$2) {
            CompletableFuture<awk<eqf>> $$3 = this.h.get($$2);
            Objects.requireNonNull($$3);
            eqf $$4 = $$3.getNow(e).b((eqf)null);
            if ($$4 instanceof erb) {
                if (this.h.compareAndSet($$2, $$3, $$1)) continue;
                throw new IllegalStateException("Future changed by other thread while trying to replace it");
            }
            throw new IllegalStateException("Trying to replace a ProtoChunk, but found " + String.valueOf($$4));
        }
    }

    void a(awf $$0) {
        this.i.compareAndSet($$0, null);
    }

    private void a(awj $$0, @Nullable erj $$1) {
        Object $$3;
        if ($$1 != null) {
            awf $$2 = $$0.a($$1, this.r());
        } else {
            $$3 = null;
        }
        awf $$4 = this.i.getAndSet((awf)$$3);
        if ($$4 != null) {
            $$4.b();
        }
    }

    private CompletableFuture<awk<eqf>> c(erj $$0) {
        if (this.f($$0)) {
            return c;
        }
        int $$1 = $$0.b();
        CompletableFuture<awk<eqf>> $$2 = this.h.get($$1);
        while ($$2 == null) {
            CompletableFuture<awk<eqf>> $$3 = new CompletableFuture<awk<eqf>>();
            $$2 = this.h.compareAndExchange($$1, null, $$3);
            if ($$2 != null) continue;
            if (this.f($$0)) {
                this.a($$1, $$3);
                return c;
            }
            return $$3;
        }
        return $$2;
    }

    private void a(@Nullable erj $$0, erj $$1) {
        int $$2 = $$0 == null ? 0 : $$0.b() + 1;
        int $$3 = $$1.b();
        for (int $$4 = $$2; $$4 <= $$3; ++$$4) {
            CompletableFuture<awk<eqf>> $$5 = this.h.get($$4);
            if ($$5 == null) continue;
            this.a($$4, $$5);
        }
    }

    private void a(int $$0, CompletableFuture<awk<eqf>> $$1) {
        if ($$1.complete(b) && !this.h.compareAndSet($$0, $$1, null)) {
            throw new IllegalStateException("Nothing else should replace the future here");
        }
    }

    private void a(erj $$0, eqf $$1) {
        awk<eqf> $$2 = awk.a($$1);
        int $$3 = $$0.b();
        while (true) {
            CompletableFuture<awk<eqf>> $$4;
            if (($$4 = this.h.get($$3)) == null) {
                if (!this.h.compareAndSet($$3, null, CompletableFuture.completedFuture($$2))) continue;
                return;
            }
            if ($$4.complete($$2)) {
                return;
            }
            if ($$4.getNow(e).a()) {
                throw new IllegalStateException("Trying to complete a future but found it to be completed successfully already");
            }
            Thread.yield();
        }
    }

    private @Nullable erj d(@Nullable erj $$0) {
        if ($$0 == null) {
            return null;
        }
        erj $$1 = $$0;
        erj $$2 = this.g.get();
        while ($$2 == null || $$1.b($$2)) {
            if (this.h.get($$1.b()) != null) {
                return $$1;
            }
            if ($$1 == erj.c) break;
            $$1 = $$1.c();
        }
        return null;
    }

    private boolean e(erj $$0) {
        erj $$1 = $$0 == erj.c ? null : $$0.c();
        erj $$2 = this.g.compareAndExchange($$1, $$0);
        if ($$2 == $$1) {
            return true;
        }
        if ($$2 == null || $$0.b($$2)) {
            throw new IllegalStateException("Unexpected last startedWork status: " + String.valueOf($$2) + " while trying to start: " + String.valueOf($$0));
        }
        return false;
    }

    private boolean f(erj $$0) {
        erj $$1 = this.f;
        return $$1 == null || $$0.b($$1);
    }

    protected abstract void b(CompletableFuture<?> var1);

    public void n() {
        if (this.j.getAndIncrement() == 0) {
            this.k = new CompletableFuture();
            this.b(this.k);
        }
    }

    public void o() {
        CompletableFuture<Void> $$0 = this.k;
        int $$1 = this.j.decrementAndGet();
        if ($$1 == 0) {
            $$0.complete(null);
        }
        if ($$1 < 0) {
            throw new IllegalStateException("More releases than claims. Count: " + $$1);
        }
    }

    public @Nullable eqf a(erj $$0) {
        CompletableFuture<awk<eqf>> $$1 = this.h.get($$0.b());
        return $$1 == null ? null : (eqf)$$1.getNow(e).b((eqf)null);
    }

    public @Nullable eqf b(erj $$0) {
        if (this.f($$0)) {
            return null;
        }
        return this.a($$0);
    }

    public @Nullable eqf p() {
        erj $$0 = this.g.get();
        if ($$0 == null) {
            return null;
        }
        eqf $$1 = this.a($$0);
        if ($$1 != null) {
            return $$1;
        }
        return this.a($$0.c());
    }

    public @Nullable erj q() {
        CompletableFuture<awk<eqf>> $$0 = this.h.get(erj.c.b());
        eqf $$1 = $$0 == null ? null : (eqf)$$0.getNow(e).b((eqf)null);
        return $$1 == null ? null : $$1.n();
    }

    public dvu r() {
        return this.d;
    }

    public awt s() {
        return awh.c(this.j());
    }

    public abstract int j();

    public abstract int k();

    @bht
    public List<Pair<erj, @Nullable CompletableFuture<awk<eqf>>>> t() {
        ArrayList<Pair<erj, CompletableFuture<awk<eqf>>>> $$0 = new ArrayList<Pair<erj, CompletableFuture<awk<eqf>>>>();
        for (int $$1 = 0; $$1 < a.size(); ++$$1) {
            $$0.add((Pair<erj, CompletableFuture<awk<eqf>>>)Pair.of((Object)a.get($$1), this.h.get($$1)));
        }
        return $$0;
    }

    @bht
    public @Nullable erj u() {
        erj $$0 = this.g.get();
        if ($$0 == null) {
            return null;
        }
        eqf $$1 = this.a($$0);
        if ($$1 != null) {
            return $$0;
        }
        return $$0.c();
    }
}

