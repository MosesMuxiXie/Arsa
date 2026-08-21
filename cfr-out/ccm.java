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

public class ccm
extends ccf {
    public static final MapCodec<ccm> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.FLOAT.fieldOf("min_inclusive").forGetter($$0 -> Float.valueOf($$0.b)), (App)Codec.FLOAT.fieldOf("max_exclusive").forGetter($$0 -> Float.valueOf($$0.d))).apply((Applicative)$$02, ccm::new)).validate($$0 -> {
        if ($$0.d <= $$0.b) {
            return DataResult.error(() -> "Max must be larger than min, min_inclusive: " + $$0.b + ", max_exclusive: " + $$0.d);
        }
        return DataResult.success((Object)$$0);
    });
    private final float b;
    private final float d;

    private ccm(float $$0, float $$1) {
        this.b = $$0;
        this.d = $$1;
    }

    public static ccm b(float $$0, float $$1) {
        if ($$1 <= $$0) {
            throw new IllegalArgumentException("Max must exceed min");
        }
        return new ccm($$0, $$1);
    }

    @Override
    public float a(bgr $$0) {
        return bgj.b($$0, this.b, this.d);
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
        return ccg.b;
    }

    public String toString() {
        return "[" + this.b + "-" + this.d + "]";
    }
}

