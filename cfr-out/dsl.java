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

public record dsl<T>(T a, Optional<frm> b) {
    public static Codec<frm> a(bhw $$0) {
        return frm.e.validate($$1 -> {
            bgp.a $$2 = new bgp.a();
            fog $$3 = new fog($$2, $$0);
            $$1.a($$3);
            if (!$$2.a()) {
                return DataResult.error(() -> "Validation error in enchantment effect condition: " + $$2.b());
            }
            return DataResult.success((Object)$$1);
        });
    }

    public static <T> Codec<dsl<T>> a(Codec<T> $$0, bhw $$1) {
        return RecordCodecBuilder.create($$2 -> $$2.group((App)$$0.fieldOf("effect").forGetter(dsl::a), (App)dsl.a($$1).optionalFieldOf("requirements").forGetter(dsl::b)).apply((Applicative)$$2, dsl::new));
    }

    public boolean a(fnz $$0) {
        if (this.b.isEmpty()) {
            return true;
        }
        return this.b.get().test($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dsl.class, "effect;requirements", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dsl.class, "effect;requirements", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dsl.class, "effect;requirements", "a", "b"}, this, $$0);
    }
}

