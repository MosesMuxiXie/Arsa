/*
 * Decompiled with CFR 0.152.
 */
public class iaq
extends ibj<ida, han> {
    public iaq(hyq<ida, han> $$0) {
        super($$0);
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, ida $$3, float $$4, float $$5) {
        ihm $$6 = $$3.i;
        if ($$6.e()) {
            return;
        }
        $$0.a();
        float $$7 = 1.0f;
        float $$8 = -1.0f;
        float $$9 = bgj.c($$3.av) / 60.0f;
        if ($$3.av < 0.0f) {
            $$0.a(0.0f, 1.0f - $$9 * 0.5f, -1.0f + $$9 * 0.5f);
        } else {
            $$0.a(0.0f, 1.0f + $$9 * 0.8f, -1.0f + $$9 * 0.2f);
        }
        $$6.a($$0, $$1, $$2, ilg.d, $$3.U);
        $$0.b();
    }
}

