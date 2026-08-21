/*
 * Decompiled with CFR 0.152.
 */
public class hyo
extends hvb {
    private final gzm<icp> a;
    private final amo f;

    public hyo(hwq.a $$02, hde $$1) {
        super($$02);
        this.f = $$1.a().a($$0 -> "textures/entity/" + $$0 + ".png");
        this.a = new hgp($$02.a($$1));
    }

    @Override
    protected gzm<icp> a() {
        return this.a;
    }

    @Override
    protected ijs b() {
        return this.a.a(this.f);
    }
}

