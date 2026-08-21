/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.stream.Stream;

public abstract class big
extends DataFix {
    private final String a;

    public big(Schema $$0, String $$1) {
        super($$0, false);
        this.a = $$1;
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = DSL.named((String)bqh.t.typeName(), (Type)DSL.remainderType());
        if (!Objects.equals($$0, this.getInputSchema().getType(bqh.t))) {
            throw new IllegalStateException("Poi type is not what was expected.");
        }
        return this.fixTypeEverywhere(this.a, $$0, $$02 -> $$0 -> $$0.mapSecond(this::a));
    }

    private <T> Dynamic<T> a(Dynamic<T> $$0) {
        return $$0.update("Sections", $$02 -> $$02.updateMapValues($$0 -> $$0.mapSecond(this::b)));
    }

    private Dynamic<?> b(Dynamic<?> $$0) {
        return $$0.update("Records", this::c);
    }

    private <T> Dynamic<T> c(Dynamic<T> $$0) {
        return (Dynamic)DataFixUtils.orElse($$0.asStreamOpt().result().map($$1 -> $$0.createList(this.a((Stream)$$1))), $$0);
    }

    protected abstract <T> Stream<Dynamic<T>> a(Stream<Dynamic<T>> var1);
}

