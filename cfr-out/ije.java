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

public record ije() implements ijl<amt<cgu<?>>>
{
    public static final Codec<amt<cgu<?>>> a = amt.a(mj.F);
    public static final ijl.a<ije, amt<cgu<?>>> b = ijl.a.a(MapCodec.unit((Object)new ije()), a);

    public @Nullable amt<cgu<?>> a(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        return $$2 == null ? null : $$2.ay().r().h();
    }

    @Override
    public ijl.a<ije, amt<cgu<?>>> a() {
        return b;
    }

    @Override
    public Codec<amt<cgu<?>>> b() {
        return a;
    }

    @Override
    public /* synthetic */ @Nullable Object b(dlt dlt2, @Nullable hif hif2, @Nullable chl chl2, int n2, dlr dlr2) {
        return this.a(dlt2, hif2, chl2, n2, dlr2);
    }
}

