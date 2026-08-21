/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class bng
extends DataFix {
    public bng(Schema $$0) {
        super($$0, false);
    }

    public TypeRewriteRule makeRule() {
        OpticFinder<?> $$02 = this.a("minecraft:vex");
        OpticFinder<?> $$1 = this.a("minecraft:phantom");
        OpticFinder<?> $$2 = this.a("minecraft:turtle");
        List<OpticFinder<?>> $$3 = List.of(this.a("minecraft:item_frame"), this.a("minecraft:glow_item_frame"), this.a("minecraft:painting"), this.a("minecraft:leash_knot"));
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhereTyped("InlineBlockPosFormatFix - player", this.getInputSchema().getType(bqh.c), $$0 -> $$0.update(DSL.remainderFinder(), this::a)), (TypeRewriteRule)this.fixTypeEverywhereTyped("InlineBlockPosFormatFix - entity", this.getInputSchema().getType(bqh.H), $$4 -> {
            $$4 = $$4.update(DSL.remainderFinder(), this::b).updateTyped($$02, $$0 -> $$0.update(DSL.remainderFinder(), this::c)).updateTyped($$1, $$0 -> $$0.update(DSL.remainderFinder(), this::d)).updateTyped($$2, $$0 -> $$0.update(DSL.remainderFinder(), this::e));
            for (OpticFinder $$5 : $$3) {
                $$4 = $$4.updateTyped($$5, $$0 -> $$0.update(DSL.remainderFinder(), this::f));
            }
            return $$4;
        }));
    }

    private OpticFinder<?> a(String $$0) {
        return DSL.namedChoice((String)$$0, (Type)this.getInputSchema().getChoiceType(bqh.H, $$0));
    }

    private Dynamic<?> a(Dynamic<?> $$0) {
        Optional $$5;
        $$0 = this.b($$0);
        Optional $$1 = $$0.get("SpawnX").asNumber().result();
        Optional $$2 = $$0.get("SpawnY").asNumber().result();
        Optional $$3 = $$0.get("SpawnZ").asNumber().result();
        if ($$1.isPresent() && $$2.isPresent() && $$3.isPresent()) {
            Dynamic $$4 = $$0.createMap(Map.of($$0.createString("pos"), bib.a($$0, ((Number)$$1.get()).intValue(), ((Number)$$2.get()).intValue(), ((Number)$$3.get()).intValue())));
            $$4 = Dynamic.copyField($$0, (String)"SpawnAngle", (Dynamic)$$4, (String)"angle");
            $$4 = Dynamic.copyField($$0, (String)"SpawnDimension", (Dynamic)$$4, (String)"dimension");
            $$4 = Dynamic.copyField($$0, (String)"SpawnForced", (Dynamic)$$4, (String)"forced");
            $$0 = $$0.remove("SpawnX").remove("SpawnY").remove("SpawnZ").remove("SpawnAngle").remove("SpawnDimension").remove("SpawnForced");
            $$0 = $$0.set("respawn", $$4);
        }
        if (($$5 = $$0.get("enteredNetherPosition").result()).isPresent()) {
            $$0 = $$0.remove("enteredNetherPosition").set("entered_nether_pos", $$0.createList(Stream.of($$0.createDouble(((Dynamic)$$5.get()).get("x").asDouble(0.0)), $$0.createDouble(((Dynamic)$$5.get()).get("y").asDouble(0.0)), $$0.createDouble(((Dynamic)$$5.get()).get("z").asDouble(0.0)))));
        }
        return $$0;
    }

    private Dynamic<?> b(Dynamic<?> $$0) {
        return bib.a($$0, "SleepingX", "SleepingY", "SleepingZ", "sleeping_pos");
    }

    private Dynamic<?> c(Dynamic<?> $$0) {
        return bib.a($$0.renameField("LifeTicks", "life_ticks"), "BoundX", "BoundY", "BoundZ", "bound_pos");
    }

    private Dynamic<?> d(Dynamic<?> $$0) {
        return bib.a($$0.renameField("Size", "size"), "AX", "AY", "AZ", "anchor_pos");
    }

    private Dynamic<?> e(Dynamic<?> $$0) {
        $$0 = $$0.remove("TravelPosX").remove("TravelPosY").remove("TravelPosZ");
        $$0 = bib.a($$0, "HomePosX", "HomePosY", "HomePosZ", "home_pos");
        return $$0.renameField("HasEgg", "has_egg");
    }

    private Dynamic<?> f(Dynamic<?> $$0) {
        return bib.a($$0, "TileX", "TileY", "TileZ", "block_pos");
    }
}

