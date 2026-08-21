/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class brc
extends DataFix {
    public brc(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    protected TypeRewriteRule makeRule() {
        Type $$02 = this.getInputSchema().getType(bqh.M);
        return this.fixTypeEverywhereTyped("Structure Reference Fix", $$02, $$0 -> $$0.update(DSL.remainderFinder(), brc::a));
    }

    private static <T> Dynamic<T> a(Dynamic<T> $$0) {
        return $$0.update("references", $$02 -> $$02.createInt($$02.asNumber().map(Number::intValue).result().filter($$0 -> $$0 > 0).orElse(1).intValue()));
    }
}

