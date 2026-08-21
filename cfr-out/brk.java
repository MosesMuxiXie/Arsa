/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import com.mojang.datafixers.types.templates.TaggedChoice;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class brk
extends DataFix {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 4096;
    private static final short c = 12;

    public brk(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public TypeRewriteRule makeRule() {
        Type $$0 = this.getOutputSchema().getType(bqh.d);
        Type $$1 = $$0.findFieldType("Level");
        Type $$2 = $$1.findFieldType("TileEntities");
        if (!($$2 instanceof List.ListType)) {
            throw new IllegalStateException("Tile entity type is not a list type.");
        }
        List.ListType $$3 = (List.ListType)$$2;
        OpticFinder $$42 = DSL.fieldFinder((String)"TileEntities", (Type)$$3);
        Type $$5 = this.getInputSchema().getType(bqh.d);
        OpticFinder $$6 = $$5.findField("Level");
        OpticFinder $$7 = $$6.type().findField("Sections");
        Type $$8 = $$7.type();
        if (!($$8 instanceof List.ListType)) {
            throw new IllegalStateException("Expecting sections to be a list.");
        }
        Type $$9 = ((List.ListType)$$8).getElement();
        OpticFinder $$10 = DSL.typeFinder((Type)$$9);
        return TypeRewriteRule.seq((TypeRewriteRule)new bik(this.getOutputSchema(), "AddTrappedChestFix", bqh.w).makeRule(), (TypeRewriteRule)this.fixTypeEverywhereTyped("Trapped Chest fix", $$5, $$4 -> $$4.updateTyped($$6, $$3 -> {
            Object $$4 = $$3.getOptionalTyped($$7);
            if ($$4.isEmpty()) {
                return $$3;
            }
            List $$5 = ((Typed)$$4.get()).getAllTyped($$10);
            IntOpenHashSet $$6 = new IntOpenHashSet();
            for (Typed $$7 : $$5) {
                a $$8 = new a($$7, this.getInputSchema());
                if ($$8.b()) continue;
                for (int $$9 = 0; $$9 < 4096; ++$$9) {
                    int $$10 = $$8.c($$9);
                    if (!$$8.a($$10)) continue;
                    $$6.add($$8.c() << 12 | $$9);
                }
            }
            Dynamic $$11 = (Dynamic)$$3.get(DSL.remainderFinder());
            int $$12 = $$11.get("xPos").asInt(0);
            int $$13 = $$11.get("zPos").asInt(0);
            TaggedChoice.TaggedChoiceType $$14 = this.getInputSchema().findChoiceType(bqh.w);
            return $$3.updateTyped($$42, arg_0 -> brk.a($$14, $$12, $$13, (IntSet)$$6, arg_0));
        })));
    }

    private static /* synthetic */ Typed a(TaggedChoice.TaggedChoiceType $$0, int $$1, int $$2, IntSet $$3, Typed $$42) {
        return $$42.updateTyped($$0.finder(), $$4 -> {
            int $$8;
            int $$7;
            Dynamic $$5 = (Dynamic)$$4.getOrCreate(DSL.remainderFinder());
            int $$6 = $$5.get("x").asInt(0) - ($$1 << 4);
            if ($$3.contains(boe.a($$6, $$7 = $$5.get("y").asInt(0), $$8 = $$5.get("z").asInt(0) - ($$2 << 4)))) {
                return $$4.update($$0.finder(), $$02 -> $$02.mapFirst($$0 -> {
                    if (!Objects.equals($$0, "minecraft:chest")) {
                        a.warn("Block Entity was expected to be a chest");
                    }
                    return "minecraft:trapped_chest";
                }));
            }
            return $$4;
        });
    }

    public static final class a
    extends boe.b {
        private @Nullable IntSet h;

        public a(Typed<?> $$0, Schema $$1) {
            super($$0, $$1);
        }

        @Override
        protected boolean a() {
            this.h = new IntOpenHashSet();
            for (int $$0 = 0; $$0 < this.e.size(); ++$$0) {
                Dynamic $$1 = (Dynamic)this.e.get($$0);
                String $$2 = $$1.get("Name").asString("");
                if (!Objects.equals($$2, "minecraft:trapped_chest")) continue;
                this.h.add($$0);
            }
            return this.h.isEmpty();
        }

        public boolean a(int $$0) {
            return this.h.contains($$0);
        }
    }
}

