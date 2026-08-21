/*
 * Decompiled with CFR 0.152.
 */
public class iar
extends ibj<ify, hfy> {
    private static final amo a = amo.b("textures/entity/zombie/drowned_outer_layer.png");
    private final hfy b;
    private final hfy c;

    public iar(hyq<ify, hfy> $$0, hdc $$1) {
        super($$0);
        this.b = new hfy($$1.a(hdf.aS));
        this.c = new hfy($$1.a(hdf.aQ));
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, ify $$3, float $$4, float $$5) {
        hfy $$6 = $$3.aE ? this.c : this.b;
        iar.a($$6, a, $$0, $$1, $$2, $$3, -1, 1);
    }
}

