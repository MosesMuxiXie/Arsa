/*
 * Decompiled with CFR 0.152.
 */
public class bxn
extends bxm
implements bxr {
    public static final int c = 240;
    private final long[][] d;
    private int e;
    private int f;

    public bxn(int $$0) {
        this($$0, new long[$$0]);
    }

    public bxn(int $$0, long[] $$1) {
        super($$0, $$1);
        this.d = new long[240][$$0];
    }

    @Override
    protected void a() {
        int $$0 = this.b(this.e + this.f);
        System.arraycopy(this.b, 0, this.d[$$0], 0, this.b.length);
        if (this.f < 240) {
            ++this.f;
        } else {
            this.e = this.b(this.e + 1);
        }
    }

    @Override
    public int c() {
        return this.d.length;
    }

    @Override
    public int d() {
        return this.f;
    }

    @Override
    public long a(int $$0) {
        return this.a($$0, 0);
    }

    @Override
    public long a(int $$0, int $$1) {
        if ($$0 < 0 || $$0 >= this.f) {
            throw new IndexOutOfBoundsException($$0 + " out of bounds for length " + this.f);
        }
        long[] $$2 = this.d[this.b(this.e + $$0)];
        if ($$1 < 0 || $$1 >= $$2.length) {
            throw new IndexOutOfBoundsException($$1 + " out of bounds for dimensions " + $$2.length);
        }
        return $$2[$$1];
    }

    private int b(int $$0) {
        return $$0 % 240;
    }

    @Override
    public void e() {
        this.e = 0;
        this.f = 0;
    }
}

