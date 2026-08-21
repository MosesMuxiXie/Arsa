/*
 * Decompiled with CFR 0.152.
 */
public class hce
extends gzm<ieq> {
    private static final String b = "feather";
    private final hdg c;
    private final hdg d;
    private final hdg e;
    private final hdg f;
    private final hdg g;
    private final hdg h;
    private final hdg i;

    public hce(hdg $$0) {
        super($$0);
        this.c = $$0.b("body");
        this.d = $$0.b("tail");
        this.e = $$0.b("left_wing");
        this.f = $$0.b("right_wing");
        this.g = $$0.b("head");
        this.h = $$0.b("left_leg");
        this.i = $$0.b("right_leg");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("body", hdl.c().a(2, 8).a(-1.5f, 0.0f, -1.5f, 3.0f, 6.0f, 3.0f), hdi.a(0.0f, 16.5f, -3.0f, 0.4937f, 0.0f, 0.0f));
        $$1.a("tail", hdl.c().a(22, 1).a(-1.5f, -1.0f, -1.0f, 3.0f, 4.0f, 1.0f), hdi.a(0.0f, 21.07f, 1.16f, 1.015f, 0.0f, 0.0f));
        $$1.a("left_wing", hdl.c().a(19, 8).a(-0.5f, 0.0f, -1.5f, 1.0f, 5.0f, 3.0f), hdi.a(1.5f, 16.94f, -2.76f, -0.6981f, (float)(-Math.PI), 0.0f));
        $$1.a("right_wing", hdl.c().a(19, 8).a(-0.5f, 0.0f, -1.5f, 1.0f, 5.0f, 3.0f), hdi.a(-1.5f, 16.94f, -2.76f, -0.6981f, (float)(-Math.PI), 0.0f));
        hdq $$2 = $$1.a("head", hdl.c().a(2, 2).a(-1.0f, -1.5f, -1.0f, 2.0f, 3.0f, 2.0f), hdi.a(0.0f, 15.69f, -2.76f));
        $$2.a("head2", hdl.c().a(10, 0).a(-1.0f, -0.5f, -2.0f, 2.0f, 1.0f, 4.0f), hdi.a(0.0f, -2.0f, -1.0f));
        $$2.a("beak1", hdl.c().a(11, 7).a(-0.5f, -1.0f, -0.5f, 1.0f, 2.0f, 1.0f), hdi.a(0.0f, -0.5f, -1.5f));
        $$2.a("beak2", hdl.c().a(16, 7).a(-0.5f, 0.0f, -0.5f, 1.0f, 2.0f, 1.0f), hdi.a(0.0f, -1.75f, -2.45f));
        $$2.a(b, hdl.c().a(2, 18).a(0.0f, -4.0f, -2.0f, 0.0f, 5.0f, 4.0f), hdi.a(0.0f, -2.15f, 0.15f, -0.2214f, 0.0f, 0.0f));
        hdl $$3 = hdl.c().a(14, 18).a(-0.5f, 0.0f, -0.5f, 1.0f, 2.0f, 1.0f);
        $$1.a("left_leg", $$3, hdi.a(1.0f, 22.0f, -1.05f, -0.0299f, 0.0f, 0.0f));
        $$1.a("right_leg", $$3, hdi.a(-1.0f, 22.0f, -1.05f, -0.0299f, 0.0f, 0.0f));
        return hdm.a($$0, 32, 32);
    }

    @Override
    public void a(ieq $$0) {
        super.a($$0);
        this.a($$0.c);
        this.g.e = $$0.av * ((float)Math.PI / 180);
        this.g.f = $$0.au * ((float)Math.PI / 180);
        switch ($$0.c.ordinal()) {
            case 2: {
                break;
            }
            case 3: {
                float $$1 = bgj.b((double)$$0.L);
                float $$2 = bgj.a((double)$$0.L);
                this.g.b += $$1;
                this.g.c += $$2;
                this.g.e = 0.0f;
                this.g.f = 0.0f;
                this.g.g = bgj.a((double)$$0.L) * 0.4f;
                this.c.b += $$1;
                this.c.c += $$2;
                this.e.g = -0.0873f - $$0.b;
                this.e.b += $$1;
                this.e.c += $$2;
                this.f.g = 0.0873f + $$0.b;
                this.f.b += $$1;
                this.f.c += $$2;
                this.d.b += $$1;
                this.d.c += $$2;
                break;
            }
            case 1: {
                this.h.e += bgj.b((double)($$0.ax * 0.6662f)) * 1.4f * $$0.ay;
                this.i.e += bgj.b((double)($$0.ax * 0.6662f + (float)Math.PI)) * 1.4f * $$0.ay;
            }
            default: {
                float $$3 = $$0.b * 0.3f;
                this.g.c += $$3;
                this.d.e += bgj.b((double)($$0.ax * 0.6662f)) * 0.3f * $$0.ay;
                this.d.c += $$3;
                this.c.c += $$3;
                this.e.g = -0.0873f - $$0.b;
                this.e.c += $$3;
                this.f.g = 0.0873f + $$0.b;
                this.f.c += $$3;
                this.h.c += $$3;
                this.i.c += $$3;
            }
        }
    }

    @Override
    private void a(a $$0) {
        switch ($$0.ordinal()) {
            case 0: {
                this.h.e += 0.6981317f;
                this.i.e += 0.6981317f;
                break;
            }
            case 2: {
                float $$1 = 1.9f;
                this.g.c += 1.9f;
                this.d.e += 0.5235988f;
                this.d.c += 1.9f;
                this.c.c += 1.9f;
                this.e.g = -0.0873f;
                this.e.c += 1.9f;
                this.f.g = 0.0873f;
                this.f.c += 1.9f;
                this.h.c += 1.9f;
                this.i.c += 1.9f;
                this.h.e += 1.5707964f;
                this.i.e += 1.5707964f;
                break;
            }
            case 3: {
                this.h.g = -0.34906584f;
                this.i.g = 0.34906584f;
                break;
            }
        }
    }

    public static a a(cwy $$0) {
        if ($$0.he()) {
            return hce$a.d;
        }
        if ($$0.gQ()) {
            return hce$a.c;
        }
        if ($$0.d()) {
            return hce$a.a;
        }
        return hce$a.b;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e};
        }

        static {
            f = hce$a.a();
        }
    }
}

