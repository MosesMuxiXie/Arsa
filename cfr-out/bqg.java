/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bqg
extends DataFix {
    public bqg(Schema $$0) {
        super($$0, false);
    }

    protected TypeRewriteRule makeRule() {
        Schema $$02 = this.getInputSchema();
        return this.fixTypeEverywhereTyped("RedstoneConnectionsFix", $$02.getType(bqh.y), $$0 -> $$0.update(DSL.remainderFinder(), this::a));
    }

    private <T> Dynamic<T> a(Dynamic<T> $$02) {
        boolean $$1 = $$02.get("Name").asString().result().filter("minecraft:redstone_wire"::equals).isPresent();
        if (!$$1) {
            return $$02;
        }
        return $$02.update("Properties", $$0 -> {
            String $$12 = $$0.get("east").asString("none");
            String $$2 = $$0.get("west").asString("none");
            String $$3 = $$0.get("north").asString("none");
            String $$4 = $$0.get("south").asString("none");
            boolean $$5 = bqg.a($$12) || bqg.a($$2);
            boolean $$6 = bqg.a($$3) || bqg.a($$4);
            String $$7 = !bqg.a($$12) && !$$6 ? "side" : $$12;
            String $$8 = !bqg.a($$2) && !$$6 ? "side" : $$2;
            String $$9 = !bqg.a($$3) && !$$5 ? "side" : $$3;
            String $$10 = !bqg.a($$4) && !$$5 ? "side" : $$4;
            return $$0.update("east", $$1 -> $$1.createString($$7)).update("west", $$1 -> $$1.createString($$8)).update("north", $$1 -> $$1.createString($$9)).update("south", $$1 -> $$1.createString($$10));
        });
    }

    private static boolean a(String $$0) {
        return !"none".equals($$0);
    }
}

