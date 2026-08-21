/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class cln<U>
implements Iterable<U> {
    protected final List<a<U>> a;
    private final bgr b = bgr.a();

    public cln() {
        this.a = Lists.newArrayList();
    }

    private cln(List<a<U>> $$0) {
        this.a = Lists.newArrayList($$0);
    }

    public static <U> Codec<cln<U>> a(Codec<U> $$02) {
        return cln$a.a($$02).listOf().xmap(cln::new, $$0 -> $$0.a);
    }

    public cln<U> a(U $$0, int $$1) {
        this.a.add(new a<U>($$0, $$1));
        return this;
    }

    public cln<U> a() {
        this.a.forEach($$0 -> $$0.a(this.b.i()));
        this.a.sort(Comparator.comparingDouble(a::c));
        return this;
    }

    public Stream<U> b() {
        return this.a.stream().map(a::a);
    }

    @Override
    public Iterator<U> iterator() {
        return Iterators.transform(this.a.iterator(), a::a);
    }

    public String toString() {
        return "ShufflingList[" + String.valueOf(this.a) + "]";
    }

    public static class a<T> {
        final T a;
        final int b;
        private double c;

        a(T $$0, int $$1) {
            this.b = $$1;
            this.a = $$0;
        }

        private double c() {
            return this.c;
        }

        void a(float $$0) {
            this.c = -Math.pow($$0, 1.0f / (float)this.b);
        }

        public T a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public String toString() {
            return this.b + ":" + String.valueOf(this.a);
        }

        public static <E> Codec<a<E>> a(final Codec<E> $$0) {
            return new Codec<a<E>>(){

                public <T> DataResult<Pair<a<E>, T>> decode(DynamicOps<T> $$02, T $$12) {
                    Dynamic $$2 = new Dynamic($$02, $$12);
                    return $$2.get("data").flatMap(arg_0 -> ((Codec)$$0).parse(arg_0)).map($$1 -> new a<Object>($$1, $$2.get("weight").asInt(1))).map($$1 -> Pair.of((Object)$$1, (Object)$$02.empty()));
                }

                public <T> DataResult<T> a(a<E> $$02, DynamicOps<T> $$1, T $$2) {
                    return $$1.mapBuilder().add("weight", $$1.createInt($$02.b)).add("data", $$0.encodeStart($$1, $$02.a)).build($$2);
                }

                public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
                    return this.a((a)object, dynamicOps, object2);
                }
            };
        }
    }
}

