/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public interface tv {
    public static final Codec<tv> a = mi.aE.q().dispatch(tv::a, $$0 -> $$0);
    public static final Codec<jd<tv>> b = amq.a(mj.bu, a);

    public static MapCodec<? extends tv> a(jq<MapCodec<? extends tv>> $$0) {
        jq.a($$0, "all_of", tv$a.c);
        jq.a($$0, "game_rules", c.c);
        jq.a($$0, "time_of_day", d.c);
        jq.a($$0, "weather", e.c);
        return jq.a($$0, "function", tv$b.c);
    }

    public void a(axf var1);

    default public void b(axf $$0) {
    }

    public MapCodec<? extends tv> a();

    public static final class a
    extends Record
    implements tv {
        private final List<jd<tv>> d;
        public static final MapCodec<a> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)b.listOf().fieldOf("definitions").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(tv ... $$0) {
            this(Arrays.stream($$0).map(jd::a).toList());
        }

        public a(List<jd<tv>> $$0) {
            this.d = $$0;
        }

        @Override
        public void a(axf $$0) {
            this.d.forEach($$1 -> ((tv)$$1.a()).a($$0));
        }

        @Override
        public void b(axf $$0) {
            this.d.forEach($$1 -> ((tv)$$1.a()).b($$0));
        }

        public MapCodec<a> a() {
            return c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "definitions", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "definitions", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "definitions", "d"}, this, $$0);
        }

        public List<jd<tv>> b() {
            return this.d;
        }
    }

    public static final class c
    extends Record
    implements tv {
        private final etx d;
        public static final MapCodec<c> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)etx.a.fieldOf("rules").forGetter(c::b)).apply((Applicative)$$0, c::new));

        public c(etx $$0) {
            this.d = $$0;
        }

        @Override
        public void a(axf $$0) {
            eua $$1 = $$0.U();
            MinecraftServer $$2 = $$0.s();
            $$1.a(this.d, $$2);
        }

        @Override
        public void b(axf $$0) {
            this.d.b().forEach($$1 -> this.a($$0, (etv)$$1));
        }

        private <T> void a(axf $$0, etv<T> $$1) {
            $$0.U().a($$1, $$1.i(), $$0.s());
        }

        public MapCodec<c> a() {
            return c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "gameRulesMap", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "gameRulesMap", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "gameRulesMap", "d"}, this, $$0);
        }

        public etx b() {
            return this.d;
        }
    }

    public static final class d
    extends Record
    implements tv {
        private final int d;
        public static final MapCodec<d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.q.fieldOf("time").forGetter(d::b)).apply((Applicative)$$0, d::new));

        public d(int $$0) {
            this.d = $$0;
        }

        @Override
        public void a(axf $$0) {
            $$0.b((long)this.d);
        }

        public MapCodec<d> a() {
            return c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "time", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "time", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "time", "d"}, this, $$0);
        }

        public int b() {
            return this.d;
        }
    }

    public static final class e
    extends Record
    implements tv {
        private final a d;
        public static final MapCodec<e> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)a.d.fieldOf("weather").forGetter(e::b)).apply((Applicative)$$0, e::new));

        public e(a $$0) {
            this.d = $$0;
        }

        @Override
        public void a(axf $$0) {
            this.d.a($$0);
        }

        @Override
        public void b(axf $$0) {
            $$0.k();
        }

        public MapCodec<e> a() {
            return c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "weather", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "weather", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "weather", "d"}, this, $$0);
        }

        public a b() {
            return this.d;
        }

        public static final class a
        extends Enum<a>
        implements bhh {
            public static final /* enum */ a a = new a("clear", 100000, 0, false, false);
            public static final /* enum */ a b = new a("rain", 0, 100000, true, false);
            public static final /* enum */ a c = new a("thunder", 0, 100000, true, true);
            public static final Codec<a> d;
            private final String e;
            private final int f;
            private final int g;
            private final boolean h;
            private final boolean i;
            private static final /* synthetic */ a[] j;

            public static a[] values() {
                return (a[])j.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private a(String $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
                this.e = $$0;
                this.f = $$1;
                this.g = $$2;
                this.h = $$3;
                this.i = $$4;
            }

            void a(axf $$0) {
                $$0.a(this.f, this.g, this.h, this.i);
            }

            @Override
            public String c() {
                return this.e;
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b, c};
            }

            static {
                j = tv$e$a.a();
                d = bhh.a(a::values);
            }
        }
    }

    public static final class b
    extends Record
    implements tv {
        private final Optional<amo> d;
        private final Optional<amo> e;
        private static final Logger f = LogUtils.getLogger();
        public static final MapCodec<b> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.optionalFieldOf("setup").forGetter(b::b), (App)amo.a.optionalFieldOf("teardown").forGetter(b::c)).apply((Applicative)$$0, b::new));

        public b(Optional<amo> $$0, Optional<amo> $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        @Override
        public void a(axf $$0) {
            this.d.ifPresent($$1 -> tv$b.a($$0, $$1));
        }

        @Override
        public void b(axf $$0) {
            this.e.ifPresent($$1 -> tv$b.a($$0, $$1));
        }

        private static void a(axf $$0, amo $$1) {
            MinecraftServer $$2 = $$0.s();
            ani $$3 = $$2.aC();
            Optional<ht<ed>> $$4 = $$3.a($$1);
            if ($$4.isPresent()) {
                ed $$5 = $$2.aG().a(bbh.c).a().a($$0);
                $$3.a($$4.get(), $$5);
            } else {
                f.error("Test Batch failed for non-existent function {}", (Object)$$1);
            }
        }

        public MapCodec<b> a() {
            return c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "setupFunction;teardownFunction", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "setupFunction;teardownFunction", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "setupFunction;teardownFunction", "d", "e"}, this, $$0);
        }

        public Optional<amo> b() {
            return this.d;
        }

        public Optional<amo> c() {
            return this.e;
        }
    }
}

