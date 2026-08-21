/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.ints.IntArraySet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Suppliers;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;

public abstract class eqg {
    public static final Codec<eqg> a = mi.aa.q().dispatchStable(eqg::b, Function.identity());
    protected final dxs b;
    private final Supplier<List<dxy.b>> c;
    private final Function<jd<dxo>, dxp> d;

    public eqg(dxs $$02) {
        this($$02, $$0 -> ((dxo)$$0.a()).c());
    }

    public eqg(dxs $$0, Function<jd<dxo>, dxp> $$1) {
        this.b = $$0;
        this.d = $$1;
        this.c = Suppliers.memoize(() -> dxy.a(List.copyOf($$0.c()), (T $$1) -> ((dxp)$$1.apply((jd<dxo>)$$1)).c(), true));
    }

    public void a() {
        this.c.get();
    }

    protected abstract MapCodec<? extends eqg> b();

    public eqh a(jf<ffu> $$0, eve $$1, long $$2) {
        return eqh.a($$1, $$2, this.b, $$0);
    }

    public Optional<amt<MapCodec<? extends eqg>>> c() {
        return mi.aa.d(this.b());
    }

    public CompletableFuture<eqf> a(eve $$0, evs $$1, dxk $$2, eqf $$3) {
        return CompletableFuture.supplyAsync(() -> {
            $$3.a(this.b, $$0.b());
            return $$3;
        }, bhs.h().a("init_biomes"));
    }

    public abstract void a(axn var1, long var2, eve var4, dxq var5, dxk var6, eqf var7);

