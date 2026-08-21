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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;
import java.util.function.Supplier;

public class bvk
extends bsh {
    public bvk(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public static SequencedMap<String, Supplier<TypeTemplate>> a(Schema $$0) {
        LinkedHashMap<String, Supplier<TypeTemplate>> $$1 = new LinkedHashMap<String, Supplier<TypeTemplate>>();
        $$1.put("minecraft:bees", () -> DSL.list((TypeTemplate)DSL.optionalFields((String)"entity_data", (TypeTemplate)bqh.G.in($$0))));
        $$1.put("minecraft:block_entity_data", () -> bqh.w.in($$0));
        $$1.put("minecraft:bundle_contents", () -> DSL.list((TypeTemplate)bqh.x.in($$0)));
        $$1.put("minecraft:can_break", () -> DSL.optionalFields((String)"predicates", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"blocks", (TypeTemplate)DSL.or((TypeTemplate)bqh.I.in($$0), (TypeTemplate)DSL.list((TypeTemplate)bqh.I.in($$0)))))));
        $$1.put("minecraft:can_place_on", () -> DSL.optionalFields((String)"predicates", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"blocks", (TypeTemplate)DSL.or((TypeTemplate)bqh.I.in($$0), (TypeTemplate)DSL.list((TypeTemplate)bqh.I.in($$0)))))));
        $$1.put("minecraft:charged_projectiles", () -> DSL.list((TypeTemplate)bqh.x.in($$0)));
        $$1.put("minecraft:container", () -> DSL.list((TypeTemplate)DSL.optionalFields((String)"item", (TypeTemplate)bqh.x.in($$0))));
        $$1.put("minecraft:entity_data", () -> bqh.G.in($$0));
        $$1.put("minecraft:pot_decorations", () -> DSL.list((TypeTemplate)bqh.J.in($$0)));
        $$1.put("minecraft:food", () -> DSL.optionalFields((String)"using_converts_to", (TypeTemplate)bqh.x.in($$0)));
        $$1.put("minecraft:custom_name", () -> bqh.D.in($$0));
        $$1.put("minecraft:item_name", () -> bqh.D.in($$0));
        $$1.put("minecraft:lore", () -> DSL.list((TypeTemplate)bqh.D.in($$0)));
        $$1.put("minecraft:written_book_content", () -> DSL.optionalFields((String)"pages", (TypeTemplate)DSL.list((TypeTemplate)DSL.or((TypeTemplate)DSL.optionalFields((String)"raw", (TypeTemplate)bqh.D.in($$0), (String)"filtered", (TypeTemplate)bqh.D.in($$0)), (TypeTemplate)bqh.D.in($$0)))));
        return $$1;
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(true, bqh.A, () -> DSL.optionalFieldsLazy(bvk.a($$0)));
    }
}

