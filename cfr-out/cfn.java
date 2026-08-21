/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.jspecify.annotations.Nullable;

public final class cfn {
    public static yh a(cfm $$0, float $$1, float $$2) {
        if ($$0.b()) {
            return yh.c("effect.duration.infinite");
        }
        int $$3 = bgj.b((float)$$0.d() * $$1);
        return yh.b(bhi.a($$3, $$2));
    }

    public static boolean a(chl $$0) {
        return $$0.d(cfo.c) || $$0.d(cfo.C);
    }

    public static int b(chl $$0) {
        int $$1 = 0;
        int $$2 = 0;
        if ($$0.d(cfo.c)) {
            $$1 = $$0.e(cfo.c).e();
        }
        if ($$0.d(cfo.C)) {
            $$2 = $$0.e(cfo.C).e();
        }
        return Math.max($$1, $$2);
    }

    public static boolean c(chl $$0) {
        return $$0.d(cfo.m) || $$0.d(cfo.C) || $$0.d(cfo.N);
    }

    public static boolean d(chl $$0) {
        return !$$0.d(cfo.N) || $$0.d(cfo.m) || $$0.d(cfo.C);
    }

    public static List<axg> a(axf $$0, @Nullable cgk $$1, ftm $$22, double $$3, cfm $$4, int $$5) {
        jd<cfk> $$62 = $$4.c();
        List<axg> $$7 = $$0.a($$6 -> !(!$$6.h.d() || $$1 != null && $$1.t((cgk)$$6) || !$$22.a((jn)$$6.dI(), $$3) || $$6.d($$62) && $$6.e($$62).e() >= $$4.e() && !$$6.e($$62).a($$5 - 1)));
        $$7.forEach($$2 -> $$2.b(new cfm($$4), $$1));
        return $$7;
    }
}

