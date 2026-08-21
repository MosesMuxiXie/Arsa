/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class hav<T extends idl>
extends gzm<T> {
    public static final hdp c = new gzl(true, 10.0f, 4.0f, Set.of("head"));
    private static final float b = 0.0f;
    private static final float q = 16.0f;
    private static final float r = -9.0f;
    protected static final float d = 18.0f;
    protected static final float e = 5.0f;
    protected static final float f = 14.1f;
    private static final float s = -5.0f;
    private static final String t = "tail1";
    private static final String u = "tail2";
    protected final hdg g;
    protected final hdg h;
    protected final hdg i;
    protected final hdg j;
    protected final hdg k;
    protected final hdg l;
    protected final hdg m;
    protected final hdg n;

    public hav(hdg $$0) {
        super($$0);
        this.m = $$0.b("head");
        this.n = $$0.b("body");
        this.k = $$0.b(t);
        this.l = $$0.b(u);
        this.g = $$0.b("left_hind_leg");
        this.h = $$0.b("right_hind_leg");
        this.i = $$0.b("left_front_leg");
        this.j = $$0.b("right_front_leg");
    }

    public static hdo a(hdk $$0) {
        hdo $$1 = new hdo();
        hdq $$2 = $$1.a();
        hdk $$3 = new hdk(-0.02f);
        $$2.a("head", hdl.c().a("main", -2.5f, -2.0f, -3.0f, 5.0f, 4.0f, 5.0f, $$0).a("nose", -1.5f, -0.001f, -4.0f, 3, 2, 2, $$0, 0, 24).a("ear1", -2.0f, -3.0f, 0.0f, 1, 1, 2, $$0, 0, 10).a("ear2", 1.0f, -3.0f, 0.0f, 1, 1, 2, $$0, 6, 10), hdi.a(0.0f, 15.0f, -9.0f));
        $$2.a("body", hdl.c().a(20, 0).a(-2.0f, 3.0f, -8.0f, 4.0f, 16.0f, 6.0f, $$0), hdi.a(0.0f, 12.0f, -10.0f, 1.5707964f, 0.0f, 0.0f));
        $$2.a(t, hdl.c().a(0, 15).a(-0.5f, 0.0f, 0.0f, 1.0f, 8.0f, 1.0f, $$0), hdi.a(0.0f, 15.0f, 8.0f, 0.9f, 0.0f, 0.0f));
        $$2.a(u, hdl.c().a(4, 15).a(-0.5f, 0.0f, 0.0f, 1.0f, 8.0f, 1.0f, $$3), hdi.a(0.0f, 20.0f, 14.0f));
        hdl $$4 = hdl.c().a(8, 13).a(-1.0f, 0.0f, 1.0f, 2.0f, 6.0f, 2.0f, $$0);
        $$2.a("left_hind_leg", $$4, hdi.a(1.1f, 18.0f, 5.0f));
        $$2.a("right_hind_leg", $$4, hdi.a(-1.1f, 18.0f, 5.0f));
        hdl $$5 = hdl.c().a(40, 0).a(-1.0f, 0.0f, 0.0f, 2.0f, 10.0f, 2.0f, $$0);
        $$2.a("left_front_leg", $$5, hdi.a(1.2f, 14.1f, -5.0f));
        $$2.a("right_front_leg", $$5, hdi.a(-1.2f, 14.1f, -5.0f));
        return $$1;
    }

    @Override
    public void a(T $$0) {
        super.a($$0);
        float $$1 = ((idl)$$0).aA;
        if (((idl)$$0).d) {
            this.n.c += 1.0f * $$1;
            this.m.c += 2.0f * $$1;
            this.k.c += 1.0f * $$1;
            this.l.c += -4.0f * $$1;
            this.l.d += 2.0f * $$1;
            this.k.e = 1.5707964f;
            this.l.e = 1.5707964f;
        } else if (((idl)$$0).e) {
            this.l.c = this.k.c;
            this.l.d += 2.0f * $$1;
            this.k.e = 1.5707964f;
            this.l.e = 1.5707964f;
        }
        this.m.e = ((idl)$$0).av * ((float)Math.PI / 180);
        this.m.f = ((idl)$$0).au * ((float)Math.PI / 180);
        if (!((idl)$$0).f) {
            this.n.e = 1.5707964f;
            float $$2 = ((idl)$$0).ay;
            float $$3 = ((idl)$$0).ax;
            if (((idl)$$0).e) {
                this.g.e = bgj.b((double)($$3 * 0.6662f)) * $$2;
                this.h.e = bgj.b((double)($$3 * 0.6662f + 0.3f)) * $$2;
                this.i.e = bgj.b((double)($$3 * 0.6662f + (float)Math.PI + 0.3f)) * $$2;
                this.j.e = bgj.b((double)($$3 * 0.6662f + (float)Math.PI)) * $$2;
                this.l.e = 1.7278761f + 0.31415927f * bgj.b((double)$$3) * $$2;
            } else {
                this.g.e = bgj.b((double)($$3 * 0.6662f)) * $$2;
                this.h.e = bgj.b((double)($$3 * 0.6662f + (float)Math.PI)) * $$2;
                this.i.e = bgj.b((double)($$3 * 0.6662f + (float)Math.PI)) * $$2;
                this.j.e = bgj.b((double)($$3 * 0.6662f)) * $$2;
                this.l.e = !((idl)$$0).d ? 1.7278761f + 0.7853982f * bgj.b((double)$$3) * $$2 : 1.7278761f + 0.47123894f * bgj.b((double)$$3) * $$2;
            }
        }
        if (((idl)$$0).f) {
            this.n.e = 0.7853982f;
            this.n.c += -4.0f * $$1;
            this.n.d += 5.0f * $$1;
            this.m.c += -3.3f * $$1;
            this.m.d += 1.0f * $$1;
            this.k.c += 8.0f * $$1;
            this.k.d += -2.0f * $$1;
            this.l.c += 2.0f * $$1;
            this.l.d += -0.8f * $$1;
            this.k.e = 1.7278761f;
            this.l.e = 2.670354f;
            this.i.e = -0.15707964f;
            this.i.c += 2.0f * $$1;
            this.i.d -= 2.0f * $$1;
            this.j.e = -0.15707964f;
            this.j.c += 2.0f * $$1;
            this.j.d -= 2.0f * $$1;
            this.g.e = -1.5707964f;
            this.g.c += 3.0f * $$1;
            this.g.d -= 4.0f * $$1;
            this.h.e = -1.5707964f;
            this.h.c += 3.0f * $$1;
            this.h.d -= 4.0f * $$1;
        }
        if (((idl)$$0).g > 0.0f) {
            this.m.g = bgj.i(((idl)$$0).g, this.m.g, -1.2707963f);
            this.m.f = bgj.i(((idl)$$0).g, this.m.f, 1.2707963f);
            this.i.e = -1.2707963f;
            this.j.e = -0.47079635f;
            this.j.g = -0.2f;
            this.j.b += $$1;
            this.g.e = -0.4f;
            this.h.e = 0.5f;
            this.h.g = -0.5f;
            this.h.b += 0.8f * $$1;
            this.h.c += 2.0f * $$1;
            this.k.e = bgj.i(((idl)$$0).h, this.k.e, 0.8f);
            this.l.e = bgj.i(((idl)$$0).h, this.l.e, -0.4f);
        }
        if (((idl)$$0).i > 0.0f) {
            this.m.e = bgj.i(((idl)$$0).i, this.m.e, -0.58177644f);
        }
    }
}

