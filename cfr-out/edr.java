/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class edr
extends edm {
    public static final MapCodec<edr> a = edr.b(edr::new);
    private static final double b = 0.13;
    private static final double c = 0.08;
    private static final double e = 0.05;
    private static final int f = 20;
    private static final fug g = dzq.b(14.0, 0.0, 15.0);

    public MapCodec<edr> a() {
        return a;
    }

    public edr(eog.d $$0) {
        super($$0);
    }

    private static boolean c(cgk $$0) {
        return $$0 instanceof chl || $$0 instanceof dgi || $$0 instanceof czm || $$0 instanceof dgb;
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return g;
    }

    @Override
    public void a(dwo $$0, eoh $$1, is $$2, cgk $$3, double $$4) {
        $$3.a(bda.oy, 1.0f, 1.0f);
        if (!$$0.B_()) {
            $$0.a($$3, (byte)54);
        }
        if ($$3.a($$4, 0.2f, $$0.as().l())) {
            $$3.a(this.I.g(), this.I.a() * 0.5f, this.I.b() * 0.75f);
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if (this.a($$2, $$3)) {
            this.a($$3, $$2);
            this.d($$3);
            this.a($$1, $$3);
        }
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    private static double b(double $$0) {
        return $$0 / (double)0.98f + 0.08;
    }

    private static double c(double $$0) {
        return ($$0 - 0.08) * (double)0.98f;
    }

    private boolean a(is $$0, cgk $$1) {
        if ($$1.aV()) {
            return false;
        }
        if ($$1.dR() > (double)$$0.v() + 0.9375 - 1.0E-7) {
            return false;
        }
        if (edr.b($$1.dN().h) >= -0.08) {
            return false;
        }
        double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dP());
        double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dV());
        double $$4 = 0.4375 + (double)($$1.dF() / 2.0f);
        return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
    }

    private void a(cgk $$0, is $$1) {
        if ($$0 instanceof axg && $$0.ao().au() % 20L == 0L) {
            aj.L.a((axg)$$0, $$0.ao().a_($$1));
        }
    }

    private void d(cgk $$0) {
        ftm $$1 = $$0.dN();
        if (edr.b($$0.dN().h) < -0.13) {
            double $$2 = -0.05 / edr.b($$0.dN().h);
            $$0.k(new ftm($$1.g * $$2, edr.c(-0.05), $$1.i * $$2));
        } else {
            $$0.k(new ftm($$1.g, edr.c(-0.05), $$1.i));
        }
        $$0.l();
    }

    private void a(dwo $$0, cgk $$1) {
        if (edr.c($$1)) {
            if ($$0.y.a(5) == 0) {
                $$1.a(bda.oy, 1.0f, 1.0f);
            }
            if (!$$0.B_() && $$0.y.a(5) == 0) {
                $$0.a($$1, (byte)53);
            }
        }
    }

    public static void a(cgk $$0) {
        edr.a($$0, 5);
    }

    public static void b(cgk $$0) {
        edr.a($$0, 10);
    }

    private static void a(cgk $$0, int $$1) {
        if (!$$0.ao().B_()) {
            return;
        }
        eoh $$2 = dzs.qg.m();
        for (int $$3 = 0; $$3 < $$1; ++$$3) {
            $$0.ao().a(new lp(ly.b, $$2), $$0.dP(), $$0.dR(), $$0.dV(), 0.0, 0.0, 0.0);
        }
    }
}

