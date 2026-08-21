/*
 * Decompiled with CFR 0.152.
 */
public class hzi
extends hvm<dei, ifl> {
    public static final amo a = amo.b("textures/entity/projectiles/arrow.png");
    public static final amo f = amo.b("textures/entity/projectiles/tipped_arrow.png");

    public hzi(hwq.a $$0) {
        super($$0);
    }

    @Override
    protected amo a(ifl $$0) {
        return $$0.d ? f : a;
    }

    public ifl a() {
        return new ifl();
    }

    @Override
    public void a(dei $$0, ifl $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.d = $$0.A() > 0;
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

