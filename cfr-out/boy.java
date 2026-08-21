/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
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
import java.util.function.UnaryOperator;

public class boy
extends DataFix {
    private final String a;
    private final DSL.TypeReference b;
    private final UnaryOperator<String> c;

    public boy(Schema $$0, String $$1, DSL.TypeReference $$2, UnaryOperator<String> $$3) {
        super($$0, false);
        this.a = $$1;
        this.b = $$2;
        this.c = $$3;
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = DSL.named((String)this.b.typeName(), bsh.a());
        if (!Objects.equals($$0, this.getInputSchema().getType(this.b))) {
            throw new IllegalStateException("\"" + this.b.typeName() + "\" is not what was expected.");
        }
        return this.fixTypeEverywhere(this.a, $$0, $$02 -> $$0 -> $$0.mapSecond(this.c));
    }
}

