/*
 * Decompiled with CFR 0.152.
 */
public class gii {
    private ftm a = ftm.c;
    private float b;
    private float c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private float j;
    private float k;

    public void a(ftm $$0, ftm $$1) {
        this.c = this.b;
        this.a = $$1;
        this.a($$0);
    }

    public void a(float $$0) {
        this.b += $$0;
    }

    public ftm a() {
        return this.a;
    }

    private void a(ftm $$0) {
        this.g = this.d;
        this.h = this.e;
        this.i = this.f;
        double $$1 = $$0.a() - this.d;
        double $$2 = $$0.b() - this.e;
        double $$3 = $$0.c() - this.f;
        double $$4 = 10.0;
        if ($$1 > 10.0 || $$1 < -10.0) {
            this.g = this.d = $$0.a();
        } else {
            this.d += $$1 * 0.25;
        }
        if ($$2 > 10.0 || $$2 < -10.0) {
            this.h = this.e = $$0.b();
        } else {
            this.e += $$2 * 0.25;
        }
        if ($$3 > 10.0 || $$3 < -10.0) {
            this.i = this.f = $$0.c();
        } else {
            this.f += $$3 * 0.25;
        }
    }

    public double b(float $$0) {
        return bgj.d((double)$$0, this.g, this.d);
    }

    public double c(float $$0) {
        return bgj.d((double)$$0, this.h, this.e);
    }

    public double d(float $$0) {
        return bgj.d((double)$$0, this.i, this.f);
    }

    public void e(float $$0) {
        this.k = this.j;
        this.j += ($$0 - this.j) * 0.4f;
    }

    public void b() {
        this.k = this.j;
        this.j = 0.0f;
    }

    public float f(float $$0) {
        return bgj.h($$0, this.k, this.j);
    }

    public float g(float $$0) {
        float $$1 = this.b - this.c;
        return -(this.b + $$1 * $$0);
    }

    public float h(float $$0) {
        return bgj.h($$0, this.c, this.b);
    }
}

