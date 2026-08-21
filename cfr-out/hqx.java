/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Predicate;

public final class hqx
extends Record {
    private final Optional<hqu> b;
    private final hqh.b c;
    public static final Codec<hqx> a = RecordCodecBuilder.create($$0 -> $$0.group((App)hqu.a.optionalFieldOf("when").forGetter(hqx::a), (App)hqh.b.c.fieldOf("apply").forGetter(hqx::b)).apply((Applicative)$$0, hqx::new));

    public hqx(Optional<hqu> $$0, hqh.b $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public <O, S extends eoj<O, S>> Predicate<S> a(eoi<O, S> $$02) {
        return this.b.map($$1 -> $$1.instantiate($$02)).orElse($$0 -> true);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hqx.class, "condition;variant", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hqx.class, "condition;variant", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hqx.class, "condition;variant", "b", "c"}, this, $$0);
    }

    public Optional<hqu> a() {
        return this.b;
    }

    public hqh.b b() {
        return this.c;
    }
}

