/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultiset
 *  com.google.common.collect.Multiset
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public interface ijl<T> {
    public @Nullable T b(dlt var1, @Nullable hif var2, @Nullable chl var3, int var4, dlr var5);

    public Codec<T> b();

    public a<? extends ijl<T>, T> a();

    public record a<P extends ijl<T>, T>(MapCodec<ihq.d<P, T>> a) {
        public static <P extends ijl<T>, T> a<P, T> a(MapCodec<P> $$0, Codec<T> $$1) {
            MapCodec $$22 = RecordCodecBuilder.mapCodec($$2 -> $$2.group((App)$$0.forGetter(ihq.d::a), (App)ijl$a.a($$1).forGetter(ihq.d::b)).apply((Applicative)$$2, ihq.d::new));
            return new a<P, T>($$22);
        }

        public static <T> MapCodec<List<ihq.b<T>>> a(Codec<T> $$0) {
            return ihq.b.a($$0).listOf().validate(a::a).fieldOf("cases");
        }

        private static <T> DataResult<List<ihq.b<T>>> a(List<ihq.b<T>> $$0) {
            if ($$0.isEmpty()) {
                return DataResult.error(() -> "Empty case list");
            }
            HashMultiset $$1 = HashMultiset.create();
            for (ihq.b<T> $$2 : $$0) {
                $$1.addAll($$2.a());
            }
            if ($$1.size() != $$1.entrySet().size()) {
                return DataResult.error(() -> a.a((Multiset)$$1));
            }
            return DataResult.success($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "switchCodec", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "switchCodec", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "switchCodec", "a"}, this, $$0);
        }

        private static /* synthetic */ String a(Multiset $$02) {
            return "Duplicate case conditions: " + $$02.entrySet().stream().filter($$0 -> $$0.getCount() > 1).map($$0 -> $$0.getElement().toString()).collect(Collectors.joining(", "));
        }
    }
}

