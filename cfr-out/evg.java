/*
 * Decompiled with CFR 0.152.
 */
public class evg
implements euf {
    private static final int d = 48;
    private static final long e = 0xFFFFFFFFFFFFL;
    private static final long f = 25214903917L;
    private static final long g = 11L;
    private long h;
    private final eus i = new eus(this);

    public evg(long $$0) {
        this.b($$0);
    }

    @Override
    public bgr d() {
        return new evg(this.g());
    }

    @Override
    public evd e() {
        return new eur.a(this.g());
    }

    @Override
    public void b(long $$0) {
        this.h = ($$0 ^ 0x5DEECE66DL) & 0xFFFFFFFFFFFFL;
        this.i.a();
    }

    @Override
    public int c(int $$0) {
        long $$1;
        this.h = $$1 = this.h * 25214903917L + 11L & 0xFFFFFFFFFFFFL;
        return (int)($$1 >> 48 - $$0);
    }

    @Override
    public double k() {
        return this.i.b();
    }
}

