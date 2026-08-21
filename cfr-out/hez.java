/*
 * Decompiled with CFR 0.152.
 */
public class hez
extends gzm<iex> {
    private final hdg b;
    private final hdg c;
    private final hdg d;
    private final hdg e;
    private final hdg f;
    private final hdg g;
    private final hdg h;

    public hez(hdg $$0) {
        super($$0);
        this.h = $$0.b("neck");
        this.b = this.h.b("head");
        this.c = this.b.b("mouth");
        this.d = $$0.b("right_hind_leg");
        this.e = $$0.b("left_hind_leg");
        this.f = $$0.b("right_front_leg");
        this.g = $$0.b("left_front_leg");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        int $$2 = 16;
        hdq $$3 = $$1.a("neck", hdl.c().a(68, 73).a(-5.0f, -1.0f, -18.0f, 10.0f, 10.0f, 18.0f), hdi.a(0.0f, -7.0f, 5.5f));
        hdq $$4 = $$3.a("head", hdl.c().a(0, 0).a(-8.0f, -20.0f, -14.0f, 16.0f, 20.0f, 16.0f).a(0, 0).a(-2.0f, -6.0f, -18.0f, 4.0f, 8.0f, 4.0f), hdi.a(0.0f, 16.0f, -17.0f));
        $$4.a("right_horn", hdl.c().a(74, 55).a(0.0f, -14.0f, -2.0f, 2.0f, 14.0f, 4.0f), hdi.a(-10.0f, -14.0f, -8.0f, 1.0995574f, 0.0f, 0.0f));
        $$4.a("left_horn", hdl.c().a(74, 55).a().a(0.0f, -14.0f, -2.0f, 2.0f, 14.0f, 4.0f), hdi.a(8.0f, -14.0f, -8.0f, 1.0995574f, 0.0f, 0.0f));
        $$4.a("mouth", hdl.c().a(0, 36).a(-8.0f, 0.0f, -16.0f, 16.0f, 3.0f, 16.0f), hdi.a(0.0f, -2.0f, 2.0f));
        $$1.a("body", hdl.c().a(0, 55).a(-7.0f, -10.0f, -7.0f, 14.0f, 16.0f, 20.0f).a(0, 91).a(-6.0f, 6.0f, -7.0f, 12.0f, 13.0f, 18.0f), hdi.a(0.0f, 1.0f, 2.0f, 1.5707964f, 0.0f, 0.0f));
        $$1.a("right_hind_leg", hdl.c().a(96, 0).a(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f), hdi.a(-8.0f, -13.0f, 18.0f));
        $$1.a("left_hind_leg", hdl.c().a(96, 0).a().a(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f), hdi.a(8.0f, -13.0f, 18.0f));
        $$1.a("right_front_leg", hdl.c().a(64, 0).a(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f), hdi.a(-8.0f, -13.0f, -5.0f));
        $$1.a("left_front_leg", hdl.c().a(64, 0).a().a(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f), hdi.a(8.0f, -13.0f, -5.0f));
        return hdm.a($$0, 128, 128);
    }

    @Override
    public void a(iex $$0) {
        super.a($$0);
        float $$1 = $$0.a;
        float $$2 = $$0.b;
        int $$3 = 10;
        if ($$2 > 0.0f) {
            float $$4 = bgj.f($$2, 10.0f);
            float $$5 = (1.0f + $$4) * 0.5f;
            float $$6 = $$5 * $$5 * $$5 * 12.0f;
            float $$7 = $$6 * bgj.a((double)this.h.e);
            this.h.d = -6.5f + $$6;
            this.h.c = -7.0f - $$7;
            this.c.e = $$2 > 5.0f ? bgj.a((double)((-4.0f + $$2) / 4.0f)) * (float)Math.PI * 0.4f : 0.15707964f * bgj.a((double)((float)Math.PI * $$2 / 10.0f));
        } else {
            float $$8 = -1.0f;
            float $$9 = -1.0f * bgj.a((double)this.h.e);
            this.h.b = 0.0f;
            this.h.c = -7.0f - $$9;
            this.h.d = 5.5f;
            boolean $$10 = $$1 > 0.0f;
            this.h.e = $$10 ? 0.21991149f : 0.0f;
            this.c.e = (float)Math.PI * ($$10 ? 0.05f : 0.01f);
            if ($$10) {
                double $$11 = (double)$$1 / 40.0;
                this.h.b = (float)Math.sin($$11 * 10.0) * 3.0f;
            } else if ((double)$$0.c > 0.0) {
                float $$12 = bgj.a((double)($$0.c * (float)Math.PI * 0.25f));
                this.c.e = 1.5707964f * $$12;
            }
        }
        this.b.e = $$0.av * ((float)Math.PI / 180);
        this.b.f = $$0.au * ((float)Math.PI / 180);
        float $$13 = $$0.ax;
        float $$14 = 0.4f * $$0.ay;
        this.d.e = bgj.b((double)($$13 * 0.6662f)) * $$14;
        this.e.e = bgj.b((double)($$13 * 0.6662f + (float)Math.PI)) * $$14;
        this.f.e = bgj.b((double)($$13 * 0.6662f + (float)Math.PI)) * $$14;
        this.g.e = bgj.b((double)($$13 * 0.6662f)) * $$14;
    }
}

