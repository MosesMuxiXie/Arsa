/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hwx
extends hwp<ddz, idn> {
    private static final amo a = amo.b("textures/entity/fishing_hook.png");
    private static final ijs f = ijt.f(a);
    private static final double g = 960.0;

    public hwx(hwq.a $$0) {
        super($$0);
    }

    @Override
    public boolean a(ddz $$0, htx $$1, double $$2, double $$3, double $$4) {
        return super.a($$0, $$1, $$2, $$3, $$4) && $$0.i() != null;
    }

    @Override
    public void a(idn $$0, fzm $$12, hpo $$22, ikp $$3) {
        $$12.a();
        $$12.a();
        $$12.b(0.5f, 0.5f, 0.5f);
        $$12.a((Quaternionfc)$$3.e);
        $$22.a($$12, f, ($$1, $$2) -> {
            hwx.a($$2, $$1, $$0.T, 0.0f, 0, 0, 1);
            hwx.a($$2, $$1, $$0.T, 1.0f, 0, 1, 1);
            hwx.a($$2, $$1, $$0.T, 1.0f, 1, 1, 0);
            hwx.a($$2, $$1, $$0.T, 0.0f, 1, 0, 0);
        });
        $$12.b();
        float $$42 = (float)$$0.a.g;
        float $$52 = (float)$$0.a.h;
        float $$6 = (float)$$0.a.i;
        float $$7 = gfj.V().aR().v();
        $$22.a($$12, ijt.r(), ($$4, $$5) -> {
            int $$6 = 16;
            for (int $$7 = 0; $$7 < 16; ++$$7) {
                float $$8 = hwx.a($$7, 16);
                float $$9 = hwx.a($$7 + 1, 16);
                hwx.a($$42, $$52, $$6, $$5, $$4, $$8, $$9, $$7);
                hwx.a($$42, $$52, $$6, $$5, $$4, $$9, $$8, $$7);
            }
        });
        $$12.b();
        super.a($$0, $$12, $$22, $$3);
    }

    public static chb a(ddm $$0) {
        return $$0.fx().h() instanceof dlc ? $$0.at() : $$0.at().a();
    }

    private ftm a(ddm $$0, float $$1, float $$2) {
        int $$3;
        int n2 = $$3 = hwx.a($$0) == chb.b ? 1 : -1;
        if (!this.c.d.aV().a() || $$0 != gfj.V().s) {
            float $$4 = bgj.h($$2, $$0.bD, $$0.bC) * ((float)Math.PI / 180);
            double $$5 = bgj.a((double)$$4);
            double $$6 = bgj.b((double)$$4);
            float $$7 = $$0.eF();
            double $$8 = (double)$$3 * 0.35 * (double)$$7;
            double $$9 = 0.8 * (double)$$7;
            float $$10 = $$0.cz() ? -0.1875f : 0.0f;
            return $$0.n($$2).b(-$$6 * $$8 - $$5 * $$9, (double)$$10 - 0.45 * (double)$$7, -$$5 * $$8 + $$6 * $$9);
        }
        double $$11 = 960.0 / (double)this.c.d.az().b().intValue();
        ftm $$12 = this.c.b.l().a((float)$$3 * 0.525f, -0.1f).c($$11).b($$1 * 0.5f).a(-$$1 * 0.7f);
        return $$0.n($$2).e($$12);
    }

    private static float a(int $$0, int $$1) {
        return (float)$$0 / (float)$$1;
    }

    private static void a(fzp $$0, fzm.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
        $$0.a($$1, $$3 - 0.5f, (float)$$4 - 0.5f, 0.0f).a(-1).a((float)$$5, (float)$$6).b(ilg.d).c($$2).b($$1, 0.0f, 1.0f, 0.0f);
    }

    private static void a(float $$0, float $$1, float $$2, fzp $$3, fzm.a $$4, float $$5, float $$6, float $$7) {
        float $$8 = $$0 * $$5;
        float $$9 = $$1 * ($$5 * $$5 + $$5) * 0.5f + 0.25f;
        float $$10 = $$2 * $$5;
        float $$11 = $$0 * $$6 - $$8;
        float $$12 = $$1 * ($$6 * $$6 + $$6) * 0.5f + 0.25f - $$9;
        float $$13 = $$2 * $$6 - $$10;
        float $$14 = bgj.a($$11 * $$11 + $$12 * $$12 + $$13 * $$13);
        $$3.a($$4, $$8, $$9, $$10).a(-16777216).b($$4, $$11 /= $$14, $$12 /= $$14, $$13 /= $$14).a($$7);
    }

    public idn a() {
        return new idn();
    }

    @Override
    public void a(ddz $$0, idn $$1, float $$2) {
        super.a($$0, $$1, $$2);
        ddm $$3 = $$0.i();
        if ($$3 == null) {
            $$1.a = ftm.c;
            return;
        }
        float $$4 = $$3.E($$2);
        float $$5 = bgj.a((double)(bgj.a($$4) * (float)Math.PI));
        ftm $$6 = this.a($$3, $$5, $$2);
        ftm $$7 = $$0.p($$2).b(0.0, 0.25, 0.0);
        $$1.a = $$6.d($$7);
    }

    protected boolean a(ddz $$0) {
        return false;
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }

    @Override
    protected /* synthetic */ boolean b(cgk cgk2) {
        return this.a((ddz)cgk2);
    }
}

