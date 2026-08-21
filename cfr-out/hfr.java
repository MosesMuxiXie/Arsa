/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class hfr
extends gzm<ift> {
    private static final float m = 13.0f;
    private static final float n = 1.0f;
    protected final hdg b;
    protected final hdg c;
    protected final hdg d;
    protected final hdg e;
    protected final hdg f;
    protected final hdg g;
    protected final hdg h;
    protected final hdg i;
    protected final hdg j;
    protected final hdg k;
    protected final hdg l;
    private final ggb q;
    private final ggb r;
    private final ggb s;
    private final ggb t;
    private final ggb u;
    private final ggb v;

    public hfr(hdg $$0) {
        super($$0, ijt::g);
        this.b = $$0.b("bone");
        this.c = this.b.b("body");
        this.d = this.c.b("head");
        this.k = this.b.b("right_leg");
        this.g = this.b.b("left_leg");
        this.j = this.c.b("right_arm");
        this.h = this.c.b("left_arm");
        this.e = this.d.b("right_tendril");
        this.f = this.d.b("left_tendril");
        this.l = this.c.b("right_ribcage");
        this.i = this.c.b("left_ribcage");
        this.q = ggm.e.a($$0);
        this.r = ggm.f.a($$0);
        this.s = ggm.b.a($$0);
        this.t = ggm.a.a($$0);
        this.u = ggm.c.a($$0);
        this.v = ggm.d.a($$0);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("bone", hdl.c(), hdi.a(0.0f, 24.0f, 0.0f));
        hdq $$3 = $$2.a("body", hdl.c().a(0, 0).a(-9.0f, -13.0f, -4.0f, 18.0f, 21.0f, 11.0f), hdi.a(0.0f, -21.0f, 0.0f));
        $$3.a("right_ribcage", hdl.c().a(90, 11).a(-2.0f, -11.0f, -0.1f, 9.0f, 21.0f, 0.0f), hdi.a(-7.0f, -2.0f, -4.0f));
        $$3.a("left_ribcage", hdl.c().a(90, 11).a().a(-7.0f, -11.0f, -0.1f, 9.0f, 21.0f, 0.0f).a(false), hdi.a(7.0f, -2.0f, -4.0f));
        hdq $$4 = $$3.a("head", hdl.c().a(0, 32).a(-8.0f, -16.0f, -5.0f, 16.0f, 16.0f, 10.0f), hdi.a(0.0f, -13.0f, 0.0f));
        $$4.a("right_tendril", hdl.c().a(52, 32).a(-16.0f, -13.0f, 0.0f, 16.0f, 16.0f, 0.0f), hdi.a(-8.0f, -12.0f, 0.0f));
        $$4.a("left_tendril", hdl.c().a(58, 0).a(0.0f, -13.0f, 0.0f, 16.0f, 16.0f, 0.0f), hdi.a(8.0f, -12.0f, 0.0f));
        $$3.a("right_arm", hdl.c().a(44, 50).a(-4.0f, 0.0f, -4.0f, 8.0f, 28.0f, 8.0f), hdi.a(-13.0f, -13.0f, 1.0f));
        $$3.a("left_arm", hdl.c().a(0, 58).a(-4.0f, 0.0f, -4.0f, 8.0f, 28.0f, 8.0f), hdi.a(13.0f, -13.0f, 1.0f));
        $$2.a("right_leg", hdl.c().a(76, 48).a(-3.1f, 0.0f, -3.0f, 6.0f, 13.0f, 6.0f), hdi.a(-5.9f, -13.0f, 0.0f));
        $$2.a("left_leg", hdl.c().a(76, 76).a(-2.9f, 0.0f, -3.0f, 6.0f, 13.0f, 6.0f), hdi.a(5.9f, -13.0f, 0.0f));
        return hdm.a($$0, 128, 128);
    }

    public static hdm e() {
        return hfr.a().a((hdo $$0) -> {
            $$0.a().b(Set.of("left_tendril", "right_tendril"));
            return $$0;
        });
    }

    public static hdm f() {
        return hfr.a().a((hdo $$0) -> {
            $$0.a().b(Set.of("body"));
            return $$0;
        });
    }

    public static hdm g() {
        return hfr.a().a((hdo $$0) -> {
            $$0.a().b(Set.of("head", "left_arm", "right_arm", "left_leg", "right_leg"));
            return $$0;
        });
    }

    public static hdm h() {
        return hfr.a().a((hdo $$0) -> {
            $$0.a().b(Set.of("body", "head", "left_arm", "right_arm", "left_leg", "right_leg"));
            return $$0;
        });
    }

    @Override
    public void a(ift $$0) {
        super.a($$0);
        this.a($$0.au, $$0.av);
        this.b($$0.ax, $$0.ay);
        this.a($$0.L);
        this.a($$0, $$0.L);
        this.q.a($$0.g, $$0.L);
        this.r.a($$0.h, $$0.L);
        this.s.a($$0.f, $$0.L);
        this.t.a($$0.e, $$0.L);
        this.u.a($$0.c, $$0.L);
        this.v.a($$0.d, $$0.L);
    }

    private void a(float $$0, float $$1) {
        this.d.e = $$1 * ((float)Math.PI / 180);
        this.d.f = $$0 * ((float)Math.PI / 180);
    }

    @Override
    private void a(float $$0) {
        float $$1 = $$0 * 0.1f;
        float $$2 = bgj.b((double)$$1);
        float $$3 = bgj.a((double)$$1);
        this.d.g += 0.06f * $$2;
        this.d.e += 0.06f * $$3;
        this.c.g += 0.025f * $$3;
        this.c.e += 0.025f * $$2;
    }

    private void b(float $$0, float $$1) {
        float $$2 = Math.min(0.5f, 3.0f * $$1);
        float $$3 = $$0 * 0.8662f;
        float $$4 = bgj.b((double)$$3);
        float $$5 = bgj.a((double)$$3);
        float $$6 = Math.min(0.35f, $$2);
        this.d.g += 0.3f * $$5 * $$2;
        this.d.e += 1.2f * bgj.b((double)($$3 + 1.5707964f)) * $$6;
        this.c.g = 0.1f * $$5 * $$2;
        this.c.e = 1.0f * $$4 * $$6;
        this.g.e = 1.0f * $$4 * $$2;
        this.k.e = 1.0f * bgj.b((double)($$3 + (float)Math.PI)) * $$2;
        this.h.e = -(0.8f * $$4 * $$2);
        this.h.g = 0.0f;
        this.j.e = -(0.8f * $$5 * $$2);
        this.j.g = 0.0f;
        this.i();
    }

    private void i() {
        this.h.f = 0.0f;
        this.h.d = 1.0f;
        this.h.b = 13.0f;
        this.h.c = -13.0f;
        this.j.f = 0.0f;
        this.j.d = 1.0f;
        this.j.b = -13.0f;
        this.j.c = -13.0f;
    }

    private void a(ift $$0, float $$1) {
        float $$2;
        this.f.e = $$2 = $$0.a * (float)(Math.cos((double)$$1 * 2.25) * Math.PI * (double)0.1f);
        this.e.e = -$$2;
    }
}

