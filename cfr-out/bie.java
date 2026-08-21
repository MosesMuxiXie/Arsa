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
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;

public class bie
extends DataFix {
    public bie(Schema $$0) {
        super($$0, false);
    }

    protected TypeRewriteRule makeRule() {
        Schema $$0 = this.getInputSchema();
        return this.fixTypeEverywhereTyped("AbstractArrowPickupFix", $$0.getType(bqh.H), this::a);
    }

    private Typed<?> a(Typed<?> $$0) {
        $$0 = this.a($$0, "minecraft:arrow", bie::a);
        $$0 = this.a($$0, "minecraft:spectral_arrow", bie::a);
        $$0 = this.a($$0, "minecraft:trident", bie::a);
        return $$0;
    }

    private static Dynamic<?> a(Dynamic<?> $$0) {
        if ($$0.get("pickup").result().isPresent()) {
            return $$0;
        }
        boolean $$1 = $$0.get("player").asBoolean(true);
        return $$0.set("pickup", $$0.createByte((byte)($$1 ? 1 : 0))).remove("player");
    }

    private Typed<?> a(Typed<?> $$0, String $$12, Function<Dynamic<?>, Dynamic<?>> $$2) {
        Type $$3 = this.getInputSchema().getChoiceType(bqh.H, $$12);
        Type $$4 = this.getOutputSchema().getChoiceType(bqh.H, $$12);
        return $$0.updateTyped(DSL.namedChoice((String)$$12, (Type)$$3), $$4, $$1 -> $$1.update(DSL.remainderFinder(), $$2));
    }
}

