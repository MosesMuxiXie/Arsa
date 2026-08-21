/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import org.jspecify.annotations.Nullable;

public class brn
extends bkr {
    public brn(Schema $$0) {
        super($$0, "TridentAnimationFix", "minecraft:consumable");
    }

    @Override
    protected <T> @Nullable Dynamic<T> a(Dynamic<T> $$02) {
        return $$02.update("animation", $$0 -> {
            String $$1 = $$0.asString().result().orElse("");
            if ("spear".equals($$1)) {
                return $$0.createString("trident");
            }
            return $$0;
        });
    }
}

