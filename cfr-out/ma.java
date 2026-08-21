/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class ma
implements lw {
    public static final float e = 0.01f;
    public static final float f = 4.0f;
    protected static final Codec<Float> g = Codec.FLOAT.validate($$0 -> $$0.floatValue() >= 0.01f && $$0.floatValue() <= 4.0f ? DataResult.success((Object)$$0) : DataResult.error(() -> "Value must be within range [0.01;4.0]: " + $$0));
    private final float a;

    public ma(float $$0) {
        this.a = bgj.a($$0, 0.01f, 4.0f);
    }

    public float d() {
        return this.a;
    }
}

