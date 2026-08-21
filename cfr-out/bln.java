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
import java.util.Optional;

public class bln
extends bow {
    public bln(Schema $$0, boolean $$1) {
        super($$0, $$1, "EntityHorseSaddleFix", bqh.H, "EntityHorse");
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        OpticFinder $$1 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)bqh.J.typeName(), bsh.a()));
        Type $$2 = this.getInputSchema().getTypeRaw(bqh.x);
        OpticFinder $$3 = DSL.fieldFinder((String)"SaddleItem", (Type)$$2);
        Optional $$4 = $$0.getOptionalTyped($$3);
        Dynamic $$5 = (Dynamic)$$0.get(DSL.remainderFinder());
        if ($$4.isEmpty() && $$5.get("Saddle").asBoolean(false)) {
            Typed $$6 = (Typed)$$2.pointTyped($$0.getOps()).orElseThrow(IllegalStateException::new);
            $$6 = $$6.set($$1, (Object)Pair.of((Object)bqh.J.typeName(), (Object)"minecraft:saddle"));
            Dynamic $$7 = $$5.emptyMap();
            $$7 = $$7.set("Count", $$7.createByte((byte)1));
            $$7 = $$7.set("Damage", $$7.createShort((short)0));
            $$6 = $$6.set(DSL.remainderFinder(), (Object)$$7);
            $$5.remove("Saddle");
            return $$0.set($$3, $$6).set(DSL.remainderFinder(), (Object)$$5);
        }
        return $$0;
    }
}

