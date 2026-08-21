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

public class bvy
extends bsh {
    public bvy(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        Map $$1 = super.registerEntities($$0);
        $$1.remove("minecraft:potion");
        $$0.register($$1, "minecraft:splash_potion", () -> DSL.optionalFields((String)"Item", (TypeTemplate)bqh.x.in($$0)));
        $$0.register($$1, "minecraft:lingering_potion", () -> DSL.optionalFields((String)"Item", (TypeTemplate)bqh.x.in($$0)));
        return $$1;
    }
}

