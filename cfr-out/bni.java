/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class bni
extends bkr {
    private static final Optional<String> a = Optional.of("\"\"");

    public bni(Schema $$0) {
        super($$0, "InvalidLockComponentPredicateFix", "minecraft:lock");
    }

    @Override
    protected <T> @Nullable Dynamic<T> a(Dynamic<T> $$0) {
        return bni.b($$0);
    }

    public static <T> @Nullable Dynamic<T> b(Dynamic<T> $$0) {
        return bni.c($$0) ? null : $$0;
    }

    private static <T> boolean c(Dynamic<T> $$0) {
        return bni.a($$0, "components", $$02 -> bni.a($$02, "minecraft:custom_name", $$0 -> $$0.asString().result().equals(a)));
    }

    private static <T> boolean a(Dynamic<T> $$0, String $$1, Predicate<Dynamic<T>> $$2) {
        Optional $$3 = $$0.getMapValues().result();
        if ($$3.isEmpty() || ((Map)$$3.get()).size() != 1) {
            return false;
        }
        return $$0.get($$1).result().filter($$2).isPresent();
    }
}

