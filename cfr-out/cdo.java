/*
 * Decompiled with CFR 0.152.
 */
public class cdo {
    public static final float a = 1.0f;
    protected float b = 20.0f;
    protected long c = bhn.a / 20L;
    protected int d = 0;
    protected boolean e = true;
    protected boolean f = false;

    public void a(float $$0) {
        this.b = Math.max($$0, 1.0f);
        this.c = (long)((double)bhn.a / (double)this.b);
    }

    public float f() {
        return this.b;
    }

    public float g() {
        return (float)this.c / (float)bhn.b;
    }

    public long h() {
        return this.c;
    }

    public boolean i() {
        return this.e;
    }

    public boolean j() {
        return this.d > 0;
    }

    public void c(int $$0) {
        this.d = $$0;
    }

    public int k() {
        return this.d;
    }

    public void a(boolean $$0) {
        this.f = $$0;
    }

    public boolean l() {
        return this.f;
    }

    public void m() {
        boolean bl2 = this.e = !this.f || this.d > 0;
        if (this.d > 0) {
            --this.d;
        }
    }

    public boolean a(cgk $$0) {
        return !this.i() && !($$0 instanceof ddm) && $$0.ds() <= 0;
    }
}

