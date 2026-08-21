/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class bpo
extends DataFix {
    public bpo(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("OptionsMusicToastFix", this.getInputSchema().getType(bqh.f), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> $$0.renameAndFixField("showNowPlayingToast", "musicToast", $$1 -> $$0.createString($$1.asString("false").equals("false") ? "never" : "pause_and_toast"))));
    }
}

