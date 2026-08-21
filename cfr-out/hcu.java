/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class hcu
extends gzq<ifo> {
    private static final String i = "egg_belly";
    public static final hdp h = new gzl(true, 120.0f, 0.0f, 9.0f, 6.0f, 120.0f, Set.of("head"));
    private final hdg j;

    public hcu(hdg $$0) {
        super($$0);
        this.j = $$0.b(i);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("head", hdl.c().a(3, 0).a(-3.0f, -1.0f, -3.0f, 6.0f, 5.0f, 6.0f), hdi.a(0.0f, 19.0f, -10.0f));
        $$1.a("body", hdl.c().a(7, 37).a("shell", -9.5f, 3.0f, -10.0f, 19.0f, 20.0f, 6.0f).a(31, 1).a("belly", -5.5f, 3.0f, -13.0f, 11.0f, 18.0f, 3.0f), hdi.a(0.0f, 11.0f, -10.0f, 1.5707964f, 0.0f, 0.0f));
        $$1.a(i, hdl.c().a(70, 33).a(-4.5f, 3.0f, -14.0f, 9.0f, 18.0f, 1.0f), hdi.a(0.0f, 11.0f, -10.0f, 1.5707964f, 0.0f, 0.0f));
        boolean $$2 = true;
        $$1.a("right_hind_leg", hdl.c().a(1, 23).a(-2.0f, 0.0f, 0.0f, 4.0f, 1.0f, 10.0f), hdi.a(-3.5f, 22.0f, 11.0f));
        $$1.a("left_hind_leg", hdl.c().a(1, 12).a(-2.0f, 0.0f, 0.0f, 4.0f, 1.0f, 10.0f), hdi.a(3.5f, 22.0f, 11.0f));
        $$1.a("right_front_leg", hdl.c().a(27, 30).a(-13.0f, 0.0f, -2.0f, 13.0f, 1.0f, 5.0f), hdi.a(-5.0f, 21.0f, -4.0f));
        $$1.a("left_front_leg", hdl.c().a(27, 24).a(0.0f, 0.0f, -2.0f, 13.0f, 1.0f, 5.0f), hdi.a(5.0f, 21.0f, -4.0f));
        return hdm.a($$0, 128, 64);
    }

    @Override
    public void a(ifo $$0) {
        super.a($$0);
        float $$1 = $$0.ax;
        float $$2 = $$0.ay;
        if ($$0.a) {
            float $$3 = $$0.b ? 4.0f : 1.0f;
            float $$4 = $$0.b ? 2.0f : 1.0f;
            float $$5 = $$1 * 5.0f;
            float $$6 = bgj.b((double)($$3 * $$5));
            float $$7 = bgj.b((double)$$5);
            this.f.f = -$$6 * 8.0f * $$2 * $$4;
            this.g.f = $$6 * 8.0f * $$2 * $$4;
            this.d.f = -$$7 * 3.0f * $$2;
            this.e.f = $$7 * 3.0f * $$2;
        } else {
            float $$9;
            float $$8 = 0.5f * $$2;
            this.d.e = $$9 = bgj.b((double)($$1 * 0.6662f * 0.6f)) * $$8;
            this.e.e = -$$9;
            this.f.g = -$$9;
            this.g.g = $$9;
        }
        this.j.k = $$0.c;
        if (this.j.k) {
            this.o.c -= 1.0f;
        }
    }
}

