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

public final class inj
extends Record {
    private final boolean f;
    private final boolean g;
    private final ile h;
    private final float i;
    public static final boolean a = false;
    public static final boolean b = false;
    public static final float c = 0.0f;
    public static final Codec<inj> d = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.BOOL.optionalFieldOf("blur", (Object)false).forGetter(inj::a), (App)Codec.BOOL.optionalFieldOf("clamp", (Object)false).forGetter(inj::b), (App)ile.f.optionalFieldOf("mipmap_strategy", (Object)ile.a).forGetter(inj::c), (App)Codec.FLOAT.optionalFieldOf("alpha_cutoff_bias", (Object)Float.valueOf(0.0f)).forGetter(inj::d)).apply((Applicative)$$0, inj::new));
    public static final azy<inj> e = new azy<inj>("texture", d);

    public inj(boolean $$0, boolean $$1, ile $$2, float $$3) {
        this.f = $$0;
        this.g = $$1;
        this.h = $$2;
        this.i = $$3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{inj.class, "blur;clamp;mipmapStrategy;alphaCutoffBias", "f", "g", "h", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{inj.class, "blur;clamp;mipmapStrategy;alphaCutoffBias", "f", "g", "h", "i"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{inj.class, "blur;clamp;mipmapStrategy;alphaCutoffBias", "f", "g", "h", "i"}, this, $$0);
    }

    public boolean a() {
        return this.f;
    }

    public boolean b() {
        return this.g;
    }

    public ile c() {
        return this.h;
    }

    public float d() {
        return this.i;
    }
}

