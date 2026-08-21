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
import java.util.function.Function;

public final class fgo
extends Record {
    private final int c;
    private final int d;
    private static final Codec<fgo> e = RecordCodecBuilder.create($$02 -> $$02.group((App)bfm.q.lenientOptionalFieldOf("bottom", (Object)0).forGetter($$0 -> $$0.c), (App)bfm.q.lenientOptionalFieldOf("top", (Object)0).forGetter($$0 -> $$0.d)).apply((Applicative)$$02, fgo::new));
    public static final Codec<fgo> a = Codec.either(bfm.q, e).xmap($$0 -> (fgo)$$0.map(fgo::new, Function.identity()), $$0 -> $$0.a() ? Either.left((Object)$$0.c) : Either.right((Object)$$0));
    public static final fgo b = new fgo(0);

    public fgo(int $$0) {
        this($$0, $$0);
    }

    public fgo(int $$0, int $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public boolean a() {
        return this.d == this.c;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fgo.class, "bottom;top", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fgo.class, "bottom;top", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fgo.class, "bottom;top", "c", "d"}, this, $$0);
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }
}

