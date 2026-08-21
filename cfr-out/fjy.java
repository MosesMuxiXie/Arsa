/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

public interface fjy {
    public static final Codec<fjy> c = mi.o.q().dispatch(fjy::a, fjz::codec);

    public @Nullable uz a(bgr var1, @Nullable uz var2);

    public fjz<?> a();
}

