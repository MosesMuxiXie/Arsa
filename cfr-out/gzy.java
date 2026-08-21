/*
 * Decompiled with CFR 0.152.
 */
public class gzy
extends gzm<icl> {
    public static final float b = 1.8849558f;
    public static final hdp c = hdp.scaling(0.5f);
    private final hdg d;
    private final hdg e;
    private final hdg f;
    private final hdg g;
    private final hdg h;
    private final hdg i;
    private final hdg j;
    private final hdg k;
    private final hdg l;
    private final hdg m;

    public gzy(hdg $$0) {
        super($$0);
        this.i = $$0.b("body");
        this.j = this.i.b("head");
        this.f = this.i.b("right_hind_leg");
        this.e = this.i.b("left_hind_leg");
        this.h = this.i.b("right_front_leg");
        this.g = this.i.b("left_front_leg");
        this.d = this.i.b("tail");
        this.k = this.j.b("top_gills");
        this.l = this.j.b("left_gills");
        this.m = this.j.b("right_gills");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("body", hdl.c().a(0, 11).a(-4.0f, -2.0f, -9.0f, 8.0f, 4.0f, 10.0f).a(2, 17).a(0.0f, -3.0f, -8.0f, 0.0f, 5.0f, 9.0f), hdi.a(0.0f, 20.0f, 5.0f));
        hdk $$3 = new hdk(0.001f);
        hdq $$4 = $$2.a("head", hdl.c().a(0, 1).a(-4.0f, -3.0f, -5.0f, 8.0f, 5.0f, 5.0f, $$3), hdi.a(0.0f, 0.0f, -9.0f));
        hdl $$5 = hdl.c().a(3, 37).a(-4.0f, -3.0f, 0.0f, 8.0f, 3.0f, 0.0f, $$3);
        hdl $$6 = hdl.c().a(0, 40).a(-3.0f, -5.0f, 0.0f, 3.0f, 7.0f, 0.0f, $$3);
        hdl $$7 = hdl.c().a(11, 40).a(0.0f, -5.0f, 0.0f, 3.0f, 7.0f, 0.0f, $$3);
        $$4.a("top_gills", $$5, hdi.a(0.0f, -3.0f, -1.0f));
        $$4.a("left_gills", $$6, hdi.a(-4.0f, 0.0f, -1.0f));
        $$4.a("right_gills", $$7, hdi.a(4.0f, 0.0f, -1.0f));
        hdl $$8 = hdl.c().a(2, 13).a(-1.0f, 0.0f, 0.0f, 3.0f, 5.0f, 0.0f, $$3);
        hdl $$9 = hdl.c().a(2, 13).a(-2.0f, 0.0f, 0.0f, 3.0f, 5.0f, 0.0f, $$3);
        $$2.a("right_hind_leg", $$9, hdi.a(-3.5f, 1.0f, -1.0f));
        $$2.a("left_hind_leg", $$8, hdi.a(3.5f, 1.0f, -1.0f));
        $$2.a("right_front_leg", $$9, hdi.a(-3.5f, 1.0f, -8.0f));
        $$2.a("left_front_leg", $$8, hdi.a(3.5f, 1.0f, -8.0f));
        $$2.a("tail", hdl.c().a(2, 19).a(0.0f, -3.0f, 0.0f, 0.0f, 5.0f, 12.0f), hdi.a(0.0f, 0.0f, 1.0f));
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(icl $$0) {
        super.a($$0);
        float $$1 = $$0.b;
        float $$2 = $$0.d;
        float $$3 = $$0.e;
        float $$4 = $$0.c;
        float $$5 = 1.0f - $$4;
        float $$6 = 1.0f - Math.min($$3, $$4);
        this.i.f += $$0.au * ((float)Math.PI / 180);
        this.a($$0.L, $$0.av, Math.min($$4, $$2));
        this.c($$0.L, Math.min($$5, $$2));
        this.b($$0.L, Math.min($$4, $$3));
        this.a($$0.L, Math.min($$5, $$3));
        this.a($$1);
        this.b($$6);
    }

    private void a(float $$0, float $$1) {
        if ($$1 <= 1.0E-5f) {
            return;
        }
        float $$2 = $$0 * 0.09f;
        float $$3 = bgj.a((double)$$2);
        float $$4 = bgj.b((double)$$2);
        float $$5 = $$3 * $$3 - 2.0f * $$3;
        float $$6 = $$4 * $$4 - 3.0f * $$3;
        this.j.e += -0.09f * $$5 * $$1;
        this.j.g += -0.2f * $$1;
        this.d.f += (-0.1f + 0.1f * $$5) * $$1;
        float $$7 = (0.6f + 0.05f * $$6) * $$1;
        this.k.e += $$7;
        this.l.f -= $$7;
        this.m.f += $$7;
        this.e.e += 1.1f * $$1;
        this.e.f += 1.0f * $$1;
        this.g.e += 0.8f * $$1;
        this.g.f += 2.3f * $$1;
        this.g.g -= 0.5f * $$1;
    }

    private void b(float $$0, float $$1) {
        if ($$1 <= 1.0E-5f) {
            return;
        }
        float $$2 = $$0 * 0.11f;
        float $$3 = bgj.b((double)$$2);
        float $$4 = ($$3 * $$3 - 2.0f * $$3) / 5.0f;
        float $$5 = 0.7f * $$3;
        float $$6 = 0.09f * $$3 * $$1;
        this.j.f += $$6;
        this.d.f += $$6;
        float $$7 = (0.6f - 0.08f * ($$3 * $$3 + 2.0f * bgj.a((double)$$2))) * $$1;
        this.k.e += $$7;
        this.l.f -= $$7;
        this.m.f += $$7;
        float $$8 = 0.9424779f * $$1;
        float $$9 = 1.0995574f * $$1;
        this.e.e += $$8;
        this.e.f += (1.5f - $$4) * $$1;
        this.e.g += -0.1f * $$1;
        this.g.e += $$9;
        this.g.f += (1.5707964f - $$5) * $$1;
        this.f.e += $$8;
        this.f.f += (-1.0f - $$4) * $$1;
        this.h.e += $$9;
        this.h.f += (-1.5707964f - $$5) * $$1;
    }

    private void c(float $$0, float $$1) {
        if ($$1 <= 1.0E-5f) {
            return;
        }
        float $$2 = $$0 * 0.075f;
        float $$3 = bgj.b((double)$$2);
        float $$4 = bgj.a((double)$$2) * 0.15f;
        float $$5 = (-0.15f + 0.075f * $$3) * $$1;
        this.i.e += $$5;
        this.i.c -= $$4 * $$1;
        this.j.e -= $$5;
        this.k.e += 0.2f * $$3 * $$1;
        float $$6 = (-0.3f * $$3 - 0.19f) * $$1;
        this.l.f += $$6;
        this.m.f -= $$6;
        this.e.e += (2.3561945f - $$3 * 0.11f) * $$1;
        this.e.f += 0.47123894f * $$1;
        this.e.g += 1.7278761f * $$1;
        this.g.e += (0.7853982f - $$3 * 0.2f) * $$1;
        this.g.f += 2.042035f * $$1;
        this.d.f += 0.5f * $$3 * $$1;
    }

    private void a(float $$0, float $$1, float $$2) {
        if ($$2 <= 1.0E-5f) {
            return;
        }
        float $$3 = $$0 * 0.33f;
        float $$4 = bgj.a((double)$$3);
        float $$5 = bgj.b((double)$$3);
        float $$6 = 0.13f * $$4;
        this.i.e += ($$1 * ((float)Math.PI / 180) + $$6) * $$2;
        this.j.e -= $$6 * 1.8f * $$2;
        this.i.c -= 0.45f * $$5 * $$2;
        this.k.e += (-0.5f * $$4 - 0.8f) * $$2;
        float $$7 = (0.3f * $$4 + 0.9f) * $$2;
        this.l.f += $$7;
        this.m.f -= $$7;
        this.d.f += 0.3f * bgj.b((double)($$3 * 0.9f)) * $$2;
        this.e.e += 1.8849558f * $$2;
        this.e.f += -0.4f * $$4 * $$2;
        this.e.g += 1.5707964f * $$2;
        this.g.e += 1.8849558f * $$2;
        this.g.f += (-0.2f * $$5 - 0.1f) * $$2;
        this.g.g += 1.5707964f * $$2;
    }

    @Override
    private void a(float $$0) {
        if ($$0 <= 1.0E-5f) {
            return;
        }
        this.e.e += 1.4137167f * $$0;
        this.e.f += 1.0995574f * $$0;
        this.e.g += 0.7853982f * $$0;
        this.g.e += 0.7853982f * $$0;
        this.g.f += 2.042035f * $$0;
        this.i.e += -0.15f * $$0;
        this.i.g += 0.35f * $$0;
    }

    private void b(float $$0) {
        if ($$0 <= 1.0E-5f) {
            return;
        }
        this.f.e += this.e.e * $$0;
        hdg hdg2 = this.f;
        hdg2.f = hdg2.f + -this.e.f * $$0;
        hdg2 = this.f;
        hdg2.g = hdg2.g + -this.e.g * $$0;
        this.h.e += this.g.e * $$0;
        hdg2 = this.h;
        hdg2.f = hdg2.f + -this.g.f * $$0;
        hdg2 = this.h;
        hdg2.g = hdg2.g + -this.g.g * $$0;
    }
}

