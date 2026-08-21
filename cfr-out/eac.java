/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eac
extends dzq {
    public static final MapCodec<eac> a = eac.b(eac::new);
    public static final eph b = eox.aA;
    public static final int c = 15;
    private static final fug d = dzq.b(14.0, 0.0, 16.0);
    private static final fug e = dzq.b(14.0, 0.0, 15.0);
    private static final int f = 3;
    private static final int g = 8;
    private static final double h = 0.1;
    private static final double i = 0.25;

    public MapCodec<eac> a() {
        return a;
    }

    protected eac(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, 0));
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!$$0.a((dwr)$$1, $$2)) {
            $$1.b($$2, true);
        }
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        is $$4 = $$2.d();
        if (!$$1.A($$4)) {
            return;
        }
        int $$5 = 1;
        int $$6 = $$0.c(b);
        while ($$1.a_($$2.c($$5)).a(this)) {
            if (++$$5 != 3 || $$6 != 15) continue;
            return;
        }
        if ($$6 == 8 && this.a(this.m(), (dwr)$$1, $$2.d())) {
            double $$7;
            double d2 = $$7 = $$5 >= 3 ? 0.25 : 0.1;
            if ($$3.j() <= $$7) {
                $$1.c($$4, dzs.et.m());
            }
        } else if ($$6 == 15 && $$5 < 3) {
            $$1.c($$4, this.m());
            eoh $$8 = (eoh)$$0.b(b, 0);
            $$1.a($$2, $$8, 260);
            $$1.a($$8, $$4, this, null, false);
        }
        if ($$6 < 15) {
            $$1.a($$2, (eoh)$$0.b(b, $$6 + 1), 260);
        }
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return e;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return d;
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
        for (iz $$3 : iz.c.a) {
            eoh $$4 = $$1.a_($$2.a($$3));
            if (!$$4.e() && !$$1.b_($$2.a($$3)).a(bdv.b)) continue;
            return false;
        }
        eoh $$5 = $$1.a_($$2.e());
        return ($$5.a(dzs.es) || $$5.a(bdp.F)) && !$$1.a_($$2.d()).n();
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        $$3.a($$1.as().k(), 1.0f);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

