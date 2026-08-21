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
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import com.mojang.serialization.Dynamic;

public class biw
extends DataFix {
    public biw(Schema $$0) {
        super($$0, true);
    }

    private Dynamic<?> a(Dynamic<?> $$0) {
        return $$0.remove("Bees");
    }

    private Dynamic<?> b(Dynamic<?> $$0) {
        $$0 = $$0.remove("EntityData");
        $$0 = $$0.renameField("TicksInHive", "ticks_in_hive");
        $$0 = $$0.renameField("MinOccupationTicks", "min_ticks_in_hive");
        return $$0;
    }

    public TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getChoiceType(bqh.w, "minecraft:beehive");
        OpticFinder $$1 = DSL.namedChoice((String)"minecraft:beehive", (Type)$$0);
        List.ListType $$2 = (List.ListType)$$0.findFieldType("Bees");
        Type $$3 = $$2.getElement();
        OpticFinder $$42 = DSL.fieldFinder((String)"Bees", (Type)$$2);
        OpticFinder $$5 = DSL.typeFinder((Type)$$3);
        Type $$6 = this.getInputSchema().getType(bqh.w);
        Type $$7 = this.getOutputSchema().getType(bqh.w);
        return this.fixTypeEverywhereTyped("BeehiveFieldRenameFix", $$6, $$7, $$4 -> bib.a($$7, $$4.updateTyped($$1, $$2 -> $$2.update(DSL.remainderFinder(), this::a).updateTyped($$42, $$1 -> $$1.updateTyped($$5, $$0 -> $$0.update(DSL.remainderFinder(), this::b))))));
    }
}

