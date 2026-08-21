/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class bpf
extends DataFix {
    public bpf(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("OptionsAddTextBackgroundFix", this.getInputSchema().getType(bqh.f), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> (Dynamic)DataFixUtils.orElse((Optional)$$0.get("chatOpacity").asString().map($$1 -> {
            double $$2 = this.a((String)$$1);
            return $$0.set("textBackgroundOpacity", $$0.createString(String.valueOf($$2)));
        }).result(), (Object)$$0)));
    }

    private double a(String $$0) {
        try {
            double $$1 = 0.9 * Double.parseDouble($$0) + 0.1;
            return $$1 / 2.0;
        }
        catch (NumberFormatException $$2) {
            return 0.5;
        }
    }
}

