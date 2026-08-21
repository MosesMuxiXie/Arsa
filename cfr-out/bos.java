/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.FieldFinder
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.CompoundList$CompoundListType
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.datafixers.util.Unit
 *  com.mojang.serialization.Dynamic
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.FieldFinder;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.CompoundList;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Map;

public class bos
extends DataFix {
    public bos(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    protected static <A> Type<Pair<A, Dynamic<?>>> a(String $$0, Type<A> $$1) {
        return DSL.and((Type)DSL.field((String)$$0, $$1), (Type)DSL.remainderType());
    }

    protected static <A> Type<Pair<Either<A, Unit>, Dynamic<?>>> b(String $$0, Type<A> $$1) {
        return DSL.and((Type)DSL.optional((Type)DSL.field((String)$$0, $$1)), (Type)DSL.remainderType());
    }

    protected static <A1, A2> Type<Pair<Either<A1, Unit>, Pair<Either<A2, Unit>, Dynamic<?>>>> a(String $$0, Type<A1> $$1, String $$2, Type<A2> $$3) {
        return DSL.and((Type)DSL.optional((Type)DSL.field((String)$$0, $$1)), (Type)DSL.optional((Type)DSL.field((String)$$2, $$3)), (Type)DSL.remainderType());
    }

    protected TypeRewriteRule makeRule() {
        Schema $$0 = this.getInputSchema();
        Type $$1 = DSL.taggedChoiceType((String)"type", (Type)DSL.string(), (Map)ImmutableMap.of((Object)"minecraft:debug", (Object)DSL.remainderType(), (Object)"minecraft:flat", bos.a($$0), (Object)"minecraft:noise", bos.a("biome_source", DSL.taggedChoiceType((String)"type", (Type)DSL.string(), (Map)ImmutableMap.of((Object)"minecraft:fixed", bos.a("biome", $$0.getType(bqh.Q)), (Object)"minecraft:multi_noise", (Object)DSL.list(bos.a("biome", $$0.getType(bqh.Q))), (Object)"minecraft:checkerboard", bos.a("biomes", DSL.list((Type)$$0.getType(bqh.Q))), (Object)"minecraft:vanilla_layered", (Object)DSL.remainderType(), (Object)"minecraft:the_end", (Object)DSL.remainderType())), "settings", DSL.or((Type)DSL.string(), bos.a("default_block", $$0.getType(bqh.I), "default_fluid", $$0.getType(bqh.I))))));
        CompoundList.CompoundListType $$2 = DSL.compoundList(bsh.a(), bos.a("generator", $$1));
        Type $$3 = DSL.and((Type)$$2, (Type)DSL.remainderType());
        Type $$4 = $$0.getType(bqh.S);
        FieldFinder $$5 = new FieldFinder("dimensions", $$3);
        if (!$$4.findFieldType("dimensions").equals((Object)$$3)) {
            throw new IllegalStateException();
        }
        OpticFinder $$6 = $$2.finder();
        return this.fixTypeEverywhereTyped("MissingDimensionFix", $$4, $$32 -> $$32.updateTyped((OpticFinder)$$5, $$3 -> $$3.updateTyped($$6, $$2 -> {
            if (!($$2.getValue() instanceof List)) {
                throw new IllegalStateException("List exptected");
            }
            if (((List)$$2.getValue()).isEmpty()) {
                Object $$3 = (Dynamic)$$32.get(DSL.remainderFinder());
                Dynamic $$4 = this.a((Dynamic)$$3);
                return (Typed)DataFixUtils.orElse($$2.readTyped($$4).result().map(Pair::getFirst), (Object)$$2);
            }
            return $$2;
        })));
    }

    protected static Type<? extends Pair<? extends Either<? extends Pair<? extends Either<?, Unit>, ? extends Pair<? extends Either<? extends List<? extends Pair<? extends Either<?, Unit>, Dynamic<?>>>, Unit>, Dynamic<?>>>, Unit>, Dynamic<?>>> a(Schema $$0) {
        return bos.b("settings", bos.a("biome", $$0.getType(bqh.Q), "layers", DSL.list(bos.b("block", $$0.getType(bqh.I)))));
    }

    private <T> Dynamic<T> a(Dynamic<T> $$0) {
        long $$1 = $$0.get("seed").asLong(0L);
        return new Dynamic($$0.getOps(), brz.a($$0, $$1, brz.a($$0, $$1), false));
    }
}

