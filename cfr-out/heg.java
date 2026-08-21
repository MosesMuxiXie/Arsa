/*
 * Decompiled with CFR 0.152.
 */
public class heg
extends gzm<idf> {
    private static final int b = 4;
    private static final int[][] c = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
    private static final int[][] d = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
    private final hdg[] e = new hdg[4];

    public heg(hdg $$0) {
        super($$0);
        for (int $$1 = 0; $$1 < 4; ++$$1) {
            this.e[$$1] = $$0.b(heg.a($$1));
        }
    }

    private static String a(int $$0) {
        return "segment" + $$0;
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        float $$2 = -3.5f;
        for (int $$3 = 0; $$3 < 4; ++$$3) {
            $$1.a(heg.a($$3), hdl.c().a(d[$$3][0], d[$$3][1]).a((float)c[$$3][0] * -0.5f, 0.0f, (float)c[$$3][2] * -0.5f, c[$$3][0], c[$$3][1], c[$$3][2]), hdi.a(0.0f, 24 - c[$$3][1], $$2));
            if ($$3 >= 3) continue;
            $$2 += (float)(c[$$3][2] + c[$$3 + 1][2]) * 0.5f;
        }
        return hdm.a($$0, 64, 32);
    }

    @Override
    public void a(idf $$0) {
        super.a($$0);
        for (int $$1 = 0; $$1 < this.e.length; ++$$1) {
            this.e[$$1].f = bgj.b((double)($$0.L * 0.9f + (float)$$1 * 0.15f * (float)Math.PI)) * (float)Math.PI * 0.01f * (float)(1 + Math.abs($$1 - 2));
            this.e[$$1].b = bgj.a((double)($$0.L * 0.9f + (float)$$1 * 0.15f * (float)Math.PI)) * (float)Math.PI * 0.1f * (float)Math.abs($$1 - 2);
        }
    }
}

