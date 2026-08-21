/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class ezd
extends exx<fam> {
    public ezd(Codec<fam> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<fam> $$0) {
        boolean $$1 = false;
        bgr $$2 = $$0.d();
        dxn $$3 = $$0.b();
        is $$4 = $$0.e();
        fam $$5 = $$0.f();
        int $$6 = $$2.a(8) - $$2.a(8);
        int $$7 = $$2.a(8) - $$2.a(8);
        int $$8 = $$3.a(euq.a.d, $$4.u() + $$6, $$4.w() + $$7);
        is $$9 = new is($$4.u() + $$6, $$8, $$4.w() + $$7);
        if ($$3.a_($$9).a(dzs.J)) {
            eoh $$11;
            boolean $$10 = $$2.j() < (double)$$5.l;
            eoh eoh2 = $$11 = $$10 ? dzs.bH.m() : dzs.bG.m();
            if ($$11.a($$3, $$9)) {
                if ($$10) {
                    eoh $$12 = (eoh)$$11.b(eim.d, epd.a);
                    is $$13 = $$9.d();
                    if ($$3.a_($$13).a(dzs.J)) {
                        $$3.a($$9, $$11, 2);
                        $$3.a($$13, $$12, 2);
                    }
                } else {
                    $$3.a($$9, $$11, 2);
                }
                $$1 = true;
            }
        }
        return $$1;
    }
}

