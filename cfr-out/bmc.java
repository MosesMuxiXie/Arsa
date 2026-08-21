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
import java.util.List;

public class bmc
extends bow {
    public bmc(Schema $$0) {
        super($$0, false, "EntityShulkerRotationFix", bqh.H, "minecraft:shulker");
    }

    public Dynamic<?> a(Dynamic<?> $$02) {
        List $$1 = $$02.get("Rotation").asList($$0 -> $$0.asDouble(180.0));
        if (!$$1.isEmpty()) {
            $$1.set(0, (Double)$$1.get(0) - 180.0);
            return $$02.set("Rotation", $$02.createList($$1.stream().map(arg_0 -> $$02.createDouble(arg_0))));
        }
        return $$02;
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), this::a);
    }
}

