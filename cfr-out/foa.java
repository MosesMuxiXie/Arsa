/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;

public interface foa<R> {
    public static final Codec<foa<Object>> h = foa.a($$0 -> $$0.a(fnz.c.values()).a(fnz.a.values()));

    public @Nullable R a(fnz var1);

    public bhv<?> a();

    public static <U> foa<U> a(foa<? extends U> $$0) {
        return $$0;
    }

    public static <R> Codec<foa<R>> a(UnaryOperator<a<R>> $$0) {
        return ((a)$$0.apply(new a())).a();
    }

    public static final class a<R> {
        private final bfm.b<String, foa<R>> a = new bfm.b();

        a() {
        }

        public <T> a<R> a(T[] $$0, Function<T, String> $$1, Function<T, ? extends foa<R>> $$2) {
            for (T $$3 : $$0) {
                this.a.a($$1.apply($$3), $$2.apply($$3));
            }
            return this;
        }

        public <T extends bhh> a<R> a(T[] $$0, Function<T, ? extends foa<R>> $$1) {
            return this.a($$0, bhh::c, $$1);
        }

        public <T extends bhh & foa<? extends R>> a<R> a(T[] $$02) {
            return this.a((bhh[])$$02, (T $$0) -> foa.a((foa)$$0));
        }

        public a<R> a(Function<? super bhv<? extends cgk>, ? extends foa<R>> $$0) {
            return this.a(fnz.c.values(), (T $$1) -> (foa)$$0.apply($$1.a()));
        }

        public a<R> b(Function<? super bhv<? extends elb>, ? extends foa<R>> $$0) {
            return this.a(fnz.a.values(), (T $$1) -> (foa)$$0.apply($$1.a()));
        }

        public a<R> c(Function<? super bhv<? extends dlt>, ? extends foa<R>> $$0) {
            return this.a(fnz.d.values(), (T $$1) -> (foa)$$0.apply($$1.a()));
        }

        Codec<foa<R>> a() {
            return this.a.a((Codec<String>)Codec.STRING);
        }
    }

    public static interface c<T>
    extends foa<T> {
        @Override
        public bhv<? extends T> a();

        @Override
        default public @Nullable T a(fnz $$0) {
            return $$0.c(this.a());
        }
    }

    public static interface b<T, R>
    extends foa<R> {
        public @Nullable R a(T var1);

        @Override
        public bhv<? extends T> a();

        @Override
        default public @Nullable R a(fnz $$0) {
            T $$1 = $$0.c(this.a());
            return $$1 != null ? (R)this.a($$1) : null;
        }
    }
}

