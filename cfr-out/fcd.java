/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public abstract class fcd {
    public static final Codec<fcd> a = mi.T.q().dispatch(fcd::a, fce::a);

    public static fcm a(eoh $$0) {
        return new fcm($$0);
    }

    public static fcm a(dzq $$0) {
        return new fcm($$0.m());
    }

    protected abstract fce<?> a();

    public abstract eoh a(bgr var1, is var2);
}

