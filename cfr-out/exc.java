/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class exc
extends exx<ezu> {
    public exc(Codec<ezu> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<ezu> $$0) {
        eoh $$5;
        is $$1 = $$0.e();
        dxn $$2 = $$0.b();
        bgr $$3 = $$0.d();
        ezu $$4 = $$0.f();
        while ($$1.v() > $$2.K_() + 3 && ($$2.A($$1.e()) || !exc.b($$5 = $$2.a_($$1.e())) && !exc.a($$5))) {
            $$1 = $$1.e();
        }
        if ($$1.v() <= $$2.K_() + 3) {
            return false;
        }
        for (int $$6 = 0; $$6 < 3; ++$$6) {
            int $$7 = $$3.a(2);
            int $$8 = $$3.a(2);
            int $$9 = $$3.a(2);
            float $$10 = (float)($$7 + $$8 + $$9) * 0.333f + 0.5f;
            for (is $$11 : is.c($$1.b(-$$7, -$$8, -$$9), $$1.b($$7, $$8, $$9))) {
                if (!($$11.j($$1) <= (double)($$10 * $$10))) continue;
                $$2.a($$11, $$4.b, 3);
            }
            $$1 = $$1.b(-1 + $$3.a(2), -$$3.a(2), -1 + $$3.a(2));
        }
        return true;
    }
}

