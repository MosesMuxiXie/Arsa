/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public interface byl<S, T> {
    public @Nullable T a(byk<S> var1);

    public static <S, T> byl<S, T> a(byo<S> $$0, a<S, T> $$1) {
        return new c<S, T>($$1, $$0);
    }

    public static <S, T> byl<S, T> a(byo<S> $$0, b<S, T> $$1) {
        return new c<S, T>($$1, $$0);
    }

    public record c<S, T>(a<S, T> a, byo<S> b) implements byl<S, T>
    {
        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public @Nullable T a(byk<S> $$0) {
            bym $$1 = $$0.a();
            $$1.a();
            try {
                if (this.b.a($$0, $$1, bye.a)) {
                    T t2 = this.a.run($$0);
                    return t2;
                }
                T t3 = null;
                return t3;
            }
            finally {
                $$1.b();
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "action;child", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "action;child", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "action;child", "a", "b"}, this, $$0);
        }
    }

    @FunctionalInterface
    public static interface a<S, T> {
        public @Nullable T run(byk<S> var1);
    }

    @FunctionalInterface
    public static interface b<S, T>
    extends a<S, T> {
        public T run(bym var1);

        @Override
        default public T run(byk<S> $$0) {
            return this.run($$0.a());
        }
    }
}

