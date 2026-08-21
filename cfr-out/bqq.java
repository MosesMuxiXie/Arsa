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
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Set;

public class bqq
extends DataFix {
    private static final Set<String> a = Set.of("minecraft:horse", "minecraft:skeleton_horse", "minecraft:zombie_horse", "minecraft:donkey", "minecraft:mule", "minecraft:camel", "minecraft:llama", "minecraft:trader_llama");
    private static final Set<String> b = Set.of("minecraft:pig", "minecraft:strider");
    private static final String c = "Saddle";
    private static final String d = "saddle";

    public bqq(Schema $$0) {
        super($$0, true);
    }

    protected TypeRewriteRule makeRule() {
        TaggedChoice.TaggedChoiceType $$0 = this.getInputSchema().findChoiceType(bqh.H);
        OpticFinder $$1 = DSL.typeFinder((Type)$$0);
        Type $$2 = this.getInputSchema().getType(bqh.H);
        Type $$32 = this.getOutputSchema().getType(bqh.H);
        Type<?> $$4 = bib.a($$2, $$2, $$32);
        return this.fixTypeEverywhereTyped("SaddleEquipmentSlotFix", $$2, $$32, $$3 -> {
            String $$4 = $$3.getOptional($$1).map(Pair::getFirst).map(bsh::a).orElse("");
            Typed $$5 = bib.a($$4, $$3);
            if (a.contains($$4)) {
                return bhs.a($$5, $$32, bqq::a);
            }
            if (b.contains($$4)) {
                return bhs.a($$5, $$32, bqq::b);
            }
            return bib.a($$32, $$3);
        });
    }

    private static Dynamic<?> a(Dynamic<?> $$0) {
        if ($$0.get("SaddleItem").result().isEmpty()) {
            return $$0;
        }
        return bqq.c($$0.renameField("SaddleItem", d));
    }

    private static Dynamic<?> b(Dynamic<?> $$0) {
        boolean $$1 = $$0.get(c).asBoolean(false);
        $$0 = $$0.remove(c);
        if (!$$1) {
            return $$0;
        }
        Dynamic $$2 = $$0.emptyMap().set("id", $$0.createString("minecraft:saddle")).set("count", $$0.createInt(1));
        return bqq.c($$0.set(d, $$2));
    }

    private static Dynamic<?> c(Dynamic<?> $$0) {
        Dynamic $$1 = $$0.get("drop_chances").orElseEmptyMap().set(d, $$0.createFloat(2.0f));
        return $$0.set("drop_chances", $$1);
    }
}

