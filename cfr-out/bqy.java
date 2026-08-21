/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;

public class bqy
extends DataFix {
    public bqy(Schema $$0) {
        super($$0, true);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.L);
        Type $$1 = this.getOutputSchema().getType(bqh.L);
        OpticFinder $$2 = $$0.findField("SpawnData");
        Type $$3 = $$1.findField("SpawnData").type();
        OpticFinder $$42 = $$0.findField("SpawnPotentials");
        Type $$5 = $$1.findField("SpawnPotentials").type();
        return this.fixTypeEverywhereTyped("Fix mob spawner data structure", $$0, $$1, $$4 -> $$4.updateTyped($$2, $$3, $$1 -> this.a((Type)$$3, (Typed<?>)$$1)).updateTyped($$42, $$5, $$1 -> this.b((Type)$$5, (Typed<?>)$$1)));
    }

    private <T> Typed<T> a(Type<T> $$0, Typed<?> $$1) {
        DynamicOps $$2 = $$1.getOps();
        return new Typed($$0, $$2, (Object)Pair.of((Object)$$1.getValue(), (Object)new Dynamic($$2)));
    }

    private <T> Typed<T> b(Type<T> $$0, Typed<?> $$12) {
        DynamicOps $$2 = $$12.getOps();
        List $$3 = (List)$$12.getValue();
        List<Pair> $$4 = $$3.stream().map($$1 -> {
            Pair $$2 = (Pair)$$1;
            int $$3 = ((Number)((Dynamic)$$2.getSecond()).get("Weight").asNumber().result().orElse(1)).intValue();
            Dynamic $$4 = new Dynamic($$2);
            $$4 = $$4.set("weight", $$4.createInt($$3));
            Dynamic $$5 = ((Dynamic)$$2.getSecond()).remove("Weight").remove("Entity");
            return Pair.of((Object)Pair.of((Object)$$2.getFirst(), (Object)$$5), (Object)$$4);
        }).toList();
        return new Typed($$0, $$2, $$4);
    }
}

