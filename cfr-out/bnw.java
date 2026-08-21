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
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public abstract class bnw
extends DataFix {
    private final String a;
    private final Predicate<String> b;

    public bnw(Schema $$0, String $$1, Predicate<String> $$2) {
        super($$0, false);
        this.a = $$1;
        this.b = $$2;
    }

    public final TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.x);
        return this.fixTypeEverywhereTyped(this.a, $$0, bnw.a($$0, this.b, this::a));
    }

    public static UnaryOperator<Typed<?>> a(Type<?> $$0, Predicate<String> $$1, UnaryOperator<Typed<?>> $$2) {
        OpticFinder $$3 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)bqh.J.typeName(), bsh.a()));
        OpticFinder $$42 = $$0.findField("tag");
        return $$4 -> {
            Optional $$5 = $$4.getOptional($$3);
            if ($$5.isPresent() && $$1.test((String)((Pair)$$5.get()).getSecond())) {
                return $$4.updateTyped($$42, (Function)$$2);
            }
            return $$4;
        };
    }

    protected abstract Typed<?> a(Typed<?> var1);
}

