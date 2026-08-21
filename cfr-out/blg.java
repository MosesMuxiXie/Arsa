/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;

public class blg
extends DataFix {
    public blg(Schema $$0) {
        super($$0, true);
    }

    public TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.H);
        Type $$1 = this.getOutputSchema().getType(bqh.H);
        OpticFinder $$2 = DSL.fieldFinder((String)"id", bsh.a());
        OpticFinder $$3 = $$0.findField("CustomName");
        Type $$42 = $$1.findFieldType("CustomName");
        return this.fixTypeEverywhereTyped("EntityCustomNameToComponentFix", $$0, $$1, $$4 -> blg.a($$4, $$1, (OpticFinder<String>)$$2, (OpticFinder<String>)$$3, $$42));
    }

    private static <T> Typed<?> a(Typed<?> $$02, Type<?> $$1, OpticFinder<String> $$2, OpticFinder<String> $$3, Type<T> $$4) {
        Optional $$5 = $$02.getOptional($$3);
        if ($$5.isEmpty()) {
            return bib.a($$1, $$02);
        }
        if (((String)$$5.get()).isEmpty()) {
            return bhs.a($$02, $$1, $$0 -> $$0.remove("CustomName"));
        }
        String $$6 = $$02.getOptional($$2).orElse("");
        Dynamic<T> $$7 = blg.a($$02.getOps(), (String)$$5.get(), $$6);
        return $$02.set($$3, bhs.a($$4, $$7));
    }

    private static <T> Dynamic<T> a(DynamicOps<T> $$0, String $$1, String $$2) {
        if ("minecraft:commandblock_minecart".equals($$2)) {
            return new Dynamic($$0, $$0.createString($$1));
        }
        return bic.a($$0, $$1);
    }
}

