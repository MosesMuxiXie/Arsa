/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;

public class bqa
extends box {
    public bqa(Schema $$0) {
        super($$0, true, "PrimedTnt BlockState fixer", bqh.H, "minecraft:tnt");
    }

    private static <T> Dynamic<T> b(Dynamic<T> $$0) {
        Optional $$1 = $$0.get("Fuse").get().result();
        if ($$1.isPresent()) {
            return $$0.set("fuse", (Dynamic)$$1.get());
        }
        return $$0;
    }

    private static <T> Dynamic<T> c(Dynamic<T> $$0) {
        return $$0.set("block_state", $$0.createMap(Map.of($$0.createString("Name"), $$0.createString("minecraft:tnt"))));
    }

    @Override
    protected <T> Dynamic<T> a(Dynamic<T> $$0) {
        return bqa.b(bqa.c($$0));
    }
}

