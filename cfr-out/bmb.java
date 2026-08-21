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

public class bmb
extends bow {
    public bmb(Schema $$0, boolean $$1) {
        super($$0, $$1, "EntityShulkerColorFix", bqh.H, "minecraft:shulker");
    }

    public Dynamic<?> a(Dynamic<?> $$0) {
        if ($$0.get("Color").map(Dynamic::asNumber).result().isEmpty()) {
            return $$0.set("Color", $$0.createByte((byte)10));
        }
        return $$0;
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), this::a);
    }
}

