/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;

public class hup
implements hug.a {
    @Override
    public void a(double $$0, double $$12, double $$22, bxg $$32, htx $$4, float $$5) {
        int $$6 = bxf.o.c();
        double $$7 = 1.0 / (double)($$6 * 2);
        HashMap $$8 = new HashMap();
        $$32.a(bxf.o, ($$1, $$2, $$3) -> {
            long $$4 = $$3 - $$2;
            a $$5 = $$8.getOrDefault($$1, a.c);
            $$8.put($$1, $$5.a((int)$$4));
        });
        for (Map.Entry $$9 : $$8.entrySet()) {
            is $$10 = (is)$$9.getKey();
            a $$11 = (a)$$9.getValue();
            fth $$122 = new fth($$10).g(0.002).h($$7 * (double)$$11.b);
            um.a($$122, ul.a(-1));
        }
        for (Map.Entry $$13 : $$8.entrySet()) {
            is $$14 = (is)$$13.getKey();
            a $$15 = (a)$$13.getValue();
            um.a(String.valueOf($$15.a), ftm.b($$14), ur.a.a());
        }
    }

    static final class a
    extends Record {
        final int a;
        final int b;
        static final a c = new a(0, Integer.MAX_VALUE);

        private a(int $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public a a(int $$0) {
            if ($$0 == this.b) {
                return new a(this.a + 1, $$0);
            }
            if ($$0 < this.b) {
                return new a(1, $$0);
            }
            return this;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "count;age", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "count;age", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "count;age", "a", "b"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }
}

