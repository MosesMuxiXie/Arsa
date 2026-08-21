/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public abstract class hap<T extends idg>
extends gzm<T> {
    private static final float f = 2.1816616f;
    private static final float g = 1.0471976f;
    private static final float h = 0.7853982f;
    private static final float i = 0.5235988f;
    private static final float j = 0.2617994f;
    protected static final String b = "head_parts";
    protected static final hdp c = new gzl(true, 16.2f, 1.36f, 2.7272f, 2.0f, 20.0f, Set.of("head_parts"));
    protected final hdg d;
    protected final hdg e;
    private final hdg k;
    private final hdg l;
    private final hdg m;
    private final hdg n;
    private final hdg q;

    public hap(hdg $$0) {
        super($$0);
        this.d = $$0.b("body");
        this.e = $$0.b(b);
        this.k = $$0.b("right_hind_leg");
        this.l = $$0.b("left_hind_leg");
        this.m = $$0.b("right_front_leg");
        this.n = $$0.b("left_front_leg");
        this.q = this.d.b("tail");
    }

    public static hdo a(hdk $$0) {
        hdo $$1 = new hdo();
        hdq $$2 = $$1.a();
        hdq $$3 = $$2.a("body", hdl.c().a(0, 32).a(-5.0f, -8.0f, -17.0f, 10.0f, 10.0f, 22.0f, new hdk(0.05f)), hdi.a(0.0f, 11.0f, 5.0f));
        hdq $$4 = $$2.a(b, hdl.c().a(0, 35).a(-2.05f, -6.0f, -2.0f, 4.0f, 12.0f, 7.0f), hdi.a(0.0f, 4.0f, -12.0f, 0.5235988f, 0.0f, 0.0f));
        hdq $$5 = $$4.a("head", hdl.c().a(0, 13).a(-3.0f, -11.0f, -2.0f, 6.0f, 5.0f, 7.0f, $$0), hdi.a);
        $$4.a("mane", hdl.c().a(56, 36).a(-1.0f, -11.0f, 5.01f, 2.0f, 16.0f, 2.0f, $$0), hdi.a);
        $$4.a("upper_mouth", hdl.c().a(0, 25).a(-2.0f, -11.0f, -7.0f, 4.0f, 5.0f, 5.0f, $$0), hdi.a);
        $$2.a("left_hind_leg", hdl.c().a(48, 21).a().a(-3.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, $$0), hdi.a(4.0f, 14.0f, 7.0f));
        $$2.a("right_hind_leg", hdl.c().a(48, 21).a(-1.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, $$0), hdi.a(-4.0f, 14.0f, 7.0f));
        $$2.a("left_front_leg", hdl.c().a(48, 21).a().a(-3.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, $$0), hdi.a(4.0f, 14.0f, -10.0f));
        $$2.a("right_front_leg", hdl.c().a(48, 21).a(-1.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, $$0), hdi.a(-4.0f, 14.0f, -10.0f));
        $$3.a("tail", hdl.c().a(42, 36).a(-1.5f, 0.0f, 0.0f, 3.0f, 14.0f, 4.0f, $$0), hdi.a(0.0f, -5.0f, 2.0f, 0.5235988f, 0.0f, 0.0f));
        $$5.a("left_ear", hdl.c().a(19, 16).a(0.55f, -13.0f, 4.0f, 2.0f, 3.0f, 1.0f, new hdk(-0.001f)), hdi.a);
        $$5.a("right_ear", hdl.c().a(19, 16).a(-2.55f, -13.0f, 4.0f, 2.0f, 3.0f, 1.0f, new hdk(-0.001f)), hdi.a);
        return $$1;
    }

    public static hdo b(hdk $$0) {
        return c.apply(hap.c($$0));
    }

    protected static hdo c(hdk $$0) {
        hdo $$1 = hap.a($$0);
        hdq $$2 = $$1.a();
        hdk $$3 = $$0.a(0.0f, 5.5f, 0.0f);
        $$2.a("left_hind_leg", hdl.c().a(48, 21).a().a(-3.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, $$3), hdi.a(4.0f, 14.0f, 7.0f));
        $$2.a("right_hind_leg", hdl.c().a(48, 21).a(-1.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, $$3), hdi.a(-4.0f, 14.0f, 7.0f));
        $$2.a("left_front_leg", hdl.c().a(48, 21).a().a(-3.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, $$3), hdi.a(4.0f, 14.0f, -10.0f));
        $$2.a("right_front_leg", hdl.c().a(48, 21).a(-1.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, $$3), hdi.a(-4.0f, 14.0f, -10.0f));
        return $$1;
    }

    @Override
    public void a(T $$0) {
        super.a($$0);
        float $$1 = bgj.a(((idg)$$0).au, -20.0f, 20.0f);
        float $$2 = ((idg)$$0).av * ((float)Math.PI / 180);
        float $$3 = ((idg)$$0).ay;
        float $$4 = ((idg)$$0).ax;
        if ($$3 > 0.2f) {
            $$2 += bgj.b((double)($$4 * 0.8f)) * 0.15f * $$3;
        }
        float $$5 = ((idg)$$0).f;
        float $$6 = ((idg)$$0).g;
        float $$7 = 1.0f - $$6;
        float $$8 = ((idg)$$0).h;
        boolean $$9 = ((idg)$$0).e;
        this.e.e = 0.5235988f + $$2;
        this.e.f = $$1 * ((float)Math.PI / 180);
        float $$10 = ((idg)$$0).aF ? 0.2f : 1.0f;
        float $$11 = bgj.b((double)($$10 * $$4 * 0.6662f + (float)Math.PI));
        float $$12 = $$11 * 0.8f * $$3;
        float $$13 = (1.0f - Math.max($$6, $$5)) * (0.5235988f + $$2 + $$8 * bgj.a((double)((idg)$$0).L) * 0.05f);
        this.e.e = $$6 * (0.2617994f + $$2) + $$5 * (2.1816616f + bgj.a((double)((idg)$$0).L) * 0.05f) + $$13;
        this.e.f = $$6 * $$1 * ((float)Math.PI / 180) + (1.0f - Math.max($$6, $$5)) * this.e.f;
        float $$14 = ((idg)$$0).aA;
        this.e.c += bgj.h($$5, bgj.h($$6, 0.0f, -8.0f * $$14), 7.0f * $$14);
        this.e.d = bgj.h($$6, this.e.d, -4.0f * $$14);
        this.d.e = $$6 * -0.7853982f + $$7 * this.d.e;
        float $$15 = 0.2617994f * $$6;
        float $$16 = bgj.b((double)(((idg)$$0).L * 0.6f + (float)Math.PI));
        this.n.c -= 12.0f * $$14 * $$6;
        this.n.d += 4.0f * $$14 * $$6;
        this.m.c = this.n.c;
        this.m.d = this.n.d;
        float $$17 = (-1.0471976f + $$16) * $$6 + $$12 * $$7;
        float $$18 = (-1.0471976f - $$16) * $$6 - $$12 * $$7;
        this.l.e = $$15 - $$11 * 0.5f * $$3 * $$7;
        this.k.e = $$15 + $$11 * 0.5f * $$3 * $$7;
        this.n.e = $$17;
        this.m.e = $$18;
        this.q.e = 0.5235988f + $$3 * 0.75f;
        this.q.c += $$3 * $$14;
        this.q.d += $$3 * 2.0f * $$14;
        this.q.f = $$9 ? bgj.b((double)(((idg)$$0).L * 0.7f)) : 0.0f;
    }
}

