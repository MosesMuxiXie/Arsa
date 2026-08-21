/*
 * Decompiled with CFR 0.152.
 */
public class hxa
extends hxx<czv, idq, hei> {
    private static final amo a = amo.b("textures/entity/ghast/ghast.png");
    private static final amo i = amo.b("textures/entity/ghast/ghast_shooting.png");

    public hxa(hwq.a $$0) {
        super($$0, new hei($$0.a(hdf.bg)), 1.5f);
    }

    public amo a(idq $$0) {
        if ($$0.a) {
            return i;
        }
        return a;
    }

    public idq b() {
        return new idq();
    }

    @Override
    public void a(czv $$0, idq $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.k();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((idq)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

