/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class bnz
extends bih {
    public bnz(Schema $$0) {
        super($$0, bqh.x);
    }

    public TypeRewriteRule makeRule() {
        OpticFinder $$0 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)bqh.J.typeName(), bsh.a()));
        return this.fixTypeEverywhereTyped("ItemStackUUIDFix", this.getInputSchema().getType(this.a), $$1 -> {
            OpticFinder $$2 = $$1.getType().findField("tag");
            return $$1.updateTyped($$2, $$22 -> $$22.update(DSL.remainderFinder(), $$2 -> {
                $$2 = this.b((Dynamic<?>)$$2);
                if ($$1.getOptional($$0).map($$0 -> "minecraft:player_head".equals($$0.getSecond())).orElse(false).booleanValue()) {
                    $$2 = this.c((Dynamic<?>)$$2);
                }
                return $$2;
            }));
        });
    }

    private Dynamic<?> b(Dynamic<?> $$0) {
        return $$0.update("AttributeModifiers", $$1 -> $$0.createList($$1.asStream().map($$0 -> bnz.c($$0, "UUID", "UUID").orElse((Dynamic<?>)$$0))));
    }

    private Dynamic<?> c(Dynamic<?> $$02) {
        return $$02.update("SkullOwner", $$0 -> bnz.a($$0, "Id", "Id").orElse((Dynamic<?>)$$0));
    }
}

