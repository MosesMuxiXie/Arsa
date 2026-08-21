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

public record ijd() implements ijl<amt<dwo>>
{
    public static final Codec<amt<dwo>> a = amt.a(mj.bE);
    public static final ijl.a<ijd, amt<dwo>> b = ijl.a.a(MapCodec.unit((Object)new ijd()), a);

    public @Nullable amt<dwo> a(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        return $$1 != null ? $$1.aq() : null;
    }

    @Override
    public ijl.a<ijd, amt<dwo>> a() {
        return b;
    }

    @Override
    public Codec<amt<dwo>> b() {
        return a;
    }

    @Override
    public /* synthetic */ @Nullable Object b(dlt dlt2, @Nullable hif hif2, @Nullable chl chl2, int n2, dlr dlr2) {
        return this.a(dlt2, hif2, chl2, n2, dlr2);
    }
}

