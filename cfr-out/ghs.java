/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Function3
 *  com.mojang.datafixers.util.Function4
 *  com.mojang.datafixers.util.Function5
 */
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Function5;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class ghs<V> {
    private final Map<ght, V> a = new HashMap<ght, V>();

    protected void a(ght $$0, V $$1) {
        V $$2 = this.a.put($$0, $$1);
        if ($$2 != null) {
            throw new IllegalStateException("Value " + String.valueOf($$0) + " is already defined");
        }
    }

    Map<ght, V> a() {
        this.c();
        return Map.copyOf(this.a);
    }

    private void c() {
        List<epk<?>> $$02 = this.b();
        Stream<ght> $$12 = Stream.of(ght.a);
        for (epk<?> $$2 : $$02) {
            $$12 = $$12.flatMap($$1 -> $$2.c().map($$1::a));
        }
        List<ght> $$3 = $$12.filter($$0 -> !this.a.containsKey($$0)).toList();
        if (!$$3.isEmpty()) {
            throw new IllegalStateException("Missing definition for properties: " + String.valueOf($$3));
        }
    }

    abstract List<epk<?>> b();

    public static <T1 extends Comparable<T1>> a<ghm, T1> a(epk<T1> $$0) {
        return new a($$0);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> b<ghm, T1, T2> a(epk<T1> $$0, epk<T2> $$1) {
        return new b($$0, $$1);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> c<ghm, T1, T2, T3> a(epk<T1> $$0, epk<T2> $$1, epk<T3> $$2) {
        return new c($$0, $$1, $$2);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> d<ghm, T1, T2, T3, T4> a(epk<T1> $$0, epk<T2> $$1, epk<T3> $$2, epk<T4> $$3) {
        return new d($$0, $$1, $$2, $$3);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> e<ghm, T1, T2, T3, T4, T5> a(epk<T1> $$0, epk<T2> $$1, epk<T3> $$2, epk<T4> $$3, epk<T5> $$4) {
        return new e($$0, $$1, $$2, $$3, $$4);
    }

    public static <T1 extends Comparable<T1>> a<hqr, T1> b(epk<T1> $$0) {
        return new a($$0);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> b<hqr, T1, T2> b(epk<T1> $$0, epk<T2> $$1) {
        return new b($$0, $$1);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> c<hqr, T1, T2, T3> b(epk<T1> $$0, epk<T2> $$1, epk<T3> $$2) {
        return new c($$0, $$1, $$2);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> d<hqr, T1, T2, T3, T4> b(epk<T1> $$0, epk<T2> $$1, epk<T3> $$2, epk<T4> $$3) {
        return new d($$0, $$1, $$2, $$3);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> e<hqr, T1, T2, T3, T4, T5> b(epk<T1> $$0, epk<T2> $$1, epk<T3> $$2, epk<T4> $$3, epk<T5> $$4) {
        return new e($$0, $$1, $$2, $$3, $$4);
    }

    public static class a<V, T1 extends Comparable<T1>>
    extends ghs<V> {
        private final epk<T1> a;

        a(epk<T1> $$0) {
            this.a = $$0;
        }

        @Override
        public List<epk<?>> b() {
            return List.of(this.a);
        }

        public a<V, T1> a(T1 $$0, V $$1) {
            ght $$2 = ght.a(this.a.c($$0));
            this.a($$2, $$1);
            return this;
        }

        public ghs<V> a(Function<T1, V> $$0) {
            this.a.a().forEach($$1 -> this.a($$1, $$0.apply($$1)));
            return this;
        }
    }

    public static class b<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>>
    extends ghs<V> {
        private final epk<T1> a;
        private final epk<T2> b;

        b(epk<T1> $$0, epk<T2> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public List<epk<?>> b() {
            return List.of(this.a, this.b);
        }

        public b<V, T1, T2> a(T1 $$0, T2 $$1, V $$2) {
            ght $$3 = ght.a(this.a.c($$0), this.b.c($$1));
            this.a($$3, $$2);
            return this;
        }

        public ghs<V> a(BiFunction<T1, T2, V> $$0) {
            this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a($$1, $$2, $$0.apply($$1, $$2))));
            return this;
        }
    }

    public static class c<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>>
    extends ghs<V> {
        private final epk<T1> a;
        private final epk<T2> b;
        private final epk<T3> c;

        c(epk<T1> $$0, epk<T2> $$1, epk<T3> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public List<epk<?>> b() {
            return List.of(this.a, this.b, this.c);
        }

        public c<V, T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, V $$3) {
            ght $$4 = ght.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
            this.a($$4, $$3);
            return this;
        }

        public ghs<V> a(Function3<T1, T2, T3, V> $$0) {
            this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a($$1, $$2, $$3, $$0.apply($$1, $$2, $$3)))));
            return this;
        }
    }

    public static class d<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>>
    extends ghs<V> {
        private final epk<T1> a;
        private final epk<T2> b;
        private final epk<T3> c;
        private final epk<T4> d;

        d(epk<T1> $$0, epk<T2> $$1, epk<T3> $$2, epk<T4> $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public List<epk<?>> b() {
            return List.of(this.a, this.b, this.c, this.d);
        }

        public d<V, T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, V $$4) {
            ght $$5 = ght.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
            this.a($$5, $$4);
            return this;
        }

        public ghs<V> a(Function4<T1, T2, T3, T4, V> $$0) {
            this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.d.a().forEach($$4 -> this.a($$1, $$2, $$3, $$4, $$0.apply($$1, $$2, $$3, $$4))))));
            return this;
        }
    }

    public static class e<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>>
    extends ghs<V> {
        private final epk<T1> a;
        private final epk<T2> b;
        private final epk<T3> c;
        private final epk<T4> d;
        private final epk<T5> e;

        e(epk<T1> $$0, epk<T2> $$1, epk<T3> $$2, epk<T4> $$3, epk<T5> $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        @Override
        public List<epk<?>> b() {
            return List.of(this.a, this.b, this.c, this.d, this.e);
        }

        public e<V, T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, V $$5) {
            ght $$6 = ght.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
            this.a($$6, $$5);
            return this;
        }

        public ghs<V> a(Function5<T1, T2, T3, T4, T5, V> $$0) {
            this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.d.a().forEach($$4 -> this.e.a().forEach($$5 -> this.a($$1, $$2, $$3, $$4, $$5, $$0.apply($$1, $$2, $$3, $$4, $$5)))))));
            return this;
        }
    }
}

