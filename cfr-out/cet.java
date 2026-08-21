/*
 * Decompiled with CFR 0.152.
 */
public class cet {
    public static final float a = 20.0f;
    public static final float b = 25.0f;
    public static final float c = 2.0f;
    public static final float d = 0.2f;
    private static final int e = 4;

    public static float a(chl $$0, float $$1, cex $$2, float $$3, float $$4) {
        float $$11;
        dwo dwo2;
        float $$5 = 2.0f + $$4 / 4.0f;
        float $$6 = bgj.a($$3 - $$1 / $$5, $$3 * 0.2f, 20.0f);
        float $$7 = $$6 / 25.0f;
        dlt $$8 = $$2.e();
        if ($$8 != null && (dwo2 = $$0.ao()) instanceof axf) {
            axf $$9 = (axf)dwo2;
            float $$10 = bgj.a(dsq.c($$9, $$8, $$0, $$2, $$7), 0.0f, 1.0f);
        } else {
            $$11 = $$7;
        }
        float $$12 = 1.0f - $$11;
        return $$1 * $$12;
    }

    public static float a(float $$0, float $$1) {
        float $$2 = bgj.a($$1, 0.0f, 20.0f);
        return $$0 * (1.0f - $$2 / 25.0f);
    }
}

