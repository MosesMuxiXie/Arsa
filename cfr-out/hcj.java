/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class hcj
extends gzq<ieu> {
    private static final float h = 2.25f;
    private static final hdp i = new gzl(true, 16.0f, 4.0f, 2.25f, 2.0f, 24.0f, Set.of("head"));

    public hcj(hdg $$0) {
        super($$0);
    }

    public static hdm a(boolean $$0) {
        hdo $$1 = new hdo();
        hdq $$2 = $$1.a();
        $$2.a("head", hdl.c().a(0, 0).a(-3.5f, -3.0f, -3.0f, 7.0f, 7.0f, 7.0f).a(0, 44).a("mouth", -2.5f, 1.0f, -6.0f, 5.0f, 3.0f, 3.0f).a(26, 0).a("right_ear", -4.5f, -4.0f, -1.0f, 2.0f, 2.0f, 1.0f).a(26, 0).a().a("left_ear", 2.5f, -4.0f, -1.0f, 2.0f, 2.0f, 1.0f), hdi.a(0.0f, 10.0f, -16.0f));
        $$2.a("body", hdl.c().a(0, 19).a(-5.0f, -13.0f, -7.0f, 14.0f, 14.0f, 11.0f).a(39, 0).a(-4.0f, -25.0f, -7.0f, 12.0f, 12.0f, 10.0f), hdi.a(-2.0f, 9.0f, 12.0f, 1.5707964f, 0.0f, 0.0f));
        int $$3 = 10;
        hdl $$4 = hdl.c().a(50, 22).a(-2.0f, 0.0f, -2.0f, 4.0f, 10.0f, 8.0f);
        $$2.a("right_hind_leg", $$4, hdi.a(-4.5f, 14.0f, 6.0f));
        $$2.a("left_hind_leg", $$4, hdi.a(4.5f, 14.0f, 6.0f));
        hdl $$5 = hdl.c().a(50, 40).a(-2.0f, 0.0f, -2.0f, 4.0f, 10.0f, 6.0f);
        $$2.a("right_front_leg", $$5, hdi.a(-3.5f, 14.0f, -8.0f));
        $$2.a("left_front_leg", $$5, hdi.a(3.5f, 14.0f, -8.0f));
        return hdm.a($$1, 128, 64).a($$0 ? i : hdp.a).a(hdp.scaling(1.2f));
    }

    @Override
    public void a(ieu $$0) {
        super.a($$0);
        float $$1 = $$0.a * $$0.a;
        float $$2 = $$0.aA;
        float $$3 = $$0.aE ? 0.44444445f : 1.0f;
        this.c.e -= $$1 * (float)Math.PI * 0.35f;
        this.c.c += $$1 * $$2 * 2.0f;
        this.f.c -= $$1 * $$2 * 20.0f;
        this.f.d += $$1 * $$2 * 4.0f;
        this.f.e -= $$1 * (float)Math.PI * 0.45f;
        this.g.c = this.f.c;
        this.g.d = this.f.d;
        this.g.e -= $$1 * (float)Math.PI * 0.45f;
        this.b.c -= $$1 * $$3 * 24.0f;
        this.b.d += $$1 * $$3 * 13.0f;
        this.b.e += $$1 * (float)Math.PI * 0.15f;
    }
}

