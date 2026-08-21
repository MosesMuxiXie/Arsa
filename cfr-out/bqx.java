/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import java.util.Locale;
import java.util.Objects;

public abstract class bqx
extends DataFix {
    private final String a;

    public bqx(String $$0, Schema $$1, boolean $$2) {
        super($$1, $$2);
        this.a = $$0;
    }

    public TypeRewriteRule makeRule() {
        TaggedChoice.TaggedChoiceType $$0 = this.getInputSchema().findChoiceType(bqh.H);
        TaggedChoice.TaggedChoiceType $$1 = this.getOutputSchema().findChoiceType(bqh.H);
        Type $$22 = DSL.named((String)bqh.F.typeName(), bsh.a());
        if (!Objects.equals(this.getOutputSchema().getType(bqh.F), $$22)) {
            throw new IllegalStateException("Entity name type is not what was expected.");
        }
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhere(this.a, (Type)$$0, (Type)$$1, $$2 -> $$22 -> $$22.mapFirst($$2 -> {
            String $$3 = this.a((String)$$2);
            Type $$4 = (Type)$$0.types().get($$2);
            Type $$5 = (Type)$$1.types().get($$3);
            if (!$$5.equals((Object)$$4, true, true)) {
                throw new IllegalStateException(String.format(Locale.ROOT, "Dynamic type check failed: %s not equal to %s", $$5, $$4));
            }
            return $$3;
        })), (TypeRewriteRule)this.fixTypeEverywhere(this.a + " for entity name", $$22, $$02 -> $$0 -> $$0.mapSecond(this::a)));
    }

    protected abstract String a(String var1);
}

