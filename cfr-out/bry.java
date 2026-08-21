/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class bry
extends DataFix {
    public bry(Schema $$0) {
        super($$0, false);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.S);
        OpticFinder $$12 = $$0.findField("dimensions");
        return this.fixTypeEverywhereTyped("WorldGenSettingsDisallowOldCustomWorldsFix_" + this.getOutputSchema().getVersionKey(), $$0, $$1 -> $$1.updateTyped($$12, $$02 -> {
            $$02.write().map($$0 -> $$0.getMapValues().map($$02 -> {
                $$02.forEach(($$0, $$1) -> {
                    if ($$1.get("type").asString().result().isEmpty()) {
                        throw new vl("Unable load old custom worlds.");
                    }
                });
                return $$02;
            }));
            return $$02;
        }));
    }
}

