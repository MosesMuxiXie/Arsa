/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class bof
extends DataFix {
    public bof(Schema $$0) {
        super($$0, false);
    }

    public TypeRewriteRule makeRule() {
        TypeRewriteRule $$02 = this.fixTypeEverywhereTyped("PlayerLegacyDimensionFix", this.getInputSchema().getType(bqh.c), $$0 -> $$0.update(DSL.remainderFinder(), this::b));
        Type $$12 = this.getInputSchema().getType(bqh.k);
        OpticFinder $$2 = $$12.findField("data");
        TypeRewriteRule $$3 = this.fixTypeEverywhereTyped("MapLegacyDimensionFix", $$12, $$1 -> $$1.updateTyped($$2, $$0 -> $$0.update(DSL.remainderFinder(), this::a)));
        return TypeRewriteRule.seq((TypeRewriteRule)$$02, (TypeRewriteRule)$$3);
    }

    private <T> Dynamic<T> a(Dynamic<T> $$0) {
        return $$0.update("dimension", this::c);
    }

    private <T> Dynamic<T> b(Dynamic<T> $$0) {
        return $$0.update("Dimension", this::c);
    }

    private <T> Dynamic<T> c(Dynamic<T> $$0) {
        return (Dynamic)DataFixUtils.orElse($$0.asNumber().result().map($$1 -> switch ($$1.intValue()) {
            case -1 -> $$0.createString("minecraft:the_nether");
            case 1 -> $$0.createString("minecraft:the_end");
            default -> $$0.createString("minecraft:overworld");
        }), $$0);
    }
}

