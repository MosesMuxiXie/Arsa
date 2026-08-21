/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public final class cki {
    public static Optional<ftm> a(chn $$0, ftm $$1, float $$2, int $$3, boolean $$4) {
        ftm $$5 = $$0.dI();
        ftm $$6 = new ftm($$1.g - $$5.g, 0.0, $$1.i - $$5.i).d().c(0.5);
        ftm $$7 = $$1.d($$6);
        ftm $$8 = $$7.d($$5);
        float $$9 = (float)$$3 * (float)Math.PI / 180.0f;
        double $$10 = Math.atan2($$8.i, $$8.g);
        double $$11 = $$8.a(0.0, $$8.h, 0.0).h();
        double $$12 = Math.sqrt($$11);
        double $$13 = $$8.h;
        double $$14 = $$0.bt();
        double $$15 = Math.sin(2.0f * $$9);
        double $$16 = Math.pow(Math.cos($$9), 2.0);
        double $$17 = Math.sin($$9);
        double $$18 = Math.cos($$9);
        double $$19 = Math.sin($$10);
        double $$20 = Math.cos($$10);
        double $$21 = $$11 * $$14 / ($$12 * $$15 - 2.0 * $$13 * $$16);
        if ($$21 < 0.0) {
            return Optional.empty();
        }
        double $$22 = Math.sqrt($$21);
        if ($$22 > (double)$$2) {
            return Optional.empty();
        }
        double $$23 = $$22 * $$18;
        double $$24 = $$22 * $$17;
        if ($$4) {
            int $$25 = bgj.e($$12 / $$23) * 2;
            double $$26 = 0.0;
            ftm $$27 = null;
            cgn $$28 = $$0.a(chx.g);
            for (int $$29 = 0; $$29 < $$25 - 1; ++$$29) {
                double $$30 = $$17 / $$18 * ($$26 += $$12 / (double)$$25) - Math.pow($$26, 2.0) * $$14 / (2.0 * $$21 * Math.pow($$18, 2.0));
                double $$31 = $$26 * $$20;
                double $$32 = $$26 * $$19;
                ftm $$33 = new ftm($$5.g + $$31, $$5.h + $$30, $$5.i + $$32);
                if ($$27 != null && !cki.a($$0, $$28, $$27, $$33)) {
                    return Optional.empty();
                }
                $$27 = $$33;
            }
        }
        return Optional.of(new ftm($$23 * $$20, $$24, $$23 * $$19).c((double)0.95f));
    }

    private static boolean a(chn $$0, cgn $$1, ftm $$2, ftm $$3) {
        ftm $$4 = $$3.d($$2);
        double $$5 = Math.min($$1.a(), $$1.b());
        int $$6 = bgj.e($$4.g() / $$5);
        ftm $$7 = $$4.d();
        ftm $$8 = $$2;
        for (int $$9 = 0; $$9 < $$6; ++$$9) {
            ftm ftm2 = $$8 = $$9 == $$6 - 1 ? $$3 : $$8.e($$7.c($$5 * (double)0.9f));
            if ($$0.ao().a((cgk)$$0, $$1.a($$8))) continue;
            return false;
        }
        return true;
    }
}

