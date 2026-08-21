/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ByteMaps
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2IntMap
 *  it.unimi.dsi.fastutil.longs.Long2IntMaps
 *  it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongConsumer
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMaps;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongConsumer;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class aws {
    private static final Logger a = LogUtils.getLogger();
    static final int c = awh.a(awt.d);
    final Long2ObjectMap<ObjectSet<axg>> d = new Long2ObjectOpenHashMap();
    private final aww e;
    private final axi f;
    final dxl g;
    private final a h = new a(8);
    private final b i = new b(32);
    protected final Set<awg> b = new ReferenceOpenHashSet();
    final axk j;
    final LongSet k = new LongOpenHashSet();
    final Executor l;
    private int m = 10;

    protected aws(dxl $$0, Executor $$1, Executor $$2) {
        this.g = $$0;
        this.e = new aww(this, $$0);
        this.f = new axi($$0);
        cbx<Runnable> $$3 = cbx.a("player ticket throttler", $$2);
        this.j = new axk($$3, $$1, 4);
        this.l = $$2;
    }

    protected abstract boolean a(long var1);

    protected abstract @Nullable awg b(long var1);

    protected abstract @Nullable awg a(long var1, int var3, @Nullable awg var4, int var5);

    public boolean a(awj $$02) {
        boolean $$2;
        this.h.a();
        this.f.a();
        this.i.a();
        int $$12 = Integer.MAX_VALUE - this.e.a(Integer.MAX_VALUE);
        boolean bl2 = $$2 = $$12 != 0;
        if ($$2 && w.M) {
            a.debug("DMU {}", (Object)$$12);
        }
        if (!this.b.isEmpty()) {
            for (awg $$3 : this.b) {
                $$3.a($$02);
            }
            for (awg $$4 : this.b) {
                $$4.a($$02, this.l);
            }
            this.b.clear();
            return true;
        }
        if (!this.k.isEmpty()) {
            LongIterator $$5 = this.k.iterator();
            while ($$5.hasNext()) {
                long $$6 = $$5.nextLong();
                if (!this.g.a($$6).stream().anyMatch($$0 -> $$0.a() == axm.j)) continue;
                awg $$7 = $$02.a($$6);
                if ($$7 == null) {
                    throw new IllegalStateException();
                }
                CompletableFuture<awk<eqq>> $$8 = $$7.b();
                $$8.thenAccept($$1 -> this.l.execute(() -> this.j.a($$6, () -> {}, false)));
            }
            this.k.clear();
        }
        return $$2;
    }

    public void a(jw $$02, axg $$1) {
        dvu $$2 = $$02.r();
        long $$3 = $$2.b();
        ((ObjectSet)this.d.computeIfAbsent($$3, $$0 -> new ObjectOpenHashSet())).add((Object)$$1);
        this.h.b($$3, 0, true);
        this.i.b($$3, 0, true);
        this.g.a(new axl(axm.k, this.e()), $$2);
    }

    public void b(jw $$0, axg $$1) {
        dvu $$2 = $$0.r();
        long $$3 = $$2.b();
        ObjectSet $$4 = (ObjectSet)this.d.get($$3);
        $$4.remove((Object)$$1);
        if ($$4.isEmpty()) {
            this.d.remove($$3);
            this.h.b($$3, Integer.MAX_VALUE, false);
            this.i.b($$3, Integer.MAX_VALUE, false);
            this.g.b(new axl(axm.k, this.e()), $$2);
        }
    }

    private int e() {
        return Math.max(0, awh.a(awt.d) - this.m);
    }

    public boolean c(long $$0) {
        return awh.d(this.f.c($$0));
    }

    public boolean d(long $$0) {
        return awh.e(this.f.c($$0));
    }

    public int a(long $$0, boolean $$1) {
        if ($$1) {
            return this.f.c($$0);
        }
        return this.e.c($$0);
    }

    protected void a(int $$0) {
        this.i.a($$0);
    }

    public void b(int $$0) {
        if ($$0 != this.m) {
            this.m = $$0;
            this.g.a(this.e(), axm.k);
        }
    }

    public int a() {
        this.h.a();
        return this.h.a.size();
    }

    public bhp e(long $$0) {
        this.h.a();
        int $$1 = this.h.c($$0);
        if ($$1 <= dwz.c) {
            return bhp.a;
        }
        if ($$1 > 8) {
            return bhp.b;
        }
        return bhp.c;
    }

    public void a(LongConsumer $$0) {
        for (Long2ByteMap.Entry $$1 : Long2ByteMaps.fastIterable((Long2ByteMap)this.f.b)) {
            byte $$2 = $$1.getByteValue();
            long $$3 = $$1.getLongKey();
            if (!awh.d($$2)) continue;
            $$0.accept($$3);
        }
    }

    public LongIterator b() {
        this.h.a();
        return this.h.a.keySet().iterator();
    }

    public String c() {
        return this.j.d();
    }

    public boolean d() {
        return this.g.c();
    }

    class a
    extends awn {
        protected final Long2ByteMap a;
        protected final int b;

        protected a(int $$0) {
            super($$0 + 2, 16, 256);
            this.a = new Long2ByteOpenHashMap();
            this.b = $$0;
            this.a.defaultReturnValue((byte)($$0 + 2));
        }

        @Override
        protected int c(long $$0) {
            return this.a.get($$0);
        }

        @Override
        protected void a(long $$0, int $$1) {
            byte $$3;
            if ($$1 > this.b) {
                byte $$2 = this.a.remove($$0);
            } else {
                $$3 = this.a.put($$0, (byte)$$1);
            }
            this.a($$0, (int)$$3, $$1);
        }

        protected void a(long $$0, int $$1, int $$2) {
        }

        @Override
        protected int b(long $$0) {
            return this.f($$0) ? 0 : Integer.MAX_VALUE;
        }

        private boolean f(long $$0) {
            ObjectSet $$1 = (ObjectSet)aws.this.d.get($$0);
            return $$1 != null && !$$1.isEmpty();
        }

        public void a() {
            this.b(Integer.MAX_VALUE);
        }
    }

    class b
    extends a {
        private int g;
        private final Long2IntMap h;
        private final LongSet i;

        protected b(int $$0) {
            super($$0);
            this.h = Long2IntMaps.synchronize((Long2IntMap)new Long2IntOpenHashMap());
            this.i = new LongOpenHashSet();
            this.g = 0;
            this.h.defaultReturnValue($$0 + 2);
        }

        @Override
        protected void a(long $$0, int $$1, int $$2) {
            this.i.add($$0);
        }

        public void a(int $$0) {
            for (Long2ByteMap.Entry $$1 : this.a.long2ByteEntrySet()) {
                byte $$2 = $$1.getByteValue();
                long $$3 = $$1.getLongKey();
                this.a($$3, $$2, this.c($$2), $$2 <= $$0);
            }
            this.g = $$0;
        }

        private void a(long $$0, int $$1, boolean $$2, boolean $$3) {
            if ($$2 != $$3) {
                axl $$4 = new axl(axm.j, c);
                if ($$3) {
                    aws.this.j.a(() -> aws.this.l.execute(() -> {
                        if (this.c(this.c($$0))) {
                            aws.this.g.a($$0, $$4);
                            aws.this.k.add($$0);
                        } else {
                            aws.this.j.a($$0, () -> {}, false);
                        }
                    }), $$0, () -> $$1);
                } else {
                    aws.this.j.a($$0, () -> aws.this.l.execute(() -> aws.this.g.b($$0, $$4)), true);
                }
            }
        }

        @Override
        public void a() {
            super.a();
            if (!this.i.isEmpty()) {
                LongIterator $$0 = this.i.iterator();
                while ($$0.hasNext()) {
                    int $$3;
                    long $$12 = $$0.nextLong();
                    int $$2 = this.h.get($$12);
                    if ($$2 == ($$3 = this.c($$12))) continue;
                    aws.this.j.onLevelChange(new dvu($$12), () -> this.h.get($$12), $$3, $$1 -> {
                        if ($$1 >= this.h.defaultReturnValue()) {
                            this.h.remove($$12);
                        } else {
                            this.h.put($$12, $$1);
                        }
                    });
                    this.a($$12, $$3, this.c($$2), this.c($$3));
                }
                this.i.clear();
            }
        }

        private boolean c(int $$0) {
            return $$0 <= this.g;
        }
    }
}

