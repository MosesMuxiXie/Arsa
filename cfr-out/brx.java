/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 */
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class brx
extends DataFix {
    public brx(Schema $$0) {
        super($$0, false);
    }

    protected TypeRewriteRule makeRule() {
        return this.writeFixAndRead("WorldBorderWarningTimeFix", this.getInputSchema().getType(bqh.r), this.getOutputSchema().getType(bqh.r), $$02 -> $$02.update("data", $$0 -> $$0.update("warning_time", $$1 -> $$0.createInt($$1.asInt(15) * 20))));
    }
}

