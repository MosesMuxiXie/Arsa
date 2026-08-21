/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.HashMap;
import java.util.Map;

public class bpu
extends DataFix {
    private static final Map<Integer, String> a = Map.of(100, "feet", 101, "legs", 102, "chest", 103, "head", -106, "offhand");

    public bpu(Schema $$0) {
        super($$0, true);
    }

    protected TypeRewriteRule makeRule() {
        Type $$02 = this.getInputSchema().getTypeRaw(bqh.c);
        Type $$1 = this.getOutputSchema().getTypeRaw(bqh.c);
        return this.writeFixAndRead("Player Equipment Fix", $$02, $$1, $$0 -> {
            HashMap $$12 = new HashMap();
            $$0 = $$0.update("Inventory", $$1 -> $$1.createList($$1.asStream().filter($$2 -> {
                int $$3 = $$2.get("Slot").asInt(-1);
                String $$4 = a.get($$3);
                if ($$4 != null) {
                    $$12.put($$1.createString($$4), $$2.remove("Slot"));
                }
                return $$4 == null;
            })));
            $$0 = $$0.set("equipment", $$0.createMap($$12));
            return $$0;
        });
    }
}

