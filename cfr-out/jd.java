/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public interface jd<T> {
    public T a();

    public boolean b();

    public boolean a(amo var1);

    public boolean a(amt<T> var1);

    public boolean a(Predicate<amt<T>> var1);

    public boolean a(bef<T> var1);

    @Deprecated
    public boolean a(jd<T> var1);

    public Stream<bef<T>> c();

    public Either<amt<T>, T> d();

    public Optional<amt<T>> e();

    public b f();

    public boolean a(jg<T> var1);

    default public String g() {
        return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
    }

    public static <T> jd<T> a(T $$0) {
        return new a<T>($$0);
    }

    public record a<T>(T a) implements jd<T>
    {
        @Override
        public boolean b() {
            return true;
        }

        @Override
        public boolean a(amo $$0) {
            return false;
        }

        @Override
        public boolean a(amt<T> $$0) {
            return false;
        }

        @Override
        public boolean a(bef<T> $$0) {
            return false;
        }

        @Override
        public boolean a(jd<T> $$0) {
            return this.a.equals($$0.a());
        }

        @Override
        public boolean a(Predicate<amt<T>> $$0) {
            return false;
        }

        @Override
        public Either<amt<T>, T> d() {
            return Either.right(this.a);
        }

        @Override
        public Optional<amt<T>> e() {
            return Optional.empty();
        }

        @Override
        public b f() {
            return b.b;
        }

        @Override
        public String toString() {
            return "Direct{" + String.valueOf(this.a) + "}";
        }

        @Override
        public boolean a(jg<T> $$0) {
            return true;
        }

        @Override
        public Stream<bef<T>> c() {
            return Stream.of(new bef[0]);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "value", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "value", "a"}, this, $$0);
        }
    }

    public static class c<T>
    implements jd<T> {
        private final jg<T> a;
        private @Nullable Set<bef<T>> b;
        private final a c;
        private @Nullable amt<T> d;
        private @Nullable T e;

        protected c(a $$0, jg<T> $$1, @Nullable amt<T> $$2, @Nullable T $$3) {
            this.a = $$1;
            this.c = $$0;
            this.d = $$2;
            this.e = $$3;
        }

        public static <T> c<T> a(jg<T> $$0, amt<T> $$1) {
            return new c<Object>(a.a, $$0, $$1, null);
        }

        @Deprecated
        public static <T> c<T> a(jg<T> $$0, @Nullable T $$1) {
            return new c<T>(a.b, $$0, null, $$1);
        }

        public amt<T> h() {
            if (this.d == null) {
                throw new IllegalStateException("Trying to access unbound value '" + String.valueOf(this.e) + "' from registry " + String.valueOf(this.a));
            }
            return this.d;
        }

        @Override
        public T a() {
            if (this.e == null) {
                throw new IllegalStateException("Trying to access unbound value '" + String.valueOf(this.d) + "' from registry " + String.valueOf(this.a));
            }
            return this.e;
        }

        @Override
        public boolean a(amo $$0) {
            return this.h().a().equals($$0);
        }

        @Override
        public boolean a(amt<T> $$0) {
            return this.h() == $$0;
        }

        private Set<bef<T>> i() {
            if (this.b == null) {
                throw new IllegalStateException("Tags not bound");
            }
            return this.b;
        }

        @Override
        public boolean a(bef<T> $$0) {
            return this.i().contains($$0);
        }

        @Override
        public boolean a(jd<T> $$0) {
            return $$0.a(this.h());
        }

        @Override
        public boolean a(Predicate<amt<T>> $$0) {
            return $$0.test(this.h());
        }

        @Override
        public boolean a(jg<T> $$0) {
            return this.a.a($$0);
        }

        @Override
        public Either<amt<T>, T> d() {
            return Either.left(this.h());
        }

        @Override
        public Optional<amt<T>> e() {
            return Optional.of(this.h());
        }

        @Override
        public b f() {
            return jd$b.a;
        }

        @Override
        public boolean b() {
            return this.d != null && this.e != null;
        }

        void b(amt<T> $$0) {
            if (this.d != null && $$0 != this.d) {
                throw new IllegalStateException("Can't change holder key: existing=" + String.valueOf(this.d) + ", new=" + String.valueOf($$0));
            }
            this.d = $$0;
        }

        protected void b(T $$0) {
            if (this.c == a.b && this.e != $$0) {
                throw new IllegalStateException("Can't change holder " + String.valueOf(this.d) + " value: existing=" + String.valueOf(this.e) + ", new=" + String.valueOf($$0));
            }
            this.e = $$0;
        }

        void a(Collection<bef<T>> $$0) {
            this.b = Set.copyOf($$0);
        }

        @Override
        public Stream<bef<T>> c() {
            return this.i().stream();
        }

        public String toString() {
            return "Reference{" + String.valueOf(this.d) + "=" + String.valueOf(this.e) + "}";
        }

        protected static final class a
        extends Enum<a> {
            public static final /* enum */ a a = new a();
            public static final /* enum */ a b = new a();
            private static final /* synthetic */ a[] c;

            public static a[] values() {
                return (a[])c.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b};
            }

            static {
                c = jd$c$a.a();
            }
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        private static final /* synthetic */ b[] c;

        public static b[] values() {
            return (b[])c.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        static {
            c = jd$b.a();
        }
    }
}

