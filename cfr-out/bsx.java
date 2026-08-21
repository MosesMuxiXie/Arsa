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

public class bsx
extends bsh {
    public bsx(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(true, bqh.H, () -> DSL.and((TypeTemplate)bqh.E.in($$0), (TypeTemplate)DSL.optionalFields((String)"CustomName", (TypeTemplate)bqh.D.in($$0), (TypeTemplate)DSL.taggedChoiceLazy((String)"id", bsx.a(), (Map)$$1))));
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
        Map $$1 = super.registerBlockEntities($$0);
        $$0.register($$1, "minecraft:beacon", () -> bsx.b($$0));
        $$0.register($$1, "minecraft:banner", () -> bsx.b($$0));
        $$0.register($$1, "minecraft:brewing_stand", () -> bsx.a($$0));
        $$0.register($$1, "minecraft:chest", () -> bsx.a($$0));
        $$0.register($$1, "minecraft:trapped_chest", () -> bsx.a($$0));
        $$0.register($$1, "minecraft:dispenser", () -> bsx.a($$0));
        $$0.register($$1, "minecraft:dropper", () -> bsx.a($$0));
        $$0.register($$1, "minecraft:enchanting_table", () -> bsx.b($$0));
        $$0.register($$1, "minecraft:furnace", () -> bsx.a($$0));
        $$0.register($$1, "minecraft:hopper", () -> bsx.a($$0));
        $$0.register($$1, "minecraft:shulker_box", () -> bsx.a($$0));
        return $$1;
    }

    public static TypeTemplate a(Schema $$0) {
        return DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)), (String)"CustomName", (TypeTemplate)bqh.D.in($$0));
    }

    public static TypeTemplate b(Schema $$0) {
        return DSL.optionalFields((String)"CustomName", (TypeTemplate)bqh.D.in($$0));
    }
}

