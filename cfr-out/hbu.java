/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.function.UnaryOperator;

public class hbu
extends gzm<iei> {
    public static final hdp b = hbu::a;
    private final hdg c;
    private final hdg d;
    private final hdg e;
    private final hdg f;
    private final hdg g;
    private final hdg h;
    private final hdg i;

    public hbu(hdg $$0) {
        super($$0);
        this.c = $$0.b("head");
        this.h = $$0.b("right_chest");
        this.i = $$0.b("left_chest");
        this.d = $$0.b("right_hind_leg");
        this.e = $$0.b("left_hind_leg");
        this.f = $$0.b("right_front_leg");
        this.g = $$0.b("left_front_leg");
    }

    public static hdm a(hdk $$0) {
        hdo $$1 = new hdo();
        hdq $$2 = $$1.a();
        $$2.a("head", hdl.c().a(0, 0).a(-2.0f, -14.0f, -10.0f, 4.0f, 4.0f, 9.0f, $$0).a(0, 14).a("neck", -4.0f, -16.0f, -6.0f, 8.0f, 18.0f, 6.0f, $$0).a(17, 0).a("ear", -4.0f, -19.0f, -4.0f, 3.0f, 3.0f, 2.0f, $$0).a(17, 0).a("ear", 1.0f, -19.0f, -4.0f, 3.0f, 3.0f, 2.0f, $$0), hdi.a(0.0f, 7.0f, -6.0f));
        $$2.a("body", hdl.c().a(29, 0).a(-6.0f, -10.0f, -7.0f, 12.0f, 18.0f, 10.0f, $$0), hdi.a(0.0f, 5.0f, 2.0f, 1.5707964f, 0.0f, 0.0f));
        $$2.a("right_chest", hdl.c().a(45, 28).a(-3.0f, 0.0f, 0.0f, 8.0f, 8.0f, 3.0f, $$0), hdi.a(-8.5f, 3.0f, 3.0f, 0.0f, 1.5707964f, 0.0f));
        $$2.a("left_chest", hdl.c().a(45, 41).a(-3.0f, 0.0f, 0.0f, 8.0f, 8.0f, 3.0f, $$0), hdi.a(5.5f, 3.0f, 3.0f, 0.0f, 1.5707964f, 0.0f));
        int $$3 = 4;
        int $$4 = 14;
        hdl $$5 = hdl.c().a(29, 29).a(-2.0f, 0.0f, -2.0f, 4.0f, 14.0f, 4.0f, $$0);
        $$2.a("right_hind_leg", $$5, hdi.a(-3.5f, 10.0f, 6.0f));
        $$2.a("left_hind_leg", $$5, hdi.a(3.5f, 10.0f, 6.0f));
        $$2.a("right_front_leg", $$5, hdi.a(-3.5f, 10.0f, -5.0f));
        $$2.a("left_front_leg", $$5, hdi.a(3.5f, 10.0f, -5.0f));
        return hdm.a($$1, 128, 64);
    }

    private static hdo a(hdo $$02) {
        float $$1 = 2.0f;
        float $$2 = 0.7f;
        float $$3 = 1.1f;
        UnaryOperator $$4 = $$0 -> $$0.c(0.0f, 21.0f, 3.52f).d(0.71428573f, 0.64935064f, 0.7936508f);
        UnaryOperator $$5 = $$0 -> $$0.c(0.0f, 33.0f, 0.0f).d(0.625f, 0.45454544f, 0.45454544f);
        UnaryOperator $$6 = $$0 -> $$0.c(0.0f, 33.0f, 0.0f).d(0.45454544f, 0.41322312f, 0.45454544f);
        hdo $$7 = new hdo();
        for (Map.Entry<String, hdq> $$8 : $$02.a().b()) {
            String $$9 = $$8.getKey();
            hdq $$10 = $$8.getValue();
            UnaryOperator $$11 = switch ($$9) {
                case "head" -> $$4;
                case "body" -> $$5;
                default -> $$6;
            };
            $$7.a().a($$9, $$10.a($$11));
        }
        return $$7;
    }

    @Override
    public void a(iei $$0) {
        super.a($$0);
        this.c.e = $$0.av * ((float)Math.PI / 180);
        this.c.f = $$0.au * ((float)Math.PI / 180);
        float $$1 = $$0.ay;
        float $$2 = $$0.ax;
        this.d.e = bgj.b((double)($$2 * 0.6662f)) * 1.4f * $$1;
        this.e.e = bgj.b((double)($$2 * 0.6662f + (float)Math.PI)) * 1.4f * $$1;
        this.f.e = bgj.b((double)($$2 * 0.6662f + (float)Math.PI)) * 1.4f * $$1;
        this.g.e = bgj.b((double)($$2 * 0.6662f)) * 1.4f * $$1;
        this.h.k = $$0.b;
        this.i.k = $$0.b;
    }
}

