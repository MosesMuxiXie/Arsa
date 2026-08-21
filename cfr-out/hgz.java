/*
 * Decompiled with CFR 0.152.
 */
public class hgz
extends gzm<idy> {
    public static final hdp b = hdp.scaling(0.5f);
    private final hdg c;
    private final hdg d;

    public hgz(hdg $$0) {
        super($$0);
        this.d = $$0.b("left_wing");
        this.c = $$0.b("right_wing");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdk $$2 = new hdk(1.0f);
        $$1.a("left_wing", hdl.c().a(22, 0).a(-10.0f, 0.0f, 0.0f, 10.0f, 20.0f, 2.0f, $$2), hdi.a(5.0f, 0.0f, 0.0f, 0.2617994f, 0.0f, -0.2617994f));
        $$1.a("right_wing", hdl.c().a(22, 0).a().a(0.0f, 0.0f, 0.0f, 10.0f, 20.0f, 2.0f, $$2), hdi.a(-5.0f, 0.0f, 0.0f, 0.2617994f, 0.0f, 0.2617994f));
        return hdm.a($$0, 64, 32);
    }

    @Override
    public void a(idy $$0) {
        super.a($$0);
        this.d.c = $$0.ah ? 3.0f : 0.0f;
        this.d.e = $$0.am;
        this.d.g = $$0.ao;
        this.d.f = $$0.an;
        this.c.f = -this.d.f;
        this.c.c = this.d.c;
        this.c.e = this.d.e;
        this.c.g = -this.d.g;
    }
}

