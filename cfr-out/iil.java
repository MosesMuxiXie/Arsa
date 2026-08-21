/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record iil() implements iiv
{
    public static final MapCodec<iil> a = MapCodec.unit((Object)new iil());

    @Override
    public float a(dlt $$0, @Nullable hif $$1, @Nullable chh $$2, int $$3) {
        return dki.c($$0);
    }

    public MapCodec<iil> a() {
        return a;
    }
}

