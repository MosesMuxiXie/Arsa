/*
 * Decompiled with CFR 0.152.
 */
public interface day {
    public static final int p_ = 10;
    public static final float q_ = 0.2f;

    public int gQ();

    public static boolean a(axf $$0, chl $$1, chl $$2) {
        float $$5;
        float $$3 = (float)$$1.i(cis.d);
        if (!$$1.e_() && (int)$$3 > 0) {
            float $$4 = $$3 / 2.0f + (float)$$0.y.a((int)$$3);
        } else {
            $$5 = $$3;
        }
        cex $$6 = $$1.en().b($$1);
        boolean $$7 = $$2.a($$0, $$6, $$5);
        if ($$7) {
            dsq.a($$0, (cgk)$$2, $$6);
            if (!$$1.e_()) {
                day.a($$1, $$2);
            }
        }
        return $$7;
    }

    public static void a(chl $$0, chl $$1) {
        double $$3;
        double $$2 = $$0.i(cis.e);
        double $$4 = $$2 - ($$3 = $$1.i(cis.r));
        if ($$4 <= 0.0) {
            return;
        }
        double $$5 = $$1.dP() - $$0.dP();
        double $$6 = $$1.dV() - $$0.dV();
        float $$7 = $$0.ao().y.a(21) - 10;
        double $$8 = $$4 * (double)($$0.ao().y.i() * 0.5f + 0.2f);
        ftm $$9 = new ftm($$5, 0.0, $$6).d().c($$8).b($$7);
        double $$10 = $$4 * (double)$$0.ao().y.i() * 0.5;
        $$1.i($$9.g, $$10, $$9.i);
        $$1.ah = true;
    }
}

