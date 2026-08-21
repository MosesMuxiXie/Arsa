/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 */
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class igm {
    private static final ijs a = ijt.o(amo.b("textures/misc/shadow.png"));

    public void a(hpn $$0, hon.a $$1) {
        fzp $$2 = $$1.a(a);
        for (hpp.k $$3 : $$0.a()) {
            for (idf.b $$4 : $$3.c()) {
                fth $$5 = $$4.d().a();
                float $$6 = $$4.a() + (float)$$5.a;
                float $$7 = $$4.a() + (float)$$5.d;
                float $$8 = $$4.b() + (float)$$5.b;
                float $$9 = $$4.c() + (float)$$5.c;
                float $$10 = $$4.c() + (float)$$5.f;
                float $$11 = $$3.b();
                float $$12 = -$$6 / 2.0f / $$11 + 0.5f;
                float $$13 = -$$7 / 2.0f / $$11 + 0.5f;
                float $$14 = -$$9 / 2.0f / $$11 + 0.5f;
                float $$15 = -$$10 / 2.0f / $$11 + 0.5f;
                int $$16 = bel.b($$4.e());
                igm.a($$3.a(), $$2, $$16, $$6, $$8, $$9, $$12, $$14);
                igm.a($$3.a(), $$2, $$16, $$6, $$8, $$10, $$12, $$15);
                igm.a($$3.a(), $$2, $$16, $$7, $$8, $$10, $$13, $$15);
                igm.a($$3.a(), $$2, $$16, $$7, $$8, $$9, $$13, $$14);
            }
        }
    }

    private static void a(Matrix4f $$0, fzp $$1, int $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
        Vector3f $$8 = $$0.transformPosition($$3, $$4, $$5, new Vector3f());
        $$1.a($$8.x(), $$8.y(), $$8.z(), $$2, $$6, $$7, ilg.d, 0xF000F0, 0.0f, 1.0f, 0.0f);
    }
}

