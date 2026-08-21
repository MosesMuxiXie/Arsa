/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class cim<E extends chl> {
    static final Logger a = LogUtils.getLogger();
    private final Supplier<Codec<cim<E>>> b;
    private static final int c = 20;
    private final Map<cqw<?>, Optional<? extends cqv<?>>> d = Maps.newHashMap();
    private final Map<cse<? extends csd<? super E>>, csd<? super E>> e = Maps.newLinkedHashMap();
    private final Map<Integer, Map<dfl, Set<cje<? super E>>>> f = Maps.newTreeMap();
    private @Nullable cea<dfl> g;
    private final Map<dfl, Set<Pair<cqw<?>, cqx>>> h = Maps.newHashMap();
    private final Map<dfl, Set<cqw<?>>> i = Maps.newHashMap();
    private Set<dfl> j = Sets.newHashSet();
    private final Set<dfl> k = Sets.newHashSet();
    private dfl l = dfl.b;
    private long m = -9999L;

    public static <E extends chl> b<E> a(Collection<? extends cqw<?>> $$0, Collection<? extends cse<? extends csd<? super E>>> $$1) {
        return new b($$0, $$1);
    }

    public static <E extends chl> Codec<cim<E>> b(final Collection<? extends cqw<?>> $$0, final Collection<? extends cse<? extends csd<? super E>>> $$1) {
        final MutableObject $$2 = new MutableObject();
        $$2.setValue((Object)new MapCodec<cim<E>>(){

            public <T> Stream<T> keys(DynamicOps<T> $$02) {
                return $$0.stream().flatMap($$0 -> $$0.a().map($$1 -> mi.A.b((cqw<?>)$$0)).stream()).map($$1 -> $$02.createString($$1.toString()));
            }

            public <T> DataResult<cim<E>> decode(DynamicOps<T> $$02, MapLike<T> $$12) {
                MutableObject $$22 = new MutableObject((Object)DataResult.success((Object)ImmutableList.builder()));
                $$12.entries().forEach($$22 -> {
                    DataResult $$3 = mi.A.q().parse($$02, $$22.getFirst());
                    DataResult $$4 = $$3.flatMap($$2 -> this.a((cqw)$$2, $$02, (Object)$$22.getSecond()));
                    $$22.setValue((Object)((DataResult)$$22.get()).apply2(ImmutableList.Builder::add, $$4));
                });
                ImmutableList $$3 = ((DataResult)$$22.get()).resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)).map(ImmutableList.Builder::build).orElseGet(ImmutableList::of);
                return DataResult.success(new cim($$0, $$1, (ImmutableList<a<?>>)$$3, $$2));
            }

            private <T, U> DataResult<a<U>> a(cqw<U> $$02, DynamicOps<T> $$12, T $$22) {
                return $$02.a().map(DataResult::success).orElseGet(() -> DataResult.error(() -> "No codec for memory: " + String.valueOf($$02))).flatMap($$2 -> $$2.parse($$12, $$22)).map($$1 -> new a($$02, Optional.of($$1)));
            }

            public <T> RecordBuilder<T> a(cim<E> $$02, DynamicOps<T> $$12, RecordBuilder<T> $$22) {
                $$02.j().forEach($$2 -> $$2.a($$12, $$22));
                return $$22;
            }

            public /* synthetic */ RecordBuilder encode(Object object, DynamicOps dynamicOps, RecordBuilder recordBuilder) {
                return this.a((cim)object, dynamicOps, recordBuilder);
            }
        }.fieldOf("memories").codec());
        return (Codec)$$2.get();
    }

    public cim(Collection<? extends cqw<?>> $$0, Collection<? extends cse<? extends csd<? super E>>> $$1, ImmutableList<a<?>> $$2, Supplier<Codec<cim<E>>> $$3) {
        this.b = $$3;
        for (cqw<?> cqw2 : $$0) {
            this.d.put(cqw2, Optional.empty());
        }
        for (cse cse2 : $$1) {
            this.e.put(cse2, (csd<E>)cse2.a());
        }
        for (csd csd2 : this.e.values()) {
            for (cqw<?> $$7 : csd2.a()) {
                this.d.put($$7, Optional.empty());
            }
        }
        for (a a2 : $$2) {
            a2.a(this);
        }
    }

    public <T> DataResult<T> a(DynamicOps<T> $$0) {
        return this.b.get().encodeStart($$0, (Object)this);
    }

    Stream<a<?>> j() {
        return this.d.entrySet().stream().map($$0 -> cim$a.a((cqw)$$0.getKey(), (Optional)$$0.getValue()));
    }

    public boolean a(cqw<?> $$0) {
        return this.a($$0, cqx.a);
    }

    public void a() {
        this.d.keySet().forEach($$0 -> this.d.put((cqw<?>)$$0, Optional.empty()));
    }

    public <U> void b(cqw<U> $$0) {
        this.a($$0, Optional.empty());
    }

    public <U> void a(cqw<U> $$0, @Nullable U $$1) {
        this.a($$0, Optional.ofNullable($$1));
    }

    public <U> void a(cqw<U> $$0, U $$1, long $$2) {
        this.b($$0, Optional.of(cqv.a($$1, $$2)));
    }

    public <U> void a(cqw<U> $$0, Optional<? extends U> $$1) {
        this.b($$0, $$1.map(cqv::a));
    }

    <U> void b(cqw<U> $$0, Optional<? extends cqv<?>> $$1) {
        if (this.d.containsKey($$0)) {
            if ($$1.isPresent() && this.a($$1.get().c())) {
                this.b($$0);
            } else {
                this.d.put($$0, $$1);
            }
        }
    }

    public <U> Optional<U> c(cqw<U> $$0) {
        Optional<cqv<?>> $$1 = this.d.get($$0);
        if ($$1 == null) {
            throw new IllegalStateException("Unregistered memory fetched: " + String.valueOf($$0));
        }
        return $$1.map(cqv::c);
    }

    public <U> @Nullable Optional<U> d(cqw<U> $$0) {
        Optional<cqv<?>> $$1 = this.d.get($$0);
        if ($$1 == null) {
            return null;
        }
        return $$1.map(cqv::c);
    }

    public <U> long e(cqw<U> $$0) {
        Optional<cqv<?>> $$1 = this.d.get($$0);
        return $$1.map(cqv::b).orElse(0L);
    }

    @Deprecated
    @bht
    public Map<cqw<?>, Optional<? extends cqv<?>>> b() {
        return this.d;
    }

    public <U> boolean b(cqw<U> $$0, U $$12) {
        if (!this.a($$0)) {
            return false;
        }
        return this.c($$0).filter($$1 -> $$1.equals($$12)).isPresent();
    }

    public boolean a(cqw<?> $$0, cqx $$1) {
        Optional<cqv<?>> $$2 = this.d.get($$0);
        if ($$2 == null) {
            return false;
        }
        return $$1 == cqx.c || $$1 == cqx.a && $$2.isPresent() || $$1 == cqx.b && $$2.isEmpty();
    }

    public void a(cea<dfl> $$0) {
        this.g = $$0;
    }

    public void a(Set<dfl> $$0) {
        this.j = $$0;
    }

    @Deprecated
    @bht
    public Set<dfl> c() {
        return this.k;
    }

    @Deprecated
    @bht
    public List<cje<? super E>> d() {
        ObjectArrayList $$0 = new ObjectArrayList();
        for (Map<dfl, Set<cje<E>>> $$1 : this.f.values()) {
            for (Set<cje<E>> $$2 : $$1.values()) {
                for (cje<E> $$3 : $$2) {
                    if ($$3.a() != cjd.a.b) continue;
                    $$0.add($$3);
                }
            }
        }
        return $$0;
    }

    public void e() {
        this.d(this.l);
    }

    public Optional<dfl> f() {
        for (dfl $$0 : this.k) {
            if (this.j.contains($$0)) continue;
            return Optional.of($$0);
        }
        return Optional.empty();
    }

    public void a(dfl $$0) {
        if (this.f($$0)) {
            this.d($$0);
        } else {
            this.e();
        }
    }

    private void d(dfl $$0) {
        if (this.c($$0)) {
            return;
        }
        this.e($$0);
        this.k.clear();
        this.k.addAll(this.j);
        this.k.add($$0);
    }

    private void e(dfl $$0) {
        for (dfl $$1 : this.k) {
            Set<cqw<?>> $$2;
            if ($$1 == $$0 || ($$2 = this.i.get($$1)) == null) continue;
            for (cqw<?> $$3 : $$2) {
                this.b($$3);
            }
        }
    }

    public void a(cef $$0, long $$1, ftm $$2) {
        if ($$1 - this.m > 20L) {
            dfl $$3;
            this.m = $$1;
            dfl dfl2 = $$3 = this.g != null ? $$0.a(this.g, $$2) : dfl.b;
            if (!this.k.contains($$3)) {
                this.a($$3);
            }
        }
    }

    public void a(List<dfl> $$0) {
        for (dfl $$1 : $$0) {
            if (!this.f($$1)) continue;
            this.d($$1);
            break;
        }
    }

    public void b(dfl $$0) {
        this.l = $$0;
    }

    public void a(dfl $$0, int $$1, ImmutableList<? extends cje<? super E>> $$2) {
        this.a($$0, this.a($$1, $$2));
    }

    public void a(dfl $$0, int $$1, ImmutableList<? extends cje<? super E>> $$2, cqw<?> $$3) {
        ImmutableSet $$4 = ImmutableSet.of((Object)Pair.of($$3, (Object)((Object)cqx.a)));
        ImmutableSet $$5 = ImmutableSet.of($$3);
        this.a($$0, (ImmutableList<? extends Pair<Integer, ? extends cje<? super E>>>)this.a($$1, $$2), (Set<Pair<cqw<?>, cqx>>)$$4, (Set<cqw<?>>)$$5);
    }

    public void a(dfl $$0, ImmutableList<? extends Pair<Integer, ? extends cje<? super E>>> $$1) {
        this.a($$0, $$1, (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of(), Sets.newHashSet());
    }

    public void a(dfl $$0, int $$1, ImmutableList<? extends cje<? super E>> $$2, Set<Pair<cqw<?>, cqx>> $$3) {
        this.a($$0, this.a($$1, $$2), $$3);
    }

    public void a(dfl $$0, ImmutableList<? extends Pair<Integer, ? extends cje<? super E>>> $$1, Set<Pair<cqw<?>, cqx>> $$2) {
        this.a($$0, $$1, $$2, Sets.newHashSet());
    }

    public void a(dfl $$02, ImmutableList<? extends Pair<Integer, ? extends cje<? super E>>> $$1, Set<Pair<cqw<?>, cqx>> $$2, Set<cqw<?>> $$3) {
        this.h.put($$02, $$2);
        if (!$$3.isEmpty()) {
            this.i.put($$02, $$3);
        }
        for (Pair $$4 : $$1) {
            this.f.computeIfAbsent((Integer)$$4.getFirst(), $$0 -> Maps.newHashMap()).computeIfAbsent($$02, $$0 -> Sets.newLinkedHashSet()).add((cje)$$4.getSecond());
        }
    }

    @VisibleForTesting
    public void g() {
        this.f.clear();
    }

    public boolean c(dfl $$0) {
        return this.k.contains($$0);
    }

    public cim<E> h() {
        cim<E> $$0 = new cim<E>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);
        for (Map.Entry<cqw<?>, Optional<cqv<?>>> $$1 : this.d.entrySet()) {
            cqw<?> $$2 = $$1.getKey();
            if (!$$1.getValue().isPresent()) continue;
            $$0.d.put($$2, $$1.getValue());
        }
        return $$0;
    }

    public void a(axf $$0, E $$1) {
        this.k();
        this.c($$0, $$1);
        this.d($$0, $$1);
        this.e($$0, $$1);
    }

    private void c(axf $$0, E $$1) {
        for (csd<E> $$2 : this.e.values()) {
            $$2.b($$0, $$1);
        }
    }

    private void k() {
        for (Map.Entry<cqw<?>, Optional<cqv<?>>> $$0 : this.d.entrySet()) {
            if (!$$0.getValue().isPresent()) continue;
            cqv<?> $$1 = $$0.getValue().get();
            if ($$1.d()) {
                this.b($$0.getKey());
            }
            $$1.a();
        }
    }

    public void b(axf $$0, E $$1) {
        long $$2 = ((cgk)$$1).ao().au();
        for (cje<E> $$3 : this.d()) {
            $$3.g($$0, $$1, $$2);
        }
    }

    private void d(axf $$0, E $$1) {
        long $$2 = $$0.au();
        for (Map<dfl, Set<cje<E>>> $$3 : this.f.values()) {
            for (Map.Entry<dfl, Set<cje<E>>> $$4 : $$3.entrySet()) {
                dfl $$5 = $$4.getKey();
                if (!this.k.contains($$5)) continue;
                Set<cje<E>> $$6 = $$4.getValue();
                for (cje<E> $$7 : $$6) {
                    if ($$7.a() != cjd.a.a) continue;
                    $$7.e($$0, $$1, $$2);
                }
            }
        }
    }

    private void e(axf $$0, E $$1) {
        long $$2 = $$0.au();
        for (cje<E> $$3 : this.d()) {
            $$3.f($$0, $$1, $$2);
        }
    }

    private boolean f(dfl $$0) {
        if (!this.h.containsKey($$0)) {
            return false;
        }
        for (Pair<cqw<?>, cqx> $$1 : this.h.get($$0)) {
            cqx $$3;
            cqw $$2 = (cqw)$$1.getFirst();
            if (this.a($$2, $$3 = (cqx)((Object)$$1.getSecond()))) continue;
            return false;
        }
        return true;
    }

    private boolean a(Object $$0) {
        return $$0 instanceof Collection && ((Collection)$$0).isEmpty();
    }

    ImmutableList<? extends Pair<Integer, ? extends cje<? super E>>> a(int $$0, ImmutableList<? extends cje<? super E>> $$1) {
        int $$2 = $$0;
        ImmutableList.Builder $$3 = ImmutableList.builder();
        for (cje $$4 : $$1) {
            $$3.add((Object)Pair.of((Object)$$2++, (Object)$$4));
        }
        return $$3.build();
    }

    public boolean i() {
        return this.d.isEmpty() && this.e.isEmpty() && this.f.isEmpty();
    }

    public static final class b<E extends chl> {
        private final Collection<? extends cqw<?>> a;
        private final Collection<? extends cse<? extends csd<? super E>>> b;
        private final Codec<cim<E>> c;

        b(Collection<? extends cqw<?>> $$0, Collection<? extends cse<? extends csd<? super E>>> $$1) {
            this.a = $$0;
            this.b = $$1;
            this.c = cim.b($$0, $$1);
        }

        public cim<E> a(Dynamic<?> $$0) {
            return this.c.parse($$0).resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)).orElseGet(() -> new cim(this.a, this.b, ImmutableList.of(), () -> this.c));
        }
    }

    static final class a<U> {
        private final cqw<U> a;
        private final Optional<? extends cqv<U>> b;

        static <U> a<U> a(cqw<U> $$0, Optional<? extends cqv<?>> $$1) {
            return new a<U>($$0, $$1);
        }

        a(cqw<U> $$0, Optional<? extends cqv<U>> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        void a(cim<?> $$0) {
            $$0.b(this.a, this.b);
        }

        public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
            this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(mi.A.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
        }
    }
}

