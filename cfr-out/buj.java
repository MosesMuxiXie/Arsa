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

public class buj
extends bsh {
    public buj(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.registerSimple($$1, $$2);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        Map $$1 = super.registerEntities($$0);
        buj.a($$0, $$1, "minecraft:frog");
        buj.a($$0, $$1, "minecraft:tadpole");
        return $$1;
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
        Map $$1 = super.registerBlockEntities($$0);
        $$0.register($$1, "minecraft:sculk_shrieker", () -> DSL.optionalFields((String)"listener", (TypeTemplate)DSL.optionalFields((String)"event", (TypeTemplate)DSL.optionalFields((String)"game_event", (TypeTemplate)bqh.K.in($$0)))));
        return $$1;
    }
}

