/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class eyi
extends ewy {
    public eyi(Codec<fae> $$0) {
        super($$0);
    }

    @Override
    protected void a(dwp $$0, bgr $$1, is $$2, int $$3, is.a $$4, fae $$5) {
        for (int $$6 = $$3 - 3; $$6 <= $$3; ++$$6) {
            int $$7 = $$6 < $$3 ? $$5.d : $$5.d - 1;
            int $$8 = $$5.d - 2;
            for (int $$9 = -$$7; $$9 <= $$7; ++$$9) {
                for (int $$10 = -$$7; $$10 <= $$7; ++$$10) {
                    boolean $$16;
                    boolean $$11 = $$9 == -$$7;
                    boolean $$12 = $$9 == $$7;
                    boolean $$13 = $$10 == -$$7;
                    boolean $$14 = $$10 == $$7;
                    boolean $$15 = $$11 || $$12;
                    boolean bl2 = $$16 = $$13 || $$14;
                    if ($$6 < $$3 && $$15 == $$16) continue;
                    $$4.a($$2, $$9, $$6, $$10);
                    eoh $$17 = $$5.b.a($$1, $$2);
                    if ($$17.b(edu.e) && $$17.b(edu.c) && $$17.b(edu.b) && $$17.b(edu.d) && $$17.b(edu.f)) {
                        $$17 = (eoh)((eoh)((eoh)((eoh)((eoh)$$17.b(edu.f, $$6 >= $$3 - 1)).b(edu.e, $$9 < -$$8)).b(edu.c, $$9 > $$8)).b(edu.b, $$10 < -$$8)).b(edu.d, $$10 > $$8);
                    }
                    this.a($$0, $$4, $$17);
                }
            }
        }
    }

    @Override
    protected int a(int $$0, int $$1, int $$2, int $$3) {
        int $$4 = 0;
        if ($$3 < $$1 && $$3 >= $$1 - 3) {
            $$4 = $$2;
        } else if ($$3 == $$1) {
            $$4 = $$2;
        }
        return $$4;
    }
}

