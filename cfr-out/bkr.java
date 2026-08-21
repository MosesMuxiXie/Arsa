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
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public abstract class bkr
extends DataFix {
    private final String a;
    private final String b;
    private final String c;

    public bkr(Schema $$0, String $$1, String $$2) {
        this($$0, $$1, $$2, $$2);
    }

    public bkr(Schema $$0, String $$1, String $$2, String $$3) {
        super($$0, false);
        this.a = $$1;
        this.b = $$2;
        this.c = $$3;
    }

    public final TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.A);
        return this.fixTypeEverywhereTyped(this.a, $$0, $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> {
            Optional $$1 = $$0.get(this.b).result();
            if ($$1.isEmpty()) {
                return $$0;
            }
            Dynamic $$2 = this.a((Dynamic)$$1.get());
            return $$0.remove(this.b).setFieldIfPresent(this.c, Optional.ofNullable($$2));
        }));
    }

    protected abstract <T> @Nullable Dynamic<T> a(Dynamic<T> var1);
}

