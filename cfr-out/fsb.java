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

public class fsb {
    private static final Codec<fsa> d = mi.H.q().dispatch(fsa::a, frz::a);
    public static final Codec<fsa> a = Codec.lazyInitialized(() -> Codec.either(fry.b, d).xmap(Either::unwrap, $$0 -> {
        Either either;
        if ($$0 instanceof fry) {
            fry $$1 = (fry)$$0;
            either = Either.left((Object)$$1);
        } else {
            either = Either.right((Object)$$0);
        }
        return either;
    }));
    public static final frz b = fsb.a("storage", fsc.a);
    public static final frz c = fsb.a("context", fry.a);

    private static frz a(String $$0, MapCodec<? extends fsa> $$1) {
        return jq.a(mi.H, amo.b($$0), new frz($$1));
    }
}

