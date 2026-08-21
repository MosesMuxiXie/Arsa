/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class cce
extends cch {
    public static final cce a = new cce(0);
    public static final MapCodec<cce> b = Codec.INT.fieldOf("value").xmap(cce::a, cce::d);
    private final int f;

    public static cce a(int $$0) {
        if ($$0 == 0) {
            return a;
        }
        return new cce($$0);
    }

    private cce(int $$0) {
        this.f = $$0;
    }

    public int d() {
        return this.f;
    }

    @Override
    public int a(bgr $$0) {
        return this.f;
    }

    @Override
    public int a() {
        return this.f;
    }

    @Override
    public int b() {
        return this.f;
    }

    @Override
    public cci<?> c() {
        return cci.a;
    }

    public String toString() {
        return Integer.toString(this.f);
    }
}

