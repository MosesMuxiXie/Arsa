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
import java.util.Set;

public class bjd
extends DataFix {
    private static final Set<String> a = Set.of("minecraft:beacon", "minecraft:banner", "minecraft:brewing_stand", "minecraft:chest", "minecraft:trapped_chest", "minecraft:dispenser", "minecraft:dropper", "minecraft:enchanting_table", "minecraft:furnace", "minecraft:hopper", "minecraft:shulker_box");

    public bjd(Schema $$0) {
        super($$0, true);
    }

    public TypeRewriteRule makeRule() {
        OpticFinder $$0 = DSL.fieldFinder((String)"id", bsh.a());
        Type $$1 = this.getInputSchema().getType(bqh.w);
        Type $$2 = this.getOutputSchema().getType(bqh.w);
        Type<?> $$32 = bib.a($$1, $$1, $$2);
        return this.fixTypeEverywhereTyped("BlockEntityCustomNameToComponentFix", $$1, $$2, $$3 -> {
            Optional $$4 = $$3.getOptional($$0);
            if ($$4.isPresent() && !a.contains($$4.get())) {
                return bib.a($$2, $$3);
            }
            return bhs.a(bib.a($$32, $$3), $$2, bjd::a);
        });
    }

    public static <T> Dynamic<T> a(Dynamic<T> $$0) {
        String $$1 = $$0.get("CustomName").asString("");
        if ($$1.isEmpty()) {
            return $$0.remove("CustomName");
        }
        return $$0.set("CustomName", bic.a($$0.getOps(), $$1));
    }
}

