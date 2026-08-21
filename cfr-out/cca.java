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

public class cca
extends cch {
    public static final MapCodec<cca> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)cch.c.fieldOf("source").forGetter($$0 -> $$0.b), (App)Codec.INT.fieldOf("min_inclusive").forGetter($$0 -> $$0.f), (App)Codec.INT.fieldOf("max_inclusive").forGetter($$0 -> $$0.g)).apply((Applicative)$$02, cca::new)).validate($$0 -> {
        if ($$0.g < $$0.f) {
            return DataResult.error(() -> "Max must be at least min, min_inclusive: " + $$0.f + ", max_inclusive: " + $$0.g);
        }
        return DataResult.success((Object)$$0);
    });
    private final cch b;
    private final int f;
    private final int g;

    public static cca a(cch $$0, int $$1, int $$2) {
        return new cca($$0, $$1, $$2);
    }

    public cca(cch $$0, int $$1, int $$2) {
        this.b = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    @Override
    public int a(bgr $$0) {
        return bgj.a(this.b.a($$0), this.f, this.g);
    }

    @Override
    public int a() {
        return Math.max(this.f, this.b.a());
    }

    @Override
    public int b() {
        return Math.min(this.g, this.b.b());
    }

    @Override
    public cci<?> c() {
        return cci.d;
    }
}

