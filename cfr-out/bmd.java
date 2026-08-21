/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class bmd
extends bqw {
    public bmd(Schema $$0, boolean $$1) {
        super("EntitySkeletonSplitFix", $$0, $$1);
    }

    @Override
    protected Pair<String, Dynamic<?>> a(String $$0, Dynamic<?> $$1) {
        if (Objects.equals($$0, "Skeleton")) {
            int $$2 = $$1.get("SkeletonType").asInt(0);
            if ($$2 == 1) {
                $$0 = "WitherSkeleton";
            } else if ($$2 == 2) {
                $$0 = "Stray";
            }
        }
        return Pair.of((Object)$$0, $$1);
    }
}

