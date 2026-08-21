/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ggp {
    public static final dkr[] a = new dkr[]{dkr.a, dkr.i, dkr.d, dkr.l, dkr.j, dkr.n, dkr.f, dkr.e, dkr.b, dkr.g, dkr.o, dkr.c};

    public static int a(a $$0, float $$1) {
        int $$2 = bgj.b($$1);
        int $$3 = $$2 / $$0.c;
        int $$4 = $$0.e.length;
        int $$5 = $$3 % $$4;
        int $$6 = ($$3 + 1) % $$4;
        float $$7 = ((float)($$2 % $$0.c) + bgj.g($$1)) / (float)$$0.c;
        int $$8 = $$0.a($$0.e[$$5]);
        int $$9 = $$0.a($$0.e[$$6]);
        return bel.a($$7, $$8, $$9);
    }

    static int a(dkr $$0, float $$1) {
        if ($$0 == dkr.a) {
            return -1644826;
        }
        int $$2 = $$0.d();
        return bel.b(255, bgj.b((float)bel.c($$2) * $$1), bgj.b((float)bel.d($$2) * $$1), bgj.b((float)bel.e($$2) * $$1));
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(25, dkr.values(), 0.75f);
        public static final /* enum */ a b = new a(30, a, 1.25f);
        final int c;
        private final Map<dkr, Integer> d;
        final dkr[] e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$02, dkr[] $$12, float $$2) {
            this.c = $$02;
            this.d = Maps.newHashMap(Arrays.stream($$12).collect(Collectors.toMap($$0 -> $$0, $$1 -> ggp.a($$1, $$2))));
            this.e = $$12;
        }

        public final int a(dkr $$0) {
            return this.d.get($$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            f = ggp$a.a();
        }
    }
}

