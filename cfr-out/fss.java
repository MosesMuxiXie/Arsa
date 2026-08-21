/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fss {
    private static final Codec<fsr> d = mi.I.q().dispatch(fsr::a, fsq::a);
    public static final Codec<fsr> a = Codec.lazyInitialized(() -> Codec.either(fso.b, d).xmap(Either::unwrap, $$0 -> {
        Either either;
        if ($$0 instanceof fso) {
            fso $$1 = (fso)$$0;
            either = Either.left((Object)$$1);
        } else {
            either = Either.right((Object)$$0);
        }
        return either;
    }));
    public static final fsq b = fss.a("fixed", fsp.a);
    public static final fsq c = fss.a("context", fso.a);

    private static fsq a(String $$0, MapCodec<? extends fsr> $$1) {
        return jq.a(mi.I, amo.b($$0), new fsq($$1));
    }
}

