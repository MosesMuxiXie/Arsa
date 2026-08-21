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

public class bmk
extends bow {
    public bmk(Schema $$0, boolean $$1) {
        super($$0, $$1, "EntityWolfColorFix", bqh.H, "minecraft:wolf");
    }

    public Dynamic<?> a(Dynamic<?> $$02) {
        return $$02.update("CollarColor", $$0 -> $$0.createByte((byte)(15 - $$0.asInt(0))));
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), this::a);
    }
}

