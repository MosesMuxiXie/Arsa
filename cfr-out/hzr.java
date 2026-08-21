/*
 * Decompiled with CFR 0.152.
 */
public class hzr
extends hxx<dde, ifs, hgd> {
    private static final amo a = amo.b("textures/entity/wandering_trader.png");

    public hzr(hwq.a $$0) {
        super($$0, new hgd($$0.a(hdf.ea)), 0.5f);
        this.a(new iao<ifs, hgd>(this, $$0.f(), $$0.k()));
        this.a(new ian<ifs, hgd>(this));
    }

    public amo a(ifs $$0) {
        return a;
    }

    public ifs b() {
        return new ifs();
    }

    @Override
    public void a(dde $$0, ifs $$1, float $$2) {
        super.a($$0, $$1, $$2);
        idw.a($$0, $$1, this.g);
        $$1.a = $$0.p() > 0;
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ifs)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

