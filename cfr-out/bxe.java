/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class bxe<T> {
    public static final int a = 0;
    final @Nullable aao<? super xq, T> b;
    private final int c;

    public bxe(@Nullable aao<? super xq, T> $$0, int $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public bxe(@Nullable aao<? super xq, T> $$0) {
        this($$0, 0);
    }

    public b<T> a(@Nullable T $$0) {
        return new b<T>(this, Optional.ofNullable($$0));
    }

    public b<T> a() {
        return new b(this, Optional.empty());
    }

    public a<T> b(T $$0) {
        return new a<T>(this, $$0);
    }

    public String toString() {
        return bhs.a(mi.f, this);
    }

    public @Nullable aao<? super xq, T> b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public static final class b<T>
    extends Record {
        private final bxe<T> b;
        private final Optional<T> c;
        public static final aao<xq, b<?>> a = aam.a(mj.t).b(b::a, b::a);

        public b(bxe<T> $$0, Optional<T> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        private static <T> aao<? super xq, b<T>> a(bxe<T> $$0) {
            return aam.a(Objects.requireNonNull($$0.b)).a($$1 -> new b($$0, $$1), b::b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "subscription;value", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "subscription;value", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "subscription;value", "b", "c"}, this, $$0);
        }

        public bxe<T> a() {
            return this.b;
        }

        public Optional<T> b() {
            return this.c;
        }
    }

    public static final class a<T>
    extends Record {
        private final bxe<T> b;
        private final T c;
        public static final aao<xq, a<?>> a = aam.a(mj.t).b(a::a, a::a);

        public a(bxe<T> $$0, T $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        private static <T> aao<? super xq, a<T>> a(bxe<T> $$0) {
            return Objects.requireNonNull($$0.b).a($$1 -> new a<Object>($$0, $$1), a::b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "subscription;value", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "subscription;value", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "subscription;value", "b", "c"}, this, $$0);
        }

        public bxe<T> a() {
            return this.b;
        }

        public T b() {
            return this.c;
        }
    }
}

