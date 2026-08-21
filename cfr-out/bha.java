/*
 * Decompiled with CFR 0.152.
 */
public class bha {
    private double a;
    private double b;
    private double c;

    public double a(double $$0, double $$1) {
        this.a += $$0;
        double $$2 = this.a - this.b;
        double $$3 = bgj.d(0.5, this.c, $$2);
        double $$4 = Math.signum($$2);
        if ($$4 * $$2 > $$4 * this.c) {
            $$2 = $$3;
        }
        this.c = $$3;
        this.b += $$2 * $$1;
        return $$2 * $$1;
    }

    public void a() {
        this.a = 0.0;
        this.b = 0.0;
        this.c = 0.0;
    }
}

