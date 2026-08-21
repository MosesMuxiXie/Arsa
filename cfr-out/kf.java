/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMaps
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterators;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.jspecify.annotations.Nullable;

public interface kf
extends Iterable<kk<?>>,
kd {
    public static final kf a = new kf(){

        @Override
        public <T> @Nullable T a(kh<? extends T> $$0) {
            return null;
        }

        @Override
        public Set<kh<?>> b() {
            return Set.of();
        }

        @Override
        public Iterator<kk<?>> iterator() {
            return Collections.emptyIterator();
        }
    };
    public static final Codec<kf> b = kf.b(kh.d);

    public static Codec<kf> a(Codec<kh<?>> $$0) {
        return kf.b(Codec.dispatchedMap($$0, kh::c));
    }

    public static Codec<kf> b(Codec<Map<kh<?>, Object>> $$02) {
        return $$02.flatComapMap(a::a, $$0 -> {
            int $$1 = $$0.d();
            if ($$1 == 0) {
                return DataResult.success((Object)Reference2ObjectMaps.emptyMap());
            }
            Reference2ObjectArrayMap $$2 = new Reference2ObjectArrayMap($$1);
            for (kk<?> $$3 : $$0) {
                if ($$3.a().d()) continue;
                $$2.put($$3.a(), $$3.b());
            }
            return DataResult.success((Object)$$2);
        });
    }

    public static kf a(final kf $$0, final kf $$1) {
        return new kf(){

            @Override
            public <T> @Nullable T a(kh<? extends T> $$02) {
                T $$12 = $$1.a($$02);
                if ($$12 != null) {
                    return $$12;
                }
                return $$0.a($$02);
            }

            @Override
            public Set<kh<?>> b() {
                return Sets.union($$0.b(), $$1.b());
            }
        };
    }

    public static a a() {
        return new a();
    }

    public Set<kh<?>> b();

    default public boolean c(kh<?> $$0) {
        return this.a($$0) != null;
    }

    @Override
    default public Iterator<kk<?>> iterator() {
        return Iterators.transform(this.b().iterator(), $$0 -> Objects.requireNonNull(this.b($$0)));
    }

    default public Stream<kk<?>> c() {
        return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.d(), 1345), false);
    }

    default public int d() {
        return this.b().size();
    }

    default public boolean e() {
        return this.d() == 0;
    }

    default public kf a(final Predicate<kh<?>> $$0) {
        return new kf(){

            @Override
            public <T> @Nullable T a(kh<? extends T> $$02) {
                return $$0.test($$02) ? (T)kf.this.a($$02) : null;
            }

            @Override
            public Set<kh<?>> b() {
                return Sets.filter(kf.this.b(), $$0::test);
            }
        };
    }

    public static class kf$a {
        private final Reference2ObjectMap<kh<?>, Object> a = new Reference2ObjectArrayMap();

        kf$a() {
        }

        public <T> kf$a a(kh<T> $$0, @Nullable T $$1) {
            this.b($$0, $$1);
            return this;
        }

        <T> void b(kh<T> $$0, @Nullable Object $$1) {
            if ($$1 != null) {
                this.a.put($$0, $$1);
            } else {
                this.a.remove($$0);
            }
        }

        public kf$a a(kf $$0) {
            for (kk<?> $$1 : $$0) {
                this.a.put($$1.a(), $$1.b());
            }
            return this;
        }

        public kf a() {
            return kf$a.a(this.a);
        }

        private static kf a(Map<kh<?>, Object> $$0) {
            if ($$0.isEmpty()) {
                return a;
            }
            if ($$0.size() < 8) {
                return new a((Reference2ObjectMap<kh<?>, Object>)new Reference2ObjectArrayMap($$0));
            }
            return new a((Reference2ObjectMap<kh<?>, Object>)new Reference2ObjectOpenHashMap($$0));
        }

        static final class a
        extends Record
        implements kf {
            private final Reference2ObjectMap<kh<?>, Object> c;

            a(Reference2ObjectMap<kh<?>, Object> $$0) {
                this.c = $$0;
            }

            @Override
            public <T> @Nullable T a(kh<? extends T> $$0) {
                return (T)this.c.get($$0);
            }

            @Override
            public boolean c(kh<?> $$0) {
                return this.c.containsKey($$0);
            }

            @Override
            public Set<kh<?>> b() {
                return this.c.keySet();
            }

            @Override
            public Iterator<kk<?>> iterator() {
                return Iterators.transform((Iterator)Reference2ObjectMaps.fastIterator(this.c), kk::a);
            }

            @Override
            public int d() {
                return this.c.size();
            }

            @Override
            public String toString() {
                return this.c.toString();
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "map", "c"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "map", "c"}, this, $$0);
            }

            public Reference2ObjectMap<kh<?>, Object> f() {
                return this.c;
            }
        }
    }
}

