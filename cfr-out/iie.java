/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record iie() implements ihy
{
    public static final MapCodec<iie> a = MapCodec.unit((Object)new iie());

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean get(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        if (!($$2 instanceof hnh)) return false;
        hnh $$5 = (hnh)$$2;
        if ($$5.cn.g() != $$0) return false;
        return true;
    }

    public MapCodec<iie> a() {
        return a;
    }
}

