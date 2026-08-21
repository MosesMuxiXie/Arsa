/*
 * Decompiled with CFR 0.152.
 */
public interface dvy {
    public static int a(double $$0, double $$1, int[] $$2, int $$3) {
        int $$5 = (int)((1.0 - ($$1 *= $$0)) * 255.0);
        int $$4 = (int)((1.0 - $$0) * 255.0);
        int $$6 = $$5 << 8 | $$4;
        if ($$6 >= $$2.length) {
            return $$3;
        }
        return $$2[$$6];
    }
}

