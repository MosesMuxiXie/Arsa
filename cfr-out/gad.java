/*
 * Decompiled with CFR 0.152.
 */
public class gad {
    private volatile long a;
    private volatile long b;
    private long c = bhs.c();
    private long d;
    private long e;

    public void a(long $$0) {
        this.b = $$0;
    }

    public void a() {
        this.a = 0L;
        this.c = bhs.c();
        this.d = 0L;
        this.e = 0L;
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.a;
    }

    public void b(long $$0) {
        this.a = $$0;
    }

    public boolean d() {
        return this.a > 0L;
    }

    public boolean e() {
        return this.a >= this.b;
    }

    public double f() {
        return Math.min((double)this.c() / (double)this.b(), 1.0);
    }

    public void g() {
        long $$0 = bhs.c();
        long $$1 = $$0 - this.c;
        if ($$1 < 1000L) {
            return;
        }
        long $$2 = this.a;
        this.e = 1000L * ($$2 - this.d) / $$1;
        this.d = $$2;
        this.c = $$0;
    }

    public long h() {
        return this.e;
    }
}

