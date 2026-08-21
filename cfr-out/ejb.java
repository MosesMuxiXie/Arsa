/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ejb
extends dzq {
    public static final MapCodec<ejb> a = ejb.b(ejb::new);
    public static final eph b = eox.aI;
    public static final eph c = eox.aH;
    public static final int d = 2;
    public static final int e = 1;
    public static final int f = 4;
    private static final fug g = dzq.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
    private static final fug h = dzq.b(14.0, 0.0, 7.0);

    public MapCodec<ejb> a() {
        return a;
    }

    public ejb(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, 0)).b(c, 1));
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, cgk $$3) {
        if (!$$3.cv()) {
            this.a($$0, $$2, $$1, $$3, 100);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(dwo $$0, eoh $$1, is $$2, cgk $$3, double $$4) {
        if (!($$3 instanceof dcn)) {
            this.a($$0, $$1, $$2, $$3, 3);
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    private void a(dwo $$0, eoh $$1, is $$2, cgk $$3, int $$4) {
        axf $$5;
        if ($$1.a(dzs.nb) && $$0 instanceof axf && this.a($$5 = (axf)$$0, $$3) && $$0.y.a($$4) == 0) {
            this.a((dwo)$$5, $$2, $$1);
        }
    }

    private void a(dwo $$0, is $$1, eoh $$2) {
        $$0.a(null, $$1, bda.DA, bdb.e, 0.7f, 0.9f + $$0.y.i() * 0.2f);
        int $$3 = $$2.c(c);
        if ($$3 <= 1) {
            $$0.b($$1, false);
        } else {
            $$0.a($$1, (eoh)$$2.b(c, $$3 - 1), 2);
            $$0.a(etk.f, $$1, etk.a.a($$2));
            $$0.c(2001, $$1, dzq.j($$2));
        }
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (this.a((dwo)$$1, $$2) && ejb.a($$1, $$2)) {
            int $$4 = $$0.c(b);
            if ($$4 < 2) {
                $$1.a(null, $$2, bda.DB, bdb.e, 0.7f, 0.9f + $$3.i() * 0.2f);
                $$1.a($$2, (eoh)$$0.b(b, $$4 + 1), 2);
                $$1.a(etk.c, $$2, etk.a.a($$0));
            } else {
                $$1.a(null, $$2, bda.DC, bdb.e, 0.7f, 0.9f + $$3.i() * 0.2f);
                $$1.a($$2, false);
                $$1.a(etk.f, $$2, etk.a.a($$0));
                for (int $$5 = 0; $$5 < $$0.c(c); ++$$5) {
                    $$1.c(2001, $$2, dzq.j($$0));
                    cxs $$6 = cgu.bJ.a($$1, cgt.e);
                    if ($$6 == null) continue;
                    $$6.d_(-24000);
                    $$6.h($$2);
                    $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, $$2.v(), (double)$$2.w() + 0.3, 0.0f, 0.0f);
                    $$1.b($$6);
                }
            }
        }
    }

    public static boolean a(dvt $$0, is $$1) {
        return ejb.b($$0, $$1.e());
    }

    public static boolean b(dvt $$0, is $$1) {
        return $$0.a_($$1).a(bdp.F);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if (ejb.a($$1, $$2) && !$$1.B_()) {
            $$1.c(2012, $$2, 15);
        }
    }

    private boolean a(dwo $$0, is $$1) {
        float $$2 = $$0.c().a(ceg.I, $$1).floatValue();
        return $$2 > 0.0f && $$0.y.i() < $$2;
    }

    @Override
    public void a(dwo $$0, ddm $$1, is $$2, eoh $$3, @Nullable elb $$4, dlt $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        this.a($$0, $$2, $$3);
    }

    @Override
    protected boolean a(eoh $$0, dpu $$1) {
        if (!$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4) {
            return true;
        }
        return super.a($$0, $$1);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        eoh $$1 = $$0.q().a_($$0.a());
        if ($$1.a(this)) {
            return (eoh)$$1.b(c, Math.min(4, $$1.c(c) + 1));
        }
        return super.a($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return $$0.c(c) == 1 ? g : h;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c);
    }

    private boolean a(axf $$0, cgk $$1) {
        if ($$1 instanceof cxs || $$1 instanceof cte) {
            return false;
        }
        if ($$1 instanceof chl) {
            return $$1 instanceof ddm || $$0.U().a(eua.F) != false;
        }
        return false;
    }
}

