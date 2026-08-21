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

public class bjg
extends bow {
    public bjg(Schema $$0, boolean $$1) {
        super($$0, $$1, "BlockEntityJukeboxFix", bqh.w, "minecraft:jukebox");
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        Type $$1 = this.getInputSchema().getChoiceType(bqh.w, "minecraft:jukebox");
        Type $$2 = $$1.findFieldType("RecordItem");
        OpticFinder $$3 = DSL.fieldFinder((String)"RecordItem", (Type)$$2);
        Dynamic $$4 = (Dynamic)$$0.get(DSL.remainderFinder());
        int $$5 = $$4.get("Record").asInt(0);
        if ($$5 > 0) {
            $$4.remove("Record");
            String $$6 = bny.a(bnl.a($$5), 0);
            if ($$6 != null) {
                Dynamic $$7 = $$4.emptyMap();
                $$7 = $$7.set("id", $$7.createString($$6));
                $$7 = $$7.set("Count", $$7.createByte((byte)1));
                return $$0.set($$3, (Typed)((Pair)$$2.readTyped($$7).result().orElseThrow(() -> new IllegalStateException("Could not create record item stack."))).getFirst()).set(DSL.remainderFinder(), (Object)$$4);
            }
        }
        return $$0;
    }
}

