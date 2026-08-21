/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class bfk {
    final LoadingCache<a<?, ?>, DataResult<?>> a;

    public bfk(int $$0) {
        this.a = CacheBuilder.newBuilder().maximumSize((long)$$0).concurrencyLevel(1).softValues().build(new CacheLoader<a<?, ?>, DataResult<?>>(this){

            public DataResult<?> a(a<?, ?> $$0) {
                return $$0.a();
            }

            public /* synthetic */ Object load(Object object) throws Exception {
                return this.a((a)object);
            }
        });
    }

    public <A> Codec<A> a(final Codec<A> $$0) {
        return new Codec<A>(){

            public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> $$02, T $$1) {
                return $$0.decode($$02, $$1);
            }

            public <T> DataResult<T> encode(A $$02, DynamicOps<T> $$1, T $$2) {
                return ((DataResult)bfk.this.a.getUnchecked(new a($$0, $$02, $$1))).map($$0 -> {
                    if ($$0 instanceof vz) {
                        vz $$1 = (vz)$$0;
                        return $$1.d();
                    }
                    return $$0;
                });
            }
        };
    }

    record a<A, T>(Codec<A> a, A b, DynamicOps<T> c) {
        private final Codec<A> a;
        private final A b;
        private final DynamicOps<T> c;

        public DataResult<T> a() {
            return this.a.encodeStart(this.c, this.b);
        }

        @Override
        public boolean equals(Object $$0) {
            if (this == $$0) {
                return true;
            }
            if ($$0 instanceof a) {
                a $$1 = (a)$$0;
                return this.a == $$1.a && this.b.equals($$1.b) && this.c.equals($$1.c);
            }
            return false;
        }

        @Override
        public int hashCode() {
            int $$0 = System.identityHashCode(this.a);
            $$0 = 31 * $$0 + this.b.hashCode();
            $$0 = 31 * $$0 + this.c.hashCode();
            return $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "codec;value;ops", "a", "b", "c"}, this);
        }

        public Codec<A> b() {
            return this.a;
        }

        public A c() {
            return this.b;
        }

        public DynamicOps<T> d() {
            return this.c;
        }
    }
}

