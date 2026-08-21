/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eif
extends dzq {
    public static final MapCodec<eif> a = eif.b(eif::new);
    public static final eph b = eox.aA;
    private static final fug c = dzq.b(12.0, 0.0, 16.0);

    public MapCodec<eif> a() {
        return a;
    }

    protected eif(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, 0));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!$$0.a((dwr)$$1, $$2)) {
            $$1.b($$2, true);
        }
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$1.A($$2.d())) {
            int $$4 = 1;
            while ($$1.a_($$2.c($$4)).a(this)) {
                ++$$4;
            }
            if ($$4 < 3) {
                int $$5 = $$0.c(b);
                if ($$5 == 15) {
                    $$1.c($$2.d(), this.m());
                    $$1.a($$2, (eoh)$$0.b(b, 0), 260);
                } else {
                    $$1.a($$2, (eoh)$$0.b(b, $$5 + 1), 260);
                }
            }
        }
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (!$$0.a($$1, $$3)) {
            $$2.a($$3, this, 1);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        eoh $$3 = $$1.a_($$2.e());
        if ($$3.a(this)) {
            return true;
        }
        if ($$3.a(bdp.ae) || $$3.a(bdp.F)) {
            is $$4 = $$2.e();
            for (iz $$5 : iz.c.a) {
                eoh $$6 = $$1.a_($$4.a($$5));
                flb $$7 = $$1.b_($$4.a($$5));
                if (!$$7.a(bdv.a) && !$$6.a(dzs.lE)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }
}

