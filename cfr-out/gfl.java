/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class gfl
extends Enum<gfl>
implements bhh {
    public static final /* enum */ gfl a = new gfl("never", "options.musicToast.never");
    public static final /* enum */ gfl b = new gfl("pause", "options.musicToast.pauseMenu");
    public static final /* enum */ gfl c = new gfl("pause_and_toast", "options.musicToast.pauseMenuAndToast");
    public static final Codec<gfl> d;
    private final String e;
    private final yh f;
    private final yh g;
    private static final /* synthetic */ gfl[] h;

    public static gfl[] values() {
        return (gfl[])h.clone();
    }

    public static gfl valueOf(String $$0) {
        return Enum.valueOf(gfl.class, $$0);
    }

    private gfl(String $$0, String $$1) {
        this.e = $$0;
        this.f = yh.c($$1);
        this.g = yh.c($$1 + ".tooltip");
    }

    public yh a() {
        return this.f;
    }

    public yh b() {
        return this.g;
    }

    @Override
    public String c() {
        return this.e;
    }

    public boolean d() {
        return this != a;
    }

    public boolean e() {
        return this == c;
    }

    private static /* synthetic */ gfl[] f() {
        return new gfl[]{a, b, c};
    }

    static {
        h = gfl.f();
        d = bhh.a(gfl::values);
    }
}

