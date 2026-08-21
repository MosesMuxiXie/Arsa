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

public record ijm() implements ijl<amt<dur>>
{
    public static final Codec<amt<dur>> a = amt.a(mj.bz);
    public static final ijl.a<ijm, amt<dur>> b = ijl.a.a(MapCodec.unit((Object)new ijm()), a);

    public @Nullable amt<dur> a(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        dup $$5 = $$0.a(ki.ad);
        if ($$5 == null) {
            return null;
        }
        return $$5.a().e().orElse(null);
    }

    @Override
    public ijl.a<ijm, amt<dur>> a() {
        return b;
    }

    @Override
    public Codec<amt<dur>> b() {
        return a;
    }

    @Override
    public /* synthetic */ @Nullable Object b(dlt dlt2, @Nullable hif hif2, @Nullable chl chl2, int n2, dlr dlr2) {
        return this.a(dlt2, hif2, chl2, n2, dlr2);
    }
}

