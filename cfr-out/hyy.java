/*
 * Decompiled with CFR 0.152.
 */
public class hyy
extends hvh<cxm, ife, hcq> {
    private static final amo a = amo.b("textures/entity/sniffer/sniffer.png");

    public hyy(hwq.a $$0) {
        super($$0, new hcq($$0.a(hdf.dr)), new hcq($$0.a(hdf.ds)), 1.1f);
    }

    public amo a(ife $$0) {
        return a;
    }

    public ife b() {
        return new ife();
    }

    @Override
    public void a(cxm $$0, ife $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.gP();
        $$1.b.a($$0.cz);
        $$1.c.a($$0.cx);
        $$1.d.a($$0.cA);
        $$1.e.a($$0.cv);
        $$1.f.a($$0.cw);
    }

    @Override
    protected fth a(cxm $$0) {
        return super.a($$0).g(0.6f);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ife)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

