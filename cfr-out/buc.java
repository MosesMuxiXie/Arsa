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

public class buc
extends bsh {
    public buc(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        Map $$12 = super.registerEntities($$0);
        $$0.registerSimple($$12, "minecraft:glow_squid");
        $$0.register($$12, "minecraft:glow_item_frame", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)bqh.x.in($$0)));
        return $$12;
    }
}

