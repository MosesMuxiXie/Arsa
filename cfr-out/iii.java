/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record iii() implements ihy
{
    public static final MapCodec<iii> a = MapCodec.unit((Object)new iii());

    @Override
    public boolean get(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        gfj $$5 = gfj.V();
        cgk $$6 = $$5.au();
        return $$6 != null ? $$2 == $$6 : $$2 == $$5.s;
    }

    public MapCodec<iii> a() {
        return a;
    }
}

