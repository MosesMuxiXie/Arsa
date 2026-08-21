/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class egt
extends dzc
implements ehg {
    public static final MapCodec<egt> c = egt.b(egt::new);
    public static final int d = 30;
    public static final int e = 10;
    public static final epf<epo> f = eox.bt;
    public static final eph g = eox.aX;
    public static final eoy h = eox.I;
    private static final fug a = dzq.b(16.0, 0.0, 8.0);
    private static final float[] b = bhs.a(new float[16], (? super T $$0) -> {
        int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};
        for (int $$2 = 0; $$2 < 16; ++$$2) {
            $$0[$$2] = efi.b($$1[$$2]);
        }
    });

    public MapCodec<? extends egt> a() {
        return c;
    }

    public egt(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(f, epo.a)).b(g, 0)).b(h, false));
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        is $$1 = $$0.a();
        flb $$2 = $$0.q().b_($$1);
        return (eoh)this.m().b(h, $$2.a() == flc.c);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(h).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (egt.p($$0) != epo.b) {
            if (egt.p($$0) == epo.c) {
                $$1.a($$2, (eoh)$$0.b(f, epo.a), 3);
                if (!$$0.c(h).booleanValue()) {
                    $$1.a(null, $$2, bda.zc, bdb.e, 1.0f, $$1.y.i() * 0.2f + 0.8f);
                }
            }
            return;
        }
        egt.a((dwo)$$1, $$2, $$0);
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, cgk $$3) {
        elb $$4;
        if (!$$0.B_() && egt.r($$2) && $$3.ay() != cgu.bO && ($$4 = $$0.c_($$1)) instanceof emo) {
            emo $$5 = (emo)$$4;
            if ($$0 instanceof axf) {
                axf $$6 = (axf)$$0;
                if ($$5.gT().a($$6, $$1, etk.P, etk.a.a($$2))) {
                    $$5.f().b($$6, etk.P, etk.a.a($$3), $$3.dI());
                }
            }
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$1.B_() || $$0.a($$3.b())) {
            return;
        }
        if ($$0.c(g) > 0 && !$$1.af().a($$2, this)) {
            $$1.a($$2, (eoh)$$0.b(g, 0), 18);
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        if (egt.p($$0) == epo.b) {
            egt.b($$1, $$2, $$0);
        }
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(h).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    private static void b(dwo $$0, is $$1, eoh $$2) {
        dzq $$3 = $$2.b();
        $$0.a($$1, $$3);
        $$0.a($$1.e(), $$3);
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new emo($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$02, eoh $$12, eld<T> $$22) {
        if (!$$02.B_()) {
            return egt.a($$22, eld.J, (dwo $$0, is $$1, eoh $$2, ? super E $$3) -> ett.c.a($$0, $$3.gS(), $$3.gT()));
        }
        return null;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return a;
    }

    @Override
    protected boolean f_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return $$0.c(g);
    }

    @Override
    public int b(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if ($$3 == iz.b) {
            return $$0.a($$1, $$2, $$3);
        }
        return 0;
    }

    public static epo p(eoh $$0) {
        return $$0.c(f);
    }

    public static boolean r(eoh $$0) {
        return egt.p($$0) == epo.a;
    }

    public static void a(dwo $$0, is $$1, eoh $$2) {
        $$0.a($$1, (eoh)((eoh)$$2.b(f, epo.c)).b(g, 0), 3);
        $$0.a($$1, $$2.b(), 10);
        egt.b($$0, $$1, $$2);
    }

    @VisibleForTesting
    public int c() {
        return 30;
    }

    public void a(@Nullable cgk $$0, dwo $$1, is $$2, eoh $$3, int $$4, int $$5) {
        $$1.a($$2, (eoh)((eoh)$$3.b(f, epo.b)).b(g, $$4), 3);
        $$1.a($$2, $$3.b(), this.c());
        egt.b($$1, $$2, $$3);
        egt.a($$0, $$1, $$2, $$5);
        $$1.a($$0, etk.L, $$2);
        if (!$$3.c(h).booleanValue()) {
            $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, bda.zb, bdb.e, 1.0f, $$1.y.i() * 0.2f + 0.8f);
        }
    }

    public static void a(@Nullable cgk $$0, dwo $$1, is $$2, int $$3) {
        for (iz $$4 : iz.values()) {
            is $$5 = $$2.a($$4);
            eoh $$6 = $$1.a_($$5);
            if (!$$6.a(bdp.ck)) continue;
            $$1.a(ett.b($$3), $$5, etk.a.a($$0, $$6));
            float $$7 = b[$$3];
            $$1.a(null, $$5, bda.I, bdb.e, 1.0f, $$7);
        }
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        if (egt.p($$0) != epo.b) {
            return;
        }
        iz $$4 = iz.b($$3);
        if ($$4 == iz.b || $$4 == iz.a) {
            return;
        }
        double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
        double $$6 = (double)$$2.v() + 0.25;
        double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
        double $$8 = (double)$$3.i() * 0.04;
        $$1.a(lr.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(f, g, h);
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        elb $$4 = $$1.c_($$2);
        if ($$4 instanceof emo) {
            emo $$5 = (emo)$$4;
            return egt.p($$0) == epo.b ? $$5.d() : 0;
        }
        return 0;
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    @Override
    protected boolean g_(eoh $$0) {
        return true;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dlt $$3, boolean $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$4) {
            this.a($$1, $$2, $$3, cce.a(5));
        }
    }
}

