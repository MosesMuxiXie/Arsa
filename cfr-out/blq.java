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

public class blq
extends bow {
    public blq(Schema $$0, boolean $$1) {
        super($$0, $$1, "EntityItemFrameDirectionFix", bqh.H, "minecraft:item_frame");
    }

    public Dynamic<?> a(Dynamic<?> $$0) {
        return $$0.set("Facing", $$0.createByte(blq.a($$0.get("Facing").asByte((byte)0))));
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), this::a);
    }

    private static byte a(byte $$0) {
        switch ($$0) {
            default: {
                return 2;
            }
            case 0: {
                return 3;
            }
            case 1: {
                return 4;
            }
            case 3: 
        }
        return 5;
    }
}

