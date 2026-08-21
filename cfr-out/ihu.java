/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record ihu() implements ihy
{
    public static final MapCodec<ihu> a = MapCodec.unit((Object)new ihu());

    @Override
    public boolean get(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        return $$0.r();
    }

    public MapCodec<ihu> a() {
        return a;
    }
}

