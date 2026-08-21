/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public class bgm {
    public static void a(dwo $$0, is $$1, lw $$2, cch $$3) {
        for (iz $$4 : iz.values()) {
            bgm.a($$0, $$1, $$2, $$3, $$4, () -> bgm.a($$0.y), 0.55);
        }
    }

    public static void a(dwo $$0, is $$1, lw $$2, cch $$3, iz $$4, Supplier<ftm> $$5, double $$6) {
        int $$7 = $$3.a($$0.y);
        for (int $$8 = 0; $$8 < $$7; ++$$8) {
            bgm.a($$0, $$1, $$4, $$2, $$5.get(), $$6);
        }
    }

    private static ftm a(bgr $$0) {
        return new ftm(bgj.a($$0, -0.5, 0.5), bgj.a($$0, -0.5, 0.5), bgj.a($$0, -0.5, 0.5));
    }

    public static void a(iz.a $$0, dwo $$1, is $$2, double $$3, lw $$4, ccn $$5) {
        ftm $$6 = ftm.b($$2);
        boolean $$7 = $$0 == iz.a.a;
        boolean $$8 = $$0 == iz.a.b;
        boolean $$9 = $$0 == iz.a.c;
        int $$10 = $$5.a($$1.y);
        for (int $$11 = 0; $$11 < $$10; ++$$11) {
            double $$12 = $$6.g + bgj.a($$1.y, -1.0, 1.0) * ($$7 ? 0.5 : $$3);
            double $$13 = $$6.h + bgj.a($$1.y, -1.0, 1.0) * ($$8 ? 0.5 : $$3);
            double $$14 = $$6.i + bgj.a($$1.y, -1.0, 1.0) * ($$9 ? 0.5 : $$3);
            double $$15 = $$7 ? bgj.a($$1.y, -1.0, 1.0) : 0.0;
            double $$16 = $$8 ? bgj.a($$1.y, -1.0, 1.0) : 0.0;
            double $$17 = $$9 ? bgj.a($$1.y, -1.0, 1.0) : 0.0;
            $$1.a($$4, $$12, $$13, $$14, $$15, $$16, $$17);
        }
    }

    public static void a(dwo $$0, is $$1, iz $$2, lw $$3, ftm $$4, double $$5) {
        ftm $$6 = ftm.b($$1);
        int $$7 = $$2.j();
        int $$8 = $$2.k();
        int $$9 = $$2.l();
        double $$10 = $$6.g + ($$7 == 0 ? bgj.a($$0.y, -0.5, 0.5) : (double)$$7 * $$5);
        double $$11 = $$6.h + ($$8 == 0 ? bgj.a($$0.y, -0.5, 0.5) : (double)$$8 * $$5);
        double $$12 = $$6.i + ($$9 == 0 ? bgj.a($$0.y, -0.5, 0.5) : (double)$$9 * $$5);
        double $$13 = $$7 == 0 ? $$4.a() : 0.0;
        double $$14 = $$8 == 0 ? $$4.b() : 0.0;
        double $$15 = $$9 == 0 ? $$4.c() : 0.0;
        $$0.a($$3, $$10, $$11, $$12, $$13, $$14, $$15);
    }

    public static void a(dwo $$0, is $$1, bgr $$2, lw $$3) {
        double $$4 = (double)$$1.u() + $$2.j();
        double $$5 = (double)$$1.v() - 0.05;
        double $$6 = (double)$$1.w() + $$2.j();
        $$0.a($$3, $$4, $$5, $$6, 0.0, 0.0, 0.0);
    }

    public static void a(dwp $$0, is $$1, int $$2, lw $$3) {
        double $$4 = 0.5;
        eoh $$5 = $$0.a_($$1);
        double $$6 = $$5.l() ? 1.0 : $$5.f($$0, $$1).c(iz.a.b);
        bgm.a($$0, $$1, $$2, 0.5, $$6, true, $$3);
    }

    public static void a(dwp $$0, is $$1, int $$2, double $$3, double $$4, boolean $$5, lw $$6) {
        bgr $$7 = $$0.G_();
        for (int $$8 = 0; $$8 < $$2; ++$$8) {
            double $$9 = $$7.k() * 0.02;
            double $$10 = $$7.k() * 0.02;
            double $$11 = $$7.k() * 0.02;
            double $$12 = 0.5 - $$3;
            double $$13 = (double)$$1.u() + $$12 + $$7.j() * $$3 * 2.0;
            double $$14 = (double)$$1.v() + $$7.j() * $$4;
            double $$15 = (double)$$1.w() + $$12 + $$7.j() * $$3 * 2.0;
            if (!$$5 && $$0.a_(is.a($$13, $$14, $$15).e()).l()) continue;
            $$0.a($$6, $$13, $$14, $$15, $$9, $$10, $$11);
        }
    }

    public static void a(dwp $$0, is $$1, int $$2) {
        ftm $$3 = $$1.b().b(0.0, 0.5, 0.0);
        lp $$4 = new lp(ly.bf, $$0.a_($$1));
        int $$5 = 0;
        while ((float)$$5 < (float)$$2 / 3.0f) {
            double $$6 = $$3.g + $$0.G_().k() / 2.0;
            double $$7 = $$3.h;
            double $$8 = $$3.i + $$0.G_().k() / 2.0;
            double $$9 = $$0.G_().k() * (double)0.2f;
            double $$10 = $$0.G_().k() * (double)0.2f;
            double $$11 = $$0.G_().k() * (double)0.2f;
            $$0.a($$4, $$6, $$7, $$8, $$9, $$10, $$11);
            ++$$5;
        }
        int $$12 = 0;
        while ((float)$$12 < (float)$$2 / 1.5f) {
            double $$13 = $$3.g + 3.5 * Math.cos($$12) + $$0.G_().k() / 2.0;
            double $$14 = $$3.h;
            double $$15 = $$3.i + 3.5 * Math.sin($$12) + $$0.G_().k() / 2.0;
            double $$16 = $$0.G_().k() * (double)0.05f;
            double $$17 = $$0.G_().k() * (double)0.05f;
            double $$18 = $$0.G_().k() * (double)0.05f;
            $$0.a($$4, $$13, $$14, $$15, $$16, $$17, $$18);
            ++$$12;
        }
    }
}

