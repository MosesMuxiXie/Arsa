/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface fpp {
    public static final MapCodec<fpp> a = fpp.a(Integer.MAX_VALUE);

    public static MapCodec<fpp> a(int $$02) {
        return f.e.dispatchMap("mode", fpp::a, $$0 -> $$0.g).validate($$1 -> {
            int $$3;
            d $$2;
            if ($$1 instanceof d && ($$2 = (d)$$1).c().isPresent() && ($$3 = $$2.c().get().intValue()) > $$02) {
                return DataResult.error(() -> "Size value too large: " + $$3 + ", max size is " + $$02);
            }
            return DataResult.success((Object)$$1);
        });
    }

    public f a();

    default public <T> List<T> a(List<T> $$0, List<T> $$1) {
        return this.a($$0, $$1, Integer.MAX_VALUE);
    }

    public <T> List<T> a(List<T> var1, List<T> var2, int var3);

    public static final class f
    extends Enum<f>
    implements bhh {
        public static final /* enum */ f a = new f("replace_all", fpp$c.c);
        public static final /* enum */ f b = new f("replace_section", fpp$d.b);
        public static final /* enum */ f c = new f("insert", fpp$b.b);
        public static final /* enum */ f d = new f("append", fpp$a.c);
        public static final Codec<f> e;
        private final String f;
        final MapCodec<? extends fpp> g;
        private static final /* synthetic */ f[] h;

        public static f[] values() {
            return (f[])h.clone();
        }

        public static f valueOf(String $$0) {
            return Enum.valueOf(f.class, $$0);
        }

        private f(String $$0, MapCodec<? extends fpp> $$1) {
            this.f = $$0;
            this.g = $$1;
        }

        public MapCodec<? extends fpp> a() {
            return this.g;
        }

        @Override
        public String c() {
            return this.f;
        }

        private static /* synthetic */ f[] b() {
            return new f[]{a, b, c, d};
        }

        static {
            h = fpp$f.b();
            e = bhh.a(f::values);
        }
    }

    public static final class d
    extends Record
    implements fpp {
        private final int c;
        private final Optional<Integer> d;
        private static final Logger e = LogUtils.getLogger();
        public static final MapCodec<d> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.q.optionalFieldOf("offset", (Object)0).forGetter(d::b), (App)bfm.q.optionalFieldOf("size").forGetter(d::c)).apply((Applicative)$$0, d::new));

        public d(int $$0) {
            this($$0, Optional.empty());
        }

        public d(int $$0, Optional<Integer> $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public f a() {
            return f.b;
        }

        @Override
        public <T> List<T> a(List<T> $$0, List<T> $$1, int $$2) {
            ImmutableList $$6;
            int $$3 = $$0.size();
            if (this.c > $$3) {
                e.error("Cannot replace when offset is out of bounds");
                return $$0;
            }
            ImmutableList.Builder $$4 = ImmutableList.builder();
            $$4.addAll($$0.subList(0, this.c));
            $$4.addAll($$1);
            int $$5 = this.c + this.d.orElse($$1.size());
            if ($$5 < $$3) {
                $$4.addAll($$0.subList($$5, $$3));
            }
            if (($$6 = $$4.build()).size() > $$2) {
                e.error("Contents overflow in section replacement");
                return $$0;
            }
            return $$6;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "offset;size", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "offset;size", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "offset;size", "c", "d"}, this, $$0);
        }

        public int b() {
            return this.c;
        }

        public Optional<Integer> c() {
            return this.d;
        }
    }

    public record e<T>(List<T> a, fpp b) {
        public static <T> Codec<e<T>> a(Codec<T> $$0, int $$1) {
            return RecordCodecBuilder.create($$2 -> $$2.group((App)$$0.sizeLimitedListOf($$1).fieldOf("values").forGetter($$0 -> $$0.a), (App)fpp.a($$1).forGetter($$0 -> $$0.b)).apply((Applicative)$$2, e::new));
        }

        public List<T> a(List<T> $$0) {
            return this.b.a($$0, this.a);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "value;operation", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "value;operation", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "value;operation", "a", "b"}, this, $$0);
        }
    }

    public static class a
    implements fpp {
        private static final Logger d = LogUtils.getLogger();
        public static final a b = new a();
        public static final MapCodec<a> c = MapCodec.unit(() -> b);

        private a() {
        }

        @Override
        public f a() {
            return f.d;
        }

        @Override
        public <T> List<T> a(List<T> $$0, List<T> $$1, int $$2) {
            if ($$0.size() + $$1.size() > $$2) {
                d.error("Contents overflow in section append");
                return $$0;
            }
            return Stream.concat($$0.stream(), $$1.stream()).toList();
        }
    }

    public static final class b
    extends Record
    implements fpp {
        private final int c;
        private static final Logger d = LogUtils.getLogger();
        public static final MapCodec<b> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.q.optionalFieldOf("offset", (Object)0).forGetter(b::b)).apply((Applicative)$$0, b::new));

        public b(int $$0) {
            this.c = $$0;
        }

        @Override
        public f a() {
            return f.c;
        }

        @Override
        public <T> List<T> a(List<T> $$0, List<T> $$1, int $$2) {
            int $$3 = $$0.size();
            if (this.c > $$3) {
                d.error("Cannot insert when offset is out of bounds");
                return $$0;
            }
            if ($$3 + $$1.size() > $$2) {
                d.error("Contents overflow in section insertion");
                return $$0;
            }
            ImmutableList.Builder $$4 = ImmutableList.builder();
            $$4.addAll($$0.subList(0, this.c));
            $$4.addAll($$1);
            $$4.addAll($$0.subList(this.c, $$3));
            return $$4.build();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "offset", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "offset", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "offset", "c"}, this, $$0);
        }

        public int b() {
            return this.c;
        }
    }

    public static class c
    implements fpp {
        public static final c b = new c();
        public static final MapCodec<c> c = MapCodec.unit(() -> b);

        private c() {
        }

        @Override
        public f a() {
            return f.a;
        }

        @Override
        public <T> List<T> a(List<T> $$0, List<T> $$1, int $$2) {
            return $$1;
        }
    }
}

