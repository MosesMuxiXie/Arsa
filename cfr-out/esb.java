/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.OptionalDynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMaps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongListIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongListIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class esb<R, P>
implements AutoCloseable {
    static final Logger a = LogUtils.getLogger();
    private static final String b = "Sections";
    private final esd d;
    private final Long2ObjectMap<Optional<R>> e = new Long2ObjectOpenHashMap();
    private final LongLinkedOpenHashSet f = new LongLinkedOpenHashSet();
    private final Codec<P> g;
    private final Function<R, P> h;
    private final BiFunction<P, Runnable, R> i;
    private final Function<Runnable, R> j;
    private final jr k;
    private final erq l;
    protected final dwq c;
    private final LongSet m = new LongOpenHashSet();
    private final Long2ObjectMap<CompletableFuture<Optional<a<P>>>> n = new Long2ObjectOpenHashMap();
    private final Object o = new Object();

    public esb(esd $$0, Codec<P> $$1, Function<R, P> $$2, BiFunction<P, Runnable, R> $$3, Function<Runnable, R> $$4, jr $$5, erq $$6, dwq $$7) {
        this.d = $$0;
        this.g = $$1;
        this.h = $$2;
        this.i = $$3;
        this.j = $$4;
        this.k = $$5;
        this.l = $$6;
        this.c = $$7;
    }

    protected void a(BooleanSupplier $$0) {
        LongListIterator $$1 = this.f.iterator();
        while ($$1.hasNext() && $$0.getAsBoolean()) {
            dvu $$2 = new dvu($$1.nextLong());
            $$1.remove();
            this.e($$2);
        }
        this.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void c() {
        Object object = this.o;
        synchronized (object) {
            ObjectIterator $$0 = Long2ObjectMaps.fastIterator(this.n);
            while ($$0.hasNext()) {
                Long2ObjectMap.Entry $$1 = (Long2ObjectMap.Entry)$$0.next();
                Optional $$2 = ((CompletableFuture)$$1.getValue()).getNow(null);
                if ($$2 == null) continue;
                long $$3 = $$1.getLongKey();
                this.a(new dvu($$3), (a<P>)$$2.orElse(null));
                $$0.remove();
                this.m.add($$3);
            }
        }
    }

    public void a() {
        if (!this.f.isEmpty()) {
            this.f.forEach($$0 -> this.e(new dvu($$0)));
            this.f.clear();
        }
    }

    public boolean b() {
        return !this.f.isEmpty();
    }

    protected @Nullable Optional<R> c(long $$0) {
        return (Optional)this.e.get($$0);
    }

    protected Optional<R> d(long $$0) {
        if (this.e($$0)) {
            return Optional.empty();
        }
        Optional<R> $$1 = this.c($$0);
        if ($$1 != null) {
            return $$1;
        }
        this.c(jw.a($$0).r());
        $$1 = this.c($$0);
        if ($$1 == null) {
            throw bhs.b(new IllegalStateException());
        }
        return $$1;
    }

    protected boolean e(long $$0) {
        int $$1 = jw.c(jw.c($$0));
        return this.c.e($$1);
    }

    protected R f(long $$0) {
        if (this.e($$0)) {
            throw bhs.b(new IllegalArgumentException("sectionPos out of bounds"));
        }
        Optional<R> $$1 = this.d($$0);
        if ($$1.isPresent()) {
            return $$1.get();
        }
        R $$2 = this.j.apply(() -> this.a($$0));
        this.e.put($$0, Optional.of($$2));
        return $$2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public CompletableFuture<?> a(dvu $$0) {
        Object object = this.o;
        synchronized (object) {
            long $$12 = $$0.b();
            if (this.m.contains($$12)) {
                return CompletableFuture.completedFuture(null);
            }
            return (CompletableFuture)this.n.computeIfAbsent($$12, $$1 -> this.d($$0));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private void c(dvu $$0) {
        void $$3;
        long $$12 = $$0.b();
        Object object = this.o;
        synchronized (object) {
            if (!this.m.add($$12)) {
                return;
            }
            CompletableFuture $$2 = (CompletableFuture)this.n.computeIfAbsent($$12, $$1 -> this.d($$0));
        }
        this.a($$0, (a<P>)((Optional)$$3.join()).orElse(null));
        object = this.o;
        synchronized (object) {
            this.n.remove($$12);
        }
    }

    private CompletableFuture<Optional<a<P>>> d(dvu $$0) {
        ams<vz> $$13 = this.k.a(vn.a);
        return ((CompletableFuture)this.d.d($$0).thenApplyAsync($$12 -> $$12.map($$1 -> esb$a.a(this.g, $$13, $$1, this.d, this.c)), bhs.h().a("parseSection"))).exceptionally($$1 -> {
            if ($$1 instanceof CompletionException) {
                $$1 = $$1.getCause();
            }
            if ($$1 instanceof IOException) {
                IOException $$2 = (IOException)$$1;
                a.error("Error reading chunk {} data from disk", (Object)$$0, (Object)$$2);
                this.l.a($$2, this.d.n(), $$0);
                return Optional.empty();
            }
            throw new CompletionException((Throwable)$$1);
        });
    }

    private void a(dvu $$0, @Nullable a<P> $$12) {
        if ($$12 == null) {
            for (int $$22 = this.c.ay(); $$22 <= this.c.az(); ++$$22) {
                this.e.put(esb.a($$0, $$22), Optional.empty());
            }
        } else {
            boolean $$3 = $$12.b();
            for (int $$4 = this.c.ay(); $$4 <= this.c.az(); ++$$4) {
                long $$5 = esb.a($$0, $$4);
                Optional<Object> $$6 = Optional.ofNullable($$12.a.get($$4)).map($$1 -> this.i.apply($$1, () -> this.a($$5)));
                this.e.put($$5, $$6);
                $$6.ifPresent($$2 -> {
                    this.b($$5);
                    if ($$3) {
                        this.a($$5);
                    }
                });
            }
        }
    }

    private void e(dvu $$0) {
        ams<vz> $$12 = this.k.a(vn.a);
        Dynamic<vz> $$2 = this.a($$0, $$12);
        vz $$3 = (vz)$$2.getValue();
        if ($$3 instanceof uz) {
            uz $$4 = (uz)$$3;
            this.d.a($$0, $$4).exceptionally($$1 -> {
                this.l.b((Throwable)$$1, this.d.n(), $$0);
                return null;
            });
        } else {
            a.error("Expected compound tag, got {}", (Object)$$3);
        }
    }

    private <T> Dynamic<T> a(dvu $$0, DynamicOps<T> $$1) {
        HashMap $$2 = Maps.newHashMap();
        for (int $$32 = this.c.ay(); $$32 <= this.c.az(); ++$$32) {
            long $$4 = esb.a($$0, $$32);
            Optional $$5 = (Optional)this.e.get($$4);
            if ($$5 == null || $$5.isEmpty()) continue;
            DataResult $$6 = this.g.encodeStart($$1, this.h.apply($$5.get()));
            String $$7 = Integer.toString($$32);
            $$6.resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)).ifPresent($$3 -> $$2.put($$1.createString($$7), $$3));
        }
        return new Dynamic($$1, $$1.createMap((Map)ImmutableMap.of((Object)$$1.createString(b), (Object)$$1.createMap((Map)$$2), (Object)$$1.createString("DataVersion"), (Object)$$1.createInt(w.b().a().b()))));
    }

    private static long a(dvu $$0, int $$1) {
        return jw.b($$0.h, $$1, $$0.i);
    }

    protected void b(long $$0) {
    }

    protected void a(long $$0) {
        Optional $$1 = (Optional)this.e.get($$0);
        if ($$1 == null || $$1.isEmpty()) {
            a.warn("No data for position: {}", (Object)jw.a($$0));
            return;
        }
        this.f.add(dvu.d(jw.b($$0), jw.d($$0)));
    }

    public void b(dvu $$0) {
        if (this.f.remove($$0.b())) {
            this.e($$0);
        }
    }

    @Override
    public void close() throws IOException {
        this.d.close();
    }

    static final class a<T>
    extends Record {
        final Int2ObjectMap<T> a;
        private final boolean b;

        private a(Int2ObjectMap<T> $$0, boolean $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public static <T> a<T> a(Codec<T> $$0, DynamicOps<vz> $$12, vz $$2, esd $$3, dwq $$4) {
            Dynamic $$5 = new Dynamic($$12, (Object)$$2);
            Dynamic<vz> $$6 = $$3.a((Dynamic<vz>)$$5, 1945);
            boolean $$7 = $$5 != $$6;
            OptionalDynamic $$8 = $$6.get(esb.b);
            Int2ObjectOpenHashMap $$9 = new Int2ObjectOpenHashMap();
            for (int $$10 = $$4.ay(); $$10 <= $$4.az(); ++$$10) {
                Optional $$11 = $$8.get(Integer.toString($$10)).result().flatMap($$1 -> $$0.parse($$1).resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)));
                if (!$$11.isPresent()) continue;
                $$9.put($$10, $$11.get());
            }
            return new a<T>($$9, $$7);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "sectionsByY;versionChanged", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "sectionsByY;versionChanged", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "sectionsByY;versionChanged", "a", "b"}, this, $$0);
        }

        public Int2ObjectMap<T> a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }
}

