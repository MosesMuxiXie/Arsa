/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class hfd
extends gzm<idf> {
    private static final int b = 7;
    private final hdg[] c = new hdg[7];
    private final hdg[] d = new hdg[3];
    private static final int[][] e = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
    private static final int[][] f = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

    public hfd(hdg $$0) {
        super($$0);
        Arrays.setAll(this.c, $$1 -> $$0.b(hfd.b($$1)));
        Arrays.setAll(this.d, $$1 -> $$0.b(hfd.a($$1)));
    }

    private static String a(int $$0) {
        return "layer" + $$0;
    }

    private static String b(int $$0) {
        return "segment" + $$0;
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        float[] $$2 = new float[7];
        float $$3 = -3.5f;
        for (int $$4 = 0; $$4 < 7; ++$$4) {
            $$1.a(hfd.b($$4), hdl.c().a(f[$$4][0], f[$$4][1]).a((float)e[$$4][0] * -0.5f, 0.0f, (float)e[$$4][2] * -0.5f, e[$$4][0], e[$$4][1], e[$$4][2]), hdi.a(0.0f, 24 - e[$$4][1], $$3));
            $$2[$$4] = $$3;
            if ($$4 >= 6) continue;
            $$3 += (float)(e[$$4][2] + e[$$4 + 1][2]) * 0.5f;
        }
        $$1.a(hfd.a(0), hdl.c().a(20, 0).a(-5.0f, 0.0f, (float)e[2][2] * -0.5f, 10.0f, 8.0f, e[2][2]), hdi.a(0.0f, 16.0f, $$2[2]));
        $$1.a(hfd.a(1), hdl.c().a(20, 11).a(-3.0f, 0.0f, (float)e[4][2] * -0.5f, 6.0f, 4.0f, e[4][2]), hdi.a(0.0f, 20.0f, $$2[4]));
        $$1.a(hfd.a(2), hdl.c().a(20, 18).a(-3.0f, 0.0f, (float)e[4][2] * -0.5f, 6.0f, 5.0f, e[1][2]), hdi.a(0.0f, 19.0f, $$2[1]));
        return hdm.a($$0, 64, 32);
    }

    @Override
    public void a(idf $$0) {
        super.a($$0);
        for (int $$1 = 0; $$1 < this.c.length; ++$$1) {
            this.c[$$1].f = bgj.b((double)($$0.L * 0.9f + (float)$$1 * 0.15f * (float)Math.PI)) * (float)Math.PI * 0.05f * (float)(1 + Math.abs($$1 - 2));
            this.c[$$1].b = bgj.a((double)($$0.L * 0.9f + (float)$$1 * 0.15f * (float)Math.PI)) * (float)Math.PI * 0.2f * (float)Math.abs($$1 - 2);
        }
        this.d[0].f = this.c[2].f;
        this.d[1].f = this.c[4].f;
        this.d[1].b = this.c[4].b;
        this.d[2].f = this.c[1].f;
        this.d[2].b = this.c[1].b;
    }
}

