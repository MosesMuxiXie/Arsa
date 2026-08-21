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
import org.jspecify.annotations.Nullable;

public record ijg() implements ijl<dlr>
{
    public static final Codec<dlr> a = dlr.k;
    public static final ijl.a<ijg, dlr> b = ijl.a.a(MapCodec.unit((Object)new ijg()), a);

    public dlr a(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        return $$4;
    }

    @Override
    public ijl.a<ijg, dlr> a() {
        return b;
    }

    @Override
    public Codec<dlr> b() {
        return a;
    }

    @Override
    public /* synthetic */ Object b(dlt dlt2, @Nullable hif hif2, @Nullable chl chl2, int n2, dlr dlr2) {
        return this.a(dlt2, hif2, chl2, n2, dlr2);
    }
}

