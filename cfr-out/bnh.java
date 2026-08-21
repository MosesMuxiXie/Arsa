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
import java.util.Optional;

public class bnh
extends DataFix {
    public bnh(Schema $$0) {
        super($$0, false);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("BlockEntityLockToComponentFix", this.getInputSchema().getType(bqh.w), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> {
            Optional $$1 = $$0.get("lock").result();
            if ($$1.isEmpty()) {
                return $$0;
            }
            Dynamic $$2 = bni.b((Dynamic)$$1.get());
            if ($$2 != null) {
                return $$0.set("lock", $$2);
            }
            return $$0.remove("lock");
        }));
    }
}

