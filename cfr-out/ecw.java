/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ecw
extends ejg
implements dzt {
    private static final double b = 0.7;
    private static final double c = 10.0;
    private static final double d = 5.0;
    private static final int e = 13;
    private static final int f = 30;
    public static final MapCodec<ecw> a = ecw.b(ecw::new);

    public ecw(eog.d $$0) {
        super($$0);
    }

    protected MapCodec<? extends ecw> a() {
        return a;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        if ($$3.a(30) == 0 && $$1.c().a(ceg.y, $$2).booleanValue() && $$1.b(euq.a.f, $$2) <= $$2.v()) {
            $$1.a($$2, bda.ky, bdb.i, 1.0f, 1.0f, false);
        }
        if ($$1.G($$2) <= 13 && $$3.j() <= 0.7) {
            double $$4 = (double)$$2.u() + $$3.j() * 10.0 - 5.0;
            double $$5 = (double)$$2.v() + $$3.j() * 5.0;
            double $$6 = (double)$$2.w() + $$3.j() * 10.0 - 5.0;
            $$1.a(ly.bk, $$4, $$5, $$6, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return dzt.a_($$0, $$1, $$2);
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$12, is $$2, eoh $$3) {
        dzt.a($$0, $$2, $$3).ifPresent($$1 -> $$0.c((is)$$1, this.m()));
    }
}

