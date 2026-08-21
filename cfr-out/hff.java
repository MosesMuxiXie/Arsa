/*
 * Decompiled with CFR 0.152.
 */
public class hff
extends hfg<icq> {
    private final hdg q;

    public hff(hdg $$0) {
        super($$0);
        this.q = $$0.b("head").b("mushrooms");
    }

    public static hdm e() {
        hdo $$0 = gzo.a(hdk.a, 0.0f);
        hdq $$1 = $$0.a();
        hfg.a($$1);
        hdq $$2 = $$1.b("head").a("mushrooms", hdl.c(), hdi.a);
        $$2.a("red_mushroom_1", hdl.c().a(50, 16).a(-3.0f, -3.0f, 0.0f, 6.0f, 4.0f, 0.0f), hdi.a(3.0f, -8.0f, 3.0f, 0.0f, 0.7853982f, 0.0f));
        $$2.a("red_mushroom_2", hdl.c().a(50, 16).a(-3.0f, -3.0f, 0.0f, 6.0f, 4.0f, 0.0f), hdi.a(3.0f, -8.0f, 3.0f, 0.0f, 2.3561945f, 0.0f));
        $$2.a("brown_mushroom_1", hdl.c().a(50, 22).a(-3.0f, -3.0f, 0.0f, 6.0f, 4.0f, 0.0f), hdi.a(-3.0f, -8.0f, -3.0f, 0.0f, 0.7853982f, 0.0f));
        $$2.a("brown_mushroom_2", hdl.c().a(50, 22).a(-3.0f, -3.0f, 0.0f, 6.0f, 4.0f, 0.0f), hdi.a(-3.0f, -8.0f, -3.0f, 0.0f, 2.3561945f, 0.0f));
        $$2.a("brown_mushroom_3", hdl.c().a(50, 28).a(-3.0f, -4.0f, 0.0f, 6.0f, 4.0f, 0.0f), hdi.a(-2.0f, -1.0f, 4.0f, -1.5707964f, 0.0f, 0.7853982f));
        $$2.a("brown_mushroom_4", hdl.c().a(50, 28).a(-3.0f, -4.0f, 0.0f, 6.0f, 4.0f, 0.0f), hdi.a(-2.0f, -1.0f, 4.0f, -1.5707964f, 0.0f, 2.3561945f));
        return hdm.a($$0, 64, 32);
    }

    @Override
    public void a(icq $$0) {
        super.a($$0);
        this.q.k = !$$0.a;
    }
}

