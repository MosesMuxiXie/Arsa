/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import org.slf4j.Logger;

public class bom
extends bih {
    private static final Logger b = LogUtils.getLogger();

    public bom(Schema $$0) {
        super($$0, bqh.a);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(this.a);
        OpticFinder $$1 = $$0.findField("CustomBossEvents");
        OpticFinder $$22 = DSL.typeFinder((Type)DSL.and((Type)DSL.optional((Type)DSL.field((String)"Name", (Type)this.getInputSchema().getTypeRaw(bqh.D))), (Type)DSL.remainderType()));
        return this.fixTypeEverywhereTyped("LevelUUIDFix", $$0, $$2 -> $$2.update(DSL.remainderFinder(), $$0 -> {
            $$0 = this.c((Dynamic<?>)$$0);
            $$0 = this.b((Dynamic<?>)$$0);
            return $$0;
        }).updateTyped($$1, $$1 -> $$1.updateTyped($$22, $$0 -> $$0.update(DSL.remainderFinder(), this::d))));
    }

    private Dynamic<?> b(Dynamic<?> $$0) {
        return bom.a($$0, "WanderingTraderId", "WanderingTraderId").orElse($$0);
    }

    private Dynamic<?> c(Dynamic<?> $$0) {
        return $$0.update("DimensionData", $$02 -> $$02.updateMapValues($$0 -> $$0.mapSecond($$02 -> $$02.update("DragonFight", $$0 -> bom.c($$0, "DragonUUID", "Dragon").orElse((Dynamic<?>)$$0)))));
    }

    private Dynamic<?> d(Dynamic<?> $$0) {
        return $$0.update("Players", $$1 -> $$0.createList($$1.asStream().map($$0 -> bom.a($$0).orElseGet(() -> {
            b.warn("CustomBossEvents contains invalid UUIDs.");
            return $$0;
        }))));
    }
}

