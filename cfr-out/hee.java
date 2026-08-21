/*
 * Decompiled with CFR 0.152.
 */
public class hee<T extends ide>
extends gzo<T> {
    public hee(hdg $$0) {
        super($$0);
    }

    public static hdm e() {
        float $$0 = -14.0f;
        hdo $$1 = gzo.a(hdk.a, -14.0f);
        hdq $$2 = $$1.a();
        hdq $$3 = $$2.a("head", hdl.c().a(0, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f), hdi.a(0.0f, -13.0f, 0.0f));
        $$3.a("hat", hdl.c().a(0, 16).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new hdk(-0.5f)), hdi.a);
        $$2.a("body", hdl.c().a(32, 16).a(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f), hdi.a(0.0f, -14.0f, 0.0f));
        $$2.a("right_arm", hdl.c().a(56, 0).a(-1.0f, -2.0f, -1.0f, 2.0f, 30.0f, 2.0f), hdi.a(-5.0f, -12.0f, 0.0f));
        $$2.a("left_arm", hdl.c().a(56, 0).a().a(-1.0f, -2.0f, -1.0f, 2.0f, 30.0f, 2.0f), hdi.a(5.0f, -12.0f, 0.0f));
        $$2.a("right_leg", hdl.c().a(56, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, 30.0f, 2.0f), hdi.a(-2.0f, -5.0f, 0.0f));
        $$2.a("left_leg", hdl.c().a(56, 0).a().a(-1.0f, 0.0f, -1.0f, 2.0f, 30.0f, 2.0f), hdi.a(2.0f, -5.0f, 0.0f));
        return hdm.a($$1, 64, 32);
    }

    @Override
    public void a(T $$0) {
        super.a($$0);
        this.h.k = true;
        this.k.e *= 0.5f;
        this.l.e *= 0.5f;
        this.m.e *= 0.5f;
        this.n.e *= 0.5f;
        float $$1 = 0.4f;
        this.k.e = bgj.a(this.k.e, -0.4f, 0.4f);
        this.l.e = bgj.a(this.l.e, -0.4f, 0.4f);
        this.m.e = bgj.a(this.m.e, -0.4f, 0.4f);
        this.n.e = bgj.a(this.n.e, -0.4f, 0.4f);
        if (((ide)$$0).b != null) {
            this.k.e = -0.5f;
            this.l.e = -0.5f;
            this.k.g = 0.05f;
            this.l.g = -0.05f;
        }
        if (((ide)$$0).a) {
            float $$2 = 5.0f;
            this.h.c -= 5.0f;
            this.i.c += 5.0f;
        }
    }
}

