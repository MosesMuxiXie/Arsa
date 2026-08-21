/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Streams
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.google.common.collect.Streams;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class bkv
extends DataFix {
    private final String a;

    public bkv(Schema $$0, String $$1) {
        super($$0, false);
        this.a = $$1;
    }

    private <T> Dynamic<T> a(Dynamic<T> $$0) {
        $$0 = $$0.update("front_text", bkv::b);
        $$0 = $$0.update("back_text", bkv::b);
        for (String $$1 : bjk.a) {
            $$0 = $$0.remove($$1);
        }
        return $$0;
    }

    private static <T> Dynamic<T> b(Dynamic<T> $$0) {
        Optional $$1 = $$0.get("filtered_messages").asStreamOpt().result();
        if ($$1.isEmpty()) {
            return $$0;
        }
        Dynamic $$22 = bic.a($$0.getOps());
        List<Dynamic> $$32 = $$0.get("messages").asStreamOpt().result().orElse(Stream.of(new Dynamic[0])).toList();
        List $$4 = Streams.mapWithIndex((Stream)((Stream)$$1.get()), ($$2, $$3) -> {
            Dynamic $$4 = $$3 < (long)$$32.size() ? (Dynamic)$$32.get((int)$$3) : $$22;
            return $$2.equals((Object)$$22) ? $$4 : $$2;
        }).toList();
        if ($$4.equals($$32)) {
            return $$0.remove("filtered_messages");
        }
        return $$0.set("filtered_messages", $$0.createList($$4.stream()));
    }

    public TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.w);
        Type $$1 = this.getInputSchema().getChoiceType(bqh.w, this.a);
        OpticFinder $$22 = DSL.namedChoice((String)this.a, (Type)$$1);
        return this.fixTypeEverywhereTyped("DropInvalidSignDataFix for " + this.a, $$0, $$2 -> $$2.updateTyped($$22, $$1, $$1 -> {
            Object $$2 = ((Dynamic)$$1.get(DSL.remainderFinder())).get("_filtered_correct").asBoolean(false);
            if ($$2) {
                return $$1.update(DSL.remainderFinder(), $$0 -> $$0.remove("_filtered_correct"));
            }
            return bhs.a($$1, $$1, this::a);
        }));
    }
}

