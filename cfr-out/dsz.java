/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Function;

public interface dsz {
    public static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
        return RecordCodecBuilder.mapCodec($$3 -> $$3.group((App)$$0.listOf().fieldOf("effects").forGetter($$2)).apply((Applicative)$$3, $$1));
    }

    public static a a(dth ... $$0) {
        return new a(List.of($$0));
    }

    public static b a(dti ... $$0) {
        return new b(List.of($$0));
    }

    public static c a(dtj ... $$0) {
        return new c(List.of($$0));
    }

    public static final class a
    extends Record
    implements dth {
        private final List<dth> d;
        public static final MapCodec<a> a = dsz.a(dth.b, a::new, a::b);

        public a(List<dth> $$0) {
            this.d = $$0;
        }

        @Override
        public void a(axf $$0, int $$1, dsn $$2, cgk $$3, ftm $$4) {
            for (dth $$5 : this.d) {
                $$5.a($$0, $$1, $$2, $$3, $$4);
            }
        }

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "effects", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "effects", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "effects", "d"}, this, $$0);
        }

        public List<dth> b() {
            return this.d;
        }
    }

    public record b(List<dti> b) implements dti
    {
        public static final MapCodec<b> a = dsz.a(dti.c, b::new, b::b);

        @Override
        public void a(axf $$0, int $$1, dsn $$2, cgk $$3, ftm $$4, boolean $$5) {
            for (dti $$6 : this.b) {
                $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
        }

        @Override
        public void a(dsn $$0, cgk $$1, ftm $$2, int $$3) {
            for (dti $$4 : this.b) {
                $$4.a($$0, $$1, $$2, $$3);
            }
        }

        public MapCodec<b> a() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "effects", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "effects", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "effects", "b"}, this, $$0);
        }
    }

    public static final class c
    extends Record
    implements dtj {
        private final List<dtj> c;
        public static final MapCodec<c> a = dsz.a(dtj.b, c::new, c::b);

        public c(List<dtj> $$0) {
            this.c = $$0;
        }

        @Override
        public float a(int $$0, bgr $$1, float $$2) {
            for (dtj $$3 : this.c) {
                $$2 = $$3.a($$0, $$1, $$2);
            }
            return $$2;
        }

        public MapCodec<c> a() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "effects", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "effects", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "effects", "c"}, this, $$0);
        }

        public List<dtj> b() {
            return this.c;
        }
    }
}

