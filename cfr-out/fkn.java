/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  it.unimi.dsi.fastutil.longs.LongList
 */
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import java.util.function.LongPredicate;

public abstract class fkn {
    public static final long e = Long.MAX_VALUE;
    private static final int a = 255;
    protected final int f;
    private final fkr b;
    private final Long2ByteMap c;
    private volatile boolean d;

    protected fkn(int $$0, int $$1, final int $$2) {
        if ($$0 >= 254) {
            throw new IllegalArgumentException("Level count must be < 254.");
        }
        this.f = $$0;
        this.b = new fkr($$0, $$1);
        this.c = new Long2ByteOpenHashMap($$2, 0.5f){

            protected void rehash(int $$0) {
                if ($$0 > $$2) {
                    super.rehash($$0);
                }
            }
        };
        this.c.defaultReturnValue((byte)-1);
    }

    protected void d(long $$0) {
        int $$1 = this.c.remove($$0) & 0xFF;
        if ($$1 == 255) {
            return;
        }
        int $$2 = this.c($$0);
        int $$3 = this.a($$2, $$1);
        this.b.a($$0, $$3, this.f);
        this.d = !this.b.b();
    }

    public void a(LongPredicate $$0) {
        LongArrayList $$1 = new LongArrayList();
        this.c.keySet().forEach(arg_0 -> fkn.a($$0, (LongList)$$1, arg_0));
        $$1.forEach(this::d);
    }

    private int a(int $$0, int $$1) {
        return Math.min(Math.min($$0, $$1), this.f - 1);
    }

    protected void e(long $$0) {
        this.a($$0, $$0, this.f - 1, false);
    }

    protected void a(long $$0, long $$1, int $$2, boolean $$3) {
        this.a($$0, $$1, $$2, this.c($$1), this.c.get($$1) & 0xFF, $$3);
        this.d = !this.b.b();
    }

    private void a(long $$0, long $$1, int $$2, int $$3, int $$4, boolean $$5) {
        int $$8;
        boolean $$6;
        if (this.a($$1)) {
            return;
        }
        $$2 = bgj.a($$2, 0, this.f - 1);
        $$3 = bgj.a($$3, 0, this.f - 1);
        boolean bl2 = $$6 = $$4 == 255;
        if ($$6) {
            $$4 = $$3;
        }
        if ($$5) {
            int $$7 = Math.min($$4, $$2);
        } else {
            $$8 = bgj.a(this.a($$1, $$0, $$2), 0, this.f - 1);
        }
        int $$9 = this.a($$3, $$4);
        if ($$3 != $$8) {
            int $$10 = this.a($$3, $$8);
            if ($$9 != $$10 && !$$6) {
                this.b.a($$1, $$9, $$10);
            }
            this.b.a($$1, $$10);
            this.c.put($$1, (byte)$$8);
        } else if (!$$6) {
            this.b.a($$1, $$9, this.f);
            this.c.remove($$1);
        }
    }

    protected final void b(long $$0, long $$1, int $$2, boolean $$3) {
        int $$4 = this.c.get($$1) & 0xFF;
        int $$5 = bgj.a(this.b($$0, $$1, $$2), 0, this.f - 1);
        if ($$3) {
            this.a($$0, $$1, $$5, this.c($$1), $$4, $$3);
        } else {
            int $$8;
            boolean $$6;
            boolean bl2 = $$6 = $$4 == 255;
            if ($$6) {
                int $$7 = bgj.a(this.c($$1), 0, this.f - 1);
            } else {
                $$8 = $$4;
            }
            if ($$5 == $$8) {
                this.a($$0, $$1, this.f - 1, $$6 ? $$8 : this.c($$1), $$4, $$3);
            }
        }
    }

    protected final boolean b() {
        return this.d;
    }

    protected final int b(int $$0) {
        if (this.b.b()) {
            return $$0;
        }
        while (!this.b.b() && $$0 > 0) {
            --$$0;
            long $$1 = this.b.a();
            int $$2 = bgj.a(this.c($$1), 0, this.f - 1);
            int $$3 = this.c.remove($$1) & 0xFF;
            if ($$3 < $$2) {
                this.a($$1, $$3);
                this.a($$1, $$3, true);
                continue;
            }
            if ($$3 <= $$2) continue;
            this.a($$1, this.f - 1);
            if ($$3 != this.f - 1) {
                this.b.a($$1, this.a(this.f - 1, $$3));
                this.c.put($$1, (byte)$$3);
            }
            this.a($$1, $$2, false);
        }
        this.d = !this.b.b();
        return $$0;
    }

    public int c() {
        return this.c.size();
    }

    protected boolean a(long $$0) {
        return $$0 == Long.MAX_VALUE;
    }

    protected abstract int a(long var1, long var3, int var5);

    protected abstract void a(long var1, int var3, boolean var4);

    protected abstract int c(long var1);

    protected abstract void a(long var1, int var3);

    protected abstract int b(long var1, long var3, int var5);

    private static /* synthetic */ void a(LongPredicate $$0, LongList $$1, long $$2) {
        if ($$0.test($$2)) {
            $$1.add($$2);
        }
    }
}

