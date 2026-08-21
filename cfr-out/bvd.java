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

public class bvd
extends bsh {
    public bvd(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
        Map $$1 = super.registerBlockEntities($$0);
        $$0.register($$1, "minecraft:vault", () -> DSL.optionalFields((String)"config", (TypeTemplate)DSL.optionalFields((String)"key_item", (TypeTemplate)bqh.x.in($$0)), (String)"server_data", (TypeTemplate)DSL.optionalFields((String)"items_to_eject", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0))), (String)"shared_data", (TypeTemplate)DSL.optionalFields((String)"display_item", (TypeTemplate)bqh.x.in($$0))));
        return $$1;
    }
}

