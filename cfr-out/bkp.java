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

public class bkp
extends DataFix {
    private final String a;
    private final String b;
    private final UnaryOperator<String> c;

    public bkp(Schema $$0, String $$1, String $$2, UnaryOperator<String> $$3) {
        super($$0, false);
        this.a = $$1;
        this.b = $$2;
        this.c = $$3;
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.a, this.getInputSchema().getType(bqh.s), $$0 -> $$0.update(DSL.remainderFinder(), this::a));
    }

    private Dynamic<?> a(Dynamic<?> $$0) {
        return $$0.update(this.b, $$02 -> $$02.update("criteria", $$0 -> $$0.updateMapValues($$02 -> $$02.mapFirst($$0 -> (Dynamic)DataFixUtils.orElse((Optional)$$0.asString().map($$1 -> $$0.createString((String)this.c.apply((String)$$1))).result(), (Object)$$0)))));
    }
}

