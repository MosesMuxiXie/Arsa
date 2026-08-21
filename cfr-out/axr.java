/*
 * Decompiled with CFR 0.152.
 */
public class axr
implements axq {
    private static final int a = 10;
    private static final int b = bgj.i(7);
    private final boolean c;
    private int d;
    private int e;
    private int f;
    private float g;
    private volatile float h;

    public axr(boolean $$0) {
        this.c = $$0;
    }

    @Override
    public void a(axq.a $$0, int $$1) {
        if (!this.b($$0)) {
            return;
        }
        switch ($$0) {
            case c: {
                int $$2 = this.c ? b : 0;
                this.d = 10 + $$1 + $$2;
                this.a(10);
                this.b();
                this.a($$1);
                break;
            }
            case d: {
                this.a(b);
            }
        }
    }

    private void a(int $$0) {
        this.f = $$0;
        this.g = 0.0f;
        this.c();
    }

    @Override
    public void a(axq.a $$0, int $$1, int $$2) {
        if (this.b($$0)) {
            this.g = $$2 == 0 ? 0.0f : (float)$$1 / (float)$$2;
            this.c();
        }
    }

    @Override
    public void a(axq.a $$0) {
        if (this.b($$0)) {
            this.b();
        }
    }

    private void b() {
        this.e += this.f;
        this.f = 0;
        this.c();
    }

    private boolean b(axq.a $$0) {
        return switch ($$0) {
            case axq.a.c -> true;
            case axq.a.d -> this.c;
            default -> false;
        };
    }

    private void c() {
        if (this.d == 0) {
            this.h = 0.0f;
        } else {
            float $$0 = (float)this.e + this.g * (float)this.f;
            this.h = $$0 / (float)this.d;
        }
    }

    public float a() {
        return this.h;
    }

    @Override
    public void a(amt<dwo> $$0, dvu $$1) {
    }
}

