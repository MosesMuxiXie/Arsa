/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public interface etp<T extends eto> {
    public static final etp<etg> a = etp.a("block", new etg.a());
    public static final etp<eti> b = etp.a("entity", new eti.a());

    public MapCodec<T> a();

    public aao<? super xq, T> b();

    public static <S extends etp<T>, T extends eto> S a(String $$0, S $$1) {
        return (S)jq.a(mi.u, $$0, $$1);
    }
}

