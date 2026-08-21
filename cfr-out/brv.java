/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Set;

public class brv
extends DataFix {
    private static final Set<String> a = ImmutableSet.of((Object)"minecraft:andesite_wall", (Object)"minecraft:brick_wall", (Object)"minecraft:cobblestone_wall", (Object)"minecraft:diorite_wall", (Object)"minecraft:end_stone_brick_wall", (Object)"minecraft:granite_wall", (Object[])new String[]{"minecraft:mossy_cobblestone_wall", "minecraft:mossy_stone_brick_wall", "minecraft:nether_brick_wall", "minecraft:prismarine_wall", "minecraft:red_nether_brick_wall", "minecraft:red_sandstone_wall", "minecraft:sandstone_wall", "minecraft:stone_brick_wall"});

    public brv(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("WallPropertyFix", this.getInputSchema().getType(bqh.y), $$0 -> $$0.update(DSL.remainderFinder(), brv::a));
    }

    private static String a(String $$0) {
        return "true".equals($$0) ? "low" : "none";
    }

    private static <T> Dynamic<T> a(Dynamic<T> $$02, String $$1) {
        return $$02.update($$1, $$0 -> (Dynamic)DataFixUtils.orElse($$0.asString().result().map(brv::a).map(arg_0 -> ((Dynamic)$$0).createString(arg_0)), (Object)$$0));
    }

    private static <T> Dynamic<T> a(Dynamic<T> $$02) {
        boolean $$1 = $$02.get("Name").asString().result().filter(a::contains).isPresent();
        if (!$$1) {
            return $$02;
        }
        return $$02.update("Properties", $$0 -> {
            Dynamic $$1 = brv.a($$0, "east");
            $$1 = brv.a($$1, "west");
            $$1 = brv.a($$1, "north");
            return brv.a($$1, "south");
        });
    }
}

