/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ecd
extends edt
implements ehg {
    public static final MapCodec<ecd> a = ecd.b(ecd::new);
    public static final int b = 3;
    public static final eph c = eox.be;
    public static final eoy d = eox.I;
    public static final int e = 5000;
    private static final fug g = dzq.a(10.0, 10.0, 0.0, 10.0);

    public MapCodec<ecd> a() {
        return a;
    }

    public ecd(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(f, iz.c)).b(c, 0)).b(d, false));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(f, c, d);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(d).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return g;
    }

    public int n(eoh $$0) {
        return $$0.c(c);
    }

    private boolean p(eoh $$0) {
        return this.n($$0) == 3;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$0.c(d).booleanValue()) {
            this.c($$0, $$1, $$2, $$3);
            return;
        }
        int $$4 = this.n($$0);
        if ($$4 > 0) {
            $$1.a($$2, (eoh)$$0.b(c, $$4 - 1), 2);
            $$1.a(etk.c, $$2, etk.a.a($$0));
        }
    }

    private void c(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!this.p($$0)) {
            $$1.a(null, $$2, bda.iS, bdb.e, 1.0f, 1.0f);
            $$1.a($$2, (eoh)$$0.b(c, this.n($$0) + 1), 2);
            $$1.a(etk.c, $$2, etk.a.a($$0));
        } else {
            this.a($$1, $$2, $$0);
        }
    }

    private void a(axf $$0, is $$1, eoh $$2) {
        $$0.a($$1, false);
        cwk $$3 = cgu.ai.a($$0, cgt.e);
        if ($$3 != null) {
            ftm $$4 = $$1.c();
            $$3.a_(true);
            float $$5 = iz.a((iz)$$2.c(f));
            $$3.r($$5);
            $$3.b($$4.a(), $$4.b(), $$4.c(), $$5, 0.0f);
            $$0.b($$3);
            $$0.a(null, $$3, bda.mh, bdb.e, 1.0f, 1.0f);
        }
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        double $$4 = (double)$$2.u() + 0.5;
        double $$5 = (double)$$2.v() + 0.5;
        double $$6 = (double)$$2.w() + 0.5;
        if (!$$0.c(d).booleanValue()) {
            if ($$3.a(40) == 0 && $$1.a_($$2.e()).a(bdp.cU)) {
                $$1.a($$4, $$5, $$6, bda.iO, bdb.e, 1.0f, 1.0f, false);
            }
            if ($$3.a(6) == 0) {
                $$1.a(ly.aj, $$4, $$5, $$6, 0.0, 0.02, 0.0);
            }
        } else {
            if ($$3.a(40) == 0) {
                $$1.a($$4, $$5, $$6, bda.iP, bdb.e, 1.0f, 1.0f, false);
            }
            if ($$3.a(6) == 0) {
                $$1.a(ly.R, $$4 + (double)(($$3.i() * 2.0f - 1.0f) / 3.0f), $$5 + 0.4, $$6 + (double)(($$3.i() * 2.0f - 1.0f) / 3.0f), 0.0, (double)$$3.i(), 0.0);
            }
        }
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (($$0.c(d).booleanValue() || $$0.c(c) > 0) && !$$1.q().a($$2, this)) {
            $$1.a($$2, (dzq)this, 5000);
        }
    }

    @Override
    public eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        boolean $$2 = $$1.a() == flc.c;
        return (eoh)((eoh)super.a($$0).b(d, $$2)).b(f, $$0.g().g());
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(d).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    public boolean a(dwp $$0, is $$1, eoh $$2, flb $$3) {
        if ($$2.c(eox.I).booleanValue() || $$3.a() != flc.c) {
            return false;
        }
        if (!$$0.B_()) {
            $$0.a($$1, (eoh)$$2.b(eox.I, true), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
            $$0.a(null, $$1, bda.iR, bdb.e, 1.0f, 1.0f);
        }
        return true;
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        $$0.a(null, $$1, $$2.c(d) != false ? bda.iR : bda.iQ, bdb.e, 1.0f, 1.0f);
    }

    @Override
    public boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

