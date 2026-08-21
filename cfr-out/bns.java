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
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.OptionalDynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.OptionalDynamic;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bns
extends DataFix {
    private static final Set<String> a = Set.of("filled_map.buried_treasure", "filled_map.explorer_jungle", "filled_map.explorer_swamp", "filled_map.mansion", "filled_map.monument", "filled_map.trial_chambers", "filled_map.village_desert", "filled_map.village_plains", "filled_map.village_savanna", "filled_map.village_snowy", "filled_map.village_taiga");

    public bns(Schema $$0) {
        super($$0, false);
    }

    public final TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.x);
        OpticFinder $$1 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)bqh.J.typeName(), bsh.a()));
        OpticFinder $$22 = $$0.findField("components");
        return this.fixTypeEverywhereTyped("ItemStack custom_name to item_name component fix", $$0, $$2 -> {
            Optional $$3 = $$2.getOptional($$1);
            Optional<String> $$4 = $$3.map(Pair::getSecond);
            if ($$4.filter($$0 -> $$0.equals("minecraft:white_banner")).isPresent()) {
                return $$2.updateTyped($$22, bns::b);
            }
            if ($$4.filter($$0 -> $$0.equals("minecraft:filled_map")).isPresent()) {
                return $$2.updateTyped($$22, bns::a);
            }
            return $$2;
        });
    }

    private static <T> Typed<T> a(Typed<T> $$0) {
        return bns.a($$0, a::contains);
    }

    private static <T> Typed<T> b(Typed<T> $$02) {
        return bns.a($$02, (String $$0) -> $$0.equals("block.minecraft.ominous_banner"));
    }

    private static <T> Typed<T> a(Typed<T> $$0, Predicate<String> $$12) {
        return bhs.a($$0, $$0.getType(), $$1 -> {
            OptionalDynamic $$2 = $$1.get("minecraft:custom_name");
            Optional $$3 = $$2.asString().result().flatMap(bic::d).filter($$12);
            if ($$3.isPresent()) {
                return $$1.renameField("minecraft:custom_name", "minecraft:item_name");
            }
            return $$1;
        });
    }
}

