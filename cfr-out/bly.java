/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DynamicOps
 */
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import java.util.Locale;
import java.util.function.Function;

public abstract class bly
extends DataFix {
    protected final String a;

    public bly(String $$0, Schema $$1, boolean $$2) {
        super($$1, $$2);
        this.a = $$0;
    }

    public TypeRewriteRule makeRule() {
        TaggedChoice.TaggedChoiceType $$0 = this.getInputSchema().findChoiceType(bqh.H);
        TaggedChoice.TaggedChoiceType $$1 = this.getOutputSchema().findChoiceType(bqh.H);
        Function<String, Type> $$22 = bhs.b($$2 -> {
            Type $$3 = (Type)$$0.types().get($$2);
            return bib.a($$3, $$0, $$1);
        });
        return this.fixTypeEverywhere(this.a, (Type)$$0, (Type)$$1, $$2 -> $$3 -> {
            String $$4 = (String)$$3.getFirst();
            Type $$5 = (Type)$$22.apply($$4);
            Pair<String, Typed<?>> $$6 = this.a($$4, this.a($$3.getSecond(), (DynamicOps<?>)$$2, (Type)$$5));
            Type $$7 = (Type)$$1.types().get($$6.getFirst());
            if (!$$7.equals((Object)((Typed)$$6.getSecond()).getType(), true, true)) {
                throw new IllegalStateException(String.format(Locale.ROOT, "Dynamic type check failed: %s not equal to %s", $$7, ((Typed)$$6.getSecond()).getType()));
            }
            return Pair.of((Object)((String)$$6.getFirst()), (Object)((Typed)$$6.getSecond()).getValue());
        });
    }

    private <A> Typed<A> a(Object $$0, DynamicOps<?> $$1, Type<A> $$2) {
        return new Typed($$2, $$1, $$0);
    }

    protected abstract Pair<String, Typed<?>> a(String var1, Typed<?> var2);
}

