/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class hdw
extends gzm<icr> {
    private static final float b = 0.6f;
    private static final float c = 0.8f;
    private static final float d = 1.0f;
    private final hdg e;
    private final hdg f;
    private final hdg g;
    private final hdg h;
    private final hdg i;
    private final hdg j;
    private final hdg k;
    private final ggb l;
    private final ggb m;
    private final ggb n;
    private final ggb q;
    private final ggb r;
    private final ggb s;

    public hdw(hdg $$0) {
        super($$0, ijt::j);
        this.g = $$0.b("wind_body");
        this.j = this.g.b("wind_bottom");
        this.i = this.j.b("wind_mid");
        this.h = this.i.b("wind_top");
        this.e = $$0.b("body").b("head");
        this.f = this.e.b("eyes");
        this.k = $$0.b("body").b("rods");
        this.l = ggf.a.a($$0);
        this.m = ggf.b.a($$0);
        this.n = ggf.e.a($$0);
        this.q = ggf.f.a($$0);
        this.r = ggf.d.a($$0);
        this.s = ggf.c.a($$0);
    }

    private static hdo k() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("body", hdl.c(), hdi.a(0.0f, 0.0f, 0.0f));
        hdq $$3 = $$2.a("rods", hdl.c(), hdi.a(0.0f, 8.0f, 0.0f));
        $$3.a("rod_1", hdl.c().a(0, 17).a(-1.0f, 0.0f, -3.0f, 2.0f, 8.0f, 2.0f, new hdk(0.0f)), hdi.a(2.5981f, -3.0f, 1.5f, -2.7489f, -1.0472f, 3.1416f));
        $$3.a("rod_2", hdl.c().a(0, 17).a(-1.0f, 0.0f, -3.0f, 2.0f, 8.0f, 2.0f, new hdk(0.0f)), hdi.a(-2.5981f, -3.0f, 1.5f, -2.7489f, 1.0472f, 3.1416f));
        $$3.a("rod_3", hdl.c().a(0, 17).a(-1.0f, 0.0f, -3.0f, 2.0f, 8.0f, 2.0f, new hdk(0.0f)), hdi.a(0.0f, -3.0f, -3.0f, 0.3927f, 0.0f, 0.0f));
        hdq $$4 = $$2.a("head", hdl.c().a(4, 24).a(-5.0f, -5.0f, -4.2f, 10.0f, 3.0f, 4.0f, new hdk(0.0f)).a(0, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new hdk(0.0f)), hdi.a(0.0f, 4.0f, 0.0f));
        $$4.a("eyes", hdl.c().a(4, 24).a(-5.0f, -5.0f, -4.2f, 10.0f, 3.0f, 4.0f, new hdk(0.0f)).a(0, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new hdk(0.0f)), hdi.a(0.0f, 0.0f, 0.0f));
        hdq $$5 = $$1.a("wind_body", hdl.c(), hdi.a(0.0f, 0.0f, 0.0f));
        hdq $$6 = $$5.a("wind_bottom", hdl.c().a(1, 83).a(-2.5f, -7.0f, -2.5f, 5.0f, 7.0f, 5.0f, new hdk(0.0f)), hdi.a(0.0f, 24.0f, 0.0f));
        hdq $$7 = $$6.a("wind_mid", hdl.c().a(74, 28).a(-6.0f, -6.0f, -6.0f, 12.0f, 6.0f, 12.0f, new hdk(0.0f)).a(78, 32).a(-4.0f, -6.0f, -4.0f, 8.0f, 6.0f, 8.0f, new hdk(0.0f)).a(49, 71).a(-2.5f, -6.0f, -2.5f, 5.0f, 6.0f, 5.0f, new hdk(0.0f)), hdi.a(0.0f, -7.0f, 0.0f));
        $$7.a("wind_top", hdl.c().a(0, 0).a(-9.0f, -8.0f, -9.0f, 18.0f, 8.0f, 18.0f, new hdk(0.0f)).a(6, 6).a(-6.0f, -8.0f, -6.0f, 12.0f, 8.0f, 12.0f, new hdk(0.0f)).a(105, 57).a(-2.5f, -8.0f, -2.5f, 5.0f, 8.0f, 5.0f, new hdk(0.0f)), hdi.a(0.0f, -6.0f, 0.0f));
        return $$0;
    }

    public static hdm a() {
        hdo $$0 = hdw.k();
        $$0.a().a(Set.of("head", "rods"));
        return hdm.a($$0, 32, 32);
    }

    public static hdm e() {
        hdo $$0 = hdw.k();
        $$0.a().a(Set.of("wind_body"));
        return hdm.a($$0, 128, 128);
    }

    public static hdm f() {
        hdo $$0 = hdw.k();
        $$0.a().a(Set.of("eyes"));
        return hdm.a($$0, 32, 32);
    }

    @Override
    public void a(icr $$0) {
        super.a($$0);
        this.l.a($$0.a, $$0.L);
        this.m.a($$0.b, $$0.L);
        this.n.a($$0.c, $$0.L);
        this.q.a($$0.d, $$0.L);
        this.r.a($$0.e, $$0.L);
        this.s.a($$0.f, $$0.L);
    }

    public hdg g() {
        return this.e;
    }

    public hdg h() {
        return this.f;
    }

    public hdg i() {
        return this.k;
    }

    public hdg j() {
        return this.g;
    }
}

