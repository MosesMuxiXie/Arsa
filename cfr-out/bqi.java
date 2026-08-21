/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class bqi
extends DataFix {
    private final String a;
    private final UnaryOperator<String> b;

    public bqi(Schema $$0, String $$1, UnaryOperator<String> $$2) {
        super($$0, false);
        this.a = $$1;
        this.b = $$2;
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.a, this.getInputSchema().getType(bqh.d), $$0 -> $$0.update(DSL.remainderFinder(), $$02 -> $$02.update("Status", this::a).update("below_zero_retrogen", $$0 -> $$0.update("target_status", this::a))));
    }

    private <T> Dynamic<T> a(Dynamic<T> $$0) {
        Optional<Dynamic> $$1 = $$0.asString().result().map(bsh::a).map(this.b).map(arg_0 -> $$0.createString(arg_0));
        return (Dynamic)DataFixUtils.orElse($$1, $$0);
    }
}

