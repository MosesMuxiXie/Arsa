/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 */
import org.joml.Vector4f;

public class hud
implements hug.a {
    public static final iz[] a = iz.values();
    private final gfj b;

    public hud(gfj $$0) {
        this.b = $$0;
    }

    @Override
    public void a(double $$0, double $$1, double $$2, bxg $$3, htx $$4, float $$5) {
        htx $$22;
        hoh $$6 = this.b.e;
        boolean $$7 = this.b.m.b(glx.z);
        boolean $$8 = this.b.m.b(glx.M);
        if ($$7 || $$8) {
            hpf $$9 = $$6.x();
            for (hts.a $$10 : $$6.w()) {
                hpf.d $$11 = $$9.b($$10);
                if ($$11 == null) continue;
                is $$12 = $$10.f();
                if ($$7) {
                    int $$13 = $$11.b == 0 ? 0 : bgj.g((float)$$11.b / 50.0f, 0.9f, 0.9f);
                    for (int $$14 = 0; $$14 < a.length; ++$$14) {
                        if (!$$11.a($$14)) continue;
                        iz $$15 = a[$$14];
                        um.a(ftm.a($$12, 8.0, 8.0, 8.0), ftm.a($$12, 8 - 16 * $$15.j(), 8 - 16 * $$15.k(), 8 - 16 * $$15.l()), bel.g($$13));
                    }
                }
                if (!$$8 || !$$10.d().a()) continue;
                int $$16 = 0;
                for (iz $$17 : a) {
                    for (iz $$18 : a) {
                        boolean $$19 = $$10.d().a($$17, $$18);
                        if ($$19) continue;
                        ++$$16;
                        um.a(ftm.a($$12, 8 + 8 * $$17.j(), 8 + 8 * $$17.k(), 8 + 8 * $$17.l()), ftm.a($$12, 8 + 8 * $$18.j(), 8 + 8 * $$18.k(), 8 + 8 * $$18.l()), bel.b(255, 255, 0, 0));
                    }
                }
                if ($$16 <= 0) continue;
                float $$20 = 0.5f;
                float $$21 = 0.2f;
                um.a($$10.c().h(0.5), ul.b(bel.a(0.2f, 0.9f, 0.9f, 0.0f)));
            }
        }
        if (($$22 = $$6.y()) != null) {
            ftm $$23 = new ftm($$22.b(), $$22.c(), $$22.d());
            Vector4f[] $$24 = $$22.a();
            this.a($$23, $$24, 0, 1, 2, 3, 0, 1, 1);
            this.a($$23, $$24, 4, 5, 6, 7, 1, 0, 0);
            this.a($$23, $$24, 0, 1, 5, 4, 1, 1, 0);
            this.a($$23, $$24, 2, 3, 7, 6, 0, 0, 1);
            this.a($$23, $$24, 0, 4, 7, 3, 0, 1, 0);
            this.a($$23, $$24, 1, 5, 6, 2, 1, 0, 1);
            this.a($$23, $$24[0], $$24[1]);
            this.a($$23, $$24[1], $$24[2]);
            this.a($$23, $$24[2], $$24[3]);
            this.a($$23, $$24[3], $$24[0]);
            this.a($$23, $$24[4], $$24[5]);
            this.a($$23, $$24[5], $$24[6]);
            this.a($$23, $$24[6], $$24[7]);
            this.a($$23, $$24[7], $$24[4]);
            this.a($$23, $$24[0], $$24[4]);
            this.a($$23, $$24[1], $$24[5]);
            this.a($$23, $$24[2], $$24[6]);
            this.a($$23, $$24[3], $$24[7]);
        }
    }

    private void a(ftm $$0, Vector4f $$1, Vector4f $$2) {
        um.a(new ftm($$0.g + (double)$$1.x, $$0.h + (double)$$1.y, $$0.i + (double)$$1.z), new ftm($$0.g + (double)$$2.x, $$0.h + (double)$$2.y, $$0.i + (double)$$2.z), -16777216);
    }

    private void a(ftm $$0, Vector4f[] $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
        float $$9 = 0.25f;
        um.a(new ftm($$1[$$2].x(), $$1[$$2].y(), $$1[$$2].z()).e($$0), new ftm($$1[$$3].x(), $$1[$$3].y(), $$1[$$3].z()).e($$0), new ftm($$1[$$4].x(), $$1[$$4].y(), $$1[$$4].z()).e($$0), new ftm($$1[$$5].x(), $$1[$$5].y(), $$1[$$5].z()).e($$0), ul.b(bel.a(0.25f, (float)$$6, (float)$$7, (float)$$8)));
    }
}

