/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bvw
extends bsh {
    public bvw(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(true, bqh.E, () -> DSL.optional((TypeTemplate)DSL.field((String)"equipment", (TypeTemplate)DSL.optionalFields((Pair[])new Pair[]{Pair.of((Object)"mainhand", (Object)bqh.x.in($$0)), Pair.of((Object)"offhand", (Object)bqh.x.in($$0)), Pair.of((Object)"feet", (Object)bqh.x.in($$0)), Pair.of((Object)"legs", (Object)bqh.x.in($$0)), Pair.of((Object)"chest", (Object)bqh.x.in($$0)), Pair.of((Object)"head", (Object)bqh.x.in($$0)), Pair.of((Object)"body", (Object)bqh.x.in($$0)), Pair.of((Object)"saddle", (Object)bqh.x.in($$0))}))));
    }
}

