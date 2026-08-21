/*
 * Decompiled with CFR 0.152.
 */
public class hhe
extends gzm<icj> {
    public hhe(hdg $$0) {
        super($$0, ijt::f);
    }

    public static hdm a() {
        hdo $$02 = new hdo();
        hdq $$1 = $$02.a();
        $$1.a("back", hdl.c().a(0, 0).a(0.0f, -2.5f, -2.5f, 0.0f, 5.0f, 5.0f), hdi.a(-11.0f, 0.0f, 0.0f, 0.7853982f, 0.0f, 0.0f).a(0.8f));
        hdl $$2 = hdl.c().a(0, 0).a(-12.0f, -2.0f, 0.0f, 16.0f, 4.0f, 0.0f, hdk.a, 1.0f, 0.8f);
        $$1.a("cross_1", $$2, hdi.b(0.7853982f, 0.0f, 0.0f));
        $$1.a("cross_2", $$2, hdi.b(2.3561945f, 0.0f, 0.0f));
        return hdm.a($$02.a($$0 -> $$0.b(0.9f)), 32, 32);
    }

    @Override
    public void a(icj $$0) {
        super.a($$0);
        if ($$0.c > 0.0f) {
            float $$1 = -bgj.a((double)($$0.c * 3.0f)) * $$0.c;
            this.o.g += $$1 * ((float)Math.PI / 180);
        }
    }
}

