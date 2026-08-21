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

public final class lt
extends Record {
    private final lw c;
    private final float d;
    private final float e;
    public static final MapCodec<lt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ly.bl.fieldOf("particle").forGetter(lt::a), (App)Codec.FLOAT.optionalFieldOf("scaling", (Object)Float.valueOf(1.0f)).forGetter(lt::b), (App)Codec.FLOAT.optionalFieldOf("speed", (Object)Float.valueOf(1.0f)).forGetter(lt::c)).apply((Applicative)$$0, lt::new));
    public static final aao<xq, lt> b = aao.a(ly.bm, lt::a, aam.l, lt::b, aam.l, lt::c, lt::new);

    public lt(lw $$0, float $$1, float $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lt.class, "particle;scaling;speed", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lt.class, "particle;scaling;speed", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lt.class, "particle;scaling;speed", "c", "d", "e"}, this, $$0);
    }

    public lw a() {
        return this.c;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.e;
    }
}

