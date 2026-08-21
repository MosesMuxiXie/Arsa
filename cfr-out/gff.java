/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class gff
extends Enum<gff>
implements bhh {
    public static final /* enum */ gff a = new gff("minimized", "options.inactivityFpsLimit.minimized");
    public static final /* enum */ gff b = new gff("afk", "options.inactivityFpsLimit.afk");
    public static final Codec<gff> c;
    private final String d;
    private final yh e;
    private static final /* synthetic */ gff[] f;

    public static gff[] values() {
        return (gff[])f.clone();
    }

    public static gff valueOf(String $$0) {
        return Enum.valueOf(gff.class, $$0);
    }

    private gff(String $$0, String $$1) {
        this.d = $$0;
        this.e = yh.c($$1);
    }

    public yh a() {
        return this.e;
    }

    @Override
    public String c() {
        return this.d;
    }

    private static /* synthetic */ gff[] b() {
        return new gff[]{a, b};
    }

    static {
        f = gff.b();
        c = bhh.a(gff::values);
    }
}

