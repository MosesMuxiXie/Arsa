/*
 * Decompiled with CFR 0.152.
 */
public class dan {
    private static final double a = 50.0;

    public static ftm a(chl $$0, bgr $$1) {
        int $$2 = 90;
        float $$3 = $$0.bE + 180.0f + (float)$$1.k() * 90.0f / 2.0f;
        float $$4 = bgj.h($$1.i(), 4.0f, 8.0f);
        ftm $$5 = ftm.a(0.0f, $$3).c((double)$$4);
        return $$0.dI().e($$5);
    }

    public static boolean a(dal $$0, ftm $$1) {
        ftm $$2 = new ftm($$0.dP(), $$0.dR(), $$0.dV());
        if ($$1.f($$2) > dan.a($$0)) {
            return false;
        }
        return $$0.ao().a(new dvw($$2, $$1, dvw.a.a, dvw.b.a, $$0)).d() == ftk.a.a;
    }

    private static double a(dal $$0) {
        return Math.max(50.0, $$0.i(cis.o));
    }
}

