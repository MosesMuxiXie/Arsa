/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class foz
extends fpq {
    private static final Map<amo, c> b = Stream.of(foz$a.a, foz$d.c, foz$e.b).collect(Collectors.toMap(c::a, Function.identity()));
    private static final Codec<c> c = amo.a.comapFlatMap($$0 -> {
        c $$1 = b.get($$0);
        if ($$1 != null) {
            return DataResult.success((Object)$$1);
        }
        return DataResult.error(() -> "No formula type with id: '" + String.valueOf($$0) + "'");
    }, c::a);
    private static final MapCodec<b> d = bfm.a("formula", "parameters", c, b::a, c::b);
    public static final MapCodec<foz> a = RecordCodecBuilder.mapCodec($$02 -> foz.a($$02).and($$02.group((App)dso.c.fieldOf("enchantment").forGetter($$0 -> $$0.e), (App)d.forGetter($$0 -> $$0.f))).apply((Applicative)$$02, foz::new));
    private final jd<dso> e;
    private final b f;

    private foz(List<frm> $$0, jd<dso> $$1, b $$2) {
        super($$0);
        this.e = $$1;
        this.f = $$2;
    }

    public fps<foz> a() {
        return fpt.x;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(fqx.k);
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        dlt $$2 = $$1.c(fqx.k);
        if ($$2 != null) {
            int $$3 = dsq.a(this.e, $$2);
            int $$4 = this.f.a($$1.b(), $$0.N(), $$3);
            $$0.e($$4);
        }
        return $$0;
    }

    public static fpq.a<?> a(jd<dso> $$0, float $$1, int $$2) {
        return foz.a((List<frm> $$3) -> new foz((List<frm>)$$3, $$0, new a($$2, $$1)));
    }

    public static fpq.a<?> a(jd<dso> $$0) {
        return foz.a((List<frm> $$1) -> new foz((List<frm>)$$1, $$0, foz$d.a));
    }

    public static fpq.a<?> b(jd<dso> $$0) {
        return foz.a((List<frm> $$1) -> new foz((List<frm>)$$1, $$0, new e(1)));
    }

    public static fpq.a<?> a(jd<dso> $$0, int $$1) {
        return foz.a((List<frm> $$2) -> new foz((List<frm>)$$2, $$0, new e($$1)));
    }

    static interface b {
        public int a(bgr var1, int var2, int var3);

        public c a();
    }

    static final class e
    extends Record
    implements b {
        private final int c;
        public static final Codec<e> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.INT.fieldOf("bonusMultiplier").forGetter(e::b)).apply((Applicative)$$0, e::new));
        public static final c b = new c(amo.b("uniform_bonus_count"), a);

        e(int $$0) {
            this.c = $$0;
        }

        @Override
        public int a(bgr $$0, int $$1, int $$2) {
            return $$1 + $$0.a(this.c * $$2 + 1);
        }

        @Override
        public c a() {
            return b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "bonusMultiplier", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "bonusMultiplier", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "bonusMultiplier", "c"}, this, $$0);
        }

        public int b() {
            return this.c;
        }
    }

    record d() implements b
    {
        public static final d a = new d();
        public static final Codec<d> b = MapCodec.unitCodec((Object)a);
        public static final c c = new c(amo.b("ore_drops"), b);

        @Override
        public int a(bgr $$0, int $$1, int $$2) {
            if ($$2 > 0) {
                int $$3 = $$0.a($$2 + 2) - 1;
                if ($$3 < 0) {
                    $$3 = 0;
                }
                return $$1 * ($$3 + 1);
            }
            return $$1;
        }

        @Override
        public c a() {
            return c;
        }
    }

    record a(int b, float c) implements b
    {
        private static final Codec<a> d = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.INT.fieldOf("extra").forGetter(a::b), (App)Codec.FLOAT.fieldOf("probability").forGetter(a::c)).apply((Applicative)$$0, a::new));
        public static final c a = new c(amo.b("binomial_with_bonus_count"), d);

        @Override
        public int a(bgr $$0, int $$1, int $$2) {
            for (int $$3 = 0; $$3 < $$2 + this.b; ++$$3) {
                if (!($$0.i() < this.c)) continue;
                ++$$1;
            }
            return $$1;
        }

        @Override
        public c a() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "extraRounds;probability", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "extraRounds;probability", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "extraRounds;probability", "b", "c"}, this, $$0);
        }
    }

    record c(amo a, Codec<? extends b> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "id;codec", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "id;codec", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "id;codec", "a", "b"}, this, $$0);
        }
    }
}

