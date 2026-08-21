/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.shorts.ShortArrayList
 *  it.unimi.dsi.fastutil.shorts.ShortList
 */
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class bkl
extends DataFix {
    private static final int a = 16;

    public bkl(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public TypeRewriteRule makeRule() {
        return this.writeFixAndRead("ChunkToProtoChunkFix", this.getInputSchema().getType(bqh.d), this.getOutputSchema().getType(bqh.d), $$0 -> $$0.update("Level", bkl::a));
    }

    private static <T> Dynamic<T> a(Dynamic<T> $$0) {
        String $$5;
        boolean $$2;
        boolean $$1 = $$0.get("TerrainPopulated").asBoolean(false);
        boolean bl2 = $$2 = $$0.get("LightPopulated").asNumber().result().isEmpty() || $$0.get("LightPopulated").asBoolean(false);
        if ($$1) {
            if ($$2) {
                String $$3 = "mobs_spawned";
            } else {
                String $$4 = "decorated";
            }
        } else {
            $$5 = "carved";
        }
        return bkl.c(bkl.b($$0)).set("Status", $$0.createString($$5)).set("hasLegacyStructureData", $$0.createBoolean(true));
    }

    private static <T> Dynamic<T> b(Dynamic<T> $$0) {
        return $$0.update("Biomes", $$12 -> (Dynamic)DataFixUtils.orElse($$12.asByteBufferOpt().result().map($$1 -> {
            int[] $$2 = new int[256];
            for (int $$3 = 0; $$3 < $$2.length; ++$$3) {
                if ($$3 >= $$1.capacity()) continue;
                $$2[$$3] = $$1.get($$3) & 0xFF;
            }
            return $$0.createIntList(Arrays.stream($$2));
        }), (Object)$$12));
    }

    private static <T> Dynamic<T> c(Dynamic<T> $$0) {
        return (Dynamic)DataFixUtils.orElse($$0.get("TileTicks").asStreamOpt().result().map($$13 -> {
            List $$2 = IntStream.range(0, 16).mapToObj($$0 -> new ShortArrayList()).collect(Collectors.toList());
            $$13.forEach($$1 -> {
                int $$2 = $$1.get("x").asInt(0);
                int $$3 = $$1.get("y").asInt(0);
                int $$4 = $$1.get("z").asInt(0);
                short $$5 = bkl.a($$2, $$3, $$4);
                ((ShortList)$$2.get($$3 >> 4)).add($$5);
            });
            return $$0.remove("TileTicks").set("ToBeTicked", $$0.createList($$2.stream().map($$12 -> $$0.createList($$12.intStream().mapToObj($$1 -> $$0.createShort((short)$$1))))));
        }), $$0);
    }

    private static short a(int $$0, int $$1, int $$2) {
        return (short)($$0 & 0xF | ($$1 & 0xF) << 4 | ($$2 & 0xF) << 8);
    }
}

