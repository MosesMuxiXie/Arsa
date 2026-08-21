/*
 * Decompiled with CFR 0.152.
 */
public class her
extends hby {
    private final hdg d;

    public her(hdg $$0) {
        super($$0);
        hdg $$1 = this.c.b("shell");
        this.d = $$1.b("corals");
    }

    public static hdm a() {
        hdo $$0 = her.f();
        hdq $$1 = $$0.a().b("root").b("shell").a("corals", hdl.c(), hdi.a(8.0f, 4.5f, -8.0f));
        hdq $$2 = $$1.a("yellow_coral", hdl.c(), hdi.a(0.0f, -11.0f, 11.0f));
        $$2.a("yellow_coral_second", hdl.c().a(0, 85).a(-4.5f, -3.5f, 0.0f, 6.0f, 8.0f, 0.0f), hdi.a(0.0f, 0.0f, 2.0f, 0.0f, -0.7854f, 0.0f));
        $$2.a("yellow_coral_first", hdl.c().a(0, 85).a(-4.5f, -3.5f, 0.0f, 6.0f, 8.0f, 0.0f), hdi.a(0.0f, 0.0f, 0.0f, 0.0f, 0.7854f, 0.0f));
        hdq $$3 = $$1.a("pink_coral", hdl.c().a(-8, 94).a(-4.5f, 4.5f, 0.0f, 6.0f, 0.0f, 8.0f), hdi.a(-12.5f, -18.0f, 11.0f));
        $$3.a("pink_coral_second", hdl.c().a(-8, 94).a(-3.0f, 0.0f, -4.0f, 6.0f, 0.0f, 8.0f), hdi.a(-1.5f, 4.5f, 4.0f, 0.0f, 0.0f, 1.5708f));
        hdq $$4 = $$1.a("blue_coral", hdl.c(), hdi.a(-14.0f, 0.0f, 5.5f));
        $$4.a("blue_second", hdl.c().a(0, 102).a(-3.5f, -5.5f, 0.0f, 5.0f, 10.0f, 0.0f), hdi.a(0.0f, 0.0f, -2.0f, 0.0f, 0.7854f, 0.0f));
        $$4.a("blue_first", hdl.c().a(0, 102).a(-3.5f, -5.5f, 0.0f, 5.0f, 10.0f, 0.0f), hdi.a(0.0f, 0.0f, 0.0f, 0.0f, -0.7854f, 0.0f));
        hdq $$5 = $$1.a("red_coral", hdl.c(), hdi.a(0.0f, 0.0f, 0.0f));
        $$5.a("red_coral_second", hdl.c().a(0, 112).a(-2.5f, -5.5f, 0.0f, 4.0f, 10.0f, 0.0f), hdi.a(-0.5f, -1.0f, 1.5f, 0.0f, -0.829f, 0.0f));
        $$5.a("red_coral_first", hdl.c().a(0, 112).a(-4.5f, -5.5f, 0.0f, 6.0f, 10.0f, 0.0f), hdi.a(0.0f, 0.0f, 0.0f, 0.0f, 0.7854f, 0.0f));
        return hdm.a($$0, 128, 128);
    }

    @Override
    public void a(ien $$0) {
        super.a($$0);
        this.d.k = $$0.b.f();
    }
}

