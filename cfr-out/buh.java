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

public class buh
extends bsh {
    public buh(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(false, bqh.d, () -> DSL.optionalFields((String)"entities", (TypeTemplate)DSL.list((TypeTemplate)bqh.G.in($$0)), (String)"block_entities", (TypeTemplate)DSL.list((TypeTemplate)DSL.or((TypeTemplate)bqh.w.in($$0), (TypeTemplate)DSL.remainder())), (String)"block_ticks", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"i", (TypeTemplate)bqh.I.in($$0))), (String)"sections", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"biomes", (TypeTemplate)DSL.optionalFields((String)"palette", (TypeTemplate)DSL.list((TypeTemplate)bqh.Q.in($$0))), (String)"block_states", (TypeTemplate)DSL.optionalFields((String)"palette", (TypeTemplate)DSL.list((TypeTemplate)bqh.y.in($$0))))), (String)"structures", (TypeTemplate)DSL.optionalFields((String)"starts", (TypeTemplate)DSL.compoundList((TypeTemplate)bqh.M.in($$0)))));
    }
}

