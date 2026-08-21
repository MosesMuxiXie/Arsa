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

public class bqk
extends box {
    public bqk(Schema $$0) {
        super($$0, false, "RemoveEmptyItemInSuspiciousBlockFix", bqh.w, "minecraft:brushable_block");
    }

    @Override
    protected <T> Dynamic<T> a(Dynamic<T> $$0) {
        Optional $$1 = $$0.get("item").result();
        if ($$1.isPresent() && bqk.b((Dynamic)$$1.get())) {
            return $$0.remove("item");
        }
        return $$0;
    }

    private static boolean b(Dynamic<?> $$0) {
        String $$1 = bsh.a($$0.get("id").asString("minecraft:air"));
        int $$2 = $$0.get("count").asInt(0);
        return $$1.equals("minecraft:air") || $$2 == 0;
    }
}

