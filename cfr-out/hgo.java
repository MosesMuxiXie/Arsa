/*
 * Decompiled with CFR 0.152.
 */
public class hgo
extends hgn {
    private static final int b = 28;
    private static final int c = 32;
    private static final int d = 6;
    private static final int e = 20;
    private static final int f = 4;
    private static final String g = "water_patch";
    private static final String h = "back";
    private static final String i = "front";
    private static final String j = "right";
    private static final String k = "left";

    public hgo(hdg $$0) {
        super($$0);
    }

    private static void a(hdq $$0) {
        int $$1 = 16;
        int $$2 = 14;
        int $$3 = 10;
        $$0.a("bottom", hdl.c().a(0, 0).a(-14.0f, -9.0f, -3.0f, 28.0f, 16.0f, 3.0f), hdi.a(0.0f, 3.0f, 1.0f, 1.5707964f, 0.0f, 0.0f));
        $$0.a(h, hdl.c().a(0, 19).a(-13.0f, -7.0f, -1.0f, 18.0f, 6.0f, 2.0f), hdi.a(-15.0f, 4.0f, 4.0f, 0.0f, 4.712389f, 0.0f));
        $$0.a(i, hdl.c().a(0, 27).a(-8.0f, -7.0f, -1.0f, 16.0f, 6.0f, 2.0f), hdi.a(15.0f, 4.0f, 0.0f, 0.0f, 1.5707964f, 0.0f));
        $$0.a(j, hdl.c().a(0, 35).a(-14.0f, -7.0f, -1.0f, 28.0f, 6.0f, 2.0f), hdi.a(0.0f, 4.0f, -9.0f, 0.0f, (float)Math.PI, 0.0f));
        $$0.a(k, hdl.c().a(0, 43).a(-14.0f, -7.0f, -1.0f, 28.0f, 6.0f, 2.0f), hdi.a(0.0f, 4.0f, 9.0f));
        int $$4 = 20;
        int $$5 = 7;
        int $$6 = 6;
        float $$7 = -5.0f;
        $$0.a("left_paddle", hdl.c().a(62, 0).a(-1.0f, 0.0f, -5.0f, 2.0f, 2.0f, 18.0f).a(-1.001f, -3.0f, 8.0f, 1.0f, 6.0f, 7.0f), hdi.a(3.0f, -5.0f, 9.0f, 0.0f, 0.0f, 0.19634955f));
        $$0.a("right_paddle", hdl.c().a(62, 20).a(-1.0f, 0.0f, -5.0f, 2.0f, 2.0f, 18.0f).a(0.001f, -3.0f, 8.0f, 1.0f, 6.0f, 7.0f), hdi.a(3.0f, -5.0f, -9.0f, 0.0f, (float)Math.PI, 0.19634955f));
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hgo.a($$1);
        return hdm.a($$0, 128, 64);
    }

    public static hdm e() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hgo.a($$1);
        $$1.a("chest_bottom", hdl.c().a(0, 76).a(0.0f, 0.0f, 0.0f, 12.0f, 8.0f, 12.0f), hdi.a(-2.0f, -5.0f, -6.0f, 0.0f, -1.5707964f, 0.0f));
        $$1.a("chest_lid", hdl.c().a(0, 59).a(0.0f, 0.0f, 0.0f, 12.0f, 4.0f, 12.0f), hdi.a(-2.0f, -9.0f, -6.0f, 0.0f, -1.5707964f, 0.0f));
        $$1.a("chest_lock", hdl.c().a(0, 59).a(0.0f, 0.0f, 0.0f, 2.0f, 4.0f, 1.0f), hdi.a(-1.0f, -6.0f, -1.0f, 0.0f, -1.5707964f, 0.0f));
        return hdm.a($$0, 128, 128);
    }

    public static hdm f() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a(g, hdl.c().a(0, 0).a(-14.0f, -9.0f, -3.0f, 28.0f, 16.0f, 3.0f), hdi.a(0.0f, -3.0f, 1.0f, 1.5707964f, 0.0f, 0.0f));
        return hdm.a($$0, 0, 0);
    }
}

