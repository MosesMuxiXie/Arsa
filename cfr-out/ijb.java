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

public record ijb() implements ijl<dkm.a>
{
    public static final Codec<dkm.a> a = dkm.a.d;
    public static final ijl.a<ijb, dkm.a> b = ijl.a.a(MapCodec.unit((Object)new ijb()), a);

    public dkm.a a(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        doa $$5 = $$0.a(ki.W);
        if ($$5 == null || $$5.b()) {
            return dkm.a.a;
        }
        if ($$5.a(dlx.wG)) {
            return dkm.a.c;
        }
        return dkm.a.b;
    }

    @Override
    public ijl.a<ijb, dkm.a> a() {
        return b;
    }

    @Override
    public Codec<dkm.a> b() {
        return a;
    }

    @Override
    public /* synthetic */ Object b(dlt dlt2, @Nullable hif hif2, @Nullable chl chl2, int n2, dlr dlr2) {
        return this.a(dlt2, hif2, chl2, n2, dlr2);
    }
}

