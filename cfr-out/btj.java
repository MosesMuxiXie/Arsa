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

public class btj
extends bsh {
    public btj(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
        Map $$12 = super.registerBlockEntities($$0);
        btj.a($$0, $$12, "minecraft:barrel");
        btj.a($$0, $$12, "minecraft:smoker");
        btj.a($$0, $$12, "minecraft:blast_furnace");
        $$0.register($$12, "minecraft:lectern", $$1 -> DSL.optionalFields((String)"Book", (TypeTemplate)bqh.x.in($$0)));
        $$0.registerSimple($$12, "minecraft:bell");
        return $$12;
    }

    protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> bsx.a($$0));
    }
}

