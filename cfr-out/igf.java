/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionf;
import org.joml.Quaternionfc;

public class igf {
    public void a(hpn $$0, hon.a $$1, inl $$2) {
        for (hpp.d $$3 : $$0.b()) {
            this.a($$3.a(), $$1, $$3.b(), $$3.c(), $$2);
        }
    }

    private void a(fzm.a $$0, hon $$1, idf $$2, Quaternionf $$3, inl $$4) {
        ilp $$5 = $$4.a(inx.a);
        ilp $$6 = $$4.a(inx.b);
        float $$7 = $$2.M * 1.4f;
        $$0.b($$7, $$7, $$7);
        float $$8 = 0.5f;
        float $$9 = 0.0f;
        float $$10 = $$2.N / $$7;
        float $$11 = 0.0f;
        $$0.a((Quaternionfc)$$3);
        $$0.a(0.0f, 0.0f, 0.3f - (float)((int)$$10) * 0.02f);
        float $$12 = 0.0f;
        int $$13 = 0;
        fzp $$14 = $$1.a(hpj.i());
        while ($$10 > 0.0f) {
            ilp $$15 = $$13 % 2 == 0 ? $$5 : $$6;
            float $$16 = $$15.c();
            float $$17 = $$15.f();
            float $$18 = $$15.d();
            float $$19 = $$15.g();
            if ($$13 / 2 % 2 == 0) {
                float $$20 = $$18;
                $$18 = $$16;
                $$16 = $$20;
            }
            igf.a($$0, $$14, -$$8 - 0.0f, 0.0f - $$11, $$12, $$18, $$19);
            igf.a($$0, $$14, $$8 - 0.0f, 0.0f - $$11, $$12, $$16, $$19);
            igf.a($$0, $$14, $$8 - 0.0f, 1.4f - $$11, $$12, $$16, $$17);
            igf.a($$0, $$14, -$$8 - 0.0f, 1.4f - $$11, $$12, $$18, $$17);
            $$10 -= 0.45f;
            $$11 -= 0.45f;
            $$8 *= 0.9f;
            $$12 -= 0.03f;
            ++$$13;
        }
    }

    private static void a(fzm.a $$0, fzp $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
        $$1.a($$0, $$2, $$3, $$4).a(-1).a($$5, $$6).a(0, 10).c(240).b($$0, 0.0f, 1.0f, 0.0f);
    }
}

