/*
 * Decompiled with CFR 0.152.
 */
public class hyj
extends hxi<dbi, iet, hew> {
    private static final amo i = amo.b("textures/entity/piglin/piglin.png");
    private static final amo j = amo.b("textures/entity/piglin/piglin_brute.png");
    public static final iao.a a = new iao.a(0.0f, 0.0f, 1.0019531f);

    public hyj(hwq.a $$0, hde $$1, hde $$2, hvk<hde> $$3, hvk<hde> $$4) {
        super($$0, new hew($$0.a($$1)), new hew($$0.a($$2)), 0.5f, a);
        this.a(new iay<iet, hew, hew>(this, hvk.a($$3, $$0.f(), hew::new), hvk.a($$4, $$0.f(), hew::new), $$0.h()));
    }

    public amo a(iet $$0) {
        return $$0.a ? j : i;
    }

    public iet b() {
        return new iet();
    }

    @Override
    public void a(dbi $$0, iet $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.ay() == cgu.ba;
        $$1.d = $$0.gS();
        $$1.c = dkm.b($$0.gb(), $$0);
        $$1.b = $$0.gQ();
    }

    @Override
    protected boolean b(iet $$0) {
        return super.a($$0) || $$0.b;
    }

    @Override
    protected /* synthetic */ boolean a(ieh ieh2) {
        return this.b((iet)ieh2);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((iet)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

