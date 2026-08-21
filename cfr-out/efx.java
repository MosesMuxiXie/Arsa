/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class efx
extends dzq {
    public static final MapCodec<efx> a = efx.b(efx::new);

    public MapCodec<efx> a() {
        return a;
    }

    protected efx(eog.d $$0) {
        super($$0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$32, ddm $$42, cdb $$5, fti $$6) {
        void $$8;
        if (!$$0.a(dlx.tZ)) {
            return super.a($$0, $$1, $$2, $$32, $$42, $$5, $$6);
        }
        if (!($$2 instanceof axf)) {
            return cdc.a;
        }
        axf $$7 = (axf)$$2;
        iz $$9 = $$6.c();
        iz $$10 = $$9.o() == iz.a.b ? $$42.dg().g() : $$9;
        efx.a((axf)$$8, fnv.aO, $$1, $$2.c_($$32), $$0, $$42, ($$3, $$4) -> {
            czl $$5 = new czl($$2, (double)$$32.u() + 0.5 + (double)$$10.j() * 0.65, (double)$$32.v() + 0.1, (double)$$32.w() + 0.5 + (double)$$10.l() * 0.65, (dlt)$$4);
            $$5.m(0.05 * (double)$$10.j() + $$0.y.j() * 0.02, 0.05, 0.05 * (double)$$10.l() + $$0.y.j() * 0.02);
            $$2.b($$5);
        });
        $$2.a(null, $$32, bda.xH, bdb.e, 1.0f, 1.0f);
        $$2.a($$32, (eoh)dzs.eJ.m().b(eam.b, $$10), 11);
        $$0.a(1, (chl)$$42, $$5.a());
        $$2.a((cgk)$$42, etk.M, $$32);
        $$42.b(bdk.c.b(dlx.tZ));
        return cdc.a;
    }
}

