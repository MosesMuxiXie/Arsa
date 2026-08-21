/*
 * Decompiled with CFR 0.152.
 */
public class hzj
extends hve<dgr, iel> {
    public hzj(hwq.a $$0) {
        super($$0, hdf.dI);
    }

    @Override
    protected void a(iel $$0, eoh $$1, fzm $$2, hpo $$3, int $$4) {
        float $$5 = $$0.n;
        if ($$5 > -1.0f && $$5 < 10.0f) {
            float $$6 = 1.0f - $$5 / 10.0f;
            $$6 = bgj.a($$6, 0.0f, 1.0f);
            $$6 *= $$6;
            $$6 *= $$6;
            float $$7 = 1.0f + $$6 * 0.3f;
            $$2.b($$7, $$7, $$7);
        }
        hzj.a($$1, $$2, $$3, $$4, $$5 > -1.0f && (int)$$5 / 5 % 2 == 0, $$0.U);
    }

    public static void a(eoh $$0, fzm $$1, hpo $$2, int $$3, boolean $$4, int $$5) {
        int $$7;
        if ($$4) {
            int $$6 = ilg.a(ilg.a(1.0f), 10);
        } else {
            $$7 = ilg.d;
        }
        $$2.a($$1, $$0, $$3, $$7, $$5);
    }

    public iel a() {
        return new iel();
    }

    @Override
    public void a(dgr $$0, iel $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.n = $$0.e() > -1 ? (float)$$0.e() - $$2 + 1.0f : -1.0f;
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

