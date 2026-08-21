/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface jr
extends jf.a {
    public static final Logger a = LogUtils.getLogger();
    public static final b b = new c(Map.of()).e();

    public <E> Optional<jq<E>> a(amt<? extends jq<? extends E>> var1);

    default public <E> jq<E> f(amt<? extends jq<? extends E>> $$0) {
        return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + String.valueOf($$0)));
    }

    public Stream<d<?>> a();

    @Override
    default public Stream<amt<? extends jq<?>>> b() {
        return this.a().map($$0 -> $$0.a);
    }

    public static b a(final jq<? extends jq<?>> $$0) {
        return new b(){

            public <T> Optional<jq<T>> a(amt<? extends jq<? extends T>> $$02) {
                jq $$1 = $$0;
                return $$1.f($$02);
            }

            @Override
            public Stream<d<?>> a() {
                return $$0.k().stream().map(d::a);
            }

            @Override
            public b e() {
                return this;
            }
        };
    }

    default public b e() {
        class A
        extends c
        implements b {
            protected A(jr $$0, Stream<d<?>> $$1) {
                super($$1);
            }
        }
        return new A(this, this.a().map(d::c));
    }

    default public /* synthetic */ jf.b e(amt amt2) {
        return this.f(amt2);
    }

    @Override
    default public /* synthetic */ je b(amt amt2) {
        return this.f(amt2);
    }

    public static final class d<T>
    extends Record {
        final amt<? extends jq<T>> a;
        private final jq<T> b;

        public d(amt<? extends jq<T>> $$0, jq<T> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        private static <T, R extends jq<? extends T>> d<T> a(Map.Entry<? extends amt<? extends jq<?>>, R> $$0) {
            return d.a($$0.getKey(), (jq)$$0.getValue());
        }

        private static <T> d<T> a(amt<? extends jq<?>> $$0, jq<?> $$1) {
            return new d($$0, $$1);
        }

        private d<T> c() {
            return new d<T>(this.a, this.b.n());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "key;value", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "key;value", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "key;value", "a", "b"}, this, $$0);
        }

        public amt<? extends jq<T>> a() {
            return this.a;
        }

        public jq<T> b() {
            return this.b;
        }
    }

    public static class c
    implements jr {
        private final Map<? extends amt<? extends jq<?>>, ? extends jq<?>> c;

        public c(List<? extends jq<?>> $$02) {
            this.c = $$02.stream().collect(Collectors.toUnmodifiableMap(jq::g, $$0 -> $$0));
        }

        public c(Map<? extends amt<? extends jq<?>>, ? extends jq<?>> $$0) {
            this.c = Map.copyOf($$0);
        }

        public c(Stream<d<?>> $$0) {
            this.c = (Map)$$0.collect(ImmutableMap.toImmutableMap(d::a, d::b));
        }

        @Override
        public <E> Optional<jq<E>> a(amt<? extends jq<? extends E>> $$02) {
            return Optional.ofNullable(this.c.get($$02)).map($$0 -> $$0);
        }

        @Override
        public Stream<d<?>> a() {
            return this.c.entrySet().stream().map(d::a);
        }
    }

    public static interface b
    extends jr {
    }
}

