/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class abd<T extends xk, B extends ByteBuf, C> {
    final wv a;
    final aaz b;
    private final List<a<T, ?, B, C>> c = new ArrayList();
    private @Nullable aaw d;

    public abd(wv $$0, aaz $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public <P extends aay<? super T>> abd<T, B, C> a(aba<P> $$0, aao<? super B, P> $$1) {
        this.c.add(new a($$0, $$1, null));
        return this;
    }

    public <P extends aay<? super T>> abd<T, B, C> a(aba<P> $$0, aao<? super B, P> $$1, aax<B, P, C> $$2) {
        this.c.add(new a($$0, $$1, $$2));
        return this;
    }

    public <P extends aav<? super T>, D extends aau<? super T>> abd<T, B, C> a(aba<P> $$0, Function<Iterable<aay<? super T>>, P> $$1, D $$2) {
        aao $$3 = aao.a($$2);
        aba<aau<? super T>> $$4 = $$2.a();
        this.c.add(new a($$4, $$3, null));
        this.d = aaw.a($$0, $$1, $$2);
        return this;
    }

    aao<ByteBuf, aay<? super T>> a(Function<ByteBuf, B> $$0, List<a<T, ?, B, C>> $$1, C $$2) {
        abc $$3 = new abc(this.b);
        for (a a2 : $$1) {
            a2.a($$3, $$0, $$2);
        }
        return $$3.a();
    }

    private static xn.a a(final wv $$0, final aaz $$1, final List<? extends a<?, ?, ?, ?>> $$2) {
        return new xn.a(){

            @Override
            public wv a() {
                return $$0;
            }

            @Override
            public aaz b() {
                return $$1;
            }

            @Override
            public void a(xn.a.a $$02) {
                for (int $$12 = 0; $$12 < $$2.size(); ++$$12) {
                    a $$22 = (a)$$2.get($$12);
                    $$02.accept($$22.a, $$12);
                }
            }
        };
    }

    public abe<T, B> a(final C $$0) {
        final List<a<T, ?, B, C>> $$1 = List.copyOf(this.c);
        final aaw $$2 = this.d;
        final xn.a $$3 = abd.a(this.a, this.b, $$1);
        return new abe<T, B>(){

            @Override
            public xn<T> a(Function<ByteBuf, B> $$02) {
                return new b(abd.this.a, abd.this.b, abd.this.a($$02, $$1, $$0), $$2);
            }

            @Override
            public xn.a a() {
                return $$3;
            }
        };
    }

    public abf<T, B, C> a() {
        final List<a<T, ?, B, C>> $$0 = List.copyOf(this.c);
        final aaw $$1 = this.d;
        final xn.a $$2 = abd.a(this.a, this.b, $$0);
        return new abf<T, B, C>(){

            @Override
            public xn<T> a(Function<ByteBuf, B> $$02, C $$12) {
                return new b(abd.this.a, abd.this.b, abd.this.a($$02, $$0, $$12), $$1);
            }

            @Override
            public xn.a a() {
                return $$2;
            }
        };
    }

    private static <L extends xk, B extends ByteBuf> abe<L, B> a(wv $$0, aaz $$1, Consumer<abd<L, B, bhr>> $$2) {
        abd $$3 = new abd($$0, $$1);
        $$2.accept($$3);
        return $$3.a(bhr.a);
    }

    public static <T extends xr, B extends ByteBuf> abe<T, B> a(wv $$0, Consumer<abd<T, B, bhr>> $$1) {
        return abd.a($$0, aaz.a, $$1);
    }

    public static <T extends wr, B extends ByteBuf> abe<T, B> b(wv $$0, Consumer<abd<T, B, bhr>> $$1) {
        return abd.a($$0, aaz.b, $$1);
    }

    private static <L extends xk, B extends ByteBuf, C> abf<L, B, C> b(wv $$0, aaz $$1, Consumer<abd<L, B, C>> $$2) {
        abd $$3 = new abd($$0, $$1);
        $$2.accept($$3);
        return $$3.a();
    }

    public static <T extends xr, B extends ByteBuf, C> abf<T, B, C> c(wv $$0, Consumer<abd<T, B, C>> $$1) {
        return abd.b($$0, aaz.a, $$1);
    }

    public static <T extends wr, B extends ByteBuf, C> abf<T, B, C> d(wv $$0, Consumer<abd<T, B, C>> $$1) {
        return abd.b($$0, aaz.b, $$1);
    }

    static final class a<T extends xk, P extends aay<? super T>, B extends ByteBuf, C>
    extends Record {
        final aba<P> a;
        private final aao<? super B, P> b;
        private final @Nullable aax<B, P, C> c;

        a(aba<P> $$0, aao<? super B, P> $$1, @Nullable aax<B, P, C> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public void a(abc<ByteBuf, T> $$0, Function<ByteBuf, B> $$1, C $$2) {
            aao<B, P> $$4;
            if (this.c != null) {
                aao<? super B, P> $$3 = this.c.apply(this.b, $$2);
            } else {
                $$4 = this.b;
            }
            aao<ByteBuf, P> $$5 = $$4.b($$1);
            $$0.a(this.a, $$5);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "type;serializer;modifier", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "type;serializer;modifier", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "type;serializer;modifier", "a", "b", "c"}, this, $$0);
        }

        public aba<P> a() {
            return this.a;
        }

        public aao<? super B, P> b() {
            return this.b;
        }

        public @Nullable aax<B, P, C> c() {
            return this.c;
        }
    }

    record b<L extends xk>(wv a, aaz b, aao<ByteBuf, aay<? super L>> c, @Nullable aaw d) implements xn<L>
    {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "id;flow;codec;bundlerInfo", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "id;flow;codec;bundlerInfo", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "id;flow;codec;bundlerInfo", "a", "b", "c", "d"}, this, $$0);
        }
    }
}

