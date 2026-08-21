/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public class me
implements lw {
    private final lx<me> a;
    private final int b;
    private final float c;

    public static MapCodec<me> a(lx<me> $$0) {
        return RecordCodecBuilder.mapCodec($$12 -> $$12.group((App)bfm.l.optionalFieldOf("color", (Object)-1).forGetter($$0 -> $$0.b), (App)Codec.FLOAT.optionalFieldOf("power", (Object)Float.valueOf(1.0f)).forGetter($$0 -> Float.valueOf($$0.c))).apply((Applicative)$$12, ($$1, $$2) -> new me($$0, (int)$$1, $$2.floatValue())));
    }

    public static aao<? super ByteBuf, me> b(lx<me> $$02) {
        return aao.a(aam.g, $$0 -> $$0.b, aam.l, $$0 -> Float.valueOf($$0.c), ($$1, $$2) -> new me($$02, (int)$$1, $$2.floatValue()));
    }

    private me(lx<me> $$0, int $$1, float $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public lx<me> a() {
        return this.a;
    }

    public float b() {
        return (float)bel.c(this.b) / 255.0f;
    }

    public float c() {
        return (float)bel.d(this.b) / 255.0f;
    }

    public float d() {
        return (float)bel.e(this.b) / 255.0f;
    }

    public float e() {
        return this.c;
    }

    public static me a(lx<me> $$0, int $$1, float $$2) {
        return new me($$0, $$1, $$2);
    }

    public static me a(lx<me> $$0, float $$1, float $$2, float $$3, float $$4) {
        return me.a($$0, bel.a(1.0f, $$1, $$2, $$3), $$4);
    }
}

