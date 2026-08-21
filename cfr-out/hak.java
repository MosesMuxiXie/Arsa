/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class hak
extends gzq<ieh> {
    public static final hdp h = new gzl(false, 8.0f, 6.0f, Set.of("head"));
    private static final int i = 12;

    public hak(hdg $$0) {
        super($$0);
    }

    public static hdm e() {
        hdo $$0 = hak.f();
        return hdm.a($$0, 64, 64);
    }

    static hdo f() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("head", hdl.c().a(0, 0).a(-4.0f, -4.0f, -6.0f, 8.0f, 8.0f, 6.0f).a(1, 33).a(-3.0f, 1.0f, -7.0f, 6.0f, 3.0f, 1.0f).a(22, 0).a("right_horn", -5.0f, -5.0f, -5.0f, 1.0f, 3.0f, 1.0f).a(22, 0).a("left_horn", 4.0f, -5.0f, -5.0f, 1.0f, 3.0f, 1.0f), hdi.a(0.0f, 4.0f, -8.0f));
        $$1.a("body", hdl.c().a(18, 4).a(-6.0f, -10.0f, -7.0f, 12.0f, 18.0f, 10.0f).a(52, 0).a(-2.0f, 2.0f, -8.0f, 4.0f, 6.0f, 1.0f), hdi.a(0.0f, 5.0f, 2.0f, 1.5707964f, 0.0f, 0.0f));
        hdl $$2 = hdl.c().a().a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f);
        hdl $$3 = hdl.c().a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f);
        $$1.a("right_hind_leg", $$3, hdi.a(-4.0f, 12.0f, 7.0f));
        $$1.a("left_hind_leg", $$2, hdi.a(4.0f, 12.0f, 7.0f));
        $$1.a("right_front_leg", $$3, hdi.a(-4.0f, 12.0f, -5.0f));
        $$1.a("left_front_leg", $$2, hdi.a(4.0f, 12.0f, -5.0f));
        return $$0;
    }

    public hdg g() {
        return this.b;
    }
}

