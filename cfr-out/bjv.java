/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class bjv
extends DataFix {
    public bjv(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    private static Dynamic<?> a(Dynamic<?> $$0) {
        Optional $$1 = $$0.get("Name").asString().result();
        if ($$1.equals(Optional.of("minecraft:cauldron"))) {
            Dynamic $$2 = $$0.get("Properties").orElseEmptyMap();
            if ($$2.get("level").asString("0").equals("0")) {
                return $$0.remove("Properties");
            }
            return $$0.set("Name", $$0.createString("minecraft:water_cauldron"));
        }
        return $$0;
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("cauldron_rename_fix", this.getInputSchema().getType(bqh.y), $$0 -> $$0.update(DSL.remainderFinder(), bjv::a));
    }
}

