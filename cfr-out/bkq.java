/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Map;
import java.util.stream.Stream;

public class bkq
extends DataFix {
    public bkq(Schema $$0) {
        super($$0, false);
    }

    protected TypeRewriteRule makeRule() {
        Type $$02 = this.getInputSchema().getType(bqh.A);
        return this.fixTypeEverywhereTyped("Custom Model Data expansion", $$02, $$0 -> $$0.update(DSL.remainderFinder(), $$02 -> $$02.update("minecraft:custom_model_data", $$0 -> {
            float $$1 = $$0.asNumber((Number)Float.valueOf(0.0f)).floatValue();
            return $$0.createMap(Map.of($$0.createString("floats"), $$0.createList(Stream.of($$0.createFloat($$1)))));
        })));
    }
}

