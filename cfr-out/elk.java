/*
 * Decompiled with CFR 0.152.
 */
public class elk {
    private boolean a;
    private float b;
    private float c;

    public void a() {
        this.c = this.b;
        float $$0 = 0.1f;
        if (!this.a && this.b > 0.0f) {
            this.b = Math.max(this.b - 0.1f, 0.0f);
        } else if (this.a && this.b < 1.0f) {
            this.b = Math.min(this.b + 0.1f, 1.0f);
        }
    }

    public float a(float $$0) {
        return bgj.h($$0, this.c, this.b);
    }

    public void a(boolean $$0) {
        this.a = $$0;
    }
}

