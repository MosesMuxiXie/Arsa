/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.ToIntFunction;
import org.jspecify.annotations.Nullable;

public class ggs {
    private static final int a = 256;
    private final ThreadLocal<b> b = ThreadLocal.withInitial(b::new);
    private final Long2ObjectLinkedOpenHashMap<a> c = new Long2ObjectLinkedOpenHashMap(256, 0.25f);
    private final ReentrantReadWriteLock d = new ReentrantReadWriteLock();
    private final ToIntFunction<is> e;

    public ggs(ToIntFunction<is> $$0) {
        this.e = $$0;
    }

    public int a(is $$0) {
        int $$9;
        int $$1 = jw.a($$0.u());
        int $$2 = jw.a($$0.w());
        b $$3 = this.b.get();
        if ($$3.a != $$1 || $$3.b != $$2 || $$3.c == null || $$3.c.a()) {
            $$3.a = $$1;
            $$3.b = $$2;
            $$3.c = this.b($$1, $$2);
        }
        int[] $$4 = $$3.c.a($$0.v());
        int $$5 = $$0.u() & 0xF;
        int $$6 = $$0.w() & 0xF;
        int $$7 = $$6 << 4 | $$5;
        int $$8 = $$4[$$7];
        if ($$8 != -1) {
            return $$8;
        }
        $$4[$$7] = $$9 = this.e.applyAsInt($$0);
        return $$9;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int $$0, int $$1) {
        try {
            this.d.writeLock().lock();
            for (int $$2 = -1; $$2 <= 1; ++$$2) {
                for (int $$3 = -1; $$3 <= 1; ++$$3) {
                    long $$4 = dvu.d($$0 + $$2, $$1 + $$3);
                    a $$5 = (a)this.c.remove($$4);
                    if ($$5 == null) continue;
                    $$5.b();
                }
            }
        }
        finally {
            this.d.writeLock().unlock();
        }
    }

    public void a() {
        try {
            this.d.writeLock().lock();
            this.c.values().forEach(a::b);
            this.c.clear();
        }
        finally {
            this.d.writeLock().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private a b(int $$0, int $$1) {
        long $$2 = dvu.d($$0, $$1);
        this.d.readLock().lock();
        try {
            a $$3 = (a)this.c.get($$2);
            if ($$3 != null) {
                a a2 = $$3;
                return a2;
            }
        }
        finally {
            this.d.readLock().unlock();
        }
        this.d.writeLock().lock();
        try {
            a $$6;
            a $$4 = (a)this.c.get($$2);
            if ($$4 != null) {
                a a3 = $$4;
                return a3;
            }
            a $$5 = new a();
            if (this.c.size() >= 256 && ($$6 = (a)this.c.removeFirst()) != null) {
                $$6.b();
            }
            this.c.put($$2, (Object)$$5);
            a a4 = $$5;
            return a4;
        }
        finally {
            this.d.writeLock().unlock();
        }
    }

    static class b {
        public int a = Integer.MIN_VALUE;
        public int b = Integer.MIN_VALUE;
        @Nullable a c;

        private b() {
        }
    }

    static class a {
        private final Int2ObjectArrayMap<int[]> a = new Int2ObjectArrayMap(16);
        private final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
        private static final int c = bgj.i(16);
        private volatile boolean d;

        a() {
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public int[] a(int $$02) {
            this.b.readLock().lock();
            try {
                int[] $$1 = (int[])this.a.get($$02);
                if ($$1 != null) {
                    int[] nArray = $$1;
                    return nArray;
                }
            }
            finally {
                this.b.readLock().unlock();
            }
            this.b.writeLock().lock();
            try {
                int[] nArray = (int[])this.a.computeIfAbsent($$02, $$0 -> this.c());
                return nArray;
            }
            finally {
                this.b.writeLock().unlock();
            }
        }

        private int[] c() {
            int[] $$0 = new int[c];
            Arrays.fill($$0, -1);
            return $$0;
        }

        public boolean a() {
            return this.d;
        }

        public void b() {
            this.d = true;
        }
    }
}

