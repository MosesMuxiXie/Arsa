/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class hre<T extends elb>
implements hri<T, hsj> {
    public static final amo a = amo.b("textures/entity/beacon_beam.png");
    public static final int b = 2048;
    private static final float e = 96.0f;
    public static final float c = 0.2f;
    public static final float d = 0.25f;

    public hsj a() {
        return new hsj();
    }

    @Override
    public void a(T $$0, hsj $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        hre.a($$0, $$1, $$2, $$3);
    }

    public static <T extends elb> void a(T $$02, hsj $$1, float $$2, ftm $$3) {
        $$1.a = $$02.j() != null ? (float)Math.floorMod($$02.j().au(), 40) + $$2 : 0.0f;
        $$1.c = ((ekv)((Object)$$02)).a().stream().map($$0 -> new hsj.a($$0.b(), $$0.c())).toList();
        float $$4 = (float)$$3.d($$1.f.b()).i();
        hnh $$5 = gfj.V().s;
        $$1.b = $$5 != null && $$5.hj() ? 1.0f : Math.max(1.0f, $$4 / 96.0f);
    }

    @Override
    public void a(hsj $$0, fzm $$1, hpo $$2, ikp $$3) {
        int $$4 = 0;
        for (int $$5 = 0; $$5 < $$0.c.size(); ++$$5) {
            hsj.a $$6 = $$0.c.get($$5);
            hre.a($$1, $$2, $$0.b, $$0.a, $$4, $$5 == $$0.c.size() - 1 ? 2048 : $$6.b(), $$6.a());
            $$4 += $$6.b();
        }
    }

    private static void a(fzm $$0, hpo $$1, float $$2, float $$3, int $$4, int $$5, int $$6) {
        hre.a($$0, $$1, a, 1.0f, $$3, $$4, $$5, $$6, 0.2f * $$2, 0.25f * $$2);
    }

    public static void a(fzm $$0, hpo $$1, amo $$2, float $$3, float $$4, int $$5, int $$6, int $$7, float $$8, float $$92) {
        int $$102 = $$5 + $$6;
        $$0.a();
        $$0.a(0.5, 0.0, 0.5);
        float $$11 = $$6 < 0 ? $$4 : -$$4;
        float $$12 = bgj.g($$11 * 0.2f - (float)bgj.b($$11 * 0.1f));
        $$0.a();
        $$0.a((Quaternionfc)a.d.rotationDegrees($$4 * 2.25f - 45.0f));
        float $$132 = 0.0f;
        float $$142 = $$8;
        float $$15 = $$8;
        float $$16 = 0.0f;
        float $$17 = -$$8;
        float $$18 = 0.0f;
        float $$19 = 0.0f;
        float $$20 = -$$8;
        float $$21 = 0.0f;
        float $$22 = 1.0f;
        float $$23 = -1.0f + $$12;
        float $$24 = (float)$$6 * $$3 * (0.5f / $$8) + $$23;
        $$1.a($$0, ijt.e($$2, false), ($$9, $$10) -> hre.a($$9, $$10, $$7, $$5, $$102, 0.0f, $$142, $$15, 0.0f, $$17, 0.0f, 0.0f, $$20, 0.0f, 1.0f, $$24, $$23));
        $$0.b();
        float $$25 = -$$92;
        float $$26 = -$$92;
        float $$27 = $$92;
        float $$28 = -$$92;
        float $$29 = -$$92;
        float $$30 = $$92;
        float $$31 = $$92;
        float $$32 = $$92;
        float $$33 = 0.0f;
        float $$34 = 1.0f;
        float $$35 = -1.0f + $$12;
        float $$36 = (float)$$6 * $$3 + $$35;
        $$1.a($$0, ijt.e($$2, true), ($$13, $$14) -> hre.a($$13, $$14, bel.f(32, $$7), $$5, $$102, $$25, $$26, $$27, $$28, $$29, $$30, $$31, $$32, 0.0f, 1.0f, $$36, $$35));
        $$0.b();
    }

    private static void a(fzm.a $$0, fzp $$1, int $$2, int $$3, int $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11, float $$12, float $$13, float $$14, float $$15, float $$16) {
        hre.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$13, $$14, $$15, $$16);
        hre.a($$0, $$1, $$2, $$3, $$4, $$11, $$12, $$9, $$10, $$13, $$14, $$15, $$16);
        hre.a($$0, $$1, $$2, $$3, $$4, $$7, $$8, $$11, $$12, $$13, $$14, $$15, $$16);
        hre.a($$0, $$1, $$2, $$3, $$4, $$9, $$10, $$5, $$6, $$13, $$14, $$15, $$16);
    }

    private static void a(fzm.a $$0, fzp $$1, int $$2, int $$3, int $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11, float $$12) {
        hre.a($$0, $$1, $$2, $$4, $$5, $$6, $$10, $$11);
        hre.a($$0, $$1, $$2, $$3, $$5, $$6, $$10, $$12);
        hre.a($$0, $$1, $$2, $$3, $$7, $$8, $$9, $$12);
        hre.a($$0, $$1, $$2, $$4, $$7, $$8, $$9, $$11);
    }

    private static void a(fzm.a $$0, fzp $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
        $$1.a($$0, $$4, (float)$$3, $$5).a($$2).a($$6, $$7).b(ilg.d).c(0xF000F0).b($$0, 0.0f, 1.0f, 0.0f);
    }

    @Override
    public boolean bk_() {
        return true;
    }

    @Override
    public int bl_() {
        return gfj.V().k.aY() * 16;
    }

    @Override
    public boolean a(T $$0, ftm $$1) {
        return ftm.b(((elb)$$0).aD_()).d(1.0, 0.0, 1.0).a((jn)$$1.d(1.0, 0.0, 1.0), (double)this.bl_());
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

