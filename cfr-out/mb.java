/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class mb
extends Record
implements lw {
    private final float c;
    public static final MapCodec<mb> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.FLOAT.fieldOf("roll").forGetter($$0 -> Float.valueOf($$0.c))).apply((Applicative)$$02, mb::new));
    public static final aao<xq, mb> b = aao.a(aam.l, $$0 -> Float.valueOf($$0.c), mb::new);

    public mb(float $$0) {
        this.c = $$0;
    }

    public lx<mb> a() {
        return ly.M;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{mb.class, "roll", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{mb.class, "roll", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mb.class, "roll", "c"}, this, $$0);
    }

    public float b() {
        return this.c;
    }
}

