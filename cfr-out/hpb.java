/*
 * Decompiled with CFR 0.152.
 */
public class hpb {
    private final long[] a;
    private int b;
    private int c;

    public hpb(int $$0) {
        this.a = new long[$$0];
    }

    public long a(long $$0) {
        if (this.b < this.a.length) {
            ++this.b;
        }
        this.a[this.c] = $$0;
        this.c = (this.c + 1) % this.a.length;
        long $$1 = Long.MAX_VALUE;
        long $$2 = Long.MIN_VALUE;
        long $$3 = 0L;
        for (int $$4 = 0; $$4 < this.b; ++$$4) {
            long $$5 = this.a[$$4];
            $$3 += $$5;
            $$1 = Math.min($$1, $$5);
            $$2 = Math.max($$2, $$5);
        }
        if (this.b > 2) {
            return ($$3 -= $$1 + $$2) / (long)(this.b - 2);
        }
        if ($$3 > 0L) {
            return (long)this.b / $$3;
        }
        return 0L;
    }
}

