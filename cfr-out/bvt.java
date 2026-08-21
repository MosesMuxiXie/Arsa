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

public class bvt
extends bsh {
    public bvt(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(true, bqh.D, () -> DSL.or((TypeTemplate)DSL.or((TypeTemplate)DSL.constType((Type)DSL.string()), (TypeTemplate)DSL.list((TypeTemplate)bqh.D.in($$0))), (TypeTemplate)DSL.optionalFields((String)"extra", (TypeTemplate)DSL.list((TypeTemplate)bqh.D.in($$0)), (String)"separator", (TypeTemplate)bqh.D.in($$0), (String)"hoverEvent", (TypeTemplate)DSL.taggedChoice((String)"action", (Type)DSL.string(), Map.of("show_text", DSL.optionalFields((String)"contents", (TypeTemplate)bqh.D.in($$0)), "show_item", DSL.optionalFields((String)"contents", (TypeTemplate)DSL.or((TypeTemplate)bqh.x.in($$0), (TypeTemplate)bqh.J.in($$0))), "show_entity", DSL.optionalFields((String)"type", (TypeTemplate)bqh.F.in($$0), (String)"name", (TypeTemplate)bqh.D.in($$0)))))));
    }
}

