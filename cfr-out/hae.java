/*
 * Decompiled with CFR 0.152.
 */
public class hae
extends had {
    private static final String d = "saddle";
    private static final String e = "bridle";
    private static final String f = "reins";
    private final hdg g;

    public hae(hdg $$0) {
        super($$0);
        this.g = this.c.b(f);
    }

    public static hdm f() {
        hdo $$0 = hae.e();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.b("body");
        hdq $$3 = $$2.b("head");
        hdk $$4 = new hdk(0.05f);
        $$2.a(d, hdl.c().a(74, 64).a(-4.5f, -17.0f, -15.5f, 9.0f, 5.0f, 11.0f, $$4).a(92, 114).a(-3.5f, -20.0f, -15.5f, 7.0f, 3.0f, 11.0f, $$4).a(0, 89).a(-7.5f, -12.0f, -23.5f, 15.0f, 12.0f, 27.0f, $$4), hdi.a(0.0f, 0.0f, 0.0f));
        $$3.a(f, hdl.c().a(98, 42).a(3.51f, -18.0f, -17.0f, 0.0f, 7.0f, 15.0f).a(84, 57).a(-3.5f, -18.0f, -2.0f, 7.0f, 7.0f, 0.0f).a(98, 42).a(-3.51f, -18.0f, -17.0f, 0.0f, 7.0f, 15.0f), hdi.a(0.0f, 0.0f, 0.0f));
        $$3.a(e, hdl.c().a(60, 87).a(-3.5f, -7.0f, -15.0f, 7.0f, 8.0f, 19.0f, $$4).a(21, 64).a(-3.5f, -21.0f, -15.0f, 7.0f, 14.0f, 7.0f, $$4).a(50, 64).a(-2.5f, -21.0f, -21.0f, 5.0f, 5.0f, 6.0f, $$4).a(74, 70).a(2.5f, -19.0f, -18.0f, 1.0f, 2.0f, 2.0f).a(74, 70).a().a(-3.5f, -19.0f, -18.0f, 1.0f, 2.0f, 2.0f), hdi.a(0.0f, 0.0f, 0.0f));
        return hdm.a($$0, 128, 128);
    }

    @Override
    public void a(ics $$0) {
        super.a($$0);
        this.g.k = $$0.b;
    }
}

