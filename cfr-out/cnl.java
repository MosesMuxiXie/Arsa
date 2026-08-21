/*
 * Decompiled with CFR 0.152.
 */
public class cnl
implements cnm {
    private final chn a;
    private static final int b = 15;
    private static final int c = 10;
    private static final int d = 10;
    private int e;
    private float f;

    public cnl(chn $$0) {
        this.a = $$0;
    }

    public void a() {
        if (this.f()) {
            this.a.bC = this.a.ec();
            this.c();
            this.f = this.a.bE;
            this.e = 0;
            return;
        }
        if (this.e()) {
            if (Math.abs(this.a.bE - this.f) > 15.0f) {
                this.e = 0;
                this.f = this.a.bE;
                this.b();
            } else {
                ++this.e;
                if (this.e > 10) {
                    this.d();
                }
            }
        }
    }

    private void b() {
        this.a.bC = bgj.c(this.a.bC, this.a.bE, (float)this.a.ae());
    }

    private void c() {
        this.a.bE = bgj.c(this.a.bE, this.a.bC, (float)this.a.ae());
    }

    private void d() {
        int $$0 = this.e - 10;
        float $$1 = bgj.a((float)$$0 / 10.0f, 0.0f, 1.0f);
        float $$2 = (float)this.a.ae() * (1.0f - $$1);
        this.a.bC = bgj.c(this.a.bC, this.a.bE, $$2);
    }

    private boolean e() {
        return !(this.a.do() instanceof chn);
    }

    private boolean f() {
        double $$1;
        double $$0 = this.a.dP() - this.a.Y;
        return $$0 * $$0 + ($$1 = this.a.dV() - this.a.aa) * $$1 > 2.500000277905201E-7;
    }
}

