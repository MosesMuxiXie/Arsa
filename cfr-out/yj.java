/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapDecoder
 *  com.mojang.serialization.MapEncoder
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.google.gson.JsonElement;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.MapEncoder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class yj {
    public static final Codec<yh> a = Codec.recursive((String)"Component", yj::a);
    public static final aao<xq, yh> b = aam.d(a);
    public static final aao<xq, Optional<yh>> c = b.a(aam::a);
    public static final aao<xq, yh> d = aam.c(a);
    public static final aao<xq, Optional<yh>> e = d.a(aam::a);
    public static final aao<ByteBuf, yh> f = aam.a(a);

    public static Codec<yh> a(final int $$0) {
        return new Codec<yh>(){

            public <T> DataResult<Pair<yh, T>> decode(DynamicOps<T> $$02, T $$1) {
                return a.decode($$02, $$1).flatMap($$2 -> {
                    if (this.a($$02, (yh)$$2.getFirst())) {
                        return DataResult.error(() -> "Component was too large: greater than max size " + $$0);
                    }
                    return DataResult.success((Object)$$2);
                });
            }

            public <T> DataResult<T> a(yh $$02, DynamicOps<T> $$1, T $$2) {
                return a.encodeStart($$1, (Object)$$02);
            }

            private <T> boolean a(DynamicOps<T> $$02, yh $$1) {
                DataResult $$2 = a.encodeStart(1.a($$02), (Object)$$1);
                return $$2.isSuccess() && bfv.a((JsonElement)$$2.getOrThrow(), $$0);
            }

            private static <T> DynamicOps<JsonElement> a(DynamicOps<T> $$02) {
                if ($$02 instanceof ams) {
                    ams $$1 = (ams)$$02;
                    return $$1.a(JsonOps.INSTANCE);
                }
                return JsonOps.INSTANCE;
            }

            public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
                return this.a((yh)object, dynamicOps, object2);
            }
        };
    }

    private static yw a(List<yh> $$0) {
        yw $$1 = $$0.get(0).f();
        for (int $$2 = 1; $$2 < $$0.size(); ++$$2) {
            $$1.b($$0.get($$2));
        }
        return $$1;
    }

    public static <T> MapCodec<T> a(bfm.b<String, MapCodec<? extends T>> $$02, Function<T, MapCodec<? extends T>> $$1, String $$2) {
        a<? extends T> $$3 = new a<T>($$02.a(), $$1);
        MapCodec $$4 = $$02.a((Codec<String>)Codec.STRING).dispatchMap($$2, $$1, $$0 -> $$0);
        b<? extends T> $$5 = new b<T>($$2, $$4, $$3);
        return bfm.a($$5, $$4);
    }

    private static Codec<yh> a(Codec<yh> $$03) {
        bfm.b $$1 = new bfm.b();
        yj.a($$1);
        MapCodec<yi> $$22 = yj.a($$1, yi::a, "type");
        Codec $$3 = RecordCodecBuilder.create($$2 -> $$2.group((App)$$22.forGetter(yh::b), (App)bfm.b($$03.listOf()).optionalFieldOf("extra", List.of()).forGetter(yh::c), (App)zf.b.a.forGetter(yh::a)).apply((Applicative)$$2, yw::new));
        return Codec.either((Codec)Codec.either((Codec)Codec.STRING, bfm.b($$03.listOf())), (Codec)$$3).xmap($$02 -> (yh)$$02.map($$0 -> (yh)$$0.map(yh::b, yj::a), $$0 -> $$0), $$0 -> {
            String $$1 = $$0.d();
            return $$1 != null ? Either.left((Object)Either.left((Object)$$1)) : Either.right((Object)$$0);
        });
    }

    private static void a(bfm.b<String, MapCodec<? extends yi>> $$0) {
        $$0.a("text", zn.a);
        $$0.a("translatable", zq.b);
        $$0.a("keybind", zj.a);
        $$0.a("score", zo.b);
        $$0.a("selector", zp.a);
        $$0.a("nbt", zl.a);
        $$0.a("object", zm.a);
    }

    static class a<T>
    extends MapCodec<T> {
        private final Collection<MapCodec<? extends T>> a;
        private final Function<T, ? extends MapEncoder<? extends T>> b;

        public a(Collection<MapCodec<? extends T>> $$0, Function<T, ? extends MapEncoder<? extends T>> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public <S> DataResult<T> decode(DynamicOps<S> $$0, MapLike<S> $$1) {
            for (MapDecoder mapDecoder : this.a) {
                DataResult $$3 = mapDecoder.decode($$0, $$1);
                if (!$$3.result().isPresent()) continue;
                return $$3;
            }
            return DataResult.error(() -> "No matching codec found");
        }

        public <S> RecordBuilder<S> encode(T $$0, DynamicOps<S> $$1, RecordBuilder<S> $$2) {
            MapEncoder<? extends T> $$3 = this.b.apply($$0);
            return $$3.encode($$0, $$1, $$2);
        }

        public <S> Stream<S> keys(DynamicOps<S> $$0) {
            return this.a.stream().flatMap($$1 -> $$1.keys($$0)).distinct();
        }

        public String toString() {
            return "FuzzyCodec[" + String.valueOf(this.a) + "]";
        }
    }

    static class b<T>
    extends MapCodec<T> {
        private final String a;
        private final MapCodec<T> b;
        private final MapCodec<T> c;

        public b(String $$0, MapCodec<T> $$1, MapCodec<T> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public <O> DataResult<T> decode(DynamicOps<O> $$0, MapLike<O> $$1) {
            if ($$1.get(this.a) != null) {
                return this.b.decode($$0, $$1);
            }
            return this.c.decode($$0, $$1);
        }

        public <O> RecordBuilder<O> encode(T $$0, DynamicOps<O> $$1, RecordBuilder<O> $$2) {
            return this.c.encode($$0, $$1, $$2);
        }

        public <T1> Stream<T1> keys(DynamicOps<T1> $$0) {
            return Stream.concat(this.b.keys($$0), this.c.keys($$0)).distinct();
        }
    }
}

