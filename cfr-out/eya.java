/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class eya
extends exx<fag> {
    public eya(Codec<fag> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<fag> $$0) {
        is $$1 = $$0.e();
        fag $$2 = $$0.f();
        dxn $$3 = $$0.b();
        is.a $$4 = new is.a();
        for (int $$5 = 0; $$5 < 16; ++$$5) {
            for (int $$6 = 0; $$6 < 16; ++$$6) {
                int $$7 = $$1.u() + $$5;
                int $$8 = $$1.w() + $$6;
                int $$9 = $$3.K_() + $$2.b;
                $$4.d($$7, $$9, $$8);
                if (!$$3.a_($$4).l()) continue;
                $$3.a((is)$$4, $$2.c, 2);
            }
        }
        return true;
    }
}

