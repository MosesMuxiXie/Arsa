/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class bkn
extends DataFix {
    public bkn(Schema $$0) {
        super($$0, false);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("ContainerBlockEntityLockPredicateFix", (Type)this.getInputSchema().findChoiceType(bqh.w), bkn::a);
    }

    private static Typed<?> a(Typed<?> $$02) {
        return $$02.update(DSL.remainderFinder(), $$0 -> $$0.renameAndFixField("Lock", "lock", bon::b));
    }
}

