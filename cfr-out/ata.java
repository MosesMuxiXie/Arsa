/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public interface ata {
    public static final Codec<ata> a = mi.aK.q().dispatch(ata::a, $$0 -> $$0);
    public static final Codec<List<ata>> b = bfm.a(a);

    public MapCodec<? extends ata> a();
}

