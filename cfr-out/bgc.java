/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Comparators
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Comparators;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public record bgc<T>(List<bgb<T>> a, bfj b) {
    public bgc {
        if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Track has no keyframes");
        }
    }

    public static <T> MapCodec<bgc<T>> a(Codec<T> $$0) {
        Codec $$12 = bgb.a($$0).listOf().validate(bgc::a);
        return RecordCodecBuilder.mapCodec($$1 -> $$1.group((App)$$12.fieldOf("keyframes").forGetter(bgc::a), (App)bfj.b.optionalFieldOf("ease", (Object)bfj.d).forGetter(bgc::b)).apply((Applicative)$$1, bgc::new));
    }

    static <T> DataResult<List<bgb<T>>> a(List<bgb<T>> $$0) {
        if ($$0.isEmpty()) {
            return DataResult.error(() -> "Keyframes must not be empty");
        }
        if (!Comparators.isInOrder($$0, Comparator.comparingInt(bgb::a))) {
            return DataResult.error(() -> "Keyframes must be ordered by ticks field");
        }
        if ($$0.size() > 1) {
            int $$1 = 0;
            int $$2 = $$0.getLast().a();
            for (bgb $$3 : $$0) {
                if ($$3.a() == $$2) {
                    if (++$$1 > 2) {
                        return DataResult.error(() -> "More than 2 keyframes on same tick: " + $$3.a());
                    }
                } else {
                    $$1 = 0;
                }
                $$2 = $$3.a();
            }
        }
        return DataResult.success($$0);
    }

    public static DataResult<bgc<?>> a(bgc<?> $$0, int $$1) {
        for (bgb<?> $$2 : $$0.a()) {
            int $$3 = $$2.a();
            if ($$3 >= 0 && $$3 <= $$1) continue;
            return DataResult.error(() -> "Keyframe at tick " + $$2.a() + " must be in range [0; " + $$1 + "]");
        }
        return DataResult.success($$0);
    }

    public bgd<T> a(Optional<Integer> $$0, cei<T> $$1) {
        return new bgd<T>(this, $$0, $$1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bgc.class, "keyframes;easingType", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bgc.class, "keyframes;easingType", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bgc.class, "keyframes;easingType", "a", "b"}, this, $$0);
    }

    public static class a<T> {
        private final ImmutableList.Builder<bgb<T>> a = ImmutableList.builder();
        private bfj b = bfj.d;

        public a<T> a(int $$0, T $$1) {
            this.a.add(new bgb<T>($$0, $$1));
            return this;
        }

        public a<T> a(bfj $$0) {
            this.b = $$0;
            return this;
        }

        public bgc<T> a() {
            List $$0 = (List)bgc.a(this.a.build()).getOrThrow();
            return new bgc($$0, this.b);
        }
    }
}

