/*
 * Decompiled with CFR 0.152.
 */
public class ccy {
    public static void a(dwo $$0, is $$1, ccv $$2) {
        ccy.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2);
    }

    public static void a(dwo $$0, cgk $$1, ccv $$2) {
        ccy.a($$0, $$1.dP(), $$1.dR(), $$1.dV(), $$2);
    }

    private static void a(dwo $$0, double $$1, double $$2, double $$3, ccv $$4) {
        for (int $$5 = 0; $$5 < $$4.b(); ++$$5) {
            ccy.a($$0, $$1, $$2, $$3, $$4.a($$5));
        }
    }

    public static void a(dwo $$0, is $$1, jm<dlt> $$22) {
        $$22.forEach($$2 -> ccy.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2));
    }

    public static void a(dwo $$0, double $$1, double $$2, double $$3, dlt $$4) {
        double $$5 = cgu.av.l();
        double $$6 = 1.0 - $$5;
        double $$7 = $$5 / 2.0;
        double $$8 = Math.floor($$1) + $$0.y.j() * $$6 + $$7;
        double $$9 = Math.floor($$2) + $$0.y.j() * $$6;
        double $$10 = Math.floor($$3) + $$0.y.j() * $$6 + $$7;
        while (!$$4.f()) {
            czl $$11 = new czl($$0, $$8, $$9, $$10, $$4.a($$0.y.a(21) + 10));
            float $$12 = 0.05f;
            $$11.m($$0.y.a(0.0, 0.11485000171139836), $$0.y.a(0.2, 0.11485000171139836), $$0.y.a(0.0, 0.11485000171139836));
            $$0.b($$11);
        }
    }

    public static void a(eoh $$0, dwo $$1, is $$2) {
        $$1.b($$2, $$0.b());
    }
}

