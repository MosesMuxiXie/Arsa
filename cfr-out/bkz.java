/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class bkz
extends DataFix {
    public bkz(Schema $$0) {
        super($$0, false);
    }

    public TypeRewriteRule makeRule() {
        Type $$02 = this.getInputSchema().getType(bqh.B);
        return this.writeFixAndRead("EmptyItemInVillagerTradeFix", $$02, $$02, $$0 -> {
            Dynamic $$1 = $$0.get("buyB").orElseEmptyMap();
            String $$2 = bsh.a($$1.get("id").asString("minecraft:air"));
            int $$3 = $$1.get("count").asInt(0);
            if ($$2.equals("minecraft:air") || $$3 == 0) {
                return $$0.remove("buyB");
            }
            return $$0;
        });
    }
}

