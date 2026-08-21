/*
 * Decompiled with CFR 0.152.
 */
public class hek
extends gzm<ids> {
    public static final hdp b = hdp.scaling(2.35f);
    private static final float[] c = new float[]{1.75f, 0.25f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f, 0.5f, 1.25f, 0.75f, 0.0f, 0.0f};
    private static final float[] d = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 1.75f, 1.25f, 0.75f, 0.0f, 0.0f, 0.0f, 0.0f};
    private static final float[] e = new float[]{0.0f, 0.0f, 0.25f, 1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, 1.25f};
    private static final float[] f = new float[]{0.0f, 0.0f, 8.0f, -8.0f, -8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f, 8.0f, -8.0f};
    private static final float[] g = new float[]{-8.0f, -8.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 8.0f, 8.0f, 8.0f};
    private static final float[] h = new float[]{8.0f, -8.0f, 0.0f, 0.0f, -8.0f, -8.0f, 8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f};
    private static final String i = "eye";
    private static final String j = "tail0";
    private static final String k = "tail1";
    private static final String l = "tail2";
    private final hdg m;
    private final hdg n;
    private final hdg[] q = new hdg[12];
    private final hdg[] r;

    public hek(hdg $$0) {
        super($$0);
        this.m = $$0.b("head");
        for (int $$1 = 0; $$1 < this.q.length; ++$$1) {
            this.q[$$1] = this.m.b(hek.a($$1));
        }
        this.n = this.m.b(i);
        this.r = new hdg[3];
        this.r[0] = this.m.b(j);
        this.r[1] = this.r[0].b(k);
        this.r[2] = this.r[1].b(l);
    }

    private static String a(int $$0) {
        return "spike" + $$0;
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("head", hdl.c().a(0, 0).a(-6.0f, 10.0f, -8.0f, 12.0f, 12.0f, 16.0f).a(0, 28).a(-8.0f, 10.0f, -6.0f, 2.0f, 12.0f, 12.0f).a(0, 28).a(6.0f, 10.0f, -6.0f, 2.0f, 12.0f, 12.0f, true).a(16, 40).a(-6.0f, 8.0f, -6.0f, 12.0f, 2.0f, 12.0f).a(16, 40).a(-6.0f, 22.0f, -6.0f, 12.0f, 2.0f, 12.0f), hdi.a);
        hdl $$3 = hdl.c().a(0, 0).a(-1.0f, -4.5f, -1.0f, 2.0f, 9.0f, 2.0f);
        for (int $$4 = 0; $$4 < 12; ++$$4) {
            float $$5 = hek.b($$4, 0.0f, 0.0f);
            float $$6 = hek.c($$4, 0.0f, 0.0f);
            float $$7 = hek.d($$4, 0.0f, 0.0f);
            float $$8 = (float)Math.PI * c[$$4];
            float $$9 = (float)Math.PI * d[$$4];
            float $$10 = (float)Math.PI * e[$$4];
            $$2.a(hek.a($$4), $$3, hdi.a($$5, $$6, $$7, $$8, $$9, $$10));
        }
        $$2.a(i, hdl.c().a(8, 0).a(-1.0f, 15.0f, 0.0f, 2.0f, 2.0f, 1.0f), hdi.a(0.0f, 0.0f, -8.25f));
        hdq $$11 = $$2.a(j, hdl.c().a(40, 0).a(-2.0f, 14.0f, 7.0f, 4.0f, 4.0f, 8.0f), hdi.a);
        hdq $$12 = $$11.a(k, hdl.c().a(0, 54).a(0.0f, 14.0f, 0.0f, 3.0f, 3.0f, 7.0f), hdi.a(-1.5f, 0.5f, 14.0f));
        $$12.a(l, hdl.c().a(41, 32).a(0.0f, 14.0f, 0.0f, 2.0f, 2.0f, 6.0f).a(25, 19).a(1.0f, 10.5f, 3.0f, 1.0f, 9.0f, 9.0f), hdi.a(0.5f, 0.5f, 6.0f));
        return hdm.a($$0, 64, 64);
    }

    public static hdm e() {
        return hek.a().a(b);
    }

    @Override
    public void a(ids $$0) {
        super.a($$0);
        this.m.f = $$0.au * ((float)Math.PI / 180);
        this.m.e = $$0.av * ((float)Math.PI / 180);
        float $$1 = (1.0f - $$0.a) * 0.55f;
        this.a($$0.L, $$1);
        if ($$0.e != null && $$0.d != null) {
            double $$2 = $$0.e.h - $$0.c.h;
            this.n.c = $$2 > 0.0 ? 0.0f : 1.0f;
            ftm $$3 = $$0.d;
            $$3 = new ftm($$3.g, 0.0, $$3.i);
            ftm $$4 = new ftm($$0.c.g - $$0.e.g, 0.0, $$0.c.i - $$0.e.i).d().b(1.5707964f);
            double $$5 = $$3.b($$4);
            this.n.b = bgj.a((float)Math.abs($$5)) * 2.0f * (float)Math.signum($$5);
        }
        this.n.k = true;
        float $$6 = $$0.b;
        this.r[0].f = bgj.a((double)$$6) * (float)Math.PI * 0.05f;
        this.r[1].f = bgj.a((double)$$6) * (float)Math.PI * 0.1f;
        this.r[2].f = bgj.a((double)$$6) * (float)Math.PI * 0.15f;
    }

    private void a(float $$0, float $$1) {
        for (int $$2 = 0; $$2 < 12; ++$$2) {
            this.q[$$2].b = hek.b($$2, $$0, $$1);
            this.q[$$2].c = hek.c($$2, $$0, $$1);
            this.q[$$2].d = hek.d($$2, $$0, $$1);
        }
    }

    private static float a(int $$0, float $$1, float $$2) {
        return 1.0f + bgj.b((double)($$1 * 1.5f + (float)$$0)) * 0.01f - $$2;
    }

    private static float b(int $$0, float $$1, float $$2) {
        return f[$$0] * hek.a($$0, $$1, $$2);
    }

    private static float c(int $$0, float $$1, float $$2) {
        return 16.0f + g[$$0] * hek.a($$0, $$1, $$2);
    }

    private static float d(int $$0, float $$1, float $$2) {
        return h[$$0] * hek.a($$0, $$1, $$2);
    }
}

