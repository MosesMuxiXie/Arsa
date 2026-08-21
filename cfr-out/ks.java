/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.stream.Collectors;

public interface ks {
    public static final Codec<Map<d<?>, ks>> b = Codec.dispatchedMap(ks$d.a, d::c);
    public static final aao<xq, c<?>> c = ks$d.b.b(c::a, d::e);
    public static final aao<xq, Map<d<?>, ks>> d = c.a(aam.c(64)).a($$0 -> $$0.stream().collect(Collectors.toMap(c::a, c::b)), $$0 -> $$0.entrySet().stream().map(c::a).toList());

    public static MapCodec<c<?>> a(String $$0) {
        return ks$d.a.dispatchMap($$0, c::a, d::d);
    }

    public boolean a(kd var1);

    public static interface d<T extends ks> {
        public static final Codec<d<?>> a = Codec.either(mi.ap.q(), mi.am.q()).xmap(d::a, d::a);
        public static final aao<xq, d<?>> b = aam.a(aam.a(mj.q), aam.a(mj.r)).a(d::a, d::a);

        private static <T extends d<?>> Either<T, kh<?>> a(T $$0) {
            Either either;
            if ($$0 instanceof a) {
                a $$1 = (a)$$0;
                either = Either.right($$1.b());
            } else {
                either = Either.left($$0);
            }
            return either;
        }

        private static d<?> a(Either<d<?>, kh<?>> $$02) {
            return (d)$$02.map($$0 -> $$0, a::a);
        }

        public Codec<T> c();

        public MapCodec<c<T>> d();

        public aao<xq, c<T>> e();
    }

    public record c<T extends ks>(d<T> a, T b) {
        static <T extends ks> MapCodec<c<T>> a(d<T> $$0, Codec<T> $$1) {
            return RecordCodecBuilder.mapCodec($$2 -> $$2.group((App)$$1.fieldOf("value").forGetter(c::b)).apply((Applicative)$$2, $$1 -> new c<ks>($$0, (ks)$$1)));
        }

        private static <T extends ks> c<T> a(Map.Entry<d<?>, T> $$0) {
            return new c<ks>($$0.getKey(), (ks)$$0.getValue());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "type;predicate", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "type;predicate", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "type;predicate", "a", "b"}, this, $$0);
        }
    }

    public static final class a
    extends e<km> {
        private final km c;

        public a(km $$0) {
            super(MapCodec.unitCodec((Object)$$0));
            this.c = $$0;
        }

        public km a() {
            return this.c;
        }

        public kh<?> b() {
            return this.c.a();
        }

        public static a a(kh<?> $$0) {
            return new a(new km($$0));
        }
    }

    public static final class b<T extends ks>
    extends e<T> {
        public b(Codec<T> $$0) {
            super($$0);
        }
    }

    public static abstract class e<T extends ks>
    implements d<T> {
        private final Codec<T> c;
        private final MapCodec<c<T>> d;
        private final aao<xq, c<T>> e;

        public e(Codec<T> $$02) {
            this.c = $$02;
            this.d = ks$c.a(this, $$02);
            this.e = aam.d($$02).a($$0 -> new c<ks>(this, (ks)$$0), c::b);
        }

        @Override
        public Codec<T> c() {
            return this.c;
        }

        @Override
        public MapCodec<c<T>> d() {
            return this.d;
        }

        @Override
        public aao<xq, c<T>> e() {
            return this.e;
        }
    }
}

