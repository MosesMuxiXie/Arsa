/*
 * Decompiled with CFR 0.152.
 */
public class hgd
extends gzm<ifs>
implements gzn,
gzr<ifs> {
    public static final hdp b = hdp.scaling(0.5f);
    private final hdg c;
    private final hdg d;
    private final hdg e;
    private final hdg f;

    public hgd(hdg $$0) {
        super($$0);
        this.c = $$0.b("head");
        this.d = $$0.b("right_leg");
        this.e = $$0.b("left_leg");
        this.f = $$0.b("arms");
    }

    public static hdo e() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        float $$2 = 0.5f;
        hdq $$3 = $$1.a("head", hdl.c().a(0, 0).a(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f), hdi.a);
        hdq $$4 = $$3.a("hat", hdl.c().a(32, 0).a(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, new hdk(0.51f)), hdi.a);
        $$4.a("hat_rim", hdl.c().a(30, 47).a(-8.0f, -8.0f, -6.0f, 16.0f, 16.0f, 1.0f), hdi.b(-1.5707964f, 0.0f, 0.0f));
        $$3.a("nose", hdl.c().a(24, 0).a(-1.0f, -1.0f, -6.0f, 2.0f, 4.0f, 2.0f), hdi.a(0.0f, -2.0f, 0.0f));
        hdq $$5 = $$1.a("body", hdl.c().a(16, 20).a(-4.0f, 0.0f, -3.0f, 8.0f, 12.0f, 6.0f), hdi.a);
        $$5.a("jacket", hdl.c().a(0, 38).a(-4.0f, 0.0f, -3.0f, 8.0f, 20.0f, 6.0f, new hdk(0.5f)), hdi.a);
        $$1.a("arms", hdl.c().a(44, 22).a(-8.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f).a(44, 22).a(4.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f, true).a(40, 38).a(-4.0f, 2.0f, -2.0f, 8.0f, 4.0f, 4.0f), hdi.a(0.0f, 3.0f, -1.0f, -0.75f, 0.0f, 0.0f));
        $$1.a("right_leg", hdl.c().a(0, 22).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f), hdi.a(-2.0f, 12.0f, 0.0f));
        $$1.a("left_leg", hdl.c().a(0, 22).a().a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f), hdi.a(2.0f, 12.0f, 0.0f));
        return $$0;
    }

    public static hdo f() {
        hdo $$0 = hgd.e();
        $$0.a().a("head").a();
        return $$0;
    }

    @Override
    public void a(ifs $$0) {
        super.a($$0);
        this.c.f = $$0.au * ((float)Math.PI / 180);
        this.c.e = $$0.av * ((float)Math.PI / 180);
        if ($$0.a) {
            this.c.g = 0.3f * bgj.a((double)(0.45f * $$0.L));
            this.c.e = 0.4f;
        } else {
            this.c.g = 0.0f;
        }
        this.d.e = bgj.b((double)($$0.ax * 0.6662f)) * 1.4f * $$0.ay * 0.5f;
        this.e.e = bgj.b((double)($$0.ax * 0.6662f + (float)Math.PI)) * 1.4f * $$0.ay * 0.5f;
        this.d.f = 0.0f;
        this.e.f = 0.0f;
    }

    @Override
    public hdg a() {
        return this.c;
    }

    @Override
    public void a(ifs $$0, fzm $$1) {
        this.o.a($$1);
        this.f.a($$1);
    }
}

