/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class bqt
extends DataFix {
    private final String a;
    private final DSL.TypeReference b;

    public bqt(Schema $$0, String $$1, DSL.TypeReference $$2) {
        super($$0, false);
        this.a = $$1;
        this.b = $$2;
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(this.b);
        OpticFinder $$1 = $$0.findField("DisplayName");
        OpticFinder $$22 = DSL.typeFinder((Type)this.getInputSchema().getType(bqh.D));
        return this.fixTypeEverywhereTyped(this.a, $$0, $$2 -> $$2.updateTyped($$1, $$1 -> $$1.update($$22, $$0 -> $$0.mapSecond(bic::a))));
    }
}

