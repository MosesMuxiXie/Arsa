/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class bij
extends DataFix {
    private final String a;
    private final boolean b;
    private final String c;
    private final DSL.TypeReference d;

    public bij(Schema $$0, DSL.TypeReference $$1, String $$2, boolean $$3) {
        super($$0, true);
        this.b = $$3;
        this.c = $$2;
        this.a = "AddFlagIfNotPresentFix_" + this.c + "=" + this.b + " for " + $$0.getVersionKey();
        this.d = $$1;
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(this.d);
        return this.fixTypeEverywhereTyped(this.a, $$0, $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> $$0.set(this.c, (Dynamic)DataFixUtils.orElseGet((Optional)$$0.get(this.c).result(), () -> $$0.createBoolean(this.b)))));
    }
}

