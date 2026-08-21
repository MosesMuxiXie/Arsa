/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record iio() implements iiv
{
    public static final MapCodec<iio> a = MapCodec.unit((Object)new iio());

    @Override
    public float a(dlt $$0, @Nullable hif $$1, @Nullable chh $$2, int $$3) {
        float f2;
        chl chl2;
        if ($$2 != null && (chl2 = $$2.et()) instanceof ddm) {
            ddm $$4 = (ddm)chl2;
            f2 = $$4.hh().a($$0, 0.0f);
        } else {
            f2 = 0.0f;
        }
        return f2;
    }

    public MapCodec<iio> a() {
        return a;
    }
}

