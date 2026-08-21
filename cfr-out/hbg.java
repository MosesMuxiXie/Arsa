/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class hbg
extends gzm<ido> {
    public static final hdp b = new gzl(true, 8.0f, 3.35f, Set.of("head"));
    public final hdg c;
    private final hdg d;
    private final hdg e;
    private final hdg f;
    private final hdg g;
    private final hdg h;
    private final hdg i;
    private static final int j = 6;
    private static final float k = 16.5f;
    private static final float l = 17.5f;
    private float m;

    public hbg(hdg $$0) {
        super($$0);
        this.c = $$0.b("head");
        this.d = $$0.b("body");
        this.e = $$0.b("right_hind_leg");
        this.f = $$0.b("left_hind_leg");
        this.g = $$0.b("right_front_leg");
        this.h = $$0.b("left_front_leg");
        this.i = this.d.b("tail");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("head", hdl.c().a(1, 5).a(-3.0f, -2.0f, -5.0f, 8.0f, 6.0f, 6.0f), hdi.a(-1.0f, 16.5f, -3.0f));
        $$2.a("right_ear", hdl.c().a(8, 1).a(-3.0f, -4.0f, -4.0f, 2.0f, 2.0f, 1.0f), hdi.a);
        $$2.a("left_ear", hdl.c().a(15, 1).a(3.0f, -4.0f, -4.0f, 2.0f, 2.0f, 1.0f), hdi.a);
        $$2.a("nose", hdl.c().a(6, 18).a(-1.0f, 2.01f, -8.0f, 4.0f, 2.0f, 3.0f), hdi.a);
        hdq $$3 = $$1.a("body", hdl.c().a(24, 15).a(-3.0f, 3.999f, -3.5f, 6.0f, 11.0f, 6.0f), hdi.a(0.0f, 16.0f, -6.0f, 1.5707964f, 0.0f, 0.0f));
        hdk $$4 = new hdk(0.001f);
        hdl $$5 = hdl.c().a(4, 24).a(2.0f, 0.5f, -1.0f, 2.0f, 6.0f, 2.0f, $$4);
        hdl $$6 = hdl.c().a(13, 24).a(2.0f, 0.5f, -1.0f, 2.0f, 6.0f, 2.0f, $$4);
        $$1.a("right_hind_leg", $$6, hdi.a(-5.0f, 17.5f, 7.0f));
        $$1.a("left_hind_leg", $$5, hdi.a(-1.0f, 17.5f, 7.0f));
        $$1.a("right_front_leg", $$6, hdi.a(-5.0f, 17.5f, 0.0f));
        $$1.a("left_front_leg", $$5, hdi.a(-1.0f, 17.5f, 0.0f));
        $$3.a("tail", hdl.c().a(30, 0).a(2.0f, 0.0f, -1.0f, 4.0f, 9.0f, 5.0f), hdi.a(-4.0f, 15.0f, -1.0f, -0.05235988f, 0.0f, 0.0f));
        return hdm.a($$0, 48, 32);
    }

    @Override
    public void a(ido $$0) {
        super.a($$0);
        float $$1 = $$0.ay;
        float $$2 = $$0.ax;
        this.e.e = bgj.b((double)($$2 * 0.6662f)) * 1.4f * $$1;
        this.f.e = bgj.b((double)($$2 * 0.6662f + (float)Math.PI)) * 1.4f * $$1;
        this.g.e = bgj.b((double)($$2 * 0.6662f + (float)Math.PI)) * 1.4f * $$1;
        this.h.e = bgj.b((double)($$2 * 0.6662f)) * 1.4f * $$1;
        this.c.g = $$0.a;
        this.e.k = true;
        this.f.k = true;
        this.g.k = true;
        this.h.k = true;
        float $$3 = $$0.aA;
        if ($$0.c) {
            this.d.e += 0.10471976f;
            float $$4 = $$0.b;
            this.d.c += $$4 * $$3;
            this.c.c += $$4 * $$3;
        } else if ($$0.d) {
            this.d.g = -1.5707964f;
            this.d.c += 5.0f * $$3;
            this.i.e = -2.6179938f;
            if ($$0.aE) {
                this.i.e = -2.1816616f;
                this.d.d += 2.0f;
            }
            this.c.b += 2.0f * $$3;
            this.c.c += 2.99f * $$3;
            this.c.f = -2.0943952f;
            this.c.g = 0.0f;
            this.e.k = false;
            this.f.k = false;
            this.g.k = false;
            this.h.k = false;
        } else if ($$0.e) {
            this.d.e = 0.5235988f;
            this.d.c -= 7.0f * $$3;
            this.d.d += 3.0f * $$3;
            this.i.e = 0.7853982f;
            this.i.d -= 1.0f * $$3;
            this.c.e = 0.0f;
            this.c.f = 0.0f;
            if ($$0.aE) {
                this.c.c -= 1.75f;
                this.c.d -= 0.375f;
            } else {
                this.c.c -= 6.5f;
                this.c.d += 2.75f;
            }
            this.e.e = -1.3089969f;
            this.e.c += 4.0f * $$3;
            this.e.d -= 0.25f * $$3;
            this.f.e = -1.3089969f;
            this.f.c += 4.0f * $$3;
            this.f.d -= 0.25f * $$3;
            this.g.e = -0.2617994f;
            this.h.e = -0.2617994f;
        }
        if (!($$0.d || $$0.f || $$0.c)) {
            this.c.e = $$0.av * ((float)Math.PI / 180);
            this.c.f = $$0.au * ((float)Math.PI / 180);
        }
        if ($$0.d) {
            this.c.e = 0.0f;
            this.c.f = -2.0943952f;
            this.c.g = bgj.b((double)($$0.L * 0.027f)) / 22.0f;
        }
        if ($$0.c) {
            float $$5;
            this.d.f = $$5 = bgj.b((double)$$0.L) * 0.01f;
            this.e.g = $$5;
            this.f.g = $$5;
            this.g.g = $$5 / 2.0f;
            this.h.g = $$5 / 2.0f;
        }
        if ($$0.f) {
            float $$6 = 0.1f;
            this.m += 0.67f;
            this.e.e = bgj.b((double)(this.m * 0.4662f)) * 0.1f;
            this.f.e = bgj.b((double)(this.m * 0.4662f + (float)Math.PI)) * 0.1f;
            this.g.e = bgj.b((double)(this.m * 0.4662f + (float)Math.PI)) * 0.1f;
            this.h.e = bgj.b((double)(this.m * 0.4662f)) * 0.1f;
        }
    }
}

