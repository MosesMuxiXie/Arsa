/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class imy
extends Record {
    private final int c;
    private final Optional<Integer> d;
    public static final Codec<imy> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.q.fieldOf("index").forGetter(imy::a), (App)bfm.r.optionalFieldOf("time").forGetter(imy::b)).apply((Applicative)$$0, imy::new));
    public static final Codec<imy> b = Codec.either(bfm.q, a).xmap($$02 -> (imy)$$02.map(imy::new, $$0 -> $$0), $$0 -> $$0.d.isPresent() ? Either.right((Object)$$0) : Either.left((Object)$$0.c));

    public imy(int $$0) {
        this($$0, Optional.empty());
    }

    public imy(int $$0, Optional<Integer> $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public int a(int $$0) {
        return this.d.orElse($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{imy.class, "index;time", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{imy.class, "index;time", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{imy.class, "index;time", "c", "d"}, this, $$0);
    }

    public int a() {
        return this.c;
    }

    public Optional<Integer> b() {
        return this.d;
    }
}

