/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class bpq
extends DataFix {
    private final String a;
    private final String b;
    private final String c;

    public bpq(Schema $$0, boolean $$1, String $$2, String $$3, String $$4) {
        super($$0, $$1);
        this.a = $$2;
        this.b = $$3;
        this.c = $$4;
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.a, this.getInputSchema().getType(bqh.f), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> $$0.renameField(this.b, this.c)));
    }
}

