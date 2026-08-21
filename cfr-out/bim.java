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
import java.util.function.Function;

public class bim
extends DataFix {
    private final String a;
    private final Function<String, String> b;

    public bim(Schema $$0, boolean $$1, String $$2, Function<String, String> $$3) {
        super($$0, $$1);
        this.a = $$2;
        this.b = $$3;
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.a, this.getInputSchema().getType(bqh.s), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> $$0.updateMapValues($$1 -> {
            String $$22 = ((Dynamic)$$1.getFirst()).asString("");
            return $$1.mapFirst($$2 -> $$0.createString(this.b.apply($$22)));
        })));
    }
}

