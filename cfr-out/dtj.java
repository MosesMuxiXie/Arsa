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

public interface dtj {
    public static final Codec<dtj> b = mi.av.q().dispatch(dtj::a, Function.identity());

    public static MapCodec<? extends dtj> a(jq<MapCodec<? extends dtj>> $$0) {
        jq.a($$0, "add", dsy.a);
        jq.a($$0, "all_of", dsz.c.a);
        jq.a($$0, "multiply", dtm.a);
        jq.a($$0, "remove_binomial", dto.a);
        jq.a($$0, "exponential", dts.a);
        return jq.a($$0, "set", dtu.a);
    }

    public float a(int var1, bgr var2, float var3);

    public MapCodec<? extends dtj> a();
}

