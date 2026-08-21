/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Keyable
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class dya {
    private static final Logger d = LogUtils.getLogger();
    private static final float e = 0.1f;
    public static final cbn<c> a = cbn.a();
    public static final dya b = new a().a();
    public static final MapCodec<dya> c = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.floatRange((float)0.0f, (float)0.9999999f).optionalFieldOf("creature_spawn_probability", (Object)Float.valueOf(0.1f)).forGetter($$0 -> Float.valueOf($$0.f)), (App)Codec.simpleMap(cho.i, (Codec)cbn.a(dya$c.a).promotePartial(bhs.a("Spawn data: ", arg_0 -> ((Logger)d).error(arg_0))), (Keyable)bhh.b(cho.values())).fieldOf("spawners").forGetter($$0 -> $$0.g), (App)Codec.simpleMap(mi.g.q(), dya$b.a, mi.g).fieldOf("spawn_costs").forGetter($$0 -> $$0.h)).apply((Applicative)$$02, dya::new));
    private final float f;
    private final Map<cho, cbn<c>> g;
    private final Map<cgu<?>, b> h;

    dya(float $$0, Map<cho, cbn<c>> $$1, Map<cgu<?>, b> $$2) {
        this.f = $$0;
        this.g = ImmutableMap.copyOf($$1);
        this.h = ImmutableMap.copyOf($$2);
    }

    public cbn<c> a(cho $$0) {
        return this.g.getOrDefault($$0, a);
    }

    public @Nullable b a(cgu<?> $$0) {
        return this.h.get($$0);
    }

    public float a() {
        return this.f;
    }

    public static final class b
    extends Record {
        private final double b;
        private final double c;
        public static final Codec<b> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0 -> $$0.b), (App)Codec.DOUBLE.fieldOf("charge").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, b::new));

        public b(double $$0, double $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "energyBudget;charge", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "energyBudget;charge", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "energyBudget;charge", "b", "c"}, this, $$0);
        }

        public double a() {
            return this.b;
        }

        public double b() {
            return this.c;
        }
    }

    public static final class c
    extends Record {
        private final cgu<?> b;
        private final int c;
        private final int d;
        public static final MapCodec<c> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)mi.g.q().fieldOf("type").forGetter($$0 -> $$0.b), (App)bfm.r.fieldOf("minCount").forGetter($$0 -> $$0.c), (App)bfm.r.fieldOf("maxCount").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, c::new)).validate($$0 -> {
            if ($$0.c > $$0.d) {
                return DataResult.error(() -> "minCount needs to be smaller or equal to maxCount");
            }
            return DataResult.success((Object)$$0);
        });

        public c(cgu<?> $$0, int $$1, int $$2) {
            $$0 = $$0.f() == cho.h ? cgu.aY : $$0;
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public String toString() {
            return String.valueOf(cgu.a(this.b)) + "*(" + this.c + "-" + this.d + ")";
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "type;minCount;maxCount", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "type;minCount;maxCount", "b", "c", "d"}, this, $$0);
        }

        public cgu<?> a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }
    }

    public static class a {
        private final Map<cho, cbn.a<c>> a = bhs.a(cho.class, $$0 -> cbn.b());
        private final Map<cgu<?>, b> b = Maps.newLinkedHashMap();
        private float c = 0.1f;

        public a a(cho $$0, int $$1, c $$2) {
            this.a.get($$0).a($$2, $$1);
            return this;
        }

        public a a(cgu<?> $$0, double $$1, double $$2) {
            this.b.put($$0, new b($$2, $$1));
            return this;
        }

        public a a(float $$0) {
            this.c = $$0;
            return this;
        }

        public dya a() {
            return new dya(this.c, (Map)this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, $$0 -> ((cbn.a)$$0.getValue()).a())), (Map<cgu<?>, b>)ImmutableMap.copyOf(this.b));
        }
    }
}

