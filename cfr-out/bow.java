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
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public abstract class bow
extends DataFix {
    private final String c;
    protected final String a;
    protected final DSL.TypeReference b;

    public bow(Schema $$0, boolean $$1, String $$2, DSL.TypeReference $$3, String $$4) {
        super($$0, $$1);
        this.c = $$2;
        this.b = $$3;
        this.a = $$4;
    }

    public TypeRewriteRule makeRule() {
        OpticFinder $$0 = DSL.namedChoice((String)this.a, (Type)this.getInputSchema().getChoiceType(this.b, this.a));
        return this.fixTypeEverywhereTyped(this.c, this.getInputSchema().getType(this.b), this.getOutputSchema().getType(this.b), $$1 -> $$1.updateTyped($$0, this.getOutputSchema().getChoiceType(this.b, this.a), this::a));
    }

    protected abstract Typed<?> a(Typed<?> var1);
}

