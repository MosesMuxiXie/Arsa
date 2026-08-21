/*
 * Decompiled with CFR 0.152.
 */
public abstract class bxm
implements bxq {
    protected final long[] a;
    protected final long[] b;

    protected bxm(int $$0, long[] $$1) {
        if ($$1.length != $$0) {
            throw new IllegalArgumentException("defaults have incorrect length of " + $$1.length);
        }
        this.b = new long[$$0];
        this.a = $$1;
    }

    @Override
    public void a(long[] $$0) {
        System.arraycopy($$0, 0, this.b, 0, $$0.length);
        this.a();
        this.b();
    }

    @Override
    public void a(long $$0) {
        this.b[0] = $$0;
        this.a();
        this.b();
    }

    @Override
    public void a(long $$0, int $$1) {
        if ($$1 < 1 || $$1 >= this.b.length) {
            throw new IndexOutOfBoundsException($$1 + " out of bounds for dimensions " + this.b.length);
        }
        this.b[$$1] = $$0;
    }

    protected abstract void a();

    protected void b() {
        System.arraycopy(this.a, 0, this.b, 0, this.a.length);
    }
}

