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

public class bso
extends Schema {
    public bso(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(false, bqh.c, () -> DSL.optionalFields((String)"RootVehicle", (TypeTemplate)DSL.optionalFields((String)"Entity", (TypeTemplate)bqh.G.in($$0)), (String)"ender_pearls", (TypeTemplate)DSL.list((TypeTemplate)bqh.G.in($$0)), (String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)), (String)"EnderItems", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0))));
        $$0.registerType(true, bqh.G, () -> DSL.optionalFields((String)"Passengers", (TypeTemplate)DSL.list((TypeTemplate)bqh.G.in($$0)), (TypeTemplate)bqh.H.in($$0)));
    }
}

