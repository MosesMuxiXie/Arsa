/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class iiq
implements iiv {
    public static final MapCodec<iiq> a = MapCodec.unit((Object)new iiq());

    @Override
    public float a(dlt $$0, @Nullable hif $$1, @Nullable chh $$2, int $$3) {
        chl $$4;
        chl chl2 = $$4 = $$2 == null ? null : $$2.et();
        if ($$4 == null) {
            return 0.0f;
        }
        if (dkm.g($$0)) {
            return 0.0f;
        }
        int $$5 = dkm.b($$0, $$4);
        return (float)iiy.a($$0, $$4) / (float)$$5;
    }

    public MapCodec<iiq> a() {
        return a;
    }
}

