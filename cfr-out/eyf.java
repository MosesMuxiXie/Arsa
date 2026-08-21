/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class eyf
extends ewy {
    public eyf(Codec<fae> $$0) {
        super($$0);
    }

    @Override
    protected void a(dwp $$0, bgr $$1, is $$2, int $$3, is.a $$4, fae $$5) {
        int $$6 = $$5.d;
        for (int $$7 = -$$6; $$7 <= $$6; ++$$7) {
            for (int $$8 = -$$6; $$8 <= $$6; ++$$8) {
                boolean $$14;
                boolean $$9 = $$7 == -$$6;
                boolean $$10 = $$7 == $$6;
                boolean $$11 = $$8 == -$$6;
                boolean $$12 = $$8 == $$6;
                boolean $$13 = $$9 || $$10;
                boolean bl2 = $$14 = $$11 || $$12;
                if ($$13 && $$14) continue;
                $$4.a($$2, $$7, $$3, $$8);
                boolean $$15 = $$9 || $$14 && $$7 == 1 - $$6;
                boolean $$16 = $$10 || $$14 && $$7 == $$6 - 1;
                boolean $$17 = $$11 || $$13 && $$8 == 1 - $$6;
                boolean $$18 = $$12 || $$13 && $$8 == $$6 - 1;
                eoh $$19 = $$5.b.a($$1, $$2);
                if ($$19.b(edu.e) && $$19.b(edu.c) && $$19.b(edu.b) && $$19.b(edu.d)) {
                    $$19 = (eoh)((eoh)((eoh)((eoh)$$19.b(edu.e, $$15)).b(edu.c, $$16)).b(edu.b, $$17)).b(edu.d, $$18);
                }
                this.a($$0, $$4, $$19);
            }
        }
    }

    @Override
    protected int a(int $$0, int $$1, int $$2, int $$3) {
        return $$3 <= 3 ? 0 : $$2;
    }
}

