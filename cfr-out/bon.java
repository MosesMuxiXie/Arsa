/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.escape.Escaper
 *  com.google.common.escape.Escapers
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class bon
extends bkr {
    public static final Escaper a = Escapers.builder().addEscape('\"', "\\\"").addEscape('\\', "\\\\").build();

    public bon(Schema $$0) {
        super($$0, "LockComponentPredicateFix", "minecraft:lock");
    }

    @Override
    protected <T> @Nullable Dynamic<T> a(Dynamic<T> $$0) {
        return bon.b($$0);
    }

    public static <T> @Nullable Dynamic<T> b(Dynamic<T> $$0) {
        Optional $$1 = $$0.asString().result();
        if ($$1.isEmpty()) {
            return null;
        }
        if (((String)$$1.get()).isEmpty()) {
            return null;
        }
        Dynamic $$2 = $$0.createString("\"" + a.escape((String)$$1.get()) + "\"");
        Dynamic $$3 = $$0.emptyMap().set("minecraft:custom_name", $$2);
        return $$0.emptyMap().set("components", $$3);
    }
}

