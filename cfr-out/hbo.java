/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class hbo
extends gzq<idr> {
    public static final hdp h = new gzl(true, 19.0f, 1.0f, 2.5f, 2.0f, 24.0f, Set.of("head"));

    public hbo(hdg $$0) {
        super($$0);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("head", hdl.c().a(2, 61).a("right ear", -6.0f, -11.0f, -10.0f, 3.0f, 2.0f, 1.0f).a(2, 61).a().a("left ear", 2.0f, -11.0f, -10.0f, 3.0f, 2.0f, 1.0f).a(23, 52).a("goatee", -0.5f, -3.0f, -14.0f, 0.0f, 7.0f, 5.0f), hdi.a(1.0f, 14.0f, 0.0f));
        $$2.a("left_horn", hdl.c().a(12, 55).a(-0.01f, -16.0f, -10.0f, 2.0f, 7.0f, 2.0f), hdi.a(0.0f, 0.0f, 0.0f));
        $$2.a("right_horn", hdl.c().a(12, 55).a(-2.99f, -16.0f, -10.0f, 2.0f, 7.0f, 2.0f), hdi.a(0.0f, 0.0f, 0.0f));
        $$2.a("nose", hdl.c().a(34, 46).a(-3.0f, -4.0f, -8.0f, 5.0f, 7.0f, 10.0f), hdi.a(0.0f, -8.0f, -8.0f, 0.9599f, 0.0f, 0.0f));
        $$1.a("body", hdl.c().a(1, 1).a(-4.0f, -17.0f, -7.0f, 9.0f, 11.0f, 16.0f).a(0, 28).a(-5.0f, -18.0f, -8.0f, 11.0f, 14.0f, 11.0f), hdi.a(0.0f, 24.0f, 0.0f));
        $$1.a("left_hind_leg", hdl.c().a(36, 29).a(0.0f, 4.0f, 0.0f, 3.0f, 6.0f, 3.0f), hdi.a(1.0f, 14.0f, 4.0f));
        $$1.a("right_hind_leg", hdl.c().a(49, 29).a(0.0f, 4.0f, 0.0f, 3.0f, 6.0f, 3.0f), hdi.a(-3.0f, 14.0f, 4.0f));
        $$1.a("left_front_leg", hdl.c().a(49, 2).a(0.0f, 0.0f, 0.0f, 3.0f, 10.0f, 3.0f), hdi.a(1.0f, 14.0f, -6.0f));
        $$1.a("right_front_leg", hdl.c().a(35, 2).a(0.0f, 0.0f, 0.0f, 3.0f, 10.0f, 3.0f), hdi.a(-3.0f, 14.0f, -6.0f));
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(idr $$0) {
        super.a($$0);
        this.b.b((String)"left_horn").k = $$0.a;
        this.b.b((String)"right_horn").k = $$0.b;
        if ($$0.c != 0.0f) {
            this.b.e = $$0.c;
        }
    }
}

