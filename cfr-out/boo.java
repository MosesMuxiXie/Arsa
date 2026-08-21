/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class boo
extends bkr {
    public boo(Schema $$0) {
        super($$0, "LodestoneCompassComponentFix", "minecraft:lodestone_target", "minecraft:lodestone_tracker");
    }

    @Override
    protected <T> Dynamic<T> a(Dynamic<T> $$0) {
        Optional $$1 = $$0.get("pos").result();
        Optional $$2 = $$0.get("dimension").result();
        $$0 = $$0.remove("pos").remove("dimension");
        if ($$1.isPresent() && $$2.isPresent()) {
            $$0 = $$0.set("target", $$0.emptyMap().set("pos", (Dynamic)$$1.get()).set("dimension", (Dynamic)$$2.get()));
        }
        return $$0;
    }
}

