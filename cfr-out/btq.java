/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class btq
extends bsh {
    public btq(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    private static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)), (String)"CustomName", (TypeTemplate)bqh.D.in($$0), (String)"RecipesUsed", (TypeTemplate)DSL.compoundList((TypeTemplate)bqh.P.in($$0), (TypeTemplate)DSL.constType((Type)DSL.intType()))));
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
        Map $$1 = super.registerBlockEntities($$0);
        btq.a($$0, $$1, "minecraft:furnace");
        btq.a($$0, $$1, "minecraft:smoker");
        btq.a($$0, $$1, "minecraft:blast_furnace");
        return $$1;
    }
}

