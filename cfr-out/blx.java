/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.OptionalDynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Codec;
import com.mojang.serialization.OptionalDynamic;
import java.util.List;

public class blx
extends DataFix {
    private static final Codec<List<Float>> a = Codec.FLOAT.listOf();

    public blx(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("EntityRedundantChanceTagsFix", this.getInputSchema().getType(bqh.H), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> {
            if (blx.a($$0.get("HandDropChances"), 2)) {
                $$0 = $$0.remove("HandDropChances");
            }
            if (blx.a($$0.get("ArmorDropChances"), 4)) {
                $$0 = $$0.remove("ArmorDropChances");
            }
            return $$0;
        }));
    }

    private static boolean a(OptionalDynamic<?> $$0, int $$12) {
        return $$0.flatMap(arg_0 -> a.parse(arg_0)).map($$1 -> $$1.size() == $$12 && $$1.stream().allMatch($$0 -> $$0.floatValue() == 0.0f)).result().orElse(false);
    }
}

