/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Stack
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import it.unimi.dsi.fastutil.Stack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public class ant {
    private static final int a = 2;

    private static b a(ab $$0, boolean $$1) {
        Optional<ao> $$2 = $$0.c();
        if ($$2.isEmpty()) {
            return b.b;
        }
        if ($$1) {
            return b.a;
        }
        if ($$2.get().j()) {
            return b.b;
        }
        return b.c;
    }

    private static boolean a(Stack<b> $$0) {
        for (int $$1 = 0; $$1 <= 2; ++$$1) {
            b $$2 = (b)((Object)$$0.peek($$1));
            if ($$2 == b.a) {
                return true;
            }
            if ($$2 != b.b) continue;
            return false;
        }
        return false;
    }

    private static boolean a(ad $$0, Stack<b> $$1, Predicate<ad> $$2, a $$3) {
        boolean $$4 = $$2.test($$0);
        b $$5 = ant.a($$0.a(), $$4);
        boolean $$6 = $$4;
        $$1.push((Object)$$5);
        for (ad $$7 : $$0.e()) {
            $$6 |= ant.a($$7, $$1, $$2, $$3);
        }
        boolean $$8 = $$6 || ant.a($$1);
        $$1.pop();
        $$3.accept($$0, $$8);
        return $$6;
    }

    public static void a(ad $$0, Predicate<ad> $$1, a $$2) {
        ad $$3 = $$0.d();
        ObjectArrayList $$4 = new ObjectArrayList();
        for (int $$5 = 0; $$5 <= 2; ++$$5) {
            $$4.push((Object)b.c);
        }
        ant.a($$3, (Stack<b>)$$4, $$1, $$2);
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = ant$b.a();
        }
    }

    @FunctionalInterface
    public static interface a {
        public void accept(ad var1, boolean var2);
    }
}

