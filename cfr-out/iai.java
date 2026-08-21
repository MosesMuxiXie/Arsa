/*
 * Decompiled with CFR 0.152.
 */
public class iai
extends ibj<icr, hdw> {
    private static final amo a = amo.b("textures/entity/breeze/breeze_wind.png");
    private final hdw b;

    public iai(hyq<icr, hdw> $$0, hdc $$1) {
        super($$0);
        this.b = new hdw($$1.a(hdf.I));
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, icr $$3, float $$4, float $$5) {
        ijs $$6 = ijt.a(a, this.a($$3.L) % 1.0f, 0.0f);
        $$1.a(1).a(this.b, $$3, $$0, $$6, $$2, ilg.d, -1, null, $$3.U, null);
    }

    private float a(float $$0) {
        return $$0 * 0.02f;
    }
}

