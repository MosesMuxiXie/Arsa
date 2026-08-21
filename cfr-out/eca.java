/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.BiPredicate;
import java.util.function.Function;

public class eca {
    public static <S extends elb> c<S> a(eld<S> $$0, Function<eoh, a> $$1, Function<eoh, iz> $$2, epk<iz> $$3, eoh $$4, dwp $$5, is $$6, BiPredicate<dwp, is> $$7) {
        a $$14;
        boolean $$11;
        S $$8 = $$0.a($$5, $$6);
        if ($$8 == null) {
            return b::b;
        }
        if ($$7.test($$5, $$6)) {
            return b::b;
        }
        a $$9 = $$1.apply($$4);
        boolean $$10 = $$9 == a.a;
        boolean bl2 = $$11 = $$9 == a.b;
        if ($$10) {
            return new c.b<S>($$8);
        }
        is $$12 = $$6.a($$2.apply($$4));
        eoh $$13 = $$5.a_($$12);
        if ($$13.a($$4.b()) && ($$14 = $$1.apply($$13)) != a.a && $$9 != $$14 && $$13.c($$3) == $$4.c($$3)) {
            if ($$7.test($$5, $$12)) {
                return b::b;
            }
            S $$15 = $$0.a($$5, $$12);
            if ($$15 != null) {
                S $$16 = $$11 ? $$8 : $$15;
                S $$17 = $$11 ? $$15 : $$8;
                return new c.a<S>($$16, $$17);
            }
        }
        return new c.b<S>($$8);
    }

    public static interface c<S> {
        public <T> T apply(eca$b<? super S, T> var1);

        public static final class b<S>
        implements c<S> {
            private final S a;

            public b(S $$0) {
                this.a = $$0;
            }

            @Override
            public <T> T apply(eca$b<? super S, T> $$0) {
                return $$0.a(this.a);
            }
        }

        public static final class a<S>
        implements c<S> {
            private final S a;
            private final S b;

            public a(S $$0, S $$1) {
                this.a = $$0;
                this.b = $$1;
            }

            @Override
            public <T> T apply(eca$b<? super S, T> $$0) {
                return $$0.a(this.a, this.b);
            }
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = eca$a.a();
        }
    }

    public static interface b<S, T> {
        public T a(S var1, S var2);

        public T a(S var1);

        public T b();
    }
}

