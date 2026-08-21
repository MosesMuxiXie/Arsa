/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class jt {
    private final List<k<?>> a = new ArrayList();

    static <T> je<T> a(final jf.b<T> $$0) {
        return new c<T>($$0){

            @Override
            public Optional<jd.c<T>> a(amt<T> $$02) {
                return $$0.a($$02);
            }
        };
    }

    static <T> jf.b<T> a(final amt<? extends jq<? extends T>> $$0, final Lifecycle $$1, jg<T> $$2, final Map<amt<T>, jd.c<T>> $$3) {
        return new e<T>($$2){

            @Override
            public amt<? extends jq<? extends T>> g() {
                return $$0;
            }

            @Override
            public Lifecycle h() {
                return $$1;
            }

            @Override
            public Optional<jd.c<T>> a(amt<T> $$02) {
                return Optional.ofNullable((jd.c)$$3.get($$02));
            }

            @Override
            public Stream<jd.c<T>> c() {
                return $$3.values().stream();
            }
        };
    }

    public <T> jt a(amt<? extends jq<T>> $$0, Lifecycle $$1, i<T> $$2) {
        this.a.add(new k<T>($$0, $$1, $$2));
        return this;
    }

    public <T> jt a(amt<? extends jq<T>> $$0, i<T> $$1) {
        return this.a($$0, Lifecycle.stable(), $$1);
    }

    private b b(jr $$0) {
        b $$12 = b.a($$0, this.a.stream().map(k::a));
        this.a.forEach($$1 -> $$1.b($$12));
        return $$12;
    }

    private static jf.a a(m $$0, jr $$12, Stream<jf.b<?>> $$22) {
        record A<T>(jf.b<T> a, ams.b<T> b) {
            public static <T> A<T> a(jf.b<T> $$0) {
                return new A<T>(new d<T>($$0, $$0), ams.b.a($$0));
            }

            public static <T> A<T> a(m $$0, jf.b<T> $$1) {
                return new A(new d($$0.a(), $$1), new ams.b($$0.a(), $$1, $$1.h()));
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "lookup;opsInfo", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "lookup;opsInfo", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "lookup;opsInfo", "a", "b"}, this, $$0);
            }
        }
        final HashMap $$3 = new HashMap();
        $$12.a().forEach($$1 -> $$3.put($$1.a(), A.a($$1.b())));
        $$22.forEach($$2 -> $$3.put($$2.g(), A.a($$0, $$2)));
        return new jf.a(){

            @Override
            public Stream<amt<? extends jq<?>>> b() {
                return $$3.keySet().stream();
            }

            <T> Optional<A<T>> f(amt<? extends jq<? extends T>> $$0) {
                return Optional.ofNullable((A)$$3.get($$0));
            }

            public <T> Optional<jf.b<T>> a(amt<? extends jq<? extends T>> $$0) {
                return this.f($$0).map(A::a);
            }

            @Override
            public <V> ams<V> a(DynamicOps<V> $$0) {
                return ams.a($$0, new ams.c(){

                    @Override
                    public <T> Optional<ams.b<T>> a(amt<? extends jq<? extends T>> $$0) {
                        return this.f($$0).map(A::b);
                    }
                });
            }
        };
    }

    public jf.a a(jr $$0) {
        b $$12 = this.b($$0);
        Stream<jf.b<?>> $$2 = this.a.stream().map($$1 -> $$1.a($$12).a($$0.a));
        jf.a $$3 = jt.a($$12.a, $$0, $$2);
        $$12.c();
        $$12.b();
        $$12.d();
        return $$3;
    }

    private jf.a a(jr $$0, jf.a $$1, iv.a $$2, Map<amt<? extends jq<?>>, j<?>> $$3, jf.a $$4) {
        m $$52 = new m();
        MutableObject $$6 = new MutableObject();
        List $$7 = $$3.keySet().stream().map($$5 -> this.a((jg)$$52, $$2, (amt)$$5, $$4, $$1, (MutableObject<jf.a>)$$6)).collect(Collectors.toUnmodifiableList());
        jf.a $$8 = jt.a($$52, $$0, $$7.stream());
        $$6.setValue((Object)$$8);
        return $$8;
    }

    private <T> jf.b<T> a(jg<T> $$0, iv.a $$1, amt<? extends jq<? extends T>> $$2, jf.a $$3, jf.a $$4, MutableObject<jf.a> $$52) {
        iv $$6 = $$1.a($$2);
        if ($$6 == null) {
            throw new NullPointerException("No cloner for " + String.valueOf($$2.a()));
        }
        HashMap $$7 = new HashMap();
        jf.b $$8 = $$3.e($$2);
        $$8.c().forEach($$5 -> {
            amt $$6 = $$5.h();
            f $$7 = new f($$0, $$6);
            $$7.a = () -> $$6.a($$5.a(), $$3, (jf.a)$$52.get());
            $$7.put($$6, $$7);
        });
        jf.b $$9 = $$4.e($$2);
        $$9.c().forEach($$5 -> {
            amt $$62 = $$5.h();
            $$7.computeIfAbsent($$62, $$6 -> {
                f $$7 = new f($$0, $$62);
                $$7.a = () -> $$6.a($$5.a(), $$4, (jf.a)$$52.get());
                return $$7;
            });
        });
        Lifecycle $$10 = $$8.h().add($$9.h());
        return jt.a($$2, $$10, $$0, $$7);
    }

    public g a(jr $$0, jf.a $$12, iv.a $$2) {
        b $$3 = this.b($$0);
        HashMap $$4 = new HashMap();
        this.a.stream().map($$1 -> $$1.a($$3)).forEach($$1 -> $$4.put((amt<jq<?>>)$$1.a, (j<?>)$$1));
        Set $$5 = $$0.b().collect(Collectors.toUnmodifiableSet());
        $$12.b().filter($$1 -> !$$5.contains($$1)).forEach($$1 -> $$4.putIfAbsent((amt<jq<?>>)$$1, new j($$1, Lifecycle.stable(), Map.of())));
        Stream<jf.b<?>> $$6 = $$4.values().stream().map($$1 -> $$1.a($$0.a));
        jf.a $$7 = jt.a($$3.a, $$0, $$6);
        $$3.b();
        $$3.d();
        jf.a $$8 = this.a($$0, $$12, $$2, $$4, $$7);
        return new g($$8, $$7);
    }

    record k<T>(amt<? extends jq<T>> a, Lifecycle b, i<T> c) {
        void b(b $$0) {
            this.c.run($$0.a());
        }

        public j<T> a(b $$0) {
            HashMap $$1 = new HashMap();
            Iterator<Map.Entry<amt<?>, h<?>>> $$2 = $$0.d.entrySet().iterator();
            while ($$2.hasNext()) {
                Map.Entry<amt<?>, h<?>> $$3 = $$2.next();
                amt<?> $$4 = $$3.getKey();
                if (!$$4.c(this.a)) continue;
                amt<?> $$5 = $$4;
                h<?> $$6 = $$3.getValue();
                jd.c<Object> $$7 = $$0.b.a.remove($$4);
                $$1.put($$5, new n($$6, Optional.ofNullable($$7)));
                $$2.remove();
            }
            return new j(this.a, this.b, $$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{k.class, "key;lifecycle;bootstrap", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{k.class, "key;lifecycle;bootstrap", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{k.class, "key;lifecycle;bootstrap", "a", "b", "c"}, this, $$0);
        }
    }

    @FunctionalInterface
    public static interface i<T> {
        public void run(qr<T> var1);
    }

    static final class b
    extends Record {
        final m a;
        final l b;
        final Map<amo, je<?>> c;
        final Map<amt<?>, h<?>> d;
        final List<RuntimeException> e;

        private b(m $$0, l $$1, Map<amo, je<?>> $$2, Map<amt<?>, h<?>> $$3, List<RuntimeException> $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        public static b a(jr $$0, Stream<amt<? extends jq<?>>> $$12) {
            m $$22 = new m();
            ArrayList<RuntimeException> $$3 = new ArrayList<RuntimeException>();
            l $$4 = new l($$22);
            ImmutableMap.Builder $$5 = ImmutableMap.builder();
            $$0.a().forEach($$1 -> $$5.put((Object)$$1.a().a(), jt.a($$1.b())));
            $$12.forEach($$2 -> $$5.put((Object)$$2.a(), (Object)$$4));
            return new b($$22, $$4, (Map<amo, je<?>>)$$5.build(), new HashMap(), (List<RuntimeException>)$$3);
        }

        public <T> qr<T> a() {
            return new qr<T>(){

                @Override
                public jd.c<T> a(amt<T> $$0, T $$1, Lifecycle $$2) {
                    h $$3 = d.put($$0, new h($$1, $$2));
                    if ($$3 != null) {
                        e.add(new IllegalStateException("Duplicate registration for " + String.valueOf($$0) + ", new=" + String.valueOf($$1) + ", old=" + String.valueOf($$3.a)));
                    }
                    return b.c($$0);
                }

                @Override
                public <S> je<S> a(amt<? extends jq<? extends S>> $$0) {
                    return c.getOrDefault($$0.a(), b);
                }
            };
        }

        public void b() {
            this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + String.valueOf($$1.a) + " for key " + String.valueOf($$0))));
        }

        public void c() {
            for (amt<Object> $$0 : this.b.a.keySet()) {
                this.e.add(new IllegalStateException("Unreferenced key: " + String.valueOf($$0)));
            }
        }

        public void d() {
            if (!this.e.isEmpty()) {
                IllegalStateException $$0 = new IllegalStateException("Errors during registry creation");
                for (RuntimeException $$1 : this.e) {
                    $$0.addSuppressed($$1);
                }
                throw $$0;
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "owner;lookup;registries;registeredValues;errors", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "owner;lookup;registries;registeredValues;errors", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "owner;lookup;registries;registeredValues;errors", "a", "b", "c", "d", "e"}, this, $$0);
        }

        public m e() {
            return this.a;
        }

        public l f() {
            return this.b;
        }

        public Map<amo, je<?>> g() {
            return this.c;
        }

        public Map<amt<?>, h<?>> h() {
            return this.d;
        }

        public List<RuntimeException> i() {
            return this.e;
        }
    }

    static class m
    implements jg<Object> {
        m() {
        }

        public <T> jg<T> a() {
            return this;
        }
    }

    public record g(jf.a a, jf.a b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{g.class, "full;patches", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{g.class, "full;patches", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{g.class, "full;patches", "a", "b"}, this, $$0);
        }
    }

    static final class j<T>
    extends Record {
        final amt<? extends jq<? extends T>> a;
        private final Lifecycle b;
        private final Map<amt<T>, n<T>> c;

        j(amt<? extends jq<? extends T>> $$0, Lifecycle $$1, Map<amt<T>, n<T>> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public jf.b<T> a(m $$0) {
            Map $$12 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, $$1 -> {
                n $$2 = (n)$$1.getValue();
                jd.c $$3 = $$2.b().orElseGet(() -> jd.c.a($$0.a(), (amt)$$1.getKey()));
                $$3.b($$2.a().a());
                return $$3;
            }));
            return jt.a(this.a, this.b, $$0.a(), $$12);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{j.class, "key;lifecycle;values", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{j.class, "key;lifecycle;values", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{j.class, "key;lifecycle;values", "a", "b", "c"}, this, $$0);
        }

        public amt<? extends jq<? extends T>> a() {
            return this.a;
        }

        public Lifecycle b() {
            return this.b;
        }

        public Map<amt<T>, n<T>> c() {
            return this.c;
        }
    }

    static class f<T>
    extends jd.c<T> {
        @Nullable Supplier<T> a;

        protected f(jg<T> $$0, @Nullable amt<T> $$1) {
            super(jd.c.a.a, $$0, $$1, null);
        }

        @Override
        protected void b(T $$0) {
            super.b($$0);
            this.a = null;
        }

        @Override
        public T a() {
            if (this.a != null) {
                this.b(this.a.get());
            }
            return super.a();
        }
    }

    record n<T>(h<T> a, Optional<jd.c<T>> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{n.class, "value;holder", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{n.class, "value;holder", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{n.class, "value;holder", "a", "b"}, this, $$0);
        }
    }

    static final class h<T>
    extends Record {
        final T a;
        private final Lifecycle b;

        h(T $$0, Lifecycle $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{h.class, "value;lifecycle", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{h.class, "value;lifecycle", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{h.class, "value;lifecycle", "a", "b"}, this, $$0);
        }

        public T a() {
            return this.a;
        }

        public Lifecycle b() {
            return this.b;
        }
    }

    static class l
    extends c<Object> {
        final Map<amt<Object>, jd.c<Object>> a = new HashMap<amt<Object>, jd.c<Object>>();

        public l(jg<Object> $$0) {
            super($$0);
        }

        @Override
        public Optional<jd.c<Object>> a(amt<Object> $$0) {
            return Optional.of(this.c($$0));
        }

        <T> jd.c<T> c(amt<T> $$02) {
            return this.a.computeIfAbsent($$02, $$0 -> jd.c.a(this.d, $$0));
        }
    }

    static class d<T>
    extends e<T>
    implements jf.b.a<T> {
        private final jf.b<T> a;

        d(jg<T> $$0, jf.b<T> $$1) {
            super($$0);
            this.a = $$1;
        }

        @Override
        public jf.b<T> a() {
            return this.a;
        }
    }

    static abstract class e<T>
    extends c<T>
    implements jf.b<T> {
        protected e(jg<T> $$0) {
            super($$0);
        }

        @Override
        public Stream<jh.c<T>> e() {
            throw new UnsupportedOperationException("Tags are not available in datagen");
        }
    }

    static abstract class c<T>
    implements je<T> {
        protected final jg<T> d;

        protected c(jg<T> $$0) {
            this.d = $$0;
        }

        @Override
        public Optional<jh.c<T>> a(bef<T> $$0) {
            return Optional.of(jh.a(this.d, $$0));
        }
    }
}

