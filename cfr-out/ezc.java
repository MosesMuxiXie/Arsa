/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class ezc
extends exx<ezw> {
    public ezc(Codec<ezw> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<ezw> $$0) {
        int $$1 = 0;
        bgr $$2 = $$0.d();
        dxn $$3 = $$0.b();
        is $$4 = $$0.e();
        int $$5 = $$0.f().a().a($$2);
        for (int $$6 = 0; $$6 < $$5; ++$$6) {
            int $$7 = $$2.a(8) - $$2.a(8);
            int $$8 = $$2.a(8) - $$2.a(8);
            int $$9 = $$3.a(euq.a.d, $$4.u() + $$7, $$4.w() + $$8);
            is $$10 = new is($$4.u() + $$7, $$9, $$4.w() + $$8);
            eoh $$11 = (eoh)dzs.nS.m().b(egx.c, $$2.a(4) + 1);
            if (!$$3.a_($$10).a(dzs.J) || !$$11.a($$3, $$10)) continue;
            $$3.a($$10, $$11, 2);
            ++$$1;
        }
        return $$1 > 0;
    }
}

