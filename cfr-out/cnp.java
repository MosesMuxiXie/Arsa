/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class cnp
implements cnm {
    protected final chn a;
    protected float b;
    protected float c;
    protected int d;
    protected double e;
    protected double f;
    protected double g;

    public cnp(chn $$0) {
        this.a = $$0;
    }

    public void a(ftm $$0) {
        this.a($$0.g, $$0.h, $$0.i);
    }

    public void a(cgk $$0) {
        this.a($$0.dP(), $$0.dT(), $$0.dV());
    }

    public void a(cgk $$0, float $$1, float $$2) {
        this.a($$0.dP(), $$0.dT(), $$0.dV(), $$1, $$2);
    }

    public void a(double $$0, double $$1, double $$2) {
        this.a($$0, $$1, $$2, this.a.ai(), this.a.ac());
    }

    public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.b = $$3;
        this.c = $$4;
        this.d = 2;
    }

    public void a() {
        if (this.c()) {
            this.a.w(0.0f);
        }
        if (this.d > 0) {
            --this.d;
            this.i().ifPresent($$0 -> {
                this.a.bE = this.a(this.a.bE, $$0.floatValue(), this.b);
            });
            this.h().ifPresent($$0 -> this.a.w(this.a(this.a.ee(), $$0.floatValue(), this.c)));
        } else {
            this.a.bE = this.a(this.a.bE, this.a.bC, 10.0f);
        }
        this.b();
    }

    protected void b() {
        if (!this.a.N().l()) {
            this.a.bE = bgj.c(this.a.bE, this.a.bC, (float)this.a.ae());
        }
    }

    protected boolean c() {
        return true;
    }

    public boolean d() {
        return this.d > 0;
    }

    public double e() {
        return this.e;
    }

    public double f() {
        return this.f;
    }

    public double g() {
        return this.g;
    }

    protected Optional<Float> h() {
        double $$0 = this.e - this.a.dP();
        double $$1 = this.f - this.a.dT();
        double $$2 = this.g - this.a.dV();
        double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
        return Math.abs($$1) > (double)1.0E-5f || Math.abs($$3) > (double)1.0E-5f ? Optional.of(Float.valueOf((float)(-(bgj.d($$1, $$3) * 57.2957763671875)))) : Optional.empty();
    }

    protected Optional<Float> i() {
        double $$0 = this.e - this.a.dP();
        double $$1 = this.g - this.a.dV();
        return Math.abs($$1) > (double)1.0E-5f || Math.abs($$0) > (double)1.0E-5f ? Optional.of(Float.valueOf((float)(bgj.d($$1, $$0) * 57.2957763671875) - 90.0f)) : Optional.empty();
    }
}

