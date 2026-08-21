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

public class ccn
extends cch {
    public static final MapCodec<ccn> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.INT.fieldOf("min_inclusive").forGetter($$0 -> $$0.b), (App)Codec.INT.fieldOf("max_inclusive").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, ccn::new)).validate($$0 -> {
        if ($$0.f < $$0.b) {
            return DataResult.error(() -> "Max must be at least min, min_inclusive: " + $$0.b + ", max_inclusive: " + $$0.f);
        }
        return DataResult.success((Object)$$0);
    });
    private final int b;
    private final int f;

    private ccn(int $$0, int $$1) {
        this.b = $$0;
        this.f = $$1;
    }

    public static ccn a(int $$0, int $$1) {
        return new ccn($$0, $$1);
    }

    @Override
    public int a(bgr $$0) {
        return bgj.b($$0, this.b, this.f);
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public int b() {
        return this.f;
    }

    @Override
    public cci<?> c() {
        return cci.b;
    }

    public String toString() {
        return "[" + this.b + "-" + this.f + "]";
    }
}

