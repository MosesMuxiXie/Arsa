/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ebr
extends dzq {
    public static final MapCodec<ebr> a = ebr.b(ebr::new);

    public MapCodec<ebr> a() {
        return a;
    }

    public ebr(eog.d $$0) {
        super($$0);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        if ($$3.a(5) != 0) {
            return;
        }
        iz $$4 = iz.b($$3);
        if ($$4 == iz.b) {
            return;
        }
        is $$5 = $$2.a($$4);
        eoh $$6 = $$1.a_($$5);
        if ($$0.t() && $$6.c((dvt)$$1, $$5, $$4.g())) {
            return;
        }
        double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
        double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
        double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
        $$1.a(ly.aI, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
    }
}

