/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;

public class bis
extends DataFix {
    private final String a;
    private final UnaryOperator<String> b;

    public bis(Schema $$0, String $$1, UnaryOperator<String> $$2) {
        super($$0, false);
        this.a = $$1;
        this.b = $$2;
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.x);
        OpticFinder $$12 = $$0.findField("tag");
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhereTyped(this.a + " (ItemStack)", $$0, $$1 -> $$1.updateTyped($$12, this::a)), (TypeRewriteRule[])new TypeRewriteRule[]{this.fixTypeEverywhereTyped(this.a + " (Entity)", this.getInputSchema().getType(bqh.H), this::b), this.fixTypeEverywhereTyped(this.a + " (Player)", this.getInputSchema().getType(bqh.c), this::b)});
    }

    private Dynamic<?> a(Dynamic<?> $$0) {
        return (Dynamic)DataFixUtils.orElse($$0.asString().result().map(this.b).map(arg_0 -> $$0.createString(arg_0)), $$0);
    }

    private Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), $$02 -> $$02.update("AttributeModifiers", $$0 -> (Dynamic)DataFixUtils.orElse($$0.asStreamOpt().result().map($$02 -> $$02.map($$0 -> $$0.update("AttributeName", this::a))).map(arg_0 -> ((Dynamic)$$0).createList(arg_0)), (Object)$$0)));
    }

    private Typed<?> b(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), $$02 -> $$02.update("Attributes", $$0 -> (Dynamic)DataFixUtils.orElse($$0.asStreamOpt().result().map($$02 -> $$02.map($$0 -> $$0.update("Name", this::a))).map(arg_0 -> ((Dynamic)$$0).createList(arg_0)), (Object)$$0)));
    }
}

