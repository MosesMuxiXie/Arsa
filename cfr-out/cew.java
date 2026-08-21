/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class cew
extends Enum<cew>
implements bhh {
    public static final /* enum */ cew a = new cew("never");
    public static final /* enum */ cew b = new cew("when_caused_by_living_non_player");
    public static final /* enum */ cew c = new cew("always");
    public static final Codec<cew> d;
    private final String e;
    private static final /* synthetic */ cew[] f;

    public static cew[] values() {
        return (cew[])f.clone();
    }

    public static cew valueOf(String $$0) {
        return Enum.valueOf(cew.class, $$0);
    }

    private cew(String $$0) {
        this.e = $$0;
    }

    @Override
    public String c() {
        return this.e;
    }

    private static /* synthetic */ cew[] a() {
        return new cew[]{a, b, c};
    }

    static {
        f = cew.a();
        d = bhh.a(cew::values);
    }
}

