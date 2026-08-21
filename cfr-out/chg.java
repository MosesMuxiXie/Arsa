/*
 * Decompiled with CFR 0.152.
 */
public class chg {
    private static final int a = 140;
    private static final int b = 700;
    private final ama c;
    private final alw<Integer> d;
    private boolean e;
    private int f;

    public chg(ama $$0, alw<Integer> $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public void a() {
        this.e = true;
        this.f = 0;
    }

    public boolean a(bgr $$0) {
        if (this.e) {
            return false;
        }
        this.e = true;
        this.f = 0;
        this.c.a(this.d, $$0.a(841) + 140);
        return true;
    }

    public void b() {
        if (this.e && this.f++ > this.d()) {
            this.e = false;
        }
    }

    public float c() {
        if (this.e) {
            return 1.0f + 1.15f * bgj.a((double)((float)this.f / (float)this.d() * (float)Math.PI));
        }
        return 1.0f;
    }

    private int d() {
        return this.c.a(this.d);
    }
}

