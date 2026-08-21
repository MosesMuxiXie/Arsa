/*
 * Decompiled with CFR 0.152.
 */
public class gzq<T extends ieh>
extends gzm<T> {
    protected final hdg b;
    protected final hdg c;
    protected final hdg d;
    protected final hdg e;
    protected final hdg f;
    protected final hdg g;

    protected gzq(hdg $$0) {
        super($$0);
        this.b = $$0.b("head");
        this.c = $$0.b("body");
        this.d = $$0.b("right_hind_leg");
        this.e = $$0.b("left_hind_leg");
        this.f = $$0.b("right_front_leg");
        this.g = $$0.b("left_front_leg");
    }

    public static hdo a(int $$0, boolean $$1, boolean $$2, hdk $$3) {
        hdo $$4 = new hdo();
        hdq $$5 = $$4.a();
        $$5.a("head", hdl.c().a(0, 0).a(-4.0f, -4.0f, -8.0f, 8.0f, 8.0f, 8.0f, $$3), hdi.a(0.0f, 18 - $$0, -6.0f));
        $$5.a("body", hdl.c().a(28, 8).a(-5.0f, -10.0f, -7.0f, 10.0f, 16.0f, 8.0f, $$3), hdi.a(0.0f, 17 - $$0, 2.0f, 1.5707964f, 0.0f, 0.0f));
        gzq.a($$5, $$1, $$2, $$0, $$3);
        return $$4;
    }

    static void a(hdq $$0, boolean $$1, boolean $$2, int $$3, hdk $$4) {
        hdl $$5 = hdl.c().a($$2).a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, (float)$$3, 4.0f, $$4);
        hdl $$6 = hdl.c().a($$1).a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, (float)$$3, 4.0f, $$4);
        $$0.a("right_hind_leg", $$5, hdi.a(-3.0f, 24 - $$3, 7.0f));
        $$0.a("left_hind_leg", $$6, hdi.a(3.0f, 24 - $$3, 7.0f));
        $$0.a("right_front_leg", $$5, hdi.a(-3.0f, 24 - $$3, -5.0f));
        $$0.a("left_front_leg", $$6, hdi.a(3.0f, 24 - $$3, -5.0f));
    }

    @Override
    public void a(T $$0) {
        super.a($$0);
        this.b.e = ((ieh)$$0).av * ((float)Math.PI / 180);
        this.b.f = ((ieh)$$0).au * ((float)Math.PI / 180);
        float $$1 = ((ieh)$$0).ax;
        float $$2 = ((ieh)$$0).ay;
        this.d.e = bgj.b((double)($$1 * 0.6662f)) * 1.4f * $$2;
        this.e.e = bgj.b((double)($$1 * 0.6662f + (float)Math.PI)) * 1.4f * $$2;
        this.f.e = bgj.b((double)($$1 * 0.6662f + (float)Math.PI)) * 1.4f * $$2;
        this.g.e = bgj.b((double)($$1 * 0.6662f)) * 1.4f * $$2;
    }
}

