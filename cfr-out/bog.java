/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;

public class bog
extends DataFix {
    public bog(Schema $$0) {
        super($$0, false);
    }

    private static <T> Dynamic<T> a(Dynamic<T> $$0) {
        return $$0.update("ExitPortalLocation", bib::a);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("LegacyDragonFightFix", this.getInputSchema().getType(bqh.a), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> {
            OptionalDynamic $$1 = $$0.get("DragonFight");
            if ($$1.result().isPresent()) {
                return $$0;
            }
            Dynamic $$2 = $$0.get("DimensionData").get("1").get("DragonFight").orElseEmptyMap();
            return $$0.set("DragonFight", bog.a($$2));
        }));
    }
}

