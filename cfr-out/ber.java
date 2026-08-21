/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public class ber {
    public static a a(is $$0, iz.a $$1, int $$2, iz.a $$3, int $$4, Predicate<is> $$5) {
        is.a $$6 = $$0.k();
        iz $$7 = iz.a(iz.b.b, $$1);
        iz $$8 = $$7.g();
        iz $$9 = iz.a(iz.b.b, $$3);
        iz $$10 = $$9.g();
        int $$11 = ber.a($$5, $$6.g($$0), $$7, $$2);
        int $$12 = ber.a($$5, $$6.g($$0), $$8, $$2);
        int $$13 = $$11;
        b[] $$14 = new b[$$13 + 1 + $$12];
        $$14[$$13] = new b(ber.a($$5, $$6.g($$0), $$9, $$4), ber.a($$5, $$6.g($$0), $$10, $$4));
        int $$15 = $$14[$$13].a;
        for (int $$16 = 1; $$16 <= $$11; ++$$16) {
            b $$17 = $$14[$$13 - ($$16 - 1)];
            $$14[$$13 - $$16] = new b(ber.a($$5, $$6.g($$0).c($$7, $$16), $$9, $$17.a), ber.a($$5, $$6.g($$0).c($$7, $$16), $$10, $$17.b));
        }
        for (int $$18 = 1; $$18 <= $$12; ++$$18) {
            b $$19 = $$14[$$13 + $$18 - 1];
            $$14[$$13 + $$18] = new b(ber.a($$5, $$6.g($$0).c($$8, $$18), $$9, $$19.a), ber.a($$5, $$6.g($$0).c($$8, $$18), $$10, $$19.b));
        }
        int $$20 = 0;
        int $$21 = 0;
        int $$22 = 0;
        int $$23 = 0;
        int[] $$24 = new int[$$14.length];
        for (int $$25 = $$15; $$25 >= 0; --$$25) {
            for (int $$26 = 0; $$26 < $$14.length; ++$$26) {
                b $$27 = $$14[$$26];
                int $$28 = $$15 - $$27.a;
                int $$29 = $$15 + $$27.b;
                $$24[$$26] = $$25 >= $$28 && $$25 <= $$29 ? $$29 + 1 - $$25 : 0;
            }
            Pair<b, Integer> $$30 = ber.a($$24);
            b $$31 = (b)$$30.getFirst();
            int $$32 = 1 + $$31.b - $$31.a;
            int $$33 = (Integer)$$30.getSecond();
            if ($$32 * $$33 <= $$22 * $$23) continue;
            $$20 = $$31.a;
            $$21 = $$25;
            $$22 = $$32;
            $$23 = $$33;
        }
        return new a($$0.a($$1, $$20 - $$13).a($$3, $$21 - $$15), $$22, $$23);
    }

    private static int a(Predicate<is> $$0, is.a $$1, iz $$2, int $$3) {
        int $$4;
        for ($$4 = 0; $$4 < $$3 && $$0.test($$1.c($$2)); ++$$4) {
        }
        return $$4;
    }

    @VisibleForTesting
    static Pair<b, Integer> a(int[] $$0) {
        int $$1 = 0;
        int $$2 = 0;
        int $$3 = 0;
        IntArrayList $$4 = new IntArrayList();
        $$4.push(0);
        for (int $$5 = 1; $$5 <= $$0.length; ++$$5) {
            int $$6;
            int n2 = $$6 = $$5 == $$0.length ? 0 : $$0[$$5];
            while (!$$4.isEmpty()) {
                int $$7 = $$0[$$4.topInt()];
                if ($$6 >= $$7) {
                    $$4.push($$5);
                    break;
                }
                $$4.popInt();
                int $$8 = $$4.isEmpty() ? 0 : $$4.topInt() + 1;
                if ($$7 * ($$5 - $$8) <= $$3 * ($$2 - $$1)) continue;
                $$2 = $$5;
                $$1 = $$8;
                $$3 = $$7;
            }
            if (!$$4.isEmpty()) continue;
            $$4.push($$5);
        }
        return new Pair((Object)new b($$1, $$2 - 1), (Object)$$3);
    }

    public static Optional<is> a(dvt $$0, is $$1, dzq $$2, iz $$3, dzq $$4) {
        eoh $$6;
        is.a $$5 = $$1.k();
        do {
            $$5.c($$3);
        } while (($$6 = $$0.a_($$5)).a($$2));
        if ($$6.a($$4)) {
            return Optional.of($$5);
        }
        return Optional.empty();
    }

    public static class b {
        public final int a;
        public final int b;

        public b(int $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public String toString() {
            return "IntBounds{min=" + this.a + ", max=" + this.b + "}";
        }
    }

    public static class a {
        public final is a;
        public final int b;
        public final int c;

        public a(is $$0, int $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }
    }
}

