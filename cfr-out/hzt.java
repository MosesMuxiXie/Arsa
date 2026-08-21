/*
 * Decompiled with CFR 0.152.
 */
public class hzt
extends hwp<det, idf> {
    private static final amo a = amo.b("textures/entity/projectiles/wind_charge.png");
    private final hhh f;

    public hzt(hwq.a $$0) {
        super($$0);
        this.f = new hhh($$0.a(hdf.ei));
    }

    @Override
    public void a(idf $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$2.a(this.f, $$0, $$1, ijt.a(a, this.a($$0.L) % 1.0f, 0.0f), $$0.T, ilg.d, $$0.U, null);
        super.a($$0, $$1, $$2, $$3);
    }

    protected float a(float $$0) {
        return $$0 * 0.03f;
    }

    @Override
    public idf d() {
        return new idf();
    }
}

