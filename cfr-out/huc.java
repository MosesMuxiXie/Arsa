/*
 * Decompiled with CFR 0.152.
 */
public class huc
implements hug.a {
    private static final float a = 4.0f;
    private static final float b = 1.0f;
    private final gfj c;
    private static final int d = bel.b(255, 0, 155, 155);
    private static final int e = bel.b(255, 255, 255, 0);
    private static final int f = bel.a(1.0f, 0.25f, 0.25f, 1.0f);

    public huc(gfj $$0) {
        this.c = $$0;
    }

    @Override
    public void a(double $$0, double $$1, double $$2, bxg $$3, htx $$4, float $$5) {
        cgk $$6 = this.c.i.p().h();
        float $$7 = this.c.r.K_();
        float $$8 = this.c.r.aw() + 1;
        jw $$9 = jw.a($$6.dK());
        double $$10 = $$9.d();
        double $$11 = $$9.f();
        for (int $$12 = -16; $$12 <= 32; $$12 += 16) {
            for (int $$13 = -16; $$13 <= 32; $$13 += 16) {
                um.a(new ftm($$10 + (double)$$12, $$7, $$11 + (double)$$13), new ftm($$10 + (double)$$12, $$8, $$11 + (double)$$13), bel.a(0.5f, 1.0f, 0.0f, 0.0f), 4.0f);
            }
        }
        for (int $$14 = 2; $$14 < 16; $$14 += 2) {
            int $$15 = $$14 % 4 == 0 ? d : e;
            um.a(new ftm($$10 + (double)$$14, $$7, $$11), new ftm($$10 + (double)$$14, $$8, $$11), $$15, 1.0f);
            um.a(new ftm($$10 + (double)$$14, $$7, $$11 + 16.0), new ftm($$10 + (double)$$14, $$8, $$11 + 16.0), $$15, 1.0f);
        }
        for (int $$16 = 2; $$16 < 16; $$16 += 2) {
            int $$17 = $$16 % 4 == 0 ? d : e;
            um.a(new ftm($$10, $$7, $$11 + (double)$$16), new ftm($$10, $$8, $$11 + (double)$$16), $$17, 1.0f);
            um.a(new ftm($$10 + 16.0, $$7, $$11 + (double)$$16), new ftm($$10 + 16.0, $$8, $$11 + (double)$$16), $$17, 1.0f);
        }
        for (int $$18 = this.c.r.K_(); $$18 <= this.c.r.aw() + 1; $$18 += 2) {
            float $$19 = $$18;
            int $$20 = $$18 % 8 == 0 ? d : e;
            um.a(new ftm($$10, $$19, $$11), new ftm($$10, $$19, $$11 + 16.0), $$20, 1.0f);
            um.a(new ftm($$10, $$19, $$11 + 16.0), new ftm($$10 + 16.0, $$19, $$11 + 16.0), $$20, 1.0f);
            um.a(new ftm($$10 + 16.0, $$19, $$11 + 16.0), new ftm($$10 + 16.0, $$19, $$11), $$20, 1.0f);
            um.a(new ftm($$10 + 16.0, $$19, $$11), new ftm($$10, $$19, $$11), $$20, 1.0f);
        }
        for (int $$21 = 0; $$21 <= 16; $$21 += 16) {
            for (int $$22 = 0; $$22 <= 16; $$22 += 16) {
                um.a(new ftm($$10 + (double)$$21, $$7, $$11 + (double)$$22), new ftm($$10 + (double)$$21, $$8, $$11 + (double)$$22), f, 4.0f);
            }
        }
        um.a(new fth($$9.d(), $$9.e(), $$9.f(), $$9.g() + 1, $$9.h() + 1, $$9.i() + 1), ul.a(f, 1.0f)).a();
        for (int $$23 = this.c.r.K_(); $$23 <= this.c.r.aw() + 1; $$23 += 16) {
            um.a(new ftm($$10, $$23, $$11), new ftm($$10, $$23, $$11 + 16.0), f, 4.0f);
            um.a(new ftm($$10, $$23, $$11 + 16.0), new ftm($$10 + 16.0, $$23, $$11 + 16.0), f, 4.0f);
            um.a(new ftm($$10 + 16.0, $$23, $$11 + 16.0), new ftm($$10 + 16.0, $$23, $$11), f, 4.0f);
            um.a(new ftm($$10 + 16.0, $$23, $$11), new ftm($$10, $$23, $$11), f, 4.0f);
        }
    }
}

