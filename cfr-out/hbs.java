/*
 * Decompiled with CFR 0.152.
 */
public class hbs
extends gzm<ieh> {
    private static final String b = "upper_body";
    private final hdg c;
    private final hdg d;
    private final hdg e;
    private final hdg f;

    public hbs(hdg $$0) {
        super($$0);
        this.d = $$0.b("head");
        this.e = $$0.b("left_arm");
        this.f = $$0.b("right_arm");
        this.c = $$0.b(b);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        float $$2 = 4.0f;
        hdk $$3 = new hdk(-0.5f);
        $$1.a("head", hdl.c().a(0, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, $$3), hdi.a(0.0f, 4.0f, 0.0f));
        hdl $$4 = hdl.c().a(32, 0).a(-1.0f, 0.0f, -1.0f, 12.0f, 2.0f, 2.0f, $$3);
        $$1.a("left_arm", $$4, hdi.a(5.0f, 6.0f, 1.0f, 0.0f, 0.0f, 1.0f));
        $$1.a("right_arm", $$4, hdi.a(-5.0f, 6.0f, -1.0f, 0.0f, (float)Math.PI, -1.0f));
        $$1.a(b, hdl.c().a(0, 16).a(-5.0f, -10.0f, -5.0f, 10.0f, 10.0f, 10.0f, $$3), hdi.a(0.0f, 13.0f, 0.0f));
        $$1.a("lower_body", hdl.c().a(0, 36).a(-6.0f, -12.0f, -6.0f, 12.0f, 12.0f, 12.0f, $$3), hdi.a(0.0f, 24.0f, 0.0f));
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(ieh $$0) {
        super.a($$0);
        this.d.f = $$0.au * ((float)Math.PI / 180);
        this.d.e = $$0.av * ((float)Math.PI / 180);
        this.c.f = $$0.au * ((float)Math.PI / 180) * 0.25f;
        float $$1 = bgj.a((double)this.c.f);
        float $$2 = bgj.b((double)this.c.f);
        this.e.f = this.c.f;
        this.f.f = this.c.f + (float)Math.PI;
        this.e.b = $$2 * 5.0f;
        this.e.d = -$$1 * 5.0f;
        this.f.b = -$$2 * 5.0f;
        this.f.d = $$1 * 5.0f;
    }

    public hdg e() {
        return this.d;
    }
}

