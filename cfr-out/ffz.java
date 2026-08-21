/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class ffz
extends Enum<ffz>
implements bhh {
    public static final /* enum */ ffz a = new ffz("none");
    public static final /* enum */ ffz b = new ffz("bury");
    public static final /* enum */ ffz c = new ffz("beard_thin");
    public static final /* enum */ ffz d = new ffz("beard_box");
    public static final /* enum */ ffz e = new ffz("encapsulate");
    public static final Codec<ffz> f;
    private final String g;
    private static final /* synthetic */ ffz[] h;

    public static ffz[] values() {
        return (ffz[])h.clone();
    }

    public static ffz valueOf(String $$0) {
        return Enum.valueOf(ffz.class, $$0);
    }

    private ffz(String $$0) {
        this.g = $$0;
    }

    @Override
    public String c() {
        return this.g;
    }

    private static /* synthetic */ ffz[] a() {
        return new ffz[]{a, b, c, d, e};
    }

    static {
        h = ffz.a();
        f = bhh.a(ffz::values);
    }
}

