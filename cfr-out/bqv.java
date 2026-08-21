/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.List;

public class bqv
extends bow {
    private static final List<String> c = List.of("Text1", "Text2", "Text3", "Text4");

    public bqv(Schema $$0) {
        super($$0, false, "SignTextStrictJsonFix", bqh.w, "Sign");
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        for (String $$12 : c) {
            OpticFinder $$2 = $$0.getType().findField($$12);
            OpticFinder $$3 = DSL.typeFinder((Type)this.getInputSchema().getType(bqh.D));
            $$0 = $$0.updateTyped($$2, $$1 -> $$1.update($$3, $$0 -> $$0.mapSecond(bic::c)));
        }
        return $$0;
    }
}

