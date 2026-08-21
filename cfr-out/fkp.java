/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMaps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import org.jspecify.annotations.Nullable;

public abstract class fkp<M extends fkm<M>> {
    private final dww i;
    protected final eqt a;
    protected final Long2ByteMap b = new Long2ByteOpenHashMap();
    private final LongSet j = new LongOpenHashSet();
    protected volatile M c;
    protected final M d;
    protected final LongSet e = new LongOpenHashSet();
    protected final LongSet f = new LongOpenHashSet();
    protected final Long2ObjectMap<eql> g = Long2ObjectMaps.synchronize((Long2ObjectMap)new Long2ObjectOpenHashMap());
    private final LongSet k = new LongOpenHashSet();
    private final LongSet l = new LongOpenHashSet();
    protected volatile boolean h;

    protected fkp(dww $$0, eqt $$1, M $$2) {
        this.i = $$0;
        this.a = $$1;
        this.d = $$2;
        this.c = ((fkm)$$2).b();
        ((fkm)this.c).d();
        this.b.defaultReturnValue((byte)0);
    }

    protected boolean b(long $$0) {
        return this.a($$0, true) != null;
    }

    protected @Nullable eql a(long $$0, boolean $$1) {
        return this.a($$1 ? this.d : this.c, $$0);
    }

    protected @Nullable eql a(M $$0, long $$1) {
        return ((fkm)$$0).c($$1);
    }

    protected @Nullable eql c(long $$0) {
        eql $$1 = ((fkm)this.d).c($$0);
        if ($$1 == null) {
            return null;
        }
        if (this.e.add($$0)) {
            $$1 = $$1.b();
            ((fkm)this.d).a($$0, $$1);
            ((fkm)this.d).c();
        }
        return $$1;
    }

    public @Nullable eql d(long $$0) {
        eql $$1 = (eql)this.g.get($$0);
        if ($$1 != null) {
            return $$1;
        }
        return this.a($$0, false);
    }

    protected abstract int a(long var1);

    protected int e(long $$0) {
        long $$1 = jw.e($$0);
        eql $$2 = this.a($$1, true);
        return $$2.a(jw.b(is.a($$0)), jw.b(is.b($$0)), jw.b(is.c($$0)));
    }

    protected void a(long $$0, int $$1) {
        eql $$4;
        long $$2 = jw.e($$0);
        if (this.e.add($$2)) {
            eql $$3 = ((fkm)this.d).a($$2);
        } else {
            $$4 = this.a($$2, true);
        }
        $$4.a(jw.b(is.a($$0)), jw.b(is.b($$0)), jw.b(is.c($$0)), $$1);
        jw.a($$0, arg_0 -> ((LongSet)this.f).add(arg_0));
    }

    protected void f(long $$0) {
        int $$1 = jw.b($$0);
        int $$2 = jw.c($$0);
        int $$3 = jw.d($$0);
        for (int $$4 = -1; $$4 <= 1; ++$$4) {
            for (int $$5 = -1; $$5 <= 1; ++$$5) {
                for (int $$6 = -1; $$6 <= 1; ++$$6) {
                    this.f.add(jw.b($$1 + $$5, $$2 + $$6, $$3 + $$4));
                }
            }
        }
    }

    protected eql g(long $$0) {
        eql $$1 = (eql)this.g.get($$0);
        if ($$1 != null) {
            return $$1;
        }
        return new eql();
    }

    protected boolean a() {
        return this.h;
    }

    protected void a(fks<M, ?> $$0) {
        if (!this.h) {
            return;
        }
        this.h = false;
        LongIterator longIterator = this.l.iterator();
        while (longIterator.hasNext()) {
            long $$1 = (Long)longIterator.next();
            eql $$2 = (eql)this.g.remove($$1);
            eql $$3 = ((fkm)this.d).d($$1);
            if (!this.k.contains(jw.f($$1))) continue;
            if ($$2 != null) {
                this.g.put($$1, (Object)$$2);
                continue;
            }
            if ($$3 == null) continue;
            this.g.put($$1, (Object)$$3);
        }
        ((fkm)this.d).c();
        longIterator = this.l.iterator();
        while (longIterator.hasNext()) {
            long $$4 = (Long)longIterator.next();
            this.i($$4);
            this.e.add($$4);
        }
        this.l.clear();
        ObjectIterator $$5 = Long2ObjectMaps.fastIterator(this.g);
        while ($$5.hasNext()) {
            Long2ObjectMap.Entry $$6 = (Long2ObjectMap.Entry)$$5.next();
            long $$7 = $$6.getLongKey();
            if (!this.b($$7)) continue;
            eql $$8 = (eql)$$6.getValue();
            if (((fkm)this.d).c($$7) != $$8) {
                ((fkm)this.d).a($$7, $$8);
                this.e.add($$7);
            }
            $$5.remove();
        }
        ((fkm)this.d).c();
    }

