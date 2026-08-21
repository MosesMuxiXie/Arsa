/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ccd
extends ccf {
    public static final ccd a = new ccd(0.0f);
    public static final MapCodec<ccd> b = Codec.FLOAT.fieldOf("value").xmap(ccd::a, ccd::d);
    private final float d;

    public static ccd a(float $$0) {
        if ($$0 == 0.0f) {
            return a;
        }
        return new ccd($$0);
    }

    private ccd(float $$0) {
        this.d = $$0;
    }

    public float d() {
        return this.d;
    }

    @Override
    public float a(bgr $$0) {
        return this.d;
    }

    @Override
    public float a() {
        return this.d;
    }

    @Override
    public float b() {
        return this.d;
    }

    @Override
    public ccg<?> c() {
        return ccg.a;
    }

    public String toString() {
        return Float.toString(this.d);
    }
}

