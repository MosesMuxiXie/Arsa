/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class gev
extends Enum<gev>
implements bhh {
    public static final /* enum */ gev a = new gev("false", "options.off");
    public static final /* enum */ gev b = new gev("fast", "options.clouds.fast");
    public static final /* enum */ gev c = new gev("true", "options.clouds.fancy");
    public static final Codec<gev> d;
    private final String e;
    private final yh f;
    private static final /* synthetic */ gev[] g;

    public static gev[] values() {
        return (gev[])g.clone();
    }

    public static gev valueOf(String $$0) {
        return Enum.valueOf(gev.class, $$0);
    }

    private gev(String $$0, String $$1) {
        this.e = $$0;
        this.f = yh.c($$1);
    }

    public yh a() {
        return this.f;
    }

    @Override
    public String c() {
        return this.e;
    }

    private static /* synthetic */ gev[] b() {
        return new gev[]{a, b, c};
    }

    static {
        g = gev.b();
        d = bhh.a(gev::values);
    }
}

