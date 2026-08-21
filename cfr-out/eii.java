/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eii
extends ejg
implements dzt {
    public static final MapCodec<eii> a = eii.b(eii::new);
    private static final float d = 0.003f;
    public static final int b = 3;
    public static final eph c = eox.aw;
    private static final fug e = dzq.b(10.0, 0.0, 8.0);
    private static final fug f = dzq.b(14.0, 0.0, 16.0);

    public MapCodec<eii> a() {
        return a;
    }

    public eii(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(c, 0));
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return new dlt(dlx.za);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return switch ($$0.c(c)) {
            case 0 -> e;
            case 3 -> fud.b();
            default -> f;
        };
    }

    @Override
    protected boolean f(eoh $$0) {
        return $$0.c(c) < 3;
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        int $$4 = $$0.c(c);
        if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
            eoh $$5 = (eoh)$$0.b(c, $$4 + 1);
            $$1.a($$2, $$5, 2);
            $$1.a(etk.c, $$2, etk.a.a($$5));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        ftm $$8;
        block7: {
            block6: {
                if (!($$3 instanceof chl) || $$3.ay() == cgu.ae || $$3.ay() == cgu.n) {
                    return;
                }
                $$3.a($$0, new ftm(0.8f, 0.75, 0.8f));
                if (!($$1 instanceof axf)) break block6;
                axf $$6 = (axf)$$1;
                if ($$0.c(c) != 0) break block7;
            }
            return;
        }
        ftm ftm2 = $$8 = $$3.aa_() ? $$3.ag() : $$3.bS().d($$3.dI());
        if ($$8.j() > 0.0) {
            double $$9 = Math.abs($$8.a());
            double $$10 = Math.abs($$8.c());
            if ($$9 >= (double)0.003f || $$10 >= (double)0.003f) {
                void $$7;
                $$3.a((axf)$$7, $$1.as().u(), 1.0f);
            }
        }
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        boolean $$8;
        int $$7 = $$1.c(c);
        boolean bl2 = $$8 = $$7 == 3;
        if (!$$8 && $$0.a(dlx.tC)) {
            return cdc.e;
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$12, is $$22, ddm $$3, fti $$4) {
        if ($$0.c(c) > 1) {
            if ($$12 instanceof axf) {
                axf $$5 = (axf)$$12;
                dzq.a($$5, fnv.aM, $$0, $$12.c_($$22), null, $$3, ($$1, $$2) -> dzq.a((dwo)$$1, $$22, $$2));
                $$5.a(null, $$22, bda.CK, bdb.e, 1.0f, 0.8f + $$5.y.i() * 0.4f);
                eoh $$6 = (eoh)$$0.b(c, 1);
                $$5.a($$22, $$6, 2);
                $$5.a(etk.c, $$22, etk.a.a($$3, $$6));
            }
            return cdc.a;
        }
        return super.a($$0, $$12, $$22, $$3, $$4);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{c});
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return $$2.c(c) < 3;
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        int $$4 = Math.min(3, $$3.c(c) + 1);
        $$0.a($$2, (eoh)$$3.b(c, $$4), 2);
    }
}

