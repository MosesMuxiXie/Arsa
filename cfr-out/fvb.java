/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2LongMap
 *  it.unimi.dsi.fastutil.longs.Long2LongMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2LongMaps
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet
 */
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongMaps;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class fvb<T>
implements fva<T> {
    private static final Comparator<fuz<?>> a = ($$0, $$1) -> fve.b.compare($$0.b(), $$1.b());
    private final LongPredicate b;
    private final Long2ObjectMap<fuz<T>> c = new Long2ObjectOpenHashMap();
    private final Long2LongMap d = (Long2LongMap)bhs.a(new Long2LongOpenHashMap(), (? super T $$0) -> $$0.defaultReturnValue(Long.MAX_VALUE));
    private final Queue<fuz<T>> e = new PriorityQueue(a);
    private final Queue<fve<T>> f = new ArrayDeque<fve<T>>();
    private final List<fve<T>> g = new ArrayList<fve<T>>();
    private final Set<fve<?>> h = new ObjectOpenCustomHashSet(fve.c);
    private final BiConsumer<fuz<T>, fve<T>> i = ($$0, $$1) -> {
        if ($$1.equals($$0.b())) {
            this.b((fve<T>)$$1);
        }
    };

    public fvb(LongPredicate $$02) {
        this.b = $$02;
    }

    public void a(dvu $$0, fuz<T> $$1) {
        long $$2 = $$0.b();
        this.c.put($$2, $$1);
        fve<T> $$3 = $$1.b();
        if ($$3 != null) {
            this.d.put($$2, $$3.c());
        }
        $$1.a(this.i);
    }

    public void a(dvu $$0) {
        long $$1 = $$0.b();
        fuz $$2 = (fuz)this.c.remove($$1);
        this.d.remove($$1);
        if ($$2 != null) {
            $$2.a(null);
        }
    }

    @Override
    public void a(fve<T> $$0) {
        long $$1 = dvu.a($$0.b());
        fuz $$2 = (fuz)this.c.get($$1);
        if ($$2 == null) {
            bhs.b("Trying to schedule tick in not loaded position " + String.valueOf($$0.b()));
            return;
        }
        $$2.a($$0);
    }

    public void a(long $$0, int $$1, BiConsumer<is, T> $$2) {
        bzm $$3 = bzl.a();
        $$3.a("collect");
        this.a($$0, $$1, $$3);
        $$3.b("run");
        $$3.a("ticksToRun", this.f.size());
        this.a($$2);
        $$3.b("cleanup");
        this.c();
        $$3.c();
    }

    private void a(long $$0, int $$1, bzm $$2) {
        this.a($$0);
        $$2.a("containersToTick", this.e.size());
        this.a($$0, $$1);
        this.b();
    }

    private void a(long $$0) {
        ObjectIterator $$1 = Long2LongMaps.fastIterator((Long2LongMap)this.d);
        while ($$1.hasNext()) {
            Long2LongMap.Entry $$2 = (Long2LongMap.Entry)$$1.next();
            long $$3 = $$2.getLongKey();
            long $$4 = $$2.getLongValue();
            if ($$4 > $$0) continue;
            fuz $$5 = (fuz)this.c.get($$3);
            if ($$5 == null) {
                $$1.remove();
                continue;
            }
            fve $$6 = $$5.b();
            if ($$6 == null) {
                $$1.remove();
                continue;
            }
            if ($$6.c() > $$0) {
                $$2.setValue($$6.c());
                continue;
            }
            if (!this.b.test($$3)) continue;
            $$1.remove();
            this.e.add($$5);
        }
    }

    private void a(long $$0, int $$1) {
        fuz<T> $$2;
        while (this.a($$1) && ($$2 = this.e.poll()) != null) {
            fve<T> $$3 = $$2.c();
            this.c($$3);
            this.a(this.e, $$2, $$0, $$1);
            fve<T> $$4 = $$2.b();
            if ($$4 == null) continue;
            if ($$4.c() <= $$0 && this.a($$1)) {
                this.e.add($$2);
                continue;
            }
            this.b($$4);
        }
    }

    private void b() {
        for (fuz fuz2 : this.e) {
            this.b(fuz2.b());
        }
    }

    private void b(fve<T> $$0) {
        this.d.put(dvu.a($$0.b()), $$0.c());
    }

    private void a(Queue<fuz<T>> $$0, fuz<T> $$1, long $$2, int $$3) {
        fve<T> $$6;
        fve<T> $$5;
        if (!this.a($$3)) {
            return;
        }
        fuz<T> $$4 = $$0.peek();
        fve<T> fve2 = $$5 = $$4 != null ? $$4.b() : null;
        while (this.a($$3) && ($$6 = $$1.b()) != null && $$6.c() <= $$2 && ($$5 == null || fve.b.compare($$6, $$5) <= 0)) {
            $$1.c();
            this.c($$6);
        }
    }

    private void c(fve<T> $$0) {
        this.f.add($$0);
    }

    private boolean a(int $$0) {
        return this.f.size() < $$0;
    }

    private void a(BiConsumer<is, T> $$0) {
        while (!this.f.isEmpty()) {
            fve<T> $$1 = this.f.poll();
            if (!this.h.isEmpty()) {
                this.h.remove($$1);
            }
            this.g.add($$1);
            $$0.accept($$1.b(), (is)$$1.a());
        }
    }

    private void c() {
        this.f.clear();
        this.e.clear();
        this.g.clear();
        this.h.clear();
    }

    @Override
    public boolean a(is $$0, T $$1) {
        fuz $$2 = (fuz)this.c.get(dvu.a($$0));
        return $$2 != null && $$2.a($$0, $$1);
    }

    @Override
    public boolean b(is $$0, T $$1) {
        this.d();
        return this.h.contains(fve.a($$1, $$0));
    }

    private void d() {
        if (this.h.isEmpty() && !this.f.isEmpty()) {
            this.h.addAll(this.f);
        }
    }

    private void a(ffg $$0, a<T> $$1) {
        int $$2 = jw.a((double)$$0.h());
        int $$3 = jw.a((double)$$0.j());
        int $$4 = jw.a((double)$$0.k());
        int $$5 = jw.a((double)$$0.m());
        for (int $$6 = $$2; $$6 <= $$4; ++$$6) {
            for (int $$7 = $$3; $$7 <= $$5; ++$$7) {
                long $$8 = dvu.d($$6, $$7);
                fuz $$9 = (fuz)this.c.get($$8);
                if ($$9 == null) continue;
                $$1.accept($$8, $$9);
            }
        }
    }

    public void a(ffg $$0) {
        Predicate<fve> $$12 = $$1 -> $$0.b($$1.b());
        this.a($$0, (long $$1, fuz<T> $$2) -> {
            fve $$3 = $$2.b();
            $$2.a($$12);
            fve $$4 = $$2.b();
            if ($$4 != $$3) {
                if ($$4 != null) {
                    this.b($$4);
                } else {
                    this.d.remove($$1);
                }
            }
        });
        this.g.removeIf($$12);
        this.f.removeIf($$12);
    }

    public void a(ffg $$0, jy $$1) {
        this.a(this, $$0, $$1);
    }

    public void a(fvb<T> $$0, ffg $$12, jy $$22) {
        ArrayList $$32 = new ArrayList();
        Predicate<fve> $$4 = $$1 -> $$12.b($$1.b());
        $$0.g.stream().filter($$4).forEach($$32::add);
        $$0.f.stream().filter($$4).forEach($$32::add);
        $$0.a($$12, (long $$2, fuz<T> $$3) -> $$3.d().filter($$4).forEach($$32::add));
        LongSummaryStatistics $$5 = $$32.stream().mapToLong(fve::e).summaryStatistics();
        long $$6 = $$5.getMin();
        long $$7 = $$5.getMax();
        $$32.forEach($$3 -> this.a(new fve($$3.a(), $$3.b().a($$22), $$3.c(), $$3.d(), $$3.e() - $$6 + $$7 + 1L)));
    }

    @Override
    public int a() {
        return this.c.values().stream().mapToInt(fvg::a).sum();
    }

    @FunctionalInterface
    static interface a<T> {
        public void accept(long var1, fuz<T> var3);
    }
}

