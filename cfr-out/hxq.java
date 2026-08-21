/*
 * Decompiled with CFR 0.152.
 */
public class hxq
extends hwp<czd, idf> {
    private static final amo a = amo.b("textures/entity/lead_knot.png");
    private final hhc f;

    public hxq(hwq.a $$0) {
        super($$0);
        this.f = new hhc($$0.a(hdf.bL));
    }

    @Override
    public void a(idf $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        $$1.b(-1.0f, -1.0f, 1.0f);
        $$2.a(this.f, $$0, $$1, this.f.a(a), $$0.T, ilg.d, $$0.U, null);
        $$1.b();
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public idf d() {
        return new idf();
    }
}

