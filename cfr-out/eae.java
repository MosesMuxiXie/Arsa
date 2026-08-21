/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eae
extends dzq {
    public static final MapCodec<eae> a = eae.b(eae::new);
    public static final int b = 6;
    public static final eph c = eox.aC;
    public static final int d = eae.b(0);
    private static final fug[] e = dzq.a(6, (int $$0) -> dzq.a(1 + $$0 * 2, 0.0, 1.0, 15.0, 8.0, 15.0));

    public MapCodec<eae> a() {
        return a;
    }

    protected eae(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(c, 0));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return e[$$0.c(c)];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        void $$9;
        dzq dzq2;
        dlp $$7 = $$0.h();
        if (!$$0.a(bdy.U) || $$1.c(c) != 0 || !((dzq2 = dzq.a($$7)) instanceof eah)) {
            return cdc.f;
        }
        eah $$8 = (eah)dzq2;
        $$0.a(1, (chl)$$4);
        $$2.a(null, $$3, bda.dH, bdb.e, 1.0f, 1.0f);
        $$2.c($$3, eai.a((eah)$$9));
        $$2.a((cgk)$$4, etk.c, $$3);
        $$4.b(bdk.c.b($$7));
        return cdc.a;
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if ($$1.B_()) {
            if (eae.a((dwp)$$1, $$2, $$0, $$3).a()) {
                return cdc.a;
            }
            if ($$3.b(cdb.a).f()) {
                return cdc.c;
            }
        }
        return eae.a((dwp)$$1, $$2, $$0, $$3);
    }

    protected static cdc a(dwp $$0, is $$1, eoh $$2, ddm $$3) {
        if (!$$3.u(false)) {
            return cdc.e;
        }
        $$3.a(bdk.W);
        $$3.gW().a(2, 0.1f);
        int $$4 = $$2.c(c);
        $$0.a((cgk)$$3, etk.m, $$1);
        if ($$4 < 6) {
            $$0.a($$1, (eoh)$$2.b(c, $$4 + 1), 3);
        } else {
            $$0.a($$1, false);
            $$0.a((cgk)$$3, etk.f, $$1);
        }
        return cdc.a;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.a && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return $$1.a_($$2.e()).e();
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{c});
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        return eae.b($$0.c(c));
    }

    public static int b(int $$0) {
        return (7 - $$0) * 2;
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

