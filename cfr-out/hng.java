/*
 * Decompiled with CFR 0.152.
 */
public class hng
extends hnf {
    private final gfo c;

    public hng(gfo $$0) {
        this.c = $$0;
    }

    private static float a(boolean $$0, boolean $$1) {
        if ($$0 == $$1) {
            return 0.0f;
        }
        return $$0 ? 1.0f : -1.0f;
    }

    @Override
    public void a() {
        this.a = new ddk(this.c.s.f(), this.c.u.f(), this.c.t.f(), this.c.v.f(), this.c.w.f(), this.c.x.f(), this.c.y.f());
        float $$0 = hng.a(this.a.a(), this.a.b());
        float $$1 = hng.a(this.a.c(), this.a.d());
        this.b = new ftl($$1, $$0).a();
    }
}

