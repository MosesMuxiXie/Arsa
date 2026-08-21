/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.internal.ThreadLocalRandom
 */
import io.netty.util.internal.ThreadLocalRandom;

public interface bgr {
    @Deprecated
    public static final double a = 2.297;

    public static bgr a() {
        return bgr.a(evf.a());
    }

    @Deprecated
    public static bgr b() {
        return new evj(evf.a());
    }

    public static bgr a(long $$0) {
        return new eur($$0);
    }

    public static bgr c() {
        return new evg(ThreadLocalRandom.current().nextLong());
    }

    public bgr d();

    public evd e();

    public void b(long var1);

    public int f();

    public int a(int var1);

    default public int a(int $$0, int $$1) {
        return this.a($$1 - $$0 + 1) + $$0;
    }

    public long g();

    public boolean h();

    public float i();

    public double j();

    public double k();

    default public double a(double $$0, double $$1) {
        return $$0 + $$1 * (this.j() - this.j());
    }

    default public float a(float $$0, float $$1) {
        return $$0 + $$1 * (this.i() - this.i());
    }

    default public void b(int $$0) {
        for (int $$1 = 0; $$1 < $$0; ++$$1) {
            this.f();
        }
    }

    default public int b(int $$0, int $$1) {
        if ($$0 >= $$1) {
            throw new IllegalArgumentException("bound - origin is non positive");
        }
        return $$0 + this.a($$1 - $$0);
    }
}

