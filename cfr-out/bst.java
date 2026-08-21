/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bst
extends bsh {
    public bst(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        Map $$12 = super.registerEntities($$0);
        $$0.registerSimple($$12, "minecraft:egg");
        $$0.registerSimple($$12, "minecraft:ender_pearl");
        $$0.registerSimple($$12, "minecraft:fireball");
        $$0.register($$12, "minecraft:potion", $$1 -> DSL.optionalFields((String)"Potion", (TypeTemplate)bqh.x.in($$0)));
        $$0.registerSimple($$12, "minecraft:small_fireball");
        $$0.registerSimple($$12, "minecraft:snowball");
        $$0.registerSimple($$12, "minecraft:wither_skull");
        $$0.registerSimple($$12, "minecraft:xp_bottle");
        $$0.register($$12, "minecraft:arrow", () -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)bqh.y.in($$0)));
        $$0.register($$12, "minecraft:enderman", () -> DSL.optionalFields((String)"carriedBlockState", (TypeTemplate)bqh.y.in($$0)));
        $$0.register($$12, "minecraft:falling_block", () -> DSL.optionalFields((String)"BlockState", (TypeTemplate)bqh.y.in($$0), (String)"TileEntityData", (TypeTemplate)bqh.w.in($$0)));
        $$0.register($$12, "minecraft:spectral_arrow", () -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)bqh.y.in($$0)));
        $$0.register($$12, "minecraft:chest_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)bqh.y.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0))));
        $$0.register($$12, "minecraft:commandblock_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)bqh.y.in($$0), (String)"LastOutput", (TypeTemplate)bqh.D.in($$0)));
        $$0.register($$12, "minecraft:furnace_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)bqh.y.in($$0)));
        $$0.register($$12, "minecraft:hopper_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)bqh.y.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0))));
        $$0.register($$12, "minecraft:minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)bqh.y.in($$0)));
        $$0.register($$12, "minecraft:spawner_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)bqh.y.in($$0), (TypeTemplate)bqh.L.in($$0)));
        $$0.register($$12, "minecraft:tnt_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)bqh.y.in($$0)));
        return $$12;
    }
}

