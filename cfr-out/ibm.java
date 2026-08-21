/*
 * Decompiled with CFR 0.152.
 */
public class ibm
extends ibj<iez, hco> {
    private static final amo a = amo.b("textures/entity/sheep/sheep_wool_undercoat.png");
    private final gzm<iez> b;
    private final gzm<iez> c;

    public ibm(hyq<iez, hco> $$0, hdc $$1) {
        super($$0);
        this.b = new hcn($$1.a(hdf.db));
        this.c = new hcn($$1.a(hdf.dc));
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, iez $$3, float $$4, float $$5) {
        if ($$3.Q || !$$3.e && $$3.d == dkr.a) {
            return;
        }
        gzm<iez> $$6 = $$3.aE ? this.c : this.b;
        ibm.a($$6, a, $$0, $$1, $$2, $$3, $$3.a(), 1);
    }
}

