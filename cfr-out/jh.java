/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.util.Either
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public interface jh<T>
extends Iterable<jd<T>> {
    public Stream<jd<T>> a();

    public int b();

    public boolean c();

    public Either<bef<T>, List<jd<T>>> d();

    public Optional<jd<T>> a(bgr var1);

    public jd<T> a(int var1);

    public boolean a(jd<T> var1);

    public boolean a(jg<T> var1);

    public Optional<bef<T>> e();

    @Deprecated
    @VisibleForTesting
    public static <T> c<T> a(jg<T> $$0, bef<T> $$1) {
        return new c<T>((jg)$$0, (bef)$$1){

            @Override
            protected List<jd<T>> g() {
                throw new UnsupportedOperationException("Tag " + String.valueOf(this.h()) + " can't be dereferenced during construction");
            }
        };
    }

    public static <T> jh<T> f() {
        return a.a;
    }

    @SafeVarargs
    public static <T> a<T> a(jd<T> ... $$0) {
        return new a<T>(List.of($$0));
    }

    public static <T> a<T> a(List<? extends jd<T>> $$0) {
        return new a(List.copyOf($$0));
    }

    @SafeVarargs
    public static <E, T> a<T> a(Function<E, jd<T>> $$0, E ... $$1) {
        return jh.a(Stream.of($$1).map($$0).toList());
    }

    public static <E, T> a<T> a(Function<E, jd<T>> $$0, Collection<E> $$1) {
        return jh.a($$1.stream().map($$0).toList());
    }

    public static final class a<T>
    extends b<T> {
        static final a<?> a = new a(List.of());
        private final List<jd<T>> b;
        private @Nullable Set<jd<T>> c;

        a(List<jd<T>> $$0) {
            this.b = $$0;
        }

        @Override
        protected List<jd<T>> g() {
            return this.b;
        }

        @Override
        public boolean c() {
            return true;
        }

        @Override
        public Either<bef<T>, List<jd<T>>> d() {
            return Either.right(this.b);
        }

        @Override
        public Optional<bef<T>> e() {
            return Optional.empty();
        }

        @Override
        public boolean a(jd<T> $$0) {
            if (this.c == null) {
                this.c = Set.copyOf(this.b);
            }
            return this.c.contains($$0);
        }

        public String toString() {
            return "DirectSet[" + String.valueOf(this.b) + "]";
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean equals(Object $$0) {
            if (this == $$0) {
                return true;
            }
            if (!($$0 instanceof a)) return false;
            a $$1 = (a)$$0;
            if (!this.b.equals($$1.b)) return false;
            return true;
        }

        public int hashCode() {
            return this.b.hashCode();
        }
    }

    public static class c<T>
    extends b<T> {
        private final jg<T> a;
        private final bef<T> b;
        private @Nullable List<jd<T>> c;

        c(jg<T> $$0, bef<T> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        void b(List<jd<T>> $$0) {
            this.c = List.copyOf($$0);
        }

        public bef<T> h() {
            return this.b;
        }

        @Override
        protected List<jd<T>> g() {
            if (this.c == null) {
                throw new IllegalStateException("Trying to access unbound tag '" + String.valueOf(this.b) + "' from registry " + String.valueOf(this.a));
            }
            return this.c;
        }

        @Override
        public boolean c() {
            return this.c != null;
        }

        @Override
        public Either<bef<T>, List<jd<T>>> d() {
            return Either.left(this.b);
        }

        @Override
        public Optional<bef<T>> e() {
            return Optional.of(this.b);
        }

        @Override
        public boolean a(jd<T> $$0) {
            return $$0.a(this.b);
        }

        public String toString() {
            return "NamedSet(" + String.valueOf(this.b) + ")[" + String.valueOf(this.c) + "]";
        }

        @Override
        public boolean a(jg<T> $$0) {
            return this.a.a($$0);
        }
    }

    public static abstract class b<T>
    implements jh<T> {
        protected abstract List<jd<T>> g();

        @Override
        public int b() {
            return this.g().size();
        }

        @Override
        public Spliterator<jd<T>> spliterator() {
            return this.g().spliterator();
        }

        @Override
        public Iterator<jd<T>> iterator() {
            return this.g().iterator();
        }

        @Override
        public Stream<jd<T>> a() {
            return this.g().stream();
        }

        @Override
        public Optional<jd<T>> a(bgr $$0) {
            return bhs.b(this.g(), $$0);
        }

        @Override
        public jd<T> a(int $$0) {
            return this.g().get($$0);
        }

        @Override
        public boolean a(jg<T> $$0) {
            return true;
        }
    }
}

