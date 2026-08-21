/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bnc
extends bow {
    public bnc(Schema $$0, String $$1) {
        super($$0, false, "Gossip for for " + $$1, bqh.H, $$1);
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), $$02 -> $$02.update("Gossips", $$0 -> (Dynamic)DataFixUtils.orElse($$0.asStreamOpt().result().map($$02 -> $$02.map($$0 -> bih.c($$0, "Target", "Target").orElse((Dynamic<?>)$$0))).map(arg_0 -> ((Dynamic)$$0).createList(arg_0)), (Object)$$0)));
    }
}

