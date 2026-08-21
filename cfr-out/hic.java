/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class hic {
    private final hig a;
    private final gjm b;
    private Set<bxe<?>> c = Set.of();
    private final Map<bxe<?>, c<?>> d = new HashMap();

    public hic(hig $$0, gjm $$1) {
        this.b = $$1;
        this.a = $$0;
    }

    private static void a(Set<bxe<?>> $$0, bxe<?> $$1, boolean $$2) {
        if ($$2) {
            $$0.add($$1);
        }
    }

    private Set<bxe<?>> c() {
        ReferenceOpenHashSet $$0 = new ReferenceOpenHashSet();
        hic.a($$0, bxo.a.a(), this.b.e());
        if (w.q) {
            hic.a($$0, bxf.b, w.S);
            hic.a($$0, bxf.h, w.S);
            hic.a($$0, bxf.c, w.Q);
            hic.a($$0, bxf.d, w.ag);
            hic.a($$0, bxf.g, w.av);
            hic.a($$0, bxf.f, w.A);
            hic.a($$0, bxf.p, w.G);
            hic.a($$0, bxf.n, w.G);
            hic.a($$0, bxf.e, w.O || w.S);
            hic.a($$0, bxf.o, w.D);
            hic.a($$0, bxf.i, w.R);
            hic.a($$0, bxf.l, w.T);
            hic.a($$0, bxf.j, w.E);
            hic.a($$0, bxf.m, w.F);
            hic.a($$0, bxf.k, w.P);
        }
        return $$0;
    }

    public void a() {
        this.c = Set.of();
        this.b();
    }

    public void a(long $$0) {
        Set<bxe<?>> $$12 = this.c();
        if (!$$12.equals(this.c)) {
            this.c = $$12;
            this.a($$12);
        }
        this.d.forEach(($$1, $$2) -> {
            if ($$1.c() != 0) {
                $$2.a($$0);
            }
        });
    }

    private void a(Set<bxe<?>> $$0) {
        this.d.keySet().retainAll($$0);
        this.b($$0);
        this.a.b(new aiv($$0));
    }

    private void b(Set<bxe<?>> $$02) {
        for (bxe<?> $$1 : $$02) {
            this.d.computeIfAbsent($$1, $$0 -> new c());
        }
    }

    <V> @Nullable c<V> a(bxe<V> $$0) {
        return this.d.get($$0);
    }

    private <K, V> @Nullable a<K, V> a(bxe<V> $$0, b<K, V> $$1) {
        c<V> $$2 = this.a($$0);
        return $$2 != null ? $$1.get($$2) : null;
    }

    <K, V> @Nullable V a(bxe<V> $$0, K $$1, b<K, V> $$2) {
        a<K, V> $$3 = this.a($$0, $$2);
        return $$3 != null ? (V)$$3.b($$1) : null;
    }

    public bxg a(final dwo $$0) {
        return new bxg(){

            @Override
            public <T> void a(bxe<T> $$02, BiConsumer<dvu, T> $$1) {
                hic.this.a($$02, hic.f(), $$1);
            }

            @Override
            public <T> @Nullable T a(bxe<T> $$02, dvu $$1) {
                return hic.this.a($$02, $$1, hic.f());
            }

            @Override
            public <T> void b(bxe<T> $$02, BiConsumer<is, T> $$1) {
                hic.this.a($$02, hic.e(), $$1);
            }

            @Override
            public <T> @Nullable T a(bxe<T> $$02, is $$1) {
                return hic.this.a($$02, $$1, hic.e());
            }

            @Override
            public <T> void c(bxe<T> $$02, BiConsumer<cgk, T> $$1) {
                hic.this.a($$02, hic.d(), ($$2, $$3) -> {
                    cgk $$4 = $$0.d((UUID)$$2);
                    if ($$4 != null) {
                        $$1.accept($$4, $$3);
                    }
                });
            }

            @Override
            public <T> @Nullable T a(bxe<T> $$02, cgk $$1) {
                return hic.this.a($$02, $$1.cY(), hic.d());
            }

            @Override
            public <T> void a(bxe<T> $$02, bxg.a<T> $$1) {
                c<T> $$2 = hic.this.a($$02);
                if ($$2 == null) {
                    return;
                }
                long $$3 = $$0.au();
                for (d $$4 : $$2.d) {
                    int $$5 = (int)($$4.b() - $$3);
                    int $$6 = $$02.c();
                    $$1.accept($$4.a(), $$5, $$6);
                }
            }
        };
    }

    public <T> void a(long $$0, dvu $$1, bxe.b<T> $$2) {
        this.a($$0, $$1, $$2, hic.f());
    }

    public <T> void a(long $$0, is $$1, bxe.b<T> $$2) {
        this.a($$0, $$1, $$2, hic.e());
    }

    public <T> void a(long $$0, cgk $$1, bxe.b<T> $$2) {
        this.a($$0, $$1.cY(), $$2, hic.d());
    }

    public <T> void a(long $$0, bxe.a<T> $$1) {
        c<T> $$2 = this.a($$1.a());
        if ($$2 != null) {
            $$2.d.add(new d<T>($$1.b(), $$0 + (long)$$1.a().c()));
        }
    }

    private <K, V> void a(long $$0, K $$1, bxe.b<V> $$2, b<K, V> $$3) {
        a<K, V> $$4 = this.a($$2.a(), $$3);
        if ($$4 != null) {
            $$4.a($$0, $$1, $$2);
        }
    }

    <K, V> void a(bxe<V> $$0, b<K, V> $$1, BiConsumer<K, V> $$2) {
        a<K, V> $$3 = this.a($$0, $$1);
        if ($$3 != null) {
            $$3.a($$2);
        }
    }

    public void b() {
        this.d.clear();
        this.b(this.c);
    }

    public void a(dvu $$0) {
        if (this.d.isEmpty()) {
            return;
        }
        for (c<?> $$1 : this.d.values()) {
            $$1.a($$0);
        }
    }

    public void a(cgk $$0) {
        if (this.d.isEmpty()) {
            return;
        }
        for (c<?> $$1 : this.d.values()) {
            $$1.c.a($$0.cY());
        }
    }

    static <T> b<UUID, T> d() {
        return $$0 -> $$0.c;
    }

    static <T> b<is, T> e() {
        return $$0 -> $$0.b;
    }

    static <T> b<dvu, T> f() {
        return $$0 -> $$0.a;
    }

    static class c<V> {
        final a<dvu, V> a = new a();
        final a<is, V> b = new a();
        final a<UUID, V> c = new a();
        final List<d<V>> d = new ArrayList<d<V>>();

        c() {
        }

        public void a(long $$0) {
            Predicate<d> $$12 = $$1 -> $$1.a($$0);
            this.a.a((dvu)((Object)$$12));
            this.b.a((is)((Object)$$12));
            this.c.a((UUID)((Object)$$12));
            this.d.removeIf($$12);
        }

        public void a(dvu $$0) {
            this.a.a($$0);
            this.b.b((is)((Object)((Predicate<is>)$$0::b)));
        }
    }

    @FunctionalInterface
    static interface b<K, V> {
        public a<K, V> get(c<V> var1);
    }

    static class a<K, V> {
        private final Map<K, d<V>> a = new HashMap<K, d<V>>();

        a() {
        }

        public void a(Predicate<d<V>> $$0) {
            this.a.values().removeIf($$0);
        }

        public void a(K $$0) {
            this.a.remove($$0);
        }

        public void b(Predicate<K> $$0) {
            this.a.keySet().removeIf($$0);
        }

        public @Nullable V b(K $$0) {
            d<V> $$1 = this.a.get($$0);
            return $$1 != null ? (V)$$1.a() : null;
        }

        public void a(long $$0, K $$1, bxe.b<V> $$2) {
            if ($$2.b().isPresent()) {
                this.a.put($$1, new d<V>($$2.b().get(), $$0 + (long)$$2.a().c()));
            } else {
                this.a.remove($$1);
            }
        }

        public void a(BiConsumer<K, V> $$0) {
            this.a.forEach(($$1, $$2) -> $$0.accept($$1, $$2.a()));
        }
    }

    record d<T>(T a, long b) {
        private static final long c = -1L;

        public boolean a(long $$0) {
            if (this.b == -1L) {
                return false;
            }
            return $$0 >= this.b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "value;expiresAfterTime", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "value;expiresAfterTime", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "value;expiresAfterTime", "a", "b"}, this, $$0);
        }
    }
}