    protected void h(long $$0) {
    }

    protected void i(long $$0) {
    }

    protected void b(long $$0, boolean $$1) {
        if ($$1) {
            this.j.add($$0);
        } else {
            this.j.remove($$0);
        }
    }

    protected boolean j(long $$0) {
        long $$1 = jw.f($$0);
        return this.j.contains($$1);
    }

    protected boolean k(long $$0) {
        return this.j.contains($$0);
    }

    public void c(long $$0, boolean $$1) {
        if ($$1) {
            this.k.add($$0);
        } else {
            this.k.remove($$0);
        }
    }

    protected void a(long $$0, @Nullable eql $$1) {
        if ($$1 != null) {
            this.g.put($$0, (Object)$$1);
            this.h = true;
        } else {
            this.g.remove($$0);
        }
    }

    protected void d(long $$0, boolean $$1) {
        byte $$3;
        byte $$2 = this.b.get($$0);
        if ($$2 == ($$3 = fkp$a.a($$2, !$$1))) {
            return;
        }
        this.a($$0, $$3);
        int $$4 = $$1 ? -1 : 1;
        for (int $$5 = -1; $$5 <= 1; ++$$5) {
            for (int $$6 = -1; $$6 <= 1; ++$$6) {
                for (int $$7 = -1; $$7 <= 1; ++$$7) {
                    if ($$5 == 0 && $$6 == 0 && $$7 == 0) continue;
                    long $$8 = jw.a($$0, $$5, $$6, $$7);
                    byte $$9 = this.b.get($$8);
                    this.a($$8, fkp$a.a($$9, fkp$a.b($$9) + $$4));
                }
            }
        }
    }

    protected void a(long $$0, byte $$1) {
        if ($$1 != 0) {
            if (this.b.put($$0, $$1) == 0) {
                this.m($$0);
            }
        } else if (this.b.remove($$0) != 0) {
            this.n($$0);
        }
    }

    private void m(long $$0) {
        if (!this.l.remove($$0)) {
            ((fkm)this.d).a($$0, this.g($$0));
            this.e.add($$0);
            this.h($$0);
            this.f($$0);
            this.h = true;
        }
    }

    private void n(long $$0) {
        this.l.add($$0);
        this.h = true;
    }

    protected void b() {
        if (!this.e.isEmpty()) {
            Object $$0 = ((fkm)this.d).b();
            ((fkm)$$0).d();
            this.c = $$0;
            this.e.clear();
        }
        if (!this.f.isEmpty()) {
            LongIterator $$1 = this.f.iterator();
            while ($$1.hasNext()) {
                long $$2 = $$1.nextLong();
                this.a.a(this.i, jw.a($$2));
            }
            this.f.clear();
        }
    }

    public b l(long $$0) {
        return fkp$a.c(this.b.get($$0));
    }

    protected static class a {
        public static final byte a = 0;
        private static final int b = 0;
        private static final int c = 26;
        private static final byte d = 32;
        private static final byte e = 31;

        protected a() {
        }

        public static byte a(byte $$0, boolean $$1) {
            return (byte)($$1 ? $$0 | 0x20 : $$0 & 0xFFFFFFDF);
        }

        public static byte a(byte $$0, int $$1) {
            if ($$1 < 0 || $$1 > 26) {
                throw new IllegalArgumentException("Neighbor count was not within range [0; 26]");
            }
            return (byte)($$0 & 0xFFFFFFE0 | $$1 & 0x1F);
        }

        public static boolean a(byte $$0) {
            return ($$0 & 0x20) != 0;
        }

        public static int b(byte $$0) {
            return $$0 & 0x1F;
        }

        public static b c(byte $$0) {
            if ($$0 == 0) {
                return fkp$b.a;
            }
            if (fkp$a.a($$0)) {
                return fkp$b.c;
            }
            return fkp$b.b;
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b("2");
        public static final /* enum */ b b = new b("1");
        public static final /* enum */ b c = new b("0");
        private final String d;
        private static final /* synthetic */ b[] e;

        public static b[] values() {
            return (b[])e.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0) {
            this.d = $$0;
        }

        public String a() {
            return this.d;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c};
        }

        static {
            e = fkp$b.b();
        }
    }
}

