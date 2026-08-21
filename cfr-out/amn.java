/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 */
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class amn<E>
implements Codec<jh<E>> {
    private final amt<? extends jq<E>> a;
    private final Codec<jd<E>> b;
    private final Codec<List<jd<E>>> c;
    private final Codec<Either<bef<E>, List<jd<E>>>> d;

    private static <E> Codec<List<jd<E>>> a(Codec<jd<E>> $$0, boolean $$1) {
        Codec $$2 = $$0.listOf().validate(bfm.b(jd::f));
        if ($$1) {
            return $$2;
        }
        return bfm.c($$0, $$2);
    }

    public static <E> Codec<jh<E>> a(amt<? extends jq<E>> $$0, Codec<jd<E>> $$1, boolean $$2) {
        return new amn<E>($$0, $$1, $$2);
    }

    private amn(amt<? extends jq<E>> $$0, Codec<jd<E>> $$1, boolean $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = amn.a($$1, $$2);
        this.d = Codec.either(bef.b($$0), this.c);
    }

    public <T> DataResult<Pair<jh<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
        ams $$2;
        Optional $$3;
        if ($$0 instanceof ams && ($$3 = ($$2 = (ams)$$0).b(this.a)).isPresent()) {
            je $$4 = $$3.get();
            return this.d.decode($$0, $$1).flatMap($$12 -> {
                DataResult $$2 = (DataResult)((Either)$$12.getFirst()).map($$1 -> amn.a($$4, $$1), $$0 -> DataResult.success(jh.a($$0)));
                return $$2.map($$1 -> Pair.of((Object)$$1, (Object)$$12.getSecond()));
            });
        }
        return this.a($$0, $$1);
    }

    private static <E> DataResult<jh<E>> a(je<E> $$0, bef<E> $$1) {
        return $$0.a($$1).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Missing tag: '" + String.valueOf($$1.b()) + "' in '" + String.valueOf($$1.a().a()) + "'"));
    }

    public <T> DataResult<T> a(jh<E> $$0, DynamicOps<T> $$1, T $$2) {
        ams $$3;
        Optional $$4;
        if ($$1 instanceof ams && ($$4 = ($$3 = (ams)$$1).a(this.a)).isPresent()) {
            if (!$$0.a($$4.get())) {
                return DataResult.error(() -> "HolderSet " + String.valueOf($$0) + " is not valid in current registry set");
            }
            return this.d.encode((Object)$$0.d().mapRight(List::copyOf), $$1, $$2);
        }
        return this.b($$0, $$1, $$2);
    }

    private <T> DataResult<Pair<jh<E>, T>> a(DynamicOps<T> $$02, T $$1) {
        return this.b.listOf().decode($$02, $$1).flatMap($$0 -> {
            ArrayList<jd.a> $$1 = new ArrayList<jd.a>();
            for (jd $$2 : (List)$$0.getFirst()) {
                if ($$2 instanceof jd.a) {
                    jd.a $$3 = (jd.a)$$2;
                    $$1.add($$3);
                    continue;
                }
                return DataResult.error(() -> "Can't decode element " + String.valueOf($$2) + " without registry");
            }
            return DataResult.success((Object)new Pair(jh.a($$1), $$0.getSecond()));
        });
    }

    private <T> DataResult<T> b(jh<E> $$0, DynamicOps<T> $$1, T $$2) {
        return this.c.encode($$0.a().toList(), $$1, $$2);
    }

    public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
        return this.a((jh)object, dynamicOps, object2);
    }
}

