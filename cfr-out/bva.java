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

public class bva
extends bsh {
    public bva(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    protected static TypeTemplate a(Schema $$0) {
        return DSL.optionalFields((String)"inBlockState", (TypeTemplate)bqh.y.in($$0), (String)"item", (TypeTemplate)bqh.x.in($$0));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        Map $$1 = super.registerEntities($$0);
        $$0.register($$1, "minecraft:trident", () -> bva.a($$0));
        $$0.register($$1, "minecraft:spectral_arrow", () -> bva.a($$0));
        $$0.register($$1, "minecraft:arrow", () -> bva.a($$0));
        return $$1;
    }
}

