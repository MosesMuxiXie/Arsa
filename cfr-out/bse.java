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
import java.util.Optional;

public class bse
extends bow {
    public bse(Schema $$0, boolean $$1) {
        super($$0, $$1, "Zombie Villager XP rebuild", bqh.H, "minecraft:zombie_villager");
    }

    @Override
    protected Typed<?> a(Typed<?> $$02) {
        return $$02.update(DSL.remainderFinder(), $$0 -> {
            Optional $$1 = $$0.get("Xp").asNumber().result();
            if ($$1.isEmpty()) {
                int $$2 = $$0.get("VillagerData").get("level").asInt(1);
                return $$0.set("Xp", $$0.createInt(brs.a($$2)));
            }
            return $$0;
        });
    }
}

