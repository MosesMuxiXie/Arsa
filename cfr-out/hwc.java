/*
 * Decompiled with CFR 0.152.
 */
public class hwc<T extends dat>
extends hxx<T, icx, hdy> {
    private static final amo a = amo.b("textures/entity/creaking/creaking.png");
    private static final amo i = amo.b("textures/entity/creaking/creaking_eyes.png");

    public hwc(hwq.a $$02) {
        super($$02, new hdy($$02.a(hdf.av)), 0.6f);
        this.a(new ibc<icx, hdy>(this, $$0 -> i, ($$0, $$1) -> $$0.d ? 1.0f : 0.0f, new hdy($$02.a(hdf.aw)), ijt::q, true));
    }

    public amo a(icx $$0) {
        return a;
    }

    public icx a() {
        return new icx();
    }

    @Override
    public void a(T $$0, icx $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.b.a(((dat)$$0).cv);
        $$1.a.a(((dat)$$0).cw);
        $$1.c.a(((dat)$$0).cx);
        if (((dat)$$0).gU()) {
            $$1.aw = 0.0f;
            $$1.aH = false;
            $$1.d = ((dat)$$0).gX();
        } else {
            $$1.d = ((dat)$$0).hb();
        }
        $$1.e = ((dat)$$0).gP();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((icx)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

