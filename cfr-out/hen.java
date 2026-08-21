/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class hen
extends gzm<idv> {
    public static final hdp b = new gzl(true, 8.0f, 6.0f, 1.9f, 2.0f, 24.0f, Set.of("head"));
    private static final float c = 0.87266463f;
    private static final float d = -0.34906584f;
    private final hdg e;
    private final hdg f;
    private final hdg g;
    private final hdg h;
    private final hdg i;
    private final hdg j;
    private final hdg k;
    private final hdg l;
    private final hdg m;

    public hen(hdg $$0) {
        super($$0);
        this.h = $$0.b("body");
        this.m = this.h.b("mane");
        this.e = $$0.b("head");
        this.f = this.e.b("right_ear");
        this.g = this.e.b("left_ear");
        this.i = $$0.b("right_front_leg");
        this.j = $$0.b("left_front_leg");
        this.k = $$0.b("right_hind_leg");
        this.l = $$0.b("left_hind_leg");
    }

    private static hdo f() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("body", hdl.c().a(1, 1).a(-8.0f, -7.0f, -13.0f, 16.0f, 14.0f, 26.0f), hdi.a(0.0f, 7.0f, 0.0f));
        $$2.a("mane", hdl.c().a(90, 33).a(0.0f, 0.0f, -9.0f, 0.0f, 10.0f, 19.0f, new hdk(0.001f)), hdi.a(0.0f, -14.0f, -7.0f));
        hdq $$3 = $$1.a("head", hdl.c().a(61, 1).a(-7.0f, -3.0f, -19.0f, 14.0f, 6.0f, 19.0f), hdi.a(0.0f, 2.0f, -12.0f, 0.87266463f, 0.0f, 0.0f));
        $$3.a("right_ear", hdl.c().a(1, 1).a(-6.0f, -1.0f, -2.0f, 6.0f, 1.0f, 4.0f), hdi.a(-6.0f, -2.0f, -3.0f, 0.0f, 0.0f, -0.6981317f));
        $$3.a("left_ear", hdl.c().a(1, 6).a(0.0f, -1.0f, -2.0f, 6.0f, 1.0f, 4.0f), hdi.a(6.0f, -2.0f, -3.0f, 0.0f, 0.0f, 0.6981317f));
        $$3.a("right_horn", hdl.c().a(10, 13).a(-1.0f, -11.0f, -1.0f, 2.0f, 11.0f, 2.0f), hdi.a(-7.0f, 2.0f, -12.0f));
        $$3.a("left_horn", hdl.c().a(1, 13).a(-1.0f, -11.0f, -1.0f, 2.0f, 11.0f, 2.0f), hdi.a(7.0f, 2.0f, -12.0f));
        int $$4 = 14;
        int $$5 = 11;
        $$1.a("right_front_leg", hdl.c().a(66, 42).a(-3.0f, 0.0f, -3.0f, 6.0f, 14.0f, 6.0f), hdi.a(-4.0f, 10.0f, -8.5f));
        $$1.a("left_front_leg", hdl.c().a(41, 42).a(-3.0f, 0.0f, -3.0f, 6.0f, 14.0f, 6.0f), hdi.a(4.0f, 10.0f, -8.5f));
        $$1.a("right_hind_leg", hdl.c().a(21, 45).a(-2.5f, 0.0f, -2.5f, 5.0f, 11.0f, 5.0f), hdi.a(-5.0f, 13.0f, 10.0f));
        $$1.a("left_hind_leg", hdl.c().a(0, 45).a(-2.5f, 0.0f, -2.5f, 5.0f, 11.0f, 5.0f), hdi.a(5.0f, 13.0f, 10.0f));
        return $$0;
    }

    public static hdm a() {
        hdo $$0 = hen.f();
        return hdm.a($$0, 128, 64);
    }

    public static hdm e() {
        hdo $$0 = hen.f();
        hdq $$1 = $$0.a().b("body");
        $$1.a("mane", hdl.c().a(90, 33).a(0.0f, 0.0f, -9.0f, 0.0f, 10.0f, 19.0f, new hdk(0.001f)), hdi.a(0.0f, -14.0f, -3.0f));
        return hdm.a($$0, 128, 64).a(b);
    }

    @Override
    public void a(idv $$0) {
        super.a($$0);
        float $$1 = $$0.ay;
        float $$2 = $$0.ax;
        this.f.g = -0.6981317f - $$1 * bgj.a((double)$$2);
        this.g.g = 0.6981317f + $$1 * bgj.a((double)$$2);
        this.e.f = $$0.au * ((float)Math.PI / 180);
        float $$3 = 1.0f - (float)bgj.a(10 - 2 * $$0.a) / 10.0f;
        this.e.e = bgj.h($$3, 0.87266463f, -0.34906584f);
        if ($$0.aE) {
            this.e.c += $$3 * 2.5f;
        }
        float $$4 = 1.2f;
        this.i.e = bgj.b((double)$$2) * 1.2f * $$1;
        this.k.e = this.j.e = bgj.b((double)($$2 + (float)Math.PI)) * 1.2f * $$1;
        this.l.e = this.i.e;
    }
}

