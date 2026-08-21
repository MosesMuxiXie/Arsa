/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class eyl
extends exx<faj> {
    public eyl(Codec<faj> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faj> $$0) {
        int $$1 = 0;
        dxn $$2 = $$0.b();
        is $$3 = $$0.e();
        bgr $$4 = $$0.d();
        int $$5 = $$2.a(euq.a.d, $$3.u(), $$3.w());
        is $$6 = new is($$3.u(), $$5, $$3.w());
        if ($$2.a_($$6).a(dzs.J)) {
            eoh $$7 = dzs.mY.m();
            eoh $$8 = dzs.mZ.m();
            int $$9 = 1 + $$4.a(10);
            for (int $$10 = 0; $$10 <= $$9; ++$$10) {
                if ($$2.a_($$6).a(dzs.J) && $$2.a_($$6.d()).a(dzs.J) && $$8.a($$2, $$6)) {
                    if ($$10 == $$9) {
                        $$2.a($$6, (eoh)$$7.b(eeb.e, $$4.a(4) + 20), 2);
                        ++$$1;
                    } else {
                        $$2.a($$6, $$8, 2);
                    }
                } else if ($$10 > 0) {
                    is $$11 = $$6.e();
                    if (!$$7.a($$2, $$11) || $$2.a_($$11.e()).a(dzs.mY)) break;
                    $$2.a($$11, (eoh)$$7.b(eeb.e, $$4.a(4) + 20), 2);
                    ++$$1;
                    break;
                }
                $$6 = $$6.d();
            }
        }
        return $$1 > 0;
    }
}

