/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record iih() implements ihy
{
    public static final MapCodec<iih> a = MapCodec.unit((Object)new iih());

    @Override
    public boolean get(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        if ($$2 == null) {
            return false;
        }
        return $$2.fZ() && $$2.gb() == $$0;
    }

    public MapCodec<iih> a() {
        return a;
    }
}

