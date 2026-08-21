/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public final class gfm
extends Enum<gfm> {
    public static final /* enum */ gfm a = new gfm(0, "options.narrator.off");
    public static final /* enum */ gfm b = new gfm(1, "options.narrator.all");
    public static final /* enum */ gfm c = new gfm(2, "options.narrator.chat");
    public static final /* enum */ gfm d = new gfm(3, "options.narrator.system");
    private static final IntFunction<gfm> f;
    public static final Codec<gfm> e;
    private final int g;
    private final yh h;
    private static final /* synthetic */ gfm[] i;

    public static gfm[] values() {
        return (gfm[])i.clone();
    }

    public static gfm valueOf(String $$0) {
        return Enum.valueOf(gfm.class, $$0);
    }

    private gfm(int $$0, String $$1) {
        this.g = $$0;
        this.h = yh.c($$1);
    }

    public int a() {
        return this.g;
    }

    public yh b() {
        return this.h;
    }

    public static gfm a(int $$0) {
        return f.apply($$0);
    }

    public boolean c() {
        return this == b || this == c;
    }

    public boolean d() {
        return this == b || this == d;
    }

    public boolean e() {
        return this == b || this == d || this == c;
    }

    private static /* synthetic */ gfm[] f() {
        return new gfm[]{a, b, c, d};
    }

    static {
        i = gfm.f();
        f = beu.a(gfm::a, gfm.values(), beu.a.b);
        e = Codec.INT.xmap(gfm::a, gfm::a);
    }
}

