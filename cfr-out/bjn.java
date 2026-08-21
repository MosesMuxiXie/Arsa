/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class bjn
extends DataFix {
    private static final List<String> a = List.of("minecraft:witch", "minecraft:ravager", "minecraft:pillager", "minecraft:illusioner", "minecraft:evoker", "minecraft:vindicator");

    public bjn(Schema $$0) {
        super($$0, true);
    }

    private Typed<?> a(Typed<?> $$0, Map<String, String> $$12) {
        return $$0.update(DSL.remainderFinder(), $$1 -> {
            for (Map.Entry $$2 : $$12.entrySet()) {
                $$1 = $$1.renameAndFixField((String)$$2.getKey(), (String)$$2.getValue(), bib::a);
            }
            return $$1;
        });
    }

    private <T> Dynamic<T> a(Dynamic<T> $$0) {
        return $$0.update("frames", $$02 -> $$02.createList($$02.asStream().map($$0 -> {
            $$0 = $$0.renameAndFixField("Pos", "pos", bib::a);
            $$0 = $$0.renameField("Rotation", "rotation");
            $$0 = $$0.renameField("EntityId", "entity_id");
            return $$0;
        }))).update("banners", $$02 -> $$02.createList($$02.asStream().map($$0 -> {
            $$0 = $$0.renameField("Pos", "pos");
            $$0 = $$0.renameField("Color", "color");
            $$0 = $$0.renameField("Name", "name");
            return $$0;
        })));
    }

    public TypeRewriteRule makeRule() {
        ArrayList<TypeRewriteRule> $$03 = new ArrayList<TypeRewriteRule>();
        this.a($$03);
        this.b($$03);
        $$03.add(this.writeFixAndRead("BlockPos format for map frames", this.getInputSchema().getType(bqh.k), this.getOutputSchema().getType(bqh.k), $$0 -> $$0.update("data", this::a)));
        Type $$1 = this.getInputSchema().getType(bqh.x);
        $$03.add(this.fixTypeEverywhereTyped("BlockPos format for compass target", $$1, bnw.a($$1, "minecraft:compass"::equals, $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> $$0.update("LodestonePos", bib::a)))));
        return TypeRewriteRule.seq($$03);
    }

    private void a(List<TypeRewriteRule> $$0) {
        $$0.add(this.a(bqh.H, "minecraft:bee", Map.of("HivePos", "hive_pos", "FlowerPos", "flower_pos")));
        $$0.add(this.a(bqh.H, "minecraft:end_crystal", Map.of("BeamTarget", "beam_target")));
        $$0.add(this.a(bqh.H, "minecraft:wandering_trader", Map.of("WanderTarget", "wander_target")));
        for (String $$1 : a) {
            $$0.add(this.a(bqh.H, $$1, Map.of("PatrolTarget", "patrol_target")));
        }
        $$0.add(this.fixTypeEverywhereTyped("BlockPos format in Leash for mobs", this.getInputSchema().getType(bqh.H), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> $$0.renameAndFixField("Leash", "leash", bib::a))));
    }

    private void b(List<TypeRewriteRule> $$0) {
        $$0.add(this.a(bqh.w, "minecraft:beehive", Map.of("FlowerPos", "flower_pos")));
        $$0.add(this.a(bqh.w, "minecraft:end_gateway", Map.of("ExitPortal", "exit_portal")));
    }

    private TypeRewriteRule a(DSL.TypeReference $$0, String $$1, Map<String, String> $$22) {
        String $$3 = "BlockPos format in " + String.valueOf($$22.keySet()) + " for " + $$1 + " (" + $$0.typeName() + ")";
        OpticFinder $$4 = DSL.namedChoice((String)$$1, (Type)this.getInputSchema().getChoiceType($$0, $$1));
        return this.fixTypeEverywhereTyped($$3, this.getInputSchema().getType($$0), $$2 -> $$2.updateTyped($$4, $$1 -> this.a((Typed<?>)$$1, $$22)));
    }
}

