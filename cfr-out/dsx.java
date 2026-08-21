/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public record dsx<T>(dss a, dss b, T c, Optional<frm> d) {
    public static <S> Codec<dsx<S>> a(Codec<S> $$0, bhw $$1) {
        return RecordCodecBuilder.create($$2 -> $$2.group((App)dss.d.fieldOf("enchanted").forGetter(dsx::a), (App)dss.d.fieldOf("affected").forGetter(dsx::b), (App)$$0.fieldOf("effect").forGetter(dsx::c), (App)dsl.a($$1).optionalFieldOf("requirements").forGetter(dsx::d)).apply((Applicative)$$2, dsx::new));
    }

    public static <S> Codec<dsx<S>> b(Codec<S> $$0, bhw $$1) {
        return RecordCodecBuilder.create($$22 -> $$22.group((App)dss.d.validate($$0 -> $$0 != dss.b ? DataResult.success((Object)$$0) : DataResult.error(() -> "enchanted must be attacker or victim")).fieldOf("enchanted").forGetter(dsx::a), (App)$$0.fieldOf("effect").forGetter(dsx::c), (App)dsl.a($$1).optionalFieldOf("requirements").forGetter(dsx::d)).apply((Applicative)$$22, ($$0, $$1, $$2) -> new dsx<Object>((dss)$$0, dss.c, $$1, (Optional<frm>)$$2)));
    }

    public boolean a(fnz $$0) {
        if (this.d.isEmpty()) {
            return true;
        }
        return this.d.get().test($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dsx.class, "enchanted;affected;effect;requirements", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dsx.class, "enchanted;affected;effect;requirements", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dsx.class, "enchanted;affected;effect;requirements", "a", "b", "c", "d"}, this, $$0);
    }
}

