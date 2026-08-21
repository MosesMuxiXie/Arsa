/*
 * Decompiled with CFR 0.152.
 */
public class hha
extends gzp<bhr> {
    private static final String a = "plate";
    private static final String b = "handle";
    private static final int c = 10;
    private static final int d = 20;
    private final hdg e;
    private final hdg f;

    public hha(hdg $$0) {
        super($$0, ijt::d);
        this.e = $$0.b(a);
        this.f = $$0.b(b);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a(a, hdl.c().a(0, 0).a(-6.0f, -11.0f, -2.0f, 12.0f, 22.0f, 1.0f), hdi.a);
        $$1.a(b, hdl.c().a(26, 0).a(-1.0f, -3.0f, -1.0f, 2.0f, 6.0f, 6.0f), hdi.a);
        return hdm.a($$0, 64, 64);
    }

    public hdg e() {
        return this.e;
    }

    public hdg f() {
        return this.f;
    }
}

