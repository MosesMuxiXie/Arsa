/*
 * Decompiled with CFR 0.152.
 */
public class cil {
    private float a;
    private float b;
    private float c;
    private float d = 1.0f;

    public void a(float $$0) {
        this.b = $$0;
    }

    public void a(float $$0, float $$1, float $$2) {
        this.a = this.b;
        this.b += ($$0 - this.b) * $$1;
        this.c += this.b;
        this.d = $$2;
    }

    public void a() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    public float b() {
        return this.b;
    }

    public float b(float $$0) {
        return Math.min(bgj.h($$0, this.a, this.b), 1.0f);
    }

    public float c() {
        return this.c * this.d;
    }

    public float c(float $$0) {
        return (this.c - this.b * (1.0f - $$0)) * this.d;
    }

    public boolean d() {
        return this.b > 1.0E-5f;
    }
}

