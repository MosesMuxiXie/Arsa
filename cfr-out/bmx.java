/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class bmx
extends DataFix {
    public bmx(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = DSL.named((String)bqh.t.typeName(), (Type)DSL.remainderType());
        if (!Objects.equals($$0, this.getInputSchema().getType(bqh.t))) {
            throw new IllegalStateException("Poi type is not what was expected.");
        }
        return this.fixTypeEverywhere("POI rebuild", $$0, $$02 -> $$0 -> $$0.mapSecond(bmx::a));
    }

    private static <T> Dynamic<T> a(Dynamic<T> $$02) {
        return $$02.update("Sections", $$0 -> $$0.updateMapValues($$02 -> $$02.mapSecond($$0 -> $$0.remove("Valid"))));
    }
}

