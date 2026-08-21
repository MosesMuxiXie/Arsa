/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2LongMap
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class awj
extends esd
implements awg.b,
awu {
    private static final awk<List<eqf>> d = awk.a("Unloaded chunks found in range");
    private static final CompletableFuture<awk<List<eqf>>> e = CompletableFuture.completedFuture(d);
    private static final byte f = -1;
    private static final byte g = 0;
    private static final byte h = 1;
    private static final Logger i = LogUtils.getLogger();
    private static final int j = 200;
    private static final int k = 20;
    private static final int l = 10000;
    private static final int m = 128;
    public static final int a = 2;
    public static final int b = 32;
    public static final int c = awh.a(awt.d);
    private final Long2ObjectLinkedOpenHashMap<awg> n = new Long2ObjectLinkedOpenHashMap();
    private volatile Long2ObjectLinkedOpenHashMap<awg> o = this.n.clone();
    private final Long2ObjectLinkedOpenHashMap<awg> p = new Long2ObjectLinkedOpenHashMap();
    private final List<awf> q = new ArrayList<awf>();
    final axf r;
    private final axj s;
    private final cbr<Runnable> t;
    private final eve u;
    private final eqh v;
    private final dxl w;
    private final csx x;
    final LongSet y = new LongOpenHashSet();
    private boolean z;
    private final awl A;
    private final awl B;
    private final eso C;
    private final a D;
    private final String E;
    private final awy F = new awy();
    private final Int2ObjectMap<b> G = new Int2ObjectOpenHashMap();
    private final Long2ByteMap H = new Long2ByteOpenHashMap();
    private final Long2LongMap I = new Long2LongOpenHashMap();
    private final LongSet J = new LongLinkedOpenHashSet();
    private final Queue<Runnable> K = Queues.newConcurrentLinkedQueue();
    private final AtomicInteger L = new AtomicInteger();
    private int M;
    private final ero N;

    public awj(axf $$0, fni.c $$1, DataFixer $$2, fjr $$3, Executor $$4, cbr<Runnable> $$5, eqt $$6, eqg $$7, eso $$8, Supplier<fnc> $$9, dxl $$10, int $$11, boolean $$12) {
        super(new esa($$1.f(), $$0.aq(), "chunk"), $$1.a($$0.aq()).resolve("region"), $$2, $$12, bhz.d, ffj.a($$0.aq(), $$9, $$2));
        Path $$13 = $$1.a($$0.aq());
        this.E = $$13.getFileName().toString();
        this.r = $$0;
        jr $$14 = $$0.J_();
        long $$15 = $$0.J();
        if ($$7 instanceof eut) {
            eut $$16 = (eut)$$7;
            this.u = eve.a($$16.h().a(), $$14.f(mj.bm), $$15);
        } else {
            this.u = eve.a(euv.e(), $$14.f(mj.bm), $$15);
        }
        this.v = $$7.a($$14.f(mj.br), this.u, $$15);
        this.t = $$5;
        cbs $$17 = new cbs($$4, "worldgen");
        this.C = $$8;
        cbs $$18 = new cbs($$4, "light");
        this.A = new awl($$17, $$4);
        this.B = new awl($$18, $$4);
        this.s = new axj($$6, this, this.r.F_().e(), $$18, this.B);
        this.D = new a($$10, $$4, $$5);
        this.w = $$10;
        this.x = new csx(new esa($$1.f(), $$0.aq(), "poi"), $$13.resolve("poi"), $$2, $$12, $$14, $$0.s(), $$0);
        this.a($$11);
        this.N = new ero($$0, $$7, $$3, this.s, $$5, this::f);
    }

    private void f(dvu $$0) {
        this.J.add($$0.b());
    }

    protected eqg a() {
        return this.N.b();
    }

    protected eqh b() {
        return this.v;
    }

    protected eve c() {
        return this.u;
    }

    public boolean a(axg $$0, int $$1, int $$2) {
        return $$0.X().a($$1, $$2) && !$$0.g.h.a(dvu.d($$1, $$2));
    }

    private boolean b(axg $$0, int $$1, int $$2) {
        if (!this.a($$0, $$1, $$2)) {
            return false;
        }
        for (int $$3 = -1; $$3 <= 1; ++$$3) {
            for (int $$4 = -1; $$4 <= 1; ++$$4) {
                if ($$3 == 0 && $$4 == 0 || this.a($$0, $$1 + $$3, $$2 + $$4)) continue;
                return true;
            }
        }
        return false;
    }

    protected axj d() {
        return this.s;
    }

    public @Nullable awg a(long $$0) {
        return (awg)this.n.get($$0);
    }

    protected @Nullable awg b(long $$0) {
        return (awg)this.o.get($$0);
    }

    public @Nullable erj c(long $$0) {
        awg $$1 = this.b($$0);
        return $$1 != null ? $$1.u() : null;
    }

    protected IntSupplier d(long $$0) {
        return () -> {
            awg $$1 = this.b($$0);
            if ($$1 == null) {
                return awm.a - 1;
            }
            return Math.min($$1.k(), awm.a - 1);
        };
    }

    public String a(dvu $$0) {
        awg $$1 = this.b($$0.b());
        if ($$1 == null) {
            return "null";
        }
        String $$2 = $$1.j() + "\n";
        erj $$3 = $$1.u();
        eqf $$4 = $$1.p();
        if ($$3 != null) {
            $$2 = $$2 + "St: \u00a7" + $$3.b() + String.valueOf($$3) + "\u00a7r\n";
        }
        if ($$4 != null) {
            $$2 = $$2 + "Ch: \u00a7" + $$4.n().b() + String.valueOf($$4.n()) + "\u00a7r\n";
        }
        awt $$5 = $$1.s();
        $$2 = $$2 + String.valueOf('\u00a7') + $$5.ordinal() + String.valueOf((Object)$$5);
        return $$2 + "\u00a7r";
    }

    CompletableFuture<awk<List<eqf>>> a(awg $$02, int $$1, IntFunction<erj> $$2) {
        if ($$1 == 0) {
            erj $$3 = $$2.apply(0);
            return $$02.a($$3, this).thenApply($$0 -> $$0.a(List::of));
        }
        int $$4 = bgj.i($$1 * 2 + 1);
        ArrayList<CompletableFuture<awk<eqf>>> $$5 = new ArrayList<CompletableFuture<awk<eqf>>>($$4);
        dvu $$6 = $$02.r();
        for (int $$7 = -$$1; $$7 <= $$1; ++$$7) {
            for (int $$8 = -$$1; $$8 <= $$1; ++$$8) {
                int $$9 = Math.max(Math.abs($$8), Math.abs($$7));
                long $$10 = dvu.d($$6.h + $$8, $$6.i + $$7);
                awg $$11 = this.a($$10);
                if ($$11 == null) {
                    return e;
                }
                erj $$12 = $$2.apply($$9);
                $$5.add($$11.a($$12, this));
            }
        }
        return bhs.c($$5).thenApply($$0 -> {
            ArrayList<eqf> $$1 = new ArrayList<eqf>($$0.size());
            for (awk $$2 : $$0) {
                if ($$2 == null) {
                    throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
                }
                eqf $$3 = $$2.b(null);
                if ($$3 == null) {
                    return d;
                }
                $$1.add($$3);
            }
            return awk.a($$1);
        });
    }

    public v a(IllegalStateException $$0, String $$12) {
        StringBuilder $$2 = new StringBuilder();
        Consumer<awg> $$3 = $$1 -> $$1.t().forEach($$2 -> {
            erj $$3 = (erj)$$2.getFirst();
            CompletableFuture $$4 = (CompletableFuture)$$2.getSecond();
            if ($$4 != null && $$4.isDone() && $$4.join() == null) {
                $$2.append($$1.r()).append(" - status: ").append($$3).append(" future: ").append($$4).append(System.lineSeparator());
            }
        });
        $$2.append("Updating:").append(System.lineSeparator());
        this.n.values().forEach($$3);
        $$2.append("Visible:").append(System.lineSeparator());
        this.o.values().forEach($$3);
        m $$4 = m.a($$0, "Chunk loading");
        n $$5 = $$4.a("Chunk loading");
        $$5.a("Details", $$12);
        $$5.a("Futures", $$2);
        return new v($$4);
    }

    public CompletableFuture<awk<eqq>> a(awg $$03) {
        return this.a($$03, 2, (int $$0) -> erj.n).thenApply($$02 -> $$02.a((T $$0) -> (eqq)$$0.get($$0.size() / 2)));
    }

    @Nullable awg a(long $$0, int $$1, @Nullable awg $$2, int $$3) {
        if (!awh.f($$3) && !awh.f($$1)) {
            return $$2;
        }
        if ($$2 != null) {
            $$2.a($$1);
        }
        if ($$2 != null) {
            if (!awh.f($$1)) {
                this.y.add($$0);
            } else {
                this.y.remove($$0);
            }
        }
        if (awh.f($$1) && $$2 == null) {
            $$2 = (awg)this.p.remove($$0);
            if ($$2 != null) {
                $$2.a($$1);
            } else {
                $$2 = new awg(new dvu($$0), $$1, this.r, this.s, this::a, this);
            }
            this.n.put($$0, (Object)$$2);
            this.z = true;
        }
        return $$2;
    }

    private void a(dvu $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
        this.A.onLevelChange($$0, $$1, $$2, $$3);
        this.B.onLevelChange($$0, $$1, $$2, $$3);
    }

    @Override
    public void close() throws IOException {
        try {
            this.A.close();
            this.B.close();
            this.x.close();
        }
        finally {
            super.close();
        }
    }

    protected void a(boolean $$02) {
        if ($$02) {
            List<awg> $$12 = this.o.values().stream().filter(awg::l).peek(awg::m).toList();
            MutableBoolean $$2 = new MutableBoolean();
            do {
                $$2.setFalse();
                $$12.stream().map($$0 -> {
                    this.t.b($$0::h);
                    return $$0.p();
                }).filter($$0 -> $$0 instanceof eqp || $$0 instanceof eqq).filter(this::a).forEach($$1 -> $$2.setTrue());
            } while ($$2.isTrue());
            this.x.a();
            this.b(() -> true);
            this.b(true).join();
        } else {
            this.I.clear();
            long $$3 = bhs.c();
            for (awg $$4 : this.o.values()) {
                this.a($$4, $$3);
            }
        }
    }

    protected void a(BooleanSupplier $$0) {
        bzm $$1 = bzl.a();
        $$1.a("poi");
        this.x.a($$0);
        $$1.b("chunk_unload");
        if (!this.r.z()) {
            this.b($$0);
        }
        $$1.c();
    }

    public boolean e() {
        return this.s.M_() || !this.p.isEmpty() || !this.n.isEmpty() || this.x.b() || !this.y.isEmpty() || !this.K.isEmpty() || this.A.a() || this.B.a() || this.D.d();
    }

    private void b(BooleanSupplier $$0) {
        Runnable $$5;
        LongIterator $$1 = this.y.iterator();
        while ($$1.hasNext()) {
            long $$2 = $$1.nextLong();
            awg $$3 = (awg)this.n.get($$2);
            if ($$3 != null) {
                this.n.remove($$2);
                this.p.put($$2, (Object)$$3);
                this.z = true;
                this.a($$2, $$3);
            }
            $$1.remove();
        }
        for (int $$4 = Math.max(0, this.K.size() - 2000); ($$4 > 0 || $$0.getAsBoolean()) && ($$5 = this.K.poll()) != null; --$$4) {
            $$5.run();
        }
        this.c($$0);
    }

    private void c(BooleanSupplier $$0) {
        long $$1 = bhs.c();
        int $$2 = 0;
        LongIterator $$3 = this.J.iterator();
        while ($$2 < 20 && this.L.get() < 128 && $$0.getAsBoolean() && $$3.hasNext()) {
            eqf $$6;
            long $$4 = $$3.nextLong();
            awg $$5 = (awg)this.o.get($$4);
            eqf eqf2 = $$6 = $$5 != null ? $$5.p() : null;
            if ($$6 == null || !$$6.m()) {
                $$3.remove();
                continue;
            }
            if (!this.a($$5, $$1)) continue;
            ++$$2;
            $$3.remove();
        }
    }

    private void a(long $$0, awg $$12) {
        CompletableFuture<?> $$22 = $$12.g();
        ((CompletableFuture)$$22.thenRunAsync(() -> {
            CompletableFuture<?> $$3 = $$12.g();
            if ($$3 != $$22) {
                this.a($$0, $$12);
                return;
            }
            eqf $$4 = $$12.p();
            if (this.p.remove($$0, (Object)$$12) && $$4 != null) {
                if ($$4 instanceof eqq) {
                    eqq $$5 = (eqq)$$4;
                    $$5.b(false);
                }
                this.a($$4);
                if ($$4 instanceof eqq) {
                    eqq $$6 = (eqq)$$4;
                    this.r.b($$6);
                }
                this.s.a($$4.f());
                this.s.b();
                this.I.remove($$4.f().b());
            }
        }, this.K::add)).whenComplete(($$1, $$2) -> {
            if ($$2 != null) {
                i.error("Failed to save chunk {}", (Object)$$12.r(), $$2);
            }
        });
    }

    protected boolean f() {
        if (!this.z) {
            return false;
        }
        this.o = this.n.clone();
        this.z = false;
        return true;
    }

    private CompletableFuture<eqf> g(dvu $$02) {
        CompletionStage $$13 = this.k($$02).thenApplyAsync($$12 -> $$12.map($$1 -> {
            esc $$2 = esc.a((dwq)this.r, this.r.at(), $$1);
            if ($$2 == null) {
                i.error("Chunk file at {} is missing level data, skipping", (Object)$$02);
            }
            return $$2;
        }), bhs.h().a("parseChunk"));
        CompletableFuture<?> $$2 = this.x.a($$02);
        return ((CompletableFuture)((CompletableFuture)((CompletableFuture)$$13).thenCombine($$2, ($$0, $$1) -> $$0)).thenApplyAsync($$1 -> {
            bzl.a().f("chunkLoad");
            if ($$1.isPresent()) {
                erb $$2 = ((esc)$$1.get()).a(this.r, this.x, this.n(), $$02);
                this.a($$02, ((eqf)$$2).n().d());
                return $$2;
            }
            return this.h($$02);
        }, (Executor)this.t)).exceptionallyAsync($$1 -> this.a((Throwable)$$1, $$02), (Executor)this.t);
    }

    private eqf a(Throwable $$0, dvu $$1) {
        boolean $$7;
        Throwable throwable;
        Throwable $$3;
        if ($$0 instanceof CompletionException) {
            CompletionException $$2 = (CompletionException)$$0;
            v0 = $$2.getCause();
        } else {
            v0 = $$3 = $$0;
        }
        if ($$3 instanceof v) {
            v $$4 = (v)$$3;
            throwable = $$4.getCause();
        } else {
            throwable = $$3;
        }
        Throwable $$5 = throwable;
        boolean $$6 = $$5 instanceof Error;
        boolean bl2 = $$7 = $$5 instanceof IOException || $$5 instanceof vk;
        if (!$$6) {
            if (!$$7) {
                // empty if block
            }
        } else {
            m $$8 = m.a($$0, "Exception loading chunk");
            n $$9 = $$8.a("Chunk being loaded");
            $$9.a("pos", $$1);
            this.i($$1);
            throw new v($$8);
        }
        this.r.s().a($$5, this.n(), $$1);
        return this.h($$1);
    }

    private eqf h(dvu $$0) {
        this.i($$0);
        return new erb($$0, erf.a, this.r, this.r.at(), null);
    }

    private void i(dvu $$0) {
        this.H.put($$0.b(), (byte)-1);
    }

    private byte a(dvu $$0, ern $$1) {
        return this.H.put($$0.b(), $$1 == ern.a ? (byte)-1 : 1);
    }

    @Override
    public awv e(long $$0) {
        awg $$1 = (awg)this.n.get($$0);
        $$1.n();
        return $$1;
    }

    @Override
    public void a(awv $$0) {
        $$0.o();
    }

    @Override
    public CompletableFuture<eqf> a(awv $$0, erm $$1, bhe<awv> $$2) {
        dvu $$3 = $$0.r();
        if ($$1.a() == erj.c) {
            return this.g($$3);
        }
        try {
            awv $$4 = $$2.a($$3.h, $$3.i);
            eqf $$5 = $$4.a($$1.a().c());
            if ($$5 == null) {
                throw new IllegalStateException("Parent chunk missing");
            }
            return $$1.a(this.N, $$2, $$5);
        }
        catch (Exception $$6) {
            $$6.getStackTrace();
            m $$7 = m.a($$6, "Exception generating new chunk");
            n $$8 = $$7.a("Chunk to be generated");
            $$8.a("Status being generated", () -> $$1.a().f());
            $$8.a("Location", String.format(Locale.ROOT, "%d,%d", $$3.h, $$3.i));
            $$8.a("Position hash", dvu.d($$3.h, $$3.i));
            $$8.a("Generator", this.a());
            this.t.execute(() -> {
                throw new v($$7);
            });
            throw new v($$7);
        }
    }

    @Override
    public awf a(erj $$0, dvu $$1) {
        awf $$2 = awf.a((awu)this, $$0, $$1);
        this.q.add($$2);
        return $$2;
    }

    private void a(awf $$0) {
        awv $$1 = $$0.c();
        this.A.a(() -> {
            CompletableFuture<?> $$1 = $$0.a();
            if ($$1 == null) {
                return;
            }
            $$1.thenRun(() -> this.a($$0));
        }, $$1.r().b(), $$1::k);
    }

    @Override
    public void g() {
        this.q.forEach(this::a);
        this.q.clear();
    }

    public CompletableFuture<awk<eqq>> b(awg $$02) {
        CompletableFuture<awk<List<eqf>>> $$1 = this.a($$02, 1, (int $$0) -> erj.n);
        return $$1.thenApplyAsync($$12 -> $$12.a((T $$1) -> {
            eqq $$22 = (eqq)$$1.get($$1.size() / 2);
            $$22.a(this.r);
            this.r.c($$22);
            CompletableFuture<?> $$3 = $$02.f();
            if ($$3.isDone()) {
                this.a($$02, $$22);
            } else {
                $$3.thenAcceptAsync($$2 -> this.a($$02, $$22), (Executor)this.t);
            }
            return $$22;
        }), (Executor)this.t);
    }

    private void a(awg $$0, eqq $$1) {
        dvu $$2 = $$1.f();
        for (axg $$3 : this.F.a()) {
            if (!$$3.X().a($$2)) continue;
            awj.a($$3, $$1);
        }
        this.r.p().a($$0);
        this.r.W().a($$1);
    }

    public CompletableFuture<awk<eqq>> c(awg $$0) {
        return this.a($$0, 1, awh::b).thenApply($$02 -> $$02.a((T $$0) -> (eqq)$$0.get($$0.size() / 2)));
    }

    Stream<awg> a(erj $$0) {
        int $$12 = awh.a($$0);
        return this.o.values().stream().filter($$1 -> $$1.j() <= $$12);
    }

    private boolean a(awg $$0, long $$1) {
        if (!$$0.l() || !$$0.h()) {
            return false;
        }
        eqf $$2 = $$0.p();
        if ($$2 instanceof eqp || $$2 instanceof eqq) {
            if (!$$2.m()) {
                return false;
            }
            long $$3 = $$2.f().b();
            long $$4 = this.I.getOrDefault($$3, -1L);
            if ($$1 < $$4) {
                return false;
            }
            boolean $$5 = this.a($$2);
            $$0.m();
            if ($$5) {
                this.I.put($$3, $$1 + 10000L);
            }
            return $$5;
        }
        return false;
    }

    private boolean a(eqf $$0) {
        this.x.b($$0.f());
        if (!$$0.j()) {
            return false;
        }
        dvu $$12 = $$0.f();
        try {
            erj $$22 = $$0.n();
            if ($$22.d() != ern.b) {
                if (this.j($$12)) {
                    return false;
                }
                if ($$22 == erj.c && $$0.g().values().stream().noneMatch(ffw::b)) {
                    return false;
                }
            }
            bzl.a().f("chunkSave");
            this.L.incrementAndGet();
            esc $$3 = esc.a(this.r, $$0);
            CompletableFuture<uz> $$4 = CompletableFuture.supplyAsync($$3::a, bhs.h());
            this.a($$12, $$4::join).handle(($$1, $$2) -> {
                if ($$2 != null) {
                    this.r.s().b((Throwable)$$2, this.n(), $$12);
                }
                this.L.decrementAndGet();
                return null;
            });
            this.a($$12, $$22.d());
            return true;
        }
        catch (Exception $$5) {
            this.r.s().b($$5, this.n(), $$12);
            return false;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean j(dvu $$0) {
        void $$4;
        byte $$1 = this.H.get($$0.b());
        if ($$1 != 0) {
            return $$1 == 1;
        }
        try {
            uz $$2 = this.k($$0).join().orElse(null);
            if ($$2 == null) {
                this.i($$0);
                return false;
            }
        }
        catch (Exception $$3) {
            i.error("Failed to read chunk {}", (Object)$$0, (Object)$$3);
            this.i($$0);
            return false;
        }
        ern $$5 = esc.a((uz)$$4).d();
        return this.a($$0, $$5) == 1;
    }

    protected void a(int $$0) {
        int $$1 = bgj.a($$0, 2, 32);
        if ($$1 != this.M) {
            this.M = $$1;
            this.D.a(this.M);
            for (axg $$2 : this.F.a()) {
                this.e($$2);
            }
        }
    }

    int b(axg $$0) {
        return bgj.a($$0.H(), 2, this.M);
    }

    private void a(axg $$0, dvu $$1) {
        eqq $$2 = this.f($$1.b());
        if ($$2 != null) {
            awj.a($$0, $$2);
        }
    }

    private static void a(axg $$0, eqq $$1) {
        $$0.g.h.a($$1);
    }

    private static void b(axg $$0, dvu $$1) {
        $$0.g.h.a($$0, $$1);
    }

    public @Nullable eqq f(long $$0) {
        awg $$1 = this.b($$0);
        if ($$1 == null) {
            return null;
        }
        return $$1.e();
    }

    public int h() {
        return this.o.size();
    }

    public aws i() {
        return this.D;
    }

    void a(Writer $$02) throws IOException {
        bfd $$1 = bfd.a().a("x").a("z").a("level").a("in_memory").a("status").a("full_status").a("accessible_ready").a("ticking_ready").a("entity_ticking_ready").a("ticket").a("spawning").a("block_entity_count").a("ticking_ticket").a("ticking_level").a("block_ticks").a("fluid_ticks").a($$02);
        for (Long2ObjectMap.Entry $$2 : this.o.long2ObjectEntrySet()) {
            long $$3 = $$2.getLongKey();
            dvu $$4 = new dvu($$3);
            awg $$5 = (awg)$$2.getValue();
            Optional<eqf> $$6 = Optional.ofNullable($$5.p());
            Optional<Object> $$7 = $$6.flatMap($$0 -> $$0 instanceof eqq ? Optional.of((eqq)$$0) : Optional.empty());
            $$1.a($$4.h, $$4.i, $$5.j(), $$6.isPresent(), $$6.map(eqf::n).orElse(null), $$7.map(eqq::G).orElse(null), awj.a($$5.c()), awj.a($$5.a()), awj.a($$5.b()), this.w.b($$3, false), this.b($$4), $$7.map($$0 -> $$0.J().size()).orElse(0), this.w.b($$3, true), this.D.a($$3, true), $$7.map($$0 -> $$0.q().a()).orElse(0), $$7.map($$0 -> $$0.r().a()).orElse(0));
        }
    }

    private static String a(CompletableFuture<awk<eqq>> $$0) {
        try {
            awk $$1 = $$0.getNow(null);
            if ($$1 != null) {
                return $$1.a() ? "done" : "unloaded";
            }
            return "not completed";
        }
        catch (CompletionException $$2) {
            return "failed " + $$2.getCause().getMessage();
        }
        catch (CancellationException $$3) {
            return "cancelled";
        }
    }

    private CompletableFuture<Optional<uz>> k(dvu $$02) {
        return this.d($$02).thenApplyAsync($$0 -> $$0.map(this::a), bhs.h().a("upgradeChunk"));
    }

    private uz a(uz $$0) {
        return this.a($$0, -1, awj.a(this.r.aq(), this.a().c()));
    }

    public static uz a(amt<dwo> $$0, Optional<amt<MapCodec<? extends eqg>>> $$12) {
        uz $$2 = new uz();
        $$2.a("dimension", $$0.a().toString());
        $$12.ifPresent($$1 -> $$2.a("generator", $$1.a().toString()));
        return $$2;
    }

    void a(List<eqq> $$0) {
        LongIterator $$1 = this.D.b();
        while ($$1.hasNext()) {
            eqq $$3;
            awg $$2 = (awg)this.o.get($$1.nextLong());
            if ($$2 == null || ($$3 = $$2.d()) == null || !this.l($$2.r())) continue;
            $$0.add($$3);
        }
    }

    void a(Consumer<eqq> $$0) {
        this.D.a($$1 -> {
            awg $$2 = (awg)this.o.get($$1);
            if ($$2 == null) {
                return;
            }
            eqq $$3 = $$2.d();
            if ($$3 == null) {
                return;
            }
            $$0.accept($$3);
        });
    }

    boolean b(dvu $$0) {
        bhp $$1 = this.D.e($$0.b());
        if ($$1 == bhp.c) {
            return this.l($$0);
        }
        return $$1.b(true);
    }

    boolean a(is $$0, int $$1) {
        ftm $$2 = new ftm($$0);
        for (axg $$3 : this.F.a()) {
            if (!this.a($$3, $$2, $$1)) continue;
            return true;
        }
        return false;
    }

    private boolean l(dvu $$0) {
        for (axg $$1 : this.F.a()) {
            if (!this.c($$1, $$0)) continue;
            return true;
        }
        return false;
    }

    public List<axg> c(dvu $$0) {
        long $$1 = $$0.b();
        if (!this.D.e($$1).b(true)) {
            return List.of();
        }
        ImmutableList.Builder $$2 = ImmutableList.builder();
        for (axg $$3 : this.F.a()) {
            if (!this.c($$3, $$0)) continue;
            $$2.add((Object)$$3);
        }
        return $$2.build();
    }

    private boolean c(axg $$0, dvu $$1) {
        if ($$0.au()) {
            return false;
        }
        double $$2 = awj.a($$1, $$0.dI());
        return $$2 < 16384.0;
    }

    private boolean a(axg $$0, ftm $$1, int $$2) {
        if ($$0.au()) {
            return false;
        }
        double $$3 = $$0.dI().f($$1);
        return $$3 < (double)$$2;
    }

    private static double a(dvu $$0, ftm $$1) {
        double $$2 = jw.a($$0.h, 8);
        double $$3 = jw.a($$0.i, 8);
        double $$4 = $$2 - $$1.g;
        double $$5 = $$3 - $$1.i;
        return $$4 * $$4 + $$5 * $$5;
    }

    private boolean c(axg $$0) {
        return $$0.au() && this.r.U().a(eua.ab) == false;
    }

    void a(axg $$0, boolean $$1) {
        boolean $$2 = this.c($$0);
        boolean $$3 = this.F.d($$0);
        if ($$1) {
            this.F.a($$0, $$2);
            this.d($$0);
            if (!$$2) {
                this.D.a(jw.a($$0), $$0);
            }
            $$0.a(awo.a);
            this.e($$0);
        } else {
            jw $$4 = $$0.W();
            this.F.a($$0);
            if (!$$3) {
                this.D.b($$4, $$0);
            }
            this.a($$0, awo.a);
        }
    }

    private void d(axg $$0) {
        jw $$1 = jw.a($$0);
        $$0.a($$1);
    }

    public void a(axg $$0) {
        boolean $$6;
        for (b $$1 : this.G.values()) {
            if ($$1.c == $$0) {
                $$1.a(this.r.E());
                continue;
            }
            $$1.b($$0);
        }
        jw $$2 = $$0.W();
        jw $$3 = jw.a($$0);
        boolean $$4 = this.F.e($$0);
        boolean $$5 = this.c($$0);
        boolean bl2 = $$6 = $$2.s() != $$3.s();
        if ($$6 || $$4 != $$5) {
            this.d($$0);
            if (!$$4) {
                this.D.b($$2, $$0);
            }
            if (!$$5) {
                this.D.a($$3, $$0);
            }
            if (!$$4 && $$5) {
                this.F.b($$0);
            }
            if ($$4 && !$$5) {
                this.F.c($$0);
            }
            this.e($$0);
        }
    }

    private void e(axg $$0) {
        awo.a $$3;
        dvu $$1 = $$0.dM();
        int $$2 = this.b($$0);
        awo awo2 = $$0.X();
        if (awo2 instanceof awo.a && ($$3 = (awo.a)awo2).a().equals($$1) && $$3.b() == $$2) {
            return;
        }
        this.a($$0, awo.a($$1, $$2));
    }

    private void a(axg $$0, awo $$12) {
        if ($$0.A() != this.r) {
            return;
        }
        awo $$2 = $$0.X();
        if ($$12 instanceof awo.a) {
            awo.a $$4;
            awo.a $$3 = (awo.a)$$12;
            if (!($$2 instanceof awo.a) || !($$4 = (awo.a)$$2).a().equals($$3.a())) {
                $$0.g.b(new agk($$3.a().h, $$3.a().i));
            }
        }
        awo.a($$2, $$12, $$1 -> this.a($$0, (dvu)$$1), $$1 -> awj.b($$0, $$1));
        $$0.a($$12);
    }

    @Override
    public List<axg> a(dvu $$0, boolean $$1) {
        Set<axg> $$2 = this.F.a();
        ImmutableList.Builder $$3 = ImmutableList.builder();
        for (axg $$4 : $$2) {
            if ((!$$1 || !this.b($$4, $$0.h, $$0.i)) && ($$1 || !this.a($$4, $$0.h, $$0.i))) continue;
            $$3.add((Object)$$4);
        }
        return $$3.build();
    }

    protected void a(cgk $$0) {
        if ($$0 instanceof cyd) {
            return;
        }
        cgu<?> $$1 = $$0.ay();
        int $$2 = $$1.o() * 16;
        if ($$2 == 0) {
            return;
        }
        int $$3 = $$1.p();
        if (this.G.containsKey($$0.aA())) {
            throw bhs.b(new IllegalStateException("Entity is already tracked!"));
        }
        b $$4 = new b($$0, $$2, $$3, $$1.q());
        this.G.put($$0.aA(), (Object)$$4);
        $$4.a(this.r.E());
        if ($$0 instanceof axg) {
            axg $$5 = (axg)$$0;
            this.a($$5, true);
            for (b $$6 : this.G.values()) {
                if ($$6.c == $$5) continue;
                $$6.b($$5);
            }
        }
    }

    protected void b(cgk $$0) {
        b $$3;
        if ($$0 instanceof axg) {
            axg $$1 = (axg)$$0;
            this.a($$1, false);
            for (b $$2 : this.G.values()) {
                $$2.a($$1);
            }
        }
        if (($$3 = (b)this.G.remove($$0.aA())) != null) {
            $$3.a();
        }
    }

    protected void j() {
        for (axg $$0 : this.F.a()) {
            this.e($$0);
        }
        ArrayList $$1 = Lists.newArrayList();
        List<axg> $$2 = this.r.E();
        for (b $$3 : this.G.values()) {
            boolean $$6;
            jw $$4 = $$3.e;
            jw $$5 = jw.a($$3.c);
            boolean bl2 = $$6 = !Objects.equals($$4, $$5);
            if ($$6) {
                $$3.a($$2);
                cgk $$7 = $$3.c;
                if ($$7 instanceof axg) {
                    $$1.add((axg)$$7);
                }
                $$3.e = $$5;
            }
            if (!$$6 && !$$3.c.aF && !this.D.c($$5.r().b())) continue;
            $$3.b.a();
        }
        if (!$$1.isEmpty()) {
            for (b $$8 : this.G.values()) {
                $$8.a($$1);
            }
        }
    }

    public void a(cgk $$0, aay<? super adb> $$1) {
        b $$2 = (b)this.G.get($$0.aA());
        if ($$2 != null) {
            $$2.a($$1);
        }
    }

    public void a(cgk $$0, aay<? super adb> $$1, Predicate<axg> $$2) {
        b $$3 = (b)this.G.get($$0.aA());
        if ($$3 != null) {
            $$3.a($$1, $$2);
        }
    }

    protected void b(cgk $$0, aay<? super adb> $$1) {
        b $$2 = (b)this.G.get($$0.aA());
        if ($$2 != null) {
            $$2.b($$1);
        }
    }

    public boolean c(cgk $$0) {
        b $$1 = (b)this.G.get($$0.aA());
        if ($$1 != null) {
            return !$$1.f.isEmpty();
        }
        return false;
    }

    public void a(axg $$0, Consumer<cgk> $$1) {
        for (b $$2 : this.G.values()) {
            if (!$$2.f.contains($$0.g)) continue;
            $$1.accept($$2.c);
        }
    }

    public void b(List<eqf> $$02) {
        HashMap<axg, List> $$12 = new HashMap<axg, List>();
        for (eqf $$2 : $$02) {
            eqq $$6;
            dvu $$3 = $$2.f();
            if ($$2 instanceof eqq) {
                eqq $$4;
                eqq $$5 = $$4 = (eqq)$$2;
            } else {
                $$6 = this.r.d($$3.h, $$3.i);
            }
            for (axg $$7 : this.a($$3, false)) {
                $$12.computeIfAbsent($$7, $$0 -> new ArrayList()).add($$6);
            }
        }
        $$12.forEach(($$0, $$1) -> $$0.g.b(adq.a($$1)));
    }

    protected csx k() {
        return this.x;
    }

    public String l() {
        return this.E;
    }

    void a(dvu $$0, awt $$1) {
        this.C.onChunkStatusChange($$0, $$1);
    }

    public void a(dvu $$02, int $$1) {
        int $$2 = $$1 + 1;
        dvu.a($$02, $$2).forEach($$0 -> {
            awg $$1 = this.b($$0.b());
            if ($$1 != null) {
                $$1.a(this.s.a($$0.h, $$0.i));
            }
        });
    }

    public void b(Consumer<eqq> $$0) {
        for (awg $$1 : this.o.values()) {
            eqq $$2 = $$1.e();
            if ($$2 == null) continue;
            $$0.accept($$2);
        }
    }

    class a
    extends aws {
        protected a(dxl $$0, Executor $$1, Executor $$2) {
            super($$0, $$1, $$2);
        }

        @Override
        protected boolean a(long $$0) {
            return awj.this.y.contains($$0);
        }

        @Override
        protected @Nullable awg b(long $$0) {
            return awj.this.a($$0);
        }

        @Override
        protected @Nullable awg a(long $$0, int $$1, @Nullable awg $$2, int $$3) {
            return awj.this.a($$0, $$1, $$2, $$3);
        }
    }

    class b
    implements axd.a {
        final axd b;
        final cgk c;
        private final int d;
        jw e;
        final Set<ayl> f = Sets.newIdentityHashSet();

        public b(cgk $$0, int $$1, int $$2, boolean $$3) {
            this.b = new axd(awj.this.r, $$0, $$2, $$3, this);
            this.c = $$0;
            this.d = $$1;
            this.e = jw.a($$0);
        }

        public boolean equals(Object $$0) {
            if ($$0 instanceof b) {
                return ((b)$$0).c.aA() == this.c.aA();
            }
            return false;
        }

        public int hashCode() {
            return this.c.aA();
        }

        @Override
        public void a(aay<? super adb> $$0) {
            for (ayl $$1 : this.f) {
                $$1.b($$0);
            }
        }

        @Override
        public void b(aay<? super adb> $$0) {
            this.a($$0);
            cgk cgk2 = this.c;
            if (cgk2 instanceof axg) {
                axg $$1 = (axg)cgk2;
                $$1.g.b($$0);
            }
        }

        @Override
        public void a(aay<? super adb> $$0, Predicate<axg> $$1) {
            for (ayl $$2 : this.f) {
                if (!$$1.test($$2.p())) continue;
                $$2.b($$0);
            }
        }

        public void a() {
            for (ayl $$0 : this.f) {
                this.b.a($$0.p());
            }
        }

        public void a(axg $$0) {
            if (this.f.remove($$0.g)) {
                this.b.a($$0);
                if (this.f.isEmpty()) {
                    awj.this.r.W().b(this.c);
                }
            }
        }

        public void b(axg $$0) {
            boolean $$6;
            if ($$0 == this.c) {
                return;
            }
            ftm $$1 = $$0.dI().d(this.c.dI());
            int $$2 = awj.this.b($$0);
            double $$4 = $$1.g * $$1.g + $$1.i * $$1.i;
            double $$3 = Math.min(this.b(), $$2 * 16);
            double $$5 = $$3 * $$3;
            boolean bl2 = $$6 = $$4 <= $$5 && this.c.a($$0) && awj.this.a($$0, this.c.dM().h, this.c.dM().i);
            if ($$6) {
                if (this.f.add($$0.g)) {
                    this.b.b($$0);
                    if (this.f.size() == 1) {
                        awj.this.r.W().a(this.c);
                    }
                    awj.this.r.W().a($$0, this.c);
                }
            } else {
                this.a($$0);
            }
        }

        private int a(int $$0) {
            return awj.this.r.s().c($$0);
        }

        private int b() {
            int $$0 = this.d;
            for (cgk $$1 : this.c.dr()) {
                int $$2 = $$1.ay().o() * 16;
                if ($$2 <= $$0) continue;
                $$0 = $$2;
            }
            return this.a($$0);
        }

        public void a(List<axg> $$0) {
            for (axg $$1 : $$0) {
                this.b($$1);
            }
        }
    }
}

