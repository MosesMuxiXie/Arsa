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

public class fsj {
    private static final Codec<fsi> h = mi.G.q().dispatch(fsi::a, fsh::a);
    public static final Codec<fsi> a = Codec.lazyInitialized(() -> {
        Codec $$02 = Codec.withAlternative(h, (Codec)fsm.a.codec());
        return Codec.either(fsf.b, (Codec)$$02).xmap(Either::unwrap, $$0 -> {
            Either either;
            if ($$0 instanceof fsf) {
                fsf $$1 = (fsf)$$0;
                either = Either.left((Object)$$1);
            } else {
                either = Either.right((Object)$$0);
            }
            return either;
        });
    });
    public static final fsh b = fsj.a("constant", fsf.a);
    public static final fsh c = fsj.a("uniform", fsm.a);
    public static final fsh d = fsj.a("binomial", fse.a);
    public static final fsh e = fsj.a("score", fsk.a);
    public static final fsh f = fsj.a("storage", fsl.a);
    public static final fsh g = fsj.a("enchantment_level", fsg.a);

    private static fsh a(String $$0, MapCodec<? extends fsi> $$1) {
        return jq.a(mi.G, amo.b($$0), new fsh($$1));
    }
}

