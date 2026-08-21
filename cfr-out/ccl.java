/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ccl
extends ccf {
    public static final MapCodec<ccl> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.FLOAT.fieldOf("min").forGetter($$0 -> Float.valueOf($$0.b)), (App)Codec.FLOAT.fieldOf("max").forGetter($$0 -> Float.valueOf($$0.d)), (App)Codec.FLOAT.fieldOf("plateau").forGetter($$0 -> Float.valueOf($$0.e))).apply((Applicative)$$02, ccl::new)).validate($$0 -> {
        if ($$0.d < $$0.b) {
            return DataResult.error(() -> "Max must be larger than min: [" + $$0.b + ", " + $$0.d + "]");
        }
        if ($$0.e > $$0.d - $$0.b) {
            return DataResult.error(() -> "Plateau can at most be the full span: [" + $$0.b + ", " + $$0.d + "]");
        }
        return DataResult.success((Object)$$0);
    });
    private final float b;
    private final float d;
    private final float e;

    public static ccl a(float $$0, float $$1, float $$2) {
        return new ccl($$0, $$1, $$2);
    }

    private ccl(float $$0, float $$1, float $$2) {
        this.b = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    @Override
    public float a(bgr $$0) {
        float $$1 = this.d - this.b;
        float $$2 = ($$1 - this.e) / 2.0f;
        float $$3 = $$1 - $$2;
        return this.b + $$0.i() * $$3 + $$0.i() * $$2;
    }

    @Override
    public float a() {
        return this.b;
    }

    @Override
    public float b() {
        return this.d;
    }

    @Override
    public ccg<?> c() {
        return ccg.d;
    }

    public String toString() {
        return "trapezoid(" + this.e + ") in [" + this.b + "-" + this.d + "]";
    }
}

