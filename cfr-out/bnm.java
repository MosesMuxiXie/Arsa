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
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class bnm
extends DataFix {
    public bnm(Schema $$0) {
        super($$0, false);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.x);
        Type $$1 = this.getInputSchema().getType(bqh.D);
        OpticFinder $$2 = $$0.findField("tag");
        OpticFinder $$3 = $$2.type().findField("display");
        OpticFinder $$42 = $$3.type().findField("Lore");
        OpticFinder $$5 = DSL.typeFinder((Type)$$1);
        return this.fixTypeEverywhereTyped("Item Lore componentize", $$0, $$4 -> $$4.updateTyped($$2, $$3 -> $$3.updateTyped($$3, $$2 -> $$2.updateTyped($$42, $$1 -> $$1.update($$5, $$0 -> $$0.mapSecond(bic::a))))));
    }
}

