/*
 * Decompiled with CFR 0.152.
 */
public class iad
extends hxi<dcp, iga, hex> {
    private static final amo a = amo.b("textures/entity/piglin/zombified_piglin.png");

    public iad(hwq.a $$0, hde $$1, hde $$2, hvk<hde> $$3, hvk<hde> $$4) {
        super($$0, new hex($$0.a($$1)), new hex($$0.a($$2)), 0.5f, hyj.a);
        this.a(new iay<iga, hex, hex>(this, hvk.a($$3, $$0.f(), hex::new), hvk.a($$4, $$0.f(), hex::new), $$0.h()));
    }

    public amo a(iga $$0) {
        return a;
    }

    public iga b() {
        return new iga();
    }

    @Override
    public void a(dcp $$0, iga $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.gI();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((iga)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

