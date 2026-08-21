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

public class bla
extends bow {
    public bla(Schema $$0, boolean $$1) {
        super($$0, $$1, "EntityArmorStandSilentFix", bqh.H, "ArmorStand");
    }

    public Dynamic<?> a(Dynamic<?> $$0) {
        if ($$0.get("Silent").asBoolean(false) && !$$0.get("Marker").asBoolean(false)) {
            return $$0.remove("Silent");
        }
        return $$0;
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), this::a);
    }
}

