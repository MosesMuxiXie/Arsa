/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectFunction
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongAVLTreeSet
 *  it.unimi.dsi.fastutil.longs.LongBidirectionalIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.longs.LongSortedSet
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectFunction;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongBidirectionalIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSortedSet;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.Spliterators;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.jspecify.annotations.Nullable;

public class esu<T extends esp> {
    public static final int a = 2;
    public static final int b = 4;
    private final Class<T> c;
    private final Long2ObjectFunction<ete> d;
    private final Long2ObjectMap<est<T>> e = new Long2ObjectOpenHashMap();
    private final LongSortedSet f = new LongAVLTreeSet();

    public esu(Class<T> $$0, Long2ObjectFunction<ete> $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public void a(fth $$0, bem<est<T>> $$1) {
        int $$2 = jw.a($$0.a - 2.0);
        int $$3 = jw.a($$0.b - 4.0);
        int $$4 = jw.a($$0.c - 2.0);
        int $$5 = jw.a($$0.d + 2.0);
        int $$6 = jw.a($$0.e + 0.0);
        int $$7 = jw.a($$0.f + 2.0);
        for (int $$8 = $$2; $$8 <= $$5; ++$$8) {
            long $$9 = jw.b($$8, 0, 0);
            long $$10 = jw.b($$8, -1, -1);
            LongBidirectionalIterator $$11 = this.f.subSet($$9, $$10 + 1L).iterator();
            while ($$11.hasNext()) {
                est $$15;
                long $$12 = $$11.nextLong();
                int $$13 = jw.c($$12);
                int $$14 = jw.d($$12);
                if ($$13 < $$3 || $$13 > $$6 || $$14 < $$4 || $$14 > $$7 || ($$15 = (est)this.e.get($$12)) == null || $$15.a() || !$$15.c().b() || !$$1.accept($$15).a()) continue;
                return;
            }
        }
    }

    public LongStream a(long $$0) {
        int $$2;
        int $$1 = dvu.a($$0);
        LongSortedSet $$3 = this.a($$1, $$2 = dvu.b($$0));
        if ($$3.isEmpty()) {
            return LongStream.empty();
        }
        LongBidirectionalIterator $$4 = $$3.iterator();
        return StreamSupport.longStream(Spliterators.spliteratorUnknownSize((PrimitiveIterator.OfLong)$$4, 1301), false);
    }

    private LongSortedSet a(int $$0, int $$1) {
        long $$2 = jw.b($$0, 0, $$1);
        long $$3 = jw.b($$0, -1, $$1);
        return this.f.subSet($$2, $$3 + 1L);
    }

    public Stream<est<T>> b(long $$0) {
        return this.a($$0).mapToObj(arg_0 -> this.e.get(arg_0)).filter(Objects::nonNull);
    }

    private static long f(long $$0) {
        return dvu.d(jw.b($$0), jw.d($$0));
    }

    public est<T> c(long $$0) {
        return (est)this.e.computeIfAbsent($$0, this::g);
    }

    public @Nullable est<T> d(long $$0) {
        return (est)this.e.get($$0);
    }

    private est<T> g(long $$0) {
        long $$1 = esu.f($$0);
        ete $$2 = (ete)((Object)this.d.get($$1));
        this.f.add($$0);
        return new est<T>(this.c, $$2);
    }

    public LongSet a() {
        LongOpenHashSet $$0 = new LongOpenHashSet();
        this.e.keySet().forEach(arg_0 -> esu.a((LongSet)$$0, arg_0));
        return $$0;
    }

    public void b(fth $$0, bem<T> $$1) {
        this.a($$0, $$2 -> $$2.a($$0, $$1));
    }

    public <U extends T> void a(esw<T, U> $$0, fth $$1, bem<U> $$2) {
        this.a($$1, $$3 -> $$3.a($$0, $$1, $$2));
    }

    public void e(long $$0) {
        this.e.remove($$0);
        this.f.remove($$0);
    }

    @bht
    public int b() {
        return this.f.size();
    }

    private static /* synthetic */ void a(LongSet $$0, long $$1) {
        $$0.add(esu.f($$1));
    }
}

