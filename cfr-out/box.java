/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public abstract class box
extends DataFix {
    private final String a;
    private final String b;
    private final DSL.TypeReference c;

    public box(Schema $$0, boolean $$1, String $$2, DSL.TypeReference $$3, String $$4) {
        super($$0, $$1);
        this.a = $$2;
        this.c = $$3;
        this.b = $$4;
    }

    public TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(this.c);
        Type $$1 = this.getInputSchema().getChoiceType(this.c, this.b);
        Type $$2 = this.getOutputSchema().getType(this.c);
        OpticFinder $$3 = DSL.namedChoice((String)this.b, (Type)$$1);
        Type<?> $$4 = bib.a($$0, $$0, $$2);
        return this.a($$0, $$2, $$4, $$3);
    }

    private <S, T, A> TypeRewriteRule a(Type<S> $$0, Type<T> $$1, Type<?> $$2, OpticFinder<A> $$32) {
        return this.fixTypeEverywhereTyped(this.a, $$0, $$1, $$3 -> {
            if ($$3.getOptional($$32).isEmpty()) {
                return bib.a($$1, $$3);
            }
            Typed $$4 = bib.a($$2, $$3);
            return bhs.a($$4, $$1, this::a);
        });
    }

    protected abstract <T> Dynamic<T> a(Dynamic<T> var1);
}

