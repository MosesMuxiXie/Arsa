/*
 * Decompiled with CFR 0.152.
 */
public class iam
extends iat<icy, hea> {
    private static final amo a = amo.b("textures/entity/creeper/creeper_armor.png");
    private final hea b;

    public iam(hyq<icy, hea> $$0, hdc $$1) {
        super($$0);
        this.b = new hea($$1.a(hdf.ay));
    }

    @Override
    protected boolean a(icy $$0) {
        return $$0.b;
    }

    @Override
    protected float a(float $$0) {
        return $$0 * 0.01f;
    }

    @Override
    protected amo a() {
        return a;
    }

    protected hea b() {
        return this.b;
    }

    @Override
    protected /* synthetic */ gzm c() {
        return this.b();
    }
}

