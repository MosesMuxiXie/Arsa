/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.shorts.ShortArrayList
 *  it.unimi.dsi.fastutil.shorts.ShortList
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class eqf
implements dxq.a,
eqs,
ere {
    public static final int a = -1;
    private static final Logger m = LogUtils.getLogger();
    private static final LongSet n = new LongOpenHashSet();
    protected final @Nullable ShortList[] b;
    private volatile boolean o;
    private volatile boolean p;
    protected final dvu c;
    private long q;
    @Deprecated
    private @Nullable dxp r;
    protected @Nullable euu d;
    protected final erf e;
    protected @Nullable evt f;
    protected final Map<euq.a, euq> g = Maps.newEnumMap(euq.a.class);
    protected fkl h;
    private final Map<ffo, ffw> s = Maps.newHashMap();
    private final Map<ffo, LongSet> t = Maps.newHashMap();
    protected final Map<is, uz> i = Maps.newHashMap();
    protected final Map<is, elb> j = new Object2ObjectOpenHashMap();
    protected final dwq k;
    protected final eqr[] l;

    public eqf(dvu $$0, erf $$1, dwq $$2, eqz $$3, long $$4, eqr @Nullable [] $$5, @Nullable evt $$6) {
        this.c = $$0;
        this.e = $$1;
        this.k = $$2;
        this.l = new eqr[$$2.ax()];
        this.q = $$4;
        this.b = new ShortList[$$2.ax()];
        this.f = $$6;
        this.h = new fkl($$2);
        if ($$5 != null) {
            if (this.l.length == $$5.length) {
                System.arraycopy($$5, 0, this.l, 0, this.l.length);
            } else {
                m.warn("Could not set level chunk sections, array length is {} instead of {}", (Object)$$5.length, (Object)this.l.length);
            }
        }
        eqf.a($$3, this.l);
    }

    private static void a(eqz $$0, eqr[] $$1) {
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            if ($$1[$$2] != null) continue;
            $$1[$$2] = new eqr($$0);
        }
    }

    public etn a(int $$0) {
        return etn.a;
    }

    public @Nullable eoh a(is $$0, eoh $$1) {
        return this.a($$0, $$1, 3);
    }

    public abstract @Nullable eoh a(is var1, eoh var2, @dzq.b int var3);

    public abstract void a(elb var1);

    public abstract void a(cgk var1);

    public int a() {
        eqr[] $$0 = this.d();
        for (int $$1 = $$0.length - 1; $$1 >= 0; --$$1) {
            eqr $$2 = $$0[$$1];
            if ($$2.c()) continue;
            return $$1;
        }
        return -1;
    }

    @Deprecated(forRemoval=true)
    public int b() {
        int $$0 = this.a();
        return $$0 == -1 ? this.K_() : jw.c(this.h($$0));
    }

    public Set<is> c() {
        HashSet $$0 = Sets.newHashSet(this.i.keySet());
        $$0.addAll(this.j.keySet());
        return $$0;
    }

    public eqr[] d() {
        return this.l;
    }

    public eqr b(int $$0) {
        return this.d()[$$0];
    }

    public Collection<Map.Entry<euq.a, euq>> e() {
        return Collections.unmodifiableSet(this.g.entrySet());
    }

    public void a(euq.a $$0, long[] $$1) {
        this.a($$0).a(this, $$0, $$1);
    }

    public euq a(euq.a $$02) {
        return this.g.computeIfAbsent($$02, $$0 -> new euq(this, (euq.a)$$0));
    }

    public boolean b(euq.a $$0) {
        return this.g.get($$0) != null;
    }

    public int a(euq.a $$0, int $$1, int $$2) {
        euq $$3 = this.g.get($$0);
        if ($$3 == null) {
            if (w.aX && this instanceof eqq) {
                m.error("Unprimed heightmap: {} {} {}", new Object[]{$$0, $$1, $$2});
            }
            euq.a(this, EnumSet.of($$0));
            $$3 = this.g.get($$0);
        }
        return $$3.a($$1 & 0xF, $$2 & 0xF) - 1;
    }

    public dvu f() {
        return this.c;
    }

    @Override
    public @Nullable ffw a(ffo $$0) {
        return this.s.get($$0);
    }

    @Override
    public void a(ffo $$0, ffw $$1) {
        this.s.put($$0, $$1);
        this.i();
    }

    public Map<ffo, ffw> g() {
        return Collections.unmodifiableMap(this.s);
    }

    public void a(Map<ffo, ffw> $$0) {
        this.s.clear();
        this.s.putAll($$0);
        this.i();
    }

    @Override
    public LongSet b(ffo $$0) {
        return this.t.getOrDefault($$0, n);
    }

    @Override
    public void a(ffo $$02, long $$1) {
        this.t.computeIfAbsent($$02, $$0 -> new LongOpenHashSet()).add($$1);
        this.i();
    }

    @Override
    public Map<ffo, LongSet> h() {
        return Collections.unmodifiableMap(this.t);
    }

    @Override
    public void b(Map<ffo, LongSet> $$0) {
        this.t.clear();
        this.t.putAll($$0);
        this.i();
    }

    public boolean a(int $$0, int $$1) {
        if ($$0 < this.K_()) {
            $$0 = this.K_();
        }
        if ($$1 > this.aw()) {
            $$1 = this.aw();
        }
        for (int $$2 = $$0; $$2 <= $$1; $$2 += 16) {
            if (this.b(this.f($$2)).c()) continue;
            return false;
        }
        return true;
    }

    public void i() {
        this.o = true;
    }

    public boolean j() {
        if (this.o) {
            this.o = false;
            return true;
        }
        return false;
    }

    public boolean m() {
        return this.o;
    }

    public abstract erj n();

    public erj o() {
        erj $$0 = this.n();
        eue $$1 = this.z();
        if ($$1 != null) {
            erj $$2 = $$1.a();
            return erj.a($$2, $$0);
        }
        return $$0;
    }

    public abstract void c(is var1);

    public void e(is $$0) {
        m.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", (Object)$$0);
    }

    public @Nullable ShortList[] p() {
        return this.b;
    }

    public void a(ShortList $$0, int $$1) {
        eqf.a(this.p(), $$1).addAll($$0);
    }

    public void a(uz $$0) {
        is $$1 = elb.a(this.c, $$0);
        if (!this.j.containsKey($$1)) {
            this.i.put($$1, $$0);
        }
    }

    public @Nullable uz f(is $$0) {
        return this.i.get($$0);
    }

    public abstract @Nullable uz a(is var1, jf.a var2);

    @Override
    public final void a(BiConsumer<is, eoh> $$02) {
        this.a((eoh $$0) -> $$0.k() != 0, $$02);
    }

    public void a(Predicate<eoh> $$0, BiConsumer<is, eoh> $$1) {
        is.a $$2 = new is.a();
        for (int $$3 = this.ay(); $$3 <= this.az(); ++$$3) {
            eqr $$4 = this.b(this.g($$3));
            if (!$$4.a($$0)) continue;
            is $$5 = jw.a(this.c, $$3).j();
            for (int $$6 = 0; $$6 < 16; ++$$6) {
                for (int $$7 = 0; $$7 < 16; ++$$7) {
                    for (int $$8 = 0; $$8 < 16; ++$$8) {
                        eoh $$9 = $$4.a($$8, $$6, $$7);
                        if (!$$0.test($$9)) continue;
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                    }
                }
            }
        }
    }

    public abstract fvh<dzq> q();

    public abstract fvh<fla> r();

    public boolean s() {
        return true;
    }

    public abstract b a(long var1);

    public erf t() {
        return this.e;
    }

    public boolean u() {
        return this.f != null;
    }

    public @Nullable evt v() {
        return this.f;
    }

    public long w() {
        return this.q;
    }

    public void b(long $$0) {
        this.q += $$0;
    }

    public void c(long $$0) {
        this.q = $$0;
    }

    public static ShortList a(@Nullable ShortList[] $$0, int $$1) {
        ShortList $$2 = $$0[$$1];
        if ($$2 == null) {
            $$0[$$1] = $$2 = new ShortArrayList();
        }
        return $$2;
    }

    public boolean x() {
        return this.p;
    }

    public void a(boolean $$0) {
        this.p = $$0;
        this.i();
    }

    @Override
    public int K_() {
        return this.k.K_();
    }

    @Override
    public int L_() {
        return this.k.L_();
    }

    public euu a(Function<eqf, euu> $$0) {
        if (this.d == null) {
            this.d = $$0.apply(this);
        }
        return this.d;
    }

    @Deprecated
    public dxp a(Supplier<dxp> $$0) {
        if (this.r == null) {
            this.r = $$0.get();
        }
        return this.r;
    }

    @Override
    public jd<dxo> getNoiseBiome(int $$0, int $$1, int $$2) {
        try {
            int $$3 = jo.a(this.K_());
            int $$4 = $$3 + jo.a(this.L_()) - 1;
            int $$5 = bgj.a($$1, $$3, $$4);
            int $$6 = this.f(jo.c($$5));
            return this.l[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
        }
        catch (Throwable $$7) {
            m $$8 = m.a($$7, "Getting biome");
            n $$9 = $$8.a("Biome being got");
            $$9.a("Location", () -> n.a((dwq)this, $$0, $$1, $$2));
            throw new v($$8);
        }
    }

    public void a(dxr $$0, dxx.f $$1) {
        dvu $$2 = this.f();
        int $$3 = jo.a($$2.e());
        int $$4 = jo.a($$2.f());
        dwq $$5 = this.B();
        for (int $$6 = $$5.ay(); $$6 <= $$5.az(); ++$$6) {
            eqr $$7 = this.b(this.g($$6));
            int $$8 = jo.d($$6);
            $$7.a($$0, $$1, $$3, $$8, $$4);
        }
    }

    public boolean y() {
        return !this.h().isEmpty();
    }

    public @Nullable eue z() {
        return null;
    }

    public boolean A() {
        return this.z() != null;
    }

    public dwq B() {
        return this;
    }

    public void C() {
        this.h.a(this);
    }

    @Override
    public fkl D() {
        return this.h;
    }

    public static bgp.f a(dvu $$0) {
        return new a($$0);
    }

    public bgp.f E() {
        return eqf.a(this.f());
    }

    record a(dvu a) implements bgp.f
    {
        @Override
        public String get() {
            return "chunk@" + String.valueOf(this.a);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "pos", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "pos", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "pos", "a"}, this, $$0);
        }
    }

    public record b(List<fvd<dzq>> a, List<fvd<fla>> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "blocks;fluids", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "blocks;fluids", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "blocks;fluids", "a", "b"}, this, $$0);
        }
    }
}

