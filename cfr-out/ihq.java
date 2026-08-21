/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class ihq<T>
implements ihj {
    private final ijl<T> a;
    private final a<T> b;

    public ihq(ijl<T> $$0, a<T> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public void a(ihm $$0, dlt $$1, ihk $$2, dlr $$3, @Nullable hif $$4, @Nullable chh $$5, int $$6) {
        $$0.a(this);
        T $$7 = this.a.b($$1, $$4, $$5 == null ? null : $$5.et(), $$6, $$3);
        ihj $$8 = this.b.get($$7, $$4);
        if ($$8 != null) {
            $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        }
    }

    @FunctionalInterface
    public static interface a<T> {
        public @Nullable ihj get(@Nullable T var1, @Nullable hif var2);
    }

    public static final class b<T>
    extends Record {
        final List<T> a;
        final ihj.b b;

        public b(List<T> $$0, ihj.b $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public static <T> Codec<b<T>> a(Codec<T> $$0) {
            return RecordCodecBuilder.create($$1 -> $$1.group((App)bfm.b(bfm.a($$0)).fieldOf("when").forGetter(b::a), (App)ihl.a.fieldOf("model").forGetter(b::b)).apply((Applicative)$$1, b::new));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "values;model", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "values;model", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "values;model", "a", "b"}, this, $$0);
        }

        public List<T> a() {
            return this.a;
        }

        public ihj.b b() {
            return this.b;
        }
    }

    public static final class d<P extends ijl<T>, T>
    extends Record {
        private final P b;
        private final List<b<T>> c;
        public static final MapCodec<d<?, ?>> a = ijk.a.dispatchMap("property", $$0 -> $$0.a().a(), ijl.a::a);

        public d(P $$0, List<b<T>> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public ihj a(ihj.a $$0, ihj $$1) {
            Object2ObjectOpenHashMap $$2 = new Object2ObjectOpenHashMap();
            for (b<T> $$3 : this.c) {
                ihj.b $$4 = $$3.b;
                ihj $$5 = $$4.a($$0);
                for (Object $$6 : $$3.a) {
                    $$2.put($$6, (Object)$$5);
                }
            }
            $$2.defaultReturnValue((Object)$$1);
            return new ihq<T>(this.b, this.a((Object2ObjectMap<T, ihj>)$$2, $$0.f()));
        }

        private a<T> a(Object2ObjectMap<T, ihj> $$0, @Nullable bgs $$12) {
            if ($$12 == null) {
                return ($$1, $$2) -> (ihj)$$0.get($$1);
            }
            ihj $$22 = (ihj)$$0.defaultReturnValue();
            hhw<hif, Object2ObjectMap> $$32 = new hhw<hif, Object2ObjectMap>($$3 -> {
                Object2ObjectOpenHashMap $$4 = new Object2ObjectOpenHashMap($$0.size());
                $$4.defaultReturnValue((Object)$$22);
                $$0.forEach((arg_0, arg_1) -> this.a($$12, $$3, (Object2ObjectMap)$$4, arg_0, arg_1));
                return $$4;
            });
            return ($$3, $$4) -> {
                if ($$4 == null) {
                    return (ihj)$$0.get($$3);
                }
                if ($$3 == null) {
                    return $$22;
                }
                return (ihj)((Object2ObjectMap)$$32.a($$4)).get($$3);
            };
        }

        public void a(ioe.a $$0) {
            for (b<T> $$1 : this.c) {
                $$1.b.a($$0);
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "property;cases", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "property;cases", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "property;cases", "b", "c"}, this, $$0);
        }

        public P a() {
            return this.b;
        }

        public List<b<T>> b() {
            return this.c;
        }

        private /* synthetic */ void a(bgs $$0, hif $$1, Object2ObjectMap $$22, Object $$3, ihj $$4) {
            $$0.a(this.b.b(), $$3, $$1.J_()).ifSuccess($$2 -> $$22.put($$2, (Object)$$4));
        }
    }

    public record c(d<?, ?> b, Optional<ihj.b> c) implements ihj.b
    {
        public static final MapCodec<c> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)d.a.forGetter(c::b), (App)ihl.a.optionalFieldOf("fallback").forGetter(c::c)).apply((Applicative)$$0, c::new));

        public MapCodec<c> a() {
            return a;
        }

        @Override
        public ihj a(ihj.a $$0) {
            ihj $$12 = this.c.map($$1 -> $$1.a($$0)).orElse($$0.e());
            return this.b.a($$0, $$12);
        }

        @Override
        public void a(ioe.a $$0) {
            this.b.a($$0);
            this.c.ifPresent($$1 -> $$1.a($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "unbakedSwitch;fallback", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "unbakedSwitch;fallback", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "unbakedSwitch;fallback", "b", "c"}, this, $$0);
        }
    }
}

