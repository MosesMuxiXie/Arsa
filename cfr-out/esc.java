/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.shorts.ShortArrayList
 *  it.unimi.dsi.fastutil.shorts.ShortList
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class esc
extends Record {
    private final eqz h;
    private final dvu i;
    private final int j;
    private final long k;
    private final long l;
    private final erj m;
    private final @Nullable evt.d n;
    private final @Nullable eue o;
    private final erf p;
    private final long @Nullable [] q;
    private final Map<euq.a, long[]> r;
    private final eqf.b s;
    private final @Nullable ShortList[] t;
    private final boolean u;
    private final List<b> v;
    private final List<uz> w;
    private final List<uz> x;
    private final uz y;
    private static final Codec<List<fvd<dzq>>> z = fvd.a(mi.e.q()).listOf();
    private static final Codec<List<fvd<fla>>> A = fvd.a(mi.c.q()).listOf();
    private static final Logger B = LogUtils.getLogger();
    private static final String C = "UpgradeData";
    private static final String D = "block_ticks";
    private static final String E = "fluid_ticks";
    public static final String a = "xPos";
    public static final String b = "zPos";
    public static final String c = "Heightmaps";
    public static final String d = "isLightOn";
    public static final String e = "sections";
    public static final String f = "BlockLight";
    public static final String g = "SkyLight";

    public esc(eqz $$0, dvu $$1, int $$2, long $$3, long $$4, erj $$5, @Nullable evt.d $$6, @Nullable eue $$7, erf $$8, long @Nullable [] $$9, Map<euq.a, long[]> $$10, eqf.b $$11, @Nullable ShortList[] $$12, boolean $$13, List<b> $$14, List<uz> $$15, List<uz> $$16, uz $$17) {
        this.h = $$0;
        this.i = $$1;
        this.j = $$2;
        this.k = $$3;
        this.l = $$4;
        this.m = $$5;
        this.n = $$6;
        this.o = $$7;
        this.p = $$8;
        this.q = $$9;
        this.r = $$10;
        this.s = $$11;
        this.t = $$12;
        this.u = $$13;
        this.v = $$14;
        this.w = $$15;
        this.x = $$16;
        this.y = $$17;
    }

    public static @Nullable esc a(dwq $$0, eqz $$12, uz $$2) {
        if ($$2.i("Status").isEmpty()) {
            return null;
        }
        dvu $$32 = new dvu($$2.b(a, 0), $$2.b(b, 0));
        long $$4 = $$2.b("LastUpdate", 0L);
        long $$5 = $$2.b("InhabitedTime", 0L);
        erj $$6 = $$2.a("Status", erj.o).orElse(erj.c);
        erf $$7 = $$2.m(C).map($$1 -> new erf((uz)$$1, $$0)).orElse(erf.a);
        boolean $$8 = $$2.b(d, false);
        evt.d $$9 = $$2.a("blending_data", evt.d.a).orElse(null);
        eue $$10 = $$2.a("below_zero_retrogen", eue.a).orElse(null);
        long[] $$11 = $$2.l("carving_mask").orElse(null);
        EnumMap<euq.a, long[]> $$122 = new EnumMap<euq.a, long[]>(euq.a.class);
        $$2.m(c).ifPresent($$22 -> {
            for (euq.a $$3 : $$6.e()) {
                $$22.l($$3.a()).ifPresent($$2 -> $$122.put($$3, (long[])$$2));
            }
        });
        List<fvd<dzq>> $$13 = fvd.a($$2.a(D, z).orElse(List.of()), $$32);
        List<fvd<fla>> $$14 = fvd.a($$2.a(E, A).orElse(List.of()), $$32);
        eqf.b $$15 = new eqf.b($$13, $$14);
        vf $$16 = $$2.p("PostProcessing");
        @Nullable ShortList[] $$17 = new ShortList[$$16.size()];
        for (int $$18 = 0; $$18 < $$16.size(); ++$$18) {
            vf $$19 = $$16.e($$18).orElse(null);
            if ($$19 == null || $$19.isEmpty()) continue;
            ShortArrayList $$20 = new ShortArrayList($$19.size());
            for (int $$21 = 0; $$21 < $$19.size(); ++$$21) {
                $$20.add($$19.a($$21, (short)0));
            }
            $$17[$$18] = $$20;
        }
        List<uz> $$222 = $$2.o("entities").stream().flatMap(vf::j).toList();
        List<uz> $$23 = $$2.o("block_entities").stream().flatMap(vf::j).toList();
        uz $$24 = $$2.n("structures");
        vf $$25 = $$2.p(e);
        ArrayList<b> $$26 = new ArrayList<b>($$25.size());
        Codec<era<jd<dxo>>> $$27 = $$12.h();
        Codec<eqy<eoh>> $$28 = $$12.e();
        for (int $$29 = 0; $$29 < $$25.size(); ++$$29) {
            eqr $$36;
            Optional<uz> $$30 = $$25.a($$29);
            if ($$30.isEmpty()) continue;
            uz $$31 = $$30.get();
            byte $$322 = $$31.b("Y", (byte)0);
            if ($$322 >= $$0.ay() && $$322 <= $$0.az()) {
                eqy $$33 = $$31.m("block_states").map($$3 -> (eqy)$$28.parse((DynamicOps)vn.a, $$3).promotePartial($$2 -> esc.a($$32, $$322, $$2)).getOrThrow(a::new)).orElseGet($$12::a);
                era $$34 = $$31.m("biomes").map($$3 -> (era)$$27.parse((DynamicOps)vn.a, $$3).promotePartial($$2 -> esc.a($$32, $$322, $$2)).getOrThrow(a::new)).orElseGet($$12::b);
                eqr $$35 = new eqr($$33, $$34);
            } else {
                $$36 = null;
            }
            eql $$37 = $$31.j(f).map(eql::new).orElse(null);
            eql $$38 = $$31.j(g).map(eql::new).orElse(null);
            $$26.add(new b($$322, $$36, $$37, $$38));
        }
        return new esc($$12, $$32, $$0.ay(), $$4, $$5, $$6, $$9, $$10, $$7, $$11, $$122, $$15, $$17, $$8, $$26, $$222, $$23, $$24);
    }

    public erb a(axf $$0, csx $$1, esa $$2, dvu $$3) {
        erb $$22;
        if (!Objects.equals($$3, this.i)) {
            B.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
            $$0.s().a(this.i, $$3, $$2);
        }
        int $$4 = $$0.ax();
        eqr[] $$5 = new eqr[$$4];
        boolean $$6 = $$0.F_().e();
        axc $$7 = $$0.p();
        fkq $$8 = ((eqj)$$7).r();
        eqz $$9 = $$0.at();
        boolean $$10 = false;
        for (b $$11 : this.v) {
            boolean $$14;
            jw $$12 = jw.a($$3, $$11.a);
            if ($$11.b != null) {
                $$5[$$0.g((int)$$11.a)] = $$11.b;
                $$1.a($$12, $$11.b);
            }
            boolean $$13 = $$11.c != null;
            boolean bl2 = $$14 = $$6 && $$11.d != null;
            if (!$$13 && !$$14) continue;
            if (!$$10) {
                $$8.b($$3, true);
                $$10 = true;
            }
            if ($$13) {
                $$8.a(dww.b, $$12, $$11.c);
            }
            if (!$$14) continue;
            $$8.a(dww.a, $$12, $$11.d);
        }
        ern $$15 = this.m.d();
        if ($$15 == ern.b) {
            fuz<dzq> $$16 = new fuz<dzq>(this.s.a());
            fuz<fla> $$17 = new fuz<fla>(this.s.b());
            eqq $$18 = new eqq($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, esc.a($$0, this.w, this.x), evt.a(this.n));
        } else {
            erb $$21;
            fvc<dzq> $$19 = fvc.a(this.s.a());
            fvc<fla> $$20 = fvc.a(this.s.b());
            $$22 = $$21 = new erb($$3, this.p, $$5, $$19, $$20, $$0, $$9, evt.a(this.n));
            $$22.c(this.l);
            if (this.o != null) {
                $$21.a(this.o);
            }
            $$21.a(this.m);
            if (this.m.a(erj.k)) {
                $$21.a($$8);
            }
        }
        $$22.a(this.u);
        EnumSet<euq.a> $$23 = EnumSet.noneOf(euq.a.class);
        for (euq.a $$24 : ((eqf)$$22).n().e()) {
            long[] $$25 = this.r.get($$24);
            if ($$25 != null) {
                $$22.a($$24, $$25);
                continue;
            }
            $$23.add($$24);
        }
        euq.a($$22, $$23);
        $$22.a(esc.a(fge.a($$0), this.y, $$0.J()));
        $$22.b(esc.a($$0.J_(), $$3, this.y));
        for (int $$26 = 0; $$26 < this.t.length; ++$$26) {
            ShortList $$27 = this.t[$$26];
            if ($$27 == null) continue;
            ((eqf)$$22).a($$27, $$26);
        }
        if ($$15 == ern.b) {
            return new eqp((eqq)((Object)$$22), false);
        }
        erb $$28 = $$22;
        for (uz $$29 : this.w) {
            $$28.b($$29);
        }
        for (uz $$30 : this.x) {
            $$28.a($$30);
        }
        if (this.q != null) {
            $$28.a(new eqe(this.q, $$22.K_()));
        }
        return $$28;
    }

    private static void a(dvu $$0, int $$1, String $$2) {
        B.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.h, $$1, $$0.i, $$2});
    }

    public static esc a(axf $$02, eqf $$1) {
        if (!$$1.s()) {
            throw new IllegalArgumentException("Chunk can't be serialized: " + String.valueOf($$1));
        }
        dvu $$2 = $$1.f();
        ArrayList<b> $$3 = new ArrayList<b>();
        eqr[] $$4 = $$1.d();
        axj $$5 = $$02.p().a();
        for (int $$6 = $$5.d(); $$6 < $$5.e(); ++$$6) {
            eql $$12;
            int $$7 = $$1.g($$6);
            boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
            eql $$9 = $$5.a(dww.b).a(jw.a($$2, $$6));
            eql $$10 = $$5.a(dww.a).a(jw.a($$2, $$6));
            eql eql2 = $$9 != null && !$$9.d() ? $$9.b() : null;
            eql eql3 = $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
            if (!$$8 && eql2 == null && $$12 == null) continue;
            eqr $$13 = $$8 ? $$4[$$7].k() : null;
            $$3.add(new b($$6, $$13, eql2, $$12));
        }
        ArrayList<uz> $$14 = new ArrayList<uz>($$1.c().size());
        for (is $$15 : $$1.c()) {
            uz $$16 = $$1.a($$15, $$02.J_());
            if ($$16 == null) continue;
            $$14.add($$16);
        }
        ArrayList<uz> $$17 = new ArrayList<uz>();
        long[] $$18 = null;
        if ($$1.n().d() == ern.a) {
            erb $$19 = (erb)$$1;
            $$17.addAll($$19.J());
            eqe $$20 = $$19.F();
            if ($$20 != null) {
                $$18 = $$20.a();
            }
        }
        EnumMap<euq.a, long[]> $$21 = new EnumMap<euq.a, long[]>(euq.a.class);
        for (Map.Entry entry : $$1.e()) {
            if (!$$1.n().e().contains(entry.getKey())) continue;
            long[] $$23 = ((euq)entry.getValue()).a();
            $$21.put((euq.a)entry.getKey(), (long[])$$23.clone());
        }
        eqf.b $$24 = $$1.a($$02.au());
        @Nullable ShortList[] shortListArray = (ShortList[])Arrays.stream($$1.p()).map($$0 -> $$0 != null && !$$0.isEmpty() ? new ShortArrayList($$0) : null).toArray(ShortList[]::new);
        uz $$26 = esc.a(fge.a($$02), $$2, $$1.g(), $$1.h());
        return new esc($$02.at(), $$2, $$1.ay(), $$02.au(), $$1.w(), $$1.n(), t.a($$1.v(), evt::a), $$1.z(), $$1.t().c(), $$18, $$21, $$24, shortListArray, $$1.x(), $$3, $$17, $$14, $$26);
    }

    public uz a() {
        uz $$0 = vo.e(new uz());
        $$0.a(a, this.i.h);
        $$0.a("yPos", this.j);
        $$0.a(b, this.i.i);
        $$0.a("LastUpdate", this.k);
        $$0.a("InhabitedTime", this.l);
        $$0.a("Status", mi.m.b(this.m).toString());
        $$0.b("blending_data", evt.d.a, this.n);
        $$0.b("below_zero_retrogen", eue.a, this.o);
        if (!this.p.a()) {
            $$0.a(C, this.p.b());
        }
        vf $$12 = new vf();
        Codec<eqy<eoh>> $$22 = this.h.e();
        Codec<era<jd<dxo>>> $$3 = this.h.h();
        for (b $$4 : this.v) {
            uz $$5 = new uz();
            eqr $$6 = $$4.b;
            if ($$6 != null) {
                $$5.a("block_states", $$22, $$6.h());
                $$5.a("biomes", $$3, $$6.i());
            }
            if ($$4.c != null) {
                $$5.a(f, $$4.c.a());
            }
            if ($$4.d != null) {
                $$5.a(g, $$4.d.a());
            }
            if ($$5.j()) continue;
            $$5.a("Y", (byte)$$4.a);
            $$12.add($$5);
        }
        $$0.a(e, $$12);
        if (this.u) {
            $$0.a(d, true);
        }
        vf $$7 = new vf();
        $$7.addAll(this.x);
        $$0.a("block_entities", $$7);
        if (this.m.d() == ern.a) {
            vf $$8 = new vf();
            $$8.addAll(this.w);
            $$0.a("entities", $$8);
            if (this.q != null) {
                $$0.a("carving_mask", this.q);
            }
        }
        esc.a($$0, this.s);
        $$0.a("PostProcessing", esc.a(this.t));
        uz $$9 = new uz();
        this.r.forEach(($$1, $$2) -> $$9.a($$1.a(), new vg((long[])$$2)));
        $$0.a(c, $$9);
        $$0.a("structures", this.y);
        return $$0;
    }

    private static void a(uz $$0, eqf.b $$1) {
        $$0.a(D, z, $$1.a());
        $$0.a(E, A, $$1.b());
    }

    public static erj a(@Nullable uz $$0) {
        return $$0 != null ? $$0.a("Status", erj.o).orElse(erj.c) : erj.c;
    }

    private static @Nullable eqq.c a(axf $$0, List<uz> $$1, List<uz> $$2) {
        if ($$1.isEmpty() && $$2.isEmpty()) {
            return null;
        }
        return $$3 -> {
            if (!$$1.isEmpty()) {
                try (bgp.j $$4 = new bgp.j($$3.E(), B);){
                    $$0.a(cgu.a(fno.a((bgp)$$4, (jf.a)$$0.J_(), $$1), (dwo)$$0, cgt.r));
                }
            }
            for (uz $$5 : $$2) {
                boolean $$6 = $$5.b("keepPacked", false);
                if ($$6) {
                    $$3.a($$5);
                    continue;
                }
                is $$7 = elb.a($$3.f(), $$5);
                elb $$8 = elb.a($$7, $$3.a_($$7), $$5, $$0.J_());
                if ($$8 == null) continue;
                $$3.a($$8);
            }
        };
    }

    private static uz a(fge $$0, dvu $$1, Map<ffo, ffw> $$2, Map<ffo, LongSet> $$3) {
        uz $$4 = new uz();
        uz $$5 = new uz();
        jq<ffo> $$6 = $$0.b().f(mj.bs);
        for (Map.Entry<ffo, ffw> $$7 : $$2.entrySet()) {
            amo $$8 = $$6.b($$7.getKey());
            $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
        }
        $$4.a("starts", $$5);
        uz $$9 = new uz();
        for (Map.Entry<ffo, LongSet> $$10 : $$3.entrySet()) {
            if ($$10.getValue().isEmpty()) continue;
            amo $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), $$10.getValue().toLongArray());
        }
        $$4.a("References", $$9);
        return $$4;
    }

    private static Map<ffo, ffw> a(fge $$0, uz $$1, long $$2) {
        HashMap $$3 = Maps.newHashMap();
        jq<ffo> $$4 = $$0.b().f(mj.bs);
        uz $$5 = $$1.n("starts");
        for (String $$6 : $$5.e()) {
            amo $$7 = amo.c($$6);
            ffo $$8 = $$4.a($$7);
            if ($$8 == null) {
                B.error("Unknown structure start: {}", (Object)$$7);
                continue;
            }
            ffw $$9 = ffw.a($$0, $$5.n($$6), $$2);
            if ($$9 == null) continue;
            $$3.put($$8, $$9);
        }
        return $$3;
    }

    private static Map<ffo, LongSet> a(jr $$0, dvu $$1, uz $$2) {
        HashMap $$32 = Maps.newHashMap();
        jq<ffo> $$42 = $$0.f(mj.bs);
        uz $$5 = $$2.n("References");
        $$5.a(($$3, $$4) -> {
            amo $$5 = amo.c($$3);
            ffo $$6 = (ffo)$$42.a($$5);
            if ($$6 == null) {
                B.warn("Found reference to unknown structure '{}' in chunk {}, discarding", (Object)$$5, (Object)$$1);
                return;
            }
            Optional<long[]> $$7 = $$4.r_();
            if ($$7.isEmpty()) {
                return;
            }
            $$32.put($$6, new LongOpenHashSet(Arrays.stream($$7.get()).filter($$2 -> {
                dvu $$3 = new dvu($$2);
                if ($$3.a($$1) > 8) {
                    B.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{$$5, $$3, $$1});
                    return false;
                }
                return true;
            }).toArray()));
        });
        return $$32;
    }

    private static vf a(@Nullable ShortList[] $$0) {
        vf $$1 = new vf();
        for (ShortList $$2 : $$0) {
            vf $$3 = new vf();
            if ($$2 != null) {
                for (int $$4 = 0; $$4 < $$2.size(); ++$$4) {
                    $$3.add(vs.a($$2.getShort($$4)));
                }
            }
            $$1.add($$3);
        }
        return $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{esc.class, "containerFactory;chunkPos;minSectionY;lastUpdateTime;inhabitedTime;chunkStatus;blendingData;belowZeroRetrogen;upgradeData;carvingMask;heightmaps;packedTicks;postProcessingSections;lightCorrect;sectionData;entities;blockEntities;structureData", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{esc.class, "containerFactory;chunkPos;minSectionY;lastUpdateTime;inhabitedTime;chunkStatus;blendingData;belowZeroRetrogen;upgradeData;carvingMask;heightmaps;packedTicks;postProcessingSections;lightCorrect;sectionData;entities;blockEntities;structureData", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{esc.class, "containerFactory;chunkPos;minSectionY;lastUpdateTime;inhabitedTime;chunkStatus;blendingData;belowZeroRetrogen;upgradeData;carvingMask;heightmaps;packedTicks;postProcessingSections;lightCorrect;sectionData;entities;blockEntities;structureData", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"}, this, $$0);
    }

    public eqz b() {
        return this.h;
    }

    public dvu c() {
        return this.i;
    }

    public int d() {
        return this.j;
    }

    public long e() {
        return this.k;
    }

    public long f() {
        return this.l;
    }

    public erj g() {
        return this.m;
    }

    public @Nullable evt.d h() {
        return this.n;
    }

    public @Nullable eue i() {
        return this.o;
    }

    public erf j() {
        return this.p;
    }

    public long @Nullable [] k() {
        return this.q;
    }

    public Map<euq.a, long[]> l() {
        return this.r;
    }

    public eqf.b m() {
        return this.s;
    }

    public @Nullable ShortList[] n() {
        return this.t;
    }

    public boolean o() {
        return this.u;
    }

    public List<b> p() {
        return this.v;
    }

    public List<uz> q() {
        return this.w;
    }

    public List<uz> r() {
        return this.x;
    }

    public uz s() {
        return this.y;
    }

    public static final class b
    extends Record {
        final int a;
        final @Nullable eqr b;
        final @Nullable eql c;
        final @Nullable eql d;

        public b(int $$0, @Nullable eqr $$1, @Nullable eql $$2, @Nullable eql $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "y;chunkSection;blockLight;skyLight", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "y;chunkSection;blockLight;skyLight", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "y;chunkSection;blockLight;skyLight", "a", "b", "c", "d"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public @Nullable eqr b() {
            return this.b;
        }

        public @Nullable eql c() {
            return this.c;
        }

        public @Nullable eql d() {
            return this.d;
        }
    }

    public static class a
    extends vk {
        public a(String $$0) {
            super($$0);
        }
    }
}

