/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ehv
extends dzq {
    public static final MapCodec<ehv> a = ehv.b(ehv::new);
    private static final fug b = dzq.b(12.0, 13.0, 16.0);
    private static final int c = 14;
    private static final int d = 10;
    private static final int e = 10;

    public MapCodec<ehv> a() {
        return a;
    }

    public ehv(eog.d $$0) {
        super($$0);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return dzq.a($$1, $$2.d(), iz.a) && !$$1.F($$2);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.b && !this.a($$0, $$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        int $$4 = $$2.u();
        int $$5 = $$2.v();
        int $$6 = $$2.w();
        double $$7 = (double)$$4 + $$3.j();
        double $$8 = (double)$$5 + 0.7;
        double $$9 = (double)$$6 + $$3.j();
        $$1.a(ly.aD, $$7, $$8, $$9, 0.0, 0.0, 0.0);
        is.a $$10 = new is.a();
        for (int $$11 = 0; $$11 < 14; ++$$11) {
            $$10.d($$4 + bgj.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + bgj.a($$3, -10, 10));
            eoh $$12 = $$1.a_($$10);
            if ($$12.m($$1, $$10)) continue;
            $$1.a(ly.aH, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }
}

