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

public class bvx
extends bsh {
    public bvx(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
        Map $$1 = super.registerBlockEntities($$0);
        $$0.registerSimple($$1, "minecraft:test_block");
        $$0.register($$1, "minecraft:test_instance_block", () -> DSL.optionalFields((String)"data", (TypeTemplate)DSL.optionalFields((String)"error_message", (TypeTemplate)bqh.D.in($$0)), (String)"errors", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"text", (TypeTemplate)bqh.D.in($$0)))));
        return $$1;
    }
}

