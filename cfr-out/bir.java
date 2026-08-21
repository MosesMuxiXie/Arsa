/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;

public class bir
extends DataFix {
    private final String a;
    private final UnaryOperator<String> b;

    public bir(Schema $$0, String $$1, UnaryOperator<String> $$2) {
        super($$0, false);
        this.a = $$1;
        this.b = $$2;
    }

    protected TypeRewriteRule makeRule() {
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhereTyped(this.a + " (Components)", this.getInputSchema().getType(bqh.A), this::a), (TypeRewriteRule[])new TypeRewriteRule[]{this.fixTypeEverywhereTyped(this.a + " (Entity)", this.getInputSchema().getType(bqh.H), this::b), this.fixTypeEverywhereTyped(this.a + " (Player)", this.getInputSchema().getType(bqh.c), this::b)});
    }

    private Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), $$02 -> $$02.update("minecraft:attribute_modifiers", $$0 -> $$0.update("modifiers", $$02 -> (Dynamic)DataFixUtils.orElse($$02.asStreamOpt().result().map($$0 -> $$0.map(this::b)).map(arg_0 -> ((Dynamic)$$02).createList(arg_0)), (Object)$$02))));
    }

    private Typed<?> b(Typed<?> $$02) {
        return $$02.update(DSL.remainderFinder(), $$0 -> $$0.update("attributes", $$02 -> (Dynamic)DataFixUtils.orElse($$02.asStreamOpt().result().map($$0 -> $$0.map(this::a)).map(arg_0 -> ((Dynamic)$$02).createList(arg_0)), (Object)$$02)));
    }

    private Dynamic<?> a(Dynamic<?> $$0) {
        return bib.a($$0, "id", this.b);
    }

    private Dynamic<?> b(Dynamic<?> $$0) {
        return bib.a($$0, "type", this.b);
    }
}

