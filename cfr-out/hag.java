/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class hag
extends gzm<icu> {
    public static final String b = "red_thing";
    public static final float c = 16.0f;
    public static final hdp d = new gzl(false, 5.0f, 2.0f, 2.0f, 1.99f, 24.0f, Set.of("head", "beak", "red_thing"));
    private final hdg e;
    private final hdg f;
    private final hdg g;
    private final hdg h;
    private final hdg i;

    public hag(hdg $$0) {
        super($$0);
        this.e = $$0.b("head");
        this.f = $$0.b("right_leg");
        this.g = $$0.b("left_leg");
        this.h = $$0.b("right_wing");
        this.i = $$0.b("left_wing");
    }

    public static hdm a() {
        hdo $$0 = hag.e();
        return hdm.a($$0, 64, 32);
    }

    protected static hdo e() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("head", hdl.c().a(0, 0).a(-2.0f, -6.0f, -2.0f, 4.0f, 6.0f, 3.0f), hdi.a(0.0f, 15.0f, -4.0f));
        $$2.a("beak", hdl.c().a(14, 0).a(-2.0f, -4.0f, -4.0f, 4.0f, 2.0f, 2.0f), hdi.a);
        $$2.a(b, hdl.c().a(14, 4).a(-1.0f, -2.0f, -3.0f, 2.0f, 2.0f, 2.0f), hdi.a);
        $$1.a("body", hdl.c().a(0, 9).a(-3.0f, -4.0f, -3.0f, 6.0f, 8.0f, 6.0f), hdi.a(0.0f, 16.0f, 0.0f, 1.5707964f, 0.0f, 0.0f));
        hdl $$3 = hdl.c().a(26, 0).a(-1.0f, 0.0f, -3.0f, 3.0f, 5.0f, 3.0f);
        $$1.a("right_leg", $$3, hdi.a(-2.0f, 19.0f, 1.0f));
        $$1.a("left_leg", $$3, hdi.a(1.0f, 19.0f, 1.0f));
        $$1.a("right_wing", hdl.c().a(24, 13).a(0.0f, 0.0f, -3.0f, 1.0f, 4.0f, 6.0f), hdi.a(-4.0f, 13.0f, 0.0f));
        $$1.a("left_wing", hdl.c().a(24, 13).a(-1.0f, 0.0f, -3.0f, 1.0f, 4.0f, 6.0f), hdi.a(4.0f, 13.0f, 0.0f));
        return $$0;
    }

    @Override
    public void a(icu $$0) {
        super.a($$0);
        float $$1 = (bgj.a((double)$$0.a) + 1.0f) * $$0.b;
        this.e.e = $$0.av * ((float)Math.PI / 180);
        this.e.f = $$0.au * ((float)Math.PI / 180);
        float $$2 = $$0.ay;
        float $$3 = $$0.ax;
        this.f.e = bgj.b((double)($$3 * 0.6662f)) * 1.4f * $$2;
        this.g.e = bgj.b((double)($$3 * 0.6662f + (float)Math.PI)) * 1.4f * $$2;
        this.h.g = $$1;
        this.i.g = -$$1;
    }
}

