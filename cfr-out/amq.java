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

public final class amq<E>
implements Codec<jd<E>> {
    private final amt<? extends jq<E>> a;
    private final Codec<E> b;
    private final boolean c;

    public static <E> amq<E> a(amt<? extends jq<E>> $$0, Codec<E> $$1) {
        return amq.a($$0, $$1, true);
    }

    public static <E> amq<E> a(amt<? extends jq<E>> $$0, Codec<E> $$1, boolean $$2) {
        return new amq<E>($$0, $$1, $$2);
    }

    private amq(amt<? extends jq<E>> $$0, Codec<E> $$1, boolean $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public <T> DataResult<T> a(jd<E> $$0, DynamicOps<T> $$1, T $$22) {
        ams $$3;
        Optional $$4;
        if ($$1 instanceof ams && ($$4 = ($$3 = (ams)$$1).a(this.a)).isPresent()) {
            if (!$$0.a($$4.get())) {
                return DataResult.error(() -> "Element " + String.valueOf($$0) + " is not valid in current registry set");
            }
            return (DataResult)$$0.d().map($$2 -> amo.a.encode((Object)$$2.a(), $$1, $$22), $$2 -> this.b.encode($$2, $$1, $$22));
        }
        return this.b.encode($$0.a(), $$1, $$22);
    }

    public <T> DataResult<Pair<jd<E>, T>> decode(DynamicOps<T> $$02, T $$12) {
        if ($$02 instanceof ams) {
            ams $$2 = (ams)$$02;
            Optional $$3 = $$2.b(this.a);
            if ($$3.isEmpty()) {
                return DataResult.error(() -> "Registry does not exist: " + String.valueOf(this.a));
            }
            je $$4 = $$3.get();
            DataResult $$5 = amo.a.decode($$02, $$12);
            if ($$5.result().isEmpty()) {
                if (!this.c) {
                    return DataResult.error(() -> "Inline definitions not allowed here");
                }
                return this.b.decode($$02, $$12).map($$0 -> $$0.mapFirst(jd::a));
            }
            Pair $$6 = (Pair)$$5.result().get();
            amt $$7 = amt.a(this.a, (amo)$$6.getFirst());
            return $$4.a($$7).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Failed to get element " + String.valueOf($$7))).map($$1 -> Pair.of((Object)$$1, (Object)$$6.getSecond())).setLifecycle(Lifecycle.stable());
        }
        return this.b.decode($$02, $$12).map($$0 -> $$0.mapFirst(jd::a));
    }

    public String toString() {
        return "RegistryFileCodec[" + String.valueOf(this.a) + " " + String.valueOf(this.b) + "]";
    }

    public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
        return this.a((jd)object, dynamicOps, object2);
    }
}

