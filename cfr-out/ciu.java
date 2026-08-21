/*
 * Decompiled with CFR 0.152.
 */
public class ciu
extends cin {
    private final double c;
    private final double d;

    public ciu(String $$0, double $$1, double $$2, double $$3) {
        super($$0, $$1);
        this.c = $$2;
        this.d = $$3;
        if ($$2 > $$3) {
            throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
        }
        if ($$1 < $$2) {
            throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
        }
        if ($$1 > $$3) {
            throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
        }
    }

    public double d() {
        return this.c;
    }

    public double e() {
        return this.d;
    }

    @Override
    public double a(double $$0) {
        if (Double.isNaN($$0)) {
            return this.c;
        }
        return bgj.a($$0, this.c, this.d);
    }
}

