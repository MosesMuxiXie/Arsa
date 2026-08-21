/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class bpb
extends bow {
    public bpb(Schema $$0, boolean $$1) {
        super($$0, $$1, "OminousBannerBlockEntityRenameFix", bqh.w, "minecraft:banner");
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        OpticFinder $$12 = $$0.getType().findField("CustomName");
        OpticFinder $$2 = DSL.typeFinder((Type)this.getInputSchema().getType(bqh.D));
        return $$0.updateTyped($$12, $$1 -> $$1.update($$2, $$02 -> $$02.mapSecond($$0 -> $$0.replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\""))));
    }
}

