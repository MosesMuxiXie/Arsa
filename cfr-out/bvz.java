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
import java.util.SequencedMap;
import java.util.function.Supplier;

public class bvz
extends bsh {
    public bvz(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public static SequencedMap<String, Supplier<TypeTemplate>> a(Schema $$0) {
        SequencedMap<String, Supplier<TypeTemplate>> $$1 = bvp.a($$0);
        $$1.put("minecraft:can_place_on", () -> bvz.b($$0));
        $$1.put("minecraft:can_break", () -> bvz.b($$0));
        return $$1;
    }

    private static TypeTemplate b(Schema $$0) {
        TypeTemplate $$1 = DSL.optionalFields((String)"blocks", (TypeTemplate)DSL.or((TypeTemplate)bqh.I.in($$0), (TypeTemplate)DSL.list((TypeTemplate)bqh.I.in($$0))));
        return DSL.or((TypeTemplate)$$1, (TypeTemplate)DSL.list((TypeTemplate)$$1));
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(true, bqh.A, () -> DSL.optionalFieldsLazy(bvz.a($$0)));
    }
}

