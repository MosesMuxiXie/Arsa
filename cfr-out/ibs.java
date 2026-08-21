/*
 * Decompiled with CFR 0.152.
 */
public class ibs
extends ibj<ick, hht> {
    public static final amo a = amo.b("textures/entity/trident_riptide.png");
    private final hda b;

    public ibs(hyq<ick, hht> $$0, hdc $$1) {
        super($$0);
        this.b = new hda($$1.a(hdf.cL));
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, ick $$3, float $$4, float $$5) {
        if (!$$3.aG) {
            return;
        }
        $$1.a(this.b, $$3, $$0, this.b.a(a), $$2, ilg.d, $$3.U, null);
    }
}

