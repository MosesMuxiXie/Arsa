/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class bqs
extends bih {
    private static final Logger b = LogUtils.getLogger();

    public bqs(Schema $$0) {
        super($$0, bqh.m);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("SavedDataUUIDFix", this.getInputSchema().getType(this.a), $$0 -> $$0.update(DSL.remainderFinder(), $$02 -> $$02.update("data", $$0 -> $$0.update("Raids", $$02 -> $$02.createList($$02.asStream().map($$0 -> $$0.update("HeroesOfTheVillage", $$02 -> $$02.createList($$02.asStream().map($$0 -> bqs.d($$0, "UUIDMost", "UUIDLeast").orElseGet(() -> {
            b.warn("HeroesOfTheVillage contained invalid UUIDs.");
            return $$0;
        }))))))))));
    }
}

