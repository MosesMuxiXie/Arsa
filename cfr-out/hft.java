/*
 * Decompiled with CFR 0.152.
 */
public class hft
extends gzm<ifu>
implements gzn,
gzr<ifu> {
    protected final hdg b;
    private final hdg c;
    private final hdg d;
    private final hdg e;
    private final hdg f;

    public hft(hdg $$0) {
        super($$0);
        this.c = $$0.b("head");
        this.b = this.c.b("nose");
        this.d = $$0.b("right_leg");
        this.e = $$0.b("left_leg");
        this.f = $$0.b("arms");
    }

    public static hdm e() {
        hdo $$0 = hgd.e();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("head", hdl.c().a(0, 0).a(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f), hdi.a);
        hdq $$3 = $$2.a("hat", hdl.c().a(0, 64).a(0.0f, 0.0f, 0.0f, 10.0f, 2.0f, 10.0f), hdi.a(-5.0f, -10.03125f, -5.0f));
        hdq $$4 = $$3.a("hat2", hdl.c().a(0, 76).a(0.0f, 0.0f, 0.0f, 7.0f, 4.0f, 7.0f), hdi.a(1.75f, -4.0f, 2.0f, -0.05235988f, 0.0f, 0.02617994f));
        hdq $$5 = $$4.a("hat3", hdl.c().a(0, 87).a(0.0f, 0.0f, 0.0f, 4.0f, 4.0f, 4.0f), hdi.a(1.75f, -4.0f, 2.0f, -0.10471976f, 0.0f, 0.05235988f));
        $$5.a("hat4", hdl.c().a(0, 95).a(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f, new hdk(0.25f)), hdi.a(1.75f, -2.0f, 2.0f, -0.20943952f, 0.0f, 0.10471976f));
        hdq $$6 = $$2.b("nose");
        $$6.a("mole", hdl.c().a(0, 0).a(0.0f, 3.0f, -6.75f, 1.0f, 1.0f, 1.0f, new hdk(-0.25f)), hdi.a(0.0f, -2.0f, 0.0f));
        return hdm.a($$0, 64, 128);
    }

    @Override
    public void a(ifu $$0) {
        super.a($$0);
        this.c.f = $$0.au * ((float)Math.PI / 180);
        this.c.e = $$0.av * ((float)Math.PI / 180);
        this.d.e = bgj.b((double)($$0.ax * 0.6662f)) * 1.4f * $$0.ay * 0.5f;
        this.e.e = bgj.b((double)($$0.ax * 0.6662f + (float)Math.PI)) * 1.4f * $$0.ay * 0.5f;
        float $$1 = 0.01f * (float)($$0.a % 10);
        this.b.e = bgj.a((double)($$0.L * $$1)) * 4.5f * ((float)Math.PI / 180);
        this.b.g = bgj.b((double)($$0.L * $$1)) * 2.5f * ((float)Math.PI / 180);
        if ($$0.b) {
            this.b.a(0.0f, 1.0f, -1.5f);
            this.b.e = -0.9f;
        }
    }

    public hdg f() {
        return this.b;
    }

    @Override
    public hdg a() {
        return this.c;
    }

    @Override
    public void a(ifu $$0, fzm $$1) {
        this.o.a($$1);
        this.f.a($$1);
    }
}

