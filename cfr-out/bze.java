/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  it.unimi.dsi.fastutil.longs.LongList
 *  it.unimi.dsi.fastutil.objects.Object2LongMap
 *  it.unimi.dsi.fastutil.objects.Object2LongMaps
 *  it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  org.apache.commons.lang3.tuple.Pair
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongMaps;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.Pair;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class bze
implements bzj {
    private static final long a = Duration.ofMillis(100L).toNanos();
    private static final Logger c = LogUtils.getLogger();
    private final List<String> d = Lists.newArrayList();
    private final LongList e = new LongArrayList();
    private final Map<String, a> f = Maps.newHashMap();
    private final IntSupplier g;
    private final LongSupplier h;
    private final long i;
    private final int j;
    private String k = "";
    private boolean l;
    private @Nullable a m;
    private final BooleanSupplier n;
    private final Set<Pair<String, caw>> o = new ObjectArraySet();

    public bze(LongSupplier $$0, IntSupplier $$1, BooleanSupplier $$2) {
        this.i = $$0.getAsLong();
        this.h = $$0;
        this.j = $$1.getAsInt();
        this.g = $$1;
        this.n = $$2;
    }

    @Override
    public void a() {
        if (this.l) {
            c.error("Profiler tick already started - missing endTick()?");
            return;
        }
        this.l = true;
        this.k = "";
        this.d.clear();
        this.a("root");
    }

    @Override
    public void b() {
        if (!this.l) {
            c.error("Profiler tick already ended - missing startTick()?");
            return;
        }
        this.c();
        this.l = false;
        if (!this.k.isEmpty()) {
            c.error("Profiler tick ended before path was fully popped (remainder: '{}'). Mismatched push/pop?", LogUtils.defer(() -> bzk.b(this.k)));
        }
    }

    @Override
    public void a(String $$0) {
        if (!this.l) {
            c.error("Cannot push '{}' to profiler if profiler tick hasn't started - missing startTick()?", (Object)$$0);
            return;
        }
        if (!this.k.isEmpty()) {
            this.k = this.k + "\u001e";
        }
        this.k = this.k + $$0;
        this.d.add(this.k);
        this.e.add(bhs.d());
        this.m = null;
    }

    @Override
    public void a(Supplier<String> $$0) {
        this.a($$0.get());
    }

    @Override
    public void a(caw $$0) {
        this.o.add((Pair<String, caw>)Pair.of((Object)this.k, (Object)((Object)$$0)));
    }

    @Override
    public void c() {
        if (!this.l) {
            c.error("Cannot pop from profiler if profiler tick hasn't started - missing startTick()?");
            return;
        }
        if (this.e.isEmpty()) {
            c.error("Tried to pop one too many times! Mismatched push() and pop()?");
            return;
        }
        long $$0 = bhs.d();
        long $$1 = this.e.removeLong(this.e.size() - 1);
        this.d.removeLast();
        long $$2 = $$0 - $$1;
        a $$3 = this.f();
        $$3.c += $$2;
        ++$$3.d;
        $$3.a = Math.max($$3.a, $$2);
        $$3.b = Math.min($$3.b, $$2);
        if ($$2 > a && !this.n.getAsBoolean()) {
            c.warn("Something's taking too long! '{}' took aprox {} ms", LogUtils.defer(() -> bzk.b(this.k)), LogUtils.defer(() -> (double)$$2 / 1000000.0));
        }
        this.k = this.d.isEmpty() ? "" : this.d.getLast();
        this.m = null;
    }

    @Override
    public void b(String $$0) {
        this.c();
        this.a($$0);
    }

    @Override
    public void b(Supplier<String> $$0) {
        this.c();
        this.a($$0);
    }

    private a f() {
        if (this.m == null) {
            this.m = this.f.computeIfAbsent(this.k, $$0 -> new a());
        }
        return this.m;
    }

    @Override
    public void a(String $$0, int $$1) {
        this.f().e.addTo((Object)$$0, (long)$$1);
    }

    @Override
    public void a(Supplier<String> $$0, int $$1) {
        this.f().e.addTo((Object)$$0.get(), (long)$$1);
    }

    @Override
    public bzk d() {
        return new bzh(this.f, this.i, this.j, this.h.getAsLong(), this.g.getAsInt());
    }

    @Override
    public @Nullable a c(String $$0) {
        return this.f.get($$0);
    }

    @Override
    public Set<Pair<String, caw>> e() {
        return this.o;
    }

    public static class a
    implements bzn {
        long a = Long.MIN_VALUE;
        long b = Long.MAX_VALUE;
        long c;
        long d;
        final Object2LongOpenHashMap<String> e = new Object2LongOpenHashMap();

        @Override
        public long a() {
            return this.c;
        }

        @Override
        public long b() {
            return this.a;
        }

        @Override
        public long c() {
            return this.d;
        }

        @Override
        public Object2LongMap<String> d() {
            return Object2LongMaps.unmodifiable(this.e);
        }
    }
}

