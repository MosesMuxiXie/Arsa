/*
 * Decompiled with CFR 0.152.
 */
public class hgj
extends gzp<bhr> {
    public static final int a = 20;
    public static final int b = 40;
    public static final String c = "flag";
    private static final String d = "pole";
    private static final String e = "bar";

    public hgj(hdg $$0) {
        super($$0, ijt::d);
    }

    public static hdm a(boolean $$0) {
        hdo $$1 = new hdo();
        hdq $$2 = $$1.a();
        if ($$0) {
            $$2.a(d, hdl.c().a(44, 0).a(-1.0f, -42.0f, -1.0f, 2.0f, 42.0f, 2.0f), hdi.a);
        }
        $$2.a(e, hdl.c().a(0, 42).a(-10.0f, $$0 ? -44.0f : -20.5f, $$0 ? -1.0f : 9.5f, 20.0f, 2.0f, 2.0f), hdi.a);
        return hdm.a($$1, 64, 64);
    }
}

