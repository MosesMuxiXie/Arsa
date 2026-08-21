/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Iterables;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Predicate;

public record az<T, P extends Predicate<T>>(Optional<ax<T, P>> a, Optional<ay<T, P>> b, Optional<cq.d> c) implements Predicate<Iterable<T>>
{
    public static <T, P extends Predicate<T>> Codec<az<T, P>> a(Codec<P> $$0) {
        return RecordCodecBuilder.create($$1 -> $$1.group((App)ax.a($$0).optionalFieldOf("contains").forGetter(az::a), (App)ay.a($$0).optionalFieldOf("count").forGetter(az::b), (App)cq.d.d.optionalFieldOf("size").forGetter(az::c)).apply((Applicative)$$1, az::new));
    }

    public boolean a(Iterable<T> $$0) {
        if (this.a.isPresent() && !this.a.get().test($$0)) {
            return false;
        }
        if (this.b.isPresent() && !this.b.get().test($$0)) {
            return false;
        }
        return !this.c.isPresent() || this.c.get().d(Iterables.size($$0));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{az.class, "contains;counts;size", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{az.class, "contains;counts;size", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{az.class, "contains;counts;size", "a", "b", "c"}, this, $$0);
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((Iterable)object);
    }
}

