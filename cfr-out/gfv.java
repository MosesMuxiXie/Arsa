/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public final class gfv
extends Enum<gfv> {
    public static final /* enum */ gfv a = new gfv(0, "options.textureFiltering.none");
    public static final /* enum */ gfv b = new gfv(1, "options.textureFiltering.rgss");
    public static final /* enum */ gfv c = new gfv(2, "options.textureFiltering.anisotropic");
    private static final IntFunction<gfv> e;
    public static final Codec<gfv> d;
    private final int f;
    private final yh g;
    private static final /* synthetic */ gfv[] h;

    public static gfv[] values() {
        return (gfv[])h.clone();
    }

    public static gfv valueOf(String $$0) {
        return Enum.valueOf(gfv.class, $$0);
    }

    private gfv(int $$0, String $$1) {
        this.f = $$0;
        this.g = yh.c($$1);
    }

    public yh a() {
        return this.g;
    }

    private static /* synthetic */ gfv[] b() {
        return new gfv[]{a, b, c};
    }

    static {
        h = gfv.b();
        e = beu.a($$0 -> $$0.f, gfv.values(), beu.a.b);
        d = Codec.INT.xmap(e::apply, $$0 -> $$0.f);
    }
}

