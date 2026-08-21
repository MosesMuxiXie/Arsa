/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class ewz
extends exx<fam> {
    private static final eoh a = (eoh)((eoh)((eoh)dzs.nW.m().b(dyu.b, 1)).b(dyu.c, eot.a)).b(dyu.d, 0);
    private static final eoh b = (eoh)((eoh)a.b(dyu.c, eot.c)).b(dyu.d, 1);
    private static final eoh c = (eoh)a.b(dyu.c, eot.c);
    private static final eoh d = (eoh)a.b(dyu.c, eot.b);

    public ewz(Codec<fam> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<fam> $$0) {
        int $$1 = 0;
        is $$2 = $$0.e();
        dxn $$3 = $$0.b();
        bgr $$4 = $$0.d();
        fam $$5 = $$0.f();
        is.a $$6 = $$2.k();
        is.a $$7 = $$2.k();
        if ($$3.A($$6)) {
            if (dzs.nW.m().a($$3, (is)$$6)) {
                int $$8 = $$4.a(12) + 5;
                if ($$4.i() < $$5.l) {
                    int $$9 = $$4.a(4) + 1;
                    for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; ++$$10) {
                        for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; ++$$11) {
                            int $$13;
                            int $$12 = $$10 - $$2.u();
                            if ($$12 * $$12 + ($$13 = $$11 - $$2.w()) * $$13 > $$9 * $$9) continue;
                            $$7.d($$10, $$3.a(euq.a.b, $$10, $$11) - 1, $$11);
                            if (!ewz.b($$3.a_($$7))) continue;
                            $$3.a((is)$$7, dzs.l.m(), 2);
                        }
                    }
                }
                for (int $$14 = 0; $$14 < $$8 && $$3.A($$6); ++$$14) {
                    $$3.a((is)$$6, a, 2);
                    $$6.c(iz.b, 1);
                }
                if ($$6.v() - $$2.v() >= 3) {
                    $$3.a((is)$$6, b, 2);
                    $$3.a((is)$$6.c(iz.a, 1), c, 2);
                    $$3.a((is)$$6.c(iz.a, 1), d, 2);
                }
            }
            ++$$1;
        }
        return $$1 > 0;
    }
}

