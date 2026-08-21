/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class eyj
extends exx<faj> {
    public eyj(Codec<faj> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faj> $$0) {
        is $$1 = $$0.e();
        bgr $$2 = $$0.d();
        dxn $$3 = $$0.b();
        while ($$3.A($$1) && $$1.v() > $$3.K_() + 2) {
            $$1 = $$1.e();
        }
        if (!$$3.a_($$1).a(dzs.er)) {
            return false;
        }
        $$1 = $$1.b($$2.a(4));
        int $$4 = $$2.a(4) + 7;
        int $$5 = $$4 / 4 + $$2.a(2);
        if ($$5 > 1 && $$2.a(60) == 0) {
            $$1 = $$1.b(10 + $$2.a(30));
        }
        for (int $$6 = 0; $$6 < $$4; ++$$6) {
            float $$7 = (1.0f - (float)$$6 / (float)$$4) * (float)$$5;
            int $$8 = bgj.d($$7);
            for (int $$9 = -$$8; $$9 <= $$8; ++$$9) {
                float $$10 = (float)bgj.a($$9) - 0.25f;
                for (int $$11 = -$$8; $$11 <= $$8; ++$$11) {
                    float $$12 = (float)bgj.a($$11) - 0.25f;
                    if (($$9 != 0 || $$11 != 0) && $$10 * $$10 + $$12 * $$12 > $$7 * $$7 || ($$9 == -$$8 || $$9 == $$8 || $$11 == -$$8 || $$11 == $$8) && $$2.i() > 0.75f) continue;
                    eoh $$13 = $$3.a_($$1.b($$9, $$6, $$11));
                    if ($$13.l() || eyj.b($$13) || $$13.a(dzs.er) || $$13.a(dzs.eq)) {
                        this.a($$3, $$1.b($$9, $$6, $$11), dzs.ju.m());
                    }
                    if ($$6 == 0 || $$8 <= 1 || !($$13 = $$3.a_($$1.b($$9, -$$6, $$11))).l() && !eyj.b($$13) && !$$13.a(dzs.er) && !$$13.a(dzs.eq)) continue;
                    this.a($$3, $$1.b($$9, -$$6, $$11), dzs.ju.m());
                }
            }
        }
        int $$14 = $$5 - 1;
        if ($$14 < 0) {
            $$14 = 0;
        } else if ($$14 > 1) {
            $$14 = 1;
        }
        for (int $$15 = -$$14; $$15 <= $$14; ++$$15) {
            for (int $$16 = -$$14; $$16 <= $$14; ++$$16) {
                eoh $$19;
                is $$17 = $$1.b($$15, -1, $$16);
                int $$18 = 50;
                if (Math.abs($$15) == 1 && Math.abs($$16) == 1) {
                    $$18 = $$2.a(5);
                }
                while ($$17.v() > 50 && (($$19 = $$3.a_($$17)).l() || eyj.b($$19) || $$19.a(dzs.er) || $$19.a(dzs.eq) || $$19.a(dzs.ju))) {
                    this.a($$3, $$17, dzs.ju.m());
                    $$17 = $$17.e();
                    if (--$$18 > 0) continue;
                    $$17 = $$17.c($$2.a(5) + 1);
                    $$18 = $$2.a(5);
                }
            }
        }
        return true;
    }
}

