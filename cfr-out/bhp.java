/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 */
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public final class bhp
extends Enum<bhp>
implements bhh {
    public static final /* enum */ bhp a = new bhp("true");
    public static final /* enum */ bhp b = new bhp("false");
    public static final /* enum */ bhp c = new bhp("default");
    public static final Codec<bhp> d;
    private final String e;
    private static final /* synthetic */ bhp[] f;

    public static bhp[] values() {
        return (bhp[])f.clone();
    }

    public static bhp valueOf(String $$0) {
        return Enum.valueOf(bhp.class, $$0);
    }

    private bhp(String $$0) {
        this.e = $$0;
    }

    public static bhp a(boolean $$0) {
        return $$0 ? a : b;
    }

    public boolean b(boolean $$0) {
        return switch (this.ordinal()) {
            case 0 -> true;
            case 1 -> false;
            default -> $$0;
        };
    }

    @Override
    public String c() {
        return this.e;
    }

    private static /* synthetic */ bhp[] a() {
        return new bhp[]{a, b, c};
    }

    static {
        f = bhp.a();
        d = Codec.either((Codec)Codec.BOOL, bhh.a(bhp::values)).xmap($$0 -> (bhp)$$0.map(bhp::a, Function.identity()), $$0 -> switch ($$0.ordinal()) {
            default -> throw new MatchException(null, null);
            case 2 -> Either.right((Object)$$0);
            case 0 -> Either.left((Object)true);
            case 1 -> Either.left((Object)false);
        });
    }
}

