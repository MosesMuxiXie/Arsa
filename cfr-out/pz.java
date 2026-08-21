/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Stream;

public interface pz<E, T> {
    public pz<E, T> a(E var1);

    default public pz<E, T> a(E ... $$0) {
        return this.a(Arrays.stream($$0));
    }

    default public pz<E, T> a(Collection<E> $$0) {
        $$0.forEach(this::a);
        return this;
    }

    default public pz<E, T> a(Stream<E> $$0) {
        $$0.forEach(this::a);
        return this;
    }

    public pz<E, T> b(E var1);

    public pz<E, T> a(bef<T> var1);

    public pz<E, T> b(bef<T> var1);

    public static <T> pz<amt<T>, T> a(final bec $$0) {
        return new pz<amt<T>, T>(){

            @Override
            public pz<amt<T>, T> a(amt<T> $$02) {
                $$0.a($$02.a());
                return this;
            }

            @Override
            public pz<amt<T>, T> b(amt<T> $$02) {
                $$0.b($$02.a());
                return this;
            }

            @Override
            public pz<amt<T>, T> a(bef<T> $$02) {
                $$0.c($$02.b());
                return this;
            }

            @Override
            public pz<amt<T>, T> b(bef<T> $$02) {
                $$0.d($$02.b());
                return this;
            }
        };
    }

    default public <U> pz<U, T> a(final Function<U, E> $$0) {
        final pz $$1 = this;
        return new pz<U, T>(this){

            @Override
            public pz<U, T> a(U $$02) {
                $$1.a($$0.apply($$02));
                return this;
            }

            @Override
            public pz<U, T> b(U $$02) {
                $$1.a($$0.apply($$02));
                return this;
            }

            @Override
            public pz<U, T> a(bef<T> $$02) {
                $$1.a($$02);
                return this;
            }

            @Override
            public pz<U, T> b(bef<T> $$02) {
                $$1.b($$02);
                return this;
            }
        };
    }
}

