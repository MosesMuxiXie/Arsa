/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;

public class bjm
extends DataFix {
    public bjm(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.I);
        Type $$1 = this.getOutputSchema().getType(bqh.I);
        Type $$2 = DSL.named((String)bqh.I.typeName(), (Type)DSL.or((Type)DSL.intType(), bsh.a()));
        Type $$3 = DSL.named((String)bqh.I.typeName(), bsh.a());
        if (!Objects.equals($$0, $$2) || !Objects.equals($$1, $$3)) {
            throw new IllegalStateException("Expected and actual types don't match.");
        }
        return this.fixTypeEverywhere("BlockNameFlatteningFix", $$2, $$3, $$02 -> $$0 -> $$0.mapSecond($$02 -> (String)$$02.map(bjq::a, $$0 -> bjq.a(bsh.a($$0)))));
    }
}

