/*
 * Decompiled with CFR 0.152.
 */
public class hzs
extends hxx<dch, ift, hfr> {
    private static final amo a = amo.b("textures/entity/warden/warden.png");
    private static final amo i = amo.b("textures/entity/warden/warden_bioluminescent_layer.png");
    private static final amo j = amo.b("textures/entity/warden/warden_heart.png");
    private static final amo k = amo.b("textures/entity/warden/warden_pulsating_spots_1.png");
    private static final amo l = amo.b("textures/entity/warden/warden_pulsating_spots_2.png");

    public hzs(hwq.a $$02) {
        super($$02, new hfr($$02.a(hdf.eb)), 0.9f);
        hfr $$12 = new hfr($$02.a(hdf.ec));
        hfr $$2 = new hfr($$02.a(hdf.ed));
        hfr $$3 = new hfr($$02.a(hdf.ee));
        hfr $$4 = new hfr($$02.a(hdf.ef));
        this.a(new ibc<ift, hfr>(this, $$0 -> i, ($$0, $$1) -> 1.0f, $$12, ijt::k, false));
        this.a(new ibc<ift, hfr>(this, $$0 -> k, ($$0, $$1) -> Math.max(0.0f, bgj.b((double)($$1 * 0.045f)) * 0.25f), $$2, ijt::k, false));
        this.a(new ibc<ift, hfr>(this, $$0 -> l, ($$0, $$1) -> Math.max(0.0f, bgj.b((double)($$1 * 0.045f + (float)Math.PI)) * 0.25f), $$2, ijt::k, false));
        this.a(new ibc<ift, hfr>(this, $$0 -> a, ($$0, $$1) -> $$0.a, $$3, ijt::k, false));
        this.a(new ibc<ift, hfr>(this, $$0 -> j, ($$0, $$1) -> $$0.b, $$4, ijt::k, false));
    }

    public amo a(ift $$0) {
        return a;
    }

    public ift b() {
        return new ift();
    }

    @Override
    public void a(dch $$0, ift $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.L($$2);
        $$1.b = $$0.M($$2);
        $$1.c.a($$0.a);
        $$1.d.a($$0.b);
        $$1.e.a($$0.c);
        $$1.f.a($$0.d);
        $$1.g.a($$0.e);
        $$1.h.a($$0.f);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ift)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

