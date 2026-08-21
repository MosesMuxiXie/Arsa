/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class cem
extends Enum<cem>
implements cel<Boolean, Boolean> {
    public static final /* enum */ cem e = new cem();
    public static final /* enum */ cem f = new cem();
    public static final /* enum */ cem g = new cem();
    public static final /* enum */ cem h = new cem();
    public static final /* enum */ cem i = new cem();
    public static final /* enum */ cem j = new cem();
    private static final /* synthetic */ cem[] k;

    public static cem[] values() {
        return (cem[])k.clone();
    }

    public static cem valueOf(String $$0) {
        return Enum.valueOf(cem.class, $$0);
    }

    public Boolean a(Boolean $$0, Boolean $$1) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> $$1 != false && $$0 != false;
            case 1 -> $$1 == false || $$0 == false;
            case 2 -> $$1 != false || $$0 != false;
            case 3 -> $$1 == false && $$0 == false;
            case 4 -> $$1 ^ $$0;
            case 5 -> $$1 == $$0;
        };
    }

    @Override
    public Codec<Boolean> argumentCodec(cea<Boolean> $$0) {
        return Codec.BOOL;
    }

    @Override
    public cei<Boolean> argumentKeyframeLerp(cea<Boolean> $$0) {
        return cei.b();
    }

    @Override
    public /* synthetic */ Object apply(Object object, Object object2) {
        return this.a((Boolean)object, (Boolean)object2);
    }

    private static /* synthetic */ cem[] b() {
        return new cem[]{e, f, g, h, i, j};
    }

    static {
        k = cem.b();
    }
}

