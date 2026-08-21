/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class exu
extends exx<faj> {
    public exu(Codec<faj> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faj> $$0) {
        exu.a($$0.b(), $$0.e(), false);
        return true;
    }

    public static void a(dxf $$0, is $$1, boolean $$2) {
        is.a $$3 = $$1.k();
        for (int $$4 = -2; $$4 <= 2; ++$$4) {
            for (int $$5 = -2; $$5 <= 2; ++$$5) {
                for (int $$6 = -1; $$6 < 3; ++$$6) {
                    dzq $$8;
                    is.a $$7 = $$3.g($$1).e($$5, $$6, $$4);
                    dzq dzq2 = $$8 = $$6 == -1 ? dzs.cK : dzs.a;
                    if ($$0.a_($$7).a($$8)) continue;
                    if ($$2) {
                        $$0.a((is)$$7, true, null);
                    }
                    $$0.a((is)$$7, $$8.m(), 3);
                }
            }
        }
    }
}

