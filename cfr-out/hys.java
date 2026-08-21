/*
 * Decompiled with CFR 0.152.
 */
public class hys
extends hvh<cxj, iez, hco> {
    private static final amo a = amo.b("textures/entity/sheep/sheep.png");

    public hys(hwq.a $$0) {
        super($$0, new hco($$0.a(hdf.cX)), new hco($$0.a(hdf.cY)), 0.7f);
        this.a(new ibm(this, $$0.f()));
        this.a(new ibl(this, $$0.f()));
    }

    public amo a(iez $$0) {
        return a;
    }

    public iez b() {
        return new iez();
    }

    @Override
    public void a(cxj $$0, iez $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.b = $$0.M($$2);
        $$1.a = $$0.L($$2);
        $$1.c = $$0.gQ();
        $$1.d = $$0.gP();
        $$1.e = hys.a($$0, "jeb_");
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((iez)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

