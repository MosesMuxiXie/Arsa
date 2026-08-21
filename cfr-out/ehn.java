/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ehn
extends dzq {
    public static final MapCodec<ehn> a = ehn.b(ehn::new);
    public static final int b = 2;
    public static final eph c = eox.aI;
    private static final int d = 24000;
    private static final int e = 12000;
    private static final int f = 300;
    private static final fug g = dzq.a(14.0, 12.0, 0.0, 16.0);

    public MapCodec<ehn> a() {
        return a;
    }

    public ehn(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(c, 0));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{c});
    }

    @Override
    public fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return g;
    }

    public int p(eoh $$0) {
        return $$0.c(c);
    }

    private boolean r(eoh $$0) {
        return this.p($$0) == 2;
    }

    @Override
    public void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!this.r($$0)) {
            $$1.a(null, $$2, bda.BQ, bdb.e, 0.7f, 0.9f + $$3.i() * 0.2f);
            $$1.a($$2, (eoh)$$0.b(c, this.p($$0) + 1), 2);
            return;
        }
        $$1.a(null, $$2, bda.BR, bdb.e, 0.7f, 0.9f + $$3.i() * 0.2f);
        $$1.b($$2, false);
        cxm $$4 = cgu.br.a($$1, cgt.e);
        if ($$4 != null) {
            ftm $$5 = $$2.b();
            $$4.a_(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), bgj.f($$1.y.i() * 360.0f), 0.0f);
            $$1.b($$4);
        }
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        boolean $$5 = ehn.a($$1, $$2);
        if (!$$1.B_() && $$5) {
            $$1.c(3009, $$2, 0);
        }
        int $$6 = $$5 ? 12000 : 24000;
        int $$7 = $$6 / 3;
        $$1.a(etk.i, $$2, etk.a.a($$0));
        $$1.a($$2, (dzq)this, $$7 + $$1.y.a(300));
    }

    @Override
    public boolean a(eoh $$0, flq $$1) {
        return false;
    }

    public static boolean a(dvt $$0, is $$1) {
        return $$0.a_($$1.e()).a(bdp.cK);
    }
}

