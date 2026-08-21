/*
 * Decompiled with CFR 0.152.
 */
public class han
extends gzm<ida> {
    public static final hdp b = hdp.scaling(0.5f);
    private final hdg c;
    private final hdg d;
    private final hdg e;

    public han(hdg $$0) {
        super($$0);
        this.c = $$0.b("body");
        this.d = this.c.b("tail");
        this.e = this.d.b("tail_fin");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        float $$2 = 18.0f;
        float $$3 = -8.0f;
        hdq $$4 = $$1.a("body", hdl.c().a(22, 0).a(-4.0f, -7.0f, 0.0f, 8.0f, 7.0f, 13.0f), hdi.a(0.0f, 22.0f, -5.0f));
        $$4.a("back_fin", hdl.c().a(51, 0).a(-0.5f, 0.0f, 8.0f, 1.0f, 4.0f, 5.0f), hdi.b(1.0471976f, 0.0f, 0.0f));
        $$4.a("left_fin", hdl.c().a(48, 20).a().a(-0.5f, -4.0f, 0.0f, 1.0f, 4.0f, 7.0f), hdi.a(2.0f, -2.0f, 4.0f, 1.0471976f, 0.0f, 2.0943952f));
        $$4.a("right_fin", hdl.c().a(48, 20).a(-0.5f, -4.0f, 0.0f, 1.0f, 4.0f, 7.0f), hdi.a(-2.0f, -2.0f, 4.0f, 1.0471976f, 0.0f, -2.0943952f));
        hdq $$5 = $$4.a("tail", hdl.c().a(0, 19).a(-2.0f, -2.5f, 0.0f, 4.0f, 5.0f, 11.0f), hdi.a(0.0f, -2.5f, 11.0f, -0.10471976f, 0.0f, 0.0f));
        $$5.a("tail_fin", hdl.c().a(19, 20).a(-5.0f, -0.5f, 0.0f, 10.0f, 1.0f, 6.0f), hdi.a(0.0f, 0.0f, 9.0f));
        hdq $$6 = $$4.a("head", hdl.c().a(0, 0).a(-4.0f, -3.0f, -3.0f, 8.0f, 7.0f, 6.0f), hdi.a(0.0f, -4.0f, -3.0f));
        $$6.a("nose", hdl.c().a(0, 13).a(-1.0f, 2.0f, -7.0f, 2.0f, 2.0f, 4.0f), hdi.a);
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(ida $$0) {
        super.a($$0);
        this.c.e = $$0.av * ((float)Math.PI / 180);
        this.c.f = $$0.au * ((float)Math.PI / 180);
        if ($$0.a) {
            this.c.e += -0.05f - 0.05f * bgj.b((double)($$0.L * 0.3f));
            this.d.e = -0.1f * bgj.b((double)($$0.L * 0.3f));
            this.e.e = -0.2f * bgj.b((double)($$0.L * 0.3f));
        }
    }
}

