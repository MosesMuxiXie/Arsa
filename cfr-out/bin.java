/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class bin
extends bow {
    public bin(Schema $$0) {
        super($$0, false, "AreaEffectCloudDurationScaleFix", bqh.H, "minecraft:area_effect_cloud");
    }

    @Override
    protected Typed<?> a(Typed<?> $$02) {
        return $$02.update(DSL.remainderFinder(), $$0 -> $$0.set("potion_duration_scale", $$0.createFloat(0.25f)));
    }
}

