/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class fgk
extends Enum<fgk>
implements bhh {
    public static final /* enum */ fgk a = new fgk("linear");
    public static final /* enum */ fgk b = new fgk("triangular");
    public static final Codec<fgk> c;
    private final String d;
    private static final /* synthetic */ fgk[] e;

    public static fgk[] values() {
        return (fgk[])e.clone();
    }

    public static fgk valueOf(String $$0) {
        return Enum.valueOf(fgk.class, $$0);
    }

    private fgk(String $$0) {
        this.d = $$0;
    }

    @Override
    public String c() {
        return this.d;
    }

    public int a(bgr $$0, int $$1) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> $$0.a($$1);
            case 1 -> ($$0.a($$1) + $$0.a($$1)) / 2;
        };
    }

    private static /* synthetic */ fgk[] a() {
        return new fgk[]{a, b};
    }

    static {
        e = fgk.a();
        c = bhh.a(fgk::values);
    }
}

