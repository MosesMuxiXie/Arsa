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

public interface bbi {
    public static final Codec<bbi> a = mi.aL.q().dispatch(bbi::a, $$0 -> $$0);
    public static final Codec<bbi> b = Codec.either(a, amo.a).xmap($$02 -> (bbi)$$02.map($$0 -> $$0, a::a), $$0 -> {
        Either either;
        if ($$0 instanceof a) {
            a $$1 = (a)$$0;
            either = Either.right((Object)$$1.b());
        } else {
            either = Either.left((Object)$$0);
        }
        return either;
    });

    public MapCodec<? extends bbi> a();

    public static final class a
    extends Record
    implements bbi {
        private final amo d;
        public static final MapCodec<a> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("id").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(amo $$0) {
            this.d = $$0;
        }

        public MapCodec<a> a() {
            return c;
        }

        public static a a(String $$0) {
            return bbi$a.a(amo.b($$0));
        }

        public static a a(amo $$0) {
            return new a($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id", "d"}, this, $$0);
        }

        public amo b() {
            return this.d;
        }
    }

    public static final class b
    extends Record
    implements bbi {
        private final bbl d;
        public static final MapCodec<b> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bbl.f.fieldOf("level").forGetter(b::b)).apply((Applicative)$$0, b::new));

        public b(bbl $$0) {
            this.d = $$0;
        }

        public MapCodec<b> a() {
            return c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "level", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "level", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "level", "d"}, this, $$0);
        }

        public bbl b() {
            return this.d;
        }
    }
}

