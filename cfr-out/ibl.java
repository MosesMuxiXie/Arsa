/*
 * Decompiled with CFR 0.152.
 */
public class ibl
extends ibj<iez, hco> {
    private static final amo a = amo.b("textures/entity/sheep/sheep_wool.png");
    private final gzm<iez> b;
    private final gzm<iez> c;

    public ibl(hyq<iez, hco> $$0, hdc $$1) {
        super($$0);
        this.b = new hcn($$1.a(hdf.da));
        this.c = new hcn($$1.a(hdf.cZ));
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, iez $$3, float $$4, float $$5) {
        gzm<iez> $$6;
        if ($$3.c) {
            return;
        }
        gzm<iez> gzm2 = $$6 = $$3.aE ? this.c : this.b;
        if ($$3.Q) {
            if ($$3.d()) {
                $$1.a($$6, $$3, $$0, ijt.s(a), $$2, hxs.a($$3, 0.0f), -16777216, null, $$3.U, null);
            }
            return;
        }
        ibl.a($$6, a, $$0, $$1, $$2, $$3, $$3.a(), 0);
    }
}

