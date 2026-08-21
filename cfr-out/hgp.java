/*
 * Decompiled with CFR 0.152.
 */
public class hgp
extends hgn {
    public hgp(hdg $$0) {
        super($$0);
    }

    private static void a(hdq $$0) {
        $$0.a("bottom", hdl.c().a(0, 0).a(-14.0f, -11.0f, -4.0f, 28.0f, 20.0f, 4.0f).a(0, 0).a(-14.0f, -9.0f, -8.0f, 28.0f, 16.0f, 4.0f), hdi.a(0.0f, -2.1f, 1.0f, 1.5708f, 0.0f, 0.0f));
        int $$1 = 20;
        int $$2 = 7;
        int $$3 = 6;
        float $$4 = -5.0f;
        $$0.a("left_paddle", hdl.c().a(0, 24).a(-1.0f, 0.0f, -5.0f, 2.0f, 2.0f, 18.0f).a(-1.001f, -3.0f, 8.0f, 1.0f, 6.0f, 7.0f), hdi.a(3.0f, -4.0f, 9.0f, 0.0f, 0.0f, 0.19634955f));
        $$0.a("right_paddle", hdl.c().a(40, 24).a(-1.0f, 0.0f, -5.0f, 2.0f, 2.0f, 18.0f).a(0.001f, -3.0f, 8.0f, 1.0f, 6.0f, 7.0f), hdi.a(3.0f, -4.0f, -9.0f, 0.0f, (float)Math.PI, 0.19634955f));
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hgp.a($$1);
        return hdm.a($$0, 128, 64);
    }

    public static hdm e() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hgp.a($$1);
        $$1.a("chest_bottom", hdl.c().a(0, 76).a(0.0f, 0.0f, 0.0f, 12.0f, 8.0f, 12.0f), hdi.a(-2.0f, -10.1f, -6.0f, 0.0f, -1.5707964f, 0.0f));
        $$1.a("chest_lid", hdl.c().a(0, 59).a(0.0f, 0.0f, 0.0f, 12.0f, 4.0f, 12.0f), hdi.a(-2.0f, -14.1f, -6.0f, 0.0f, -1.5707964f, 0.0f));
        $$1.a("chest_lock", hdl.c().a(0, 59).a(0.0f, 0.0f, 0.0f, 2.0f, 4.0f, 1.0f), hdi.a(-1.0f, -11.1f, -1.0f, 0.0f, -1.5707964f, 0.0f));
        return hdm.a($$0, 128, 128);
    }
}

