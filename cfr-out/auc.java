/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record auc<Params, Result>(String a, Optional<aud<Params>> b, Optional<aug<Result>> c) {
    public auc(String $$0, @Nullable aud<Params> $$1, @Nullable aug<Result> $$2) {
        this($$0, Optional.ofNullable($$1), Optional.ofNullable($$2));
    }

    private static <Params> Optional<aud<Params>> a(List<aud<Params>> $$0) {
        return $$0.isEmpty() ? Optional.empty() : Optional.of($$0.getFirst());
    }

    private static <Params> List<aud<Params>> a(Optional<aud<Params>> $$0) {
        if ($$0.isPresent()) {
            return List.of($$0.get());
        }
        return List.of();
    }

    private static <Params> Codec<Optional<aud<Params>>> d() {
        return aud.a().codec().listOf().xmap(auc::a, auc::a);
    }

    static <Params, Result> MapCodec<auc<Params, Result>> e() {
        return RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("description").forGetter(auc::a), (App)auc.d().fieldOf("params").forGetter(auc::b), (App)aug.a().optionalFieldOf("result").forGetter(auc::c)).apply((Applicative)$$0, auc::new));
    }

    public a<Params, Result> a(amo $$0) {
        return new a($$0, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{auc.class, "description;params;result", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{auc.class, "description;params;result", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{auc.class, "description;params;result", "a", "b", "c"}, this, $$0);
    }

    public record a<Params, Result>(amo b, auc<Params, Result> c) {
        public static final Codec<a<?, ?>> a = auc$a.a();

        public static <Params, Result> Codec<a<Params, Result>> a() {
            return RecordCodecBuilder.create($$0 -> $$0.group((App)amo.a.fieldOf("name").forGetter(a::b), (App)auc.e().forGetter(a::c)).apply((Applicative)$$0, a::new));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "name;contents", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "name;contents", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "name;contents", "b", "c"}, this, $$0);
        }
    }
}

