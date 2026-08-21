/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

public class blt
extends bow {
    private static final Map<String, String> c = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
        $$0.put("donkeykong", "donkey_kong");
        $$0.put("burningskull", "burning_skull");
        $$0.put("skullandroses", "skull_and_roses");
    });

    public blt(Schema $$0, boolean $$1) {
        super($$0, $$1, "EntityPaintingMotiveFix", bqh.H, "minecraft:painting");
    }

    public Dynamic<?> a(Dynamic<?> $$0) {
        Optional $$1 = $$0.get("Motive").asString().result();
        if ($$1.isPresent()) {
            String $$2 = ((String)$$1.get()).toLowerCase(Locale.ROOT);
            return $$0.set("Motive", $$0.createString(bsh.a(c.getOrDefault($$2, $$2))));
        }
        return $$0;
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), this::a);
    }
}

