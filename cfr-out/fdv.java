/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 */
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class fdv {
    private static final Codec<Either<evk, fdv>> a = Codec.either(evk.a, (Codec)mi.L.q().dispatch(fdv::a, fdw::codec));
    public static final Codec<fdv> c = a.xmap($$02 -> (fdv)$$02.map(fdu::a, $$0 -> $$0), $$0 -> $$0.a() == fdw.a ? Either.left((Object)((fdu)$$0).b()) : Either.right((Object)$$0));

    public abstract int a(bgr var1, evn var2);

    public abstract fdw<?> a();
}

