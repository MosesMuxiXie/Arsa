/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class exf
extends exx<faj> {
    public exf(Codec<faj> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faj> $$0) {
        is $$1 = $$0.e();
        dxn $$2 = $$0.b();
        bgr $$3 = $$0.d();
        if ($$1.v() > $$2.V() - 1) {
            return false;
        }
        if (!$$2.a_($$1).a(dzs.J) && !$$2.a_($$1.e()).a(dzs.J)) {
            return false;
        }
        boolean $$4 = false;
        for (iz $$5 : iz.values()) {
            if ($$5 == iz.a || !$$2.a_($$1.a($$5)).a(dzs.ju)) continue;
            $$4 = true;
            break;
        }
        if (!$$4) {
            return false;
        }
        $$2.a($$1, dzs.nT.m(), 2);
        block1: for (int $$6 = 0; $$6 < 200; ++$$6) {
            is $$9;
            eoh $$10;
            int $$7 = $$3.a(5) - $$3.a(6);
            int $$8 = 3;
            if ($$7 < 2) {
                $$8 += $$7 / 2;
            }
            if ($$8 < 1 || !($$10 = $$2.a_($$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8)))).l() && !$$10.a(dzs.J) && !$$10.a(dzs.ju) && !$$10.a(dzs.eq)) continue;
            for (iz $$11 : iz.values()) {
                eoh $$12 = $$2.a_($$9.a($$11));
                if (!$$12.a(dzs.nT)) continue;
                $$2.a($$9, dzs.nT.m(), 2);
                continue block1;
            }
        }
        return true;
    }
}

