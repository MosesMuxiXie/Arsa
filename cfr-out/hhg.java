/*
 * Decompiled with CFR 0.152.
 */
public class hhg
extends gzp<bhr> {
    public static final amo a = amo.b("textures/entity/trident.png");

    public hhg(hdg $$0) {
        super($$0, ijt::d);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("pole", hdl.c().a(0, 6).a(-0.5f, 2.0f, -0.5f, 1.0f, 25.0f, 1.0f), hdi.a);
        $$2.a("base", hdl.c().a(4, 0).a(-1.5f, 0.0f, -0.5f, 3.0f, 2.0f, 1.0f), hdi.a);
        $$2.a("left_spike", hdl.c().a(4, 3).a(-2.5f, -3.0f, -0.5f, 1.0f, 4.0f, 1.0f), hdi.a);
        $$2.a("middle_spike", hdl.c().a(0, 0).a(-0.5f, -4.0f, -0.5f, 1.0f, 4.0f, 1.0f), hdi.a);
        $$2.a("right_spike", hdl.c().a(4, 3).a().a(1.5f, -3.0f, -0.5f, 1.0f, 4.0f, 1.0f), hdi.a);
        return hdm.a($$0, 32, 32);
    }
}

