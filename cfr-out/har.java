/*
 * Decompiled with CFR 0.152.
 */
public class har
extends hap<idg> {
    private static final String f = "saddle";
    private static final String g = "left_saddle_mouth";
    private static final String h = "left_saddle_line";
    private static final String i = "right_saddle_mouth";
    private static final String j = "right_saddle_line";
    private static final String k = "head_saddle";
    private static final String l = "mouth_saddle_wrap";
    private final hdg[] m;

    public har(hdg $$0) {
        super($$0);
        hdg $$1 = this.e.b(h);
        hdg $$2 = this.e.b(j);
        this.m = new hdg[]{$$1, $$2};
    }

    public static hdm a(boolean $$0) {
        return har.b($$0).a($$0 ? c : hdp.a);
    }

    public static hdm b(boolean $$0) {
        hdo $$1 = $$0 ? har.c(hdk.a) : har.a(hdk.a);
        hdq $$2 = $$1.a();
        hdq $$3 = $$2.b("body");
        hdq $$4 = $$2.b("head_parts");
        $$3.a(f, hdl.c().a(26, 0).a(-5.0f, -8.0f, -9.0f, 10.0f, 9.0f, 9.0f, new hdk(0.5f)), hdi.a);
        $$4.a(g, hdl.c().a(29, 5).a(2.0f, -9.0f, -6.0f, 1.0f, 2.0f, 2.0f), hdi.a);
        $$4.a(i, hdl.c().a(29, 5).a(-3.0f, -9.0f, -6.0f, 1.0f, 2.0f, 2.0f), hdi.a);
        $$4.a(h, hdl.c().a(32, 2).a(3.1f, -6.0f, -8.0f, 0.0f, 3.0f, 16.0f), hdi.b(-0.5235988f, 0.0f, 0.0f));
        $$4.a(j, hdl.c().a(32, 2).a(-3.1f, -6.0f, -8.0f, 0.0f, 3.0f, 16.0f), hdi.b(-0.5235988f, 0.0f, 0.0f));
        $$4.a(k, hdl.c().a(1, 1).a(-3.0f, -11.0f, -1.9f, 6.0f, 5.0f, 6.0f, new hdk(0.22f)), hdi.a);
        $$4.a(l, hdl.c().a(19, 0).a(-2.0f, -11.0f, -4.0f, 4.0f, 5.0f, 2.0f, new hdk(0.2f)), hdi.a);
        return hdm.a($$1, 64, 64);
    }

    @Override
    public void a(idg $$0) {
        super.a($$0);
        for (hdg $$1 : this.m) {
            $$1.k = $$0.d;
        }
    }
}

