/*
 * Decompiled with CFR 0.152.
 */
public class hbz
extends hby {
    private final hdg d;
    private final hdg e;

    public hbz(hdg $$0) {
        super($$0);
        this.d = $$0.b("root");
        this.e = this.d.b("shell");
    }

    public static hdm a() {
        hdo $$0 = hbz.f();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("root", hdl.c(), hdi.a(0.0f, 29.0f, -6.0f));
        $$2.a("shell", hdl.c().a(0, 0).a(-7.0f, -10.0f, -7.0f, 14.0f, 10.0f, 16.0f, new hdk(0.2f)), hdi.a(0.0f, -13.0f, 5.0f));
        return hdm.a($$0, 128, 128);
    }
}

