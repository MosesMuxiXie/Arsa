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

public class bll
extends bow {
    public bll(Schema $$0) {
        super($$0, false, "EntityGoatMissingStateFix", bqh.H, "minecraft:goat");
    }

    @Override
    protected Typed<?> a(Typed<?> $$02) {
        return $$02.update(DSL.remainderFinder(), $$0 -> $$0.set("HasLeftHorn", $$0.createBoolean(true)).set("HasRightHorn", $$0.createBoolean(true)));
    }
}

