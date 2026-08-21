/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class bjs
extends DataFix {
    public bjs(Schema $$0) {
        super($$0, true);
    }

    private static boolean a(String $$0) {
        return $$0.equals("minecraft:boat");
    }

    private static boolean b(String $$0) {
        return $$0.equals("minecraft:chest_boat");
    }

    private static boolean c(String $$0) {
        return bjs.a($$0) || bjs.b($$0);
    }

    private static String d(String $$0) {
        return switch ($$0) {
            default -> "minecraft:oak_boat";
            case "spruce" -> "minecraft:spruce_boat";
            case "birch" -> "minecraft:birch_boat";
            case "jungle" -> "minecraft:jungle_boat";
            case "acacia" -> "minecraft:acacia_boat";
            case "cherry" -> "minecraft:cherry_boat";
            case "dark_oak" -> "minecraft:dark_oak_boat";
            case "mangrove" -> "minecraft:mangrove_boat";
            case "bamboo" -> "minecraft:bamboo_raft";
        };
    }

    private static String e(String $$0) {
        return switch ($$0) {
            default -> "minecraft:oak_chest_boat";
            case "spruce" -> "minecraft:spruce_chest_boat";
            case "birch" -> "minecraft:birch_chest_boat";
            case "jungle" -> "minecraft:jungle_chest_boat";
            case "acacia" -> "minecraft:acacia_chest_boat";
            case "cherry" -> "minecraft:cherry_chest_boat";
            case "dark_oak" -> "minecraft:dark_oak_chest_boat";
            case "mangrove" -> "minecraft:mangrove_chest_boat";
            case "bamboo" -> "minecraft:bamboo_chest_raft";
        };
    }

    public TypeRewriteRule makeRule() {
        OpticFinder $$0 = DSL.fieldFinder((String)"id", bsh.a());
        Type $$1 = this.getInputSchema().getType(bqh.H);
        Type $$22 = this.getOutputSchema().getType(bqh.H);
        return this.fixTypeEverywhereTyped("BoatSplitFix", $$1, $$22, $$2 -> {
            Optional $$3 = $$2.getOptional($$0);
            if ($$3.isPresent() && bjs.c((String)$$3.get())) {
                String $$7;
                Dynamic $$4 = (Dynamic)$$2.getOrCreate(DSL.remainderFinder());
                Optional $$5 = $$4.get("Type").asString().result();
                if (bjs.b((String)$$3.get())) {
                    String $$6 = $$5.map(bjs::e).orElse("minecraft:oak_chest_boat");
                } else {
                    $$7 = $$5.map(bjs::d).orElse("minecraft:oak_boat");
                }
                return bib.a($$22, $$2).update(DSL.remainderFinder(), $$0 -> $$0.remove("Type")).set($$0, (Object)$$7);
            }
            return bib.a($$22, $$2);
        });
    }
}

