/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import org.apache.commons.lang3.Validate;

public class bid {
    private static final int a = 6;
    private final long[] b;
    private final int c;
    private final long d;
    private final int e;

    public bid(int $$0, int $$1) {
        this($$0, $$1, new long[bgj.e($$1 * $$0, 64) / 64]);
    }

    public bid(int $$0, int $$1, long[] $$2) {
        Validate.inclusiveBetween((long)1L, (long)32L, (long)$$0);
        this.e = $$1;
        this.c = $$0;
        this.b = $$2;
        this.d = (1L << $$0) - 1L;
        int $$3 = bgj.e($$1 * $$0, 64) / 64;
        if ($$2.length != $$3) {
            throw new IllegalArgumentException("Invalid length given for storage, got: " + $$2.length + " but expected: " + $$3);
        }
    }

    public void a(int $$0, int $$1) {
        Validate.inclusiveBetween((long)0L, (long)(this.e - 1), (long)$$0);
        Validate.inclusiveBetween((long)0L, (long)this.d, (long)$$1);
        int $$2 = $$0 * this.c;
        int $$3 = $$2 >> 6;
        int $$4 = ($$0 + 1) * this.c - 1 >> 6;
        int $$5 = $$2 ^ $$3 << 6;
        this.b[$$3] = this.b[$$3] & (this.d << $$5 ^ 0xFFFFFFFFFFFFFFFFL) | ((long)$$1 & this.d) << $$5;
        if ($$3 != $$4) {
            int $$6 = 64 - $$5;
            int $$7 = this.c - $$6;
            this.b[$$4] = this.b[$$4] >>> $$7 << $$7 | ((long)$$1 & this.d) >> $$6;
        }
    }

    public int a(int $$0) {
        Validate.inclusiveBetween((long)0L, (long)(this.e - 1), (long)$$0);
        int $$1 = $$0 * this.c;
        int $$2 = $$1 >> 6;
        int $$3 = ($$0 + 1) * this.c - 1 >> 6;
        int $$4 = $$1 ^ $$2 << 6;
        if ($$2 == $$3) {
            return (int)(this.b[$$2] >>> $$4 & this.d);
        }
        int $$5 = 64 - $$4;
        return (int)((this.b[$$2] >>> $$4 | this.b[$$3] << $$5) & this.d);
    }

    public long[] a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }
}

