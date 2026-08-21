/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;

public class blk
extends bow {
    private final Map<String, String> c;

    public blk(Schema $$0, String $$1, String $$2, Map<String, String> $$3) {
        super($$0, false, $$1, bqh.H, $$2);
        this.c = $$3;
    }

    public Dynamic<?> a(Dynamic<?> $$0) {
        for (Map.Entry<String, String> $$1 : this.c.entrySet()) {
            $$0 = $$0.renameField($$1.getKey(), $$1.getValue());
        }
        return $$0;
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), this::a);
    }
}

