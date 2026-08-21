/*
 * Decompiled with CFR 0.152.
 */
public abstract class hgn
extends gzm<icp> {
    private final hdg b;
    private final hdg c;

    public hgn(hdg $$0) {
        super($$0);
        this.b = $$0.b("left_paddle");
        this.c = $$0.b("right_paddle");
    }

    @Override
    public void a(icp $$0) {
        super.a($$0);
        hgn.a($$0.g, 0, this.b);
        hgn.a($$0.h, 1, this.c);
    }

    private static void a(float $$0, int $$1, hdg $$2) {
        $$2.e = bgj.b((bgj.a((double)(-$$0)) + 1.0f) / 2.0f, -1.0471976f, -0.2617994f);
        $$2.f = bgj.b((bgj.a((double)(-$$0 + 1.0f)) + 1.0f) / 2.0f, -0.7853982f, 0.7853982f);
        if ($$1 == 1) {
            $$2.f = (float)Math.PI - $$2.f;
        }
    }
}

