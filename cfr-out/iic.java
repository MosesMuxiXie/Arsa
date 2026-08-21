/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record iic() implements ihy
{
    public static final MapCodec<iic> a = MapCodec.unit((Object)new iic());

    @Override
    public boolean get(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        if ($$2 instanceof ddm) {
            ddm $$5 = (ddm)$$2;
            if ($$5.cx != null) {
                chb $$6 = hwx.a($$5);
                return $$2.b($$6) == $$0;
            }
        }
        return false;
    }

    public MapCodec<iic> a() {
        return a;
    }
}

