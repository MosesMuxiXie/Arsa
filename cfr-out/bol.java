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
import java.util.List;
import java.util.Optional;

public class bol
extends DataFix {
    private static final String a = "WorldGenSettings";
    private static final List<String> b = List.of("RandomSeed", "generatorName", "generatorOptions", "generatorVersion", "legacy_custom_options", "MapFeatures", "BonusChest");

    public bol(Schema $$0) {
        super($$0, false);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("LevelLegacyWorldGenSettingsFix", this.getInputSchema().getType(bqh.a), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> {
            Dynamic $$1 = $$0.get(a).orElseEmptyMap();
            for (String $$2 : b) {
                Optional $$3 = $$0.get($$2).result();
                if (!$$3.isPresent()) continue;
                $$0 = $$0.remove($$2);
                $$1 = $$1.set($$2, (Dynamic)$$3.get());
            }
            return $$0.set(a, $$1);
        }));
    }
}

