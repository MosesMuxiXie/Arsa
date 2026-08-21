/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public interface awk<T> {
    public static <T> awk<T> a(T $$0) {
        return new b<T>($$0);
    }

    public static <T> awk<T> a(String $$0) {
        return awk.a(() -> $$0);
    }

    public static <T> awk<T> a(Supplier<String> $$0) {
        return new a($$0);
    }

    public boolean a();

    public @Nullable T b(@Nullable T var1);

    public static <R> @Nullable R a(awk<? extends R> $$0, @Nullable R $$1) {
        R $$2 = $$0.b((R)null);
        return $$2 != null ? $$2 : (R)$$1;
    }

    public @Nullable String b();

    public awk<T> a(Consumer<T> var1);

    public <R> awk<R> a(Function<T, R> var1);

    public <E extends Throwable> T b(Supplier<E> var1) throws E;

    public record b<T>(T a) implements awk<T>
    {
        private final T a;

        @Override
        public boolean a() {
            return true;
        }

        @Override
        public T b(@Nullable T $$0) {
            return this.a;
        }

        @Override
        public @Nullable String b() {
            return null;
        }

        @Override
        public awk<T> a(Consumer<T> $$0) {
            $$0.accept(this.a);
            return this;
        }

        @Override
        public <R> awk<R> a(Function<T, R> $$0) {
            return new b<R>($$0.apply(this.a));
        }

        @Override
        public <E extends Throwable> T b(Supplier<E> $$0) throws E {
            return this.a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "value", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "value", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "value", "a"}, this, $$0);
        }

        public T c() {
            return this.a;
        }
    }

    public record a<T>(Supplier<String> a) implements awk<T>
    {
        private final Supplier<String> a;

        @Override
        public boolean a() {
            return false;
        }

        @Override
        public @Nullable T b(@Nullable T $$0) {
            return $$0;
        }

        @Override
        public String b() {
            return this.a.get();
        }

        @Override
        public awk<T> a(Consumer<T> $$0) {
            return this;
        }

        @Override
        public <R> awk<R> a(Function<T, R> $$0) {
            return new a<T>(this.a);
        }

        @Override
        public <E extends Throwable> T b(Supplier<E> $$0) throws E {
            throw (Throwable)$$0.get();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "error", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "error", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "error", "a"}, this, $$0);
        }

        public Supplier<String> c() {
            return this.a;
        }
    }
}

