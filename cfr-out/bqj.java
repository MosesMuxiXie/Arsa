/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.List$ListType
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import java.util.Optional;
import java.util.Set;

public class bqj
extends DataFix {
    private final Set<String> a;

    public bqj(Schema $$0, Set<String> $$1) {
        super($$0, true);
        this.a = $$1;
    }

    public TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.x);
        OpticFinder $$1 = $$0.findField("tag");
        OpticFinder $$2 = $$1.type().findField("BlockEntityTag");
        Type $$32 = this.getInputSchema().getType(bqh.H);
        OpticFinder $$42 = DSL.namedChoice((String)"minecraft:falling_block", (Type)this.getInputSchema().getChoiceType(bqh.H, "minecraft:falling_block"));
        OpticFinder $$5 = $$42.type().findField("TileEntityData");
        Type $$6 = this.getInputSchema().getType(bqh.g);
        OpticFinder $$7 = $$6.findField("blocks");
        OpticFinder $$8 = DSL.typeFinder((Type)((List.ListType)$$7.type()).getElement());
        OpticFinder $$9 = $$8.type().findField("nbt");
        OpticFinder $$10 = DSL.fieldFinder((String)"id", bsh.a());
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhereTyped("ItemRemoveBlockEntityTagFix", $$0, $$3 -> $$3.updateTyped($$1, $$2 -> this.a((Typed<?>)$$2, (OpticFinder<?>)$$2, (OpticFinder<String>)$$10, "BlockEntityTag"))), (TypeRewriteRule[])new TypeRewriteRule[]{this.fixTypeEverywhereTyped("FallingBlockEntityRemoveBlockEntityTagFix", $$32, $$3 -> $$3.updateTyped($$42, $$2 -> this.a((Typed<?>)$$2, (OpticFinder<?>)$$5, (OpticFinder<String>)$$10, "TileEntityData"))), this.fixTypeEverywhereTyped("StructureRemoveBlockEntityTagFix", $$6, $$4 -> $$4.updateTyped($$7, $$3 -> $$3.updateTyped($$8, $$2 -> this.a((Typed<?>)$$2, (OpticFinder<?>)$$9, (OpticFinder<String>)$$10, "nbt")))), this.convertUnchecked("ItemRemoveBlockEntityTagFix - update block entity type", this.getInputSchema().getType(bqh.w), this.getOutputSchema().getType(bqh.w))});
    }

    private Typed<?> a(Typed<?> $$0, OpticFinder<?> $$12, OpticFinder<String> $$2, String $$3) {
        Optional $$4 = $$0.getOptionalTyped($$12);
        if ($$4.isEmpty()) {
            return $$0;
        }
        String $$5 = ((Typed)$$4.get()).getOptional($$2).orElse("");
        if (!this.a.contains($$5)) {
            return $$0;
        }
        return bhs.a($$0, $$0.getType(), $$1 -> $$1.remove($$3));
    }
}

