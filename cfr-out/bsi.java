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

public class bsi
extends Schema {
    public bsi(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(true, bqh.E, () -> DSL.and((TypeTemplate)DSL.optional((TypeTemplate)DSL.field((String)"ArmorItems", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)))), (TypeTemplate[])new TypeTemplate[]{DSL.optional((TypeTemplate)DSL.field((String)"HandItems", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)))), DSL.optional((TypeTemplate)DSL.field((String)"body_armor_item", (TypeTemplate)bqh.x.in($$0))), DSL.optional((TypeTemplate)DSL.field((String)"saddle", (TypeTemplate)bqh.x.in($$0)))}));
    }
}

