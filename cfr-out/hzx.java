/*
 * Decompiled with CFR 0.152.
 */
public class hzx
extends hwp<der, ifw> {
    private static final amo a = amo.b("textures/entity/wither/wither_invulnerable.png");
    private static final amo f = amo.b("textures/entity/wither/wither.png");
    private final hhl g;

    public hzx(hwq.a $$0) {
        super($$0);
        this.g = new hhl($$0.a(hdf.ep));
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("head", hdl.c().a(0, 35).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f), hdi.a);
        return hdm.a($$0, 64, 64);
    }

    @Override
    protected int a(der $$0, is $$1) {
        return 15;
    }

    @Override
    public void a(ifw $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        $$1.b(-1.0f, -1.0f, 1.0f);
        $$2.a(this.g, $$0.b, $$1, this.g.a(this.a($$0)), $$0.T, ilg.d, $$0.U, null);
        $$1.b();
        super.a($$0, $$1, $$2, $$3);
    }

    private amo a(ifw $$0) {
        return $$0.a ? a : f;
    }

    public ifw b() {
        return new ifw();
    }

    @Override
    public void a(der $$0, ifw $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.u();
        $$1.b.a = 0.0f;
        $$1.b.b = $$0.l($$2);
        $$1.b.c = $$0.k($$2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

