/*
 * Decompiled with CFR 0.152.
 */
public class haq
extends hap<idb> {
    public static final float f = 0.87f;
    public static final float g = 0.92f;
    private static final hdp h = $$0 -> {
        haq.a($$0.a());
        return $$0;
    };
    private final hdg i;
    private final hdg j;

    public haq(hdg $$0) {
        super($$0);
        this.i = this.d.b("left_chest");
        this.j = this.d.b("right_chest");
    }

    public static hdm a(float $$0) {
        return hdm.a(hap.a(hdk.a), 64, 64).a(h).a(hdp.scaling($$0));
    }

    public static hdm b(float $$0) {
        return hdm.a(hap.c(hdk.a), 64, 64).a(h).a(c).a(hdp.scaling($$0));
    }

    public static hdm a(float $$0, boolean $$1) {
        return har.b($$1).a(h).a($$1 ? hap.c : hdp.a).a(hdp.scaling($$0));
    }

    private static void a(hdq $$0) {
        hdq $$1 = $$0.b("body");
        hdl $$2 = hdl.c().a(26, 21).a(-4.0f, 0.0f, -2.0f, 8.0f, 8.0f, 3.0f);
        $$1.a("left_chest", $$2, hdi.a(6.0f, -8.0f, 0.0f, 0.0f, -1.5707964f, 0.0f));
        $$1.a("right_chest", $$2, hdi.a(-6.0f, -8.0f, 0.0f, 0.0f, 1.5707964f, 0.0f));
        hdq $$3 = $$0.b("head_parts").b("head");
        hdl $$4 = hdl.c().a(0, 12).a(-1.0f, -7.0f, 0.0f, 2.0f, 7.0f, 1.0f);
        $$3.a("left_ear", $$4, hdi.a(1.25f, -10.0f, 4.0f, 0.2617994f, 0.0f, 0.2617994f));
        $$3.a("right_ear", $$4, hdi.a(-1.25f, -10.0f, 4.0f, 0.2617994f, 0.0f, -0.2617994f));
    }

    @Override
    public void a(idb $$0) {
        super.a($$0);
        this.i.k = $$0.a;
        this.j.k = $$0.a;
    }
}

