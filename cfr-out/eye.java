/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class eye
extends exx<faj> {
    public eye(Codec<faj> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faj> $$0) {
        dxn $$1 = $$0.b();
        is $$2 = $$0.e();
        bgr $$3 = $$0.d();
        if (!$$1.A($$2)) {
            return false;
        }
        eoh $$4 = $$1.a_($$2.d());
        if (!($$4.a(dzs.ey) || $$4.a(dzs.eB) || $$4.a(dzs.qr))) {
            return false;
        }
        $$1.a($$2, dzs.eH.m(), 2);
        for (int $$5 = 0; $$5 < 1500; ++$$5) {
            is $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
            if (!$$1.a_($$6).l()) continue;
            int $$7 = 0;
            for (iz $$8 : iz.values()) {
                if ($$1.a_($$6.a($$8)).a(dzs.eH)) {
                    ++$$7;
                }
                if ($$7 > 1) break;
            }
            if ($$7 != true) continue;
            $$1.a($$6, dzs.eH.m(), 2);
        }
        return true;
    }
}

