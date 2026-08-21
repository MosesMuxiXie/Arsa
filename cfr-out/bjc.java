/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class bjc
extends bow {
    public bjc(Schema $$0, boolean $$1) {
        super($$0, $$1, "BlockEntityBlockStateFix", bqh.w, "minecraft:piston");
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        Type $$1 = this.getOutputSchema().getChoiceType(bqh.w, "minecraft:piston");
        Type $$2 = $$1.findFieldType("blockState");
        OpticFinder $$3 = DSL.fieldFinder((String)"blockState", (Type)$$2);
        Dynamic $$4 = (Dynamic)$$0.get(DSL.remainderFinder());
        int $$5 = $$4.get("blockId").asInt(0);
        $$4 = $$4.remove("blockId");
        int $$6 = $$4.get("blockData").asInt(0) & 0xF;
        $$4 = $$4.remove("blockData");
        Dynamic<?> $$7 = bjq.b($$5 << 4 | $$6);
        Typed $$8 = (Typed)$$1.pointTyped($$0.getOps()).orElseThrow(() -> new IllegalStateException("Could not create new piston block entity."));
        return $$8.set(DSL.remainderFinder(), (Object)$$4).set($$3, (Typed)((Pair)$$2.readTyped($$7).result().orElseThrow(() -> new IllegalStateException("Could not parse newly created block state tag."))).getFirst());
    }
}

