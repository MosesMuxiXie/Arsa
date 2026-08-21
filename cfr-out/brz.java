/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicLike
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.OptionalDynamic
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.commons.lang3.math.NumberUtils
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicLike;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableInt;

public class brz
extends DataFix {
    private static final String a = "minecraft:village";
    private static final String b = "minecraft:desert_pyramid";
    private static final String c = "minecraft:igloo";
    private static final String d = "minecraft:jungle_pyramid";
    private static final String e = "minecraft:swamp_hut";
    private static final String f = "minecraft:pillager_outpost";
    private static final String g = "minecraft:endcity";
    private static final String h = "minecraft:mansion";
    private static final String i = "minecraft:monument";
    private static final ImmutableMap<String, a> j = ImmutableMap.builder().put((Object)"minecraft:village", (Object)new a(32, 8, 10387312)).put((Object)"minecraft:desert_pyramid", (Object)new a(32, 8, 14357617)).put((Object)"minecraft:igloo", (Object)new a(32, 8, 14357618)).put((Object)"minecraft:jungle_pyramid", (Object)new a(32, 8, 14357619)).put((Object)"minecraft:swamp_hut", (Object)new a(32, 8, 14357620)).put((Object)"minecraft:pillager_outpost", (Object)new a(32, 8, 165745296)).put((Object)"minecraft:monument", (Object)new a(32, 5, 10387313)).put((Object)"minecraft:endcity", (Object)new a(20, 11, 10387313)).put((Object)"minecraft:mansion", (Object)new a(80, 20, 10387319)).build();

    public brz(Schema $$0) {
        super($$0, true);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("WorldGenSettings building", this.getInputSchema().getType(bqh.S), $$0 -> $$0.update(DSL.remainderFinder(), brz::a));
    }

    private static <T> Dynamic<T> a(long $$0, DynamicLike<T> $$1, Dynamic<T> $$2, Dynamic<T> $$3) {
        return $$1.createMap((Map)ImmutableMap.of((Object)$$1.createString("type"), (Object)$$1.createString("minecraft:noise"), (Object)$$1.createString("biome_source"), $$3, (Object)$$1.createString("seed"), (Object)$$1.createLong($$0), (Object)$$1.createString("settings"), $$2));
    }

    private static <T> Dynamic<T> a(Dynamic<T> $$0, long $$1, boolean $$2, boolean $$3) {
        ImmutableMap.Builder $$4 = ImmutableMap.builder().put((Object)$$0.createString("type"), (Object)$$0.createString("minecraft:vanilla_layered")).put((Object)$$0.createString("seed"), (Object)$$0.createLong($$1)).put((Object)$$0.createString("large_biomes"), (Object)$$0.createBoolean($$3));
        if ($$2) {
            $$4.put((Object)$$0.createString("legacy_biome_init_layer"), (Object)$$0.createBoolean($$2));
        }
        return $$0.createMap((Map)$$4.build());
    }

    private static <T> Dynamic<T> a(Dynamic<T> $$02) {
        Dynamic<T> $$27;
        DynamicOps $$1 = $$02.getOps();
        long $$22 = $$02.get("RandomSeed").asLong(0L);
        Optional $$3 = $$02.get("generatorName").asString().map($$0 -> $$0.toLowerCase(Locale.ROOT)).result();
        Optional $$4 = $$02.get("legacy_custom_options").asString().result().map(Optional::of).orElseGet(() -> {
            if ($$3.equals(Optional.of("customized"))) {
                return $$02.get("generatorOptions").asString().result();
            }
            return Optional.empty();
        });
        boolean $$5 = false;
        if ($$3.equals(Optional.of("customized"))) {
            Dynamic<T> $$6 = brz.a($$02, $$22);
        } else if ($$3.isEmpty()) {
            Dynamic<T> $$7 = brz.a($$02, $$22);
        } else {
            switch ((String)$$3.get()) {
                case "flat": {
                    OptionalDynamic $$8 = $$02.get("generatorOptions");
                    Map<Dynamic<T>, Dynamic<T>> $$9 = brz.a($$1, $$8);
                    Dynamic $$10 = $$02.createMap((Map)ImmutableMap.of((Object)$$02.createString("type"), (Object)$$02.createString("minecraft:flat"), (Object)$$02.createString("settings"), (Object)$$02.createMap((Map)ImmutableMap.of((Object)$$02.createString("structures"), (Object)$$02.createMap($$9), (Object)$$02.createString("layers"), (Object)$$8.get("layers").result().orElseGet(() -> $$02.createList(Stream.of($$02.createMap((Map)ImmutableMap.of((Object)$$02.createString("height"), (Object)$$02.createInt(1), (Object)$$02.createString("block"), (Object)$$02.createString("minecraft:bedrock"))), $$02.createMap((Map)ImmutableMap.of((Object)$$02.createString("height"), (Object)$$02.createInt(2), (Object)$$02.createString("block"), (Object)$$02.createString("minecraft:dirt"))), $$02.createMap((Map)ImmutableMap.of((Object)$$02.createString("height"), (Object)$$02.createInt(1), (Object)$$02.createString("block"), (Object)$$02.createString("minecraft:grass_block")))))), (Object)$$02.createString("biome"), (Object)$$02.createString($$8.get("biome").asString("minecraft:plains"))))));
                    break;
                }
                case "debug_all_block_states": {
                    Dynamic $$11 = $$02.createMap((Map)ImmutableMap.of((Object)$$02.createString("type"), (Object)$$02.createString("minecraft:debug")));
                    break;
                }
                case "buffet": {
                    Dynamic $$21;
                    Dynamic $$17;
                    OptionalDynamic $$12 = $$02.get("generatorOptions");
                    OptionalDynamic $$13 = $$12.get("chunk_generator");
                    Optional $$14 = $$13.get("type").asString().result();
                    if (Objects.equals($$14, Optional.of("minecraft:caves"))) {
                        Dynamic $$15 = $$02.createString("minecraft:caves");
                        $$5 = true;
                    } else if (Objects.equals($$14, Optional.of("minecraft:floating_islands"))) {
                        Dynamic $$16 = $$02.createString("minecraft:floating_islands");
                    } else {
                        $$17 = $$02.createString("minecraft:overworld");
                    }
                    Dynamic $$18 = $$12.get("biome_source").result().orElseGet(() -> $$02.createMap((Map)ImmutableMap.of((Object)$$02.createString("type"), (Object)$$02.createString("minecraft:fixed"))));
                    if ($$18.get("type").asString().result().equals(Optional.of("minecraft:fixed"))) {
                        String $$19 = $$18.get("options").get("biomes").asStream().findFirst().flatMap($$0 -> $$0.asString().result()).orElse("minecraft:ocean");
                        Dynamic $$20 = $$18.remove("options").set("biome", $$02.createString($$19));
                    } else {
                        $$21 = $$18;
                    }
                    Dynamic<T> $$222 = brz.a($$22, $$02, $$17, $$21);
                    break;
                }
                default: {
                    boolean $$23 = ((String)$$3.get()).equals("default");
                    boolean $$24 = ((String)$$3.get()).equals("default_1_1") || $$23 && $$02.get("generatorVersion").asInt(0) == 0;
                    boolean $$25 = ((String)$$3.get()).equals("amplified");
                    boolean $$26 = ((String)$$3.get()).equals("largebiomes");
                    $$27 = brz.a($$22, $$02, $$02.createString($$25 ? "minecraft:amplified" : "minecraft:overworld"), brz.a($$02, $$22, $$24, $$26));
                }
            }
        }
        boolean $$28 = $$02.get("MapFeatures").asBoolean(true);
        boolean $$29 = $$02.get("BonusChest").asBoolean(false);
        ImmutableMap.Builder $$30 = ImmutableMap.builder();
        $$30.put($$1.createString("seed"), $$1.createLong($$22));
        $$30.put($$1.createString("generate_features"), $$1.createBoolean($$28));
        $$30.put($$1.createString("bonus_chest"), $$1.createBoolean($$29));
        $$30.put($$1.createString("dimensions"), brz.a($$02, $$22, $$27, $$5));
        $$4.ifPresent($$2 -> $$30.put($$1.createString("legacy_custom_options"), $$1.createString($$2)));
        return new Dynamic($$1, $$1.createMap((Map)$$30.build()));
    }

    protected static <T> Dynamic<T> a(Dynamic<T> $$0, long $$1) {
        return brz.a($$1, $$0, $$0.createString("minecraft:overworld"), brz.a($$0, $$1, false, false));
    }

    protected static <T> T a(Dynamic<T> $$0, long $$1, Dynamic<T> $$2, boolean $$3) {
        DynamicOps $$4 = $$0.getOps();
        return (T)$$4.createMap((Map)ImmutableMap.of((Object)$$4.createString("minecraft:overworld"), (Object)$$4.createMap((Map)ImmutableMap.of((Object)$$4.createString("type"), (Object)$$4.createString("minecraft:overworld" + ($$3 ? "_caves" : "")), (Object)$$4.createString("generator"), (Object)$$2.getValue())), (Object)$$4.createString("minecraft:the_nether"), (Object)$$4.createMap((Map)ImmutableMap.of((Object)$$4.createString("type"), (Object)$$4.createString("minecraft:the_nether"), (Object)$$4.createString("generator"), (Object)brz.a($$1, $$0, $$0.createString("minecraft:nether"), $$0.createMap((Map)ImmutableMap.of((Object)$$0.createString("type"), (Object)$$0.createString("minecraft:multi_noise"), (Object)$$0.createString("seed"), (Object)$$0.createLong($$1), (Object)$$0.createString("preset"), (Object)$$0.createString("minecraft:nether")))).getValue())), (Object)$$4.createString("minecraft:the_end"), (Object)$$4.createMap((Map)ImmutableMap.of((Object)$$4.createString("type"), (Object)$$4.createString("minecraft:the_end"), (Object)$$4.createString("generator"), (Object)brz.a($$1, $$0, $$0.createString("minecraft:end"), $$0.createMap((Map)ImmutableMap.of((Object)$$0.createString("type"), (Object)$$0.createString("minecraft:the_end"), (Object)$$0.createString("seed"), (Object)$$0.createLong($$1)))).getValue()))));
    }

    private static <T> Map<Dynamic<T>, Dynamic<T>> a(DynamicOps<T> $$0, OptionalDynamic<T> $$12) {
        MutableInt $$2 = new MutableInt(32);
        MutableInt $$3 = new MutableInt(3);
        MutableInt $$4 = new MutableInt(128);
        MutableBoolean $$5 = new MutableBoolean(false);
        HashMap $$6 = Maps.newHashMap();
        if ($$12.result().isEmpty()) {
            $$5.setTrue();
            $$6.put(a, (a)j.get((Object)a));
        }
        $$12.get("structures").flatMap(Dynamic::getMapValues).ifSuccess($$52 -> $$52.forEach(($$5, $$6) -> $$6.getMapValues().result().ifPresent($$62 -> $$62.forEach(($$6, $$7) -> {
            String $$8 = $$5.asString("");
            String $$9 = $$6.asString("");
            String $$10 = $$7.asString("");
            if ("stronghold".equals($$8)) {
                $$5.setTrue();
                switch ($$9) {
                    case "distance": {
                        $$2.setValue(brz.a($$10, $$2.intValue(), 1));
                        return;
                    }
                    case "spread": {
                        $$3.setValue(brz.a($$10, $$3.intValue(), 1));
                        return;
                    }
                    case "count": {
                        $$4.setValue(brz.a($$10, $$4.intValue(), 1));
                        return;
                    }
                }
                return;
            }
            switch ($$9) {
                case "distance": {
                    switch ($$8) {
                        case "village": {
                            brz.a($$6, a, $$10, 9);
                            return;
                        }
                        case "biome_1": {
                            brz.a($$6, b, $$10, 9);
                            brz.a($$6, c, $$10, 9);
                            brz.a($$6, d, $$10, 9);
                            brz.a($$6, e, $$10, 9);
                            brz.a($$6, f, $$10, 9);
                            return;
                        }
                        case "endcity": {
                            brz.a($$6, g, $$10, 1);
                            return;
                        }
                        case "mansion": {
                            brz.a($$6, h, $$10, 1);
                            return;
                        }
                    }
                    return;
                }
                case "separation": {
                    if ("oceanmonument".equals($$8)) {
                        a $$11 = $$6.getOrDefault(i, (a)j.get((Object)i));
                        int $$12 = brz.a($$10, $$11.c, 1);
                        $$6.put(i, new a($$12, $$11.c, $$11.d));
                    }
                    return;
                }
                case "spacing": {
                    if ("oceanmonument".equals($$8)) {
                        brz.a($$6, i, $$10, 1);
                    }
                    return;
                }
            }
        }))));
        ImmutableMap.Builder $$7 = ImmutableMap.builder();
        $$7.put((Object)$$12.createString("structures"), (Object)$$12.createMap($$6.entrySet().stream().collect(Collectors.toMap($$1 -> $$12.createString((String)$$1.getKey()), $$1 -> ((a)$$1.getValue()).a($$0)))));
        if ($$5.isTrue()) {
            $$7.put((Object)$$12.createString("stronghold"), (Object)$$12.createMap((Map)ImmutableMap.of((Object)$$12.createString("distance"), (Object)$$12.createInt($$2.intValue()), (Object)$$12.createString("spread"), (Object)$$12.createInt($$3.intValue()), (Object)$$12.createString("count"), (Object)$$12.createInt($$4.intValue()))));
        }
        return $$7.build();
    }

    private static int a(String $$0, int $$1) {
        return NumberUtils.toInt((String)$$0, (int)$$1);
    }

    private static int a(String $$0, int $$1, int $$2) {
        return Math.max($$2, brz.a($$0, $$1));
    }

    private static void a(Map<String, a> $$0, String $$1, String $$2, int $$3) {
        a $$4 = $$0.getOrDefault($$1, (a)j.get((Object)$$1));
        int $$5 = brz.a($$2, $$4.b, $$3);
        $$0.put($$1, new a($$5, $$4.c, $$4.d));
    }

    static final class a {
        public static final Codec<a> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.INT.fieldOf("spacing").forGetter($$0 -> $$0.b), (App)Codec.INT.fieldOf("separation").forGetter($$0 -> $$0.c), (App)Codec.INT.fieldOf("salt").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, a::new));
        final int b;
        final int c;
        final int d;

        public a(int $$0, int $$1, int $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public <T> Dynamic<T> a(DynamicOps<T> $$0) {
            return new Dynamic($$0, a.encodeStart($$0, (Object)this).result().orElse($$0.emptyMap()));
        }
    }
}

