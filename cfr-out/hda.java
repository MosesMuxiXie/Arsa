/*
 * Decompiled with CFR 0.152.
 */
public class hda
extends gzm<ick> {
    private static final int b = 2;
    private final hdg[] c = new hdg[2];

    public hda(hdg $$0) {
        super($$0);
        for (int $$1 = 0; $$1 < 2; ++$$1) {
            this.c[$$1] = $$0.b(hda.a($$1));
        }
    }

    private static String a(int $$0) {
        return "box" + $$0;
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        for (int $$2 = 0; $$2 < 2; ++$$2) {
            float $$3 = -3.2f + 9.6f * (float)($$2 + 1);
            float $$4 = 0.75f * (float)($$2 + 1);
            $$1.a(hda.a($$2), hdl.c().a(0, 0).a(-8.0f, -16.0f + $$3, -8.0f, 16.0f, 32.0f, 16.0f), hdi.a.a($$4));
        }
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(ick $$0) {
        super.a($$0);
        for (int $$1 = 0; $$1 < this.c.length; ++$$1) {
            float $$2 = $$0.L * (float)(-(45 + ($$1 + 1) * 5));
            this.c[$$1].f = bgj.f($$2) * ((float)Math.PI / 180);
        }
    }
}

