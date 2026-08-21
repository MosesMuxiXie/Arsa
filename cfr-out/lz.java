/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class lz
implements lw {
    private final lx<lz> a;
    private final float b;

    public static MapCodec<lz> a(lx<lz> $$02) {
        return Codec.FLOAT.xmap($$1 -> new lz($$02, $$1.floatValue()), $$0 -> Float.valueOf($$0.b)).optionalFieldOf("power", (Object)lz.a($$02, 1.0f));
    }

    public static aao<? super ByteBuf, lz> b(lx<lz> $$02) {
        return aam.l.a($$1 -> new lz($$02, $$1.floatValue()), $$0 -> Float.valueOf($$0.b));
    }

    private lz(lx<lz> $$0, float $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public lx<lz> a() {
        return this.a;
    }

    public float b() {
        return this.b;
    }

    public static lz a(lx<lz> $$0, float $$1) {
        return new lz($$0, $$1);
    }
}

