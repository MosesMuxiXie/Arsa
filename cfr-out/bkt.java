/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class bkt
extends DataFix {
    private static final String a = "minecraft:decorated_pot";

    public bkt(Schema $$0) {
        super($$0, true);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getChoiceType(bqh.w, a);
        Type $$1 = this.getOutputSchema().getChoiceType(bqh.w, a);
        return this.convertUnchecked("DecoratedPotFieldRenameFix", $$0, $$1);
    }
}

