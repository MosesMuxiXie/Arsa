/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.DoubleUnaryOperator;

public class blb
extends bow {
    private final String c;
    private final DoubleUnaryOperator d;

    public blb(Schema $$0, String $$1, String $$2, String $$3, DoubleUnaryOperator $$4) {
        super($$0, false, $$1, bqh.H, $$2);
        this.c = $$3;
        this.d = $$4;
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), this::a);
    }

    private Dynamic<?> a(Dynamic<?> $$0) {
        return $$0.update("attributes", $$1 -> $$0.createList($$1.asStream().map($$0 -> {
            Object $$1 = bsh.a($$0.get("id").asString(""));
            if (!$$1.equals(this.c)) {
                return $$0;
            }
            double $$2 = $$0.get("base").asDouble(0.0);
            return $$0.set("base", $$0.createDouble(this.d.applyAsDouble($$2)));
        })));
    }
}

