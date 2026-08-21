/*
 * Decompiled with CFR 0.152.
 */
public class bgt {
    private final int a;
    private final int b;
    private final float c;
    private final float d;

    public bgt(int $$0) {
        if ($$0 < 2) {
            throw new IllegalArgumentException("Precision cannot be less than 2 bits");
        }
        if ($$0 > 30) {
            throw new IllegalArgumentException("Precision cannot be greater than 30 bits");
        }
        int $$1 = 1 << $$0;
        this.a = $$1 - 1;
        this.b = $$0;
        this.c = (float)$$1 / 360.0f;
        this.d = 360.0f / (float)$$1;
    }

    public boolean a(int $$0, int $$1) {
        int $$2 = this.a() >> 1;
        return ($$0 & $$2) == ($$1 & $$2);
    }

    public int a(iz $$0) {
        if ($$0.o().b()) {
            return 0;
        }
        int $$1 = $$0.e();
        return $$1 << this.b - 2;
    }

    public int a(float $$0) {
        return Math.round($$0 * this.c);
    }

    public int b(float $$0) {
        return this.c(this.a($$0));
    }

    public float a(int $$0) {
        return (float)$$0 * this.d;
    }

    public float b(int $$0) {
        float $$1 = this.a(this.c($$0));
        return $$1 >= 180.0f ? $$1 - 360.0f : $$1;
    }

    public int c(int $$0) {
        return $$0 & this.a;
    }

    public int a() {
        return this.a;
    }
}

