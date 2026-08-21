/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dtz {
    public static final Codec<dtz> a = mi.aw.q().dispatch(dtz::a, Function.identity());

    public void a(dlt var1, dsu.a var2, bgr var3, cda var4);

    public MapCodec<? extends dtz> a();
}

