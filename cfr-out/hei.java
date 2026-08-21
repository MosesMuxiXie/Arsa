/*
 * Decompiled with CFR 0.152.
 */
public class hei
extends gzm<idq> {
    private final hdg[] b = new hdg[9];

    public hei(hdg $$0) {
        super($$0);
        for (int $$1 = 0; $$1 < this.b.length; ++$$1) {
            this.b[$$1] = $$0.b(hdh.a($$1));
        }
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("body", hdl.c().a(0, 0).a(-8.0f, -8.0f, -8.0f, 16.0f, 16.0f, 16.0f), hdi.a(0.0f, 17.6f, 0.0f));
        bgr $$2 = bgr.a(1660L);
        for (int $$3 = 0; $$3 < 9; ++$$3) {
            float $$4 = (((float)($$3 % 3) - (float)($$3 / 3 % 2) * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            float $$5 = ((float)($$3 / 3) / 2.0f * 2.0f - 1.0f) * 5.0f;
            int $$6 = $$2.a(7) + 8;
            $$1.a(hdh.a($$3), hdl.c().a(0, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, $$6, 2.0f), hdi.a($$4, 24.6f, $$5));
        }
        return hdm.a($$0, 64, 32).a(hdp.scaling(4.5f));
    }

    @Override
    public void a(idq $$0) {
        super.a($$0);
        hei.a($$0, this.b);
    }

    public static void a(idf $$0, hdg[] $$1) {
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            $$1[$$2].e = 0.2f * bgj.a((double)($$0.L * 0.3f + (float)$$2)) + 0.4f;
        }
    }
}

