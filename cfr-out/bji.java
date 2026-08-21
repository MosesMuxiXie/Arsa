/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 */
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import java.util.function.UnaryOperator;

public class bji
extends DataFix {
    private final String a;
    private final UnaryOperator<String> b;

    private bji(Schema $$0, String $$1, UnaryOperator<String> $$2) {
        super($$0, true);
        this.a = $$1;
        this.b = $$2;
    }

    public TypeRewriteRule makeRule() {
        TaggedChoice.TaggedChoiceType $$0 = this.getInputSchema().findChoiceType(bqh.w);
        TaggedChoice.TaggedChoiceType $$1 = this.getOutputSchema().findChoiceType(bqh.w);
        return this.fixTypeEverywhere(this.a, (Type)$$0, (Type)$$1, $$02 -> $$0 -> $$0.mapFirst(this.b));
    }

    public static DataFix a(Schema $$0, String $$1, UnaryOperator<String> $$2) {
        return new bji($$0, $$1, $$2);
    }
}

