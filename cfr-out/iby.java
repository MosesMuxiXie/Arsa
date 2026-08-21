/*
 * Decompiled with CFR 0.152.
 */
public class iby
extends iat<ifv, hfv> {
    private static final amo a = amo.b("textures/entity/wither/wither_armor.png");
    private final hfv b;

    public iby(hyq<ifv, hfv> $$0, hdc $$1) {
        super($$0);
        this.b = new hfv($$1.a(hdf.el));
    }

    @Override
    protected boolean a(ifv $$0) {
        return $$0.d;
    }

    @Override
    protected float a(float $$0) {
        return bgj.b((double)($$0 * 0.02f)) * 3.0f;
    }

    @Override
    protected amo a() {
        return a;
    }

    protected hfv b() {
        return this.b;
    }

    @Override
    protected /* synthetic */ gzm c() {
        return this.b();
    }
}

