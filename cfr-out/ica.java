/*
 * Decompiled with CFR 0.152.
 */
public class ica
extends ibj<ifx, hcw> {
    private static final amo a = amo.b("textures/entity/wolf/wolf_collar.png");

    public ica(hyq<ifx, hcw> $$0) {
        super($$0);
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, ifx $$3, float $$4, float $$5) {
        dkr $$6 = $$3.h;
        if ($$6 == null || $$3.Q) {
            return;
        }
        int $$7 = $$6.d();
        $$1.a(1).a(this.d(), $$3, $$0, ijt.g(a), $$2, ilg.d, $$7, (ilp)null, $$3.U, (igi.a)null);
    }
}

