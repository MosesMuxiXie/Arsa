/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DataFixer
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class ffj
implements eru {
    public static final int b = 1493;
    private static final Map<String, String> c = bhs.a(Maps.newHashMap(), (? super T $$0) -> {
        $$0.put("Village", "Village");
        $$0.put("Mineshaft", "Mineshaft");
        $$0.put("Mansion", "Mansion");
        $$0.put("Igloo", "Temple");
        $$0.put("Desert_Pyramid", "Temple");
        $$0.put("Jungle_Pyramid", "Temple");
        $$0.put("Swamp_Hut", "Temple");
        $$0.put("Stronghold", "Stronghold");
        $$0.put("Monument", "Monument");
        $$0.put("Fortress", "Fortress");
        $$0.put("EndCity", "EndCity");
    });
    private static final Map<String, String> d = bhs.a(Maps.newHashMap(), (? super T $$0) -> {
        $$0.put("Iglu", "Igloo");
        $$0.put("TeDP", "Desert_Pyramid");
        $$0.put("TeJP", "Jungle_Pyramid");
        $$0.put("TeSH", "Swamp_Hut");
    });
    private static final Set<String> e = Set.of("pillager_outpost", "mineshaft", "mansion", "jungle_pyramid", "desert_pyramid", "igloo", "ruined_portal", "shipwreck", "swamp_hut", "stronghold", "monument", "ocean_ruin", "fortress", "endcity", "buried_treasure", "village", "nether_fossil", "bastion_remnant");
    private final boolean f;
    private final Map<String, Long2ObjectMap<uz>> g = Maps.newHashMap();
    private final Map<String, ffr> h = Maps.newHashMap();
    private final @Nullable fnc i;
    private final List<String> j;
    private final List<String> k;
    private final DataFixer l;
    private boolean m;

    public ffj(@Nullable fnc $$0, List<String> $$1, List<String> $$2, DataFixer $$3) {
        this.i = $$0;
        this.j = $$1;
        this.k = $$2;
        this.l = $$3;
        boolean $$4 = false;
        for (String $$5 : this.k) {
            $$4 |= this.g.get($$5) != null;
        }
        this.f = $$4;
    }

    @Override
    public void markChunkDone(dvu $$0) {
        long $$1 = $$0.b();
        for (String $$2 : this.j) {
            ffr $$3 = this.h.get($$2);
            if ($$3 == null || !$$3.c($$1)) continue;
            $$3.d($$1);
        }
    }

    @Override
    public int targetDataVersion() {
        return 1493;
    }

    @Override
    public uz applyFix(uz $$02) {
        int $$1;
        if (!this.m && this.i != null) {
            this.a(this.i);
        }
        if (($$1 = vo.f($$02)) < 1493 && ($$02 = bhz.d.a(this.l, $$02, $$1, 1493)).m("Level").flatMap($$0 -> $$0.q("hasLegacyStructureData")).orElse(false).booleanValue()) {
            $$02 = this.a($$02);
        }
        return $$02;
    }

    private uz a(uz $$0) {
        uz $$1 = $$0.n("Level");
        dvu $$2 = new dvu($$1.b("xPos", 0), $$1.b("zPos", 0));
        if (this.a($$2.h, $$2.i)) {
            $$0 = this.a($$0, $$2);
        }
        uz $$3 = $$1.n("Structures");
        uz $$4 = $$3.n("References");
        for (String $$5 : this.k) {
            boolean $$6 = e.contains($$5.toLowerCase(Locale.ROOT));
            if ($$4.l($$5).isPresent() || !$$6) continue;
            int $$7 = 8;
            LongArrayList $$8 = new LongArrayList();
            for (int $$9 = $$2.h - 8; $$9 <= $$2.h + 8; ++$$9) {
                for (int $$10 = $$2.i - 8; $$10 <= $$2.i + 8; ++$$10) {
                    if (!this.a($$9, $$10, $$5)) continue;
                    $$8.add(dvu.d($$9, $$10));
                }
            }
            $$4.a($$5, $$8.toLongArray());
        }
        $$3.a("References", $$4);
        $$1.a("Structures", $$3);
        $$0.a("Level", $$1);
        return $$0;
    }

    private boolean a(int $$0, int $$1, String $$2) {
        if (!this.f) {
            return false;
        }
        return this.g.get($$2) != null && this.h.get(c.get($$2)).b(dvu.d($$0, $$1));
    }

    private boolean a(int $$0, int $$1) {
        if (!this.f) {
            return false;
        }
        for (String $$2 : this.k) {
            if (this.g.get($$2) == null || !this.h.get(c.get($$2)).c(dvu.d($$0, $$1))) continue;
            return true;
        }
        return false;
    }

    private uz a(uz $$0, dvu $$1) {
        uz $$2 = $$0.n("Level");
        uz $$3 = $$2.n("Structures");
        uz $$4 = $$3.n("Starts");
        for (String $$5 : this.k) {
            uz $$8;
            Long2ObjectMap<uz> $$6 = this.g.get($$5);
            if ($$6 == null) continue;
            long $$7 = $$1.b();
            if (!this.h.get(c.get($$5)).c($$7) || ($$8 = (uz)$$6.get($$7)) == null) continue;
            $$4.a($$5, $$8);
        }
        $$3.a("Starts", $$4);
        $$2.a("Structures", $$3);
        $$0.a("Level", $$2);
        return $$0;
    }

    private synchronized void a(fnc $$0) {
        if (this.m) {
            return;
        }
        for (String $$12 : this.j) {
            uz $$22 = new uz();
            try {
                $$22 = $$0.a($$12, bhz.q, 1493).n("data").n("Features");
                if ($$22.j()) {
                    continue;
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
            $$22.a((String $$02, vz $$1) -> {
                void $$3;
                if (!($$1 instanceof uz)) {
                    return;
                }
                uz $$2 = (uz)$$1;
                long $$4 = dvu.d($$3.b("ChunkX", 0), $$3.b("ChunkZ", 0));
                vf $$5 = $$3.p("Children");
                if (!$$5.isEmpty()) {
                    Optional<String> $$6 = $$5.a(0).flatMap($$0 -> $$0.i("id"));
                    $$6.map(d::get).ifPresent(arg_0 -> ffj.a((uz)$$3, arg_0));
                }
                $$3.i("id").ifPresent(arg_0 -> this.a($$4, (uz)$$3, arg_0));
            });
            String $$3 = $$12 + "_index";
            ffr $$4 = $$0.a(ffr.a($$3));
            if ($$4.b().isEmpty()) {
                ffr $$5 = new ffr();
                this.h.put($$12, $$5);
                $$22.a((String $$1, vz $$2) -> {
                    if ($$2 instanceof uz) {
                        uz $$3 = (uz)$$2;
                        $$5.a(dvu.d($$3.b("ChunkX", 0), $$3.b("ChunkZ", 0)));
                    }
                });
                continue;
            }
            this.h.put($$12, $$4);
        }
        this.m = true;
    }

    public static Supplier<eru> a(amt<dwo> $$0, Supplier<@Nullable fnc> $$1, DataFixer $$2) {
        if ($$0 == dwo.h) {
            return () -> new ffj((fnc)$$1.get(), (List<String>)ImmutableList.of((Object)"Monument", (Object)"Stronghold", (Object)"Village", (Object)"Mineshaft", (Object)"Temple", (Object)"Mansion"), (List<String>)ImmutableList.of((Object)"Village", (Object)"Mineshaft", (Object)"Mansion", (Object)"Igloo", (Object)"Desert_Pyramid", (Object)"Jungle_Pyramid", (Object)"Swamp_Hut", (Object)"Stronghold", (Object)"Monument"), $$2);
        }
        if ($$0 == dwo.i) {
            ImmutableList $$3 = ImmutableList.of((Object)"Fortress");
            return () -> ffj.b($$1, (List)$$3, $$2);
        }
        if ($$0 == dwo.j) {
            ImmutableList $$4 = ImmutableList.of((Object)"EndCity");
            return () -> ffj.a($$1, (List)$$4, $$2);
        }
        return eru.a;
    }

    private static /* synthetic */ eru a(Supplier $$0, List $$1, DataFixer $$2) {
        return new ffj((fnc)$$0.get(), $$1, $$1, $$2);
    }

    private static /* synthetic */ eru b(Supplier $$0, List $$1, DataFixer $$2) {
        return new ffj((fnc)$$0.get(), $$1, $$1, $$2);
    }

    private /* synthetic */ void a(long $$02, uz $$1, String $$2) {
        this.g.computeIfAbsent($$2, $$0 -> new Long2ObjectOpenHashMap()).put($$02, (Object)$$1);
    }

    private static /* synthetic */ void a(uz $$0, String $$1) {
        $$0.a("id", $$1);
    }
}

