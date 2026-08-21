/*
 * Decompiled with CFR 0.152.
 */
public class hhl
extends hhm {
    protected final hdg a;

    public hhl(hdg $$0) {
        super($$0);
        this.a = $$0.b("head");
    }

    public static hdo a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("head", hdl.c().a(0, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f), hdi.a);
        return $$0;
    }

    public static hdm e() {
        hdo $$0 = hhl.a();
        hdq $$1 = $$0.a();
        $$1.b("head").a("hat", hdl.c().a(32, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new hdk(0.25f)), hdi.a);
        return hdm.a($$0, 64, 64);
    }

    public static hdm f() {
        hdo $$0 = hhl.a();
        return hdm.a($$0, 64, 32);
    }

    @Override
    public void a(hhm.a $$0) {
        super.a($$0);
        this.a.f = $$0.b * ((float)Math.PI / 180);
        this.a.e = $$0.c * ((float)Math.PI / 180);
    }
}

