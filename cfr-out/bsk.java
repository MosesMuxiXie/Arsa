/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bsk
extends Schema {
    public bsk(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(false, bqh.P, () -> DSL.constType(bsh.a()));
        $$0.registerType(false, bqh.c, () -> DSL.optionalFields((Pair[])new Pair[]{Pair.of((Object)"RootVehicle", (Object)DSL.optionalFields((String)"Entity", (TypeTemplate)bqh.G.in($$0))), Pair.of((Object)"ender_pearls", (Object)DSL.list((TypeTemplate)bqh.G.in($$0))), Pair.of((Object)"Inventory", (Object)DSL.list((TypeTemplate)bqh.x.in($$0))), Pair.of((Object)"EnderItems", (Object)DSL.list((TypeTemplate)bqh.x.in($$0))), Pair.of((Object)"ShoulderEntityLeft", (Object)bqh.G.in($$0)), Pair.of((Object)"ShoulderEntityRight", (Object)bqh.G.in($$0)), Pair.of((Object)"recipeBook", (Object)DSL.optionalFields((String)"recipes", (TypeTemplate)DSL.list((TypeTemplate)bqh.P.in($$0)), (String)"toBeDisplayed", (TypeTemplate)DSL.list((TypeTemplate)bqh.P.in($$0))))}));
        $$0.registerType(false, bqh.e, () -> DSL.compoundList((TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0))));
    }
}

