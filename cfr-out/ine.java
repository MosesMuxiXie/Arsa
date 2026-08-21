/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.OptionalInt;

public interface ine {
    public static final Codec<ine> a = d.d.dispatch(ine::a, d::a);
    public static final ine b = new b();

    public d a();

    public static final class d
    extends Enum<d>
    implements bhh {
        public static final /* enum */ d a = new d("stretch", ine$b.c);
        public static final /* enum */ d b = new d("tile", ine$c.c);
        public static final /* enum */ d c = new d("nine_slice", ine$a.c);
        public static final Codec<d> d;
        private final String e;
        private final MapCodec<? extends ine> f;
        private static final /* synthetic */ d[] g;

        public static d[] values() {
            return (d[])g.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private d(String $$0, MapCodec<? extends ine> $$1) {
            this.e = $$0;
            this.f = $$1;
        }

        @Override
        public String c() {
            return this.e;
        }

        public MapCodec<? extends ine> a() {
            return this.f;
        }

        private static /* synthetic */ d[] b() {
            return new d[]{a, b, c};
        }

        static {
            g = ine$d.b();
            d = bhh.a(d::values);
        }
    }

    public record b() implements ine
    {
        public static final MapCodec<b> c = MapCodec.unit(b::new);

        @Override
        public d a() {
            return d.a;
        }
    }

    public static final class ine$a
    extends Record
    implements ine {
        private final int d;
        private final int e;
        private final a f;
        private final boolean g;
        public static final MapCodec<ine$a> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.r.fieldOf("width").forGetter(ine$a::b), (App)bfm.r.fieldOf("height").forGetter(ine$a::c), (App)a.g.fieldOf("border").forGetter(ine$a::d), (App)Codec.BOOL.optionalFieldOf("stretch_inner", (Object)false).forGetter(ine$a::e)).apply((Applicative)$$0, ine$a::new)).validate(ine$a::a);

        public ine$a(int $$0, int $$1, a $$2, boolean $$3) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
            this.g = $$3;
        }

        private static DataResult<ine$a> a(ine$a $$0) {
            a $$1 = $$0.d();
            if ($$1.a() + $$1.c() >= $$0.b()) {
                return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
            }
            if ($$1.b() + $$1.d() >= $$0.c()) {
                return DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c());
            }
            return DataResult.success((Object)$$0);
        }

        @Override
        public d a() {
            return ine$d.c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{ine$a.class, "width;height;border;stretchInner", "d", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ine$a.class, "width;height;border;stretchInner", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ine$a.class, "width;height;border;stretchInner", "d", "e", "f", "g"}, this, $$0);
        }

        public int b() {
            return this.d;
        }

        public int c() {
            return this.e;
        }

        public a d() {
            return this.f;
        }

        public boolean e() {
            return this.g;
        }

        public record a(int a, int b, int c, int d) {
            private static final Codec<a> e = bfm.r.flatComapMap($$0 -> new a((int)$$0, (int)$$0, (int)$$0, (int)$$0), $$0 -> {
                OptionalInt $$1 = $$0.e();
                if ($$1.isPresent()) {
                    return DataResult.success((Object)$$1.getAsInt());
                }
                return DataResult.error(() -> "Border has different side sizes");
            });
            private static final Codec<a> f = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.q.fieldOf("left").forGetter(a::a), (App)bfm.q.fieldOf("top").forGetter(a::b), (App)bfm.q.fieldOf("right").forGetter(a::c), (App)bfm.q.fieldOf("bottom").forGetter(a::d)).apply((Applicative)$$0, a::new));
            static final Codec<a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> {
                if ($$0.e().isPresent()) {
                    return Either.left((Object)$$0);
                }
                return Either.right((Object)$$0);
            });

            private OptionalInt e() {
                if (this.a() == this.b() && this.b() == this.c() && this.c() == this.d()) {
                    return OptionalInt.of(this.a());
                }
                return OptionalInt.empty();
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "left;top;right;bottom", "a", "b", "c", "d"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "left;top;right;bottom", "a", "b", "c", "d"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "left;top;right;bottom", "a", "b", "c", "d"}, this, $$0);
            }
        }
    }

    public static final class c
    extends Record
    implements ine {
        private final int d;
        private final int e;
        public static final MapCodec<c> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.r.fieldOf("width").forGetter(c::b), (App)bfm.r.fieldOf("height").forGetter(c::c)).apply((Applicative)$$0, c::new));

        public c(int $$0, int $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        @Override
        public d a() {
            return ine$d.b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "width;height", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "width;height", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "width;height", "d", "e"}, this, $$0);
        }

        public int b() {
            return this.d;
        }

        public int c() {
            return this.e;
        }
    }
}

