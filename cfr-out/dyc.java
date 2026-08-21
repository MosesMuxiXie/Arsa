/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dyc {
    public static final Codec<dyc> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dyc$a.c.fieldOf("preset").forGetter($$0 -> $$0.c), ams.c(mj.aS)).apply((Applicative)$$02, dyc::new));
    public static final Codec<jd<dyc>> b = amq.a(mj.bk, a);
    private final a c;
    private final dxx.c<jd<dxo>> d;

    public dyc(a $$0, je<dxo> $$1) {
        this.c = $$0;
        this.d = $$0.e.apply($$1::b);
    }

    public dxx.c<jd<dxo>> a() {
        return this.d;
    }

    public static Map<a, dxx.c<amt<dxo>>> b() {
        return dyc$a.f.values().stream().collect(Collectors.toMap($$0 -> $$0, $$02 -> $$02.c().apply($$0 -> $$0)));
    }

    public static final class dyc$a
    extends Record {
        private final amo d;
        final a e;
        public static final dyc$a a = new dyc$a(amo.b("nether"), new a(){

            @Override
            public <T> dxx.c<T> apply(Function<amt<dxo>, T> $$0) {
                return new dxx.c(List.of(Pair.of((Object)dxx.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), $$0.apply(dxv.ad)), Pair.of((Object)dxx.a(0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), $$0.apply(dxv.ag)), Pair.of((Object)dxx.a(0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), $$0.apply(dxv.af)), Pair.of((Object)dxx.a(0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.375f), $$0.apply(dxv.ae)), Pair.of((Object)dxx.a(-0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.175f), $$0.apply(dxv.ah))));
            }
        });
        public static final dyc$a b = new dyc$a(amo.b("overworld"), new a(){

            @Override
            public <T> dxx.c<T> apply(Function<amt<dxo>, T> $$0) {
                return dyc$a.a($$0);
            }
        });
        static final Map<amo, dyc$a> f = Stream.of(a, b).collect(Collectors.toMap(dyc$a::b, $$0 -> $$0));
        public static final Codec<dyc$a> c = amo.a.flatXmap($$0 -> Optional.ofNullable(f.get($$0)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + String.valueOf($$0))), $$0 -> DataResult.success((Object)$$0.d));

        public dyc$a(amo $$0, a $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        static <T> dxx.c<T> a(Function<amt<dxo>, T> $$0) {
            ImmutableList.Builder $$1 = ImmutableList.builder();
            new dye().a($$2 -> $$1.add((Object)$$2.mapSecond($$0)));
            return new dxx.c($$1.build());
        }

        public Stream<amt<dxo>> a() {
            return this.e.apply($$0 -> $$0).a().stream().map(Pair::getSecond).distinct();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{dyc$a.class, "id;provider", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dyc$a.class, "id;provider", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dyc$a.class, "id;provider", "d", "e"}, this, $$0);
        }

        public amo b() {
            return this.d;
        }

        public a c() {
            return this.e;
        }

        @FunctionalInterface
        static interface a {
            public <T> dxx.c<T> apply(Function<amt<dxo>, T> var1);
        }
    }
}

