/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record ihv() implements ihy
{
    public static final MapCodec<ihv> a = MapCodec.unit((Object)new ihv());

    @Override
    public boolean get(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        return dki.g($$0);
    }

    public MapCodec<ihv> a() {
        return a;
    }
}

