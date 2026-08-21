/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class hcc
extends gzq<iep> {
    public static final hdp h = new gzl(true, 23.0f, 4.8f, 2.7f, 3.0f, 49.0f, Set.of("head"));

    public hcc(hdg $$0) {
        super($$0);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("head", hdl.c().a(0, 6).a(-6.5f, -5.0f, -4.0f, 13.0f, 10.0f, 9.0f).a(45, 16).a("nose", -3.5f, 0.0f, -6.0f, 7.0f, 5.0f, 2.0f).a(52, 25).a("left_ear", 3.5f, -8.0f, -1.0f, 5.0f, 4.0f, 1.0f).a(52, 25).a("right_ear", -8.5f, -8.0f, -1.0f, 5.0f, 4.0f, 1.0f), hdi.a(0.0f, 11.5f, -17.0f));
        $$1.a("body", hdl.c().a(0, 25).a(-9.5f, -13.0f, -6.5f, 19.0f, 26.0f, 13.0f), hdi.a(0.0f, 10.0f, 0.0f, 1.5707964f, 0.0f, 0.0f));
        int $$2 = 9;
        int $$3 = 6;
        hdl $$4 = hdl.c().a(40, 0).a(-3.0f, 0.0f, -3.0f, 6.0f, 9.0f, 6.0f);
        $$1.a("right_hind_leg", $$4, hdi.a(-5.5f, 15.0f, 9.0f));
        $$1.a("left_hind_leg", $$4, hdi.a(5.5f, 15.0f, 9.0f));
        $$1.a("right_front_leg", $$4, hdi.a(-5.5f, 15.0f, -9.0f));
        $$1.a("left_front_leg", $$4, hdi.a(5.5f, 15.0f, -9.0f));
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(iep $$0) {
        super.a($$0);
        if ($$0.b) {
            this.b.f = 0.35f * bgj.a((double)(0.6f * $$0.L));
            this.b.g = 0.35f * bgj.a((double)(0.6f * $$0.L));
            this.f.e = -0.75f * bgj.a((double)(0.3f * $$0.L));
            this.g.e = 0.75f * bgj.a((double)(0.3f * $$0.L));
        } else {
            this.b.g = 0.0f;
        }
        if ($$0.c) {
            if ($$0.d < 15) {
                this.b.e = -0.7853982f * (float)$$0.d / 14.0f;
            } else if ($$0.d < 20) {
                float $$1 = ($$0.d - 15) / 5;
                this.b.e = -0.7853982f + 0.7853982f * $$1;
            }
        }
        if ($$0.h > 0.0f) {
            this.c.e = bgj.j($$0.h, this.c.e, 1.7407963f);
            this.b.e = bgj.j($$0.h, this.b.e, 1.5707964f);
            this.f.g = -0.27079642f;
            this.g.g = 0.27079642f;
            this.d.g = 0.5707964f;
            this.e.g = -0.5707964f;
            if ($$0.e) {
                this.b.e = 1.5707964f + 0.2f * bgj.a((double)($$0.L * 0.6f));
                this.f.e = -0.4f - 0.2f * bgj.a((double)($$0.L * 0.6f));
                this.g.e = -0.4f - 0.2f * bgj.a((double)($$0.L * 0.6f));
            }
            if ($$0.f) {
                this.b.e = 2.1707964f;
                this.f.e = -0.9f;
                this.g.e = -0.9f;
            }
        } else {
            this.d.g = 0.0f;
            this.e.g = 0.0f;
            this.f.g = 0.0f;
            this.g.g = 0.0f;
        }
        if ($$0.j > 0.0f) {
            this.d.e = -0.6f * bgj.a((double)($$0.L * 0.15f));
            this.e.e = 0.6f * bgj.a((double)($$0.L * 0.15f));
            this.f.e = 0.3f * bgj.a((double)($$0.L * 0.25f));
            this.g.e = -0.3f * bgj.a((double)($$0.L * 0.25f));
            this.b.e = bgj.j($$0.j, this.b.e, 1.5707964f);
        }
        if ($$0.k > 0.0f) {
            this.b.e = bgj.j($$0.k, this.b.e, 2.0561945f);
            this.d.e = -0.5f * bgj.a((double)($$0.L * 0.5f));
            this.e.e = 0.5f * bgj.a((double)($$0.L * 0.5f));
            this.f.e = 0.5f * bgj.a((double)($$0.L * 0.5f));
            this.g.e = -0.5f * bgj.a((double)($$0.L * 0.5f));
        }
    }
}

