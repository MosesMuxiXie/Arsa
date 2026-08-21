/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
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

public class bik
extends DataFix {
    private final String a;
    private final DSL.TypeReference b;

    public bik(Schema $$0, String $$1, DSL.TypeReference $$2) {
        super($$0, true);
        this.a = $$1;
        this.b = $$2;
    }

    public TypeRewriteRule makeRule() {
        TaggedChoice.TaggedChoiceType $$0 = this.getInputSchema().findChoiceType(this.b);
        TaggedChoice.TaggedChoiceType $$1 = this.getOutputSchema().findChoiceType(this.b);
        return this.a($$0, $$1);
    }

    private <K> TypeRewriteRule a(TaggedChoice.TaggedChoiceType<K> $$0, TaggedChoice.TaggedChoiceType<?> $$1) {
        if ($$0.getKeyType() != $$1.getKeyType()) {
            throw new IllegalStateException("Could not inject: key type is not the same");
        }
        TaggedChoice.TaggedChoiceType<?> $$2 = $$1;
        return this.fixTypeEverywhere(this.a, (Type)$$0, (Type)$$2, $$12 -> $$1 -> {
            if (!$$2.hasType($$1.getFirst())) {
                throw new IllegalArgumentException(String.format(Locale.ROOT, "%s: Unknown type %s in '%s'", this.a, $$1.getFirst(), this.b.typeName()));
            }
            return $$1;
        });
    }
}

