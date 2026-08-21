/*
 * Decompiled with CFR 0.152.
 */
public class hgv
extends gzp<Float> {
    private static final String a = "bottom";
    private static final String b = "lid";
    private static final String c = "lock";
    private final hdg d;
    private final hdg e;

    public hgv(hdg $$0) {
        super($$0, ijt::d);
        this.d = $$0.b(b);
        this.e = $$0.b(c);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a(a, hdl.c().a(0, 19).a(1.0f, 0.0f, 1.0f, 14.0f, 10.0f, 14.0f), hdi.a);
        $$1.a(b, hdl.c().a(0, 0).a(1.0f, 0.0f, 0.0f, 14.0f, 5.0f, 14.0f), hdi.a(0.0f, 9.0f, 1.0f));
        $$1.a(c, hdl.c().a(0, 0).a(7.0f, -2.0f, 14.0f, 2.0f, 4.0f, 1.0f), hdi.a(0.0f, 9.0f, 1.0f));
        return hdm.a($$0, 64, 64);
    }

    public static hdm e() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a(a, hdl.c().a(0, 19).a(1.0f, 0.0f, 1.0f, 15.0f, 10.0f, 14.0f), hdi.a);
        $$1.a(b, hdl.c().a(0, 0).a(1.0f, 0.0f, 0.0f, 15.0f, 5.0f, 14.0f), hdi.a(0.0f, 9.0f, 1.0f));
        $$1.a(c, hdl.c().a(0, 0).a(15.0f, -2.0f, 14.0f, 1.0f, 4.0f, 1.0f), hdi.a(0.0f, 9.0f, 1.0f));
        return hdm.a($$0, 64, 64);
    }

    public static hdm f() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a(a, hdl.c().a(0, 19).a(0.0f, 0.0f, 1.0f, 15.0f, 10.0f, 14.0f), hdi.a);
        $$1.a(b, hdl.c().a(0, 0).a(0.0f, 0.0f, 0.0f, 15.0f, 5.0f, 14.0f), hdi.a(0.0f, 9.0f, 1.0f));
        $$1.a(c, hdl.c().a(0, 0).a(0.0f, -2.0f, 14.0f, 1.0f, 4.0f, 1.0f), hdi.a(0.0f, 9.0f, 1.0f));
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(Float $$0) {
        super.a($$0);
        this.e.e = this.d.e = -($$0.floatValue() * 1.5707964f);
    }
}

