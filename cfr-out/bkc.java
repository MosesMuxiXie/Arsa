/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 *  it.unimi.dsi.fastutil.ints.Int2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import it.unimi.dsi.fastutil.ints.Int2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class bkc
extends DataFix {
    public static final String a = "__context";
    private static final String d = "ChunkHeightAndBiomeFix";
    private static final int e = 16;
    private static final int f = 24;
    private static final int g = -4;
    public static final int b = 4096;
    private static final int h = 64;
    private static final int i = 9;
    private static final long j = 511L;
    private static final int k = 64;
    private static final String[] l = new String[]{"WORLD_SURFACE_WG", "WORLD_SURFACE", "WORLD_SURFACE_IGNORE_SNOW", "OCEAN_FLOOR_WG", "OCEAN_FLOOR", "MOTION_BLOCKING", "MOTION_BLOCKING_NO_LEAVES"};
    private static final Set<String> m = Set.of("surface", "carvers", "liquid_carvers", "features", "light", "spawn", "heightmaps", "full");
    private static final Set<String> n = Set.of("noise", "surface", "carvers", "liquid_carvers", "features", "light", "spawn", "heightmaps", "full");
    private static final Set<String> o = Set.of("minecraft:air", "minecraft:basalt", "minecraft:bedrock", "minecraft:blackstone", "minecraft:calcite", "minecraft:cave_air", "minecraft:coarse_dirt", "minecraft:crimson_nylium", "minecraft:dirt", "minecraft:end_stone", "minecraft:grass_block", "minecraft:gravel", "minecraft:ice", "minecraft:lava", "minecraft:mycelium", "minecraft:nether_wart_block", "minecraft:netherrack", "minecraft:orange_terracotta", "minecraft:packed_ice", "minecraft:podzol", "minecraft:powder_snow", "minecraft:red_sand", "minecraft:red_sandstone", "minecraft:sand", "minecraft:sandstone", "minecraft:snow_block", "minecraft:soul_sand", "minecraft:soul_soil", "minecraft:stone", "minecraft:terracotta", "minecraft:warped_nylium", "minecraft:warped_wart_block", "minecraft:water", "minecraft:white_terracotta");
    private static final int p = 16;
    private static final int q = 64;
    private static final int r = 1008;
    public static final String c = "minecraft:plains";
    private static final Int2ObjectMap<String> s = new Int2ObjectOpenHashMap();

    public bkc(Schema $$0) {
        super($$0, true);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.d);
        OpticFinder $$1 = $$0.findField("Level");
        OpticFinder $$2 = $$1.type().findField("Sections");
        Schema $$3 = this.getOutputSchema();
        Type $$42 = $$3.getType(bqh.d);
        Type $$5 = $$42.findField("Level").type();
        Type $$6 = $$5.findField("Sections").type();
        return this.fixTypeEverywhereTyped(d, $$0, $$42, $$4 -> $$4.updateTyped($$1, $$5, $$3 -> {
            Object $$4 = (Dynamic)$$3.get(DSL.remainderFinder());
            OptionalDynamic $$52 = ((Dynamic)$$4.get(DSL.remainderFinder())).get(a);
            String $$6 = $$52.get("dimension").asString().result().orElse("");
            String $$72 = $$52.get("generator").asString().result().orElse("");
            boolean $$8 = "minecraft:overworld".equals($$6);
            MutableBoolean $$9 = new MutableBoolean();
            int $$10 = $$8 ? -4 : 0;
            Dynamic<?>[] $$11 = bkc.a($$4, $$8, $$10, $$9);
            Dynamic<?> $$12 = bkc.d($$4.createList(Stream.of($$4.createMap((Map)ImmutableMap.of((Object)$$4.createString("Name"), (Object)$$4.createString("minecraft:air"))))));
            HashSet $$13 = Sets.newHashSet();
            @Nullable MutableObject $$14 = new MutableObject(() -> null);
            $$3 = $$3.updateTyped($$2, $$6, $$7 -> {
                IntOpenHashSet $$8 = new IntOpenHashSet();
                Dynamic $$9 = (Dynamic)$$7.write().result().orElseThrow(() -> new IllegalStateException("Malformed Chunk.Level.Sections"));
                List $$10 = $$9.asStream().map(arg_0 -> bkc.a($$13, $$12, $$10, $$11, (IntSet)$$8, $$14, arg_0)).collect(Collectors.toCollection(ArrayList::new));
                for (int $$11 = 0; $$11 < $$11.length; ++$$11) {
                    int $$12 = $$11 + $$10;
                    if (!$$8.add($$12)) continue;
                    Dynamic $$13 = $$4.createMap(Map.of($$4.createString("Y"), $$4.createInt($$12)));
                    $$13 = $$13.set("block_states", $$12);
                    $$13 = $$13.set("biomes", $$11[$$11]);
                    $$10.add($$13);
                }
                return bhs.a($$6, $$4.createList($$10.stream()));
            });
            return $$3.update(DSL.remainderFinder(), $$5 -> {
                if ($$8) {
                    $$5 = this.a((Dynamic<?>)$$5, $$13);
                }
                return bkc.a($$5, $$8, $$9.booleanValue(), "minecraft:noise".equals($$72), (Supplier)$$14.get());
            });
        }));
    }

    private Dynamic<?> a(Dynamic<?> $$0, Set<String> $$12) {
        return $$0.update("Status", $$1 -> {
            boolean $$4;
            String $$2 = $$1.asString("empty");
            if (m.contains($$2)) {
                return $$1;
            }
            $$12.remove("minecraft:air");
            boolean $$3 = !$$12.isEmpty();
            $$12.removeAll(o);
            boolean bl2 = $$4 = !$$12.isEmpty();
            if ($$4) {
                return $$1.createString("liquid_carvers");
            }
            if ("noise".equals($$2) || $$3) {
                return $$1.createString("noise");
            }
            if ("biomes".equals($$2)) {
                return $$1.createString("structure_references");
            }
            return $$1;
        });
    }

    private static Dynamic<?>[] a(Dynamic<?> $$0, boolean $$12, int $$22, MutableBoolean $$3) {
        Object[] $$4 = new Dynamic[$$12 ? 24 : 16];
        int[] $$5 = $$0.get("Biomes").asIntStreamOpt().result().map(IntStream::toArray).orElse(null);
        if ($$5 != null && $$5.length == 1536) {
            $$3.setValue(true);
            for (int $$6 = 0; $$6 < 24; ++$$6) {
                int $$7 = $$6;
                $$4[$$6] = bkc.a($$0, $$2 -> bkc.a($$5, $$7 * 64 + $$2));
            }
        } else if ($$5 != null && $$5.length == 1024) {
            int $$8 = 0;
            while ($$8 < 16) {
                int $$9 = $$8 - $$22;
                int $$10 = $$8++;
                $$4[$$9] = bkc.a($$0, $$2 -> bkc.a($$5, $$10 * 64 + $$2));
            }
            if ($$12) {
                Dynamic<?> $$11 = bkc.a($$0, $$1 -> bkc.a($$5, $$1 % 16));
                Dynamic<?> $$122 = bkc.a($$0, $$1 -> bkc.a($$5, $$1 % 16 + 1008));
                for (int $$13 = 0; $$13 < 4; ++$$13) {
                    $$4[$$13] = $$11;
                }
                for (int $$14 = 20; $$14 < 24; ++$$14) {
                    $$4[$$14] = $$122;
                }
            }
        } else {
            Arrays.fill($$4, bkc.d($$0.createList(Stream.of($$0.createString(c)))));
        }
        return $$4;
    }

    private static int a(int[] $$0, int $$1) {
        return $$0[$$1] & 0xFF;
    }

    private static Dynamic<?> a(Dynamic<?> $$0, boolean $$1, boolean $$2, boolean $$3, Supplier<@Nullable bkf.a> $$4) {
        Dynamic $$6;
        String $$7;
        $$0 = $$0.remove("Biomes");
        if (!$$1) {
            return bkc.a($$0, 16, 0);
        }
        if ($$2) {
            return bkc.a($$0, 24, 0);
        }
        $$0 = bkc.b($$0);
        $$0 = bkc.a($$0, "LiquidsToBeTicked");
        $$0 = bkc.a($$0, "PostProcessing");
        $$0 = bkc.a($$0, "ToBeTicked");
        $$0 = bkc.a($$0, 24, 4);
        $$0 = $$0.update("UpgradeData", bkc::a);
        if (!$$3) {
            return $$0;
        }
        Optional $$5 = $$0.get("Status").result();
        if ($$5.isPresent() && !"empty".equals($$7 = ($$6 = (Dynamic)$$5.get()).asString(""))) {
            bkf.a $$8;
            $$0 = $$0.set("blending_data", $$0.createMap((Map)ImmutableMap.of((Object)$$0.createString("old_noise"), (Object)$$0.createBoolean(n.contains($$7)))));
            if (!w.aG && ($$8 = $$4.get()) != null) {
                BitSet $$9 = new BitSet(256);
                boolean $$10 = $$7.equals("noise");
                for (int $$11 = 0; $$11 < 16; ++$$11) {
                    for (int $$12 = 0; $$12 < 16; ++$$12) {
                        boolean $$15;
                        Dynamic<?> $$13 = $$8.a($$12, 0, $$11);
                        boolean $$14 = $$13 != null && "minecraft:bedrock".equals($$13.get("Name").asString(""));
                        boolean bl2 = $$15 = $$13 != null && "minecraft:air".equals($$13.get("Name").asString(""));
                        if ($$15) {
                            $$9.set($$11 * 16 + $$12);
                        }
                        $$10 |= $$14;
                    }
                }
                if ($$10 && $$9.cardinality() != $$9.size()) {
                    Dynamic $$16 = "full".equals($$7) ? $$0.createString("heightmaps") : $$6;
                    $$0 = $$0.set("below_zero_retrogen", $$0.createMap((Map)ImmutableMap.of((Object)$$0.createString("target_status"), (Object)$$16, (Object)$$0.createString("missing_bedrock"), (Object)$$0.createLongList(LongStream.of($$9.toLongArray())))));
                    $$0 = $$0.set("Status", $$0.createString("empty"));
                }
                $$0 = $$0.set("isLightOn", $$0.createBoolean(false));
            }
        }
        return $$0;
    }

    private static <T> Dynamic<T> a(Dynamic<T> $$02) {
        return $$02.update("Indices", $$0 -> {
            HashMap $$1 = new HashMap();
            $$0.getMapValues().ifSuccess($$12 -> $$12.forEach(($$1, $$2) -> {
                try {
                    $$1.asString().result().map(Integer::parseInt).ifPresent($$3 -> {
                        int $$4 = $$3 - -4;
                        $$1.put($$1.createString(Integer.toString($$4)), $$2);
                    });
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
            }));
            return $$0.createMap($$1);
        });
    }

    private static Dynamic<?> a(Dynamic<?> $$0, int $$1, int $$2) {
        Dynamic $$32 = $$0.get("CarvingMasks").orElseEmptyMap();
        $$32 = $$32.updateMapValues($$3 -> {
            long[] $$4 = BitSet.valueOf(((Dynamic)$$3.getSecond()).asByteBuffer().array()).toLongArray();
            long[] $$5 = new long[64 * $$1];
            System.arraycopy($$4, 0, $$5, 64 * $$2, $$4.length);
            return Pair.of((Object)((Dynamic)$$3.getFirst()), (Object)$$0.createLongList(LongStream.of($$5)));
        });
        return $$0.set("CarvingMasks", $$32);
    }

    private static Dynamic<?> a(Dynamic<?> $$0, String $$1) {
        List $$2 = $$0.get($$1).orElseEmptyList().asStream().collect(Collectors.toCollection(ArrayList::new));
        if ($$2.size() == 24) {
            return $$0;
        }
        Dynamic $$3 = $$0.emptyList();
        for (int $$4 = 0; $$4 < 4; ++$$4) {
            $$2.add(0, $$3);
            $$2.add($$3);
        }
        return $$0.set($$1, $$0.createList($$2.stream()));
    }

    private static Dynamic<?> b(Dynamic<?> $$02) {
        return $$02.update("Heightmaps", $$0 -> {
            for (String $$1 : l) {
                $$0 = $$0.update($$1, bkc::c);
            }
            return $$0;
        });
    }

    private static Dynamic<?> c(Dynamic<?> $$02) {
        return $$02.createLongList($$02.asLongStream().map($$0 -> {
            long $$1 = 0L;
            int $$2 = 0;
            while ($$2 + 9 <= 64) {
                long $$5;
                long $$3 = $$0 >> $$2 & 0x1FFL;
                if ($$3 == 0L) {
                    long $$4 = 0L;
                } else {
                    $$5 = Math.min($$3 + 64L, 511L);
                }
                $$1 |= $$5 << $$2;
                $$2 += 9;
            }
            return $$1;
        }));
    }

    private static Dynamic<?> a(Dynamic<?> $$0, Int2IntFunction $$12) {
        Int2IntLinkedOpenHashMap $$2 = new Int2IntLinkedOpenHashMap();
        for (int $$3 = 0; $$3 < 64; ++$$3) {
            int $$4 = $$12.applyAsInt($$3);
            if ($$2.containsKey($$4)) continue;
            $$2.put($$4, $$2.size());
        }
        Dynamic $$5 = $$0.createList($$2.keySet().stream().map($$1 -> $$0.createString((String)s.getOrDefault($$1.intValue(), (Object)c))));
        int $$6 = bkc.a($$2.size());
        if ($$6 == 0) {
            return bkc.d($$5);
        }
        int $$7 = 64 / $$6;
        int $$8 = (64 + $$7 - 1) / $$7;
        long[] $$9 = new long[$$8];
        int $$10 = 0;
        int $$11 = 0;
        for (int $$122 = 0; $$122 < 64; ++$$122) {
            int $$13 = $$12.applyAsInt($$122);
            int n2 = $$10++;
            $$9[n2] = $$9[n2] | (long)$$2.get($$13) << $$11;
            if (($$11 += $$6) + $$6 <= 64) continue;
            $$11 = 0;
        }
        Dynamic $$14 = $$0.createLongList(Arrays.stream($$9));
        return bkc.a($$5, $$14);
    }

    private static Dynamic<?> d(Dynamic<?> $$0) {
        return $$0.createMap((Map)ImmutableMap.of((Object)$$0.createString("palette"), $$0));
    }

    private static Dynamic<?> a(Dynamic<?> $$0, Dynamic<?> $$1) {
        return $$0.createMap((Map)ImmutableMap.of((Object)$$0.createString("palette"), $$0, (Object)$$0.createString("data"), $$1));
    }

    private static Dynamic<?> b(Dynamic<?> $$0, Dynamic<?> $$1) {
        List $$2 = $$0.asStream().collect(Collectors.toCollection(ArrayList::new));
        if ($$2.size() == 1) {
            return bkc.d($$0);
        }
        $$0 = bkc.a($$0, $$1, $$2);
        return bkc.a($$0, $$1);
    }

    private static Dynamic<?> a(Dynamic<?> $$0, Dynamic<?> $$1, List<Dynamic<?>> $$2) {
        int $$5;
        int $$6;
        long $$3 = $$1.asLongStream().count() * 64L;
        long $$4 = $$3 / 4096L;
        if ($$4 > (long)($$6 = bkc.a($$5 = $$2.size()))) {
            Dynamic $$7 = $$0.createMap((Map)ImmutableMap.of((Object)$$0.createString("Name"), (Object)$$0.createString("minecraft:air")));
            int $$8 = (1 << (int)($$4 - 1L)) + 1;
            int $$9 = $$8 - $$5;
            for (int $$10 = 0; $$10 < $$9; ++$$10) {
                $$2.add($$7);
            }
            return $$0.createList($$2.stream());
        }
        return $$0;
    }

    public static int a(int $$0) {
        if ($$0 == 0) {
            return 0;
        }
        return (int)Math.ceil(Math.log($$0) / Math.log(2.0));
    }

    private static /* synthetic */ Dynamic a(Set $$0, Dynamic $$1, int $$22, Dynamic[] $$3, IntSet $$4, MutableObject $$5, Dynamic $$6) {
        int $$7 = $$6.get("Y").asInt(0);
        Dynamic $$8 = (Dynamic)DataFixUtils.orElse($$6.get("Palette").result().flatMap($$2 -> {
            $$2.asStream().map($$0 -> $$0.get("Name").asString("minecraft:air")).forEach($$0::add);
            return $$6.get("BlockStates").result().map($$1 -> bkc.b($$2, $$1));
        }), (Object)$$1);
        Dynamic $$9 = $$6;
        int $$10 = $$7 - $$22;
        if ($$10 >= 0 && $$10 < $$3.length) {
            $$9 = $$9.set("biomes", $$3[$$10]);
        }
        $$4.add($$7);
        if ($$6.get("Y").asInt(Integer.MAX_VALUE) == 0) {
            $$5.setValue(() -> {
                List $$1 = $$8.get("palette").asList(Function.identity());
                long[] $$2 = $$8.get("data").asLongStream().toArray();
                return new bkf.a($$1, $$2);
            });
        }
        return $$9.set("block_states", $$8).remove("Palette").remove("BlockStates");
    }

    static {
        s.put(0, (Object)"minecraft:ocean");
        s.put(1, (Object)c);
        s.put(2, (Object)"minecraft:desert");
        s.put(3, (Object)"minecraft:mountains");
        s.put(4, (Object)"minecraft:forest");
        s.put(5, (Object)"minecraft:taiga");
        s.put(6, (Object)"minecraft:swamp");
        s.put(7, (Object)"minecraft:river");
        s.put(8, (Object)"minecraft:nether_wastes");
        s.put(9, (Object)"minecraft:the_end");
        s.put(10, (Object)"minecraft:frozen_ocean");
        s.put(11, (Object)"minecraft:frozen_river");
        s.put(12, (Object)"minecraft:snowy_tundra");
        s.put(13, (Object)"minecraft:snowy_mountains");
        s.put(14, (Object)"minecraft:mushroom_fields");
        s.put(15, (Object)"minecraft:mushroom_field_shore");
        s.put(16, (Object)"minecraft:beach");
        s.put(17, (Object)"minecraft:desert_hills");
        s.put(18, (Object)"minecraft:wooded_hills");
        s.put(19, (Object)"minecraft:taiga_hills");
        s.put(20, (Object)"minecraft:mountain_edge");
        s.put(21, (Object)"minecraft:jungle");
        s.put(22, (Object)"minecraft:jungle_hills");
        s.put(23, (Object)"minecraft:jungle_edge");
        s.put(24, (Object)"minecraft:deep_ocean");
        s.put(25, (Object)"minecraft:stone_shore");
        s.put(26, (Object)"minecraft:snowy_beach");
        s.put(27, (Object)"minecraft:birch_forest");
        s.put(28, (Object)"minecraft:birch_forest_hills");
        s.put(29, (Object)"minecraft:dark_forest");
        s.put(30, (Object)"minecraft:snowy_taiga");
        s.put(31, (Object)"minecraft:snowy_taiga_hills");
        s.put(32, (Object)"minecraft:giant_tree_taiga");
        s.put(33, (Object)"minecraft:giant_tree_taiga_hills");
        s.put(34, (Object)"minecraft:wooded_mountains");
        s.put(35, (Object)"minecraft:savanna");
        s.put(36, (Object)"minecraft:savanna_plateau");
        s.put(37, (Object)"minecraft:badlands");
        s.put(38, (Object)"minecraft:wooded_badlands_plateau");
        s.put(39, (Object)"minecraft:badlands_plateau");
        s.put(40, (Object)"minecraft:small_end_islands");
        s.put(41, (Object)"minecraft:end_midlands");
        s.put(42, (Object)"minecraft:end_highlands");
        s.put(43, (Object)"minecraft:end_barrens");
        s.put(44, (Object)"minecraft:warm_ocean");
        s.put(45, (Object)"minecraft:lukewarm_ocean");
        s.put(46, (Object)"minecraft:cold_ocean");
        s.put(47, (Object)"minecraft:deep_warm_ocean");
        s.put(48, (Object)"minecraft:deep_lukewarm_ocean");
        s.put(49, (Object)"minecraft:deep_cold_ocean");
        s.put(50, (Object)"minecraft:deep_frozen_ocean");
        s.put(127, (Object)"minecraft:the_void");
        s.put(129, (Object)"minecraft:sunflower_plains");
        s.put(130, (Object)"minecraft:desert_lakes");
        s.put(131, (Object)"minecraft:gravelly_mountains");
        s.put(132, (Object)"minecraft:flower_forest");
        s.put(133, (Object)"minecraft:taiga_mountains");
        s.put(134, (Object)"minecraft:swamp_hills");
        s.put(140, (Object)"minecraft:ice_spikes");
        s.put(149, (Object)"minecraft:modified_jungle");
        s.put(151, (Object)"minecraft:modified_jungle_edge");
        s.put(155, (Object)"minecraft:tall_birch_forest");
        s.put(156, (Object)"minecraft:tall_birch_hills");
        s.put(157, (Object)"minecraft:dark_forest_hills");
        s.put(158, (Object)"minecraft:snowy_taiga_mountains");
        s.put(160, (Object)"minecraft:giant_spruce_taiga");
        s.put(161, (Object)"minecraft:giant_spruce_taiga_hills");
        s.put(162, (Object)"minecraft:modified_gravelly_mountains");
        s.put(163, (Object)"minecraft:shattered_savanna");
        s.put(164, (Object)"minecraft:shattered_savanna_plateau");
        s.put(165, (Object)"minecraft:eroded_badlands");
        s.put(166, (Object)"minecraft:modified_wooded_badlands_plateau");
        s.put(167, (Object)"minecraft:modified_badlands_plateau");
        s.put(168, (Object)"minecraft:bamboo_jungle");
        s.put(169, (Object)"minecraft:bamboo_jungle_hills");
        s.put(170, (Object)"minecraft:soul_sand_valley");
        s.put(171, (Object)"minecraft:crimson_forest");
        s.put(172, (Object)"minecraft:warped_forest");
        s.put(173, (Object)"minecraft:basalt_deltas");
        s.put(174, (Object)"minecraft:dripstone_caves");
        s.put(175, (Object)"minecraft:lush_caves");
        s.put(177, (Object)"minecraft:meadow");
        s.put(178, (Object)"minecraft:grove");
        s.put(179, (Object)"minecraft:snowy_slopes");
        s.put(180, (Object)"minecraft:snowcapped_peaks");
        s.put(181, (Object)"minecraft:lofty_peaks");
        s.put(182, (Object)"minecraft:stony_peaks");
    }
}

