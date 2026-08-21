/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class bcz
extends Record {
    private final amo e;
    private final Optional<Float> f;
    public static final Codec<bcz> a = RecordCodecBuilder.create($$0 -> $$0.group((App)amo.a.fieldOf("sound_id").forGetter(bcz::a), (App)Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(bcz::b)).apply((Applicative)$$0, bcz::a));
    public static final Codec<jd<bcz>> b = amq.a(mj.aw, a);
    public static final aao<ByteBuf, bcz> c = aao.a(amo.b, bcz::a, aam.l.a(aam::a), bcz::b, bcz::a);
    public static final aao<xq, jd<bcz>> d = aam.a(mj.aw, c);

    public bcz(amo $$0, Optional<Float> $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    private static bcz a(amo $$0, Optional<Float> $$12) {
        return $$12.map($$1 -> bcz.a($$0, $$1.floatValue())).orElseGet(() -> bcz.a($$0));
    }

    public static bcz a(amo $$0) {
        return new bcz($$0, Optional.empty());
    }

    public static bcz a(amo $$0, float $$1) {
        return new bcz($$0, Optional.of(Float.valueOf($$1)));
    }

    public float a(float $$0) {
        return this.f.orElse(Float.valueOf($$0 > 1.0f ? 16.0f * $$0 : 16.0f)).floatValue();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bcz.class, "location;fixedRange", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bcz.class, "location;fixedRange", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bcz.class, "location;fixedRange", "e", "f"}, this, $$0);
    }

    public amo a() {
        return this.e;
    }

    public Optional<Float> b() {
        return this.f;
    }
}

