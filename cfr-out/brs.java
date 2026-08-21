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
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class brs
extends DataFix {
    private static final int a = 2;
    private static final int[] b = new int[]{0, 10, 50, 100, 150};

    public static int a(int $$0) {
        return b[bgj.a($$0 - 1, 0, b.length - 1)];
    }

    public brs(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getChoiceType(bqh.H, "minecraft:villager");
        OpticFinder $$1 = DSL.namedChoice((String)"minecraft:villager", (Type)$$0);
        OpticFinder $$2 = $$0.findField("Offers");
        Type $$3 = $$2.type();
        OpticFinder $$4 = $$3.findField("Recipes");
        List.ListType $$52 = (List.ListType)$$4.type();
        OpticFinder $$6 = $$52.getElement().finder();
        return this.fixTypeEverywhereTyped("Villager level and xp rebuild", this.getInputSchema().getType(bqh.H), $$5 -> $$5.updateTyped($$1, $$0, $$3 -> {
            Optional $$8;
            int $$7;
            OpticFinder $$6 = (Dynamic)$$3.get(DSL.remainderFinder());
            Object $$5 = $$6.get("VillagerData").get("level").asInt(0);
            Typed<?> $$6 = $$3;
            if (($$5 == 0 || $$5 == 1) && ($$5 = bgj.a(($$7 = $$3.getOptionalTyped($$2).flatMap($$1 -> $$1.getOptionalTyped($$4)).map($$1 -> $$1.getAllTyped($$6).size()).orElse(0).intValue()) / 2, 1, 5)) > 1) {
                $$6 = brs.a($$6, $$5);
            }
            if (($$8 = $$6.get("Xp").asNumber().result()).isEmpty()) {
                $$6 = brs.b($$6, $$5);
            }
            return $$6;
        }));
    }

    private static Typed<?> a(Typed<?> $$0, int $$1) {
        return $$0.update(DSL.remainderFinder(), $$12 -> $$12.update("VillagerData", $$1 -> $$1.set("level", $$1.createInt($$1))));
    }

    private static Typed<?> b(Typed<?> $$0, int $$12) {
        int $$2 = brs.a($$12);
        return $$0.update(DSL.remainderFinder(), $$1 -> $$1.set("Xp", $$1.createInt($$2)));
    }
}

