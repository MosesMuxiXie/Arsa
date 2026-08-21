/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class fja
extends Enum<fja>
implements bhh {
    public static final /* enum */ fja a = new fja("ignore_waterlogging");
    public static final /* enum */ fja b = new fja("apply_waterlogging");
    public static Codec<fja> c;
    private final String d;
    private static final /* synthetic */ fja[] e;

    public static fja[] values() {
        return (fja[])e.clone();
    }

    public static fja valueOf(String $$0) {
        return Enum.valueOf(fja.class, $$0);
    }

    private fja(String $$0) {
        this.d = $$0;
    }

    @Override
    public String c() {
        return this.d;
    }

    private static /* synthetic */ fja[] a() {
        return new fja[]{a, b};
    }

    static {
        e = fja.a();
        c = bhh.b(fja::values);
    }
}

