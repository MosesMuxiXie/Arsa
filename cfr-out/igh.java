/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class igh {
    private static final int a = 24;
    private static final float b = 0.05f;

    public void a(hpn $$0, hon.a $$1) {
        for (hpp.f $$2 : $$0.e()) {
            igh.a($$2.a(), $$1, $$2.b());
        }
    }

    private static void a(Matrix4f $$0, hon $$1, idf.a $$2) {
        float $$3 = (float)($$2.c.g - $$2.b.g);
        float $$4 = (float)($$2.c.h - $$2.b.h);
        float $$5 = (float)($$2.c.i - $$2.b.i);
        float $$6 = bgj.h($$3 * $$3 + $$5 * $$5) * 0.05f / 2.0f;
        float $$7 = $$5 * $$6;
        float $$8 = $$3 * $$6;
        $$0.translate((float)$$2.a.g, (float)$$2.a.h, (float)$$2.a.i);
        fzp $$9 = $$1.a(ijt.d());
        for (int $$10 = 0; $$10 <= 24; ++$$10) {
            igh.a($$9, $$0, $$3, $$4, $$5, 0.05f, $$7, $$8, $$10, false, $$2);
        }
        for (int $$11 = 24; $$11 >= 0; --$$11) {
            igh.a($$9, $$0, $$3, $$4, $$5, 0.0f, $$7, $$8, $$11, true, $$2);
        }
    }

    private static void a(fzp $$0, Matrix4f $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, int $$8, boolean $$9, idf.a $$10) {
        float $$21;
        float $$11 = (float)$$8 / 24.0f;
        int $$12 = (int)bgj.h($$11, $$10.d, $$10.e);
        int $$13 = (int)bgj.h($$11, $$10.f, $$10.g);
        int $$14 = hoj.a($$12, $$13);
        float $$15 = $$8 % 2 == ($$9 ? 1 : 0) ? 0.7f : 1.0f;
        float $$16 = 0.5f * $$15;
        float $$17 = 0.4f * $$15;
        float $$18 = 0.3f * $$15;
        float $$19 = $$2 * $$11;
        if ($$10.h) {
            float $$20 = $$3 > 0.0f ? $$3 * $$11 * $$11 : $$3 - $$3 * (1.0f - $$11) * (1.0f - $$11);
        } else {
            $$21 = $$3 * $$11;
        }
        float $$22 = $$4 * $$11;
        $$0.a((Matrix4fc)$$1, $$19 - $$6, $$21 + $$5, $$22 + $$7).a($$16, $$17, $$18, 1.0f).c($$14);
        $$0.a((Matrix4fc)$$1, $$19 + $$6, $$21 + 0.05f - $$5, $$22 - $$7).a($$16, $$17, $$18, 1.0f).c($$14);
    }
}

