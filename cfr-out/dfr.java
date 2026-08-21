/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dfr
extends dfq.b<dft> {
    public static final Codec<dfr> b = mi.aG.q().dispatch(dfr::a, $$0 -> $$0);

    public MapCodec<? extends dfr> a();
}

