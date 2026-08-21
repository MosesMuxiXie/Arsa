/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.Arrays;
import org.jspecify.annotations.Nullable;

public abstract class fks<M extends fkm<M>, S extends fkp<M>>
implements fko {
    public static final int a = 15;
    protected static final int b = 1;
    protected static final long c = fks$a.a(1);
    private static final int g = 512;
    protected static final iz[] d = iz.values();
    protected final eqt e;
    protected final S f;
    private final LongOpenHashSet h = new LongOpenHashSet(512, 0.5f);
    private final LongArrayFIFOQueue i = new LongArrayFIFOQueue();
    private final LongArrayFIFOQueue j = new LongArrayFIFOQueue();
    private static final int k = 2;
    private final long[] l = new long[2];
    private final eqs[] m = new eqs[2];

    protected fks(eqt $$0, S $$1) {
        this.e = $$0;
        this.f = $$1;
        this.c();
    }

    public static boolean a(eoh $$0, eoh $$1) {
        if ($$1 == $$0) {
            return false;
        }
        return $$1.g() != $$0.g() || $$1.k() != $$0.k() || $$1.j() || $$0.j();
    }

    public static int a(eoh $$0, eoh $$1, iz $$2, int $$3) {
        fug $$7;
        boolean $$4 = fks.a($$0);
        boolean $$5 = fks.a($$1);
        if ($$4 && $$5) {
            return $$3;
        }
        fug $$6 = $$4 ? fud.a() : $$0.h();
        fug fug2 = $$7 = $$5 ? fud.a() : $$1.h();
        if (fud.b($$6, $$7, $$2)) {
            return 16;
        }
        return $$3;
    }

    public static fug a(eoh $$0, iz $$1) {
        return fks.a($$0) ? fud.a() : $$0.a($$1);
    }

    protected static boolean a(eoh $$0) {
        return !$$0.t() || !$$0.j();
    }

    protected eoh c(is $$0) {
        int $$2;
        int $$1 = jw.a($$0.u());
        eqs $$3 = this.a($$1, $$2 = jw.a($$0.w()));
        if ($$3 == null) {
            return dzs.I.m();
        }
        return $$3.a_($$0);
    }

    protected int b(eoh $$0) {
        return Math.max(1, $$0.g());
    }

    protected boolean a(eoh $$0, eoh $$1, iz $$2) {
        fug $$3 = fks.a($$0, $$2);
        fug $$4 = fks.a($$1, $$2.g());
        return fud.b($$3, $$4);
    }

    protected @Nullable eqs a(int $$0, int $$1) {
        long $$2 = dvu.d($$0, $$1);
        for (int $$3 = 0; $$3 < 2; ++$$3) {
            if ($$2 != this.l[$$3]) continue;
            return this.m[$$3];
        }
        eqs $$4 = this.e.c($$0, $$1);
        for (int $$5 = 1; $$5 > 0; --$$5) {
            this.l[$$5] = this.l[$$5 - 1];
            this.m[$$5] = this.m[$$5 - 1];
        }
        this.l[0] = $$2;
        this.m[0] = $$4;
        return $$4;
    }

    private void c() {
        Arrays.fill(this.l, dvu.c);
        Arrays.fill(this.m, null);
    }

    @Override
    public void a(is $$0) {
        this.h.add($$0.a());
    }

    public void a(long $$0, @Nullable eql $$1) {
        ((fkp)this.f).a($$0, $$1);
    }

    public void b(dvu $$0, boolean $$1) {
        ((fkp)this.f).c(jw.b($$0.h, $$0.i), $$1);
    }

    @Override
    public void a(jw $$0, boolean $$1) {
        ((fkp)this.f).d($$0.s(), $$1);
    }

    @Override
    public void a(dvu $$0, boolean $$1) {
        ((fkp)this.f).b(jw.b($$0.h, $$0.i), $$1);
    }

    @Override
    public int a() {
        LongIterator $$0 = this.h.iterator();
        while ($$0.hasNext()) {
            this.a($$0.nextLong());
        }
        this.h.clear();
        this.h.trim(512);
        int $$1 = 0;
        $$1 += this.e();
        this.c();
        ((fkp)this.f).a(this);
        ((fkp)this.f).b();
        return $$1 += this.d();
    }

    private int d() {
        int $$0 = 0;
        while (!this.j.isEmpty()) {
            long $$1 = this.j.dequeueLong();
            long $$2 = this.j.dequeueLong();
            int $$3 = ((fkp)this.f).e($$1);
            int $$4 = fks$a.a($$2);
            if (fks$a.c($$2) && $$3 < $$4) {
                ((fkp)this.f).a($$1, $$4);
                $$3 = $$4;
            }
            if ($$3 == $$4) {
                this.a($$1, $$2, $$3);
            }
            ++$$0;
        }
        return $$0;
    }

    private int e() {
        int $$0 = 0;
        while (!this.i.isEmpty()) {
            long $$1 = this.i.dequeueLong();
            long $$2 = this.i.dequeueLong();
            this.a($$1, $$2);
            ++$$0;
        }
        return $$0;
    }

    protected void b(long $$0, long $$1) {
        this.i.enqueue($$0);
        this.i.enqueue($$1);
    }

    protected void c(long $$0, long $$1) {
        this.j.enqueue($$0);
        this.j.enqueue($$1);
    }

    @Override
    public boolean M_() {
        return ((fkp)this.f).a() || !this.h.isEmpty() || !this.i.isEmpty() || !this.j.isEmpty();
    }

    @Override
    public @Nullable eql a(jw $$0) {
        return ((fkp)this.f).d($$0.s());
    }

    @Override
    public int b(is $$0) {
        return ((fkp)this.f).a($$0.a());
    }

    public String b(long $$0) {
        return this.c($$0).a();
    }

    public fkp.b c(long $$0) {
        return ((fkp)this.f).l($$0);
    }

    protected abstract void a(long var1);

    protected abstract void a(long var1, long var3, int var5);

    protected abstract void a(long var1, long var3);

    public static class a {
        private static final int a = 4;
        private static final int b = 6;
        private static final long c = 15L;
        private static final long d = 1008L;
        private static final long e = 1024L;
        private static final long f = 2048L;

        public static long a(int $$0, iz $$1) {
            long $$2 = fks$a.c(1008L, $$1);
            return fks$a.a($$2, $$0);
        }

        public static long a(int $$0) {
            return fks$a.a(1008L, $$0);
        }

        public static long a(int $$0, boolean $$1) {
            long $$2 = 1008L;
            $$2 |= 0x800L;
            if ($$1) {
                $$2 |= 0x400L;
            }
            return fks$a.a($$2, $$0);
        }

        public static long a(int $$0, boolean $$1, iz $$2) {
            long $$3 = fks$a.c(1008L, $$2);
            if ($$1) {
                $$3 |= 0x400L;
            }
            return fks$a.a($$3, $$0);
        }

        public static long b(int $$0, boolean $$1, iz $$2) {
            long $$3 = 0L;
            if ($$1) {
                $$3 |= 0x400L;
            }
            $$3 = fks$a.b($$3, $$2);
            return fks$a.a($$3, $$0);
        }

        public static long a(boolean $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4) {
            long $$5 = fks$a.a(0L, 15);
            if ($$0) {
                $$5 = fks$a.b($$5, iz.a);
            }
            if ($$1) {
                $$5 = fks$a.b($$5, iz.c);
            }
            if ($$2) {
                $$5 = fks$a.b($$5, iz.d);
            }
            if ($$3) {
                $$5 = fks$a.b($$5, iz.e);
            }
            if ($$4) {
                $$5 = fks$a.b($$5, iz.f);
            }
            return $$5;
        }

        public static int a(long $$0) {
            return (int)($$0 & 0xFL);
        }

        public static boolean b(long $$0) {
            return ($$0 & 0x400L) != 0L;
        }

        public static boolean c(long $$0) {
            return ($$0 & 0x800L) != 0L;
        }

        public static boolean a(long $$0, iz $$1) {
            return ($$0 & 1L << $$1.ordinal() + 4) != 0L;
        }

        private static long a(long $$0, int $$1) {
            return $$0 & 0xFFFFFFFFFFFFFFF0L | (long)$$1 & 0xFL;
        }

        private static long b(long $$0, iz $$1) {
            return $$0 | 1L << $$1.ordinal() + 4;
        }

        private static long c(long $$0, iz $$1) {
            return $$0 & (1L << $$1.ordinal() + 4 ^ 0xFFFFFFFFFFFFFFFFL);
        }
    }
}

