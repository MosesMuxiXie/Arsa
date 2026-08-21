/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class exp
extends exx<ezy> {
    public exp(Codec<ezy> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<ezy> $$0) {
        ezy $$1 = $$0.f();
        is $$2 = $$0.e();
        dxn $$3 = $$0.b();
        bgr $$4 = $$0.d();
        boolean $$5 = false;
        int $$6 = $$2.v();
        int $$7 = $$6 + $$1.d();
        int $$8 = $$6 - $$1.d() - 1;
        int $$9 = $$1.c().a($$4);
        is.a $$10 = new is.a();
        for (is $$11 : is.c($$2.b(-$$9, 0, -$$9), $$2.b($$9, 0, $$9))) {
            int $$13;
            int $$12 = $$11.u() - $$2.u();
            if ($$12 * $$12 + ($$13 = $$11.w() - $$2.w()) * $$13 > $$9 * $$9) continue;
            $$5 |= this.a($$1, $$3, $$4, $$7, $$8, $$10.g($$11));
        }
        return $$5;
    }

    protected boolean a(ezy $$0, dxn $$1, bgr $$2, int $$3, int $$4, is.a $$5) {
        boolean $$6 = false;
        boolean $$7 = false;
        for (int $$8 = $$3; $$8 > $$4; --$$8) {
            $$5.q($$8);
            if ($$0.b().test($$1, $$5)) {
                eoh $$9 = $$0.a().a($$1, $$2, $$5);
                $$1.a((is)$$5, $$9, 2);
                if (!$$7) {
                    this.a($$1, $$5);
                }
                $$6 = true;
                $$7 = true;
                continue;
            }
            $$7 = false;
        }
        return $$6;
    }
}

