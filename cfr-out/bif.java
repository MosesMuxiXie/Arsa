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

public abstract class bif
extends DataFix {
    private final String a;

    public bif(Schema $$0, String $$1) {
        super($$0, false);
        this.a = $$1;
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.a, this.getInputSchema().getType(bqh.y), $$0 -> $$0.update(DSL.remainderFinder(), this::a));
    }

    private Dynamic<?> a(Dynamic<?> $$0) {
        Optional<String> $$12 = $$0.get("Name").asString().result().map(bsh::a);
        if ($$12.isPresent() && this.a($$12.get())) {
            return $$0.update("Properties", $$1 -> this.a((String)$$12.get(), (Dynamic)$$1));
        }
        return $$0;
    }

    protected abstract boolean a(String var1);

    protected abstract <T> Dynamic<T> a(String var1, Dynamic<T> var2);
}

