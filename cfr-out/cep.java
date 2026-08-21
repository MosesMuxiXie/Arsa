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

public final class cep
extends Record {
    private final float b;
    private final float c;
    private static final Codec<cep> d = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.FLOAT.fieldOf("value").forGetter(cep::a), (App)Codec.floatRange((float)0.0f, (float)1.0f).optionalFieldOf("alpha", (Object)Float.valueOf(1.0f)).forGetter(cep::b)).apply((Applicative)$$0, cep::new));
    public static final Codec<cep> a = Codec.either((Codec)Codec.FLOAT, d).xmap($$02 -> (cep)$$02.map(cep::new, $$0 -> $$0), $$0 -> $$0.b() == 1.0f ? Either.left((Object)Float.valueOf($$0.a())) : Either.right((Object)$$0));

    public cep(float $$0) {
        this($$0, 1.0f);
    }

    public cep(float $$0, float $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cep.class, "value;alpha", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cep.class, "value;alpha", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cep.class, "value;alpha", "b", "c"}, this, $$0);
    }

    public float a() {
        return this.b;
    }

    public float b() {
        return this.c;
    }
}

