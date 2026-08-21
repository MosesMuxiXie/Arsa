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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class avk {
    public static List<a<?>> a(auo $$0) {
        ArrayList $$1 = new ArrayList();
        $$0.d().a().forEach($$2 -> avk.a($$0, $$2, $$1));
        return $$1;
    }

    private static <T> void a(auo $$0, etv<T> $$1, List<a<?>> $$2) {
        T $$3 = $$0.d().a($$1);
        $$2.add(avk.a($$0, $$1, Objects.requireNonNull($$3)));
    }

    public static <T> a<T> a(auo $$0, etv<T> $$1, T $$2) {
        return $$0.d().a($$1, $$2);
    }

    public static <T> a<T> a(auo $$0, a<T> $$1, avh $$2) {
        return $$0.d().a($$1, $$2);
    }

    public static final class a<T>
    extends Record {
        private final etv<T> c;
        private final T d;
        public static final Codec<a<?>> a = mi.an.q().dispatch("key", a::a, a::b);
        public static final Codec<a<?>> b = mi.an.q().dispatch("key", a::a, a::a);

        public a(etv<T> $$0, T $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        private static <T> MapCodec<? extends a<T>> a(etv<T> $$0) {
            return $$0.h().fieldOf("value").xmap($$1 -> new a<Object>($$0, $$1), a::b);
        }

        private static <T> MapCodec<? extends a<T>> b(etv<T> $$0) {
            return RecordCodecBuilder.mapCodec($$12 -> $$12.group((App)bhh.a(ety::values).fieldOf("type").forGetter($$0 -> $$0.c.f()), (App)$$0.h().fieldOf("value").forGetter(a::b)).apply((Applicative)$$12, ($$1, $$2) -> avk$a.a($$0, $$1, $$2)));
        }

        private static <T> a<T> a(etv<T> $$0, ety $$1, T $$2) {
            if ($$0.f() != $$1) {
                throw new avl("Stated type \"" + String.valueOf($$1) + "\" mismatches with actual type \"" + String.valueOf($$0.f()) + "\" of gamerule \"" + $$0.a() + "\"");
            }
            return new a<T>($$0, $$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "gameRule;value", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "gameRule;value", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "gameRule;value", "c", "d"}, this, $$0);
        }

        public etv<T> a() {
            return this.c;
        }

        public T b() {
            return this.d;
        }
    }
}

