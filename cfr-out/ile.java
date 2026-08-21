/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class ile
extends Enum<ile>
implements bhh {
    public static final /* enum */ ile a = new ile("auto");
    public static final /* enum */ ile b = new ile("mean");
    public static final /* enum */ ile c = new ile("cutout");
    public static final /* enum */ ile d = new ile("strict_cutout");
    public static final /* enum */ ile e = new ile("dark_cutout");
    public static final Codec<ile> f;
    private final String g;
    private static final /* synthetic */ ile[] h;

    public static ile[] values() {
        return (ile[])h.clone();
    }

    public static ile valueOf(String $$0) {
        return Enum.valueOf(ile.class, $$0);
    }

    private ile(String $$0) {
        this.g = $$0;
    }

    @Override
    public String c() {
        return this.g;
    }

    private static /* synthetic */ ile[] a() {
        return new ile[]{a, b, c, d, e};
    }

    static {
        h = ile.a();
        f = bhh.b(ile::values);
    }
}

