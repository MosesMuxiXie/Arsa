/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bug
extends bsh {
    public bug(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(false, bqh.d, () -> DSL.fields((String)"Level", (TypeTemplate)DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)bqh.G.in($$0)), (String)"TileEntities", (TypeTemplate)DSL.list((TypeTemplate)DSL.or((TypeTemplate)bqh.w.in($$0), (TypeTemplate)DSL.remainder())), (String)"TileTicks", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"i", (TypeTemplate)bqh.I.in($$0))), (String)"Sections", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"biomes", (TypeTemplate)DSL.optionalFields((String)"palette", (TypeTemplate)DSL.list((TypeTemplate)bqh.Q.in($$0))), (String)"block_states", (TypeTemplate)DSL.optionalFields((String)"palette", (TypeTemplate)DSL.list((TypeTemplate)bqh.y.in($$0))))), (String)"Structures", (TypeTemplate)DSL.optionalFields((String)"Starts", (TypeTemplate)DSL.compoundList((TypeTemplate)bqh.M.in($$0))))));
        $$0.registerType(false, bqh.R, () -> DSL.constType(bug.a()));
        $$0.registerType(false, bqh.S, () -> DSL.fields((String)"dimensions", (TypeTemplate)DSL.compoundList((TypeTemplate)DSL.constType(bug.a()), (TypeTemplate)DSL.fields((String)"generator", (TypeTemplate)DSL.taggedChoiceLazy((String)"type", (Type)DSL.string(), (Map)ImmutableMap.of((Object)"minecraft:debug", DSL::remainder, (Object)"minecraft:flat", () -> DSL.optionalFields((String)"settings", (TypeTemplate)DSL.optionalFields((String)"biome", (TypeTemplate)bqh.Q.in($$0), (String)"layers", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"block", (TypeTemplate)bqh.I.in($$0))))), (Object)"minecraft:noise", () -> DSL.optionalFields((String)"biome_source", (TypeTemplate)DSL.taggedChoiceLazy((String)"type", (Type)DSL.string(), (Map)ImmutableMap.of((Object)"minecraft:fixed", () -> DSL.fields((String)"biome", (TypeTemplate)bqh.Q.in($$0)), (Object)"minecraft:multi_noise", () -> DSL.or((TypeTemplate)DSL.fields((String)"preset", (TypeTemplate)bqh.R.in($$0)), (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"biome", (TypeTemplate)bqh.Q.in($$0)))), (Object)"minecraft:checkerboard", () -> DSL.fields((String)"biomes", (TypeTemplate)DSL.list((TypeTemplate)bqh.Q.in($$0))), (Object)"minecraft:the_end", DSL::remainder)), (String)"settings", (TypeTemplate)DSL.or((TypeTemplate)DSL.constType((Type)DSL.string()), (TypeTemplate)DSL.optionalFields((String)"default_block", (TypeTemplate)bqh.I.in($$0), (String)"default_fluid", (TypeTemplate)bqh.I.in($$0))))))))));
    }
}

