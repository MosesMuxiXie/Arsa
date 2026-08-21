/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Iterators
 *  com.mojang.serialization.Lifecycle
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  it.unimi.dsi.fastutil.objects.Reference2IntMap
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class jl<T>
implements jz<T> {
    private final amt<? extends jq<T>> b;
    private final ObjectList<jd.c<T>> c = new ObjectArrayList(256);
    private final Reference2IntMap<T> d = (Reference2IntMap)bhs.a(new Reference2IntOpenHashMap(), (? super T $$0) -> $$0.defaultReturnValue(-1));
    private final Map<amo, jd.c<T>> e = new HashMap<amo, jd.c<T>>();
    private final Map<amt<T>, jd.c<T>> f = new HashMap<amt<T>, jd.c<T>>();
    private final Map<T, jd.c<T>> g = new IdentityHashMap<T, jd.c<T>>();
    private final Map<amt<T>, jp> h = new IdentityHashMap<amt<T>, jp>();
    private Lifecycle i;
    private final Map<bef<T>, jh.c<T>> j = new IdentityHashMap<bef<T>, jh.c<T>>();
    a<T> k = a.a();
    private boolean l;
    private @Nullable Map<T, jd.c<T>> m;

    @Override
    public Stream<jh.c<T>> e() {
        return this.l();
    }

    public jl(amt<? extends jq<T>> $$0, Lifecycle $$1) {
        this($$0, $$1, false);
    }

    public jl(amt<? extends jq<T>> $$02, Lifecycle $$1, boolean $$2) {
        this.b = $$02;
        this.i = $$1;
        if ($$2) {
            this.m = new IdentityHashMap<T, jd.c<T>>();
        }
    }

    @Override
    public amt<? extends jq<T>> g() {
        return this.b;
    }

    public String toString() {
        return "Registry[" + String.valueOf(this.b) + " (" + String.valueOf(this.i) + ")]";
    }

    private void b() {
        if (this.l) {
            throw new IllegalStateException("Registry is already frozen");
        }
    }

    private void h(amt<T> $$0) {
        if (this.l) {
            throw new IllegalStateException("Registry is already frozen (trying to add key " + String.valueOf($$0) + ")");
        }
    }

    @Override
    public jd.c<T> a(amt<T> $$02, T $$1, jp $$2) {
        jd.c $$4;
        this.h($$02);
        Objects.requireNonNull($$02);
        Objects.requireNonNull($$1);
        if (this.e.containsKey($$02.a())) {
            throw bhs.b(new IllegalStateException("Adding duplicate key '" + String.valueOf($$02) + "' to registry"));
        }
        if (this.g.containsKey($$1)) {
            throw bhs.b(new IllegalStateException("Adding duplicate value '" + String.valueOf($$1) + "' to registry"));
        }
        if (this.m != null) {
            jd.c<amt<T>> $$3 = this.m.remove($$1);
            if ($$3 == null) {
                throw new AssertionError((Object)("Missing intrusive holder for " + String.valueOf($$02) + ":" + String.valueOf($$1)));
            }
            $$3.b($$02);
        } else {
            $$4 = this.f.computeIfAbsent($$02, $$0 -> jd.c.a(this, $$0));
        }
        this.f.put($$02, $$4);
        this.e.put($$02.a(), $$4);
        this.g.put($$1, $$4);
        int $$5 = this.c.size();
        this.c.add((Object)$$4);
        this.d.put($$1, $$5);
        this.h.put($$02, $$2);
        this.i = this.i.add($$2.b());
        return $$4;
    }

    @Override
    public @Nullable amo b(T $$0) {
        jd.c<T> $$1 = this.g.get($$0);
        return $$1 != null ? $$1.h().a() : null;
    }

    @Override
    public Optional<amt<T>> d(T $$0) {
        return Optional.ofNullable(this.g.get($$0)).map(jd.c::h);
    }

    @Override
    public int a(@Nullable T $$0) {
        return this.d.getInt($$0);
    }

    @Override
    public @Nullable T c(@Nullable amt<T> $$0) {
        return jl.a(this.f.get($$0));
    }

    @Override
    public @Nullable T a(int $$0) {
        if ($$0 < 0 || $$0 >= this.c.size()) {
            return null;
        }
        return ((jd.c)this.c.get($$0)).a();
    }

    @Override
    public Optional<jd.c<T>> c(int $$0) {
        if ($$0 < 0 || $$0 >= this.c.size()) {
            return Optional.empty();
        }
        return Optional.ofNullable((jd.c)this.c.get($$0));
    }

    @Override
    public Optional<jd.c<T>> c(amo $$0) {
        return Optional.ofNullable(this.e.get($$0));
    }

    @Override
    public Optional<jd.c<T>> a(amt<T> $$0) {
        return Optional.ofNullable(this.f.get($$0));
    }

    @Override
    public Optional<jd.c<T>> a() {
        return this.c.isEmpty() ? Optional.empty() : Optional.of((jd.c)this.c.getFirst());
    }

    @Override
    public jd<T> e(T $$0) {
        jd.c<T> $$1 = this.g.get($$0);
        return $$1 != null ? $$1 : jd.a($$0);
    }

    jd.c<T> i(amt<T> $$02) {
        return this.f.computeIfAbsent($$02, $$0 -> {
            if (this.m != null) {
                throw new IllegalStateException("This registry can't create new holders without value");
            }
            this.h((amt<T>)$$0);
            return jd.c.a(this, $$0);
        });
    }

    @Override
    public int d() {
        return this.f.size();
    }

    @Override
    public Optional<jp> d(amt<T> $$0) {
        return Optional.ofNullable(this.h.get($$0));
    }

    @Override
    public Lifecycle h() {
        return this.i;
    }

    @Override
    public Iterator<T> iterator() {
        return Iterators.transform((Iterator)this.c.iterator(), jd::a);
    }

    @Override
    public @Nullable T a(@Nullable amo $$0) {
        jd.c<T> $$1 = this.e.get($$0);
        return jl.a($$1);
    }

    private static <T> @Nullable T a(@Nullable jd.c<T> $$0) {
        return $$0 != null ? (T)$$0.a() : null;
    }

    @Override
    public Set<amo> i() {
        return Collections.unmodifiableSet(this.e.keySet());
    }

    @Override
    public Set<amt<T>> j() {
        return Collections.unmodifiableSet(this.f.keySet());
    }

    @Override
    public Set<Map.Entry<amt<T>, T>> k() {
        return Collections.unmodifiableSet(bhs.a(this.f, jd::a).entrySet());
    }

    @Override
    public Stream<jd.c<T>> c() {
        return this.c.stream();
    }

    @Override
    public Stream<jh.c<T>> l() {
        return this.k.c();
    }

    jh.c<T> d(bef<T> $$0) {
        return this.j.computeIfAbsent($$0, this::e);
    }

    @Override
    private jh.c<T> e(bef<T> $$0) {
        return new jh.c<T>(this, $$0);
    }

    @Override
    public boolean m() {
        return this.f.isEmpty();
    }

    @Override
    public Optional<jd.c<T>> a(bgr $$0) {
        return bhs.b(this.c, $$0);
    }

    @Override
    public boolean d(amo $$0) {
        return this.e.containsKey($$0);
    }

    @Override
    public boolean e(amt<T> $$0) {
        return this.f.containsKey($$0);
    }

    @Override
    public jq<T> n() {
        if (this.l) {
            return this;
        }
        this.l = true;
        this.g.forEach((? super K $$0, ? super V $$1) -> $$1.b($$0));
        List<amo> $$02 = this.f.entrySet().stream().filter($$0 -> !((jd.c)$$0.getValue()).b()).map($$0 -> ((amt)$$0.getKey()).a()).sorted().toList();
        if (!$$02.isEmpty()) {
            throw new IllegalStateException("Unbound values in registry " + String.valueOf(this.g()) + ": " + String.valueOf($$02));
        }
        if (this.m != null) {
            if (!this.m.isEmpty()) {
                throw new IllegalStateException("Some intrusive holders were not registered: " + String.valueOf(this.m.values()));
            }
            this.m = null;
        }
        if (this.k.b()) {
            throw new IllegalStateException("Tags already present before freezing");
        }
        List<amo> $$12 = this.j.entrySet().stream().filter($$0 -> !((jh.c)$$0.getValue()).c()).map($$0 -> ((bef)$$0.getKey()).b()).sorted().toList();
        if (!$$12.isEmpty()) {
            throw new IllegalStateException("Unbound tags in registry " + String.valueOf(this.g()) + ": " + String.valueOf($$12));
        }
        this.k = a.a(this.j);
        this.u();
        return this;
    }

    @Override
    public jd.c<T> f(T $$02) {
        if (this.m == null) {
            throw new IllegalStateException("This registry can't create intrusive holders");
        }
        this.b();
        return this.m.computeIfAbsent($$02, $$0 -> jd.c.a(this, $$0));
    }

    @Override
    public Optional<jh.c<T>> a(bef<T> $$0) {
        return this.k.a($$0);
    }

    private jd.c<T> a(bef<T> $$0, jd<T> $$1) {
        if (!$$1.a(this)) {
            throw new IllegalStateException("Can't create named set " + String.valueOf($$0) + " containing value " + String.valueOf($$1) + " from outside registry " + String.valueOf(this));
        }
        if ($$1 instanceof jd.c) {
            jd.c $$2 = (jd.c)$$1;
            return $$2;
        }
        throw new IllegalStateException("Found direct holder " + String.valueOf($$1) + " value in tag " + String.valueOf($$0));
    }

    @Override
    public void a(bef<T> $$0, List<jd<T>> $$1) {
        this.b();
        this.d($$0).b($$1);
    }

    void u() {
        IdentityHashMap<jd.c, List> $$0 = new IdentityHashMap<jd.c, List>();
        this.f.values().forEach($$1 -> $$0.put((jd.c)$$1, new ArrayList()));
        this.k.a((? super bef<T> $$1, ? super jh.c<T> $$2) -> {
            for (jd $$3 : $$2) {
                jd.c $$4 = this.a((bef<T>)$$1, $$3);
                ((List)$$0.get($$4)).add($$1);
            }
        });
        $$0.forEach(jd.c::a);
    }

    public void o() {
        this.b();
        this.j.values().forEach($$0 -> $$0.b(List.of()));
    }

    @Override
    public je<T> p() {
        this.b();
        return new je<T>(){

            @Override
            public Optional<jd.c<T>> a(amt<T> $$0) {
                return Optional.of(this.b($$0));
            }

            @Override
            public jd.c<T> b(amt<T> $$0) {
                return jl.this.i($$0);
            }

            @Override
            public Optional<jh.c<T>> a(bef<T> $$0) {
                return Optional.of(this.b($$0));
            }

            @Override
            public jh.c<T> b(bef<T> $$0) {
                return jl.this.d($$0);
            }
        };
    }

    @Override
    public jq.a<T> a(beg.c<T> $$0) {
        if (!this.l) {
            throw new IllegalStateException("Invalid method used for tag loading");
        }
        ImmutableMap.Builder $$1 = ImmutableMap.builder();
        final HashMap $$22 = new HashMap();
        $$0.b().forEach((? super K $$2, ? super V $$3) -> {
            jh.c<T> $$4 = this.j.get($$2);
            if ($$4 == null) {
                $$4 = this.e((bef<T>)$$2);
            }
            $$1.put($$2, $$4);
            $$22.put($$2, List.copyOf($$3));
        });
        final ImmutableMap $$32 = $$1.build();
        final jf.b.a $$4 = new jf.b.a<T>(){

            @Override
            public jf.b<T> a() {
                return jl.this;
            }

            @Override
            public Optional<jh.c<T>> a(bef<T> $$0) {
                return Optional.ofNullable((jh.c)$$32.get($$0));
            }

            @Override
            public Stream<jh.c<T>> e() {
                return $$32.values().stream();
            }
        };
        return new jq.a<T>(){

            @Override
            public amt<? extends jq<? extends T>> a() {
                return jl.this.g();
            }

            @Override
            public int b() {
                return $$22.size();
            }

            @Override
            public jf.b<T> c() {
                return $$4;
            }

            @Override
            public void d() {
                $$32.forEach(($$1, $$2) -> {
                    List $$3 = $$22.getOrDefault($$1, List.of());
                    $$2.b($$3);
                });
                jl.this.k = a.a($$32);
                jl.this.u();
            }
        };
    }

    static interface a<T> {
        public static <T> a<T> a() {
            return new a<T>(){

                @Override
                public boolean b() {
                    return false;
                }

                @Override
                public Optional<jh.c<T>> a(bef<T> $$0) {
                    throw new IllegalStateException("Tags not bound, trying to access " + String.valueOf($$0));
                }

                @Override
                public void a(BiConsumer<? super bef<T>, ? super jh.c<T>> $$0) {
                    throw new IllegalStateException("Tags not bound");
                }

                @Override
                public Stream<jh.c<T>> c() {
                    throw new IllegalStateException("Tags not bound");
                }
            };
        }

        public static <T> a<T> a(final Map<bef<T>, jh.c<T>> $$0) {
            return new a<T>(){

                @Override
                public boolean b() {
                    return true;
                }

                @Override
                public Optional<jh.c<T>> a(bef<T> $$02) {
                    return Optional.ofNullable((jh.c)$$0.get($$02));
                }

                @Override
                public void a(BiConsumer<? super bef<T>, ? super jh.c<T>> $$02) {
                    $$0.forEach($$02);
                }

                @Override
                public Stream<jh.c<T>> c() {
                    return $$0.values().stream();
                }
            };
        }

        public boolean b();

        public Optional<jh.c<T>> a(bef<T> var1);

        public void a(BiConsumer<? super bef<T>, ? super jh.c<T>> var1);

        public Stream<jh.c<T>> c();
    }
}

