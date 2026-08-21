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
import java.util.Optional;

public class bpv
extends bow {
    public bpv(Schema $$0) {
        super($$0, false, "PlayerHeadBlockProfileFix", bqh.w, "minecraft:skull");
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), this::a);
    }

    private <T> Dynamic<T> a(Dynamic<T> $$0) {
        Optional $$2;
        Optional $$1 = $$0.get("SkullOwner").result();
        Optional $$3 = $$1.or(() -> bpv.a($$2 = $$0.get("ExtraType").result()));
        if ($$3.isEmpty()) {
            return $$0;
        }
        $$0 = $$0.remove("SkullOwner").remove("ExtraType");
        $$0 = $$0.set("profile", bnr.a((Dynamic)$$3.get()));
        return $$0;
    }

    private static /* synthetic */ Optional a(Optional $$0) {
        return $$0;
    }
}

