/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public final class amr<E>
implements Codec<jd<E>> {
    private final amt<? extends jq<E>> a;

    public static <E> amr<E> a(amt<? extends jq<E>> $$0) {
        return new amr<E>($$0);
    }

    private amr(amt<? extends jq<E>> $$0) {
        this.a = $$0;
    }

    public <T> DataResult<T> a(jd<E> $$02, DynamicOps<T> $$1, T $$22) {
        ams $$3;
        Optional $$4;
        if ($$1 instanceof ams && ($$4 = ($$3 = (ams)$$1).a(this.a)).isPresent()) {
            if (!$$02.a($$4.get())) {
                return DataResult.error(() -> "Element " + String.valueOf($$02) + " is not valid in current registry set");
            }
            return (DataResult)$$02.d().map($$2 -> amo.a.encode((Object)$$2.a(), $$1, $$22), $$0 -> DataResult.error(() -> "Elements from registry " + String.valueOf(this.a) + " can't be serialized to a value"));
        }
        return DataResult.error(() -> "Can't access registry " + String.valueOf(this.a));
    }

    public <T> DataResult<Pair<jd<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
        ams $$2;
        Optional $$3;
        if ($$0 instanceof ams && ($$3 = ($$2 = (ams)$$0).b(this.a)).isPresent()) {
            return amo.a.decode($$0, $$1).flatMap($$12 -> {
                amo $$2 = (amo)$$12.getFirst();
                return ((je)$$3.get()).a(amt.a(this.a, $$2)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Failed to get element " + String.valueOf($$2))).map($$1 -> Pair.of((Object)$$1, (Object)$$12.getSecond())).setLifecycle(Lifecycle.stable());
            });
        }
        return DataResult.error(() -> "Can't access registry " + String.valueOf(this.a));
    }

    public String toString() {
        return "RegistryFixedCodec[" + String.valueOf(this.a) + "]";
    }

    public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
        return this.a((jd)object, dynamicOps, object2);
    }
}

