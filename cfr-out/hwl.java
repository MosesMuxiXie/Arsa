/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 */
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public class hwl
extends hwp<cyc, idd> {
    public static final amo a = amo.b("textures/entity/end_crystal/end_crystal_beam.png");
    private static final amo f = amo.b("textures/entity/enderdragon/dragon_exploding.png");
    private static final amo g = amo.b("textures/entity/enderdragon/dragon.png");
    private static final amo h = amo.b("textures/entity/enderdragon/dragon_eyes.png");
    private static final ijs i = ijt.g(g);
    private static final ijs j = ijt.m(g);
    private static final ijs k = ijt.q(h);
    private static final ijs l = ijt.l(a);
    private static final float m = (float)(Math.sqrt(3.0) / 2.0);
    private final hec n;

    public hwl(hwq.a $$0) {
        super($$0);
        this.d = 0.5f;
        this.n = new hec($$0.a(hdf.aY));
    }

    @Override
    public void a(idd $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        float $$4 = $$0.a(7).b();
        float $$5 = (float)($$0.a(5).a() - $$0.a(10).a());
        $$1.a((Quaternionfc)a.d.rotationDegrees(-$$4));
        $$1.a((Quaternionfc)a.b.rotationDegrees($$5 * 10.0f));
        $$1.a(0.0f, 0.0f, 1.0f);
        $$1.b(-1.0f, -1.0f, 1.0f);
        $$1.a(0.0f, -1.501f, 0.0f);
        int $$6 = ilg.a(0.0f, $$0.c);
        if ($$0.b > 0.0f) {
            int $$7 = bel.b($$0.b / 200.0f);
            $$2.a(0).a(this.n, $$0, $$1, ijt.p(f), $$0.T, ilg.d, $$7, null, $$0.U, null);
            $$2.a(1).a(this.n, $$0, $$1, j, $$0.T, $$6, -1, null, $$0.U, null);
        } else {
            $$2.a(0).a(this.n, $$0, $$1, i, $$0.T, $$6, -1, null, $$0.U, null);
        }
        $$2.a(this.n, $$0, $$1, k, $$0.T, ilg.d, $$0.U, null);
        if ($$0.b > 0.0f) {
            float $$8 = $$0.b / 200.0f;
            $$1.a();
            $$1.a(0.0f, -1.0f, -2.0f);
            hwl.a($$1, $$8, $$2, ijt.m());
            hwl.a($$1, $$8, $$2, ijt.n());
            $$1.b();
        }
        $$1.b();
        if ($$0.d != null) {
            hwl.a((float)$$0.d.g, (float)$$0.d.h, (float)$$0.d.i, $$0.L, $$1, $$2, $$0.T);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    private static void a(fzm $$0, float $$12, hpo $$22, ijs $$3) {
        $$22.a($$0, $$3, ($$1, $$2) -> {
            float $$3 = Math.min($$12 > 0.8f ? ($$12 - 0.8f) / 0.2f : 0.0f, 1.0f);
            int $$4 = bel.a(1.0f - $$3, 1.0f, 1.0f, 1.0f);
            int $$5 = 0xFF00FF;
            bgr $$6 = bgr.a(432L);
            Vector3f $$7 = new Vector3f();
            Vector3f $$8 = new Vector3f();
            Vector3f $$9 = new Vector3f();
            Vector3f $$10 = new Vector3f();
            Quaternionf $$11 = new Quaternionf();
            int $$12 = bgj.b(($$12 + $$12 * $$12) / 2.0f * 60.0f);
            for (int $$13 = 0; $$13 < $$12; ++$$13) {
                $$11.rotationXYZ($$6.i() * ((float)Math.PI * 2), $$6.i() * ((float)Math.PI * 2), $$6.i() * ((float)Math.PI * 2)).rotateXYZ($$6.i() * ((float)Math.PI * 2), $$6.i() * ((float)Math.PI * 2), $$6.i() * ((float)Math.PI * 2) + $$12 * 1.5707964f);
                $$1.a((Quaternionfc)$$11);
                float $$14 = $$6.i() * 20.0f + 5.0f + $$3 * 10.0f;
                float $$15 = $$6.i() * 2.0f + 1.0f + $$3 * 2.0f;
                $$8.set(-m * $$15, $$14, -0.5f * $$15);
                $$9.set(m * $$15, $$14, -0.5f * $$15);
                $$10.set(0.0f, $$14, $$15);
                $$2.a($$1, $$7).a($$4);
                $$2.a($$1, $$8).a(0xFF00FF);
                $$2.a($$1, $$9).a(0xFF00FF);
                $$2.a($$1, $$7).a($$4);
                $$2.a($$1, $$9).a(0xFF00FF);
                $$2.a($$1, $$10).a(0xFF00FF);
                $$2.a($$1, $$7).a($$4);
                $$2.a($$1, $$10).a(0xFF00FF);
                $$2.a($$1, $$8).a(0xFF00FF);
            }
        });
    }

    public static void a(float $$0, float $$1, float $$2, float $$3, fzm $$42, hpo $$52, int $$6) {
        float $$7 = bgj.a($$0 * $$0 + $$2 * $$2);
        float $$8 = bgj.a($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
        $$42.a();
        $$42.a(0.0f, 2.0f, 0.0f);
        $$42.a((Quaternionfc)a.d.rotation((float)(-Math.atan2($$2, $$0)) - 1.5707964f));
        $$42.a((Quaternionfc)a.b.rotation((float)(-Math.atan2($$7, $$1)) - 1.5707964f));
        float $$9 = 0.0f - $$3 * 0.01f;
        float $$10 = $$8 / 32.0f - $$3 * 0.01f;
        $$52.a($$42, l, ($$4, $$5) -> {
            int $$6 = 8;
            float $$7 = 0.0f;
            float $$8 = 0.75f;
            float $$9 = 0.0f;
            for (int $$10 = 1; $$10 <= 8; ++$$10) {
                float $$11 = bgj.a((double)((float)$$10 * ((float)Math.PI * 2) / 8.0f)) * 0.75f;
                float $$12 = bgj.b((double)((float)$$10 * ((float)Math.PI * 2) / 8.0f)) * 0.75f;
                float $$13 = (float)$$10 / 8.0f;
                $$5.a($$4, $$7 * 0.2f, $$8 * 0.2f, 0.0f).a(-16777216).a($$9, $$9).b(ilg.d).c($$6).b($$4, 0.0f, -1.0f, 0.0f);
                $$5.a($$4, $$7, $$8, $$8).a(-1).a($$9, $$10).b(ilg.d).c($$6).b($$4, 0.0f, -1.0f, 0.0f);
                $$5.a($$4, $$11, $$12, $$8).a(-1).a($$13, $$10).b(ilg.d).c($$6).b($$4, 0.0f, -1.0f, 0.0f);
                $$5.a($$4, $$11 * 0.2f, $$12 * 0.2f, 0.0f).a(-16777216).a($$13, $$9).b(ilg.d).c($$6).b($$4, 0.0f, -1.0f, 0.0f);
                $$7 = $$11;
                $$8 = $$12;
                $$9 = $$13;
            }
        });
        $$42.b();
    }

    public idd a() {
        return new idd();
    }

    @Override
    public void a(cyc $$0, idd $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = bgj.h($$2, $$0.d, $$0.e);
        $$1.b = $$0.cu > 0 ? (float)$$0.cu + $$2 : 0.0f;
        $$1.c = $$0.bu > 0;
        cyb $$3 = $$0.cw;
        if ($$3 != null) {
            ftm $$4 = $$3.p($$2).b(0.0, hwk.a((float)$$3.a + $$2), 0.0);
            $$1.d = $$4.d($$0.p($$2));
        } else {
            $$1.d = null;
        }
        cyn $$5 = $$0.gN().a();
        $$1.e = $$5 == cyt.d || $$5 == cyt.e;
        $$1.f = $$5.a();
        is $$6 = $$0.ao().a(euq.a.f, exv.a($$0.k()));
        $$1.g = $$6.b($$0.dI());
        $$1.h = $$0.fa() ? 0.0f : $$2;
        $$1.i.a($$0.b);
    }

    protected boolean a(cyc $$0) {
        return false;
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }

    @Override
    protected /* synthetic */ boolean b(cgk cgk2) {
        return this.a((cyc)cgk2);
    }
}

