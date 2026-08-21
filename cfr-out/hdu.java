/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class hdu
extends gzm<ieh> {
    private final hdg[] b;
    private final hdg c;

    public hdu(hdg $$0) {
        super($$0);
        this.c = $$0.b("head");
        this.b = new hdg[12];
        Arrays.setAll(this.b, $$1 -> $$0.b(hdu.a($$1)));
    }

    private static String a(int $$0) {
        return "part" + $$0;
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("head", hdl.c().a(0, 0).a(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f), hdi.a);
        float $$2 = 0.0f;
        hdl $$3 = hdl.c().a(0, 16).a(0.0f, 0.0f, 0.0f, 2.0f, 8.0f, 2.0f);
        for (int $$4 = 0; $$4 < 4; ++$$4) {
            float $$5 = bgj.b((double)$$2) * 9.0f;
            float $$6 = -2.0f + bgj.b((double)((float)($$4 * 2) * 0.25f));
            float $$7 = bgj.a((double)$$2) * 9.0f;
            $$1.a(hdu.a($$4), $$3, hdi.a($$5, $$6, $$7));
            $$2 += 1.5707964f;
        }
        $$2 = 0.7853982f;
        for (int $$8 = 4; $$8 < 8; ++$$8) {
            float $$9 = bgj.b((double)$$2) * 7.0f;
            float $$10 = 2.0f + bgj.b((double)((float)($$8 * 2) * 0.25f));
            float $$11 = bgj.a((double)$$2) * 7.0f;
            $$1.a(hdu.a($$8), $$3, hdi.a($$9, $$10, $$11));
            $$2 += 1.5707964f;
        }
        $$2 = 0.47123894f;
        for (int $$12 = 8; $$12 < 12; ++$$12) {
            float $$13 = bgj.b((double)$$2) * 5.0f;
            float $$14 = 11.0f + bgj.b((double)((float)$$12 * 1.5f * 0.5f));
            float $$15 = bgj.a((double)$$2) * 5.0f;
            $$1.a(hdu.a($$12), $$3, hdi.a($$13, $$14, $$15));
            $$2 += 1.5707964f;
        }
        return hdm.a($$0, 64, 32);
    }

    @Override
    public void a(ieh $$0) {
        super.a($$0);
        float $$1 = $$0.L * (float)Math.PI * -0.1f;
        for (int $$2 = 0; $$2 < 4; ++$$2) {
            this.b[$$2].c = -2.0f + bgj.b((double)(((float)($$2 * 2) + $$0.L) * 0.25f));
            this.b[$$2].b = bgj.b((double)$$1) * 9.0f;
            this.b[$$2].d = bgj.a((double)$$1) * 9.0f;
            $$1 += 1.5707964f;
        }
        $$1 = 0.7853982f + $$0.L * (float)Math.PI * 0.03f;
        for (int $$3 = 4; $$3 < 8; ++$$3) {
            this.b[$$3].c = 2.0f + bgj.b((double)(((float)($$3 * 2) + $$0.L) * 0.25f));
            this.b[$$3].b = bgj.b((double)$$1) * 7.0f;
            this.b[$$3].d = bgj.a((double)$$1) * 7.0f;
            $$1 += 1.5707964f;
        }
        $$1 = 0.47123894f + $$0.L * (float)Math.PI * -0.05f;
        for (int $$4 = 8; $$4 < 12; ++$$4) {
            this.b[$$4].c = 11.0f + bgj.b((double)(((float)$$4 * 1.5f + $$0.L) * 0.5f));
            this.b[$$4].b = bgj.b((double)$$1) * 5.0f;
            this.b[$$4].d = bgj.a((double)$$1) * 5.0f;
            $$1 += 1.5707964f;
        }
        this.c.f = $$0.au * ((float)Math.PI / 180);
        this.c.e = $$0.av * ((float)Math.PI / 180);
    }
}

