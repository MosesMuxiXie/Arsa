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

public record fsf(float c) implements fsi
{
    public static final MapCodec<fsf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.FLOAT.fieldOf("value").forGetter(fsf::c)).apply((Applicative)$$0, fsf::new));
    public static final Codec<fsf> b = Codec.FLOAT.xmap(fsf::new, fsf::c);

    @Override
    public fsh a() {
        return fsj.b;
    }

    @Override
    public float b(fnz $$0) {
        return this.c;
    }

    public static fsf a(float $$0) {
        return new fsf($$0);
    }

    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        return Float.compare(((fsf)$$0).c, this.c) == 0;
    }

    @Override
    public int hashCode() {
        return this.c != 0.0f ? Float.floatToIntBits(this.c) : 0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fsf.class, "value", "c"}, this);
    }
}

