/*
 * Decompiled with CFR 0.152.
 */
public interface dlo {
    public static final int a = 256;
    public static final float b = 7.0f;
    public static final amt<dlm> c = dlo.a("ponder_goat_horn");
    public static final amt<dlm> d = dlo.a("sing_goat_horn");
    public static final amt<dlm> e = dlo.a("seek_goat_horn");
    public static final amt<dlm> f = dlo.a("feel_goat_horn");
    public static final amt<dlm> g = dlo.a("admire_goat_horn");
    public static final amt<dlm> h = dlo.a("call_goat_horn");
    public static final amt<dlm> i = dlo.a("yearn_goat_horn");
    public static final amt<dlm> j = dlo.a("dream_goat_horn");

    private static amt<dlm> a(String $$0) {
        return amt.a(mj.bi, amo.b($$0));
    }

    public static void a(qr<dlm> $$0) {
        dlo.a($$0, c, (jd)bda.oD.get(0), 7.0f, 256.0f);
        dlo.a($$0, d, (jd)bda.oD.get(1), 7.0f, 256.0f);
        dlo.a($$0, e, (jd)bda.oD.get(2), 7.0f, 256.0f);
        dlo.a($$0, f, (jd)bda.oD.get(3), 7.0f, 256.0f);
        dlo.a($$0, g, (jd)bda.oD.get(4), 7.0f, 256.0f);
        dlo.a($$0, h, (jd)bda.oD.get(5), 7.0f, 256.0f);
        dlo.a($$0, i, (jd)bda.oD.get(6), 7.0f, 256.0f);
        dlo.a($$0, j, (jd)bda.oD.get(7), 7.0f, 256.0f);
    }

    public static void a(qr<dlm> $$0, amt<dlm> $$1, jd<bcz> $$2, float $$3, float $$4) {
        yw $$5 = yh.c(bhs.a("instrument", $$1.a()));
        $$0.a($$1, new dlm($$2, $$3, $$4, $$5));
    }
}