    public @Nullable Pair<is, jd<ffo>> a(axf $$02, jh<ffo> $$1, is $$2, int $$3, boolean $$4) {
        if (w.aD) {
            return null;
        }
        eqh $$5 = $$02.p().h();
        Object2ObjectArrayMap $$6 = new Object2ObjectArrayMap();
        for (jd jd2 : $$1) {
            for (fgl $$8 : $$5.a(jd2)) {
                $$6.computeIfAbsent($$8, $$0 -> new ObjectArraySet()).add(jd2);
            }
        }
        if ($$6.isEmpty()) {
            return null;
        }
        Pair<is, jd<ffo>> $$9 = null;
        double d2 = Double.MAX_VALUE;
        dxk $$11 = $$02.b();
        ArrayList $$12 = new ArrayList($$6.size());
        for (Map.Entry $$13 : $$6.entrySet()) {
            fgl $$14 = (fgl)$$13.getKey();
            if ($$14 instanceof fgi) {
                is is2;
                double $$18;
                fgi $$15 = (fgi)$$14;
                Pair<is, jd<ffo>> $$16 = this.a((Set)$$13.getValue(), $$02, $$11, $$2, $$4, $$15);
                if ($$16 == null || !(($$18 = $$2.j(is2 = (is)$$16.getFirst())) < d2)) continue;
                d2 = $$18;
                $$9 = $$16;
                continue;
            }
            if (!($$14 instanceof fgj)) continue;
            $$12.add($$13);
        }
        if (!$$12.isEmpty()) {
            int $$19 = jw.a($$2.u());
            int $$20 = jw.a($$2.w());
            for (int $$21 = 0; $$21 <= $$3; ++$$21) {
                boolean $$22 = false;
                for (Map.Entry entry : $$12) {
                    fgj $$24 = (fgj)entry.getKey();
                    Pair<is, jd<ffo>> $$25 = eqg.a((Set)entry.getValue(), $$02, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                    if ($$25 == null) continue;
                    $$22 = true;
                    double $$26 = $$2.j((jy)$$25.getFirst());
                    if (!($$26 < d2)) continue;
                    d2 = $$26;
                    $$9 = $$25;
                }
                if (!$$22) continue;
                return $$9;
            }
        }
        return $$9;
    }

    private @Nullable Pair<is, jd<ffo>> a(Set<jd<ffo>> $$0, axf $$1, dxk $$2, is $$3, boolean $$4, fgi $$5) {
        List<dvu> $$6 = $$1.p().h().a($$5);
        if ($$6 == null) {
            throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
        }
        Pair<is, jd<ffo>> $$7 = null;
        double $$8 = Double.MAX_VALUE;
        is.a $$9 = new is.a();
        for (dvu $$10 : $$6) {
            Pair<is, jd<ffo>> $$13;
            $$9.d(jw.a($$10.h, 8), 32, jw.a($$10.i, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if (!$$12 || ($$13 = eqg.a($$0, $$1, $$2, $$4, $$5, $$10)) == null) continue;
            $$7 = $$13;
            $$8 = $$11;
        }
        return $$7;
    }

    private static @Nullable Pair<is, jd<ffo>> a(Set<jd<ffo>> $$0, dwr $$1, dxk $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, fgj $$8) {
        int $$9 = $$8.a();
        for (int $$10 = -$$5; $$10 <= $$5; ++$$10) {
            boolean $$11 = $$10 == -$$5 || $$10 == $$5;
            for (int $$12 = -$$5; $$12 <= $$5; ++$$12) {
                int $$15;
                int $$14;
                dvu $$16;
                Pair<is, jd<ffo>> $$17;
                boolean $$13;
                boolean bl2 = $$13 = $$12 == -$$5 || $$12 == $$5;
                if (!$$11 && !$$13 || ($$17 = eqg.a($$0, $$1, $$2, $$6, $$8, $$16 = $$8.a($$7, $$14 = $$3 + $$9 * $$10, $$15 = $$4 + $$9 * $$12))) == null) continue;
                return $$17;
            }
        }
        return null;
    }

    private static @Nullable Pair<is, jd<ffo>> a(Set<jd<ffo>> $$0, dwr $$1, dxk $$2, boolean $$3, fgl $$4, dvu $$5) {
        for (jd<ffo> $$6 : $$0) {
            ffq $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
            if ($$7 == ffq.b) continue;
            if (!$$3 && $$7 == ffq.a) {
                return Pair.of((Object)$$4.a($$5), $$6);
            }
            eqf $$8 = $$1.a($$5.h, $$5.i, erj.d);
            ffw $$9 = $$2.a(jw.a($$8), $$6.a(), $$8);
            if ($$9 == null || !$$9.b() || $$3 && !eqg.a($$2, $$9)) continue;
            return Pair.of((Object)$$4.a($$9.c()), $$6);
        }
        return null;
    }

    private static boolean a(dxk $$0, ffw $$1) {
        if ($$1.d()) {
            $$0.a($$1);
            return true;
        }
        return false;
    }

    public void a(dxn $$02, eqf $$1, dxk $$2) {
        dvu $$3 = $$1.f();
        if (w.a($$3)) {
            return;
        }
        jw $$4 = jw.a($$3, $$02.ay());
        is $$52 = $$4.j();
        jq<ffo> $$6 = $$02.J_().f(mj.bs);
        Map<Integer, List<ffo>> $$7 = $$6.s().collect(Collectors.groupingBy($$0 -> $$0.c().ordinal()));
        List<dxy.b> $$8 = this.c.get();
        evp $$9 = new evp(new evr(evf.a()));
        long $$10 = $$9.a($$02.J(), $$52.u(), $$52.w());
        ObjectArraySet $$11 = new ObjectArraySet();
        dvu.a($$4.r(), 1).forEach(arg_0 -> eqg.a($$02, (Set)$$11, arg_0));
        $$11.retainAll(this.b.c());
        int $$12 = $$8.size();
        try {
            jq<fes> $$13 = $$02.J_().f(mj.bp);
            int $$14 = Math.max(eum.a.values().length, $$12);
            for (int $$15 = 0; $$15 < $$14; ++$$15) {
                int $$16 = 0;
                if ($$2.a()) {
                    List $$17 = $$7.getOrDefault($$15, Collections.emptyList());
                    for (ffo $$18 : $$17) {
                        $$9.b($$10, $$16, $$15);
                        Supplier<String> $$19 = () -> $$6.d($$18).map(Object::toString).orElseGet($$18::toString);
                        try {
                            $$02.a($$19);
                            $$2.a($$4, $$18).forEach($$5 -> $$5.a($$02, $$2, this, $$9, eqg.a($$1), $$3));
                        }
                        catch (Exception $$20) {
                            m $$21 = m.a($$20, "Feature placement");
                            $$21.a("Feature").a("Description", $$19::get);
                            throw new v($$21);
                        }
                        ++$$16;
                    }
                }
                if ($$15 >= $$12) continue;
                IntArraySet $$22 = new IntArraySet();
                for (jd $$23 : $$11) {
                    List<jh<fes>> $$24 = this.d.apply($$23).c();
                    if ($$15 >= $$24.size()) continue;
                    jh<fes> $$25 = $$24.get($$15);
                    dxy.b $$26 = $$8.get($$15);
                    $$25.a().map(jd::a).forEach(arg_0 -> eqg.a((IntSet)$$22, $$26, arg_0));
                }
                int $$27 = $$22.size();
                int[] $$28 = $$22.toIntArray();
                Arrays.sort($$28);
                dxy.b $$29 = $$8.get($$15);
                for (int $$30 = 0; $$30 < $$27; ++$$30) {
                    int $$31 = $$28[$$30];
                    fes $$32 = $$29.a().get($$31);
                    Supplier<String> $$33 = () -> $$13.d($$32).map(Object::toString).orElseGet($$32::toString);
                    $$9.b($$10, $$31, $$15);
                    try {
                        $$02.a($$33);
                        $$32.b($$02, this, $$9, $$52);
                        continue;
                    }
                    catch (Exception $$34) {
                        m $$35 = m.a($$34, "Feature placement");
                        $$35.a("Feature").a("Description", $$33::get);
                        throw new v($$35);
                    }
                }
            }
            $$02.a((Supplier<String>)null);
            if (w.aP) {
                exy.a($$02.a());
            }
        }
        catch (Exception $$36) {
            m $$37 = m.a($$36, "Biome decoration");
            $$37.a("Generation").a("CenterX", $$3.h).a("CenterZ", $$3.i).a("Decoration Seed", $$10);
            throw new v($$37);
        }
    }

    private static ffg a(eqf $$0) {
        dvu $$1 = $$0.f();
        int $$2 = $$1.e();
        int $$3 = $$1.f();
        dwq $$4 = $$0.B();
        int $$5 = $$4.K_() + 1;
        int $$6 = $$4.aw();
        return new ffg($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
    }

    public abstract void a(axn var1, dxk var2, eve var3, eqf var4);

    public abstract void a(axn var1);

    public int a(dwq $$0) {
        return 64;
    }

    public dxs d() {
        return this.b;
    }

    public abstract int e();

    public cbn<dya.c> a(jd<dxo> $$0, dxk $$12, cho $$22, is $$3) {
        Map<ffo, LongSet> $$4 = $$12.b($$3);
        for (Map.Entry<ffo, LongSet> $$5 : $$4.entrySet()) {
            ffo $$6 = $$5.getKey();
            ffv $$7 = $$6.b().get($$22);
            if ($$7 == null) continue;
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<ffw> $$9 = $$7.a() == ffv.a.a ? $$2 -> $$12.a($$3, (ffw)$$2) : $$1 -> $$1.a().b($$3);
            $$12.a($$6, $$5.getValue(), (ffw $$2) -> {
                if ($$8.isFalse() && $$9.test((ffw)$$2)) {
                    $$8.setTrue();
                }
            });
            if (!$$8.isTrue()) continue;
            return $$7.b();
        }
        return $$0.a().a().a($$22);
    }

    public void a(jr $$0, eqh $$1, dxk $$2, eqf $$3, fjr $$4, amt<dwo> $$5) {
        if (w.aC) {
            return;
        }
        dvu $$6 = $$3.f();
        jw $$7 = jw.a($$3);
        eve $$8 = $$1.c();
        $$1.a().forEach($$9 -> {
            fgl $$10 = ((ffu)$$9.a()).b();
            List<ffu.a> $$11 = ((ffu)$$9.a()).a();
            for (ffu.a $$12 : $$11) {
                ffw $$13 = $$2.a($$7, $$12.a().a(), $$3);
                if ($$13 == null || !$$13.b()) continue;
                return;
            }
            if (!$$10.b($$1, $$4.h, $$4.i)) {
                return;
            }
            if ($$11.size() == 1) {
                this.a($$11.get(0), $$2, $$0, $$8, $$4, $$1.d(), $$3, $$6, $$7, $$5);
                return;
            }
            ArrayList<ffu.a> $$14 = new ArrayList<ffu.a>($$11.size());
            $$14.addAll($$11);
            evp $$15 = new evp(new eur(0L));
            $$15.c($$1.d(), $$4.h, $$4.i);
            int $$16 = 0;
            for (ffu.a $$17 : $$14) {
                $$16 += $$17.b();
            }
            while (!$$14.isEmpty()) {
                ffu.a $$20;
                int $$18 = $$15.a($$16);
                int $$19 = 0;
                Iterator iterator = $$14.iterator();
                while (iterator.hasNext() && ($$18 -= ($$20 = (ffu.a)iterator.next()).b()) >= 0) {
                    ++$$19;
                }
                ffu.a $$21 = (ffu.a)$$14.get($$19);
                if (this.a($$21, $$2, $$0, $$8, $$4, $$1.d(), $$3, $$6, $$7, $$5)) {
                    return;
                }
                $$14.remove($$19);
                $$16 -= $$21.b();
            }
        });
    }

    private boolean a(ffu.a $$0, dxk $$1, jr $$2, eve $$3, fjr $$4, long $$5, eqf $$6, dvu $$7, jw $$8, amt<dwo> $$9) {
        ffo $$10 = $$0.a().a();
        int $$11 = eqg.a($$1, $$6, $$8, $$10);
        jh<dxo> $$12 = $$10.a();
        Predicate<jd<dxo>> $$13 = $$12::a;
        ffw $$14 = $$10.a($$0.a(), $$9, $$2, this, this.b, $$3, $$4, $$5, $$7, $$11, $$6, $$13);
        if ($$14.b()) {
            $$1.a($$8, $$10, $$14, (ere)$$6);
            return true;
        }
        return false;
    }

    private static int a(dxk $$0, eqf $$1, jw $$2, ffo $$3) {
        ffw $$4 = $$0.a($$2, $$3, $$1);
        return $$4 != null ? $$4.f() : 0;
    }

    public void a(dxn $$0, dxk $$1, eqf $$2) {
        int $$3 = 8;
        dvu $$4 = $$2.f();
        int $$5 = $$4.h;
        int $$6 = $$4.i;
        int $$7 = $$4.e();
        int $$8 = $$4.f();
        jw $$9 = jw.a($$2);
        for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; ++$$10) {
            for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; ++$$11) {
                long $$12 = dvu.d($$10, $$11);
                for (ffw $$13 : $$0.a($$10, $$11).g().values()) {
                    try {
                        if (!$$13.b() || !$$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) continue;
                        $$1.a($$9, $$13.h(), $$12, (ere)$$2);
                    }
                    catch (Exception $$14) {
                        m $$15 = m.a($$14, "Generating structure reference");
                        n $$16 = $$15.a("Structure");
                        Optional<jq<ffo>> $$17 = $$0.J_().a(mj.bs);
                        $$16.a("Id", () -> $$17.map($$1 -> $$1.b($$13.h()).toString()).orElse("UNKNOWN"));
                        $$16.a("Name", () -> mi.R.b($$13.h().e()).toString());
                        $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                        throw new v($$15);
                    }
                }
            }
        }
    }

    public abstract CompletableFuture<eqf> a(evs var1, eve var2, dxk var3, eqf var4);

    public abstract int f();

    public abstract int g();

    public abstract int a(int var1, int var2, euq.a var3, dwq var4, eve var5);

    public abstract dxa a(int var1, int var2, dwq var3, eve var4);

    public int b(int $$0, int $$1, euq.a $$2, dwq $$3, eve $$4) {
        return this.a($$0, $$1, $$2, $$3, $$4);
    }

    public int c(int $$0, int $$1, euq.a $$2, dwq $$3, eve $$4) {
        return this.a($$0, $$1, $$2, $$3, $$4) - 1;
    }

    public abstract void a(List<String> var1, eve var2, is var3);

    @Deprecated
    public dxp a(jd<dxo> $$0) {
        return this.d.apply($$0);
    }

    private static /* synthetic */ void a(IntSet $$0, dxy.b $$1, fes $$2) {
        $$0.add($$1.b().applyAsInt($$2));
    }

    private static /* synthetic */ void a(dxn $$0, Set $$1, dvu $$2) {
        eqf $$3 = $$0.a($$2.h, $$2.i);
        for (eqr $$4 : $$3.d()) {
            $$4.i().a($$1::add);
        }
    }
}

