/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dkh
extends dlp
implements dkp {
    private final fla a;

    public dkh(fla $$0, dlp.a $$1) {
        super($$1);
        this.a = $$0;
    }

    @Override
    public cdc a(dwo $$0, ddm $$12, cdb $$2) {
        dlt $$3 = $$12.b($$2);
        fti $$4 = dkh.a($$0, $$12, this.a == flc.a ? dvw.b.b : dvw.b.a);
        if ($$4.d() == ftk.a.a) {
            return cdc.e;
        }
        if ($$4.d() == ftk.a.b) {
            is $$13;
            is $$5 = $$4.b();
            iz $$6 = $$4.c();
            is $$7 = $$5.a($$6);
            if (!$$0.a((cgk)$$12, $$5) || !$$12.a($$7, $$6, $$3)) {
                return cdc.d;
            }
            if (this.a == flc.a) {
                dzy $$9;
                dlt $$10;
                eoh $$8 = $$0.a_($$5);
                dzq dzq2 = $$8.b();
                if (dzq2 instanceof dzy && !($$10 = ($$9 = (dzy)((Object)dzq2)).a($$12, $$0, $$5, $$8)).f()) {
                    $$12.b(bdk.c.b(this));
                    $$9.au_().ifPresent($$1 -> $$12.a((bcz)$$1, 1.0f, 1.0f));
                    $$0.a((cgk)$$12, etk.y, $$5);
                    dlt $$11 = dlw.a($$3, $$12, $$10);
                    if (!$$0.B_()) {
                        aj.k.a((axg)$$12, $$10);
                    }
                    return cdc.a.a($$11);
                }
                return cdc.d;
            }
            eoh $$122 = $$0.a_($$5);
            is is2 = $$13 = $$122.b() instanceof eep && this.a == flc.c ? $$5 : $$7;
            if (this.a((chl)$$12, $$0, $$13, $$4)) {
                this.a((chl)$$12, $$0, $$3, $$13);
                if ($$12 instanceof axg) {
                    aj.z.a((axg)$$12, $$13, $$3);
                }
                $$12.b(bdk.c.b(this));
                dlt $$14 = dlw.a($$3, $$12, dkh.b($$3, $$12));
                return cdc.a.a($$14);
            }
            return cdc.d;
        }
        return cdc.e;
    }

    public static dlt b(dlt $$0, ddm $$1) {
        if (!$$1.gv()) {
            return new dlt(dlx.sk);
        }
        return $$0;
    }

    @Override
    public void a(@Nullable chl $$0, dwo $$1, dlt $$2, is $$3) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(@Nullable chl $$0, dwo $$1, is $$2, @Nullable fti $$3) {
        boolean $$12;
        eep $$10;
        fla fla2 = this.a;
        if (!(fla2 instanceof fkz)) {
            return false;
        }
        fkz $$4 = (fkz)fla2;
        eoh $$6 = $$1.a_($$2);
        dzq $$7 = $$6.b();
        boolean $$8 = $$6.a(this.a);
        boolean $$9 = $$0 != null && $$0.cu();
        boolean $$11 = $$8 || $$7 instanceof eep && ($$10 = (eep)((Object)$$7)).a($$0, $$1, $$2, $$6, this.a);
        boolean bl2 = $$12 = $$6.l() || $$11 && (!$$9 || $$3 == null);
        if (!$$12) {
            return $$3 != null && this.a($$0, $$1, $$3.b().a($$3.c()), null);
        }
        if ($$1.c().a(ceg.B, $$2).booleanValue() && this.a.a(bdv.a)) {
            int $$13 = $$2.u();
            int $$14 = $$2.v();
            int $$15 = $$2.w();
            $$1.a((cgk)$$0, $$2, bda.kI, bdb.e, 0.5f, 2.6f + ($$1.y.i() - $$1.y.i()) * 0.8f);
            for (int $$16 = 0; $$16 < 8; ++$$16) {
                $$1.a(ly.ab, (double)((float)$$13 + $$1.y.i()), (double)((float)$$14 + $$1.y.i()), (double)((float)$$15 + $$1.y.i()), 0.0, 0.0, 0.0);
            }
            return true;
        }
        if ($$7 instanceof eep) {
            eep $$17 = (eep)((Object)$$7);
            if (this.a == flc.c) {
                void $$5;
                $$17.a($$1, $$2, $$6, $$5.a(false));
                this.a($$0, (dwp)$$1, $$2);
                return true;
            }
        }
        if (!$$1.B_() && $$8 && !$$6.n()) {
            $$1.b($$2, true);
        }
        if ($$1.a($$2, this.a.g().g(), 11) || $$6.y().b()) {
            this.a($$0, (dwp)$$1, $$2);
            return true;
        }
        return false;
    }

    protected void a(@Nullable chl $$0, dwp $$1, is $$2) {
        bcz $$3 = this.a.a(bdv.b) ? bda.ds : bda.dp;
        $$1.a((cgk)$$0, $$2, $$3, bdb.e, 1.0f, 1.0f);
        $$1.a((cgk)$$0, etk.z, $$2);
    }

    public fla a() {
        return this.a;
    }
}

