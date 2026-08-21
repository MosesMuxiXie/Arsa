/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class byg<S> {
    private final Map<byc<?>, a<S, ?>> a = new IdentityHashMap();

    public <T> byj<S, T> a(byc<T> $$0, byl<S, T> $$1) {
        a $$2 = this.a.computeIfAbsent($$0, a::new);
        if ($$2.b != null) {
            throw new IllegalArgumentException("Trying to override rule: " + String.valueOf($$0));
        }
        $$2.b = $$1;
        return $$2;
    }

    public <T> byj<S, T> a(byc<T> $$0, byo<S> $$1, byl.a<S, T> $$2) {
        return this.a($$0, byl.a($$1, $$2));
    }

    public <T> byj<S, T> a(byc<T> $$0, byo<S> $$1, byl.b<S, T> $$2) {
        return this.a($$0, byl.a($$1, $$2));
    }

    public void a() {
        List<byc> $$02 = this.a.entrySet().stream().filter($$0 -> ((a)$$0.getValue()).b == null).map(Map.Entry::getKey).toList();
        if (!$$02.isEmpty()) {
            throw new IllegalStateException("Unbound names: " + String.valueOf($$02));
        }
    }

    public <T> byj<S, T> a(byc<T> $$0) {
        return Objects.requireNonNull(this.a.get($$0), () -> "No rule called " + String.valueOf($$0));
    }

    public <T> byj<S, T> b(byc<T> $$0) {
        return this.d($$0);
    }

    private <T> a<S, T> d(byc<T> $$0) {
        return this.a.computeIfAbsent($$0, a::new);
    }

    public <T> byo<S> c(byc<T> $$0) {
        return new b<S, T>(this.d($$0), $$0);
    }

    public <T> byo<S> a(byc<T> $$0, byc<T> $$1) {
        return new b<S, T>(this.d($$0), $$1);
    }

    static class a<S, T>
    implements byj<S, T>,
    Supplier<String> {
        private final byc<T> a;
        @Nullable byl<S, T> b;

        private a(byc<T> $$0) {
            this.a = $$0;
        }

        @Override
        public byc<T> a() {
            return this.a;
        }

        @Override
        public byl<S, T> b() {
            return Objects.requireNonNull(this.b, this);
        }

        public String c() {
            return "Unbound rule " + String.valueOf(this.a);
        }

        @Override
        public /* synthetic */ Object get() {
            return this.c();
        }
    }

    record b<S, T>(a<S, T> a, byc<T> b) implements byo<S>
    {
        @Override
        public boolean a(byk<S> $$0, bym $$1, bye $$2) {
            T $$3 = $$0.a(this.a);
            if ($$3 == null) {
                return false;
            }
            $$1.a(this.b, $$3);
            return true;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "ruleToParse;nameToStore", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "ruleToParse;nameToStore", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "ruleToParse;nameToStore", "a", "b"}, this, $$0);
        }
    }
}

