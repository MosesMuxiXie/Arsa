/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bsv
extends bsh {
    public bsv(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
        Map $$1 = super.registerBlockEntities($$0);
        $$1.remove("minecraft:flower_pot");
        $$1.remove("minecraft:noteblock");
        return $$1;
    }
}

