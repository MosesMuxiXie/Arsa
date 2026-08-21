/*
 * Decompiled with CFR 0.152.
 */
public class ial
extends ibj<ict, hau> {
    private static final amo a = amo.b("textures/entity/cat/cat_collar.png");
    private final hau b;
    private final hau c;

    public ial(hyq<ict, hau> $$0, hdc $$1) {
        super($$0);
        this.b = new hau($$1.a(hdf.T));
        this.c = new hau($$1.a(hdf.S));
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, ict $$3, float $$4, float $$5) {
        dkr $$6 = $$3.c;
        if ($$6 == null) {
            return;
        }
        int $$7 = $$6.d();
        hau $$8 = $$3.aE ? this.c : this.b;
        ial.a($$8, a, $$0, $$1, $$2, $$3, $$7, 1);
    }
}

