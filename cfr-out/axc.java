/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class axc
extends eqj {
    private static final Logger b = LogUtils.getLogger();
    private final aws c;
    private final axf d;
    final Thread e;
    final axj f;
    private final a g;
    public final awj a;
    private final fnc h;
    private final dxl i;
    private long j;
    private boolean k = true;
    private static final int l = 4;
    private final long[] m = new long[4];
    private final @Nullable erj[] n = new erj[4];
    private final @Nullable eqf[] o = new eqf[4];
    private final List<eqq> p = new ObjectArrayList();
    private final Set<awg> q = new ReferenceOpenHashSet();
    @bht
    private @Nullable dwz.d r;

    public axc(axf $$0, fni.c $$1, DataFixer $$2, fjr $$3, Executor $$4, eqg $$5, int $$6, int $$7, boolean $$8, eso $$9, Supplier<fnc> $$10) {
        this.d = $$0;
        this.g = new a($$0);
        this.e = Thread.currentThread();
        Path $$11 = $$1.a($$0.aq()).resolve("data");
        try {
            bfp.c($$11);
        }
        catch (IOException $$12) {
            b.error("Failed to create dimension data storage directory", (Throwable)$$12);
        }
        this.h = new fnc($$11, $$2, $$0.J_());
        this.i = this.h.a(dxl.b);
        this.a = new awj($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, this.i, $$6, $$8);
        this.f = this.a.d();
        this.c = this.a.i();
        this.c.b($$7);
        this.t();
    }

    public axj a() {
        return this.f;
    }

    private @Nullable awg b(long $$0) {
        return this.a.b($$0);
    }

    private void a(long $$0, @Nullable eqf $$1, erj $$2) {
        for (int $$3 = 3; $$3 > 0; --$$3) {
            this.m[$$3] = this.m[$$3 - 1];
            this.n[$$3] = this.n[$$3 - 1];
            this.o[$$3] = this.o[$$3 - 1];
        }
        this.m[0] = $$0;
        this.n[0] = $$2;
        this.o[0] = $$1;
    }

    @Override
    public @Nullable eqf a(int $$0, int $$1, erj $$2, boolean $$3) {
        if (Thread.currentThread() != this.e) {
            return CompletableFuture.supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
        }
        bzm $$4 = bzl.a();
        $$4.f("getChunk");
        long $$5 = dvu.d($$0, $$1);
        for (int $$6 = 0; $$6 < 4; ++$$6) {
            eqf $$7;
            if ($$5 != this.m[$$6] || $$2 != this.n[$$6] || ($$7 = this.o[$$6]) == null && $$3) continue;
            return $$7;
        }
        $$4.f("getChunkCacheMiss");
        CompletableFuture<awk<eqf>> $$8 = this.c($$0, $$1, $$2, $$3);
        this.g.b($$8::isDone);
        awk<eqf> $$9 = $$8.join();
        eqf $$10 = $$9.b((eqf)null);
        if ($$10 == null && $$3) {
            throw bhs.b(new IllegalStateException("Chunk not there when requested: " + $$9.b()));
        }
        this.a($$5, $$10, $$2);
        return $$10;
    }

    @Override
    public @Nullable eqq a(int $$0, int $$1) {
        if (Thread.currentThread() != this.e) {
            return null;
        }
        bzl.a().f("getChunkNow");
        long $$2 = dvu.d($$0, $$1);
        for (int $$3 = 0; $$3 < 4; ++$$3) {
            if ($$2 != this.m[$$3] || this.n[$$3] != erj.n) continue;
            eqf $$4 = this.o[$$3];
            return $$4 instanceof eqq ? (eqq)$$4 : null;
        }
        awg $$5 = this.b($$2);
        if ($$5 == null) {
            return null;
        }
        eqf $$6 = $$5.b(erj.n);
        if ($$6 != null) {
            this.a($$2, $$6, erj.n);
            if ($$6 instanceof eqq) {
                return (eqq)$$6;
            }
        }
        return null;
    }

    private void t() {
        Arrays.fill(this.m, dvu.c);
        Arrays.fill(this.n, null);
        Arrays.fill(this.o, null);
    }

    public CompletableFuture<awk<eqf>> b(int $$02, int $$1, erj $$2, boolean $$3) {
        CompletionStage $$6;
        boolean $$4;
        boolean bl2 = $$4 = Thread.currentThread() == this.e;
        if ($$4) {
            CompletableFuture<awk<eqf>> $$5 = this.c($$02, $$1, $$2, $$3);
            this.g.b($$5::isDone);
        } else {
            $$6 = CompletableFuture.supplyAsync(() -> this.c($$02, $$1, $$2, $$3), this.g).thenCompose($$0 -> $$0);
        }
        return $$6;
    }

    private CompletableFuture<awk<eqf>> c(int $$0, int $$1, erj $$2, boolean $$3) {
        dvu $$4 = new dvu($$0, $$1);
        long $$5 = $$4.b();
        int $$6 = awh.a($$2);
        awg $$7 = this.b($$5);
        if ($$3) {
            this.a(new axl(axm.o, $$6), $$4);
            if (this.a($$7, $$6)) {
                bzm $$8 = bzl.a();
                $$8.a("chunkLoad");
                this.d();
                $$7 = this.b($$5);
                $$8.c();
                if (this.a($$7, $$6)) {
                    throw bhs.b(new IllegalStateException("No chunk holder after ticket has been added"));
                }
            }
        }
        if (this.a($$7, $$6)) {
            return awv.c;
        }
        return $$7.a($$2, this.a);
    }

    private boolean a(@Nullable awg $$0, int $$1) {
        return $$0 == null || $$0.j() > $$1;
    }

    @Override
    public boolean b(int $$0, int $$1) {
        int $$3;
        awg $$2 = this.b(new dvu($$0, $$1).b());
        return !this.a($$2, $$3 = awh.a(erj.n));
    }

    @Override
    public @Nullable eqs c(int $$0, int $$1) {
        long $$2 = dvu.d($$0, $$1);
        awg $$3 = this.b($$2);
        if ($$3 == null) {
            return null;
        }
        return $$3.a(erj.k.c());
    }

    public dwo b() {
        return this.d;
    }

    public boolean c() {
        return this.g.E();
    }

    boolean d() {
        boolean $$0 = this.c.a(this.a);
        boolean $$1 = this.a.f();
        this.a.g();
        if ($$0 || $$1) {
            this.t();
            return true;
        }
        return false;
    }

    public boolean a(long $$0) {
        if (!this.d.a($$0)) {
            return false;
        }
        awg $$1 = this.b($$0);
        if ($$1 == null) {
            return false;
        }
        return $$1.a().getNow(awg.a).a();
    }

    public void a(boolean $$0) {
        this.d();
        this.a.a($$0);
    }

    @Override
    public void close() throws IOException {
        this.a(true);
        this.h.close();
        this.f.close();
        this.a.close();
    }

    @Override
    public void a(BooleanSupplier $$0, boolean $$1) {
        bzm $$2 = bzl.a();
        $$2.a("purge");
        if (this.d.y().i() || !$$1) {
            this.i.a(this.a);
        }
        this.d();
        $$2.b("chunks");
        if ($$1) {
            this.u();
            this.a.j();
        }
        $$2.b("unload");
        this.a.a($$0);
        $$2.c();
        this.t();
    }

    private void u() {
        long $$0 = this.d.au();
        long $$1 = $$0 - this.j;
        this.j = $$0;
        if (this.d.ar()) {
            return;
        }
        bzm $$2 = bzl.a();
        $$2.a("pollingChunks");
        if (this.d.y().i()) {
            $$2.a("tickingChunks");
            this.a($$2, $$1);
            $$2.c();
        }
        this.a($$2);
        $$2.c();
    }

    private void a(bzm $$0) {
        $$0.a("broadcast");
        for (awg $$1 : this.q) {
            eqq $$2 = $$1.d();
            if ($$2 == null) continue;
            $$1.a($$2);
        }
        this.q.clear();
        $$0.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(bzm $$0, long $$12) {
        List<cho> $$8;
        dwz.d $$3;
        $$0.a("naturalSpawnCount");
        int $$2 = this.c.a();
        this.r = $$3 = dwz.a($$2, this.d.H(), this::a, new dwx(this.a));
        boolean $$4 = this.d.U().a(eua.V);
        int $$5 = this.d.U().a(eua.O);
        if ($$4) {
            boolean $$6 = this.d.au() % 400L == 0L;
            List<cho> $$7 = dwz.a($$3, true, this.k, $$6);
        } else {
            $$8 = List.of();
        }
        List<eqq> $$9 = this.p;
        try {
            $$0.b("filteringSpawningChunks");
            this.a.a($$9);
            $$0.b("shuffleSpawningChunks");
            bhs.c($$9, this.d.y);
            $$0.b("tickSpawningChunks");
            for (eqq $$10 : $$9) {
                this.a($$10, $$12, $$8, $$3);
            }
        }
        finally {
            $$9.clear();
        }
        $$0.b("tickTickingChunks");
        this.a.a((eqq $$1) -> this.d.a((eqq)$$1, $$5));
        if ($$4) {
            $$0.b("customSpawners");
            this.d.a(this.k);
        }
        $$0.c();
    }

    private void a(eqq $$0, long $$1, List<cho> $$2, dwz.d $$3) {
        dvu $$4 = $$0.f();
        $$0.b($$1);
        if (this.c.c($$4.b())) {
            this.d.a($$0);
        }
        if ($$2.isEmpty()) {
            return;
        }
        if (this.d.c($$4)) {
            dwz.a(this.d, $$0, $$3, $$2);
        }
    }

    private void a(long $$0, Consumer<eqq> $$1) {
        awg $$2 = this.b($$0);
        if ($$2 != null) {
            $$2.c().getNow(awg.a).a($$1);
        }
    }

    @Override
    public String e() {
        return Integer.toString(this.j());
    }

    @VisibleForTesting
    public int f() {
        return this.g.bL();
    }

    public eqg g() {
        return this.a.a();
    }

    public eqh h() {
        return this.a.b();
    }

    public eve i() {
        return this.a.c();
    }

    @Override
    public int j() {
        return this.a.h();
    }

    public void a(is $$0) {
        int $$2;
        int $$1 = jw.a($$0.u());
        awg $$3 = this.b(dvu.d($$1, $$2 = jw.a($$0.w())));
        if ($$3 != null && $$3.a($$0)) {
            this.q.add($$3);
        }
    }

    @Override
    public void a(dww $$0, jw $$1) {
        this.g.execute(() -> {
            awg $$2 = this.b($$1.r().b());
            if ($$2 != null && $$2.a($$0, $$1.b())) {
                this.q.add($$2);
            }
        });
    }

    public boolean k() {
        return this.i.d();
    }

    public void a(axl $$0, dvu $$1) {
        this.i.a($$0, $$1);
    }

    public CompletableFuture<?> a(axm $$02, dvu $$1, int $$2) {
        if (!$$02.b()) {
            throw new IllegalStateException("Ticket type " + String.valueOf($$02) + " does not trigger chunk loading");
        }
        if ($$02.e()) {
            throw new IllegalStateException("Ticket type " + String.valueOf($$02) + " can expire before it loads, cannot fetch asynchronously");
        }
        this.b($$02, $$1, $$2);
        this.d();
        awg $$3 = this.b($$1.b());
        Objects.requireNonNull($$3, "No chunk was scheduled for loading");
        return this.a.a($$3, $$2, (int $$0) -> erj.n);
    }

    public void b(axm $$0, dvu $$1, int $$2) {
        this.i.a($$0, $$1, $$2);
    }

    public void c(axm $$0, dvu $$1, int $$2) {
        this.i.b($$0, $$1, $$2);
    }

    @Override
    public boolean a(dvu $$0, boolean $$1) {
        return this.i.a($$0, $$1);
    }

    @Override
    public LongSet l() {
        return this.i.f();
    }

    public void a(axg $$0) {
        if (!$$0.eh()) {
            this.a.a($$0);
            if ($$0.o()) {
                this.d.j().b($$0);
            }
        }
    }

    public void a(cgk $$0) {
        this.a.b($$0);
    }

    public void b(cgk $$0) {
        this.a.a($$0);
    }

    public void a(cgk $$0, aay<? super adb> $$1) {
        this.a.b($$0, $$1);
    }

    public void b(cgk $$0, aay<? super adb> $$1) {
        this.a.a($$0, $$1);
    }

    public void a(int $$0) {
        this.a.a($$0);
    }

    public void b(int $$0) {
        this.c.b($$0);
    }

    @Override
    public void b(boolean $$0) {
        this.k = $$0;
    }

    public String a(dvu $$0) {
        return this.a.a($$0);
    }

    public fnc m() {
        return this.h;
    }

    public csx n() {
        return this.a.k();
    }

    public err o() {
        return this.a.m();
    }

    @bht
    public @Nullable dwz.d p() {
        return this.r;
    }

    public void q() {
        this.i.e();
    }

    public void a(awg $$0) {
        if ($$0.i()) {
            this.q.add($$0);
        }
    }

    @Override
    public /* synthetic */ fkq r() {
        return this.a();
    }

    @Override
    public /* synthetic */ dvt s() {
        return this.b();
    }

    final class a
    extends cbr<Runnable> {
        a(dwo $$0) {
            super("Chunk source main thread executor for " + String.valueOf($$0.aq().a()));
        }

        @Override
        public void b(BooleanSupplier $$0) {
            super.b(() -> MinecraftServer.B() && $$0.getAsBoolean());
        }

        @Override
        public Runnable f(Runnable $$0) {
            return $$0;
        }

        @Override
        protected boolean e(Runnable $$0) {
            return true;
        }

        @Override
        protected boolean av() {
            return true;
        }

        @Override
        protected Thread aw() {
            return axc.this.e;
        }

        @Override
        protected void d(Runnable $$0) {
            bzl.a().f("runTask");
            super.d($$0);
        }

        @Override
        protected boolean E() {
            if (axc.this.d()) {
                return true;
            }
            axc.this.f.b();
            return super.E();
        }
    }
}

