/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.function.Predicate;

public class ccw {
    public static final String a = "Items";

    public static dlt a(List<dlt> $$0, int $$1, int $$2) {
        if ($$1 < 0 || $$1 >= $$0.size() || $$0.get($$1).f() || $$2 <= 0) {
            return dlt.l;
        }
        return $$0.get($$1).a($$2);
    }

    public static dlt a(List<dlt> $$0, int $$1) {
        if ($$1 < 0 || $$1 >= $$0.size()) {
            return dlt.l;
        }
        return $$0.set($$1, dlt.l);
    }

    public static void a(fns $$0, jm<dlt> $$1) {
        ccw.a($$0, $$1, true);
    }

    public static void a(fns $$0, jm<dlt> $$1, boolean $$2) {
        fns.a<cdd> $$3 = $$0.a(a, cdd.a);
        for (int $$4 = 0; $$4 < $$1.size(); ++$$4) {
            dlt $$5 = $$1.get($$4);
            if ($$5.f()) continue;
            $$3.a(new cdd($$4, $$5));
        }
        if ($$3.a() && !$$2) {
            $$0.c(a);
        }
    }

    public static void a(fnq $$0, jm<dlt> $$1) {
        for (cdd $$2 : $$0.c(a, cdd.a)) {
            if (!$$2.a($$1.size())) continue;
            $$1.set($$2.a(), $$2.b());
        }
    }

    public static int a(ccv $$0, Predicate<dlt> $$1, int $$2, boolean $$3) {
        int $$4 = 0;
        for (int $$5 = 0; $$5 < $$0.b(); ++$$5) {
            dlt $$6 = $$0.a($$5);
            int $$7 = ccw.a($$6, $$1, $$2 - $$4, $$3);
            if ($$7 > 0 && !$$3 && $$6.f()) {
                $$0.a($$5, dlt.l);
            }
            $$4 += $$7;
        }
        return $$4;
    }

    public static int a(dlt $$0, Predicate<dlt> $$1, int $$2, boolean $$3) {
        if ($$0.f() || !$$1.test($$0)) {
            return 0;
        }
        if ($$3) {
            return $$0.N();
        }
        int $$4 = $$2 < 0 ? $$0.N() : Math.min($$2, $$0.N());
        $$0.h($$4);
        return $$4;
    }
}

