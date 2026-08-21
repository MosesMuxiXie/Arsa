/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.LongStream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class bre
extends DataFix {
    private static final Logger a = LogUtils.getLogger();
    private static final Map<String, a> b = ImmutableMap.builder().put((Object)"mineshaft", (Object)bre$a.a(Map.of(List.of("minecraft:badlands", "minecraft:eroded_badlands", "minecraft:wooded_badlands"), "minecraft:mineshaft_mesa"), "minecraft:mineshaft")).put((Object)"shipwreck", (Object)bre$a.a(Map.of(List.of("minecraft:beach", "minecraft:snowy_beach"), "minecraft:shipwreck_beached"), "minecraft:shipwreck")).put((Object)"ocean_ruin", (Object)bre$a.a(Map.of(List.of("minecraft:warm_ocean", "minecraft:lukewarm_ocean", "minecraft:deep_lukewarm_ocean"), "minecraft:ocean_ruin_warm"), "minecraft:ocean_ruin_cold")).put((Object)"village", (Object)bre$a.a(Map.of(List.of("minecraft:desert"), "minecraft:village_desert", List.of("minecraft:savanna"), "minecraft:village_savanna", List.of("minecraft:snowy_plains"), "minecraft:village_snowy", List.of("minecraft:taiga"), "minecraft:village_taiga"), "minecraft:village_plains")).put((Object)"ruined_portal", (Object)bre$a.a(Map.of(List.of("minecraft:desert"), "minecraft:ruined_portal_desert", List.of("minecraft:badlands", "minecraft:eroded_badlands", "minecraft:wooded_badlands", "minecraft:windswept_hills", "minecraft:windswept_forest", "minecraft:windswept_gravelly_hills", "minecraft:savanna_plateau", "minecraft:windswept_savanna", "minecraft:stony_shore", "minecraft:meadow", "minecraft:frozen_peaks", "minecraft:jagged_peaks", "minecraft:stony_peaks", "minecraft:snowy_slopes"), "minecraft:ruined_portal_mountain", List.of("minecraft:bamboo_jungle", "minecraft:jungle", "minecraft:sparse_jungle"), "minecraft:ruined_portal_jungle", List.of("minecraft:deep_frozen_ocean", "minecraft:deep_cold_ocean", "minecraft:deep_ocean", "minecraft:deep_lukewarm_ocean", "minecraft:frozen_ocean", "minecraft:ocean", "minecraft:cold_ocean", "minecraft:lukewarm_ocean", "minecraft:warm_ocean"), "minecraft:ruined_portal_ocean"), "minecraft:ruined_portal")).put((Object)"pillager_outpost", (Object)bre$a.a("minecraft:pillager_outpost")).put((Object)"mansion", (Object)bre$a.a("minecraft:mansion")).put((Object)"jungle_pyramid", (Object)bre$a.a("minecraft:jungle_pyramid")).put((Object)"desert_pyramid", (Object)bre$a.a("minecraft:desert_pyramid")).put((Object)"igloo", (Object)bre$a.a("minecraft:igloo")).put((Object)"swamp_hut", (Object)bre$a.a("minecraft:swamp_hut")).put((Object)"stronghold", (Object)bre$a.a("minecraft:stronghold")).put((Object)"monument", (Object)bre$a.a("minecraft:monument")).put((Object)"fortress", (Object)bre$a.a("minecraft:fortress")).put((Object)"endcity", (Object)bre$a.a("minecraft:end_city")).put((Object)"buried_treasure", (Object)bre$a.a("minecraft:buried_treasure")).put((Object)"nether_fossil", (Object)bre$a.a("minecraft:nether_fossil")).put((Object)"bastion_remnant", (Object)bre$a.a("minecraft:bastion_remnant")).build();

    public bre(Schema $$0) {
        super($$0, false);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.d);
        Type $$1 = this.getInputSchema().getType(bqh.d);
        return this.writeFixAndRead("StucturesToConfiguredStructures", $$0, $$1, this::a);
    }

    private Dynamic<?> a(Dynamic<?> $$0) {
        return $$0.update("structures", $$12 -> $$12.update("starts", $$1 -> this.a((Dynamic<?>)$$1, $$0)).update("References", $$1 -> this.b((Dynamic<?>)$$1, $$0)));
    }

    private Dynamic<?> a(Dynamic<?> $$0, Dynamic<?> $$1) {
        Map<Dynamic, Dynamic> $$2 = $$0.getMapValues().result().orElse(Map.of());
        HashMap $$32 = Maps.newHashMap();
        $$2.forEach(($$22, $$3) -> {
            if ($$3.get("id").asString("INVALID").equals("INVALID")) {
                return;
            }
            Dynamic<?> $$4 = this.c((Dynamic<?>)$$22, $$1);
            if ($$4 == null) {
                a.warn("Encountered unknown structure in datafixer: {}", (Object)$$22.asString("<missing key>"));
                return;
            }
            $$32.computeIfAbsent($$4, $$2 -> $$3.set("id", $$4));
        });
        return $$1.createMap((Map)$$32);
    }

    private Dynamic<?> b(Dynamic<?> $$0, Dynamic<?> $$1) {
        Map<Dynamic, Dynamic> $$2 = $$0.getMapValues().result().orElse(Map.of());
        HashMap $$32 = Maps.newHashMap();
        $$2.forEach(($$22, $$3) -> {
            if ($$3.asLongStream().count() == 0L) {
                return;
            }
            Dynamic<?> $$4 = this.c((Dynamic<?>)$$22, $$1);
            if ($$4 == null) {
                a.warn("Encountered unknown structure in datafixer: {}", (Object)$$22.asString("<missing key>"));
                return;
            }
            $$32.compute($$4, ($$1, $$2) -> {
                if ($$2 == null) {
                    return $$3;
                }
                return $$3.createLongList(LongStream.concat($$2.asLongStream(), $$3.asLongStream()));
            });
        });
        return $$1.createMap((Map)$$32);
    }

    private @Nullable Dynamic<?> c(Dynamic<?> $$0, Dynamic<?> $$1) {
        Optional<String> $$5;
        String $$2 = $$0.asString("UNKNOWN").toLowerCase(Locale.ROOT);
        a $$3 = b.get($$2);
        if ($$3 == null) {
            return null;
        }
        String $$4 = $$3.b;
        if (!$$3.a().isEmpty() && ($$5 = this.a($$1, $$3)).isPresent()) {
            $$4 = $$5.get();
        }
        return $$1.createString($$4);
    }

    private Optional<String> a(Dynamic<?> $$0, a $$1) {
        Object2IntArrayMap $$2 = new Object2IntArrayMap();
        $$0.get("sections").asList(Function.identity()).forEach($$22 -> $$22.get("biomes").get("palette").asList(Function.identity()).forEach($$2 -> {
            String $$3 = $$1.a().get($$2.asString(""));
            if ($$3 != null) {
                $$2.mergeInt((Object)$$3, 1, Integer::sum);
            }
        }));
        return $$2.object2IntEntrySet().stream().max(Comparator.comparingInt(Object2IntMap.Entry::getIntValue)).map(Map.Entry::getKey);
    }

    static final class a
    extends Record {
        private final Map<String, String> a;
        final String b;

        private a(Map<String, String> $$0, String $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public static a a(String $$0) {
            return new a(Map.of(), $$0);
        }

        public static a a(Map<List<String>, String> $$0, String $$1) {
            return new a(bre$a.a($$0), $$1);
        }

        private static Map<String, String> a(Map<List<String>, String> $$0) {
            ImmutableMap.Builder $$1 = ImmutableMap.builder();
            for (Map.Entry<List<String>, String> $$22 : $$0.entrySet()) {
                $$22.getKey().forEach($$2 -> $$1.put($$2, (Object)((String)$$22.getValue())));
            }
            return $$1.build();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "biomeMapping;fallback", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "biomeMapping;fallback", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "biomeMapping;fallback", "a", "b"}, this, $$0);
        }

        public Map<String, String> a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }
}

