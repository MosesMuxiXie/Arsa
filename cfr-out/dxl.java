/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMaps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class dxl
extends fmn {
    private static final int c = 4;
    private static final Logger d = LogUtils.getLogger();
    private static final Codec<Pair<dvu, axl>> e = Codec.mapPair((MapCodec)dvu.a.fieldOf("chunk_pos"), axl.a).codec();
    public static final Codec<dxl> a = RecordCodecBuilder.create($$0 -> $$0.group((App)e.listOf().optionalFieldOf("tickets", List.of()).forGetter(dxl::g)).apply((Applicative)$$0, dxl::a));
    public static final fmo<dxl> b = new fmo<dxl>("chunks", dxl::new, a, bhz.j);
    private final Long2ObjectOpenHashMap<List<axl>> f;
    private final Long2ObjectOpenHashMap<List<axl>> g;
    private LongSet h = new LongOpenHashSet();
    private @Nullable a i;
    private @Nullable a j;

    private dxl(Long2ObjectOpenHashMap<List<axl>> $$0, Long2ObjectOpenHashMap<List<axl>> $$1) {
        this.f = $$0;
        this.g = $$1;
        this.h();
    }

    public dxl() {
        this((Long2ObjectOpenHashMap<List<axl>>)new Long2ObjectOpenHashMap(4), (Long2ObjectOpenHashMap<List<axl>>)new Long2ObjectOpenHashMap());
    }

    private static dxl a(List<Pair<dvu, axl>> $$02) {
        Long2ObjectOpenHashMap $$1 = new Long2ObjectOpenHashMap();
        for (Pair<dvu, axl> $$2 : $$02) {
            dvu $$3 = (dvu)$$2.getFirst();
            List $$4 = (List)$$1.computeIfAbsent($$3.b(), $$0 -> new ObjectArrayList(4));
            $$4.add((axl)$$2.getSecond());
        }
        return new dxl((Long2ObjectOpenHashMap<List<axl>>)new Long2ObjectOpenHashMap(4), (Long2ObjectOpenHashMap<List<axl>>)$$1);
    }

    private List<Pair<dvu, axl>> g() {
        ArrayList<Pair<dvu, axl>> $$0 = new ArrayList<Pair<dvu, axl>>();
        this.a((dvu $$1, axl $$2) -> {
            if ($$2.a().a()) {
                $$0.add(new Pair($$1, $$2));
            }
        });
        return $$0;
    }

    private void a(BiConsumer<dvu, axl> $$0) {
        dxl.a($$0, this.f);
        dxl.a($$0, this.g);
    }

    private static void a(BiConsumer<dvu, axl> $$0, Long2ObjectOpenHashMap<List<axl>> $$1) {
        for (Long2ObjectMap.Entry $$2 : Long2ObjectMaps.fastIterable($$1)) {
            dvu $$3 = new dvu($$2.getLongKey());
            for (axl $$4 : (List)$$2.getValue()) {
                $$0.accept($$3, $$4);
            }
        }
    }

    public void b() {
        for (Long2ObjectMap.Entry $$0 : Long2ObjectMaps.fastIterable(this.g)) {
            for (axl $$1 : (List)$$0.getValue()) {
                this.a($$0.getLongKey(), $$1);
            }
        }
        this.g.clear();
    }

    public void a(@Nullable a $$0) {
        this.i = $$0;
    }

    public void b(@Nullable a $$0) {
        this.j = $$0;
    }

    public boolean c() {
        return !this.f.isEmpty();
    }

    public boolean d() {
        for (List $$0 : this.f.values()) {
            for (axl $$1 : $$0) {
                if (!$$1.a().d()) continue;
                return true;
            }
        }
        return false;
    }

    public List<axl> a(long $$0) {
        return (List)this.f.getOrDefault($$0, List.of());
    }

    private List<axl> b(long $$02) {
        return (List)this.f.computeIfAbsent($$02, $$0 -> new ObjectArrayList(4));
    }

    public void a(axm $$0, dvu $$1, int $$2) {
        axl $$3 = new axl($$0, awh.a(awt.b) - $$2);
        this.a($$1.b(), $$3);
    }

    public void a(axl $$0, dvu $$1) {
        this.a($$1.b(), $$0);
    }

    public boolean a(long $$0, axl $$1) {
        List<axl> $$2 = this.b($$0);
        for (axl $$3 : $$2) {
            if (!dxl.a($$1, $$3)) continue;
            $$3.c();
            this.u();
            return false;
        }
        int $$4 = dxl.a($$2, true);
        int $$5 = dxl.a($$2, false);
        $$2.add($$1);
        if (w.M) {
            d.debug("ATI {} {}", (Object)new dvu($$0), (Object)$$1);
        }
        if ($$1.a().c() && $$1.b() < $$4 && this.j != null) {
            this.j.update($$0, $$1.b(), true);
        }
        if ($$1.a().b() && $$1.b() < $$5 && this.i != null) {
            this.i.update($$0, $$1.b(), true);
        }
        if ($$1.a().equals(axm.l)) {
            this.h.add($$0);
        }
        this.u();
        return true;
    }

    private static boolean a(axl $$0, axl $$1) {
        return $$1.a() == $$0.a() && $$1.b() == $$0.b();
    }

    public int a(long $$0, boolean $$1) {
        return dxl.a(this.a($$0), $$1);
    }

    private static int a(List<axl> $$0, boolean $$1) {
        axl $$2 = dxl.b($$0, $$1);
        return $$2 == null ? awh.b + 1 : $$2.b();
    }

    private static @Nullable axl b(@Nullable List<axl> $$0, boolean $$1) {
        if ($$0 == null) {
            return null;
        }
        axl $$2 = null;
        for (axl $$3 : $$0) {
            if ($$2 != null && $$3.b() >= $$2.b()) continue;
            if ($$1 && $$3.a().c()) {
                $$2 = $$3;
                continue;
            }
            if ($$1 || !$$3.a().b()) continue;
            $$2 = $$3;
        }
        return $$2;
    }

    public void b(axm $$0, dvu $$1, int $$2) {
        axl $$3 = new axl($$0, awh.a(awt.b) - $$2);
        this.b($$1.b(), $$3);
    }

    public void b(axl $$0, dvu $$1) {
        this.b($$1.b(), $$0);
    }

    public boolean b(long $$0, axl $$1) {
        List $$2 = (List)this.f.get($$0);
        if ($$2 == null) {
            return false;
        }
        boolean $$3 = false;
        Iterator $$4 = $$2.iterator();
        while ($$4.hasNext()) {
            axl $$5 = (axl)$$4.next();
            if (!dxl.a($$1, $$5)) continue;
            $$4.remove();
            if (w.M) {
                d.debug("RTI {} {}", (Object)new dvu($$0), (Object)$$5);
            }
            $$3 = true;
            break;
        }
        if (!$$3) {
            return false;
        }
        if ($$2.isEmpty()) {
            this.f.remove($$0);
        }
        if ($$1.a().c() && this.j != null) {
            this.j.update($$0, dxl.a($$2, true), false);
        }
        if ($$1.a().b() && this.i != null) {
            this.i.update($$0, dxl.a($$2, false), false);
        }
        if ($$1.a().equals(axm.l)) {
            this.h();
        }
        this.u();
        return true;
    }

    private void h() {
        this.h = this.a((axl $$0) -> $$0.a().equals(axm.l));
    }

    public String b(long $$0, boolean $$1) {
        List<axl> $$2 = this.a($$0);
        axl $$3 = dxl.b($$2, $$1);
        return $$3 == null ? "no_ticket" : $$3.toString();
    }

    public void a(awj $$0) {
        this.a((axl $$1, long $$2) -> {
            if (this.a($$0, $$1, $$2)) {
                $$1.d();
                return $$1.e();
            }
            return false;
        }, null);
        this.u();
    }

    private boolean a(awj $$0, axl $$1, long $$2) {
        if (!$$1.a().f()) {
            return false;
        }
        if ($$1.a().e()) {
            return true;
        }
        awg $$3 = $$0.a($$2);
        return $$3 == null || $$3.h();
    }

    public void e() {
        this.a((axl $$0, long $$1) -> $$0.a() != axm.o, this.g);
    }

    public void a(b $$0, @Nullable Long2ObjectOpenHashMap<List<axl>> $$12) {
        ObjectIterator $$2 = this.f.long2ObjectEntrySet().fastIterator();
        boolean $$3 = false;
        while ($$2.hasNext()) {
            Long2ObjectMap.Entry $$4 = (Long2ObjectMap.Entry)$$2.next();
            Iterator $$5 = ((List)$$4.getValue()).iterator();
            long $$6 = $$4.getLongKey();
            boolean $$7 = false;
            boolean $$8 = false;
            while ($$5.hasNext()) {
                axl $$9 = (axl)$$5.next();
                if (!$$0.test($$9, $$6)) continue;
                if ($$12 != null) {
                    List $$10 = (List)$$12.computeIfAbsent($$6, $$1 -> new ObjectArrayList(((List)$$4.getValue()).size()));
                    $$10.add($$9);
                }
                $$5.remove();
                if ($$9.a().b()) {
                    $$8 = true;
                }
                if ($$9.a().c()) {
                    $$7 = true;
                }
                if (!$$9.a().equals(axm.l)) continue;
                $$3 = true;
            }
            if (!$$8 && !$$7) continue;
            if ($$8 && this.i != null) {
                this.i.update($$6, dxl.a((List)$$4.getValue(), false), false);
            }
            if ($$7 && this.j != null) {
                this.j.update($$6, dxl.a((List)$$4.getValue(), true), false);
            }
            this.u();
            if (!((List)$$4.getValue()).isEmpty()) continue;
            $$2.remove();
        }
        if ($$3) {
            this.h();
        }
    }

    public void a(int $$0, axm $$1) {
        ArrayList<Pair> $$2 = new ArrayList<Pair>();
        for (Long2ObjectMap.Entry $$3 : this.f.long2ObjectEntrySet()) {
            for (axl $$4 : (List)$$3.getValue()) {
                if ($$4.a() != $$1) continue;
                $$2.add(Pair.of((Object)$$4, (Object)$$3.getLongKey()));
            }
        }
        for (Pair $$5 : $$2) {
            Long $$6 = (Long)$$5.getSecond();
            axl $$7 = (axl)$$5.getFirst();
            this.b((long)$$6, $$7);
            axm $$8 = $$7.a();
            this.a((long)$$6, new axl($$8, $$0));
        }
    }

    public boolean a(dvu $$0, boolean $$1) {
        axl $$2 = new axl(axm.l, awj.c);
        if ($$1) {
            return this.a($$0.b(), $$2);
        }
        return this.b($$0.b(), $$2);
    }

    public LongSet f() {
        return this.h;
    }

    private LongSet a(Predicate<axl> $$0) {
        LongOpenHashSet $$1 = new LongOpenHashSet();
        block0: for (Long2ObjectMap.Entry $$2 : Long2ObjectMaps.fastIterable(this.f)) {
            for (axl $$3 : (List)$$2.getValue()) {
                if (!$$0.test($$3)) continue;
                $$1.add($$2.getLongKey());
                continue block0;
            }
        }
        return $$1;
    }

    @FunctionalInterface
    public static interface a {
        public void update(long var1, int var3, boolean var4);
    }

    public static interface b {
        public boolean test(axl var1, long var2);
    }
}

