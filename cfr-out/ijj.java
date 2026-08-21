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

public record ijj() implements ijl<chb>
{
    public static final Codec<chb> a = chb.c;
    public static final ijl.a<ijj, chb> b = ijl.a.a(MapCodec.unit((Object)new ijj()), a);

    public @Nullable chb a(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        return $$2 == null ? null : $$2.at();
    }

    @Override
    public ijl.a<ijj, chb> a() {
        return b;
    }

    @Override
    public Codec<chb> b() {
        return a;
    }

    @Override
    public /* synthetic */ @Nullable Object b(dlt dlt2, @Nullable hif hif2, @Nullable chl chl2, int n2, dlr dlr2) {
        return this.a(dlt2, hif2, chl2, n2, dlr2);
    }
}

