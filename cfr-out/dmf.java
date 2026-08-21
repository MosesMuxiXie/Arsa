/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class dmf
extends dlp {
    private static final int c = 5;
    private static final float d = -3.4f;
    public static final float a = 1.5f;
    private static final float o = 5.0f;
    public static final float b = 3.5f;
    private static final float p = 0.7f;

    public dmf(dlp.a $$0) {
        super($$0);
    }

    public static don a() {
        return don.a().a(cis.d, new ciq(h, 5.0, ciq.a.a), cgw.b).a(cis.f, new ciq(i, -3.4f, ciq.a.a), cgw.b).a();
    }

    public static dpc b() {
        return new dpc(List.of(), 1.0f, 2, false);
    }

    @Override
    public void a(dlt $$0, chl $$1, chl $$2) {
        if (dmf.b($$2)) {
            axf $$3 = (axf)$$2.ao();
            $$2.k($$2.dN().a(iz.a.b, (double)0.01f));
            if ($$2 instanceof axg) {
                axg $$4 = (axg)$$2;
                $$4.cz = this.a($$4);
                $$4.w(true);
                $$4.g.b(new agr($$4));
            }
            if ($$1.aV()) {
                if ($$2 instanceof axg) {
                    axg $$5 = (axg)$$2;
                    $$5.b(true);
                }
                bcz $$6 = $$2.an > 5.0 ? bda.qE : bda.qD;
                $$3.a(null, $$2.dP(), $$2.dR(), $$2.dV(), $$6, $$2.dB(), 1.0f, 1.0f);
            } else {
                $$3.a(null, $$2.dP(), $$2.dR(), $$2.dV(), bda.qC, $$2.dB(), 1.0f, 1.0f);
            }
            dmf.a((dwo)$$3, (cgk)$$2, (cgk)$$1);
        }
    }

    private ftm a(axg $$0) {
        if ($$0.ho() && $$0.cz != null && $$0.cz.h <= $$0.dI().h) {
            return $$0.cz;
        }
        return $$0.dI();
    }

    @Override
    public void b(dlt $$0, chl $$1, chl $$2) {
        if (dmf.b($$2)) {
            $$2.l();
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public float a(cgk $$0, float $$1, cex $$2) {
        double $$10;
        void $$4;
        cgk cgk2 = $$2.c();
        if (!(cgk2 instanceof chl)) {
            return 0.0f;
        }
        chl $$3 = (chl)cgk2;
        if (!dmf.b((chl)$$4)) {
            return 0.0f;
        }
        double $$5 = 3.0;
        double $$6 = 8.0;
        double $$7 = $$4.an;
        if ($$7 <= 3.0) {
            double $$8 = 4.0 * $$7;
        } else if ($$7 <= 8.0) {
            double $$9 = 12.0 + 2.0 * ($$7 - 3.0);
        } else {
            $$10 = 22.0 + $$7 - 8.0;
        }
        dwo dwo2 = $$4.ao();
        if (dwo2 instanceof axf) {
            axf $$11 = (axf)dwo2;
            return (float)($$10 + (double)dsq.b($$11, $$4.eq(), $$0, $$2, 0.0f) * $$7);
        }
        return (float)$$10;
    }

    private static void a(dwo $$0, cgk $$1, cgk $$22) {
        $$0.c(2013, $$22.bg(), 750);
        $$0.a(chl.class, $$22.dj().g(3.5), dmf.a($$1, $$22)).forEach($$2 -> {
            ftm $$3 = $$2.dI().d($$22.dI());
            double $$4 = dmf.a($$1, $$2, $$3);
            ftm $$5 = $$3.d().c($$4);
            if ($$4 > 0.0) {
                $$2.i($$5.g, 0.7f, $$5.i);
                if ($$2 instanceof axg) {
                    axg $$6 = (axg)$$2;
                    $$6.g.b(new agr($$6));
                }
            }
        });
    }

    private static Predicate<chl> a(cgk $$0, cgk $$1) {
        return arg_0 -> dmf.a($$0, $$1, arg_0);
    }

    private static double a(cgk $$0, chl $$1, ftm $$2) {
        return (3.5 - $$2.g()) * (double)0.7f * (double)($$0.an > 5.0 ? 2 : 1) * (1.0 - $$1.i(cis.r));
    }

    public static boolean b(chl $$0) {
        return $$0.an > 1.5 && !$$0.gj();
    }

    @Override
    public @Nullable cex a(chl $$0) {
        if (dmf.b($$0)) {
            return $$0.en().f($$0);
        }
        return super.a($$0);
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ boolean a(cgk $$0, cgk $$1, chl $$2) {
        $$3 = $$2.au() == false;
        $$4 = $$2 != $$0 && $$2 != $$1;
        v0 = $$5 = $$0.t($$2) == false;
        if (!($$2 instanceof cii)) ** GOTO lbl-1000
        $$6 = (cii)$$2;
        if (!($$1 instanceof chl)) ** GOTO lbl-1000
        $$7 = (chl)$$1;
        if ($$6.p() && $$6.j($$7)) {
            v1 = true;
        } else lbl-1000:
        // 3 sources

        {
            v1 = false;
        }
        $$8 = v1 == false;
        $$11 = $$2 instanceof cyy == false || ($$9 = (cyy)$$2).r() == false;
        $$12 = $$1.g($$2) <= Math.pow(3.5, 2.0);
        $$14 = ($$2 instanceof ddm != false && ($$13 = (ddm)$$2).ha() != false && $$13.gL().b != false) == false;
        return $$3 != false && $$4 != false && $$5 != false && $$8 != false && $$11 != false && $$12 != false && $$14 != false;
    }
}

