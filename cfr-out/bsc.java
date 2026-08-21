/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class bsc
extends DataFix {
    private final String a;
    private final DSL.TypeReference b;

    public bsc(Schema $$0, String $$1, DSL.TypeReference $$2) {
        super($$0, true);
        this.a = $$1;
        this.b = $$2;
    }

    protected TypeRewriteRule makeRule() {
        return this.writeAndRead(this.a, this.getInputSchema().getType(this.b), this.getOutputSchema().getType(this.b));
    }
}

