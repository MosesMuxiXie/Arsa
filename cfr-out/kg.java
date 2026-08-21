/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMaps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public final class kg {
    public static final kg a = new kg(Reference2ObjectMaps.emptyMap());
    public static final Codec<kg> b = Codec.dispatchedMap(kg$c.a, c::a).xmap($$0 -> {
        if ($$0.isEmpty()) {
            return a;
        }
        Reference2ObjectArrayMap $$1 = new Reference2ObjectArrayMap($$0.size());
        for (Map.Entry $$2 : $$0.entrySet()) {
            c $$3 = (c)$$2.getKey();
            if ($$3.c()) {
                $$1.put($$3.b(), Optional.empty());
                continue;
            }
            $$1.put($$3.b(), Optional.of($$2.getValue()));
        }
        return new kg((Reference2ObjectMap<kh<?>, Optional<?>>)$$1);
    }, $$0 -> {
        Reference2ObjectArrayMap $$1 = new Reference2ObjectArrayMap($$0.e.size());
        for (Map.Entry $$2 : Reference2ObjectMaps.fastIterable($$0.e)) {
            kh $$3 = (kh)$$2.getKey();
            if ($$3.d()) continue;
            Optional $$4 = (Optional)$$2.getValue();
            if ($$4.isPresent()) {
                $$1.put((Object)new c($$3, false), $$4.get());
                continue;
            }
            $$1.put((Object)new c($$3, true), (Object)bhr.a);
        }
        return $$1;
    });
    public static final aao<xq, kg> c = kg.a(new b(){

        public <T> aao<xq, T> apply(kh<T> $$0) {
            return $$0.f().a();
        }
    });
    public static final aao<xq, kg> d = kg.a(new b(){

        public <T> aao<xq, T> apply(kh<T> $$0) {
            aao $$1 = $$0.f().a();
            return $$1.a(aam.e(Integer.MAX_VALUE));
        }
    });
    private static final String f = "!";
    final Reference2ObjectMap<kh<?>, Optional<?>> e;

    private static aao<xq, kg> a(final b $$0) {
        return new aao<xq, kg>(){

            public kg a(xq $$02) {
                int $$1 = $$02.l();
                int $$2 = $$02.l();
                if ($$1 == 0 && $$2 == 0) {
                    return a;
                }
                int $$3 = $$1 + $$2;
                Reference2ObjectArrayMap $$4 = new Reference2ObjectArrayMap(Math.min($$3, 65536));
                for (int $$5 = 0; $$5 < $$1; ++$$5) {
                    kh $$6 = (kh)kh.b.decode($$02);
                    Object $$7 = $$0.apply($$6).decode($$02);
                    $$4.put((Object)$$6, Optional.of($$7));
                }
                for (int $$8 = 0; $$8 < $$2; ++$$8) {
                    kh $$9 = (kh)kh.b.decode($$02);
                    $$4.put((Object)$$9, Optional.empty());
                }
                return new kg((Reference2ObjectMap<kh<?>, Optional<?>>)$$4);
            }

            public void a(xq $$02, kg $$1) {
                if ($$1.d()) {
                    $$02.c(0);
                    $$02.c(0);
                    return;
                }
                int $$2 = 0;
                int $$3 = 0;
                for (Reference2ObjectMap.Entry $$4 : Reference2ObjectMaps.fastIterable($$1.e)) {
                    if (((Optional)$$4.getValue()).isPresent()) {
                        ++$$2;
                        continue;
                    }
                    ++$$3;
                }
                $$02.c($$2);
                $$02.c($$3);
                for (Reference2ObjectMap.Entry $$5 : Reference2ObjectMaps.fastIterable($$1.e)) {
                    Optional $$6 = (Optional)$$5.getValue();
                    if (!$$6.isPresent()) continue;
                    kh $$7 = (kh)$$5.getKey();
                    kh.b.encode($$02, $$7);
                    this.a($$02, $$7, $$6.get());
                }
                for (Reference2ObjectMap.Entry $$8 : Reference2ObjectMaps.fastIterable($$1.e)) {
                    if (!((Optional)$$8.getValue()).isEmpty()) continue;
                    kh $$9 = (kh)$$8.getKey();
                    kh.b.encode($$02, $$9);
                }
            }

            private <T> void a(xq $$02, kh<T> $$1, Object $$2) {
                $$0.apply($$1).encode($$02, $$2);
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((xq)((Object)object), (kg)object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((xq)((Object)object));
            }
        };
    }

    kg(Reference2ObjectMap<kh<?>, Optional<?>> $$0) {
        this.e = $$0;
    }

    public static a a() {
        return new a();
    }

    public <T> @Nullable Optional<? extends T> a(kh<? extends T> $$0) {
        return (Optional)this.e.get($$0);
    }

    public Set<Map.Entry<kh<?>, Optional<?>>> b() {
        return this.e.entrySet();
    }

    public int c() {
        return this.e.size();
    }

    public kg a(Predicate<kh<?>> $$0) {
        if (this.d()) {
            return a;
        }
        Reference2ObjectArrayMap $$1 = new Reference2ObjectArrayMap(this.e);
        $$1.keySet().removeIf($$0);
        if ($$1.isEmpty()) {
            return a;
        }
        return new kg((Reference2ObjectMap<kh<?>, Optional<?>>)$$1);
    }

    public boolean d() {
        return this.e.isEmpty();
    }

    public d e() {
        if (this.d()) {
            return kg$d.a;
        }
        kf.a $$0 = kf.a();
        Set $$1 = Sets.newIdentityHashSet();
        this.e.forEach(($$2, $$3) -> {
            if ($$3.isPresent()) {
                $$0.b($$2, $$3.get());
            } else {
                $$1.add($$2);
            }
        });
        return new d($$0.a(), $$1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof kg)) return false;
        kg $$1 = (kg)$$0;
        if (!this.e.equals($$1.e)) return false;
        return true;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        return kg.a(this.e);
    }

    static String a(Reference2ObjectMap<kh<?>, Optional<?>> $$0) {
        StringBuilder $$1 = new StringBuilder();
        $$1.append('{');
        boolean $$2 = true;
        for (Map.Entry $$3 : Reference2ObjectMaps.fastIterable($$0)) {
            if ($$2) {
                $$2 = false;
            } else {
                $$1.append(", ");
            }
            Optional $$4 = (Optional)$$3.getValue();
            if ($$4.isPresent()) {
                $$1.append($$3.getKey());
                $$1.append("=>");
                $$1.append($$4.get());
                continue;
            }
            $$1.append(f);
            $$1.append($$3.getKey());
        }
        $$1.append('}');
        return $$1.toString();
    }

    @FunctionalInterface
    static interface b {
        public <T> aao<? super xq, T> apply(kh<T> var1);
    }

    public static class a {
        private final Reference2ObjectMap<kh<?>, Optional<?>> a = new Reference2ObjectArrayMap();

        a() {
        }

        public <T> a a(kh<T> $$0, T $$1) {
            this.a.put($$0, Optional.of($$1));
            return this;
        }

        public <T> a a(kh<T> $$0) {
            this.a.put($$0, Optional.empty());
            return this;
        }

        public <T> a a(kk<T> $$0) {
            return this.a($$0.a(), $$0.b());
        }

        public kg a() {
            if (this.a.isEmpty()) {
                return a;
            }
            return new kg(this.a);
        }
    }

    public static final class d
    extends Record {
        private final kf b;
        private final Set<kh<?>> c;
        public static final d a = new d(kf.a, Set.of());

        public d(kf $$0, Set<kh<?>> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "added;removed", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "added;removed", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "added;removed", "b", "c"}, this, $$0);
        }

        public kf a() {
            return this.b;
        }

        public Set<kh<?>> b() {
            return this.c;
        }
    }

    record c(kh<?> b, boolean c) {
        public static final Codec<c> a = Codec.STRING.flatXmap($$0 -> {
            amo $$2;
            kh<?> $$3;
            boolean $$1 = $$0.startsWith(kg.f);
            if ($$1) {
                $$0 = $$0.substring(kg.f.length());
            }
            if (($$3 = mi.am.a($$2 = amo.c($$0))) == null) {
                return DataResult.error(() -> "No component with type: '" + String.valueOf($$2) + "'");
            }
            if ($$3.d()) {
                return DataResult.error(() -> "'" + String.valueOf($$2) + "' is not a persistent component");
            }
            return DataResult.success((Object)new c($$3, $$1));
        }, $$0 -> {
            kh<?> $$1 = $$0.b();
            amo $$2 = mi.am.b($$1);
            if ($$2 == null) {
                return DataResult.error(() -> "Unregistered component: " + String.valueOf($$1));
            }
            return DataResult.success((Object)($$0.c() ? kg.f + String.valueOf($$2) : $$2.toString()));
        });

        public Codec<?> a() {
            return this.c ? Codec.EMPTY.codec() : this.b.c();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "type;removed", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "type;removed", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "type;removed", "b", "c"}, this, $$0);
        }
    }
}

