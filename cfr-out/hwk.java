/*
 * Decompiled with CFR 0.152.
 */
public class hwk
extends hwp<cyb, idc> {
    private static final amo a = amo.b("textures/entity/end_crystal/end_crystal.png");
    private static final ijs f = ijt.g(a);
    private final hgx g;

    public hwk(hwq.a $$0) {
        super($$0);
        this.d = 0.5f;
        this.g = new hgx($$0.a(hdf.aZ));
    }

    @Override
    public void a(idc $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        $$1.b(2.0f, 2.0f, 2.0f);
        $$1.a(0.0f, -0.5f, 0.0f);
        $$2.a(this.g, $$0, $$1, f, $$0.T, ilg.d, $$0.U, null);
        $$1.b();
        ftm $$4 = $$0.b;
        if ($$4 != null) {
            float $$5 = hwk.a($$0.L);
            float $$6 = (float)$$4.g;
            float $$7 = (float)$$4.h;
            float $$8 = (float)$$4.i;
            $$1.a($$4);
            hwl.a(-$$6, -$$7 + $$5, -$$8, $$0.L, $$1, $$2, $$0.T);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    public static float a(float $$0) {
        float $$1 = bgj.a((double)($$0 * 0.2f)) / 2.0f + 0.5f;
        $$1 = ($$1 * $$1 + $$1) * 0.4f;
        return $$1 - 1.4f;
    }

    public idc a() {
        return new idc();
    }

    @Override
    public void a(cyb $$0, idc $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.L = (float)$$0.a + $$2;
        $$1.a = $$0.f();
        is $$3 = $$0.e();
        $$1.b = $$3 != null ? ftm.b($$3).d($$0.p($$2)) : null;
    }

    @Override
    public boolean a(cyb $$0, htx $$1, double $$2, double $$3, double $$4) {
        return super.a($$0, $$1, $$2, $$3, $$4) || $$0.e() != null;
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

