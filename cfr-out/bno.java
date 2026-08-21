/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.function.Function;

public abstract class bno
extends DataFix {
    private final String a;

    public bno(Schema $$0, String $$1) {
        super($$0, false);
        this.a = $$1;
    }

    public TypeRewriteRule makeRule() {
        Type $$0 = DSL.named((String)bqh.J.typeName(), bsh.a());
        if (!Objects.equals(this.getInputSchema().getType(bqh.J), $$0)) {
            throw new IllegalStateException("item name type is not what was expected.");
        }
        return this.fixTypeEverywhere(this.a, $$0, $$02 -> $$0 -> $$0.mapSecond(this::a));
    }

    protected abstract String a(String var1);

    public static DataFix a(Schema $$0, String $$1, final Function<String, String> $$2) {
        return new bno($$0, $$1){

            @Override
            protected String a(String $$0) {
                return (String)$$2.apply($$0);
            }
        };
    }
}

