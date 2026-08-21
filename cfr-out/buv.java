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

public class buv
extends bsh {
    public buv(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
        Map $$1 = super.registerBlockEntities($$0);
        this.register($$1, "minecraft:sign", () -> buv.a($$0));
        return $$1;
    }

    public static TypeTemplate a(Schema $$0) {
        return DSL.optionalFields((String)"front_text", (TypeTemplate)DSL.optionalFields((String)"messages", (TypeTemplate)DSL.list((TypeTemplate)bqh.D.in($$0)), (String)"filtered_messages", (TypeTemplate)DSL.list((TypeTemplate)bqh.D.in($$0))), (String)"back_text", (TypeTemplate)DSL.optionalFields((String)"messages", (TypeTemplate)DSL.list((TypeTemplate)bqh.D.in($$0)), (String)"filtered_messages", (TypeTemplate)DSL.list((TypeTemplate)bqh.D.in($$0))));
    }
}

