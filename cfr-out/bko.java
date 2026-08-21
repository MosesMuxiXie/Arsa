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

public class bko
extends bow {
    public bko(Schema $$0) {
        super($$0, false, "CopperGolemWeatherStateFix", bqh.H, "minecraft:copper_golem");
    }

    @Override
    protected Typed<?> a(Typed<?> $$02) {
        return $$02.update(DSL.remainderFinder(), $$0 -> $$0.update("weather_state", bko::a));
    }

    private static Dynamic<?> a(Dynamic<?> $$0) {
        return switch ($$0.asInt(0)) {
            case 1 -> $$0.createString("exposed");
            case 2 -> $$0.createString("weathered");
            case 3 -> $$0.createString("oxidized");
            default -> $$0.createString("unaffected");
        };
    }
}

