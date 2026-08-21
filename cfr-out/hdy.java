/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class hdy
extends gzm<icx> {
    private final hdg b;
    private final ggb c;
    private final ggb d;
    private final ggb e;
    private final ggb f;

    public hdy(hdg $$0) {
        super($$0);
        hdg $$1 = $$0.b("root");
        hdg $$2 = $$1.b("upper_body");
        this.b = $$2.b("head");
        this.c = ggi.a.a($$1);
        this.d = ggi.b.a($$1);
        this.e = ggi.c.a($$1);
        this.f = ggi.d.a($$1);
    }

    private static hdo f() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("root", hdl.c(), hdi.a(0.0f, 24.0f, 0.0f));
        hdq $$3 = $$2.a("upper_body", hdl.c(), hdi.a(-1.0f, -19.0f, 0.0f));
        $$3.a("head", hdl.c().a(0, 0).a(-3.0f, -10.0f, -3.0f, 6.0f, 10.0f, 6.0f).a(28, 31).a(-3.0f, -13.0f, -3.0f, 6.0f, 3.0f, 6.0f).a(12, 40).a(3.0f, -13.0f, 0.0f, 9.0f, 14.0f, 0.0f).a(34, 12).a(-12.0f, -14.0f, 0.0f, 9.0f, 14.0f, 0.0f), hdi.a(-3.0f, -11.0f, 0.0f));
        $$3.a("body", hdl.c().a(0, 16).a(0.0f, -3.0f, -3.0f, 6.0f, 13.0f, 5.0f).a(24, 0).a(-6.0f, -4.0f, -3.0f, 6.0f, 7.0f, 5.0f), hdi.a(0.0f, -7.0f, 1.0f));
        $$3.a("right_arm", hdl.c().a(22, 13).a(-2.0f, -1.5f, -1.5f, 3.0f, 21.0f, 3.0f).a(46, 0).a(-2.0f, 19.5f, -1.5f, 3.0f, 4.0f, 3.0f), hdi.a(-7.0f, -9.5f, 1.5f));
        $$3.a("left_arm", hdl.c().a(30, 40).a(0.0f, -1.0f, -1.5f, 3.0f, 16.0f, 3.0f).a(52, 12).a(0.0f, -5.0f, -1.5f, 3.0f, 4.0f, 3.0f).a(52, 19).a(0.0f, 15.0f, -1.5f, 3.0f, 4.0f, 3.0f), hdi.a(6.0f, -9.0f, 0.5f));
        $$2.a("left_leg", hdl.c().a(42, 40).a(-1.5f, 0.0f, -1.5f, 3.0f, 16.0f, 3.0f).a(45, 55).a(-1.5f, 15.7f, -4.5f, 5.0f, 0.0f, 9.0f), hdi.a(1.5f, -16.0f, 0.5f));
        $$2.a("right_leg", hdl.c().a(0, 34).a(-3.0f, -1.5f, -1.5f, 3.0f, 19.0f, 3.0f).a(45, 46).a(-5.0f, 17.2f, -4.5f, 5.0f, 0.0f, 9.0f).a(12, 34).a(-3.0f, -4.5f, -1.5f, 3.0f, 3.0f, 3.0f), hdi.a(-1.0f, -17.5f, 0.5f));
        return $$0;
    }

    public static hdm a() {
        hdo $$0 = hdy.f();
        return hdm.a($$0, 64, 64);
    }

    public static hdm e() {
        hdo $$0 = hdy.f();
        $$0.a().b(Set.of("head"));
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(icx $$0) {
        super.a($$0);
        this.b.e = $$0.av * ((float)Math.PI / 180);
        this.b.f = $$0.au * ((float)Math.PI / 180);
        if ($$0.e) {
            this.c.a($$0.ax, $$0.ay, 1.0f, 1.0f);
        }
        this.d.a($$0.b, $$0.L);
        this.e.a($$0.a, $$0.L);
        this.f.a($$0.c, $$0.L);
    }
}

