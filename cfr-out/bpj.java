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

public class bpj
extends DataFix {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public bpj(Schema $$0, String $$1, String $$2, String $$3, String $$4) {
        super($$0, true);
        this.a = $$1;
        this.b = $$2;
        this.c = $$3;
        this.d = $$4;
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("graphicsMode split to " + this.a, this.getInputSchema().getType(bqh.f), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> (Dynamic)DataFixUtils.orElseGet((Optional)$$0.get("graphicsMode").asString().map($$1 -> $$0.set(this.a, $$0.createString(this.a((String)$$1)))).result(), () -> $$0.set(this.a, $$0.createString(this.c)))));
    }

    private String a(String $$0) {
        return switch ($$0) {
            case "2" -> this.d;
            case "0" -> this.b;
            default -> this.c;
        };
    }
}

