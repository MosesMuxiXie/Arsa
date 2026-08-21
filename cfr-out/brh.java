/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.base.Suppliers;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Supplier;

public class brh
extends bly {
    private final Supplier<a> b = Suppliers.memoize(() -> {
        Type $$0 = this.getInputSchema().getChoiceType(bqh.H, "minecraft:potion");
        Type<?> $$1 = bib.a($$0, this.getInputSchema().getType(bqh.H), this.getOutputSchema().getType(bqh.H));
        OpticFinder $$2 = $$1.findField("Item");
        OpticFinder $$3 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)bqh.J.typeName(), bsh.a()));
        return new a($$2, (OpticFinder<Pair<String, String>>)$$3);
    });

    public brh(Schema $$0) {
        super("ThrownPotionSplitFix", $$0, true);
    }

    @Override
    protected Pair<String, Typed<?>> a(String $$0, Typed<?> $$1) {
        if (!$$0.equals("minecraft:potion")) {
            return Pair.of((Object)$$0, $$1);
        }
        String $$2 = this.b.get().a($$1);
        if ("minecraft:lingering_potion".equals($$2)) {
            return Pair.of((Object)"minecraft:lingering_potion", $$1);
        }
        return Pair.of((Object)"minecraft:splash_potion", $$1);
    }

    record a(OpticFinder<?> a, OpticFinder<Pair<String, String>> b) {
        public String a(Typed<?> $$02) {
            return $$02.getOptionalTyped(this.a).flatMap($$0 -> $$0.getOptional(this.b)).map(Pair::getSecond).map(bsh::a).orElse("");
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "itemFinder;itemIdFinder", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "itemFinder;itemIdFinder", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "itemFinder;itemIdFinder", "a", "b"}, this, $$0);
        }
    }
}

