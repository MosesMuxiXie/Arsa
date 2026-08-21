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

public class bus
extends bsh {
    public bus(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
        Map $$1 = super.registerBlockEntities($$0);
        $$0.register($$1, "minecraft:decorated_pot", () -> DSL.optionalFields((String)"shards", (TypeTemplate)DSL.list((TypeTemplate)bqh.J.in($$0)), (String)"item", (TypeTemplate)bqh.x.in($$0)));
        $$0.register($$1, "minecraft:suspicious_sand", () -> DSL.optionalFields((String)"item", (TypeTemplate)bqh.x.in($$0)));
        return $$1;
    }
}

