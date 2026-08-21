/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record iig() implements ihy
{
    public static final MapCodec<iig> a = MapCodec.unit((Object)new iig());

    @Override
    public boolean get(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        hnh $$5;
        return $$2 instanceof hnh && ($$5 = (hnh)$$2).gK().h() == $$0;
    }

    public MapCodec<iig> a() {
        return a;
    }
}

