/*
 * Decompiled with CFR 0.152.
 */
public class ibf
extends ibj<iep, hcc> {
    public ibf(hyq<iep, hcc> $$0) {
        super($$0);
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, iep $$3, float $$4, float $$5) {
        ihm $$6 = $$3.i;
        if ($$6.e() || !$$3.g || $$3.f) {
            return;
        }
        float $$7 = -0.6f;
        float $$8 = 1.4f;
        if ($$3.e) {
            $$7 -= 0.2f * bgj.a((double)($$3.L * 0.6f)) + 0.2f;
            $$8 -= 0.09f * bgj.a((double)($$3.L * 0.6f));
        }
        $$0.a();
        $$0.a(0.1f, $$8, $$7);
        $$6.a($$0, $$1, $$2, ilg.d, $$3.U);
        $$0.b();
    }
}

