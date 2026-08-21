/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class bqb
extends DataFix {
    public bqb(Schema $$0) {
        super($$0, true);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.H);
        Type $$1 = this.getOutputSchema().getType(bqh.H);
        return this.fixTypeEverywhereTyped("Fix Arrow stored weapon", $$0, $$1, bib.a(this.a("minecraft:arrow"), this.a("minecraft:spectral_arrow")));
    }

    private Function<Typed<?>, Typed<?>> a(String $$0) {
        Type $$1 = this.getInputSchema().getChoiceType(bqh.H, $$0);
        Type $$2 = this.getOutputSchema().getChoiceType(bqh.H, $$0);
        return bqb.a($$0, $$1, $$2);
    }

    private static <T> Function<Typed<?>, Typed<?>> a(String $$0, Type<?> $$1, Type<T> $$22) {
        OpticFinder $$3 = DSL.namedChoice((String)$$0, $$1);
        return $$2 -> $$2.updateTyped($$3, $$22, $$1 -> bhs.a($$1, $$22, UnaryOperator.identity()));
    }
}

