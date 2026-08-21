/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ecc
extends ecr {
    public static final MapCodec<ecc> a = ecc.b(ecc::new);
    private static final fug b = dzq.b(14.0, 0.0, 16.0);

    public MapCodec<ecc> a() {
        return a;
    }

    public ecc(eog.d $$0) {
        super($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        this.c($$0, $$1, $$2);
        return cdc.a;
    }

    @Override
    protected void a_(eoh $$0, dwo $$1, is $$2, ddm $$3) {
        this.c($$0, $$1, $$2);
    }

    private void c(eoh $$0, dwo $$1, is $$2) {
        eqa $$3 = $$1.w();
        for (int $$4 = 0; $$4 < 1000; ++$$4) {
            is $$5 = $$2.b($$1.y.a(16) - $$1.y.a(16), $$1.y.a(8) - $$1.y.a(8), $$1.y.a(16) - $$1.y.a(16));
            if (!$$1.a_($$5).l() || !$$3.a($$5) || $$1.y($$5)) continue;
            if ($$1.B_()) {
                for (int $$6 = 0; $$6 < 128; ++$$6) {
                    double $$7 = $$1.y.j();
                    float $$8 = ($$1.y.i() - 0.5f) * 0.2f;
                    float $$9 = ($$1.y.i() - 0.5f) * 0.2f;
                    float $$10 = ($$1.y.i() - 0.5f) * 0.2f;
                    double $$11 = bgj.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.y.j() - 0.5) + 0.5;
                    double $$12 = bgj.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.y.j() - 0.5;
                    double $$13 = bgj.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.y.j() - 0.5) + 0.5;
                    $$1.a(ly.ag, $$11, $$12, $$13, (double)$$8, (double)$$9, $$10);
                }
            } else {
                $$1.a($$5, $$0, 2);
                $$1.a($$2, false);
            }
            return;
        }
    }

    @Override
    protected int b() {
        return 5;
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    @Override
    public int b(eoh $$0, dvt $$1, is $$2) {
        return -16777216;
    }
}

