/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class dnk
extends dlp
implements dmn {
    public static final int a = 10;
    public static final float b = 8.0f;
    public static final float c = 2.5f;

    public dnk(dlp.a $$0) {
        super($$0);
    }

    public static don b() {
        return don.a().a(cis.d, new ciq(h, 8.0, ciq.a.a), cgw.b).a(cis.f, new ciq(i, -2.9f, ciq.a.a), cgw.b).a();
    }

    public static dpc c() {
        return new dpc(List.of(), 1.0f, 2, false);
    }

    @Override
    public dlv b(dlt $$0) {
        return dlv.f;
    }

    @Override
    public int a(dlt $$0, chl $$1) {
        return 72000;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(dlt $$0, dwo $$1, chl $$2, int $$3) {
        void $$5;
        if (!($$2 instanceof ddm)) {
            return false;
        }
        ddm $$4 = (ddm)$$2;
        int $$6 = this.a($$0, $$2) - $$3;
        if ($$6 < 10) {
            return false;
        }
        float $$7 = dsq.a($$0, (chl)$$5);
        if ($$7 > 0.0f && !$$5.bA()) {
            return false;
        }
        if ($$0.r()) {
            return false;
        }
        jd<bcz> $$8 = dsq.b($$0, dsp.D).orElse(bda.CY);
        $$5.b(bdk.c.b(this));
        if ($$1 instanceof axf) {
            axf $$9 = (axf)$$1;
            $$0.a(1, (ddm)$$5);
            if ($$7 == 0.0f) {
                dlt $$10 = $$0.b(1, (chl)$$5);
                dek $$11 = dec.a(dek::new, $$9, $$10, (chl)$$5, 0.0f, 2.5f, 1.0f);
                if ($$5.gv()) {
                    $$11.c = deh.a.c;
                }
                $$1.a(null, $$11, $$8.a(), bdb.h, 1.0f, 1.0f);
                return true;
            }
        }
        if ($$7 > 0.0f) {
            float $$12 = $$5.ec();
            float $$13 = $$5.ee();
            float $$14 = -bgj.a((double)($$12 * ((float)Math.PI / 180))) * bgj.b((double)($$13 * ((float)Math.PI / 180)));
            float $$15 = -bgj.a((double)($$13 * ((float)Math.PI / 180)));
            float $$16 = bgj.b((double)($$12 * ((float)Math.PI / 180))) * bgj.b((double)($$13 * ((float)Math.PI / 180)));
            float $$17 = bgj.a($$14 * $$14 + $$15 * $$15 + $$16 * $$16);
            $$5.i($$14 *= $$7 / $$17, $$15 *= $$7 / $$17, $$16 *= $$7 / $$17);
            $$5.a(20, 8.0f, $$0);
            if ($$5.aV()) {
                float $$18 = 1.1999999f;
                $$5.a(chp.a, new ftm(0.0, 1.1999999284744263, 0.0));
            }
            $$1.a(null, (cgk)$$5, $$8.a(), bdb.h, 1.0f, 1.0f);
            return true;
        }
        return false;
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        dlt $$3 = $$1.b($$2);
        if ($$3.r()) {
            return cdc.d;
        }
        if (dsq.a($$3, (chl)$$1) > 0.0f && !$$1.bA()) {
            return cdc.d;
        }
        $$1.c($$2);
        return cdc.c;
    }

    @Override
    public dec a(dwo $$0, jn $$1, dlt $$2, iz $$3) {
        dek $$4 = new dek($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
        $$4.c = deh.a.b;
        return $$4;
    }
}

