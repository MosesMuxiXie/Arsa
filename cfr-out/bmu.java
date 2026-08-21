/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.function.Function;

public class bmu
extends DataFix {
    private static final String a = "minecraft:empty";

    public bmu(Schema $$0) {
        super($$0, true);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.H);
        Type $$1 = this.getOutputSchema().getType(bqh.H);
        return this.fixTypeEverywhereTyped("Fix AbstractArrow item type", $$0, $$1, bib.a(this.a("minecraft:trident", bmu::c), this.a("minecraft:arrow", bmu::a), this.a("minecraft:spectral_arrow", bmu::b)));
    }

    private Function<Typed<?>, Typed<?>> a(String $$0, a<?> $$1) {
        Type $$2 = this.getInputSchema().getChoiceType(bqh.H, $$0);
        Type $$3 = this.getOutputSchema().getChoiceType(bqh.H, $$0);
        return bmu.a($$0, $$1, $$2, $$3);
    }

    private static <T> Function<Typed<?>, Typed<?>> a(String $$0, a<?> $$1, Type<?> $$2, Type<T> $$32) {
        OpticFinder $$4 = DSL.namedChoice((String)$$0, $$2);
        a<?> $$5 = $$1;
        return $$3 -> $$3.updateTyped($$4, $$32, $$2 -> $$5.fix((Typed<?>)$$2, $$32));
    }

    private static <T> Typed<T> a(Typed<?> $$02, Type<T> $$1) {
        return bhs.a($$02, $$1, $$0 -> $$0.set("item", bmu.a($$0, bmu.a($$0))));
    }

    private static String a(Dynamic<?> $$0) {
        return $$0.get("Potion").asString(a).equals(a) ? "minecraft:arrow" : "minecraft:tipped_arrow";
    }

    private static <T> Typed<T> b(Typed<?> $$02, Type<T> $$1) {
        return bhs.a($$02, $$1, $$0 -> $$0.set("item", bmu.a($$0, "minecraft:spectral_arrow")));
    }

    private static Dynamic<?> a(Dynamic<?> $$0, String $$1) {
        return $$0.createMap((Map)ImmutableMap.of((Object)$$0.createString("id"), (Object)$$0.createString($$1), (Object)$$0.createString("Count"), (Object)$$0.createInt(1)));
    }

    private static <T> Typed<T> c(Typed<?> $$0, Type<T> $$1) {
        return new Typed($$1, $$0.getOps(), $$0.getValue());
    }

    static interface a<F> {
        public Typed<F> fix(Typed<?> var1, Type<F> var2);
    }
}

