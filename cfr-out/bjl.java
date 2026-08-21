/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bjl
extends bih {
    public bjl(Schema $$0) {
        super($$0, bqh.w);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("BlockEntityUUIDFix", this.getInputSchema().getType(this.a), $$0 -> {
            $$0 = this.a((Typed<?>)$$0, "minecraft:conduit", this::c);
            $$0 = this.a((Typed<?>)$$0, "minecraft:skull", this::b);
            return $$0;
        });
    }

    private Dynamic<?> b(Dynamic<?> $$02) {
        return $$02.get("Owner").get().map($$0 -> bjl.a($$0, "Id", "Id").orElse((Dynamic<?>)$$0)).map($$1 -> $$02.remove("Owner").set("SkullOwner", $$1)).result().orElse($$02);
    }

    private Dynamic<?> c(Dynamic<?> $$0) {
        return bjl.b($$0, "target_uuid", "Target").orElse($$0);
    }
}

