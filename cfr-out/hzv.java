/*
 * Decompiled with CFR 0.152.
 */
public class hzv
extends hxx<cyw, ifv, hfv> {
    private static final amo a = amo.b("textures/entity/wither/wither_invulnerable.png");
    private static final amo i = amo.b("textures/entity/wither/wither.png");

    public hzv(hwq.a $$0) {
        super($$0, new hfv($$0.a(hdf.ek)), 1.0f);
        this.a(new iby(this, $$0.f()));
    }

    @Override
    protected int a(cyw $$0, is $$1) {
        return 15;
    }

    public amo a(ifv $$0) {
        int $$1 = bgj.b($$0.c);
        if ($$1 <= 0 || $$1 <= 80 && $$1 / 5 % 2 == 1) {
            return i;
        }
        return a;
    }

    public ifv b() {
        return new ifv();
    }

    @Override
    protected void a(ifv $$0, fzm $$1) {
        float $$2 = 2.0f;
        if ($$0.c > 0.0f) {
            $$2 -= $$0.c / 220.0f * 0.5f;
        }
        $$1.b($$2, $$2, $$2);
    }

    @Override
    public void a(cyw $$0, ifv $$1, float $$2) {
        super.a($$0, $$1, $$2);
        int $$3 = $$0.gR();
        $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0f;
        System.arraycopy($$0.gQ(), 0, $$1.a, 0, $$1.a.length);
        System.arraycopy($$0.gP(), 0, $$1.b, 0, $$1.b.length);
        $$1.d = $$0.gS();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ifv)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

