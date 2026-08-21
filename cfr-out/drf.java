/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;

public final class drf<T extends dqs<?>>
extends Record {
    private final dse a;
    private final Optional<dqx<T>> b;

    public drf(dse $$0, Optional<dqx<T>> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public static <T extends dqs<?>> aao<xq, drf<T>> a() {
        return aao.a(dse.b, drf::b, $$0 -> new drf((dse)$$0, Optional.empty()));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{drf.class, "optionDisplay;recipe", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{drf.class, "optionDisplay;recipe", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{drf.class, "optionDisplay;recipe", "a", "b"}, this, $$0);
    }

    public dse b() {
        return this.a;
    }

    public Optional<dqx<T>> c() {
        return this.b;
    }

    public static final class b<T extends dqs<?>>
    extends Record {
        private final List<a<T>> a;

        public b(List<a<T>> $$0) {
            this.a = $$0;
        }

        public static <T extends dqs<?>> b<T> a() {
            return new b<T>(List.of());
        }

        public static <T extends dqs<?>> aao<xq, b<T>> b() {
            return aao.a(drf$a.a().a(aam.a()), b::e, b::new);
        }

        public boolean a(dlt $$0) {
            return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
        }

        public b<T> b(dlt $$0) {
            return new b<T>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
        }

        public boolean c() {
            return this.a.isEmpty();
        }

        public int d() {
            return this.a.size();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "entries", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "entries", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "entries", "a"}, this, $$0);
        }

        public List<a<T>> e() {
            return this.a;
        }
    }

    public static final class a<T extends dqs<?>>
    extends Record {
        final dqo a;
        private final drf<T> b;

        public a(dqo $$0, drf<T> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public static <T extends dqs<?>> aao<xq, a<T>> a() {
            return aao.a(dqo.a, a::b, drf.a(), a::c, a::new);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "input;recipe", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "input;recipe", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "input;recipe", "a", "b"}, this, $$0);
        }

        public dqo b() {
            return this.a;
        }

        public drf<T> c() {
            return this.b;
        }
    }
}

