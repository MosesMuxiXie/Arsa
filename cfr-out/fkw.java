/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.HashCommon
 *  it.unimi.dsi.fastutil.longs.Long2LongLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet
 */
import it.unimi.dsi.fastutil.HashCommon;
import it.unimi.dsi.fastutil.longs.Long2LongLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import java.util.NoSuchElementException;

public class fkw
extends LongLinkedOpenHashSet {
    private final a a;

    public fkw(int $$0, float $$1) {
        super($$0, $$1);
        this.a = new a($$0 / 64, $$1);
    }

    public boolean add(long $$0) {
        return this.a.c($$0);
    }

    public boolean rem(long $$0) {
        return this.a.d($$0);
    }

    public long removeFirstLong() {
        return this.a.a();
    }

    public int size() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    protected static class a
    extends Long2LongLinkedOpenHashMap {
        private static final int a = bgj.g(60000000);
        private static final int b = bgj.g(60000000);
        private static final int c;
        private static final int d = 0;
        private static final int e;
        private static final int g;
        private static final long h;
        private int i = -1;
        private long j;
        private final int k;

        public a(int $$0, float $$1) {
            super($$0, $$1);
            this.k = $$0;
        }

        static long a(long $$0) {
            return $$0 & (h ^ 0xFFFFFFFFFFFFFFFFL);
        }

        static int b(long $$0) {
            int $$1 = (int)($$0 >>> g & 3L);
            int $$2 = (int)($$0 >>> 0 & 3L);
            int $$3 = (int)($$0 >>> e & 3L);
            return $$1 << 4 | $$3 << 2 | $$2;
        }

        static long a(long $$0, int $$1) {
            $$0 |= (long)($$1 >>> 4 & 3) << g;
            $$0 |= (long)($$1 >>> 2 & 3) << e;
            return $$0 |= (long)($$1 >>> 0 & 3) << 0;
        }

        public boolean c(long $$0) {
            int $$6;
            long $$1 = fkw$a.a($$0);
            int $$2 = fkw$a.b($$0);
            long $$3 = 1L << $$2;
            if ($$1 == 0L) {
                if (this.containsNullKey) {
                    return this.a(this.n, $$3);
                }
                this.containsNullKey = true;
                int $$4 = this.n;
            } else {
                if (this.i != -1 && $$1 == this.j) {
                    return this.a(this.i, $$3);
                }
                long[] $$5 = this.key;
                $$6 = (int)HashCommon.mix((long)$$1) & this.mask;
                long $$7 = $$5[$$6];
                while ($$7 != 0L) {
                    if ($$7 == $$1) {
                        this.i = $$6;
                        this.j = $$1;
                        return this.a($$6, $$3);
                    }
                    $$6 = $$6 + 1 & this.mask;
                    $$7 = $$5[$$6];
                }
            }
            this.key[$$6] = $$1;
            this.value[$$6] = $$3;
            if (this.size == 0) {
                this.first = this.last = $$6;
                this.link[$$6] = -1L;
            } else {
                int n2 = this.last;
                this.link[n2] = this.link[n2] ^ (this.link[this.last] ^ (long)$$6 & 0xFFFFFFFFL) & 0xFFFFFFFFL;
                this.link[$$6] = ((long)this.last & 0xFFFFFFFFL) << 32 | 0xFFFFFFFFL;
                this.last = $$6;
            }
            if (this.size++ >= this.maxFill) {
                this.rehash(HashCommon.arraySize((int)(this.size + 1), (float)this.f));
            }
            return false;
        }

        private boolean a(int $$0, long $$1) {
            boolean $$2 = (this.value[$$0] & $$1) != 0L;
            int n2 = $$0;
            this.value[n2] = this.value[n2] | $$1;
            return $$2;
        }

        public boolean d(long $$0) {
            long $$1 = fkw$a.a($$0);
            int $$2 = fkw$a.b($$0);
            long $$3 = 1L << $$2;
            if ($$1 == 0L) {
                if (this.containsNullKey) {
                    return this.e($$3);
                }
                return false;
            }
            if (this.i != -1 && $$1 == this.j) {
                return this.b(this.i, $$3);
            }
            long[] $$4 = this.key;
            int $$5 = (int)HashCommon.mix((long)$$1) & this.mask;
            long $$6 = $$4[$$5];
            while ($$6 != 0L) {
                if ($$1 == $$6) {
                    this.i = $$5;
                    this.j = $$1;
                    return this.b($$5, $$3);
                }
                $$5 = $$5 + 1 & this.mask;
                $$6 = $$4[$$5];
            }
            return false;
        }

        private boolean e(long $$0) {
            if ((this.value[this.n] & $$0) == 0L) {
                return false;
            }
            int n2 = this.n;
            this.value[n2] = this.value[n2] & ($$0 ^ 0xFFFFFFFFFFFFFFFFL);
            if (this.value[this.n] != 0L) {
                return true;
            }
            this.containsNullKey = false;
            --this.size;
            this.fixPointers(this.n);
            if (this.size < this.maxFill / 4 && this.n > 16) {
                this.rehash(this.n / 2);
            }
            return true;
        }

        private boolean b(int $$0, long $$1) {
            if ((this.value[$$0] & $$1) == 0L) {
                return false;
            }
            int n2 = $$0;
            this.value[n2] = this.value[n2] & ($$1 ^ 0xFFFFFFFFFFFFFFFFL);
            if (this.value[$$0] != 0L) {
                return true;
            }
            this.i = -1;
            --this.size;
            this.fixPointers($$0);
            this.shiftKeys($$0);
            if (this.size < this.maxFill / 4 && this.n > 16) {
                this.rehash(this.n / 2);
            }
            return true;
        }

        public long a() {
            if (this.size == 0) {
                throw new NoSuchElementException();
            }
            int $$0 = this.first;
            long $$1 = this.key[$$0];
            int $$2 = Long.numberOfTrailingZeros(this.value[$$0]);
            int n2 = $$0;
            this.value[n2] = this.value[n2] & (1L << $$2 ^ 0xFFFFFFFFFFFFFFFFL);
            if (this.value[$$0] == 0L) {
                this.removeFirstLong();
                this.i = -1;
            }
            return fkw$a.a($$1, $$2);
        }

        protected void rehash(int $$0) {
            if ($$0 > this.k) {
                super.rehash($$0);
            }
        }

        static {
            e = c = 64 - a - b;
            g = c + b;
            h = 3L << g | 3L | 3L << e;
        }
    }
}

