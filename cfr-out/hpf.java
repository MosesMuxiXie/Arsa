/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import org.joml.Vector3d;
import org.joml.Vector3dc;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hpf {
    private static final Logger a = LogUtils.getLogger();
    private static final iz[] b = iz.values();
    private static final int c = 60;
    private static final int d = jw.a(60);
    private static final double e = Math.ceil(Math.sqrt(3.0) * 16.0);
    private boolean f = true;
    private @Nullable Future<?> g;
    private @Nullable hpr h;
    private final AtomicReference<@Nullable b> i = new AtomicReference();
    private final AtomicReference<@Nullable a> j = new AtomicReference();
    private final AtomicBoolean k = new AtomicBoolean(false);

    public void a(@Nullable hpr $$0) {
        if (this.g != null) {
            try {
                this.g.get();
                this.g = null;
            }
            catch (Exception $$1) {
                a.warn("Full update failed", (Throwable)$$1);
            }
        }
        this.h = $$0;
        if ($$0 != null) {
            this.i.set(new b($$0));
            this.a();
        } else {
            this.i.set(null);
        }
    }

    public void a() {
        this.f = true;
    }

    public void a(htx $$0, List<hts.a> $$1, List<hts.a> $$22) {
        this.i.get().a().b.a((hoo.d $$2, boolean $$3, int $$4, boolean $$5) -> {
            hts.a $$6 = $$2.a();
            if ($$6 != null) {
                $$1.add($$6);
                if ($$5) {
                    $$22.add($$6);
                }
            }
        }, $$0, 32);
    }

    public boolean b() {
        return this.k.compareAndSet(true, false);
    }

    public void a(dvu $$0) {
        a $$2;
        a $$1 = this.j.get();
        if ($$1 != null) {
            this.a($$1, $$0);
        }
        if (($$2 = this.i.get().b) != $$1) {
            this.a($$2, $$0);
        }
    }

    public void a(hts.a $$0) {
        a $$2;
        a $$1 = this.j.get();
        if ($$1 != null) {
            $$1.b.add($$0);
        }
        if (($$2 = this.i.get().b) != $$1) {
            $$2.b.add($$0);
        }
    }

    public void a(boolean $$0, ger $$1, htx $$2, List<hts.a> $$3, LongOpenHashSet $$4) {
        ftm $$5 = $$1.b();
        if (this.f && (this.g == null || this.g.isDone())) {
            this.a($$0, $$1, $$5, $$4);
        }
        this.a($$0, $$2, $$3, $$5, $$4);
    }

    private void a(boolean $$0, ger $$1, ftm $$2, LongOpenHashSet $$3) {
        this.f = false;
        LongOpenHashSet $$4 = $$3.clone();
        this.g = CompletableFuture.runAsync(() -> {
            b $$4 = new b(this.h);
            this.j.set($$4.b);
            ArrayDeque $$5 = Queues.newArrayDeque();
            this.a($$1, $$5);
            $$5.forEach($$1 -> $$0.a.a.a($$1.a, (d)$$1));
            this.a($$4.a, $$2, $$5, $$0, $$0 -> {}, $$4);
            this.i.set($$4);
            this.j.set(null);
            this.k.set(true);
        }, bhs.h());
    }

    private void a(boolean $$0, htx $$12, List<hts.a> $$2, ftm $$3, LongOpenHashSet $$4) {
        b $$5 = this.i.get();
        this.a($$5);
        if (!$$5.b.b.isEmpty()) {
            ArrayDeque $$6 = Queues.newArrayDeque();
            while (!$$5.b.b.isEmpty()) {
                hts.a $$7 = (hts.a)$$5.b.b.poll();
                d $$8 = $$5.a.a.a($$7);
                if ($$8 == null || $$8.a != $$7) continue;
                $$6.add($$8);
            }
            htx $$9 = hoh.a($$12);
            Consumer<hts.a> $$10 = $$1 -> {
                if ($$9.a($$1.c())) {
                    this.k.set(true);
                }
            };
            this.a($$5.a, $$3, $$6, $$0, $$10, $$4);
        }
    }

    private void a(b $$0) {
        LongIterator $$1 = $$0.b.a.iterator();
        while ($$1.hasNext()) {
            long $$2 = $$1.nextLong();
            List $$3 = (List)$$0.a.c.get($$2);
            if ($$3 == null || !((hts.a)$$3.get(0)).b()) continue;
            $$0.b.b.addAll($$3);
            $$0.a.c.remove($$2);
        }
        $$0.b.a.clear();
    }

    private void a(a $$0, dvu $$1) {
        $$0.a.add(dvu.d($$1.h - 1, $$1.i));
        $$0.a.add(dvu.d($$1.h, $$1.i - 1));
        $$0.a.add(dvu.d($$1.h + 1, $$1.i));
        $$0.a.add(dvu.d($$1.h, $$1.i + 1));
        $$0.a.add(dvu.d($$1.h - 1, $$1.i - 1));
        $$0.a.add(dvu.d($$1.h - 1, $$1.i + 1));
        $$0.a.add(dvu.d($$1.h + 1, $$1.i - 1));
        $$0.a.add(dvu.d($$1.h + 1, $$1.i + 1));
    }

    private void a(ger $$0, Queue<d> $$12) {
        is $$2 = $$0.d();
        long $$3 = jw.c($$2);
        int $$4 = jw.c($$3);
        hts.a $$5 = this.h.a($$3);
        if ($$5 == null) {
            dwq $$6 = this.h.c();
            boolean $$7 = $$4 < $$6.ay();
            int $$8 = $$7 ? $$6.ay() : $$6.az();
            int $$9 = this.h.b();
            ArrayList $$10 = Lists.newArrayList();
            int $$11 = jw.b($$3);
            int $$122 = jw.d($$3);
            for (int $$13 = -$$9; $$13 <= $$9; ++$$13) {
                for (int $$14 = -$$9; $$14 <= $$9; ++$$14) {
                    hts.a $$15 = this.h.a(jw.b($$13 + $$11, $$8, $$14 + $$122));
                    if ($$15 == null || !this.a($$3, $$15.g())) continue;
                    iz $$16 = $$7 ? iz.b : iz.a;
                    d $$17 = new d($$15, $$16, 0);
                    $$17.a($$17.d, $$16);
                    if ($$13 > 0) {
                        $$17.a($$17.d, iz.f);
                    } else if ($$13 < 0) {
                        $$17.a($$17.d, iz.e);
                    }
                    if ($$14 > 0) {
                        $$17.a($$17.d, iz.d);
                    } else if ($$14 < 0) {
                        $$17.a($$17.d, iz.c);
                    }
                    $$10.add($$17);
                }
            }
            $$10.sort(Comparator.comparingDouble($$1 -> $$2.j(jw.a($$1.a.g()).k())));
            $$12.addAll($$10);
        } else {
            $$12.add(new d($$5, null, 0));
        }
    }

    private void a(c $$02, ftm $$1, Queue<d> $$2, boolean $$3, Consumer<hts.a> $$4, LongOpenHashSet $$5) {
        jw $$6 = jw.a($$1);
        long $$7 = $$6.s();
        is $$8 = $$6.k();
        while (!$$2.isEmpty()) {
            long $$11;
            d $$9 = $$2.poll();
            hts.a $$10 = $$9.a;
            if (!$$5.contains($$9.a.g())) {
                if ($$02.b.a($$9.a)) {
                    $$4.accept($$9.a);
                }
            } else {
                $$9.a.c.compareAndSet(htl.a, htl.b);
            }
            boolean $$12 = Math.abs(jw.b($$11 = $$10.g()) - $$6.a()) > d || Math.abs(jw.c($$11) - $$6.b()) > d || Math.abs(jw.d($$11) - $$6.c()) > d;
            for (iz $$13 : b) {
                d $$29;
                hts.a $$14 = this.a($$7, $$10, $$13);
                if ($$14 == null || $$3 && $$9.a($$13.g())) continue;
                if ($$3 && $$9.a()) {
                    htr $$15 = $$10.d();
                    boolean $$16 = false;
                    for (int $$17 = 0; $$17 < b.length; ++$$17) {
                        if (!$$9.a($$17) || !$$15.a(b[$$17].g(), $$13)) continue;
                        $$16 = true;
                        break;
                    }
                    if (!$$16) continue;
                }
                if ($$3 && $$12) {
                    boolean $$22;
                    boolean $$21;
                    int $$18 = jw.c(jw.b($$11));
                    int $$19 = jw.c(jw.c($$11));
                    int $$20 = jw.c(jw.d($$11));
                    boolean bl2 = $$13.o() == iz.a.a ? $$8.u() > $$18 : ($$21 = $$8.u() < $$18);
                    boolean bl3 = $$13.o() == iz.a.b ? $$8.v() > $$19 : ($$22 = $$8.v() < $$19);
                    boolean $$23 = $$13.o() == iz.a.c ? $$8.w() > $$20 : $$8.w() < $$20;
                    Vector3d $$24 = new Vector3d((double)($$18 + ($$21 ? 16 : 0)), (double)($$19 + ($$22 ? 16 : 0)), (double)($$20 + ($$23 ? 16 : 0)));
                    Vector3d $$25 = new Vector3d($$1.g, $$1.h, $$1.i).sub((Vector3dc)$$24).normalize().mul(e);
                    boolean $$26 = true;
                    while ($$24.distanceSquared($$1.g, $$1.h, $$1.i) > 3600.0) {
                        $$24.add((Vector3dc)$$25);
                        dwq $$27 = this.h.c();
                        if ($$24.y > (double)$$27.aw() || $$24.y < (double)$$27.K_()) break;
                        hts.a $$28 = this.h.a(is.a($$24.x, $$24.y, $$24.z));
                        if ($$28 != null && $$02.a.a($$28) != null) continue;
                        $$26 = false;
                        break;
                    }
                    if (!$$26) continue;
                }
                if (($$29 = $$02.a.a($$14)) != null) {
                    $$29.b($$13);
                    continue;
                }
                d $$30 = new d($$14, $$13, $$9.b + 1);
                $$30.a($$9.d, $$13);
                if ($$14.b()) {
                    $$2.add($$30);
                    $$02.a.a($$14, $$30);
                    continue;
                }
                if (!this.a($$7, $$14.g())) continue;
                $$02.a.a($$14, $$30);
                long $$31 = jw.g($$14.g());
                ((List)$$02.c.computeIfAbsent($$31, $$0 -> new ArrayList())).add($$14);
            }
        }
    }

    private boolean a(long $$0, long $$1) {
        return awo.a(jw.b($$0), jw.d($$0), this.h.b(), jw.b($$1), jw.d($$1));
    }

    private @Nullable hts.a a(long $$0, hts.a $$1, iz $$2) {
        long $$3 = $$1.a($$2);
        if (!this.a($$0, $$3)) {
            return null;
        }
        if (bgj.a(jw.c($$0) - jw.c($$3)) > this.h.b()) {
            return null;
        }
        return this.h.a($$3);
    }

    @bht
    public @Nullable d b(hts.a $$0) {
        return this.i.get().a.a.a($$0);
    }

    public hoo c() {
        return this.i.get().a.b;
    }

    static final class b
    extends Record {
        final c a;
        final a b;

        b(hpr $$0) {
            this(new c($$0), new a());
        }

        private b(c $$0, a $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "storage;events", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "storage;events", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "storage;events", "a", "b"}, this, $$0);
        }

        public c a() {
            return this.a;
        }

        public a b() {
            return this.b;
        }
    }

    static class c {
        public final e a;
        public final hoo b;
        public final Long2ObjectMap<List<hts.a>> c;

        public c(hpr $$0) {
            this.a = new e($$0.f.length);
            this.b = new hoo($$0.d(), $$0.b(), $$0.c, $$0.b.K_());
            this.c = new Long2ObjectOpenHashMap();
        }
    }

    static final class a
    extends Record {
        final LongSet a;
        final BlockingQueue<hts.a> b;

        a() {
            this((LongSet)new LongOpenHashSet(), new LinkedBlockingQueue<hts.a>());
        }

        private a(LongSet $$0, BlockingQueue<hts.a> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "chunksWhichReceivedNeighbors;sectionsToPropagateFrom", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "chunksWhichReceivedNeighbors;sectionsToPropagateFrom", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "chunksWhichReceivedNeighbors;sectionsToPropagateFrom", "a", "b"}, this, $$0);
        }

        public LongSet a() {
            return this.a;
        }

        public BlockingQueue<hts.a> b() {
            return this.b;
        }
    }

    static class e {
        private final d[] a;

        e(int $$0) {
            this.a = new d[$$0];
        }

        public void a(hts.a $$0, d $$1) {
            this.a[$$0.b] = $$1;
        }

        public @Nullable d a(hts.a $$0) {
            int $$1 = $$0.b;
            if ($$1 < 0 || $$1 >= this.a.length) {
                return null;
            }
            return this.a[$$1];
        }
    }

    @bht
    public static class d {
        @bht
        protected final hts.a a;
        private byte c;
        byte d;
        @bht
        public final int b;

        d(hts.a $$0, @Nullable iz $$1, int $$2) {
            this.a = $$0;
            if ($$1 != null) {
                this.b($$1);
            }
            this.b = $$2;
        }

        void a(byte $$0, iz $$1) {
            this.d = (byte)(this.d | ($$0 | 1 << $$1.ordinal()));
        }

        boolean a(iz $$0) {
            return (this.d & 1 << $$0.ordinal()) > 0;
        }

        void b(iz $$0) {
            this.c = (byte)(this.c | (this.c | 1 << $$0.ordinal()));
        }

        @bht
        public boolean a(int $$0) {
            return (this.c & 1 << $$0) > 0;
        }

        boolean a() {
            return this.c != 0;
        }

        public int hashCode() {
            return Long.hashCode(this.a.g());
        }

        public boolean equals(Object $$0) {
            if (!($$0 instanceof d)) {
                return false;
            }
            d $$1 = (d)$$0;
            return this.a.g() == $$1.a.g();
        }
    }
}

