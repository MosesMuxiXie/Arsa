/*
 * Decompiled with CFR 0.152.
 */
public class hnz {
    public static final int a = 30;
    private static final int b = 600;
    private static final int c = 200;
    private static final int d = 100;
    private static final int e = 380;
    private long f;
    private int g;
    private int h;
    private float i;
    private float j;
    private float k;
    private float l;

    public void a(long $$0) {
        this.b($$0);
        this.j = this.i;
        this.i = this.c($$0);
    }

    private void b(long $$0) {
        long $$1 = $$0 / 600L;
        if ($$1 != this.f) {
            bgr $$2 = bgr.a($$1);
            $$2.i();
            this.g = bgj.b($$2, 0, 200);
            this.h = bgj.b($$2, 100, Math.min(380, 600 - this.g));
            this.k = bgj.b($$2, -60.0f, 10.0f);
            this.l = bgj.b($$2, -180.0f, 180.0f);
            this.f = $$1;
        }
    }

    private float c(long $$0) {
        long $$1 = $$0 % 600L;
        if ($$1 < (long)this.g || $$1 > (long)(this.g + this.h)) {
            return 0.0f;
        }
        return bgj.a((double)((float)($$1 - (long)this.g) * (float)Math.PI / (float)this.h));
    }

    public float a() {
        return this.k;
    }

    public float b() {
        return this.l;
    }

    public float a(float $$0) {
        return bgj.h($$0, this.j, this.i);
    }

    public boolean c() {
        return this.i > 0.0f && this.j <= 0.0f;
    }
}

