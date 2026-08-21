/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
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
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;

public class bii
extends DataFix {
    private final String a;
    private final DSL.TypeReference b;
    private final String c;
    private final String[] d;
    private final Function<Dynamic<?>, Dynamic<?>> e;

    public bii(Schema $$0, DSL.TypeReference $$1, String $$2, Function<Dynamic<?>, Dynamic<?>> $$3, String ... $$4) {
        super($$0, false);
        this.a = "Adding field `" + $$2 + "` to type `" + $$1.typeName().toLowerCase(Locale.ROOT) + "`";
        this.b = $$1;
        this.c = $$2;
        this.d = $$4;
        this.e = $$3;
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.a, this.getInputSchema().getType(this.b), this.getOutputSchema().getType(this.b), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> this.a((Dynamic<?>)$$0, 0)));
    }

    private Dynamic<?> a(Dynamic<?> $$0, int $$1) {
        if ($$1 >= this.d.length) {
            return $$0.set(this.c, this.e.apply($$0));
        }
        Optional $$2 = $$0.get(this.d[$$1]).result();
        if ($$2.isEmpty()) {
            return $$0;
        }
        return this.a((Dynamic)$$2.get(), $$1 + 1);
    }
}

