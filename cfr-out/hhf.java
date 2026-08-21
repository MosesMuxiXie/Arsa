/*
 * Decompiled with CFR 0.152.
 */
public class hhf
extends gzm<ifa> {
    private static final String b = "main";
    private final hdg c;

    public hhf(hdg $$0) {
        super($$0);
        this.c = $$0.b(b);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a(b, hdl.c().a(0, 0).a(-4.0f, -4.0f, -1.0f, 8.0f, 8.0f, 2.0f).a(0, 10).a(-1.0f, -4.0f, -4.0f, 2.0f, 8.0f, 8.0f).a(20, 0).a(-4.0f, -1.0f, -4.0f, 8.0f, 2.0f, 8.0f), hdi.a);
        return hdm.a($$0, 64, 32);
    }

    @Override
    public void a(ifa $$0) {
        super.a($$0);
        this.c.f = $$0.b * ((float)Math.PI / 180);
        this.c.e = $$0.a * ((float)Math.PI / 180);
    }
}

