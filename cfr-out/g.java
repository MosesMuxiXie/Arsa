/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public final class g
extends Enum<g> {
    public static final /* enum */ g a = new g(0, f.a, f.a, f.a);
    public static final /* enum */ g b = new g(1, f.Y, f.ab, f.ae);
    public static final /* enum */ g c = new g(2, f.X, f.aa, f.ad);
    public static final /* enum */ g d = new g(3, f.W, f.Z, f.ac);
    public static final Codec<g> e;
    public final int f;
    public final f g;
    public final f h;
    public final f i;
    private static final /* synthetic */ g[] j;

    public static g[] values() {
        return (g[])j.clone();
    }

    public static g valueOf(String $$0) {
        return Enum.valueOf(g.class, $$0);
    }

    private g(int $$0, f $$1, f $$2, f $$3) {
        this.f = $$0;
        this.g = $$1;
        this.h = $$2;
        this.i = $$3;
    }

    @Deprecated
    public static g a(int $$0) {
        return switch (bgj.c($$0, 360)) {
            case 0 -> a;
            case 90 -> b;
            case 180 -> c;
            case 270 -> d;
            default -> throw new JsonParseException("Invalid rotation " + $$0 + " found, only 0/90/180/270 allowed");
        };
    }

    public static f a(g $$0, g $$1) {
        return $$1.h.a($$0.g);
    }

    public static f a(g $$0, g $$1, g $$2) {
        return $$2.i.a($$1.h.a($$0.g));
    }

    public int b(int $$0) {
        return ($$0 + this.f) % 4;
    }

    private static /* synthetic */ g[] a() {
        return new g[]{a, b, c, d};
    }

    static {
        j = g.a();
        e = Codec.INT.comapFlatMap($$0 -> switch (bgj.c($$0, 360)) {
            case 0 -> DataResult.success((Object)((Object)a));
            case 90 -> DataResult.success((Object)((Object)b));
            case 180 -> DataResult.success((Object)((Object)c));
            case 270 -> DataResult.success((Object)((Object)d));
            default -> DataResult.error(() -> "Invalid rotation " + $$0 + " found, only 0/90/180/270 allowed");
        }, $$0 -> switch ($$0.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> 0;
            case 1 -> 90;
            case 2 -> 180;
            case 3 -> 270;
        });
    }
}

