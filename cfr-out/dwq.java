/*
 * Decompiled with CFR 0.152.
 */
public interface dwq {
    public int L_();

    public int K_();

    default public int aw() {
        return this.K_() + this.L_() - 1;
    }

    default public int ax() {
        return this.az() - this.ay() + 1;
    }

    default public int ay() {
        return jw.a(this.K_());
    }

    default public int az() {
        return jw.a(this.aw());
    }

    default public boolean d(int $$0) {
        return $$0 >= this.K_() && $$0 <= this.aw();
    }

    default public boolean y(is $$0) {
        return this.e($$0.v());
    }

    default public boolean e(int $$0) {
        return $$0 < this.K_() || $$0 > this.aw();
    }

    default public int f(int $$0) {
        return this.g(jw.a($$0));
    }

    default public int g(int $$0) {
        return $$0 - this.ay();
    }

    default public int h(int $$0) {
        return $$0 + this.ay();
    }

    public static dwq e(final int $$0, final int $$1) {
        return new dwq(){

            @Override
            public int L_() {
                return $$1;
            }

            @Override
            public int K_() {
                return $$0;
            }
        };
    }
}

