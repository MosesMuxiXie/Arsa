/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public interface bt {
    public static final Codec<bt> a = mi.ao.q().dispatch(bt::a, Function.identity());

    public MapCodec<? extends bt> a();

    public boolean a(cgk var1, axf var2, @Nullable ftm var3);
}

