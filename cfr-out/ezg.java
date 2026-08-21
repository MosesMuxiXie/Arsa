/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class ezg
extends exx<faj> {
    public ezg(Codec<faj> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faj> $$0) {
        dxn $$1 = $$0.b();
        is $$2 = $$0.e();
        is.a $$3 = new is.a();
        is.a $$4 = new is.a();
        for (int $$5 = 0; $$5 < 16; ++$$5) {
            for (int $$6 = 0; $$6 < 16; ++$$6) {
                int $$7 = $$2.u() + $$5;
                int $$8 = $$2.w() + $$6;
                int $$9 = $$1.a(euq.a.e, $$7, $$8);
                $$3.d($$7, $$9, $$8);
                $$4.g($$3).c(iz.a, 1);
                dxo $$10 = $$1.z($$3).a();
                if ($$10.a($$1, $$4, false)) {
                    $$1.a((is)$$4, dzs.eq.m(), 2);
                }
                if (!$$10.b($$1, $$3)) continue;
                $$1.a((is)$$3, dzs.ep.m(), 2);
                eoh $$11 = $$1.a_($$4);
                if (!$$11.b(ehp.c)) continue;
                $$1.a((is)$$4, (eoh)$$11.b(ehp.c, true), 2);
            }
        }
        return true;
    }
}

