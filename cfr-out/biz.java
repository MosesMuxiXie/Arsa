/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class biz
extends DataFix {
    private final String a;
    private static final Set<String> b = Set.of("minecraft:empty", "minecraft:structure_starts", "minecraft:structure_references", "minecraft:biomes");

    public biz(Schema $$0) {
        super($$0, false);
        this.a = "Blending Data Fix v" + $$0.getVersionKey();
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getOutputSchema().getType(bqh.d);
        return this.fixTypeEverywhereTyped(this.a, $$0, $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> biz.a($$0, $$0.get("__context"))));
    }

    private static Dynamic<?> a(Dynamic<?> $$0, OptionalDynamic<?> $$1) {
        $$0 = $$0.remove("blending_data");
        boolean $$2 = "minecraft:overworld".equals($$1.get("dimension").asString().result().orElse(""));
        Optional $$3 = $$0.get("Status").result();
        if ($$2 && $$3.isPresent()) {
            Dynamic $$6;
            String $$7;
            String $$4 = bsh.a(((Dynamic)$$3.get()).asString("empty"));
            Optional $$5 = $$0.get("below_zero_retrogen").result();
            if (!b.contains($$4)) {
                $$0 = biz.a($$0, 384, -64);
            } else if ($$5.isPresent() && !b.contains($$7 = bsh.a(($$6 = (Dynamic)$$5.get()).get("target_status").asString("empty")))) {
                $$0 = biz.a($$0, 256, 0);
            }
        }
        return $$0;
    }

    private static Dynamic<?> a(Dynamic<?> $$0, int $$1, int $$2) {
        return $$0.set("blending_data", $$0.createMap(Map.of($$0.createString("min_section"), $$0.createInt(jw.a($$2)), $$0.createString("max_section"), $$0.createInt(jw.a($$2 + $$1)))));
    }
}

