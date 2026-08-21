/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class hcl
extends gzm<iew> {
    private static final float b = 50.0f;
    private static final float c = -40.0f;
    private static final float d = 0.6f;
    private static final hdp e = hdp.scaling(0.6f);
    private static final hdp f = new gzl(true, 22.0f, 2.0f, 2.65f, 2.5f, 36.0f, Set.of("head", "left_ear", "right_ear", "nose"));
    private static final String g = "left_haunch";
    private static final String h = "right_haunch";
    private final hdg i;
    private final hdg j;
    private final hdg k;
    private final hdg l;
    private final hdg m;

    public hcl(hdg $$0) {
        super($$0);
        this.i = $$0.b(g);
        this.j = $$0.b(h);
        this.k = $$0.b("left_front_leg");
        this.l = $$0.b("right_front_leg");
        this.m = $$0.b("head");
    }

    public static hdm a(boolean $$0) {
        hdo $$1 = new hdo();
        hdq $$2 = $$1.a();
        hdq $$3 = $$2.a(g, hdl.c().a(30, 15).a(-1.0f, 0.0f, 0.0f, 2.0f, 4.0f, 5.0f), hdi.a(3.0f, 17.5f, 3.7f, -0.36651915f, 0.0f, 0.0f));
        hdq $$4 = $$2.a(h, hdl.c().a(16, 15).a(-1.0f, 0.0f, 0.0f, 2.0f, 4.0f, 5.0f), hdi.a(-3.0f, 17.5f, 3.7f, -0.36651915f, 0.0f, 0.0f));
        $$3.a("left_hind_foot", hdl.c().a(26, 24).a(-1.0f, 5.5f, -3.7f, 2.0f, 1.0f, 7.0f), hdi.b(0.36651915f, 0.0f, 0.0f));
        $$4.a("right_hind_foot", hdl.c().a(8, 24).a(-1.0f, 5.5f, -3.7f, 2.0f, 1.0f, 7.0f), hdi.b(0.36651915f, 0.0f, 0.0f));
        $$2.a("body", hdl.c().a(0, 0).a(-3.0f, -2.0f, -10.0f, 6.0f, 5.0f, 10.0f), hdi.a(0.0f, 19.0f, 8.0f, -0.34906584f, 0.0f, 0.0f));
        $$2.a("left_front_leg", hdl.c().a(8, 15).a(-1.0f, 0.0f, -1.0f, 2.0f, 7.0f, 2.0f), hdi.a(3.0f, 17.0f, -1.0f, -0.19198622f, 0.0f, 0.0f));
        $$2.a("right_front_leg", hdl.c().a(0, 15).a(-1.0f, 0.0f, -1.0f, 2.0f, 7.0f, 2.0f), hdi.a(-3.0f, 17.0f, -1.0f, -0.19198622f, 0.0f, 0.0f));
        hdq $$5 = $$2.a("head", hdl.c().a(32, 0).a(-2.5f, -4.0f, -5.0f, 5.0f, 4.0f, 5.0f), hdi.a(0.0f, 16.0f, -1.0f));
        $$5.a("right_ear", hdl.c().a(52, 0).a(-2.5f, -9.0f, -1.0f, 2.0f, 5.0f, 1.0f), hdi.a(0.0f, 0.0f, 0.0f, 0.0f, -0.2617994f, 0.0f));
        $$5.a("left_ear", hdl.c().a(58, 0).a(0.5f, -9.0f, -1.0f, 2.0f, 5.0f, 1.0f), hdi.a(0.0f, 0.0f, 0.0f, 0.0f, 0.2617994f, 0.0f));
        $$2.a("tail", hdl.c().a(52, 6).a(-1.5f, -1.5f, 0.0f, 3.0f, 3.0f, 2.0f), hdi.a(0.0f, 20.0f, 7.0f, -0.3490659f, 0.0f, 0.0f));
        $$5.a("nose", hdl.c().a(32, 9).a(-0.5f, -2.5f, -5.5f, 1.0f, 1.0f, 1.0f), hdi.a);
        return hdm.a($$1, 64, 32).a($$0 ? f : e);
    }

    @Override
    public void a(iew $$0) {
        super.a($$0);
        this.m.e = $$0.av * ((float)Math.PI / 180);
        this.m.f = $$0.au * ((float)Math.PI / 180);
        float $$1 = bgj.a((double)($$0.a * (float)Math.PI));
        this.i.e += $$1 * 50.0f * ((float)Math.PI / 180);
        this.j.e += $$1 * 50.0f * ((float)Math.PI / 180);
        this.k.e += $$1 * -40.0f * ((float)Math.PI / 180);
        this.l.e += $$1 * -40.0f * ((float)Math.PI / 180);
    }
}

