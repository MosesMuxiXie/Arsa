/*
 * Decompiled with CFR 0.152.
 */
public class gzj {
    public static void a(hdg $$0, hdg $$1, hdg $$2, boolean $$3) {
        hdg $$4 = $$3 ? $$0 : $$1;
        hdg $$5 = $$3 ? $$1 : $$0;
        $$4.f = ($$3 ? -0.3f : 0.3f) + $$2.f;
        $$5.f = ($$3 ? 0.6f : -0.6f) + $$2.f;
        $$4.e = -1.5707964f + $$2.e + 0.1f;
        $$5.e = -1.5f + $$2.e;
    }

    public static void a(hdg $$0, hdg $$1, float $$2, float $$3, boolean $$4) {
        hdg $$5 = $$4 ? $$0 : $$1;
        hdg $$6 = $$4 ? $$1 : $$0;
        $$5.f = $$4 ? -0.8f : 0.8f;
        $$6.e = $$5.e = -0.97079635f;
        float $$7 = bgj.a($$3, 0.0f, $$2);
        float $$8 = $$7 / $$2;
        $$6.f = bgj.h($$8, 0.4f, 0.85f) * (float)($$4 ? 1 : -1);
        $$6.e = bgj.h($$8, $$6.e, -1.5707964f);
    }

    public static void a(hdg $$0, hdg $$1, chb $$2, float $$3, float $$4) {
        float $$5 = bgj.a((double)($$3 * (float)Math.PI));
        float $$6 = bgj.a((double)((1.0f - (1.0f - $$3) * (1.0f - $$3)) * (float)Math.PI));
        $$0.g = 0.0f;
        $$1.g = 0.0f;
        $$0.f = 0.15707964f;
        $$1.f = -0.15707964f;
        if ($$2 == chb.b) {
            $$0.e = -1.8849558f + bgj.b((double)($$4 * 0.09f)) * 0.15f;
            $$1.e = -0.0f + bgj.b((double)($$4 * 0.19f)) * 0.5f;
            $$0.e += $$5 * 2.2f - $$6 * 0.4f;
            $$1.e += $$5 * 1.2f - $$6 * 0.4f;
        } else {
            $$0.e = -0.0f + bgj.b((double)($$4 * 0.19f)) * 0.5f;
            $$1.e = -1.8849558f + bgj.b((double)($$4 * 0.09f)) * 0.15f;
            $$0.e += $$5 * 1.2f - $$6 * 0.4f;
            $$1.e += $$5 * 2.2f - $$6 * 0.4f;
        }
        gzj.a($$0, $$1, $$4);
    }

    public static void a(hdg $$0, float $$1, float $$2) {
        $$0.g += $$2 * (bgj.b((double)($$1 * 0.09f)) * 0.05f + 0.05f);
        $$0.e += $$2 * (bgj.a((double)($$1 * 0.067f)) * 0.05f);
    }

    public static void a(hdg $$0, hdg $$1, float $$2) {
        gzj.a($$0, $$2, 1.0f);
        gzj.a($$1, $$2, -1.0f);
    }

    public static <T extends ifp> void a(hdg $$0, hdg $$1, boolean $$2, T $$3) {
        boolean $$4;
        boolean bl2 = $$4 = $$3.l != dnf.c;
        if ($$4) {
            float $$5 = $$3.m;
            float $$6 = (float)(-Math.PI) / ($$2 ? 1.5f : 2.25f);
            float $$7 = bgj.a((double)($$5 * (float)Math.PI));
            float $$8 = bgj.a((double)((1.0f - (1.0f - $$5) * (1.0f - $$5)) * (float)Math.PI));
            $$1.g = 0.0f;
            $$1.f = -(0.1f - $$7 * 0.6f);
            $$1.e = $$6;
            $$1.e += $$7 * 1.2f - $$8 * 0.4f;
            $$0.g = 0.0f;
            $$0.f = 0.1f - $$7 * 0.6f;
            $$0.e = $$6;
            $$0.e += $$7 * 1.2f - $$8 * 0.4f;
        }
        gzj.a($$1, $$0, $$3.L);
    }
}

