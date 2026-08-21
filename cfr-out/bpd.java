/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class bpd
extends bnw {
    public bpd(Schema $$02) {
        super($$02, "OminousBannerRenameFix", $$0 -> $$0.equals("minecraft:white_banner"));
    }

    private <T> Dynamic<T> a(Dynamic<T> $$0) {
        return $$0.update("display", $$02 -> $$02.update("Name", $$0 -> {
            Optional $$1 = $$0.asString().result();
            if ($$1.isPresent()) {
                return $$0.createString(((String)$$1.get()).replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\""));
            }
            return $$0;
        }));
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return bhs.a($$0, $$0.getType(), this::a);
    }
}

