/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public record dpo() implements dpp
{
    public static final dpo a = new dpo();
    public static final MapCodec<dpo> b = MapCodec.unit((Object)a);
    public static final aao<xq, dpo> c = aao.a(a);

    public dpp.a<dpo> a() {
        return dpp.a.c;
    }

    @Override
    public boolean a(dwo $$0, dlt $$1, chl $$2) {
        return $$2.eV();
    }
}

