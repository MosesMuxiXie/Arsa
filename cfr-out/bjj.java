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

public class bjj
extends bow {
    public bjj(Schema $$0, boolean $$1) {
        super($$0, $$1, "BlockEntityShulkerBoxColorFix", bqh.w, "minecraft:shulker_box");
    }

    @Override
    protected Typed<?> a(Typed<?> $$02) {
        return $$02.update(DSL.remainderFinder(), $$0 -> $$0.remove("Color"));
    }
}

