/*
 * Decompiled with CFR 0.152.
 */
public class dhe {
    private static final int a = 0;
    private static final float b = 0.0f;
    private int c = 20;
    private float d = 5.0f;
    private float e;
    private int f;

    private void b(int $$0, float $$1) {
        this.c = bgj.a($$0 + this.c, 0, 20);
        this.d = bgj.a($$1 + this.d, 0.0f, (float)this.c);
    }

    public void a(int $$0, float $$1) {
        this.b($$0, dhd.a($$0, $$1));
    }

    public void a(dhf $$0) {
        this.b($$0.a(), $$0.b());
    }

    public void a(axg $$0) {
        boolean $$3;
        axf $$1 = $$0.A();
        ccz $$2 = $$1.av();
        if (this.e > 4.0f) {
            this.e -= 4.0f;
            if (this.d > 0.0f) {
                this.d = Math.max(this.d - 1.0f, 0.0f);
            } else if ($$2 != ccz.a) {
                this.c = Math.max(this.c - 1, 0);
            }
        }
        if (($$3 = $$1.U().a(eua.G).booleanValue()) && this.d > 0.0f && $$0.gX() && this.c >= 20) {
            ++this.f;
            if (this.f >= 10) {
                float $$4 = Math.min(this.d, 6.0f);
                $$0.d($$4 / 6.0f);
                this.a($$4);
                this.f = 0;
            }
        } else if ($$3 && this.c >= 18 && $$0.gX()) {
            ++this.f;
            if (this.f >= 80) {
                $$0.d(1.0f);
                this.a(6.0f);
                this.f = 0;
            }
        } else if (this.c <= 0) {
            ++this.f;
            if (this.f >= 80) {
                if ($$0.eZ() > 10.0f || $$2 == ccz.d || $$0.eZ() > 1.0f && $$2 == ccz.c) {
                    $$0.a($$1, $$0.en().j(), 1.0f);
                }
                this.f = 0;
            }
        } else {
            this.f = 0;
        }
    }

    public void a(fnq $$0) {
        this.c = $$0.a("foodLevel", 20);
        this.f = $$0.a("foodTickTimer", 0);
        this.d = $$0.a("foodSaturationLevel", 5.0f);
        this.e = $$0.a("foodExhaustionLevel", 0.0f);
    }

    public void a(fns $$0) {
        $$0.a("foodLevel", this.c);
        $$0.a("foodTickTimer", this.f);
        $$0.a("foodSaturationLevel", this.d);
        $$0.a("foodExhaustionLevel", this.e);
    }

    public int a() {
        return this.c;
    }

    public boolean b() {
        return (float)this.a() > 6.0f;
    }

    public boolean c() {
        return this.c < 20;
    }

    public void a(float $$0) {
        this.e = Math.min(this.e + $$0, 40.0f);
    }

    public float d() {
        return this.d;
    }

    public void a(int $$0) {
        this.c = $$0;
    }

    public void b(float $$0) {
        this.d = $$0;
    }
}

