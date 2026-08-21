/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2BooleanMap
 *  it.unimi.dsi.fastutil.longs.Long2BooleanOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2BooleanMap;
import it.unimi.dsi.fastutil.longs.Long2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ffp {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = -1;
    private final err c;
    private final jr d;
    private final fjr e;
    private final amt<dwo> f;
    private final eqg g;
    private final eve h;
    private final dwq i;
    private final dxs j;
    private final long k;
    private final DataFixer l;
    private final Long2ObjectMap<Object2IntMap<ffo>> m = new Long2ObjectOpenHashMap();
    private final Map<ffo, Long2BooleanMap> n = new HashMap<ffo, Long2BooleanMap>();

    public ffp(err $$0, jr $$1, fjr $$2, amt<dwo> $$3, eqg $$4, eve $$5, dwq $$6, dxs $$7, long $$8, DataFixer $$9) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
        this.j = $$7;
        this.k = $$8;
        this.l = $$9;
    }

    public ffq a(dvu $$02, ffo $$1, fgl $$22, boolean $$3) {
        long $$4 = $$02.b();
        Object2IntMap $$5 = (Object2IntMap)this.m.get($$4);
        if ($$5 != null) {
            return this.a((Object2IntMap<ffo>)$$5, $$1, $$3);
        }
        ffq $$6 = this.a($$02, $$1, $$3, $$4);
        if ($$6 != null) {
            return $$6;
        }
        if (!$$22.a($$02.h, $$02.i, this.k)) {
            return ffq.b;
        }
        boolean $$7 = this.n.computeIfAbsent($$1, $$0 -> new Long2BooleanOpenHashMap()).computeIfAbsent($$4, $$2 -> this.b($$02, $$1));
        if (!$$7) {
            return ffq.b;
        }
        return ffq.c;
    }

    private boolean b(dvu $$0, ffo $$1) {
        return $$1.b(new ffo.a(this.d, this.g, this.j, this.h, this.e, this.k, $$0, this.i, $$1.a()::a)).isPresent();
    }

    /*
     * WARNING - void declaration
     */
    private @Nullable ffq a(dvu $$0, ffo $$1, boolean $$2, long $$3) {
        void $$11;
        wg $$4 = new wg(new wi(ve.a, "DataVersion"), new wi("Level", "Structures", uz.b, "Starts"), new wi("structures", uz.b, "starts"));
        try {
            this.c.a($$0, $$4).join();
        }
        catch (Exception $$5) {
            a.warn("Failed to read chunk {}", (Object)$$0, (Object)$$5);
            return ffq.c;
        }
        vz $$6 = $$4.d();
        if (!($$6 instanceof uz)) {
            return null;
        }
        uz $$7 = (uz)$$6;
        int $$8 = vo.f($$7);
        if ($$8 <= 1493) {
            return ffq.c;
        }
        esd.a($$7, awj.a(this.f, this.g.c()));
        try {
            uz $$9 = bhz.d.a(this.l, $$7, $$8);
        }
        catch (Exception $$10) {
            a.warn("Failed to partially datafix chunk {}", (Object)$$0, (Object)$$10);
            return ffq.c;
        }
        Object2IntMap<ffo> $$12 = this.a((uz)$$11);
        if ($$12 == null) {
            return null;
        }
        this.a($$3, $$12);
        return this.a($$12, $$1, $$2);
    }

    private @Nullable Object2IntMap<ffo> a(uz $$02) {
        Optional $$1 = $$02.m("structures").flatMap($$0 -> $$0.m("starts"));
        if ($$1.isEmpty()) {
            return null;
        }
        uz $$2 = (uz)$$1.get();
        if ($$2.j()) {
            return Object2IntMaps.emptyMap();
        }
        Object2IntOpenHashMap $$3 = new Object2IntOpenHashMap();
        jq<ffo> $$4 = this.d.f(mj.bs);
        $$2.a((arg_0, arg_1) -> ffp.a($$4, (Object2IntMap)$$3, arg_0, arg_1));
        return $$3;
    }

    private static Object2IntMap<ffo> a(Object2IntMap<ffo> $$0) {
        return $$0.isEmpty() ? Object2IntMaps.emptyMap() : $$0;
    }

    private ffq a(Object2IntMap<ffo> $$0, ffo $$1, boolean $$2) {
        int $$3 = $$0.getOrDefault((Object)$$1, -1);
        return $$3 != -1 && (!$$2 || $$3 == 0) ? ffq.a : ffq.b;
    }

    public void a(dvu $$0, Map<ffo, ffw> $$1) {
        long $$2 = $$0.b();
        Object2IntOpenHashMap $$3 = new Object2IntOpenHashMap();
        $$1.forEach((arg_0, arg_1) -> ffp.a((Object2IntMap)$$3, arg_0, arg_1));
        this.a($$2, (Object2IntMap<ffo>)$$3);
    }

    private void a(long $$0, Object2IntMap<ffo> $$12) {
        this.m.put($$0, ffp.a($$12));
        this.n.values().forEach($$1 -> $$1.remove($$0));
    }

    public void a(dvu $$0, ffo $$1) {
        this.m.compute($$0.b(), ($$12, $$2) -> {
            if ($$2 == null || $$2.isEmpty()) {
                $$2 = new Object2IntOpenHashMap();
            }
            $$2.computeInt((Object)$$1, ($$0, $$1) -> $$1 == null ? 1 : $$1 + 1);
            return $$2;
        });
    }

    private static /* synthetic */ void a(Object2IntMap $$0, ffo $$1, ffw $$2) {
        if ($$2.b()) {
            $$0.put((Object)$$1, $$2.f());
        }
    }

    private static /* synthetic */ void a(jq $$0, Object2IntMap $$1, String $$22, vz $$3) {
        amo $$4 = amo.c($$22);
        if ($$4 == null) {
            return;
        }
        ffo $$5 = (ffo)$$0.a($$4);
        if ($$5 == null) {
            return;
        }
        $$3.s_().ifPresent($$2 -> {
            String $$3 = $$2.b("id", "");
            if (!"INVALID".equals($$3)) {
                int $$4 = $$2.b("references", 0);
                $$1.put((Object)$$5, $$4);
            }
        });
    }
}

