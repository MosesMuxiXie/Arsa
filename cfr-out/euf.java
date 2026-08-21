/*
 * Decompiled with CFR 0.152.
 */
public interface euf
extends bgr {
    public static final float b = 5.9604645E-8f;
    public static final double c = (double)1.110223E-16f;

    public int c(int var1);

    @Override
    default public int f() {
        return this.c(32);
    }

    @Override
    default public int a(int $$0) {
        int $$2;
        int $$1;
        if ($$0 <= 0) {
            throw new IllegalArgumentException("Bound must be positive");
        }
        if (($$0 & $$0 - 1) == 0) {
            return (int)((long)$$0 * (long)this.c(31) >> 31);
        }
        while (($$1 = this.c(31)) - ($$2 = $$1 % $$0) + ($$0 - 1) < 0) {
        }
        return $$2;
    }

    @Override
    default public long g() {
        int $$0 = this.c(32);
        int $$1 = this.c(32);
        long $$2 = (long)$$0 << 32;
        return $$2 + (long)$$1;
    }

    @Override
    default public boolean h() {
        return this.c(1) != 0;
    }

    @Override
    default public float i() {
        return (float)this.c(24) * 5.9604645E-8f;
    }

    @Override
    default public double j() {
        int $$0 = this.c(26);
        int $$1 = this.c(27);
        long $$2 = ((long)$$0 << 27) + (long)$$1;
        return (double)$$2 * (double)1.110223E-16f;
    }
}

