/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class cch {
    private static final Codec<Either<Integer, cch>> a = Codec.either((Codec)Codec.INT, (Codec)mi.K.q().dispatch(cch::c, cci::codec));
    public static final Codec<cch> c = a.xmap($$02 -> (cch)$$02.map(cce::a, $$0 -> $$0), $$0 -> $$0.c() == cci.a ? Either.left((Object)((cce)$$0).d()) : Either.right((Object)$$0));
    public static final Codec<cch> d = cch.b(0, Integer.MAX_VALUE);
    public static final Codec<cch> e = cch.b(1, Integer.MAX_VALUE);

    public static Codec<cch> b(int $$0, int $$1) {
        return cch.a($$0, $$1, c);
    }

    public static <T extends cch> Codec<T> a(int $$0, int $$1, Codec<T> $$22) {
        return $$22.validate($$2 -> cch.a($$0, $$1, $$2));
    }

    private static <T extends cch> DataResult<T> a(int $$0, int $$1, T $$2) {
        if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
        }
        if ($$2.b() > $$1) {
            return DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]");
        }
        return DataResult.success($$2);
    }

    public abstract int a(bgr var1);

    public abstract int a();

    public abstract int b();

    public abstract cci<?> c();
}

