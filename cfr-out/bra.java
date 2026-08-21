/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import java.util.Map;

public class bra
extends DataFix {
    private final String a;
    private final Map<String, String> b;

    public bra(Schema $$0, String $$1, Map<String, String> $$2) {
        super($$0, false);
        this.a = $$1;
        this.b = $$2;
    }

    protected TypeRewriteRule makeRule() {
        return TypeRewriteRule.seq((TypeRewriteRule)this.b(), (TypeRewriteRule)this.a());
    }

    private TypeRewriteRule a() {
        Type $$0 = this.getOutputSchema().getType(bqh.N);
        Type $$1 = this.getInputSchema().getType(bqh.N);
        OpticFinder $$2 = $$1.findField("CriteriaType");
        TaggedChoice.TaggedChoiceType $$32 = (TaggedChoice.TaggedChoiceType)$$2.type().findChoiceType("type", -1).orElseThrow(() -> new IllegalStateException("Can't find choice type for criteria"));
        Type $$4 = (Type)$$32.types().get("minecraft:custom");
        if ($$4 == null) {
            throw new IllegalStateException("Failed to find custom criterion type variant");
        }
        OpticFinder $$5 = DSL.namedChoice((String)"minecraft:custom", (Type)$$4);
        OpticFinder $$6 = DSL.fieldFinder((String)"id", bsh.a());
        return this.fixTypeEverywhereTyped(this.a, $$1, $$0, $$3 -> $$3.updateTyped($$2, $$2 -> $$2.updateTyped($$5, $$1 -> $$1.update($$6, $$0 -> this.b.getOrDefault($$0, (String)$$0)))));
    }

    private TypeRewriteRule b() {
        Type $$0 = this.getOutputSchema().getType(bqh.h);
        Type $$1 = this.getInputSchema().getType(bqh.h);
        OpticFinder $$2 = $$1.findField("stats");
        OpticFinder $$32 = $$2.type().findField("minecraft:custom");
        OpticFinder $$4 = bsh.a().finder();
        return this.fixTypeEverywhereTyped(this.a, $$1, $$0, $$3 -> $$3.updateTyped($$2, $$2 -> $$2.updateTyped($$32, $$1 -> $$1.update($$4, $$0 -> this.b.getOrDefault($$0, (String)$$0)))));
    }
}

